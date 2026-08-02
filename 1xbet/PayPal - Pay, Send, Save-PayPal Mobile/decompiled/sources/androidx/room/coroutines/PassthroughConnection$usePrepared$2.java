package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PassthroughConnection$usePrepared$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.coroutines.PassthroughConnection getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.database.SQLiteStatement, R> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.database.SQLiteStatement prepare = this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes().prepare(this.getHighSpeedVideoFpsRanges);
        try {
            java.lang.Object invoke = this.getHighSpeedVideoFpsRangesFor.invoke(prepare);
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return invoke;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return ((androidx.room.coroutines.PassthroughConnection$usePrepared$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.coroutines.PassthroughConnection$usePrepared$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PassthroughConnection$usePrepared$2(androidx.room.coroutines.PassthroughConnection passthroughConnection, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteStatement, ? extends R> function1, kotlin.coroutines.Continuation<? super androidx.room.coroutines.PassthroughConnection$usePrepared$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = passthroughConnection;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
