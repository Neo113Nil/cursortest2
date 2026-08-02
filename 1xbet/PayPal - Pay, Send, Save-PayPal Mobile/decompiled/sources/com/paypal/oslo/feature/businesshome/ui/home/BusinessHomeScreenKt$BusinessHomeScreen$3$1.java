package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1", f = "BusinessHomeScreen.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, nl = {128}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessHomeScreenKt$BusinessHomeScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;
    int getOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/businesshome/ui/home/BusinessHomeEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1$1", f = "BusinessHomeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
        /* synthetic */ java.lang.Object getInputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect businessHomeEffect = (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect) this.getInputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputMinFrameDurationlomOqCM != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToBusinessExperienceDisabled) {
                this.Camera2StreamConfigurationMap.invoke();
            } else if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToDisputes) {
                this.getHighSpeedVideoFpsRanges.invoke();
            } else if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail) {
                this.getHighSpeedVideoFpsRangesFor.invoke(((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableP2PDetail) businessHomeEffect).getTransactionId());
            } else if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail) {
                this.getOutputMinFrameDuration.invoke(((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableP2PDetail) businessHomeEffect).getTransactionId());
            } else if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail) {
                this.getHighSpeedVideoSizes.invoke(((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayableInvoiceDetail) businessHomeEffect).getInvoiceId());
            } else if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail) {
                this.getOutputFormats.invoke(((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivableInvoiceDetail) businessHomeEffect).getInvoiceId());
            } else if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToPayablesList) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else if (businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToReceivablesList) {
                this.getInputSizeshNQ4ISI.invoke();
            } else {
                if (!(businessHomeEffect instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToRecentTransactions)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizesFor.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect businessHomeEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1.AnonymousClass1) create(businessHomeEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function0;
            this.getHighSpeedVideoFpsRanges = function02;
            this.getHighSpeedVideoFpsRangesFor = function1;
            this.getOutputMinFrameDuration = function12;
            this.getHighSpeedVideoSizes = function13;
            this.getOutputFormats = function14;
            this.getHighResolutionOutputSizeshNQ4ISI = function03;
            this.getInputSizeshNQ4ISI = function04;
            this.getHighSpeedVideoSizesFor = function05;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputFormats.getEffects(), new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getOutputMinFrameDuration, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BusinessHomeScreenKt$BusinessHomeScreen$3$1(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt$BusinessHomeScreen$3$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = businessHomeViewModel;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRangesFor = function02;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizesFor = function12;
        this.Camera2StreamConfigurationMap = function13;
        this.getInputSizeshNQ4ISI = function14;
        this.getHighResolutionOutputSizeshNQ4ISI = function03;
        this.getInputFormats = function04;
        this.getOutputMinFrameDuration = function05;
    }
}
