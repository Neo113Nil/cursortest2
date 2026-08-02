package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/internal/http/GzipRequestBody;", "Lokhttp3/RequestBody;", "delegate", "<init>", "(Lokhttp3/RequestBody;)V", "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "", "isOneShot", "()Z", "Lokhttp3/RequestBody;", "getDelegate", "()Lokhttp3/RequestBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GzipRequestBody extends okhttp3.RequestBody {
    private final okhttp3.RequestBody delegate;

    @Override // okhttp3.RequestBody
    /* renamed from: contentLength */
    public final long getContentLength() {
        return -1L;
    }

    public GzipRequestBody(okhttp3.RequestBody requestBody) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBody, "");
        this.delegate = requestBody;
    }

    public final okhttp3.RequestBody getDelegate() {
        return this.delegate;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final okhttp3.MediaType getContentType() {
        return this.delegate.getContentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.BufferedSink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        okio.BufferedSink buffer = okio.Okio.buffer(new okio.GzipSink(sink));
        try {
            this.delegate.writeTo(buffer);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(buffer, null);
        } finally {
        }
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return this.delegate.isOneShot();
    }
}
