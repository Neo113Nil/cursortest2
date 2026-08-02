package com.paypal.oslo.feature.taptopay.ui.setup.bridge;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/TopBarConfig;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardToolBarConfig;", "toDebitCardToolBarConfig", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/TopBarConfig;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardToolBarConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TopBarConfigMapperKt {
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig toDebitCardToolBarConfig(com.paypal.oslo.feature.taptopay.api.domain.model.topbar.TopBarConfig topBarConfig) {
        com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig debitCardProgressBarConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        boolean z = topBarConfig.getStartNavAction() == com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.BACK;
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction endNavAction = topBarConfig.getEndNavAction();
        int i = endNavAction == null ? -1 : com.paypal.oslo.feature.taptopay.ui.setup.bridge.TopBarConfigMapperKt.WhenMappings.$EnumSwitchMapping$0[endNavAction.ordinal()];
        if (i == 1) {
            trailingButtonType = com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.SKIP;
        } else if (i == 2) {
            trailingButtonType = com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.CLOSE;
        } else {
            trailingButtonType = com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.NONE;
        }
        com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType2 = trailingButtonType;
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressConfig progressBarConfig = topBarConfig.getProgressBarConfig();
        if (progressBarConfig != null) {
            float end = progressBarConfig.getRange() != null ? r0.getEnd() : 100.0f;
            com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType progressType = progressBarConfig.getProgressType();
            if (progressType instanceof com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType.SegmentedProgress) {
                com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType.SegmentedProgress segmentedProgress = (com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType.SegmentedProgress) progressType;
                debitCardProgressBarConfig = new com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig(progressBarConfig.getCurrentProgress(), end, segmentedProgress.getCurrentSegment(), segmentedProgress.getTotalSegments());
            } else {
                if (!(progressType instanceof com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressBarType.ContinuousProgress)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                debitCardProgressBarConfig = new com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig(progressBarConfig.getCurrentProgress(), end, 0, 0, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
        } else {
            debitCardProgressBarConfig = null;
        }
        return new com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig(z, (java.lang.String) null, trailingButtonType2, debitCardProgressBarConfig, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.SKIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.api.domain.model.topbar.NavAction.CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
