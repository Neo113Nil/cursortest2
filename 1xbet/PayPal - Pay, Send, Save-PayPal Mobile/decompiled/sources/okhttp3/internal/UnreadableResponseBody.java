package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lokhttp3/internal/UnreadableResponseBody;", "Lokhttp3/ResponseBody;", "Lokio/Source;", "Lokhttp3/MediaType;", "mediaType", "", "contentLength", "<init>", "(Lokhttp3/MediaType;J)V", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "()J", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "close", "()V", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/MediaType;", "Camera2StreamConfigurationMap", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnreadableResponseBody extends okhttp3.ResponseBody implements okio.Source {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final okhttp3.MediaType getHighSpeedVideoFpsRangesFor;

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public UnreadableResponseBody(okhttp3.MediaType mediaType, long j) {
        this.getHighSpeedVideoFpsRangesFor = mediaType;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType, reason: from getter */
    public final okhttp3.MediaType getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public final long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final okio.BufferedSource getGetHighResolutionOutputSizeshNQ4ISI() {
        return okio.Okio.buffer(this);
    }

    @Override // okio.Source
    public final long read(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        throw new java.lang.IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final okio.Timeout getCamera2StreamConfigurationMap() {
        return okio.Timeout.NONE;
    }
}
