package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PassthroughConnection$withTransaction$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    final /* synthetic */ androidx.room.coroutines.PassthroughConnection Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.Transactor.SQLiteTransactionType getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.TransactionScope<R>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this);
        return highSpeedVideoFpsRangesFor == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return ((androidx.room.coroutines.PassthroughConnection$withTransaction$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.coroutines.PassthroughConnection$withTransaction$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PassthroughConnection$withTransaction$2(androidx.room.coroutines.PassthroughConnection passthroughConnection, androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PassthroughConnection$withTransaction$2> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = passthroughConnection;
        this.getHighResolutionOutputSizeshNQ4ISI = sQLiteTransactionType;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
