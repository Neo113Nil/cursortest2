package com.paypal.oslo.feature.cashin.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/common/CashInFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mainFeature$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getMainFeature", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mainFeature"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.cashin.common.CashInFeatureGates INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cashin.common.CashInFeatureGates.class, "mainFeature", "getMainFeature()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: mainFeature$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty mainFeature;

    private CashInFeatureGates() {
        super(com.paypal.oslo.feature.cashin.common.CashInConstants.RemoteConfig.DOMAIN);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getMainFeature() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) mainFeature.getValue(this, getHighSpeedVideoSizes[0]);
    }

    static {
        com.paypal.oslo.feature.cashin.common.CashInFeatureGates cashInFeatureGates = new com.paypal.oslo.feature.cashin.common.CashInFeatureGates();
        INSTANCE = cashInFeatureGates;
        mainFeature = cashInFeatureGates.create("mainfeature");
        $stable = 8;
    }
}
