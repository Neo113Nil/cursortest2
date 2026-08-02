package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.room.RoomDatabase roomDatabase = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object useConnection = roomDatabase.useConnection(false, new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(true, false, roomDatabase, null, this.Camera2StreamConfigurationMap), this);
        return useConnection == coroutine_suspended ? coroutine_suspended : useConnection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return ((androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.Camera2StreamConfigurationMap = function1;
    }
}
