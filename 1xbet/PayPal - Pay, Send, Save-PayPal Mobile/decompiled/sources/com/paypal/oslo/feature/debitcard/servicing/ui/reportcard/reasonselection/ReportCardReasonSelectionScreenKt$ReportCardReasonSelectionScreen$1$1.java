package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1", f = "ReportCardReasonSelectionScreen.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, nl = {109}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ReportCardReasonSelectionAnalytics.SCREEN_ID, this.getHighResolutionOutputSizeshNQ4ISI, null, null, 12, null);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/reportcard/reasonselection/mvi/ReportCardReasonSelectionEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1$1", f = "ReportCardReasonSelectionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect reportCardReasonSelectionEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (reportCardReasonSelectionEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow) {
                com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt.access$handleNavigateToReportFlow(((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateToReportFlow) reportCardReasonSelectionEffect).getReason(), this.Camera2StreamConfigurationMap.getReplacementInfo(), this.getHighSpeedVideoFpsRanges);
            } else {
                if (!(reportCardReasonSelectionEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.mvi.ReportCardReasonSelectionEffect reportCardReasonSelectionEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1.AnonymousClass1) create(reportCardReasonSelectionEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel reportCardReasonSelectionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = reportCardReasonSelectionViewModel;
            this.getHighSpeedVideoFpsRanges = appNavigator;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.viewmodel.ReportCardReasonSelectionViewModel reportCardReasonSelectionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.reasonselection.ReportCardReasonSelectionScreenKt$ReportCardReasonSelectionScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = userIntentContext;
        this.getHighSpeedVideoFpsRangesFor = reportCardReasonSelectionViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
