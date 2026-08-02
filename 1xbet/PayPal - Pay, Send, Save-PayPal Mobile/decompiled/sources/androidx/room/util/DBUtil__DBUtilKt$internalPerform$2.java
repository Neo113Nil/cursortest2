package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "transactor", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", f = "DBUtil.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 65}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes7.dex */
public final class DBUtil__DBUtilKt$internalPerform$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r9 != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r8.getHighSpeedVideoFpsRangesFor.getInvalidationTracker().sync$room_runtime(r8) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType;
        androidx.room.Transactor transactor;
        androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType2;
        androidx.room.Transactor transactor2;
        androidx.room.Transactor transactor3;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.room.Transactor transactor4 = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoSizes) {
                    sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.DEFERRED;
                } else {
                    sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE;
                }
                if (this.getHighSpeedVideoSizes) {
                    androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
                    transactor = transactor4;
                    sQLiteTransactionType2 = sQLiteTransactionType3;
                    this.Camera2StreamConfigurationMap = transactor;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getOutputMinFrameDuration = 3;
                    obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1(this.getHighSpeedVideoFpsRanges, null), this);
                } else {
                    this.Camera2StreamConfigurationMap = transactor4;
                    this.getHighSpeedVideoSizesFor = sQLiteTransactionType;
                    this.getOutputMinFrameDuration = 1;
                    java.lang.Object inTransaction = transactor4.inTransaction(this);
                    if (inTransaction != coroutine_suspended) {
                        transactor2 = transactor4;
                        obj = inTransaction;
                    }
                }
            } else {
                kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = 5;
                java.lang.Object invoke = function2.invoke(transactor4, this);
                if (invoke != coroutine_suspended) {
                    return invoke;
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            sQLiteTransactionType = (androidx.room.Transactor.SQLiteTransactionType) this.getHighSpeedVideoSizesFor;
            transactor2 = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    obj2 = this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        this.getHighSpeedVideoFpsRangesFor.getInvalidationTracker().refreshAsync();
                    }
                    return obj2;
                }
                transactor = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoSizes) {
                    return obj;
                }
                this.Camera2StreamConfigurationMap = obj;
                this.getOutputMinFrameDuration = 4;
                java.lang.Object inTransaction2 = transactor.inTransaction(this);
                if (inTransaction2 != coroutine_suspended) {
                    obj2 = obj;
                    obj = inTransaction2;
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return coroutine_suspended;
            }
            sQLiteTransactionType = (androidx.room.Transactor.SQLiteTransactionType) this.getHighSpeedVideoSizesFor;
            transactor3 = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            sQLiteTransactionType2 = sQLiteTransactionType;
            transactor = transactor3;
            this.Camera2StreamConfigurationMap = transactor;
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputMinFrameDuration = 3;
            obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1(this.getHighSpeedVideoFpsRanges, null), this);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            this.Camera2StreamConfigurationMap = transactor2;
            this.getHighSpeedVideoSizesFor = sQLiteTransactionType;
            this.getOutputMinFrameDuration = 2;
        }
        transactor3 = transactor2;
        sQLiteTransactionType2 = sQLiteTransactionType;
        transactor = transactor3;
        this.Camera2StreamConfigurationMap = transactor;
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputMinFrameDuration = 3;
        obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1(this.getHighSpeedVideoFpsRanges, null), this);
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType;
        androidx.room.Transactor transactor = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoSizes) {
                sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.DEFERRED;
            } else {
                sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE;
            }
            if (!this.getHighSpeedVideoSizes) {
                androidx.room.util.DBUtil__DBUtilKt$internalPerform$2<R> dBUtil__DBUtilKt$internalPerform$2 = this;
                if (!((java.lang.Boolean) transactor.inTransaction(dBUtil__DBUtilKt$internalPerform$2)).booleanValue()) {
                    this.getHighSpeedVideoFpsRangesFor.getInvalidationTracker().sync$room_runtime(dBUtil__DBUtilKt$internalPerform$2);
                }
            }
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2<R> dBUtil__DBUtilKt$internalPerform$22 = this;
            java.lang.Object withTransaction = transactor.withTransaction(sQLiteTransactionType, new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1(this.getHighSpeedVideoFpsRanges, null), dBUtil__DBUtilKt$internalPerform$22);
            if (!this.getHighSpeedVideoSizes && !((java.lang.Boolean) transactor.inTransaction(dBUtil__DBUtilKt$internalPerform$22)).booleanValue()) {
                this.getHighSpeedVideoFpsRangesFor.getInvalidationTracker().refreshAsync();
            }
            return withTransaction;
        }
        return this.getHighSpeedVideoFpsRanges.invoke(transactor, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.room.Transactor transactor, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.room.util.DBUtil__DBUtilKt$internalPerform$2) create(transactor, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.util.DBUtil__DBUtilKt$internalPerform$2 dBUtil__DBUtilKt$internalPerform$2 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        dBUtil__DBUtilKt$internalPerform$2.Camera2StreamConfigurationMap = obj;
        return dBUtil__DBUtilKt$internalPerform$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtilKt$internalPerform$2(boolean z, boolean z2, androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.room.util.DBUtil__DBUtilKt$internalPerform$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = z2;
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
