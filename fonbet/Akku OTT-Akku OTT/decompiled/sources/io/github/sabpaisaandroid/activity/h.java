package io.github.sabpaisaandroid.activity;

import androidx.core.app.FrameMetricsAggregator;
import io.github.sabpaisaandroid.interfaces.IPaymentSuccessCallBack;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class h extends Lambda implements Function1<TransactionResponsesModel, Unit> {
    public final /* synthetic */ TransactionResponsesModel a;
    public final /* synthetic */ WebViewActivityLite b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TransactionResponsesModel transactionResponsesModel, WebViewActivityLite webViewActivityLite) {
        super(1);
        this.a = transactionResponsesModel;
        this.b = webViewActivityLite;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TransactionResponsesModel transactionResponsesModel) {
        TransactionResponsesModel transactionResponsesModel2 = new TransactionResponsesModel(null, null, null, null, null, null, null, null, null, null, null, "FAILED", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, FrameMetricsAggregator.EVERY_DURATION, null);
        TransactionResponsesModel transactionResponsesModel3 = this.a;
        if (Intrinsics.areEqual(transactionResponsesModel3 != null ? transactionResponsesModel3.getStatus() : null, "INITIATED")) {
            transactionResponsesModel3.setStatus("FAILED");
        }
        IPaymentSuccessCallBack<TransactionResponsesModel> iPaymentSuccessCallBack = WebViewActivityLite.INSTANCE.getIPaymentSuccessCallBack();
        if (iPaymentSuccessCallBack != null) {
            if (transactionResponsesModel3 != null) {
                transactionResponsesModel2 = transactionResponsesModel3;
            }
            iPaymentSuccessCallBack.onPaymentFail(transactionResponsesModel2);
        }
        this.b.finish();
        return Unit.INSTANCE;
    }
}
