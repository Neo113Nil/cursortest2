package com.onesignal.user.internal.migrations;

import a.AbstractC0169a;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import f4.InterfaceC0428e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RecoverConfigPushSubscription extends MigrationRecovery {
    private final ConfigModelStore _configModelStore;
    private final SubscriptionModelStore _subscriptionModelStore;
    private final InterfaceC0428e activePushSubscription$delegate;

    public RecoverConfigPushSubscription(ConfigModelStore _configModelStore, SubscriptionModelStore _subscriptionModelStore) {
        i.e(_configModelStore, "_configModelStore");
        i.e(_subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = _configModelStore;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.activePushSubscription$delegate = AbstractC0169a.A(new RecoverConfigPushSubscription$activePushSubscription$2(this));
    }

    public final SubscriptionModel getActivePushSubscription() {
        return (SubscriptionModel) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public boolean isInBadState() {
        return this._configModelStore.getModel().getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public void recover() {
        ConfigModel model = this._configModelStore.getModel();
        SubscriptionModel activePushSubscription = getActivePushSubscription();
        model.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
