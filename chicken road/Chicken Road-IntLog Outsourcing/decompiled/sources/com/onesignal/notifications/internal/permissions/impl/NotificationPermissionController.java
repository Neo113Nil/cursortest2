package com.onesignal.notifications.internal.permissions.impl;

import B0.f;
import D4.AbstractC0020u;
import D4.AbstractC0024y;
import D4.O;
import D4.p0;
import D4.y0;
import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.Waiter;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.notifications.R;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler;
import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import e5.g;
import f4.v;
import g4.C0463h;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationPermissionController implements IRequestPermissionService.PermissionCallback, INotificationPermissionController {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final Companion Companion = new Companion(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final IApplicationService _application;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IPreferencesService _preferenceService;
    private final IRequestPermissionService _requestPermission;
    private boolean enabled;
    private final EventProducer<INotificationPermissionChangedHandler> events;
    private long pollingWaitInterval;
    private final Waiter pollingWaiter;
    private final boolean supportsNativePrompt;
    private final WaiterWithValue<Boolean> waiter;

    @e(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$1", f = "NotificationPermissionController.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1441l {
        int label;

        public AnonymousClass1(InterfaceC1218d interfaceC1218d) {
            super(1, interfaceC1218d);
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
            return NotificationPermissionController.this.new AnonymousClass1(interfaceC1218d);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            int i2 = this.label;
            if (i2 == 0) {
                g.y(obj);
                NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                this.label = 1;
                if (notificationPermissionController.pollForPermission(this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
            return v.f5689a;
        }

        @Override // t4.InterfaceC1441l
        public final Object invoke(InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationPermissionController(IApplicationService _application, IRequestPermissionService _requestPermission, IApplicationService _applicationService, IPreferencesService _preferenceService, ConfigModelStore _configModelStore) {
        i.e(_application, "_application");
        i.e(_requestPermission, "_requestPermission");
        i.e(_applicationService, "_applicationService");
        i.e(_preferenceService, "_preferenceService");
        i.e(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new WaiterWithValue<>();
        this.pollingWaiter = new Waiter();
        this.events = new EventProducer<>();
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = _configModelStore.getModel().getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        ThreadUtilsKt.launchOnIO(new AnonymousClass1(null));
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z) {
        this.enabled = z;
        this.waiter.wake(Boolean.valueOf(z));
        this.events.fire(new NotificationPermissionController$permissionPromptCompleted$1(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(InterfaceC1218d interfaceC1218d) {
        NotificationPermissionController$pollForPermission$1 notificationPermissionController$pollForPermission$1;
        EnumC1260a enumC1260a;
        int i2;
        NotificationPermissionController notificationPermissionController;
        boolean notificationsEnabled;
        long j2;
        NotificationPermissionController$pollForPermission$3 notificationPermissionController$pollForPermission$3;
        if (interfaceC1218d instanceof NotificationPermissionController$pollForPermission$1) {
            notificationPermissionController$pollForPermission$1 = (NotificationPermissionController$pollForPermission$1) interfaceC1218d;
            int i3 = notificationPermissionController$pollForPermission$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationPermissionController$pollForPermission$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationPermissionController$pollForPermission$1.result;
                enumC1260a = EnumC1260a.f11058a;
                i2 = notificationPermissionController$pollForPermission$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    notificationPermissionController = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    notificationPermissionController = (NotificationPermissionController) notificationPermissionController$pollForPermission$1.L$0;
                    g.y(obj);
                }
                do {
                    notificationsEnabled = notificationPermissionController.notificationsEnabled();
                    if (notificationPermissionController.enabled != notificationsEnabled) {
                        notificationPermissionController.enabled = notificationsEnabled;
                        notificationPermissionController.events.fire(new NotificationPermissionController$pollForPermission$2(notificationsEnabled));
                    }
                    j2 = notificationPermissionController.pollingWaitInterval;
                    notificationPermissionController$pollForPermission$3 = new NotificationPermissionController$pollForPermission$3(notificationPermissionController, null);
                    notificationPermissionController$pollForPermission$1.L$0 = notificationPermissionController;
                    notificationPermissionController$pollForPermission$1.label = 1;
                } while (AbstractC0024y.y(j2, notificationPermissionController$pollForPermission$3, notificationPermissionController$pollForPermission$1) != enumC1260a);
                return enumC1260a;
            }
        }
        notificationPermissionController$pollForPermission$1 = new NotificationPermissionController$pollForPermission$1(this, interfaceC1218d);
        Object obj2 = notificationPermissionController$pollForPermission$1.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = notificationPermissionController$pollForPermission$1.label;
        if (i2 != 0) {
        }
        do {
            notificationsEnabled = notificationPermissionController.notificationsEnabled();
            if (notificationPermissionController.enabled != notificationsEnabled) {
            }
            j2 = notificationPermissionController.pollingWaitInterval;
            notificationPermissionController$pollForPermission$3 = new NotificationPermissionController$pollForPermission$3(notificationPermissionController, null);
            notificationPermissionController$pollForPermission$1.L$0 = notificationPermissionController;
            notificationPermissionController$pollForPermission$1.label = 1;
        } while (AbstractC0024y.y(j2, notificationPermissionController$pollForPermission$3, notificationPermissionController$pollForPermission$1) != enumC1260a);
        return enumC1260a;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$registerPollingLifecycleListener$1
            @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
            public void onFocus(boolean z) {
                super.onFocus(z);
                ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new NotificationPermissionController$registerPollingLifecycleListener$1$onFocus$1(NotificationPermissionController.this));
            }

            @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
            public void onUnfocused() {
                super.onUnfocused();
                ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new NotificationPermissionController$registerPollingLifecycleListener$1$onUnfocused$1(NotificationPermissionController.this));
            }
        });
    }

    private final boolean showFallbackAlertDialog() {
        final Activity current = this._application.getCurrent();
        if (current == null) {
            return false;
        }
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string = current.getString(R.string.notification_permission_name_for_title);
        i.d(string, "getString(...)");
        String string2 = current.getString(R.string.notification_permission_settings_message);
        i.d(string2, "getString(...)");
        alertDialogPrepromptForAndroidSettings.show(current, string, string2, new AlertDialogPrepromptForAndroidSettings.Callback() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$showFallbackAlertDialog$1
            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onAccept() {
                IApplicationService iApplicationService;
                iApplicationService = NotificationPermissionController.this._applicationService;
                final NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                iApplicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$showFallbackAlertDialog$1$onAccept$1
                    @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
                    public void onFocus(boolean z) {
                        IApplicationService iApplicationService2;
                        IApplicationService iApplicationService3;
                        if (z) {
                            return;
                        }
                        super.onFocus(false);
                        iApplicationService2 = NotificationPermissionController.this._applicationService;
                        iApplicationService2.removeApplicationLifecycleHandler(this);
                        AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                        iApplicationService3 = NotificationPermissionController.this._applicationService;
                        NotificationPermissionController.this.permissionPromptCompleted(androidUtils.hasPermission("android.permission.POST_NOTIFICATIONS", true, iApplicationService3));
                    }
                });
                NavigateToAndroidSettingsForNotifications.INSTANCE.show(current);
            }

            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onDecline() {
                NotificationPermissionController.this.permissionPromptCompleted(false);
            }
        });
        return true;
    }

    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionController
    public boolean getCanRequestPermission() {
        i.b(this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        return !r0.booleanValue();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onReject(boolean z) {
        if (z ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z, InterfaceC1218d interfaceC1218d) {
        NotificationPermissionController$prompt$1 notificationPermissionController$prompt$1;
        int i2;
        Object obj;
        NotificationPermissionController notificationPermissionController;
        if (interfaceC1218d instanceof NotificationPermissionController$prompt$1) {
            notificationPermissionController$prompt$1 = (NotificationPermissionController$prompt$1) interfaceC1218d;
            int i3 = notificationPermissionController$prompt$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationPermissionController$prompt$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = notificationPermissionController$prompt$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationPermissionController$prompt$1.label;
                if (i2 != 0) {
                    g.y(obj2);
                    notificationPermissionController$prompt$1.L$0 = this;
                    notificationPermissionController$prompt$1.Z$0 = z;
                    notificationPermissionController$prompt$1.label = 1;
                    InterfaceC1223i context = notificationPermissionController$prompt$1.getContext();
                    AbstractC0024y.e(context);
                    InterfaceC1218d F2 = f.F(notificationPermissionController$prompt$1);
                    I4.h hVar = F2 instanceof I4.h ? (I4.h) F2 : null;
                    Object obj3 = v.f5689a;
                    if (hVar != null) {
                        AbstractC0020u abstractC0020u = hVar.f1294d;
                        if (abstractC0020u.E()) {
                            hVar.f1296f = obj3;
                            hVar.f458c = 1;
                            abstractC0020u.D(context, hVar);
                        } else {
                            y0 y0Var = new y0(y0.f558c);
                            InterfaceC1223i A5 = context.A(y0Var);
                            hVar.f1296f = obj3;
                            hVar.f458c = 1;
                            abstractC0020u.D(A5, hVar);
                            if (y0Var.f559b) {
                                O a6 = p0.a();
                                C0463h c0463h = a6.f478e;
                                if (!(c0463h != null ? c0463h.isEmpty() : true)) {
                                    if (a6.J()) {
                                        hVar.f1296f = obj3;
                                        hVar.f458c = 1;
                                        a6.G(hVar);
                                    } else {
                                        a6.I(true);
                                        try {
                                            hVar.run();
                                            do {
                                            } while (a6.L());
                                        } finally {
                                            try {
                                            } finally {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = enumC1260a;
                        if (obj == EnumC1260a.f11058a) {
                            obj3 = obj;
                        }
                        if (obj3 != enumC1260a) {
                            return enumC1260a;
                        }
                        notificationPermissionController = this;
                    }
                    obj = obj3;
                    if (obj == EnumC1260a.f11058a) {
                    }
                    if (obj3 != enumC1260a) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            g.y(obj2);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = notificationPermissionController$prompt$1.Z$0;
                    notificationPermissionController = (NotificationPermissionController) notificationPermissionController$prompt$1.L$0;
                    g.y(obj2);
                }
                if (!notificationPermissionController.notificationsEnabled()) {
                    return Boolean.TRUE;
                }
                if (notificationPermissionController.supportsNativePrompt) {
                    notificationPermissionController._requestPermission.startPrompt(z, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, NotificationPermissionController.class);
                } else {
                    if (!z) {
                        return Boolean.FALSE;
                    }
                    notificationPermissionController.showFallbackAlertDialog();
                }
                WaiterWithValue<Boolean> waiterWithValue = notificationPermissionController.waiter;
                notificationPermissionController$prompt$1.L$0 = null;
                notificationPermissionController$prompt$1.label = 2;
                obj2 = waiterWithValue.waitForWake(notificationPermissionController$prompt$1);
                return obj2 == enumC1260a ? enumC1260a : obj2;
            }
        }
        notificationPermissionController$prompt$1 = new NotificationPermissionController$prompt$1(this, interfaceC1218d);
        Object obj22 = notificationPermissionController$prompt$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationPermissionController$prompt$1.label;
        if (i2 != 0) {
        }
        if (!notificationPermissionController.notificationsEnabled()) {
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(INotificationPermissionChangedHandler handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(INotificationPermissionChangedHandler handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }
}
