package com.izettle.android.auth.okhttp;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016"}, d2 = {"Lcom/izettle/android/auth/okhttp/InputStreamRequestBody;", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Ljava/io/InputStream;", "inputStream", "", "contentLength", "<init>", "(Lokhttp3/MediaType;Ljava/io/InputStream;J)V", "()J", "()Lokhttp3/MediaType;", "", "isOneShot", "()Z", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "J", "Lokhttp3/MediaType;", "Ljava/io/InputStream;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputStreamRequestBody extends okhttp3.RequestBody {
    private final long contentLength;
    private final okhttp3.MediaType contentType;
    private final java.io.InputStream inputStream;

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    public InputStreamRequestBody(okhttp3.MediaType mediaType, java.io.InputStream inputStream, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        this.contentType = mediaType;
        this.inputStream = inputStream;
        this.contentLength = j;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentLength, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public final okhttp3.MediaType getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.BufferedSink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        okio.Source source = null;
        try {
            source = okio.Okio.source(this.inputStream);
            sink.writeAll(source);
        } finally {
            if (source != null) {
                com.izettle.android.auth.okhttp.InputStreamRequstBodyKt.closeQuietly(source);
            }
        }
    }
}
