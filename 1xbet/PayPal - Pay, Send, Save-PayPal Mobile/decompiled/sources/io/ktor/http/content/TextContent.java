package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lio/ktor/http/content/TextContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "", "text", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lio/ktor/http/HttpStatusCode;", "status", "<init>", "(Ljava/lang/String;Lio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;)V", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "()[B", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Camera2StreamConfigurationMap", "[B", "getHighSpeedVideoFpsRangesFor", "", "getContentLength", "()Ljava/lang/Long;", "contentLength"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextContent extends io.ktor.http.content.OutgoingContent.ByteArrayContent {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final io.ktor.http.ContentType contentType;
    private final io.ktor.http.HttpStatusCode status;
    private final java.lang.String text;

    public /* synthetic */ TextContent(java.lang.String str, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, contentType, (i & 4) != 0 ? null : httpStatusCode);
    }

    public final java.lang.String getText() {
        return this.text;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.status;
    }

    public TextContent(java.lang.String str, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        this.text = str;
        this.contentType = contentType;
        this.status = httpStatusCode;
        java.nio.charset.Charset charset = io.ktor.http.ContentTypesKt.charset(getContentType());
        this.getHighSpeedVideoFpsRangesFor = io.ktor.utils.io.core.StringsKt.toByteArray(str, charset == null ? kotlin.text.Charsets.UTF_8 : charset);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.length);
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* renamed from: bytes, reason: from getter */
    public final byte[] getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextContent[");
        sb.append(getContentType());
        sb.append("] \"");
        sb.append(kotlin.text.StringsKt.take(this.text, 30));
        sb.append('\"');
        return sb.toString();
    }
}
