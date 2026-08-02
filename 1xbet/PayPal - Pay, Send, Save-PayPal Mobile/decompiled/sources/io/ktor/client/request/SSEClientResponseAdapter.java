package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/request/SSEClientResponseAdapter;", "Lio/ktor/client/request/ResponseAdapter;", "<init>", "()V", "Lio/ktor/client/request/HttpRequestData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/utils/io/ByteReadChannel;", "responseBody", "Lio/ktor/http/content/OutgoingContent;", "outgoingContent", "Lkotlin/coroutines/CoroutineContext;", "callContext", "", "adapt", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/http/HttpStatusCode;Lio/ktor/http/Headers;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SSEClientResponseAdapter implements io.ktor.client.request.ResponseAdapter {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4 != null ? r4.withoutParameters() : null, io.ktor.http.ContentType.Text.INSTANCE.getEventStream()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        return new io.ktor.client.plugins.sse.DefaultClientSSESession((io.ktor.client.plugins.sse.SSEClientContent) r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, io.ktor.http.HttpStatusCode.INSTANCE.getNoContent()) != false) goto L19;
     */
    @Override // io.ktor.client.request.ResponseAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object adapt(io.ktor.client.request.HttpRequestData data, io.ktor.http.HttpStatusCode status, io.ktor.http.Headers headers, io.ktor.utils.io.ByteReadChannel responseBody, io.ktor.http.content.OutgoingContent outgoingContent, kotlin.coroutines.CoroutineContext callContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBody, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callContext, "");
        java.lang.String str = headers.get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        io.ktor.http.ContentType parse = str != null ? io.ktor.http.ContentType.INSTANCE.parse(str) : null;
        if (io.ktor.client.request.HttpRequestKt.isSseRequest(data) && !io.ktor.client.request.HttpRequestKt.isSseReconnectionRequest(data)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
            }
        }
        return null;
    }
}
