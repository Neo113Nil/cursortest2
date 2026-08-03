package io.ktor.client.call;

/* compiled from: DelegatedCall.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/call/DelegatedCall;", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/HttpClient;", "client", "originCall", "Lkotlin/Function1;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/ExtensionFunctionType;", "responseContent", "Lio/ktor/http/Headers;", "responseHeaders", "<init>", "(Lio/ktor/client/HttpClient;Lio/ktor/client/call/HttpClientCall;Lkotlin/jvm/functions/Function1;Lio/ktor/http/Headers;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DelegatedCall extends io.ktor.client.call.HttpClientCall {
    public /* synthetic */ DelegatedCall(io.ktor.client.HttpClient httpClient, io.ktor.client.call.HttpClientCall httpClientCall, kotlin.jvm.functions.Function1 function1, io.ktor.http.Headers headers, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, httpClientCall, function1, (i & 8) != 0 ? httpClientCall.getResponse().getHeaders() : headers);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatedCall(io.ktor.client.HttpClient client, io.ktor.client.call.HttpClientCall originCall, kotlin.jvm.functions.Function1<? super io.ktor.client.statement.HttpResponse, ? extends io.ktor.utils.io.ByteReadChannel> responseContent, io.ktor.http.Headers responseHeaders) {
        super(client);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originCall, "originCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseContent, "responseContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        io.ktor.client.call.DelegatedCall delegatedCall = this;
        setRequest(new io.ktor.client.call.DelegatedRequest(delegatedCall, originCall.getRequest()));
        setResponse(new io.ktor.client.call.DelegatedResponse(delegatedCall, originCall.getResponse(), responseContent, responseHeaders));
    }
}
