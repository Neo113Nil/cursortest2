package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u001d\u0010\t\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\b\bH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lapp/cash/sqldelight/TransactionWithReturn;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/TransactionCallbacks;", "returnValue", "", "rollback", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransactionWithReturn<R> extends app.cash.sqldelight.TransactionCallbacks {
    java.lang.Void rollback(R returnValue);

    <R> R transaction(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.TransactionWithReturn<R>, ? extends R> body);
}
