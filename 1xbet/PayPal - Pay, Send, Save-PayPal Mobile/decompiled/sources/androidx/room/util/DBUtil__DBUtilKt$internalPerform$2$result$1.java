package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1", f = "DBUtil.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class DBUtil__DBUtilKt$internalPerform$2$result$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<R>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRanges;
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
        androidx.room.TransactionScope transactionScope = (androidx.room.TransactionScope) this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object invoke = function2.invoke(transactionScope, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        return this.getHighSpeedVideoFpsRanges.invoke((androidx.room.TransactionScope) this.Camera2StreamConfigurationMap, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.room.TransactionScope<R> transactionScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1) create(transactionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1(this.getHighSpeedVideoFpsRanges, continuation);
        dBUtil__DBUtilKt$internalPerform$2$result$1.Camera2StreamConfigurationMap = obj;
        return dBUtil__DBUtilKt$internalPerform$2$result$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtilKt$internalPerform$2$result$1(kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
