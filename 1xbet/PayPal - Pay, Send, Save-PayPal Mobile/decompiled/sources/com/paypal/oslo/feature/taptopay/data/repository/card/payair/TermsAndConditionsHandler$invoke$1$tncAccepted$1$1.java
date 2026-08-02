package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1$tncAccepted$1$1", f = "TermsAndConditionsHandler.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {99}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TermsAndConditionsHandler$invoke$1$tncAccepted$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String obj2 = this.getHighSpeedVideoFpsRangesFor.toString();
            final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1$tncAccepted$1$1.1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation2 = cancellableContinuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.TRUE));
                    return kotlin.Unit.INSTANCE;
                }
            };
            final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation2 = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            if (producerScope.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleTermsAndConditions(obj2, function0, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1$tncAccepted$1$1.2
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation3 = cancellableContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation3.resumeWith(kotlin.Result.m23436constructorimpl(java.lang.Boolean.FALSE));
                    return kotlin.Unit.INSTANCE;
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
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1$tncAccepted$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1$tncAccepted$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TermsAndConditionsHandler$invoke$1$tncAccepted$1$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.oslo.feature.taptopay.data.repository.card.payair.TACContent tACContent, kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> cancellableContinuation, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.TermsAndConditionsHandler$invoke$1$tncAccepted$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
        this.getHighSpeedVideoFpsRangesFor = tACContent;
        this.getHighSpeedVideoSizes = cancellableContinuation;
    }
}
