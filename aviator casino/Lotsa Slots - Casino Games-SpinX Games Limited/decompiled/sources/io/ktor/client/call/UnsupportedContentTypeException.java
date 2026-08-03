package io.ktor.client.call;

/* compiled from: utils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/http/content/OutgoingContent;", "content", "<init>", "(Lio/ktor/http/content/OutgoingContent;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsupportedContentTypeException extends java.lang.IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedContentTypeException(io.ktor.http.content.OutgoingContent content) {
        super("Failed to write body: " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(content.getClass()));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
    }
}
