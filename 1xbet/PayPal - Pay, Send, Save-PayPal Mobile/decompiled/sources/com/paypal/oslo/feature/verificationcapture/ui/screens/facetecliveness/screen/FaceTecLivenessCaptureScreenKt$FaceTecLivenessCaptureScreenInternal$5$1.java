package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1", f = "FaceTecLivenessCaptureScreen.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/facetecliveness/contract/FaceTecLivenessCaptureUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1$1", f = "FaceTecLivenessCaptureScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
        int getInputFormats;
        final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect faceTecLivenessCaptureUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect) this.getHighSpeedVideoSizesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(faceTecLivenessCaptureUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.StartFaceTecSession.INSTANCE)) {
                if (faceTecLivenessCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateToLivenessReview) {
                    this.getHighSpeedVideoFpsRanges.navigate(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination.INSTANCE);
                } else if (faceTecLivenessCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess navigateBackWithSuccess = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithSuccess) faceTecLivenessCaptureUiEffect;
                    this.getHighSpeedVideoFpsRanges.popBackStack(new com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, false, (java.lang.String) null, (java.lang.String) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success(navigateBackWithSuccess.getSessionId(), navigateBackWithSuccess.getFaceScanData(), navigateBackWithSuccess.getAuditTrailImages(), (java.util.List) null, 0, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(faceTecLivenessCaptureUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithCancelled.INSTANCE)) {
                    this.getHighSpeedVideoFpsRanges.popBackStack(new com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, false, (java.lang.String) null, (java.lang.String) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled.INSTANCE);
                } else if (faceTecLivenessCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout) {
                    this.getHighSpeedVideoFpsRanges.popBackStack(new com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, false, (java.lang.String) null, (java.lang.String) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout(((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithTimeout) faceTecLivenessCaptureUiEffect).getDurationMs()));
                } else if (faceTecLivenessCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError navigateBackWithError = (com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.NavigateBackWithError) faceTecLivenessCaptureUiEffect;
                    this.getHighSpeedVideoFpsRanges.popBackStack(new com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, false, (java.lang.String) null, (java.lang.String) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error(navigateBackWithError.getErrorCode(), navigateBackWithError.getErrorMessage()));
                } else {
                    if (!(faceTecLivenessCaptureUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    android.widget.Toast.makeText(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect.ShowError) faceTecLivenessCaptureUiEffect).getMessage(), 1).show();
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.contract.FaceTecLivenessCaptureUiEffect faceTecLivenessCaptureUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1.AnonymousClass1) create(faceTecLivenessCaptureUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoSizesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = navigator;
            this.getInputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
            this.Camera2StreamConfigurationMap = str4;
            this.getHighSpeedVideoSizes = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputFormats.getUiEffect(), new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1(com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel faceTecLivenessCaptureViewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt$FaceTecLivenessCaptureScreenInternal$5$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = faceTecLivenessCaptureViewModel;
        this.getHighSpeedVideoSizes = navigator;
        this.getInputFormats = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getHighSpeedVideoFpsRanges = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
