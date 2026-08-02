package com.paypal.oslo.feature.shaketoreport.network;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001Jt\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/network/PayPalJiraCredentialApi;", "", "", "paypalConsumerContext", "Lokhttp3/RequestBody;", "title", "frequency", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "employeeId", "tenant", "projectName", "Lokhttp3/MultipartBody$Part;", "screenshot", "Lretrofit2/Response;", "Lcom/paypal/oslo/feature/shaketoreport/data/response/CreateBugReportResponse;", "createBugReport", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PayPalJiraCredentialApi {
    @retrofit2.http.POST("/v1/customer/create-issue")
    @retrofit2.http.Multipart
    java.lang.Object createBugReport(@retrofit2.http.Header("X-PayPal-ConsumerApp-Context") java.lang.String str, @retrofit2.http.Part("title") okhttp3.RequestBody requestBody, @retrofit2.http.Part("frequency") okhttp3.RequestBody requestBody2, @retrofit2.http.Part("description") okhttp3.RequestBody requestBody3, @retrofit2.http.Part("employee_id") okhttp3.RequestBody requestBody4, @retrofit2.http.Part("tenant") okhttp3.RequestBody requestBody5, @retrofit2.http.Part("project_name") okhttp3.RequestBody requestBody6, @retrofit2.http.Part okhttp3.MultipartBody.Part part, kotlin.coroutines.Continuation<? super retrofit2.Response<com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object createBugReport$default(com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi payPalJiraCredentialApi, java.lang.String str, okhttp3.RequestBody requestBody, okhttp3.RequestBody requestBody2, okhttp3.RequestBody requestBody3, okhttp3.RequestBody requestBody4, okhttp3.RequestBody requestBody5, okhttp3.RequestBody requestBody6, okhttp3.MultipartBody.Part part, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return payPalJiraCredentialApi.createBugReport((i & 1) != 0 ? "{}" : str, requestBody, requestBody2, requestBody3, requestBody4, requestBody5, requestBody6, (i & 128) != 0 ? null : part, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBugReport");
    }
}
