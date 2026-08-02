package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiMapper;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanContentProvider;", "contentProvider", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;", "exitConfirmationContentProvider", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "applicationFailureUiMapper", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "declineType", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "toDeclineContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "errorType", "toErrorContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "reviewPlanData", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanContentProvider;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ExitConfirmationContentProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanUiMapper {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ReviewPlanUiMapper(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanContentProvider reviewPlanContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exitConfirmationContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationFailureUiMapper, "");
        this.getHighSpeedVideoFpsRangesFor = reviewPlanContentProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = exitConfirmationContentProvider;
        this.getHighSpeedVideoSizes = applicationFailureUiMapper;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel toDeclineContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType declineType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineType, "");
        return this.getHighSpeedVideoSizes.toDeclineContent(declineType);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        return this.getHighSpeedVideoSizes.toErrorContent(errorType);
    }

    public final java.lang.Object toUiModel(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.PlanOptionReviewContent(this.getHighSpeedVideoFpsRangesFor.getTitle(), this.getHighSpeedVideoFpsRangesFor.getSubtitle(), this.getHighSpeedVideoFpsRangesFor.fixedInterestRate("12,99%"), this.getHighSpeedVideoFpsRangesFor.apr("12,99%"), "59,94 €", this.getHighSpeedVideoFpsRangesFor.getInterestAmountText(), this.getHighSpeedVideoFpsRangesFor.getAmountCreditText(), "600,00 €", this.getHighSpeedVideoFpsRangesFor.getTotalText(), "659,94 €"), this.getHighSpeedVideoFpsRangesFor.getLenderText(), new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.PaymentOptionReviewContent(this.getHighSpeedVideoFpsRangesFor.paymentDueTitle("0,00 €"), this.getHighSpeedVideoFpsRangesFor.repaymentInfo("HSBC Bank Checking +8607", "1"), this.getHighSpeedVideoFpsRangesFor.getCardSetupInfo()), new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.ReviewPlanFooterContent(this.getHighSpeedVideoFpsRangesFor.getAgreementText(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor.getAgreementLink(), com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL)), this.getHighSpeedVideoFpsRangesFor.getApplyButtonText()), new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.components.TransitioningLoadingContent(this.getHighSpeedVideoFpsRangesFor.getTransitioningLoadingProgressText(), this.getHighSpeedVideoFpsRangesFor.getTransitioningLoadingFooterText()), this.getHighResolutionOutputSizeshNQ4ISI.getExitConfirmationContent(), this.getHighSpeedVideoFpsRangesFor.getToolBarContent());
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
