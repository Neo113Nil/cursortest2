package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/http/Headers;", "headers", "Lkotlin/Function1;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/ExtensionFunctionType;", "content", "replaceResponse", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/http/Headers;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/call/HttpClientCall;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DelegatedCallKt {
    public static /* synthetic */ io.ktor.client.call.HttpClientCall replaceResponse$default(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.http.Headers headers, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            headers = httpClientCall.getResponse().getHeaders();
        }
        return replaceResponse(httpClientCall, headers, function1);
    }

    public static final io.ktor.client.call.HttpClientCall replaceResponse(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.http.Headers headers, kotlin.jvm.functions.Function1<? super io.ktor.client.statement.HttpResponse, ? extends io.ktor.utils.io.ByteReadChannel> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new io.ktor.client.call.DelegatedCall(httpClientCall.getClient(), httpClientCall, function1, headers);
    }
}
