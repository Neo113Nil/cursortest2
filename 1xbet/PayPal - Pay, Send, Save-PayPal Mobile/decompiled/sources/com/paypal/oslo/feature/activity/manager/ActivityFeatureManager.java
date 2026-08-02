package com.paypal.oslo.feature.activity.manager;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isDetailsMockApiCallEnabled", "()Z", "isLedgerMockApiCallEnabled", "isActionsEnabled", "isActivityDetailsRewardsEnabled", "isActivityDetailsGetContactEnabled", "isLedgerActionCardEnabled", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityFeatureManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ActivityFeatureManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
    }

    public final boolean isDetailsMockApiCallEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.INSTANCE.getDetailsApiCallEnabled());
    }

    public final boolean isLedgerMockApiCallEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.INSTANCE.getLedgerMockApiCallEnabled());
    }

    public final boolean isActionsEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.INSTANCE.isActionsEnabled());
    }

    public final boolean isActivityDetailsRewardsEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.INSTANCE.getActivityDetailsRewardsEnabled());
    }

    public final boolean isActivityDetailsGetContactEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.INSTANCE.getActivityDetailsGetContactEnabled());
    }

    public final boolean isLedgerActionCardEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.activity.common.ActivityFeatureGates.INSTANCE.getLedgerActionCardEnabled());
    }
}
