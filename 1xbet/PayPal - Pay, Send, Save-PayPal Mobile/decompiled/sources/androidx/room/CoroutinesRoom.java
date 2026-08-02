package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutinesRoom {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.CoroutinesRoom.Companion INSTANCE = new androidx.room.CoroutinesRoom.Companion(null);

    private CoroutinesRoom() {
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000b\u0010\u000fJL\u0010\u0015\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00140\u0013\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/RoomDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "execute", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/jvm/JvmSuppressWildcards;", "createFlow", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        
            if (r9 != r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @kotlin.Deprecated(message = "No longer called by generated implementation")
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
            androidx.room.CoroutinesRoom$Companion$execute$1 coroutinesRoom$Companion$execute$1;
            int i;
            if (continuation instanceof androidx.room.CoroutinesRoom$Companion$execute$1) {
                coroutinesRoom$Companion$execute$1 = (androidx.room.CoroutinesRoom$Companion$execute$1) continuation;
                if ((coroutinesRoom$Companion$execute$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    coroutinesRoom$Companion$execute$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = coroutinesRoom$Companion$execute$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = coroutinesRoom$Companion$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) {
                            return callable.call();
                        }
                        coroutinesRoom$Companion$execute$1.getHighSpeedVideoSizes = callable;
                        coroutinesRoom$Companion$execute$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = androidx.room.util.DBUtil.getCoroutineContext(roomDatabase, z, coroutinesRoom$Companion$execute$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        callable = (java.util.concurrent.Callable) coroutinesRoom$Companion$execute$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    androidx.room.CoroutinesRoom$Companion$execute$2 coroutinesRoom$Companion$execute$2 = new androidx.room.CoroutinesRoom$Companion$execute$2(callable, null);
                    coroutinesRoom$Companion$execute$1.getHighSpeedVideoSizes = null;
                    coroutinesRoom$Companion$execute$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext((kotlin.coroutines.CoroutineContext) obj, coroutinesRoom$Companion$execute$2, coroutinesRoom$Companion$execute$1);
                    return withContext != coroutine_suspended ? coroutine_suspended : withContext;
                }
            }
            coroutinesRoom$Companion$execute$1 = new androidx.room.CoroutinesRoom$Companion$execute$1(this, continuation);
            java.lang.Object obj2 = coroutinesRoom$Companion$execute$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = coroutinesRoom$Companion$execute$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            androidx.room.CoroutinesRoom$Companion$execute$2 coroutinesRoom$Companion$execute$22 = new androidx.room.CoroutinesRoom$Companion$execute$2(callable, null);
            coroutinesRoom$Companion$execute$1.getHighSpeedVideoSizes = null;
            coroutinesRoom$Companion$execute$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            java.lang.Object withContext2 = kotlinx.coroutines.BuildersKt.withContext((kotlin.coroutines.CoroutineContext) obj2, coroutinesRoom$Companion$execute$22, coroutinesRoom$Companion$execute$1);
            if (withContext2 != coroutine_suspended2) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        
            if (r8 != r4) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
        @kotlin.Deprecated(message = "No longer called by generated implementation")
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
            androidx.room.CoroutinesRoom$Companion$execute$3 coroutinesRoom$Companion$execute$3;
            int i;
            final android.os.CancellationSignal cancellationSignal2;
            java.util.concurrent.Callable<R> callable2;
            java.lang.Object coroutineContext;
            final kotlinx.coroutines.Job launch$default;
            java.lang.Object result;
            androidx.room.RoomDatabase roomDatabase2 = roomDatabase;
            if (continuation instanceof androidx.room.CoroutinesRoom$Companion$execute$3) {
                coroutinesRoom$Companion$execute$3 = (androidx.room.CoroutinesRoom$Companion$execute$3) continuation;
                if ((coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = coroutinesRoom$Companion$execute$3.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) {
                            return callable.call();
                        }
                        coroutinesRoom$Companion$execute$3.Camera2StreamConfigurationMap = roomDatabase2;
                        cancellationSignal2 = cancellationSignal;
                        coroutinesRoom$Companion$execute$3.getHighSpeedVideoSizes = cancellationSignal2;
                        callable2 = callable;
                        coroutinesRoom$Companion$execute$3.getHighResolutionOutputSizeshNQ4ISI = callable2;
                        coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRanges = 1;
                        coroutineContext = androidx.room.util.DBUtil.getCoroutineContext(roomDatabase2, z, coroutinesRoom$Companion$execute$3);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        java.util.concurrent.Callable<R> callable3 = (java.util.concurrent.Callable) coroutinesRoom$Companion$execute$3.getHighResolutionOutputSizeshNQ4ISI;
                        android.os.CancellationSignal cancellationSignal3 = (android.os.CancellationSignal) coroutinesRoom$Companion$execute$3.getHighSpeedVideoSizes;
                        androidx.room.RoomDatabase roomDatabase3 = (androidx.room.RoomDatabase) coroutinesRoom$Companion$execute$3.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        callable2 = callable3;
                        roomDatabase2 = roomDatabase3;
                        coroutineContext = obj;
                        cancellationSignal2 = cancellationSignal3;
                    }
                    kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) coroutineContext;
                    coroutinesRoom$Companion$execute$3.Camera2StreamConfigurationMap = roomDatabase2;
                    coroutinesRoom$Companion$execute$3.getHighSpeedVideoSizes = cancellationSignal2;
                    coroutinesRoom$Companion$execute$3.getHighResolutionOutputSizeshNQ4ISI = callable2;
                    coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRangesFor = coroutineContext2;
                    coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRanges = 2;
                    androidx.room.CoroutinesRoom$Companion$execute$3 coroutinesRoom$Companion$execute$32 = coroutinesRoom$Companion$execute$3;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(coroutinesRoom$Companion$execute$32), 1);
                    cancellableContinuationImpl.initCancellability();
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(roomDatabase2.getCoroutineScope(), coroutineContext2, null, new androidx.room.CoroutinesRoom$Companion$execute$4$job$1(callable2, cancellableContinuationImpl2, null), 2, null);
                    cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                            getHighResolutionOutputSizeshNQ4ISI(th);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
                            android.os.CancellationSignal cancellationSignal4 = cancellationSignal2;
                            if (cancellationSignal4 != null) {
                                cancellationSignal4.cancel();
                            }
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(launch$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                    });
                    result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(coroutinesRoom$Companion$execute$32);
                    }
                    return result != coroutine_suspended ? coroutine_suspended : result;
                }
            }
            coroutinesRoom$Companion$execute$3 = new androidx.room.CoroutinesRoom$Companion$execute$3(this, continuation);
            java.lang.Object obj2 = coroutinesRoom$Companion$execute$3.getOutputFormats;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRanges;
            if (i != 0) {
            }
            kotlin.coroutines.CoroutineContext coroutineContext22 = (kotlin.coroutines.CoroutineContext) coroutineContext;
            coroutinesRoom$Companion$execute$3.Camera2StreamConfigurationMap = roomDatabase2;
            coroutinesRoom$Companion$execute$3.getHighSpeedVideoSizes = cancellationSignal2;
            coroutinesRoom$Companion$execute$3.getHighResolutionOutputSizeshNQ4ISI = callable2;
            coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRangesFor = coroutineContext22;
            coroutinesRoom$Companion$execute$3.getHighSpeedVideoFpsRanges = 2;
            androidx.room.CoroutinesRoom$Companion$execute$3 coroutinesRoom$Companion$execute$322 = coroutinesRoom$Companion$execute$3;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl3 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(coroutinesRoom$Companion$execute$322), 1);
            cancellableContinuationImpl3.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl22 = cancellableContinuationImpl3;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(roomDatabase2.getCoroutineScope(), coroutineContext22, null, new androidx.room.CoroutinesRoom$Companion$execute$4$job$1(callable2, cancellableContinuationImpl22, null), 2, null);
            cancellableContinuationImpl22.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    getHighResolutionOutputSizeshNQ4ISI(th);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
                    android.os.CancellationSignal cancellationSignal4 = cancellationSignal2;
                    if (cancellationSignal4 != null) {
                        cancellationSignal4.cancel();
                    }
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(launch$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            });
            result = cancellableContinuationImpl3.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (result != coroutine_suspended2) {
            }
        }

        @kotlin.Deprecated(message = "No longer called by generated implementation")
        @kotlin.jvm.JvmStatic
        public final <R> kotlinx.coroutines.flow.Flow<R> createFlow(androidx.room.RoomDatabase db, boolean inTransaction, java.lang.String[] tableNames, final java.util.concurrent.Callable<R> callable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "");
            return androidx.room.coroutines.FlowUtil.createFlow(db, inTransaction, tableNames, new kotlin.jvm.functions.Function1() { // from class: androidx.room.CoroutinesRoom$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.CoroutinesRoom.Companion.m9270$r8$lambda$QuhDTFRsPucDtZ1HvKanxYN2eI(callable, (androidx.database.SQLiteConnection) obj);
                }
            });
        }

        /* renamed from: $r8$lambda$QuhDTFR-sPucDtZ1HvKanxYN2eI, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m9270$r8$lambda$QuhDTFRsPucDtZ1HvKanxYN2eI(java.util.concurrent.Callable callable, androidx.database.SQLiteConnection sQLiteConnection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
            return callable.call();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @kotlin.jvm.JvmStatic
    public static final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, callable, continuation);
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @kotlin.jvm.JvmStatic
    public static final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, cancellationSignal, callable, continuation);
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @kotlin.jvm.JvmStatic
    public static final <R> kotlinx.coroutines.flow.Flow<R> createFlow(androidx.room.RoomDatabase roomDatabase, boolean z, java.lang.String[] strArr, java.util.concurrent.Callable<R> callable) {
        return INSTANCE.createFlow(roomDatabase, z, strArr, callable);
    }
}
