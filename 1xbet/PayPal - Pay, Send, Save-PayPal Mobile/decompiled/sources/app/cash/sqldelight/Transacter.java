package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0010J2\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H&¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0007H&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lapp/cash/sqldelight/Transacter;", "Lapp/cash/sqldelight/TransacterBase;", "", "noEnclosing", "Lkotlin/Function1;", "Lapp/cash/sqldelight/TransactionWithoutReturn;", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(ZLkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/TransactionWithReturn;", "bodyWithReturn", "transactionWithResult", "(ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Transaction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Transacter extends app.cash.sqldelight.TransacterBase {
    void transaction(boolean noEnclosing, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.TransactionWithoutReturn, kotlin.Unit> body);

    <R> R transactionWithResult(boolean noEnclosing, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.TransactionWithReturn<R>, ? extends R> bodyWithReturn);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object transactionWithResult$default(app.cash.sqldelight.Transacter transacter, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transactionWithResult");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return transacter.transactionWithResult(z, function1);
        }

        public static /* synthetic */ void transaction$default(app.cash.sqldelight.Transacter transacter, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transaction");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            transacter.transaction(z, function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0011\u001a\u00020\u0010H$¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00108\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00008%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040&8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040&8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0 8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\"\u0010\u0011\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R$\u00103\u001a\u0004\u0018\u0001028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108"}, d2 = {"Lapp/cash/sqldelight/Transacter$Transaction;", "Lapp/cash/sqldelight/TransactionCallbacks;", "<init>", "()V", "Lkotlin/Function0;", "", "function", "afterCommit", "(Lkotlin/jvm/functions/Function0;)V", "afterRollback", "checkThreadConfinement$runtime", "enclosingTransaction$runtime", "()Lapp/cash/sqldelight/Transacter$Transaction;", "Lapp/cash/sqldelight/db/QueryResult;", "endTransaction$runtime", "()Lapp/cash/sqldelight/db/QueryResult;", "", "successful", "endTransaction", "(Z)Lapp/cash/sqldelight/db/QueryResult;", "childrenSuccessful", "Z", "getChildrenSuccessful$runtime", "()Z", "setChildrenSuccessful$runtime", "(Z)V", "getEnclosingTransaction", "enclosingTransaction", "", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRangesFor", "", "", "pendingTables", "Ljava/util/Set;", "getPendingTables$runtime", "()Ljava/util/Set;", "", "postCommitHooks", "Ljava/util/List;", "getPostCommitHooks$runtime", "()Ljava/util/List;", "postRollbackHooks", "getPostRollbackHooks$runtime", "", "registeredQueries", "getRegisteredQueries$runtime", "getSuccessful$runtime", "setSuccessful$runtime", "Lapp/cash/sqldelight/TransacterBase;", "transacter", "Lapp/cash/sqldelight/TransacterBase;", "getTransacter$runtime", "()Lapp/cash/sqldelight/TransacterBase;", "setTransacter$runtime", "(Lapp/cash/sqldelight/TransacterBase;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Transaction implements app.cash.sqldelight.TransactionCallbacks {
        private boolean successful;
        private app.cash.sqldelight.TransacterBase transacter;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final long getHighSpeedVideoFpsRangesFor = app.cash.sqldelight.internal.CurrentThreadIdKt.currentThreadId();
        private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> postCommitHooks = new java.util.ArrayList();
        private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> postRollbackHooks = new java.util.ArrayList();
        private final java.util.Set<java.lang.Integer> registeredQueries = new java.util.LinkedHashSet();
        private final java.util.Set<java.lang.String> pendingTables = new java.util.LinkedHashSet();
        private boolean childrenSuccessful = true;

        protected abstract app.cash.sqldelight.db.QueryResult<kotlin.Unit> endTransaction(boolean successful);

        protected abstract app.cash.sqldelight.Transacter.Transaction getEnclosingTransaction();

        public final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> getPostCommitHooks$runtime() {
            return this.postCommitHooks;
        }

        public final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> getPostRollbackHooks$runtime() {
            return this.postRollbackHooks;
        }

        public final java.util.Set<java.lang.Integer> getRegisteredQueries$runtime() {
            return this.registeredQueries;
        }

        public final java.util.Set<java.lang.String> getPendingTables$runtime() {
            return this.pendingTables;
        }

        /* renamed from: getSuccessful$runtime, reason: from getter */
        public final boolean getSuccessful() {
            return this.successful;
        }

        public final void setSuccessful$runtime(boolean z) {
            this.successful = z;
        }

        /* renamed from: getChildrenSuccessful$runtime, reason: from getter */
        public final boolean getChildrenSuccessful() {
            return this.childrenSuccessful;
        }

        public final void setChildrenSuccessful$runtime(boolean z) {
            this.childrenSuccessful = z;
        }

        /* renamed from: getTransacter$runtime, reason: from getter */
        public final app.cash.sqldelight.TransacterBase getTransacter() {
            return this.transacter;
        }

        public final void setTransacter$runtime(app.cash.sqldelight.TransacterBase transacterBase) {
            this.transacter = transacterBase;
        }

        public final app.cash.sqldelight.Transacter.Transaction enclosingTransaction$runtime() {
            return getEnclosingTransaction();
        }

        public final app.cash.sqldelight.db.QueryResult<kotlin.Unit> endTransaction$runtime() {
            checkThreadConfinement$runtime();
            return endTransaction(this.successful && this.childrenSuccessful);
        }

        @Override // app.cash.sqldelight.TransactionCallbacks
        public void afterCommit(kotlin.jvm.functions.Function0<kotlin.Unit> function) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
            checkThreadConfinement$runtime();
            this.postCommitHooks.add(function);
        }

        @Override // app.cash.sqldelight.TransactionCallbacks
        public void afterRollback(kotlin.jvm.functions.Function0<kotlin.Unit> function) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
            checkThreadConfinement$runtime();
            this.postRollbackHooks.add(function);
        }

        public final void checkThreadConfinement$runtime() {
            if (this.getHighSpeedVideoFpsRangesFor != app.cash.sqldelight.internal.CurrentThreadIdKt.currentThreadId()) {
                throw new java.lang.IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.".toString());
            }
        }
    }
}
