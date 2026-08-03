package androidx.room;

/* compiled from: RoomDatabaseExt.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001aL\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a9\u0010\u000f\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\u00020\u00022\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"createTransactionContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/room/RoomDatabase;", "dispatcher", "Lkotlin/coroutines/ContinuationInterceptor;", "startTransactionCoroutine", "R", "context", "transactionBlock", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "block", "Lkotlin/Function1;", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RoomDatabaseKt {
    public static final <R> java.lang.Object withTransaction(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, function1, null);
        androidx.room.TransactionElement transactionElement = (androidx.room.TransactionElement) continuation.get$context().get(androidx.room.TransactionElement.INSTANCE);
        kotlin.coroutines.ContinuationInterceptor transactionDispatcher = transactionElement != null ? transactionElement.getTransactionDispatcher() : null;
        if (transactionDispatcher != null) {
            return kotlinx.coroutines.BuildersKt.withContext(transactionDispatcher, roomDatabaseKt$withTransaction$transactionBlock$1, continuation);
        }
        return startTransactionCoroutine(roomDatabase, continuation.get$context(), roomDatabaseKt$withTransaction$transactionBlock$1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.coroutines.CoroutineContext createTransactionContext(androidx.room.RoomDatabase roomDatabase, kotlin.coroutines.ContinuationInterceptor continuationInterceptor) {
        androidx.room.TransactionElement transactionElement = new androidx.room.TransactionElement(continuationInterceptor);
        return continuationInterceptor.plus(transactionElement).plus(kotlinx.coroutines.ThreadContextElementKt.asContextElement(roomDatabase.getSuspendingTransactionId(), java.lang.Integer.valueOf(java.lang.System.identityHashCode(transactionElement))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> java.lang.Object startTransactionCoroutine(final androidx.room.RoomDatabase roomDatabase, final kotlin.coroutines.CoroutineContext coroutineContext, final kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            roomDatabase.getTransactionExecutor().execute(new java.lang.Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                /* compiled from: RoomDatabaseExt.kt */
                @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<R> $continuation;
                    final /* synthetic */ androidx.room.RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transactionBlock;
                    private /* synthetic */ java.lang.Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(androidx.room.RoomDatabase roomDatabase, kotlinx.coroutines.CancellableContinuation<? super R> cancellableContinuation, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = cancellableContinuation;
                        this.$transactionBlock = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1.AnonymousClass1 anonymousClass1 = new androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1.AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.CoroutineContext createTransactionContext;
                        kotlin.coroutines.Continuation continuation;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.coroutines.CoroutineContext.Element element = ((kotlinx.coroutines.CoroutineScope) this.L$0).getCoroutineContext().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                            createTransactionContext = androidx.room.RoomDatabaseKt.createTransactionContext(this.$this_startTransactionCoroutine, (kotlin.coroutines.ContinuationInterceptor) element);
                            kotlin.coroutines.Continuation continuation2 = this.$continuation;
                            this.L$0 = continuation2;
                            this.label = 1;
                            obj = kotlinx.coroutines.BuildersKt.withContext(createTransactionContext, this.$transactionBlock, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            continuation = continuation2;
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            continuation = (kotlin.coroutines.Continuation) this.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m10798constructorimpl(obj));
                        return kotlin.Unit.INSTANCE;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        kotlinx.coroutines.BuildersKt.runBlocking(kotlin.coroutines.CoroutineContext.this.minusKey(kotlin.coroutines.ContinuationInterceptor.INSTANCE), new androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1.AnonymousClass1(roomDatabase, cancellableContinuationImpl2, function2, null));
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
}
