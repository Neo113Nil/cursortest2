package com.onesignal.user.internal.subscriptions;

import com.onesignal.common.PIIHasher;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public class SubscriptionModelStore extends SimpleModelStore<SubscriptionModel> {

    /* renamed from: com.onesignal.user.internal.subscriptions.SubscriptionModelStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1430a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // t4.InterfaceC1430a
        public final SubscriptionModel invoke() {
            return new SubscriptionModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionModelStore(IPreferencesService prefs) {
        super(AnonymousClass1.INSTANCE, "subscriptions", prefs);
        i.e(prefs, "prefs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.ModelStore, com.onesignal.common.modeling.IModelStore
    public void replaceAll(List<SubscriptionModel> models, String tag) {
        i.e(models, "models");
        i.e(tag, "tag");
        if (!tag.equals(ModelChangeTags.HYDRATE)) {
            super.replaceAll(models, tag);
            return;
        }
        synchronized (models) {
            try {
                Iterator<SubscriptionModel> it = models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SubscriptionModel next = it.next();
                    if (next.getType() == SubscriptionType.PUSH) {
                        SubscriptionModel subscriptionModel = (SubscriptionModel) get(next.getId());
                        if (subscriptionModel != null) {
                            next.setSdk(subscriptionModel.getSdk());
                            next.setDeviceOS(subscriptionModel.getDeviceOS());
                            next.setCarrier(subscriptionModel.getCarrier());
                            next.setAppVersion(subscriptionModel.getAppVersion());
                            next.setStatus(subscriptionModel.getStatus());
                        }
                    }
                }
                super.replaceAll(models, tag);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.ModelStore
    public JSONObject transformJsonForPersistence(SubscriptionModel model, JSONObject json) {
        i.e(model, "model");
        i.e(json, "json");
        String optString = json.optString(WebViewManager.EVENT_TYPE_KEY, "");
        i.b(optString);
        if (optString.length() == 0 || optString.equals(SubscriptionType.PUSH.toString())) {
            return json;
        }
        String optString2 = json.optString("address", "");
        i.b(optString2);
        if (optString2.length() > 0) {
            PIIHasher pIIHasher = PIIHasher.INSTANCE;
            if (!pIIHasher.isHashed(optString2)) {
                json.put("address", pIIHasher.hash(optString2));
            }
        }
        return json;
    }
}
