package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012-\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0002\b\nH¦@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lapp/cash/sqldelight/SuspendingTransactionWithReturn;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/TransactionCallbacks;", "returnValue", "", "rollback", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SuspendingTransactionWithReturn<R> extends app.cash.sqldelight.TransactionCallbacks {
    java.lang.Void rollback(R returnValue);

    <R> java.lang.Object transaction(kotlin.jvm.functions.Function2<? super app.cash.sqldelight.SuspendingTransactionWithReturn<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation);
}
