package com.paypal.oslo.feature.revolvingcreditservicing.data.api;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/api/StatementService;", "", "", "accountId", "statementId", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getStatementDetailsPDF", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface StatementService {
    @retrofit2.http.Headers({"Accept: application/pdf", "Content-Type: application/pdf"})
    @retrofit2.http.Streaming
    @retrofit2.http.GET("v2/credit/accounts/{id}/statements/{statement_id}")
    java.lang.Object getStatementDetailsPDF(@retrofit2.http.Path("id") java.lang.String str, @retrofit2.http.Path("statement_id") java.lang.String str2, kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> continuation);
}
