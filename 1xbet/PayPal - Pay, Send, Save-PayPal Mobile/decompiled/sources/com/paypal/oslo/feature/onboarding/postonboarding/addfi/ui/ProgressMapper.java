package com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/ui/ProgressMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;", "onboardingProgress", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "toWalletProgress", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Progress;)Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProgressMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui.ProgressMapper INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.addfi.ui.ProgressMapper();

    private ProgressMapper() {
    }

    public final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress toWalletProgress(com.paypal.oslo.feature.oneonboarding.api.domain.Progress onboardingProgress) {
        com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range range;
        if (onboardingProgress == null) {
            return new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous(0, new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range(0, 100));
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType progressType = onboardingProgress.getProgressType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(progressType, com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.ContinuousProgress.INSTANCE)) {
            int currentProgress = onboardingProgress.getCurrentProgress();
            com.paypal.oslo.feature.oneonboarding.api.domain.Range range2 = onboardingProgress.getRange();
            if (range2 != null) {
                range = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range(range2.getStart(), range2.getEnd());
            } else {
                range = new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Range(0, 100);
            }
            return new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous(currentProgress, range);
        }
        if (!(progressType instanceof com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress segmentedProgress = (com.paypal.oslo.feature.oneonboarding.api.domain.ProgressType.SegmentedProgress) progressType;
        return new com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented(segmentedProgress.getCurrentSegment(), segmentedProgress.getTotalSegments(), onboardingProgress.getCurrentProgress());
    }
}
