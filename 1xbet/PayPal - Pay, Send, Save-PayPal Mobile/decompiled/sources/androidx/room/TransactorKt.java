package androidx.room;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001aI\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000f\u001aI\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u000f"}, d2 = {"Landroidx/room/PooledConnection;", "", com.datadog.trace.api.DDSpanTypes.SQL, "", "execSQL", "(Landroidx/room/PooledConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/Transactor;", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "deferredTransaction", "(Landroidx/room/Transactor;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "immediateTransaction", "exclusiveTransaction"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactorKt {
    public static final java.lang.Object execSQL(androidx.room.PooledConnection pooledConnection, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object usePrepared = pooledConnection.usePrepared(str, new kotlin.jvm.functions.Function1() { // from class: androidx.room.TransactorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.room.TransactorKt.$r8$lambda$VVj_enrVNhrquoXbSKTrpTfnIsI((androidx.database.SQLiteStatement) obj));
            }
        }, continuation);
        return usePrepared == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? usePrepared : kotlin.Unit.INSTANCE;
    }

    public static final <R> java.lang.Object deferredTransaction(androidx.room.Transactor transactor, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return transactor.withTransaction(androidx.room.Transactor.SQLiteTransactionType.DEFERRED, function2, continuation);
    }

    public static final <R> java.lang.Object immediateTransaction(androidx.room.Transactor transactor, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return transactor.withTransaction(androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE, function2, continuation);
    }

    public static final <R> java.lang.Object exclusiveTransaction(androidx.room.Transactor transactor, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return transactor.withTransaction(androidx.room.Transactor.SQLiteTransactionType.EXCLUSIVE, function2, continuation);
    }

    public static /* synthetic */ boolean $r8$lambda$VVj_enrVNhrquoXbSKTrpTfnIsI(androidx.database.SQLiteStatement sQLiteStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        return sQLiteStatement.step();
    }
}
