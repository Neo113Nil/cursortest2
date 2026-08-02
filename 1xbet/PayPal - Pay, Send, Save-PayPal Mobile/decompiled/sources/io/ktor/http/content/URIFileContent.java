package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lio/ktor/http/content/URIFileContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Ljava/net/URI;", "uri", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "contentLength", "<init>", "(Ljava/net/URI;Lio/ktor/http/ContentType;Ljava/lang/Long;)V", "Ljava/net/URL;", "url", "(Ljava/net/URL;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteReadChannel;", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "Ljava/net/URI;", "getUri", "()Ljava/net/URI;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class URIFileContent extends io.ktor.http.content.OutgoingContent.ReadChannelContent {
    private final java.lang.Long contentLength;
    private final io.ktor.http.ContentType contentType;
    private final java.net.URI uri;

    public final java.net.URI getUri() {
        return this.uri;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ URIFileContent(java.net.URI uri, io.ktor.http.ContentType contentType, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, contentType, (i & 4) != 0 ? null : l);
        if ((i & 2) != 0) {
            io.ktor.http.ContentType.Companion companion = io.ktor.http.ContentType.INSTANCE;
            java.lang.String path = uri.getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            contentType = io.ktor.http.FileContentTypeKt.defaultForFilePath(companion, path);
        }
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return this.contentLength;
    }

    public URIFileContent(java.net.URI uri, io.ktor.http.ContentType contentType, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        this.uri = uri;
        this.contentType = contentType;
        this.contentLength = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ URIFileContent(java.net.URL url, io.ktor.http.ContentType contentType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(url, contentType);
        if ((i & 2) != 0) {
            io.ktor.http.ContentType.Companion companion = io.ktor.http.ContentType.INSTANCE;
            java.lang.String path = url.getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            contentType = io.ktor.http.FileContentTypeKt.defaultForFilePath(companion, path);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public URIFileContent(java.net.URL url, io.ktor.http.ContentType contentType) {
        this(r2, contentType, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        java.net.URI uri = url.toURI();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "");
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* renamed from: readFrom */
    public final io.ktor.utils.io.ByteReadChannel getGetHighSpeedVideoFpsRanges() {
        java.io.InputStream openStream = this.uri.toURL().openStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openStream, "");
        return io.ktor.utils.io.jvm.javaio.ReadingKt.toByteReadChannel$default(openStream, null, io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool(), 1, null);
    }
}
