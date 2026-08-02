package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J9\u0010\u000b\u001a\u00020\u00072'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH¦@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lapp/cash/sqldelight/SuspendingTransactionWithoutReturn;", "Lapp/cash/sqldelight/TransactionCallbacks;", "", "rollback", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transactionWithResult", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SuspendingTransactionWithoutReturn extends app.cash.sqldelight.TransactionCallbacks {
    java.lang.Void rollback();

    java.lang.Object transactionWithResult(kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithoutReturn, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
