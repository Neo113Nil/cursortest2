package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialiseTapToPayEngine$2", f = "TapToPayEngineInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class TapToPayEngineInteractorImpl$initialiseTapToPayEngine$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRangesFor.init(this.Camera2StreamConfigurationMap));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialiseTapToPayEngine$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialiseTapToPayEngine$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayEngineInteractorImpl$initialiseTapToPayEngine$2(com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl tapToPayEngineInteractorImpl, com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialiseTapToPayEngine$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = tapToPayEngineInteractorImpl;
        this.Camera2StreamConfigurationMap = configurationInit;
    }
}
