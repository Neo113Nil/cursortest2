package androidx.room;

/* compiled from: CoroutinesRoom.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "room-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CoroutinesRoom {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.CoroutinesRoom.Companion INSTANCE = new androidx.room.CoroutinesRoom.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final <R> kotlinx.coroutines.flow.Flow<R> createFlow(androidx.room.RoomDatabase roomDatabase, boolean z, java.lang.String[] strArr, java.util.concurrent.Callable<R> callable) {
        return INSTANCE.createFlow(roomDatabase, z, strArr, callable);
    }

    @kotlin.jvm.JvmStatic
    public static final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, cancellationSignal, callable, continuation);
    }

    @kotlin.jvm.JvmStatic
    public static final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, callable, continuation);
    }

    private CoroutinesRoom() {
    }

    /* compiled from: CoroutinesRoom.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\r\u0012\t\u0012\u0007H\u0005¢\u0006\u0002\b\u00060\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010J=\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J5\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "()V", "createFlow", "Lkotlinx/coroutines/flow/Flow;", "R", "Lkotlin/jvm/JvmSuppressWildcards;", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, "Landroidx/room/RoomDatabase;", "inTransaction", "", "tableNames", "", "", "callable", "Ljava/util/concurrent/Callable;", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/Flow;", "execute", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
            kotlinx.coroutines.CoroutineDispatcher transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            androidx.room.TransactionElement transactionElement = (androidx.room.TransactionElement) continuation.get$context().get(androidx.room.TransactionElement.INSTANCE);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                transactionDispatcher = z ? androidx.room.CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : androidx.room.CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return kotlinx.coroutines.BuildersKt.withContext(transactionDispatcher, new androidx.room.CoroutinesRoom$Companion$execute$2(callable, null), continuation);
        }

        @kotlin.jvm.JvmStatic
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase roomDatabase, boolean z, final android.os.CancellationSignal cancellationSignal, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super R> continuation) {
            kotlinx.coroutines.CoroutineDispatcher transactionDispatcher;
            final kotlinx.coroutines.Job launch$default;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            androidx.room.TransactionElement transactionElement = (androidx.room.TransactionElement) continuation.get$context().get(androidx.room.TransactionElement.INSTANCE);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                transactionDispatcher = z ? androidx.room.CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : androidx.room.CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, transactionDispatcher, null, new androidx.room.CoroutinesRoom$Companion$execute$4$job$1(callable, cancellableContinuationImpl2, null), 2, null);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal);
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(launch$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            });
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @kotlin.jvm.JvmStatic
        public final <R> kotlinx.coroutines.flow.Flow<R> createFlow(androidx.room.RoomDatabase db, boolean inTransaction, java.lang.String[] tableNames, java.util.concurrent.Callable<R> callable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "callable");
            return kotlinx.coroutines.flow.FlowKt.flow(new androidx.room.CoroutinesRoom$Companion$createFlow$1(inTransaction, db, tableNames, callable, null));
        }
    }
}
