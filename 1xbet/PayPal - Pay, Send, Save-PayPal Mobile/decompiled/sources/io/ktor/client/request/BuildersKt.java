package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0007\u0010\u0005\u001a-\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0004\u0010\f\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0007\u0010\f\u001a7\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0004\u0010\u000f\u001a7\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0007\u0010\u000f\u001a7\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0004\u0010\u0012\u001a7\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0007\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0013\u0010\u0005\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0014\u0010\u0005\u001a\u001c\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0015\u0010\u0005\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0016\u0010\u0005\u001a\u001c\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0017\u0010\u0005\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0018\u0010\u0005\u001a\u001c\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0019\u0010\u0005\u001a\u001c\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001a\u0010\u0005\u001a\u001c\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001b\u0010\u0005\u001a\u001c\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001c\u0010\u0005\u001a\u001c\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001d\u0010\u0005\u001a\u001c\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001e\u0010\u0005\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001f\u0010\u0005\u001a\u001c\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b \u0010\u0005\u001a-\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0013\u0010\f\u001a-\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0014\u0010\f\u001a-\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0015\u0010\f\u001a-\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0016\u0010\f\u001a-\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0017\u0010\f\u001a-\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0018\u0010\f\u001a-\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0019\u0010\f\u001a-\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001a\u0010\f\u001a-\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001b\u0010\f\u001a-\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001c\u0010\f\u001a-\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001d\u0010\f\u001a-\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001e\u0010\f\u001a-\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001f\u0010\f\u001a-\u0010 \u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b \u0010\f\u001a&\u0010\u0004\u001a\u00020\u00012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¢\u0006\u0004\b\u0004\u0010!\u001a7\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0013\u0010\u000f\u001a7\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0014\u0010\u000f\u001a7\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0015\u0010\u000f\u001a7\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0016\u0010\u000f\u001a7\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0017\u0010\u000f\u001a7\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0018\u0010\u000f\u001a7\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u0019\u0010\u000f\u001a7\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001a\u0010\u000f\u001a7\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001b\u0010\u000f\u001a7\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001c\u0010\u000f\u001a7\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001d\u0010\u000f\u001a7\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001e\u0010\u000f\u001a7\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b\u001f\u0010\u000f\u001a7\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086H¢\u0006\u0004\b \u0010\u000f"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/statement/HttpResponse;", "request", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/Url;", "url", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "post", "put", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "options", "patch", "head", "prepareGet", "preparePost", "preparePut", "prepareDelete", "prepareOptions", "preparePatch", "prepareHead", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuildersKt {
    public static /* synthetic */ java.lang.Object request$default(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        }
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object request(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareRequest$default(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        }
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareRequest(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object request(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareRequest(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object request$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$request$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareRequest$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$prepareRequest$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object request$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$request$7
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareRequest$default(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$prepareRequest$7
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object get(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object post(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object put(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object delete(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object options(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object patch(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object head(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareGet(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePost(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePut(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareDelete(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareOptions(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePatch(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareHead(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object get(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object post(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object put(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object delete(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object options(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object patch(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object head(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareGet(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePost(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePut(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareDelete(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareOptions(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePatch(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareHead(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final io.ktor.client.request.HttpRequestBuilder request(kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        return httpRequestBuilder;
    }

    public static /* synthetic */ java.lang.Object get$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$get$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object post$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$post$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object put$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$put$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object delete$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$delete$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object options$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$options$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object patch$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$patch$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object head$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$head$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static /* synthetic */ java.lang.Object prepareGet$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$prepareGet$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object preparePost$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$preparePost$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object preparePut$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$preparePut$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object prepareDelete$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$prepareDelete$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object prepareOptions$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$prepareOptions$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object preparePatch$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$preparePatch$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ java.lang.Object prepareHead$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>() { // from class: io.ktor.client.request.BuildersKt$prepareHead$4
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    invoke2(httpRequestBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
                }
            };
        }
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object request(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareRequest(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object request(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareRequest(io.ktor.client.HttpClient httpClient, io.ktor.http.Url url, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.BuildersWithUrlKt.url(httpRequestBuilder, url);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object get(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object post(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object put(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object delete(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object options(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object patch(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object head(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final java.lang.Object prepareGet(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePost(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePut(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareDelete(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareOptions(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getOptions());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object preparePatch(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPatch());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final java.lang.Object prepareHead(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement> continuation) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
        function1.invoke(httpRequestBuilder);
        return new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
    }
}
