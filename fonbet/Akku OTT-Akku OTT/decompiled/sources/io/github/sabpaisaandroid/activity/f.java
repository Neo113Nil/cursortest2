package io.github.sabpaisaandroid.activity;

import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import io.github.sabpaisaandroid.models.TransactionResponsesModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class f extends Lambda implements Function1<TransactionResponsesModel, Unit> {
    public final /* synthetic */ WebViewActivityLite a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WebViewActivityLite webViewActivityLite) {
        super(1);
        this.a = webViewActivityLite;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TransactionResponsesModel transactionResponsesModel) {
        WebViewActivityLite.Companion companion = WebViewActivityLite.INSTANCE;
        this.a.y();
        return Unit.INSTANCE;
    }
}
