package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1", f = "DocumentReviewScreen.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {82}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DocumentReviewScreenKt$DocumentReviewScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1$1", f = "DocumentReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.Navigator getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect documentReviewUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(documentReviewUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect.NavigateToDocumentCapture.INSTANCE)) {
                this.getHighSpeedVideoFpsRangesFor.popBackStack();
                this.getHighSpeedVideoFpsRangesFor.navigate(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination("DRIVERS_LICENSE", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, (com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(documentReviewUiEffect, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect.NavigateToConfirmIdentity.INSTANCE)) {
                this.getHighSpeedVideoFpsRangesFor.navigate(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination.INSTANCE);
            } else {
                if (!(documentReviewUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect.ShowError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                android.widget.Toast.makeText(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect.ShowError) documentReviewUiEffect).getMessage(), 1).show();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiEffect documentReviewUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1.AnonymousClass1) create(documentReviewUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = navigator;
            this.Camera2StreamConfigurationMap = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentReviewScreenKt$DocumentReviewScreen$1$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel documentReviewViewModel, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = documentReviewViewModel;
        this.Camera2StreamConfigurationMap = navigator;
        this.getHighSpeedVideoFpsRanges = context;
    }
}
