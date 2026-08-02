package com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/data/remoteconfig/dynamicconfig/DebitCardEligibilityConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "getHighSpeedVideoFpsRanges", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRangesFor", "", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DebitCardEligibilityConfig extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig INSTANCE;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.class, "entryPoints", "getEntryPoints()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig.class, "eligibilityType", "getEligibilityType()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    private DebitCardEligibilityConfig() {
        super("debit_card", "eligibility_config");
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig debitCardEligibilityConfig = new com.paypal.oslo.feature.debitcard.shared.data.remoteconfig.dynamicconfig.DebitCardEligibilityConfig();
        INSTANCE = debitCardEligibilityConfig;
        getHighSpeedVideoFpsRangesFor = debitCardEligibilityConfig.create(new java.lang.Object[0], "entry_points");
        getHighSpeedVideoSizes = debitCardEligibilityConfig.create("NONE", "eligibility_type");
    }
}
