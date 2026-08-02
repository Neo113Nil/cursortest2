package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/http/content/ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lio/ktor/http/HttpStatusCode;", "status", "<init>", "([BLio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;)V", "()[B", "getHighSpeedVideoSizes", "[B", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "", "getContentLength", "()Ljava/lang/Long;", "contentLength"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteArrayContent extends io.ktor.http.content.OutgoingContent.ByteArrayContent {
    private final io.ktor.http.ContentType contentType;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final io.ktor.http.HttpStatusCode status;

    public /* synthetic */ ByteArrayContent(byte[] bArr, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? null : contentType, (i & 4) != 0 ? null : httpStatusCode);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.status;
    }

    public ByteArrayContent(byte[] bArr, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.contentType = contentType;
        this.status = httpStatusCode;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return java.lang.Long.valueOf(this.getHighSpeedVideoFpsRangesFor.length);
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* renamed from: bytes, reason: from getter */
    public final byte[] getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
