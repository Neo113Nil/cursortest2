package com.onesignal.user.internal.operations.impl.listeners;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.listeners.ModelStoreListener;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import f4.C0430g;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SubscriptionModelStoreListener extends ModelStoreListener<SubscriptionModel> {
    public static final Companion Companion = new Companion(null);
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final C0430g getSubscriptionEnabledAndStatus(SubscriptionModel model) {
            SubscriptionStatus status;
            boolean z;
            i.e(model, "model");
            if (model.isDisabledInternally()) {
                return new C0430g(Boolean.FALSE, SubscriptionStatus.UNSUBSCRIBE);
            }
            if (model.getOptedIn()) {
                SubscriptionStatus status2 = model.getStatus();
                status = SubscriptionStatus.SUBSCRIBED;
                if (status2 == status && model.getAddress().length() > 0) {
                    z = true;
                    return new C0430g(Boolean.valueOf(z), status);
                }
            }
            status = !model.getOptedIn() ? SubscriptionStatus.UNSUBSCRIBE : model.getStatus();
            z = false;
            return new C0430g(Boolean.valueOf(z), status);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionModelStoreListener(SubscriptionModelStore store, IOperationRepo opRepo, IdentityModelStore _identityModelStore, ConfigModelStore _configModelStore) {
        super(store, opRepo);
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // com.onesignal.core.internal.operations.listeners.ModelStoreListener
    public Operation getAddOperation(SubscriptionModel model) {
        i.e(model, "model");
        C0430g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new CreateSubscriptionOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f5668a).booleanValue(), model.getAddress(), (SubscriptionStatus) subscriptionEnabledAndStatus.f5669b);
    }

    @Override // com.onesignal.core.internal.operations.listeners.ModelStoreListener
    public Operation getRemoveOperation(SubscriptionModel model) {
        i.e(model, "model");
        return new DeleteSubscriptionOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId(), model.getId());
    }

    @Override // com.onesignal.core.internal.operations.listeners.ModelStoreListener
    public Operation getUpdateOperation(SubscriptionModel model, String path, String property, Object obj, Object obj2) {
        i.e(model, "model");
        i.e(path, "path");
        i.e(property, "property");
        C0430g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new UpdateSubscriptionOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f5668a).booleanValue(), model.getAddress(), (SubscriptionStatus) subscriptionEnabledAndStatus.f5669b);
    }
}
