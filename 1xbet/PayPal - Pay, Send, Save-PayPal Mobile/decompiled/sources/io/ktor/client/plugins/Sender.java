package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/client/plugins/Sender;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "requestBuilder", "Lio/ktor/client/call/HttpClientCall;", "execute", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Sender {
    java.lang.Object execute(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation);
}
