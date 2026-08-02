package io.github.sabpaisaandroid.activity;

import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.PaymentDetailsModel;
import io.github.sabpaisaandroid.models.PaymentStatusResponseModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements io.github.sabpaisaandroid.interfaces.a<PaymentStatusResponseModel> {
    public final /* synthetic */ WebViewActivityLite a;
    public final /* synthetic */ PaymentDetailsModel b;
    public final /* synthetic */ WebViewActivityLite.b c;
    public final /* synthetic */ WebViewActivityLite.c d;

    public b(WebViewActivityLite.b bVar, WebViewActivityLite.c cVar, WebViewActivityLite webViewActivityLite, PaymentDetailsModel paymentDetailsModel) {
        this.a = webViewActivityLite;
        this.b = paymentDetailsModel;
        this.c = bVar;
        this.d = cVar;
    }

    @Override // io.github.sabpaisaandroid.interfaces.a
    public final void a(PaymentStatusResponseModel paymentStatusResponseModel) {
        PaymentStatusResponseModel response = paymentStatusResponseModel;
        Intrinsics.checkNotNullParameter(response, "response");
        this.a.s(this.b, response, this.c, this.d);
    }

    public final void b(Throwable th) {
        this.a.s(this.b, null, this.c, this.d);
    }
}
