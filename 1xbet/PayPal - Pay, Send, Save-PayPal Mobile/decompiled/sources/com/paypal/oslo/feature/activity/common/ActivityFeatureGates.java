package com.paypal.oslo.feature.activity.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001b\u0010\u0014\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001b\u0010\u0017\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/common/ActivityFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "detailsApiCallEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDetailsApiCallEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "detailsApiCallEnabled", "ledgerMockApiCallEnabled$delegate", "getLedgerMockApiCallEnabled", "ledgerMockApiCallEnabled", "isActionsEnabled$delegate", "isActionsEnabled", "activityDetailsRewardsEnabled$delegate", "getActivityDetailsRewardsEnabled", "activityDetailsRewardsEnabled", "activityDetailsGetContactEnabled$delegate", "getActivityDetailsGetContactEnabled", "activityDetailsGetContactEnabled", "ledgerActionCardEnabled$delegate", "getLedgerActionCardEnabled", "ledgerActionCardEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.activity.common.ActivityFeatureGates INSTANCE;

    /* renamed from: activityDetailsGetContactEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty activityDetailsGetContactEnabled;

    /* renamed from: activityDetailsRewardsEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty activityDetailsRewardsEnabled;

    /* renamed from: detailsApiCallEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty detailsApiCallEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.class, "detailsApiCallEnabled", "getDetailsApiCallEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.class, "ledgerMockApiCallEnabled", "getLedgerMockApiCallEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.class, "isActionsEnabled", "isActionsEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.class, "activityDetailsRewardsEnabled", "getActivityDetailsRewardsEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.class, "activityDetailsGetContactEnabled", "getActivityDetailsGetContactEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.class, "ledgerActionCardEnabled", "getLedgerActionCardEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: isActionsEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty isActionsEnabled;

    /* renamed from: ledgerActionCardEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty ledgerActionCardEnabled;

    /* renamed from: ledgerMockApiCallEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty ledgerMockApiCallEnabled;

    private ActivityFeatureGates() {
        super("activity");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getDetailsApiCallEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) detailsApiCallEnabled.getValue(this, getHighSpeedVideoSizes[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getLedgerMockApiCallEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) ledgerMockApiCallEnabled.getValue(this, getHighSpeedVideoSizes[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey isActionsEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) isActionsEnabled.getValue(this, getHighSpeedVideoSizes[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getActivityDetailsRewardsEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) activityDetailsRewardsEnabled.getValue(this, getHighSpeedVideoSizes[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getActivityDetailsGetContactEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) activityDetailsGetContactEnabled.getValue(this, getHighSpeedVideoSizes[4]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getLedgerActionCardEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) ledgerActionCardEnabled.getValue(this, getHighSpeedVideoSizes[5]);
    }

    static {
        com.paypal.oslo.feature.activity.common.ActivityFeatureGates activityFeatureGates = new com.paypal.oslo.feature.activity.common.ActivityFeatureGates();
        INSTANCE = activityFeatureGates;
        detailsApiCallEnabled = activityFeatureGates.create(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.DETAILS_API_CALL_ENABLED_KEY);
        ledgerMockApiCallEnabled = activityFeatureGates.create(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.LEDGER_MOCK_API_CALL_ENABLED_KEY);
        isActionsEnabled = activityFeatureGates.create(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.LEDGER_ACTIONS_ENABLED_KEY);
        activityDetailsRewardsEnabled = activityFeatureGates.create(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.ACTIVITY_DETAILS_REWARDS_ENABLED_KEY);
        activityDetailsGetContactEnabled = activityFeatureGates.create(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.ACTIVITY_DETAILS_GET_CONTACT_ENABLED_KEY);
        ledgerActionCardEnabled = activityFeatureGates.create(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.RemoteConfig.ACTIVITY_LEDGER_ACTION_CARD_ENABLED_KEY);
        $stable = 8;
    }
}
