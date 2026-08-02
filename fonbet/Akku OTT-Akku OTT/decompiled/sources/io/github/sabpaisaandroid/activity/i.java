package io.github.sabpaisaandroid.activity;

import io.github.sabpaisaandroid.interfaces.IPaymentSuccessCallBack;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class i extends Lambda implements Function1<TransactionResponsesModel, Unit> {
    public final /* synthetic */ TransactionResponsesModel a;
    public final /* synthetic */ WebViewActivityLite b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TransactionResponsesModel transactionResponsesModel, WebViewActivityLite webViewActivityLite) {
        super(1);
        this.a = transactionResponsesModel;
        this.b = webViewActivityLite;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TransactionResponsesModel transactionResponsesModel) {
        IPaymentSuccessCallBack<TransactionResponsesModel> iPaymentSuccessCallBack = WebViewActivityLite.INSTANCE.getIPaymentSuccessCallBack();
        if (iPaymentSuccessCallBack != null) {
            iPaymentSuccessCallBack.onPaymentFail(this.a);
        }
        this.b.finish();
        return Unit.INSTANCE;
    }
}
