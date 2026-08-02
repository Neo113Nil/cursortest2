package com.ingo.sdk.kotlin.common.core.interactor;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2", f = "UseCase.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class UseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.ingo.sdk.kotlin.common.core.interactor.UseCase<Type, Params> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends Type>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ Params getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlin.jvm.functions.Function1 function1;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getBackgroundDispatcher(), null, new com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null), 2, null);
            kotlin.jvm.functions.Function1 function12 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = function12;
            this.getHighSpeedVideoSizes = 1;
            obj = async$default.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1 = function12;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        function1.invoke(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2 useCase$invoke$2 = new com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        useCase$invoke$2.getHighSpeedVideoFpsRangesFor = obj;
        return useCase$invoke$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCase$invoke$2(com.ingo.sdk.kotlin.common.core.interactor.UseCase<? extends Type, ? super Params> useCase, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends Type>, kotlin.Unit> function1, Params params, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = useCase;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = params;
    }
}
