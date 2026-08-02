package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH¦@¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022-\u0010\u000f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH¦@¢\u0006\u0004\b\u0010\u0010\f"}, d2 = {"Lapp/cash/sqldelight/SuspendingTransacter;", "Lapp/cash/sqldelight/TransacterBase;", "", "noEnclosing", "Lkotlin/Function2;", "Lapp/cash/sqldelight/SuspendingTransactionWithoutReturn;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/SuspendingTransactionWithReturn;", "bodyWithReturn", "transactionWithResult"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SuspendingTransacter extends app.cash.sqldelight.TransacterBase {
    java.lang.Object transaction(boolean z, kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithoutReturn, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    <R> java.lang.Object transactionWithResult(boolean z, kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithReturn<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object transactionWithResult$default(app.cash.sqldelight.SuspendingTransacter suspendingTransacter, boolean z, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transactionWithResult");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return suspendingTransacter.transactionWithResult(z, function2, continuation);
        }

        public static /* synthetic */ java.lang.Object transaction$default(app.cash.sqldelight.SuspendingTransacter suspendingTransacter, boolean z, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transaction");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return suspendingTransacter.transaction(z, function2, continuation);
        }
    }
}
