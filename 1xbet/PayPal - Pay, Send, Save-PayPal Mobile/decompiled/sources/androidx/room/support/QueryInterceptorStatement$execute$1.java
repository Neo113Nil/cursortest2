package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.support.QueryInterceptorStatement$execute$1", f = "QueryInterceptorStatement.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class QueryInterceptorStatement$execute$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.support.QueryInterceptorStatement getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.room.RoomDatabase.QueryCallback queryCallback;
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        queryCallback = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        str = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        queryCallback.onQuery(str, this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.support.QueryInterceptorStatement$execute$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.support.QueryInterceptorStatement$execute$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QueryInterceptorStatement$execute$1(androidx.room.support.QueryInterceptorStatement queryInterceptorStatement, java.util.List<? extends java.lang.Object> list, kotlin.coroutines.Continuation<? super androidx.room.support.QueryInterceptorStatement$execute$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = queryInterceptorStatement;
        this.getHighSpeedVideoSizes = list;
    }
}
