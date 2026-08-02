package com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addnfc/ui/TapToPayProgressMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;", "onboardingProgress", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/ProgressConfig;", "toTapToPayProgress", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/ProgressConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapToPayProgressMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.TapToPayProgressMapper INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.addnfc.ui.TapToPayProgressMapper();

    private TapToPayProgressMapper() {
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressConfig toTapToPayProgress(com.paypal.oslo.feature.oneonboarding.api.domain.Progress onboardingProgress) {
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType.SegmentedProgress segmentedProgress;
        if (onboardingProgress == null) {
            return null;
        }
        int currentProgress = onboardingProgress.getCurrentProgress();
        com.paypal.oslo.feature.oneonboarding.api.domain.Range range = onboardingProgress.getRange();
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange progressRange = range != null ? new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange(range.getStart(), range.getEnd()) : null;
        com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType progressType = onboardingProgress.getProgressType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(progressType, com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress.INSTANCE)) {
            segmentedProgress = com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType.ContinuousProgress.INSTANCE;
        } else {
            if (!(progressType instanceof com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress segmentedProgress2 = (com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress) progressType;
            segmentedProgress = new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType.SegmentedProgress(segmentedProgress2.getCurrentSegment(), segmentedProgress2.getTotalSegments());
        }
        return new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressConfig(currentProgress, progressRange, segmentedProgress);
    }
}
