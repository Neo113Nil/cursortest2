package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u0010JE\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0017\u001a\u00020\t2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lapp/cash/sqldelight/SuspendingTransactionWrapper;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/SuspendingTransactionWithoutReturn;", "Lapp/cash/sqldelight/SuspendingTransactionWithReturn;", "Lapp/cash/sqldelight/Transacter$Transaction;", "p0", "<init>", "(Lapp/cash/sqldelight/Transacter$Transaction;)V", "Lkotlin/Function0;", "", "afterCommit", "(Lkotlin/jvm/functions/Function0;)V", "afterRollback", "", "rollback", "()Ljava/lang/Void;", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "transaction", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transactionWithResult", "getHighResolutionOutputSizeshNQ4ISI", "Lapp/cash/sqldelight/Transacter$Transaction;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SuspendingTransactionWrapper<R> implements app.cash.sqldelight.SuspendingTransactionWithoutReturn, app.cash.sqldelight.SuspendingTransactionWithReturn<R> {
    private final app.cash.sqldelight.Transacter.Transaction getHighResolutionOutputSizeshNQ4ISI;

    public SuspendingTransactionWrapper(app.cash.sqldelight.Transacter.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        this.getHighResolutionOutputSizeshNQ4ISI = transaction;
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithoutReturn
    public final java.lang.Void rollback() {
        this.getHighResolutionOutputSizeshNQ4ISI.checkThreadConfinement$runtime();
        throw new app.cash.sqldelight.RollbackException(null, 1, null);
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithReturn
    public final java.lang.Void rollback(R p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.checkThreadConfinement$runtime();
        throw new app.cash.sqldelight.RollbackException(p0);
    }

    @Override // app.cash.sqldelight.TransactionCallbacks
    public final void afterCommit(kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.afterCommit(p0);
    }

    @Override // app.cash.sqldelight.TransactionCallbacks
    public final void afterRollback(kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.afterRollback(p0);
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithoutReturn
    public final java.lang.Object transactionWithResult(kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithoutReturn, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        app.cash.sqldelight.TransacterBase transacter = this.getHighResolutionOutputSizeshNQ4ISI.getTransacter();
        kotlin.jvm.internal.Intrinsics.checkNotNull(transacter, "");
        java.lang.Object transaction = ((app.cash.sqldelight.SuspendingTransacter) transacter).transaction(false, function2, continuation);
        return transaction == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transaction : kotlin.Unit.INSTANCE;
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithReturn
    public final <R> java.lang.Object transaction(kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithReturn<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        app.cash.sqldelight.TransacterBase transacter = this.getHighResolutionOutputSizeshNQ4ISI.getTransacter();
        kotlin.jvm.internal.Intrinsics.checkNotNull(transacter, "");
        return ((app.cash.sqldelight.SuspendingTransacter) transacter).transactionWithResult(false, function2, continuation);
    }
}
