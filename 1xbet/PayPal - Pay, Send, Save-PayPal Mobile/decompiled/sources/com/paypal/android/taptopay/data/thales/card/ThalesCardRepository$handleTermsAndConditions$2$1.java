package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$handleTermsAndConditions$2$1", f = "ThalesCardRepository.kt", i = {}, l = {475}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesCardRepository$handleTermsAndConditions$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.coroutines.Continuation<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope = this.Camera2StreamConfigurationMap;
            java.lang.String content = this.getHighSpeedVideoSizes.getContent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(content, "");
            final kotlin.coroutines.Continuation<java.lang.Boolean> continuation = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$handleTermsAndConditions$2$1.1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoFpsRanges();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges() {
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = continuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.TRUE));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }
            };
            final kotlin.coroutines.Continuation<java.lang.Boolean> continuation2 = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (producerScope.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Success.HandleTermsAndConditions(content, function0, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$handleTermsAndConditions$2$1.2
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoFpsRanges();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges() {
                    kotlin.coroutines.Continuation<java.lang.Boolean> continuation3 = continuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation3.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.FALSE));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }
            }), this) == coroutine_suspended) {
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
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$handleTermsAndConditions$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$handleTermsAndConditions$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesCardRepository$handleTermsAndConditions$2$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditions termsAndConditions, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$handleTermsAndConditions$2$1> continuation2) {
        super(2, continuation2);
        this.Camera2StreamConfigurationMap = producerScope;
        this.getHighSpeedVideoSizes = termsAndConditions;
        this.getHighSpeedVideoFpsRanges = continuation;
    }
}
