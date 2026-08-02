package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$query$3", f = "QueryInterceptorDatabase.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class QueryInterceptorDatabase$query$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.support.QueryInterceptorProgram getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.database.db.SupportSQLiteQuery getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.room.support.QueryInterceptorDatabase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.room.RoomDatabase.QueryCallback queryCallback;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            queryCallback = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            queryCallback.onQuery(this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor(), this.getHighResolutionOutputSizeshNQ4ISI.getBindArgsCache$room_runtime());
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.support.QueryInterceptorDatabase$query$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.support.QueryInterceptorDatabase$query$3(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QueryInterceptorDatabase$query$3(androidx.room.support.QueryInterceptorDatabase queryInterceptorDatabase, androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, androidx.room.support.QueryInterceptorProgram queryInterceptorProgram, kotlin.coroutines.Continuation<? super androidx.room.support.QueryInterceptorDatabase$query$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = queryInterceptorDatabase;
        this.getHighSpeedVideoFpsRanges = supportSQLiteQuery;
        this.getHighResolutionOutputSizeshNQ4ISI = queryInterceptorProgram;
    }
}
