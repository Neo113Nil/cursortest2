package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "transactor", "Landroidx/room/Transactor;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes7.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.RoomDatabase getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/TransactionScope;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<R>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1 getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.room.TransactionScope transactionScope = (androidx.room.TransactionScope) this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(transactionScope, "");
            return this.getHighResolutionOutputSizeshNQ4ISI.invoke(((androidx.room.coroutines.RawConnectionAccessor) transactionScope).getRawConnection());
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.room.TransactionScope<R> transactionScope, kotlin.coroutines.Continuation<? super R> continuation) {
            return ((androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.AnonymousClass1 anonymousClass1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.AnonymousClass1(continuation, this.getHighResolutionOutputSizeshNQ4ISI);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function1 function1) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r9 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ca  */
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
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.room.Transactor transactor4 = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
            if (this.getHighSpeedVideoSizes) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.DEFERRED;
                } else {
                    sQLiteTransactionType = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE;
                }
                if (!this.getHighSpeedVideoFpsRangesFor) {
                    this.Camera2StreamConfigurationMap = transactor4;
                    this.getInputSizeshNQ4ISI = sQLiteTransactionType;
                    this.getInputFormats = 1;
                    java.lang.Object inTransaction = transactor4.inTransaction(this);
                    if (inTransaction != coroutine_suspended) {
                        transactor2 = transactor4;
                        obj = inTransaction;
                    }
                    return coroutine_suspended;
                }
                androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
                transactor = transactor4;
                sQLiteTransactionType2 = sQLiteTransactionType3;
                this.Camera2StreamConfigurationMap = transactor;
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = 3;
                obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.AnonymousClass1(null, this.getHighSpeedVideoFpsRanges), this);
            } else {
                androidx.room.Transactor transactor5 = transactor4;
                kotlin.jvm.internal.Intrinsics.checkNotNull(transactor5, "");
                return this.getHighSpeedVideoFpsRanges.invoke(((androidx.room.coroutines.RawConnectionAccessor) transactor5).getRawConnection());
            }
        } else if (i == 1) {
            sQLiteTransactionType = (androidx.room.Transactor.SQLiteTransactionType) this.getInputSizeshNQ4ISI;
            transactor2 = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        this.getHighResolutionOutputSizeshNQ4ISI.getInvalidationTracker().refreshAsync();
                    }
                    return obj2;
                }
                transactor = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return obj;
                }
                this.Camera2StreamConfigurationMap = obj;
                this.getInputFormats = 4;
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
            sQLiteTransactionType = (androidx.room.Transactor.SQLiteTransactionType) this.getInputSizeshNQ4ISI;
            transactor3 = (androidx.room.Transactor) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            sQLiteTransactionType2 = sQLiteTransactionType;
            transactor = transactor3;
            this.Camera2StreamConfigurationMap = transactor;
            this.getInputSizeshNQ4ISI = null;
            this.getInputFormats = 3;
            obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.AnonymousClass1(null, this.getHighSpeedVideoFpsRanges), this);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            this.Camera2StreamConfigurationMap = transactor2;
            this.getInputSizeshNQ4ISI = sQLiteTransactionType;
            this.getInputFormats = 2;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getInvalidationTracker().sync$room_runtime(this) != coroutine_suspended) {
                transactor3 = transactor2;
                sQLiteTransactionType2 = sQLiteTransactionType;
                transactor = transactor3;
                this.Camera2StreamConfigurationMap = transactor;
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = 3;
                obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.AnonymousClass1(null, this.getHighSpeedVideoFpsRanges), this);
            }
            return coroutine_suspended;
        }
        sQLiteTransactionType2 = sQLiteTransactionType;
        transactor = transactor2;
        this.Camera2StreamConfigurationMap = transactor;
        this.getInputSizeshNQ4ISI = null;
        this.getInputFormats = 3;
        obj = transactor.withTransaction(sQLiteTransactionType2, new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.AnonymousClass1(null, this.getHighSpeedVideoFpsRanges), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.room.Transactor transactor, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1) create(transactor, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation, this.getHighSpeedVideoFpsRanges);
        dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.Camera2StreamConfigurationMap = obj;
        return dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(boolean z, boolean z2, androidx.room.RoomDatabase roomDatabase, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function1 function1) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
