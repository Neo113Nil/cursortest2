package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'BS\u0012B\u0010\b\u001a>\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\n\b\u0001\u0012\u0002\b\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\b\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\b\u001a\u00020\u00122-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016JM\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\b\u001a\u00020\u00122-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aRM\u0010\u001d\u001a>\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\n\b\u0001\u0012\u0002\b\u0003\u0018\u0001`\u00078\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0017\u001a\u00060\"j\u0002`#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010\u001b\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010!"}, d2 = {"Landroidx/room/coroutines/PassthroughConnection;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Landroidx/room/coroutines/TransactionWrapper;", "p0", "Landroidx/sqlite/SQLiteConnection;", "p1", "<init>", "(Lkotlin/jvm/functions/Function2;Landroidx/sqlite/SQLiteConnection;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Landroidx/sqlite/SQLiteStatement;", "usePrepared", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/room/Transactor$SQLiteTransactionType;", "Landroidx/room/TransactionScope;", "Lkotlin/ExtensionFunctionType;", "withTransaction", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "", "inTransaction", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/sqlite/SQLiteConnection;", "getHighSpeedVideoSizes", "()Landroidx/sqlite/SQLiteConnection;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/Camera2StreamConfigurationMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/Transactor$SQLiteTransactionType;", "getRawConnection", "PassthroughTransactor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PassthroughConnection implements androidx.room.Transactor, androidx.room.coroutines.RawConnectionAccessor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.database.SQLiteConnection getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.room.Transactor.SQLiteTransactionType getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public PassthroughConnection(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function2, androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = sQLiteConnection;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final androidx.database.SQLiteConnection getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public final androidx.database.SQLiteConnection getRawConnection() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.room.PooledConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object usePrepared(java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteStatement, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.room.coroutines.PassthroughConnection$usePrepared$1 passthroughConnection$usePrepared$1;
        java.lang.Object obj;
        int i;
        kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> function2;
        try {
            if (continuation instanceof androidx.room.coroutines.PassthroughConnection$usePrepared$1) {
                passthroughConnection$usePrepared$1 = (androidx.room.coroutines.PassthroughConnection$usePrepared$1) continuation;
                if ((passthroughConnection$usePrepared$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    passthroughConnection$usePrepared$1.getHighSpeedVideoSizes -= 2147483648;
                    obj = passthroughConnection$usePrepared$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = passthroughConnection$usePrepared$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        passthroughConnection$usePrepared$1.getHighSpeedVideoFpsRanges = str;
                        passthroughConnection$usePrepared$1.Camera2StreamConfigurationMap = function1;
                        passthroughConnection$usePrepared$1.getHighSpeedVideoSizes = 1;
                        obj = inTransaction(passthroughConnection$usePrepared$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        function1 = (kotlin.jvm.functions.Function1) passthroughConnection$usePrepared$1.Camera2StreamConfigurationMap;
                        str = (java.lang.String) passthroughConnection$usePrepared$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (!((java.lang.Boolean) obj).booleanValue() && (function2 = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                        androidx.room.coroutines.PassthroughConnection$usePrepared$2 passthroughConnection$usePrepared$2 = new androidx.room.coroutines.PassthroughConnection$usePrepared$2(this, str, function1, null);
                        passthroughConnection$usePrepared$1.getHighSpeedVideoFpsRanges = null;
                        passthroughConnection$usePrepared$1.Camera2StreamConfigurationMap = null;
                        passthroughConnection$usePrepared$1.getHighSpeedVideoSizes = 2;
                        java.lang.Object invoke = function2.invoke(passthroughConnection$usePrepared$2, passthroughConnection$usePrepared$1);
                        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                    }
                    androidx.database.SQLiteStatement prepare = this.getHighSpeedVideoSizes.prepare(str);
                    R invoke2 = function1.invoke(prepare);
                    kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
                    return invoke2;
                }
            }
            R invoke22 = function1.invoke(prepare);
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return invoke22;
        } finally {
        }
        passthroughConnection$usePrepared$1 = new androidx.room.coroutines.PassthroughConnection$usePrepared$1(this, continuation);
        obj = passthroughConnection$usePrepared$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passthroughConnection$usePrepared$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        androidx.database.SQLiteStatement prepare2 = this.getHighSpeedVideoSizes.prepare(str);
    }

    @Override // androidx.room.Transactor
    public final <R> java.lang.Object withTransaction(androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> function22 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (function22 != null) {
            java.lang.Object invoke = function22.invoke(new androidx.room.coroutines.PassthroughConnection$withTransaction$2(this, sQLiteTransactionType, function2, null), continuation);
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return invoke;
        }
        return getHighSpeedVideoFpsRangesFor(sQLiteTransactionType, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5 A[Catch: SQLException -> 0x00cd, TryCatch #1 {SQLException -> 0x00cd, blocks: (B:55:0x00bd, B:57:0x00c5, B:58:0x00c7), top: B:54:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.room.coroutines.PassthroughConnection$transaction$1 passthroughConnection$transaction$1;
        int i;
        int i2;
        try {
            if (continuation instanceof androidx.room.coroutines.PassthroughConnection$transaction$1) {
                passthroughConnection$transaction$1 = (androidx.room.coroutines.PassthroughConnection$transaction$1) continuation;
                if ((passthroughConnection$transaction$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    passthroughConnection$transaction$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = passthroughConnection$transaction$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = passthroughConnection$transaction$1.getHighSpeedVideoFpsRangesFor;
                    i2 = 1;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        int i3 = androidx.room.coroutines.PassthroughConnection.WhenMappings.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                        if (i3 == 1) {
                            androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "BEGIN DEFERRED TRANSACTION");
                        } else if (i3 == 2) {
                            androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (i3 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (this.getHighSpeedVideoFpsRangesFor.incrementAndGet() > 0) {
                            this.getHighSpeedVideoFpsRanges = sQLiteTransactionType;
                        }
                        androidx.room.coroutines.PassthroughConnection.PassthroughTransactor passthroughTransactor = new androidx.room.coroutines.PassthroughConnection.PassthroughTransactor();
                        passthroughConnection$transaction$1.getHighSpeedVideoFpsRanges = 1;
                        passthroughConnection$transaction$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = function2.invoke(passthroughTransactor, passthroughConnection$transaction$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = passthroughConnection$transaction$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
                        this.getHighSpeedVideoFpsRanges = null;
                    }
                    if (i2 == 0) {
                        androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "END TRANSACTION");
                        return obj;
                    }
                    androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i != 0) {
            }
            if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
            }
            if (i2 == 0) {
            }
        } catch (java.lang.Throwable th) {
            th = th;
            if (th instanceof androidx.room.coroutines.ConnectionPool.RollbackException) {
                try {
                    java.lang.Object result = th.getResult();
                    if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
                        this.getHighSpeedVideoFpsRanges = null;
                    }
                    androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "ROLLBACK TRANSACTION");
                    return result;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    th = null;
                    if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
                        this.getHighSpeedVideoFpsRanges = null;
                    }
                    androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "ROLLBACK TRANSACTION");
                    throw th;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
                }
                androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "ROLLBACK TRANSACTION");
                throw th;
            }
            try {
                if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
                }
                androidx.database.SQLite.execSQL(this.getHighSpeedVideoSizes, "ROLLBACK TRANSACTION");
            } catch (android.database.SQLException e) {
                if (th == null) {
                    throw e;
                }
                kotlin.ExceptionsKt.addSuppressed(th, e);
            }
            throw th;
        }
        passthroughConnection$transaction$1 = new androidx.room.coroutines.PassthroughConnection$transaction$1(this, continuation);
        java.lang.Object obj2 = passthroughConnection$transaction$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passthroughConnection$transaction$1.getHighSpeedVideoFpsRangesFor;
        i2 = 1;
    }

    @Override // androidx.room.Transactor
    public final java.lang.Object inTransaction(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRanges != null || this.getHighSpeedVideoSizes.inTransaction());
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/room/coroutines/PassthroughConnection$PassthroughTransactor;", "T", "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "<init>", "(Landroidx/room/coroutines/PassthroughConnection;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "p0", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "p1", "usePrepared", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "withNestedTransaction", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "rollback", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/SQLiteConnection;", "getRawConnection", "()Landroidx/sqlite/SQLiteConnection;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class PassthroughTransactor<T> implements androidx.room.TransactionScope<T>, androidx.room.coroutines.RawConnectionAccessor {
        public PassthroughTransactor() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public final androidx.database.SQLiteConnection getRawConnection() {
            return androidx.room.coroutines.PassthroughConnection.this.getRawConnection();
        }

        @Override // androidx.room.PooledConnection
        public final <R> java.lang.Object usePrepared(java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteStatement, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
            return androidx.room.coroutines.PassthroughConnection.this.usePrepared(str, function1, continuation);
        }

        @Override // androidx.room.TransactionScope
        public final <R> java.lang.Object withNestedTransaction(kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
            androidx.room.coroutines.PassthroughConnection passthroughConnection = androidx.room.coroutines.PassthroughConnection.this;
            androidx.room.Transactor.SQLiteTransactionType sQLiteTransactionType = passthroughConnection.getHighSpeedVideoFpsRanges;
            if (sQLiteTransactionType != null) {
                return passthroughConnection.getHighSpeedVideoFpsRangesFor(sQLiteTransactionType, function2, continuation);
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }

        @Override // androidx.room.TransactionScope
        public final java.lang.Object rollback(T t, kotlin.coroutines.Continuation<?> continuation) {
            throw new androidx.room.coroutines.ConnectionPool.RollbackException(t);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.room.Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[androidx.room.Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.room.Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
