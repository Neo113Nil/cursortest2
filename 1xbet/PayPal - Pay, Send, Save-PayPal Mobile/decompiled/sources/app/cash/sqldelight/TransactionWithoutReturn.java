package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lapp/cash/sqldelight/TransactionWithoutReturn;", "Lapp/cash/sqldelight/TransactionCallbacks;", "", "rollback", "()Ljava/lang/Void;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transaction", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransactionWithoutReturn extends app.cash.sqldelight.TransactionCallbacks {
    java.lang.Void rollback();

    /* renamed from: transaction */
    void mo9508transaction(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.TransactionWithoutReturn, kotlin.Unit> body);
}
