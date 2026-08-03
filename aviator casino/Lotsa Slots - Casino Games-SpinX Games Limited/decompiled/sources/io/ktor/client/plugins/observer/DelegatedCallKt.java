package io.ktor.client.plugins.observer;

/* compiled from: DelegatedCall.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "wrapWithContent", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/utils/io/ByteReadChannel;)Lio/ktor/client/call/HttpClientCall;", "Lkotlin/Function0;", "block", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/jvm/functions/Function0;)Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/http/Headers;", "headers", "wrap", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/Headers;)Lio/ktor/client/call/HttpClientCall;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DelegatedCallKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel wrap$lambda$2(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.statement.HttpResponse replaceResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceResponse, "$this$replaceResponse");
        return byteReadChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel wrapWithContent$lambda$0(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.statement.HttpResponse replaceResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceResponse, "$this$replaceResponse");
        return byteReadChannel;
    }

    @kotlin.Deprecated(message = "Use 'replaceResponse' instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceResponse { content }", imports = {"io.ktor.client.call.replaceResponse"}))
    public static final io.ktor.client.call.HttpClientCall wrapWithContent(io.ktor.client.call.HttpClientCall httpClientCall, final io.ktor.utils.io.ByteReadChannel content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        return io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpClientCall, null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.DelegatedCallKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                io.ktor.utils.io.ByteReadChannel wrapWithContent$lambda$0;
                wrapWithContent$lambda$0 = io.ktor.client.plugins.observer.DelegatedCallKt.wrapWithContent$lambda$0(io.ktor.utils.io.ByteReadChannel.this, (io.ktor.client.statement.HttpResponse) obj);
                return wrapWithContent$lambda$0;
            }
        }, 1, null);
    }

    @kotlin.Deprecated(message = "Use 'replaceResponse' instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceResponse { block() }", imports = {"io.ktor.client.call.replaceResponse"}))
    public static final io.ktor.client.call.HttpClientCall wrapWithContent(io.ktor.client.call.HttpClientCall httpClientCall, final kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        return io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpClientCall, null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.DelegatedCallKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                io.ktor.utils.io.ByteReadChannel wrapWithContent$lambda$1;
                wrapWithContent$lambda$1 = io.ktor.client.plugins.observer.DelegatedCallKt.wrapWithContent$lambda$1(kotlin.jvm.functions.Function0.this, (io.ktor.client.statement.HttpResponse) obj);
                return wrapWithContent$lambda$1;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel wrapWithContent$lambda$1(kotlin.jvm.functions.Function0 function0, io.ktor.client.statement.HttpResponse replaceResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceResponse, "$this$replaceResponse");
        return (io.ktor.utils.io.ByteReadChannel) function0.invoke();
    }

    @kotlin.Deprecated(message = "Use 'replaceResponse' instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceResponse(headers) { content }", imports = {"io.ktor.client.call.replaceResponse"}))
    public static final io.ktor.client.call.HttpClientCall wrap(io.ktor.client.call.HttpClientCall httpClientCall, final io.ktor.utils.io.ByteReadChannel content, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        return io.ktor.client.call.DelegatedCallKt.replaceResponse(httpClientCall, headers, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.DelegatedCallKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                io.ktor.utils.io.ByteReadChannel wrap$lambda$2;
                wrap$lambda$2 = io.ktor.client.plugins.observer.DelegatedCallKt.wrap$lambda$2(io.ktor.utils.io.ByteReadChannel.this, (io.ktor.client.statement.HttpResponse) obj);
                return wrap$lambda$2;
            }
        });
    }
}
