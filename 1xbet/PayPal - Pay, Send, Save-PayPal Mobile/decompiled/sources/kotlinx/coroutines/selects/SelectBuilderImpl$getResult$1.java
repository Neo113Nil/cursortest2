package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class SelectBuilderImpl$getResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.selects.SelectBuilderImpl<R> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = this.Camera2StreamConfigurationMap.doSelect(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            cancellableContinuationImpl2 = ((kotlinx.coroutines.selects.SelectBuilderImpl) this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.selects.SelectOldKt.access$resumeUndispatched(cancellableContinuationImpl2, obj);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            cancellableContinuationImpl = ((kotlinx.coroutines.selects.SelectBuilderImpl) this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.selects.SelectOldKt.access$resumeUndispatchedWithException(cancellableContinuationImpl, th);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectBuilderImpl$getResult$1(kotlinx.coroutines.selects.SelectBuilderImpl<R> selectBuilderImpl, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = selectBuilderImpl;
    }
}
