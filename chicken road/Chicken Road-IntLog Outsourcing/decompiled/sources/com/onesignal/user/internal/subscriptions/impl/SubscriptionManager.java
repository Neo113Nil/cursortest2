package com.onesignal.user.internal.subscriptions.impl;

import C1.b;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.PIIHasher;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.IModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.EmailSubscription;
import com.onesignal.user.internal.PushSubscription;
import com.onesignal.user.internal.SmsSubscription;
import com.onesignal.user.internal.Subscription;
import com.onesignal.user.internal.UninitializedPushSubscription;
import com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.internal.subscriptions.SubscriptionList;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import com.onesignal.user.subscriptions.IEmailSubscription;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.ISmsSubscription;
import com.onesignal.user.subscriptions.ISubscription;
import g4.AbstractC0465j;
import g4.C0471p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SubscriptionManager implements ISubscriptionManager, IModelStoreChangeHandler<SubscriptionModel>, ISessionLifecycleHandler {
    private final IApplicationService _applicationService;
    private final ISessionService _sessionService;
    private final SubscriptionModelStore _subscriptionModelStore;
    private final EventProducer<ISubscriptionChangedHandler> events;
    private SubscriptionList subscriptions;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionType.PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SubscriptionManager(IApplicationService _applicationService, ISessionService _sessionService, SubscriptionModelStore _subscriptionModelStore) {
        i.e(_applicationService, "_applicationService");
        i.e(_sessionService, "_sessionService");
        i.e(_subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.events = new EventProducer<>();
        this.subscriptions = new SubscriptionList(C0471p.f5750a, new UninitializedPushSubscription());
        Iterator it = _subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((SubscriptionModel) it.next());
        }
        this._subscriptionModelStore.subscribe((IModelStoreChangeHandler) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(SubscriptionType subscriptionType, String str, SubscriptionStatus subscriptionStatus) {
        String hash = subscriptionType != SubscriptionType.PUSH ? PIIHasher.INSTANCE.hash(str) : str;
        Logging.log(LogLevel.DEBUG, "SubscriptionManager.addSubscription(type: " + subscriptionType + ", address: " + hash + ')');
        SubscriptionModel subscriptionModel = new SubscriptionModel();
        subscriptionModel.setId(IDManager.INSTANCE.createLocalId());
        subscriptionModel.setOptedIn(true);
        subscriptionModel.setType(subscriptionType);
        subscriptionModel.setAddress(str);
        if (subscriptionStatus == null) {
            subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
        }
        subscriptionModel.setStatus(subscriptionStatus);
        IModelStore.DefaultImpls.add$default(this._subscriptionModelStore, subscriptionModel, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(SubscriptionManager subscriptionManager, SubscriptionType subscriptionType, String str, SubscriptionStatus subscriptionStatus, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            subscriptionStatus = null;
        }
        subscriptionManager.addSubscriptionToModels(subscriptionType, str, subscriptionStatus);
    }

    private final void createSubscriptionAndAddToSubscriptionList(SubscriptionModel subscriptionModel) {
        ISubscription createSubscriptionFromModel = createSubscriptionFromModel(subscriptionModel);
        ArrayList U02 = AbstractC0465j.U0(getSubscriptions().getCollection());
        if (subscriptionModel.getType() == SubscriptionType.PUSH) {
            IPushSubscription push = getSubscriptions().getPush();
            i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            PushSubscription pushSubscription = (PushSubscription) push;
            i.c(createSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((PushSubscription) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(pushSubscription.getChangeHandlersNotifier());
            U02.remove(pushSubscription);
        }
        U02.add(createSubscriptionFromModel);
        setSubscriptions(new SubscriptionList(U02, new UninitializedPushSubscription()));
        this.events.fire(new SubscriptionManager$createSubscriptionAndAddToSubscriptionList$1(createSubscriptionFromModel));
    }

    private final ISubscription createSubscriptionFromModel(SubscriptionModel subscriptionModel) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[subscriptionModel.getType().ordinal()];
        if (i2 == 1) {
            return new SmsSubscription(subscriptionModel);
        }
        if (i2 == 2) {
            return new EmailSubscription(subscriptionModel);
        }
        if (i2 == 3) {
            return new PushSubscription(subscriptionModel);
        }
        throw new b();
    }

    private final void refreshPushSubscriptionState() {
        ISubscription push = getSubscriptions().getPush();
        if (push instanceof UninitializedPushSubscription) {
            return;
        }
        i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        SubscriptionModel model = ((Subscription) push).getModel();
        model.setSdk(OneSignalUtils.INSTANCE.getSdkVersion());
        String RELEASE = Build.VERSION.RELEASE;
        i.d(RELEASE, "RELEASE");
        model.setDeviceOS(RELEASE);
        String carrierName = DeviceUtils.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(ISubscription iSubscription) {
        Logging.log(LogLevel.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + iSubscription + ')');
        IModelStore.DefaultImpls.remove$default(this._subscriptionModelStore, iSubscription.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(ISubscription iSubscription) {
        ArrayList U02 = AbstractC0465j.U0(getSubscriptions().getCollection());
        U02.remove(iSubscription);
        setSubscriptions(new SubscriptionList(U02, new UninitializedPushSubscription()));
        this.events.fire(new SubscriptionManager$removeSubscriptionFromSubscriptionList$1(iSubscription));
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void addEmailSubscription(String email) {
        i.e(email, "email");
        addSubscriptionToModels$default(this, SubscriptionType.EMAIL, email, null, 4, null);
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void addOrUpdatePushSubscriptionToken(String str, SubscriptionStatus pushTokenStatus) {
        i.e(pushTokenStatus, "pushTokenStatus");
        ISubscription push = getSubscriptions().getPush();
        if (push instanceof UninitializedPushSubscription) {
            SubscriptionType subscriptionType = SubscriptionType.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(subscriptionType, str, pushTokenStatus);
            return;
        }
        i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        SubscriptionModel model = ((Subscription) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(pushTokenStatus);
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void addSmsSubscription(String sms) {
        i.e(sms, "sms");
        addSubscriptionToModels$default(this, SubscriptionType.SMS, sms, null, 4, null);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public SubscriptionModel getPushSubscriptionModel() {
        IPushSubscription push = getSubscriptions().getPush();
        i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((PushSubscription) push).getModel();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public SubscriptionList getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        Object obj;
        i.e(args, "args");
        i.e(tag, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ISubscription iSubscription = (ISubscription) obj;
            Model model = args.getModel();
            i.c(iSubscription, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            if (i.a(model, ((Subscription) iSubscription).getModel())) {
                break;
            }
        }
        ISubscription iSubscription2 = (ISubscription) obj;
        if (iSubscription2 == null) {
            Model model2 = args.getModel();
            i.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((SubscriptionModel) model2);
        } else {
            if (iSubscription2 instanceof PushSubscription) {
                ((PushSubscription) iSubscription2).getChangeHandlersNotifier().fireOnMain(new SubscriptionManager$onModelUpdated$1(iSubscription2));
            }
            this.events.fire(new SubscriptionManager$onModelUpdated$2(iSubscription2, args));
        }
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j2) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void removeEmailSubscription(String email) {
        Object obj;
        i.e(email, "email");
        String hash = PIIHasher.INSTANCE.hash(email);
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            IEmailSubscription iEmailSubscription = (IEmailSubscription) obj;
            if (iEmailSubscription instanceof EmailSubscription) {
                EmailSubscription emailSubscription = (EmailSubscription) iEmailSubscription;
                if (i.a(emailSubscription.getModel().getAddress(), email) || i.a(emailSubscription.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        IEmailSubscription iEmailSubscription2 = (IEmailSubscription) obj;
        if (iEmailSubscription2 != null) {
            removeSubscriptionFromModels(iEmailSubscription2);
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void removeSmsSubscription(String sms) {
        Object obj;
        i.e(sms, "sms");
        String hash = PIIHasher.INSTANCE.hash(sms);
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ISmsSubscription iSmsSubscription = (ISmsSubscription) obj;
            if (iSmsSubscription instanceof SmsSubscription) {
                SmsSubscription smsSubscription = (SmsSubscription) iSmsSubscription;
                if (i.a(smsSubscription.getModel().getAddress(), sms) || i.a(smsSubscription.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        ISmsSubscription iSmsSubscription2 = (ISmsSubscription) obj;
        if (iSmsSubscription2 != null) {
            removeSubscriptionFromModels(iSmsSubscription2);
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionManager
    public void setSubscriptions(SubscriptionList subscriptionList) {
        i.e(subscriptionList, "<set-?>");
        this.subscriptions = subscriptionList;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelAdded(SubscriptionModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        createSubscriptionAndAddToSubscriptionList(model);
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelRemoved(SubscriptionModel model, String tag) {
        Object obj;
        i.e(model, "model");
        i.e(tag, "tag");
        if (model.getType() == SubscriptionType.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (i.a(((ISubscription) obj).getId(), model.getId())) {
                    break;
                }
            }
        }
        ISubscription iSubscription = (ISubscription) obj;
        if (iSubscription != null) {
            removeSubscriptionFromSubscriptionList(iSubscription);
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ISubscriptionChangedHandler handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ISubscriptionChangedHandler handler) {
        i.e(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
