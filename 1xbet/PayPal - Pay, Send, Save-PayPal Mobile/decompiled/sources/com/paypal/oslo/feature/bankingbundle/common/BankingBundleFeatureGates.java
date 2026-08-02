package com.paypal.oslo.feature.bankingbundle.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/common/BankingBundleFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getFeatureEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.bankingbundle.common.BankingBundleFeatureGates.class, "featureEnabled", "getFeatureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final com.paypal.oslo.feature.bankingbundle.common.BankingBundleFeatureGates INSTANCE;

    /* renamed from: featureEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty featureEnabled;

    private BankingBundleFeatureGates() {
        super("money_management");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFeatureEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) featureEnabled.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    static {
        com.paypal.oslo.feature.bankingbundle.common.BankingBundleFeatureGates bankingBundleFeatureGates = new com.paypal.oslo.feature.bankingbundle.common.BankingBundleFeatureGates();
        INSTANCE = bankingBundleFeatureGates;
        featureEnabled = bankingBundleFeatureGates.create("banking_bundle");
        $stable = 8;
    }
}
