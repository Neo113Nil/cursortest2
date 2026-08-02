package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$attestationLogin$2", f = "TapToPayEngineInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class TapToPayEngineInteractorImpl$attestationLogin$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.zettle.sdk.feature.taptopay.core.attestation.Attestation attestation = this.getHighResolutionOutputSizeshNQ4ISI.getAttestation();
        context = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        attestation.action(new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogIn(context, this.getHighSpeedVideoFpsRanges));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$attestationLogin$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$attestationLogin$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayEngineInteractorImpl$attestationLogin$2(com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl tapToPayEngineInteractorImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$attestationLogin$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = tapToPayEngineInteractorImpl;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
