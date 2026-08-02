package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "transactor", "Landroidx/room/Transactor;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes7.dex */
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.RoomDatabase getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/TransactionScope;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<R>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1 function1 = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.room.TransactionScope<R> transactionScope, kotlin.coroutines.Continuation<? super R> continuation) {
            return ((androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.AnonymousClass1 anonymousClass1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.AnonymousClass1(continuation, this.getHighSpeedVideoSizes);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function1 function1) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r9 != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r8.getHighResolutionOutputSizeshNQ4ISI.getInvalidationTracker().sync$room_runtime(r8) != r0) goto L32;
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
            androidx.room.Transactor transactor4 = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
            if (this.getHighSpeedVideoSizes) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.DEFERRED;
                } else {
                    sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE;
                }
                if (this.getHighSpeedVideoFpsRangesFor) {
                    androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
                    transactor = transactor4;
                    sQLiteTransactionType2 = sQLiteTransactionType3;
                    this.getHighSpeedVideoFpsRanges = transactor;
                    this.getOutputFormats = null;
                    this.getOutputMinFrameDuration = 3;
                    obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.AnonymousClass1(null, this.Camera2StreamConfigurationMap), this);
                } else {
                    this.getHighSpeedVideoFpsRanges = transactor4;
                    this.getOutputFormats = sQLiteTransactionType;
                    this.getOutputMinFrameDuration = 1;
                    java.lang.Object inTransaction = transactor4.inTransaction(this);
                    if (inTransaction != coroutine_suspended) {
                        transactor2 = transactor4;
                        obj = inTransaction;
                    }
                }
            } else {
                kotlin.jvm.functions.Function1 function1 = this.Camera2StreamConfigurationMap;
                this.getOutputMinFrameDuration = 5;
                java.lang.Object invoke = function1.invoke(this);
                if (invoke != coroutine_suspended) {
                    return invoke;
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            sQLiteTransactionType = (androidx.room.Transactor.SQLiteTransactionType) this.getOutputFormats;
            transactor2 = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
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
                    obj2 = this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        this.getHighResolutionOutputSizeshNQ4ISI.getInvalidationTracker().refreshAsync();
                    }
                    return obj2;
                }
                transactor = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return obj;
                }
                this.getHighSpeedVideoFpsRanges = obj;
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
            sQLiteTransactionType = (androidx.room.Transactor.SQLiteTransactionType) this.getOutputFormats;
            transactor3 = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            sQLiteTransactionType2 = sQLiteTransactionType;
            transactor = transactor3;
            this.getHighSpeedVideoFpsRanges = transactor;
            this.getOutputFormats = null;
            this.getOutputMinFrameDuration = 3;
            obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.AnonymousClass1(null, this.Camera2StreamConfigurationMap), this);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            this.getHighSpeedVideoFpsRanges = transactor2;
            this.getOutputFormats = sQLiteTransactionType;
            this.getOutputMinFrameDuration = 2;
        }
        transactor3 = transactor2;
        sQLiteTransactionType2 = sQLiteTransactionType;
        transactor = transactor3;
        this.getHighSpeedVideoFpsRanges = transactor;
        this.getOutputFormats = null;
        this.getOutputMinFrameDuration = 3;
        obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.AnonymousClass1(null, this.Camera2StreamConfigurationMap), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.room.Transactor transactor, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1) create(transactor, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation, this.Camera2StreamConfigurationMap);
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.getHighSpeedVideoFpsRanges = obj;
        return dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1(boolean z, boolean z2, androidx.room.RoomDatabase roomDatabase, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function1 function1) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
        this.Camera2StreamConfigurationMap = function1;
    }
}
