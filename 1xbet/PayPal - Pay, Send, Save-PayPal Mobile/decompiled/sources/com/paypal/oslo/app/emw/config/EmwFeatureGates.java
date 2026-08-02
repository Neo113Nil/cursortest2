package com.paypal.oslo.app.emw.config;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/emw/config/EmwFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "emwEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getEmwEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "emwEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmwFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.app.emw.config.EmwFeatureGates INSTANCE;

    /* renamed from: emwEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty emwEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.emw.config.EmwFeatureGates.class, "emwEnabled", "getEmwEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    private EmwFeatureGates() {
        super("core");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getEmwEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) emwEnabled.getValue(this, getHighSpeedVideoSizes[0]);
    }

    static {
        com.paypal.oslo.app.emw.config.EmwFeatureGates emwFeatureGates = new com.paypal.oslo.app.emw.config.EmwFeatureGates();
        INSTANCE = emwFeatureGates;
        emwEnabled = emwFeatureGates.create("emw_eligible");
        $stable = 8;
    }
}
