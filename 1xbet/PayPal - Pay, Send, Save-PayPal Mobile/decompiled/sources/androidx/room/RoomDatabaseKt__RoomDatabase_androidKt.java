package androidx.room;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\b\u0010\u0007\u001aC\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u000bH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0012*\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@¢\u0006\u0004\b\u0016\u0010\u0007"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "p0", "withTransaction", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransactionContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ExtensionFunctionType;", "getHighSpeedVideoFpsRanges", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "p1", "Lkotlinx/coroutines/flow/Flow;", "", "invalidationTrackerFlow", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "compatTransactionCoroutineExecute"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
/* loaded from: classes.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabase_androidKt {
    public static final <R> java.lang.Object withTransaction(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return androidx.room.RoomDatabaseKt.withTransactionContext(roomDatabase, new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(roomDatabase, function1, null), continuation);
    }

    public static final <R> java.lang.Object withTransactionContext(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(function1, null);
        androidx.room.TransactionElement transactionElement = (androidx.room.TransactionElement) continuation.getGetHighSpeedVideoSizes().get(androidx.room.TransactionElement.INSTANCE);
        kotlin.coroutines.ContinuationInterceptor transactionDispatcher = transactionElement != null ? transactionElement.getTransactionDispatcher() : null;
        if (transactionDispatcher != null) {
            return kotlinx.coroutines.BuildersKt.withContext(transactionDispatcher, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, continuation);
        }
        return getHighSpeedVideoFpsRanges(roomDatabase, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, continuation);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invalidationTrackerFlow$default(androidx.room.RoomDatabase roomDatabase, java.lang.String[] strArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return androidx.room.RoomDatabaseKt.invalidationTrackerFlow(roomDatabase, strArr, z);
    }

    @kotlin.Deprecated(message = "Replaced by equivalent API in InvalidationTracker.", replaceWith = @kotlin.ReplaceWith(expression = "this.invalidationTracker.createFlow(*tables)", imports = {}))
    public static final kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> invalidationTrackerFlow(androidx.room.RoomDatabase roomDatabase, java.lang.String[] strArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return roomDatabase.getInvalidationTracker().createFlow((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), z);
    }

    public static final <R> java.lang.Object compatTransactionCoroutineExecute(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        if (roomDatabase.inCompatibilityMode() && roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) {
            return function1.invoke(continuation);
        }
        if (continuation.getGetHighSpeedVideoSizes().get(androidx.room.RoomExternalOperationElement.INSTANCE) == null) {
            return function1.invoke(continuation);
        }
        return androidx.room.RoomDatabaseKt.withTransactionContext(roomDatabase, function1, continuation);
    }

    private static final <R> java.lang.Object getHighSpeedVideoFpsRanges(final androidx.room.RoomDatabase roomDatabase, final kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            roomDatabase.getTransactionExecutor().execute(new java.lang.Runnable() { // from class: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", i = {}, l = {2087}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    int Camera2StreamConfigurationMap;
                    final /* synthetic */ androidx.room.RoomDatabase getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRanges;
                    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<R> getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.Continuation continuation;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.Camera2StreamConfigurationMap;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.coroutines.CoroutineContext.Element element = ((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor).getCoroutineContext().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                            kotlin.coroutines.CoroutineContext highSpeedVideoFpsRangesFor = androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.coroutines.ContinuationInterceptor) element);
                            kotlin.coroutines.Continuation continuation2 = this.getHighSpeedVideoSizes;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            this.getHighSpeedVideoFpsRangesFor = continuation2;
                            this.Camera2StreamConfigurationMap = 1;
                            obj = kotlinx.coroutines.BuildersKt.withContext(highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            continuation = continuation2;
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            continuation = (kotlin.coroutines.Continuation) this.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        continuation.resumeWith(kotlin.Result.m23436constructorimpl(obj));
                        return kotlin.Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1.AnonymousClass1 anonymousClass1 = new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
                        return anonymousClass1;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(androidx.room.RoomDatabase roomDatabase, kotlinx.coroutines.CancellableContinuation<? super R> cancellableContinuation, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
                        this.getHighSpeedVideoSizes = cancellableContinuation;
                        this.getHighSpeedVideoFpsRanges = function2;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        kotlinx.coroutines.BuildersKt.runBlocking(cancellableContinuationImpl2.getGetHighSpeedVideoSizes().minusKey(kotlin.coroutines.ContinuationInterceptor.INSTANCE), new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1.AnonymousClass1(roomDatabase, cancellableContinuationImpl2, function2, null));
                    } catch (java.lang.Throwable th) {
                        cancellableContinuationImpl2.cancel(th);
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e) {
            cancellableContinuationImpl2.cancel(new java.lang.IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor(androidx.room.RoomDatabase roomDatabase, kotlin.coroutines.ContinuationInterceptor continuationInterceptor) {
        kotlin.coroutines.CoroutineContext plus = continuationInterceptor.plus(new androidx.room.TransactionElement(continuationInterceptor));
        return plus.plus(kotlinx.coroutines.ThreadContextElementKt.asContextElement(roomDatabase.getSuspendingTransactionContext(), plus));
    }
}
