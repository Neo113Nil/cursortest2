package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "Lio/ktor/http/content/OutgoingContent;", "content", "<init>", "(Lio/ktor/http/content/OutgoingContent;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsupportedContentTypeException extends java.lang.IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UnsupportedContentTypeException(io.ktor.http.content.OutgoingContent outgoingContent) {
        super(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to write body: ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(outgoingContent.getClass()));
    }
}
