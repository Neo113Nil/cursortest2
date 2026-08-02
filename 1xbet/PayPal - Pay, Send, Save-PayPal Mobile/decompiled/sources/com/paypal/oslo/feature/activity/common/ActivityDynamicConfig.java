package com.paypal.oslo.feature.activity.common;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/common/ActivityDynamicConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "ledgerSupportedActionResult$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getLedgerSupportedActionResult", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "ledgerSupportedActionResult", "detailSupportedActionResult$delegate", "getDetailSupportedActionResult", "detailSupportedActionResult", "helpCenterSupportedActionResult$delegate", "getHelpCenterSupportedActionResult", "helpCenterSupportedActionResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDynamicConfig extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.activity.common.ActivityDynamicConfig INSTANCE;

    /* renamed from: detailSupportedActionResult$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty detailSupportedActionResult;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityDynamicConfig.class, "ledgerSupportedActionResult", "getLedgerSupportedActionResult()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityDynamicConfig.class, "detailSupportedActionResult", "getDetailSupportedActionResult()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityDynamicConfig.class, "helpCenterSupportedActionResult", "getHelpCenterSupportedActionResult()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: helpCenterSupportedActionResult$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty helpCenterSupportedActionResult;

    /* renamed from: ledgerSupportedActionResult$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty ledgerSupportedActionResult;

    private ActivityDynamicConfig() {
        super("activity", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.APP_CONFIG);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Object[]> getLedgerSupportedActionResult() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) ledgerSupportedActionResult.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Object[]> getDetailSupportedActionResult() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) detailSupportedActionResult.getValue(this, getHighSpeedVideoFpsRanges[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Object[]> getHelpCenterSupportedActionResult() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) helpCenterSupportedActionResult.getValue(this, getHighSpeedVideoFpsRanges[2]);
    }

    static {
        com.paypal.oslo.feature.activity.common.ActivityDynamicConfig activityDynamicConfig = new com.paypal.oslo.feature.activity.common.ActivityDynamicConfig();
        INSTANCE = activityDynamicConfig;
        ledgerSupportedActionResult = activityDynamicConfig.create(new java.lang.Object[0], com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.LEDGER_SUPPORTED_ACTIONS_KEY);
        detailSupportedActionResult = activityDynamicConfig.create(new java.lang.Object[0], com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.DETAIL_SUPPORTED_ACTIONS_KEY);
        helpCenterSupportedActionResult = activityDynamicConfig.create(new java.lang.Object[0], com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.HELP_CENTER_SUPPORTED_ACTIONS_KEY);
        $stable = 8;
    }
}
