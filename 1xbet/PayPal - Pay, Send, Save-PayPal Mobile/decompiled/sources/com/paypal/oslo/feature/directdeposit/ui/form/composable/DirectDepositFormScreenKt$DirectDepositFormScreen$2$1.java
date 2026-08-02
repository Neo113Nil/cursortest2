package com.paypal.oslo.feature.directdeposit.ui.form.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1", f = "DirectDepositFormScreen.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, nl = {126}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositFormScreenKt$DirectDepositFormScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.String, java.lang.String, java.lang.Boolean, android.graphics.Bitmap, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/DirectDepositFormUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1$1", f = "DirectDepositFormScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.String, java.lang.String, java.lang.Boolean, android.graphics.Bitmap, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState> getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect directDepositFormUiEffect = (com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(directDepositFormUiEffect instanceof com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview navigateToReview = (com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview) directDepositFormUiEffect;
            this.Camera2StreamConfigurationMap.invoke(navigateToReview.getCompanyName(), navigateToReview.getAmount(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(navigateToReview.isPercentage()), com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt.access$DirectDepositFormScreen$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI).getSignatureBitmap());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect directDepositFormUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1.AnonymousClass1) create(directDepositFormUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super android.graphics.Bitmap, kotlin.Unit> function4, androidx.compose.runtime.State<com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function4;
            this.getHighResolutionOutputSizeshNQ4ISI = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getEffect(), new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DirectDepositFormScreenKt$DirectDepositFormScreen$2$1(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositFormViewModel directDepositFormViewModel, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super android.graphics.Bitmap, kotlin.Unit> function4, androidx.compose.runtime.State<com.paypal.oslo.feature.directdeposit.ui.form.state.DirectDepositFormUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt$DirectDepositFormScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = directDepositFormViewModel;
        this.Camera2StreamConfigurationMap = function4;
        this.getHighSpeedVideoSizes = state;
    }
}
