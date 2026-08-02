package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class RoomDatabase$performClear$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String[] Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.room.RoomDatabase getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 2, 3, 4}, l = {532, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED, 535, 541, 542, 543}, m = "invokeSuspend", n = {"connection", "connection", "connection", "connection", "connection"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    /* renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.room.RoomDatabase Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ boolean getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:12:0x00c7, code lost:
        
            if (androidx.room.TransactorKt.execSQL(r1, "VACUUM", r6) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00d6, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
        
            if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA wal_checkpoint(FULL)", r6) != r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
        
            if (r7 != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        
            if (r1.withTransaction(androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE, new androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00491(r6.getHighSpeedVideoSizes, r6.getHighResolutionOutputSizeshNQ4ISI, null), r6) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        
            if (r6.Camera2StreamConfigurationMap.getInvalidationTracker().sync$room_runtime(r6) != r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
        
            if (r7 != r0) goto L14;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.room.Transactor transactor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.getHighSpeedVideoFpsRangesFor) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(obj);
                    transactor = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = transactor;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    obj = transactor.inTransaction(this);
                    break;
                case 1:
                    transactor = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        this.getHighSpeedVideoFpsRanges = transactor;
                        this.getHighSpeedVideoFpsRangesFor = 2;
                        break;
                    }
                    this.getHighSpeedVideoFpsRanges = transactor;
                    this.getHighSpeedVideoFpsRangesFor = 3;
                    break;
                case 2:
                    transactor = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges = transactor;
                    this.getHighSpeedVideoFpsRangesFor = 3;
                    break;
                case 3:
                    transactor = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges = transactor;
                    this.getHighSpeedVideoFpsRangesFor = 4;
                    obj = transactor.inTransaction(this);
                    break;
                case 4:
                    transactor = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        this.getHighSpeedVideoFpsRanges = transactor;
                        this.getHighSpeedVideoFpsRangesFor = 5;
                        break;
                    }
                    return kotlin.Unit.INSTANCE;
                case 5:
                    transactor = (androidx.room.Transactor) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoFpsRangesFor = 6;
                    break;
                case 6:
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.Camera2StreamConfigurationMap.getInvalidationTracker().refreshAsync();
                    return kotlin.Unit.INSTANCE;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 1}, l = {537, 539}, m = "invokeSuspend", n = {"$this$withTransaction", "$this$withTransaction", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
        /* renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00491 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ java.lang.String[] getHighSpeedVideoFpsRanges;
            java.lang.Object getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ boolean getHighSpeedVideoSizes;
            private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
            int getInputSizeshNQ4ISI;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x007e, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r10) != r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r6, r11, r10) == r0) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x007c -> B:6:0x007f). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                androidx.room.TransactionScope transactionScope;
                androidx.room.TransactionScope transactionScope2;
                int length;
                int i;
                java.lang.String[] strArr;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.getInputSizeshNQ4ISI;
                if (i2 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    transactionScope = (androidx.room.TransactionScope) this.getHighSpeedVideoSizesFor;
                    if (this.getHighSpeedVideoSizes) {
                        this.getHighSpeedVideoSizesFor = transactionScope;
                        this.getInputSizeshNQ4ISI = 1;
                    }
                } else if (i2 == 1) {
                    transactionScope = (androidx.room.TransactionScope) this.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = this.getHighResolutionOutputSizeshNQ4ISI;
                    i = this.Camera2StreamConfigurationMap;
                    strArr = (java.lang.String[]) this.getHighSpeedVideoFpsRangesFor;
                    transactionScope2 = (androidx.room.TransactionScope) this.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i++;
                    if (i < length) {
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.String str = strArr[i];
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("DELETE FROM `");
                    sb.append(str);
                    sb.append('`');
                    java.lang.String obj2 = sb.toString();
                    this.getHighSpeedVideoSizesFor = transactionScope2;
                    this.getHighSpeedVideoFpsRangesFor = strArr;
                    this.Camera2StreamConfigurationMap = i;
                    this.getHighResolutionOutputSizeshNQ4ISI = length;
                    this.getInputSizeshNQ4ISI = 2;
                }
                java.lang.String[] strArr2 = this.getHighSpeedVideoFpsRanges;
                transactionScope2 = transactionScope;
                length = strArr2.length;
                i = 0;
                strArr = strArr2;
                if (i < length) {
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(androidx.room.TransactionScope<kotlin.Unit> transactionScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00491) create(transactionScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00491 c00491 = new androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00491(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
                c00491.getHighSpeedVideoSizesFor = obj;
                return c00491;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00491(boolean z, java.lang.String[] strArr, kotlin.coroutines.Continuation<? super androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00491> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoSizes = z;
                this.getHighSpeedVideoFpsRanges = strArr;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(androidx.room.Transactor transactor, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.room.RoomDatabase$performClear$1.AnonymousClass1) create(transactor, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.room.RoomDatabase$performClear$1.AnonymousClass1 anonymousClass1 = new androidx.room.RoomDatabase$performClear$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.room.RoomDatabase roomDatabase, boolean z, java.lang.String[] strArr, kotlin.coroutines.Continuation<? super androidx.room.RoomDatabase$performClear$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = roomDatabase;
            this.getHighSpeedVideoSizes = z;
            this.getHighResolutionOutputSizeshNQ4ISI = strArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.room.RoomConnectionManager roomConnectionManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            roomConnectionManager = this.getHighSpeedVideoSizes.connectionManager;
            if (roomConnectionManager == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                roomConnectionManager = null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (roomConnectionManager.useConnection(false, new androidx.room.RoomDatabase$performClear$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.RoomDatabase$performClear$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.RoomDatabase$performClear$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomDatabase$performClear$1(androidx.room.RoomDatabase roomDatabase, boolean z, java.lang.String[] strArr, kotlin.coroutines.Continuation<? super androidx.room.RoomDatabase$performClear$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = roomDatabase;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = strArr;
    }
}
