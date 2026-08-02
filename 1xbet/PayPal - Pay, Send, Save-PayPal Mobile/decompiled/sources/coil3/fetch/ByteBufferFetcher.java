package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcoil3/fetch/ByteBufferFetcher;", "Lcoil3/fetch/Fetcher;", "Ljava/nio/ByteBuffer;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "<init>", "(Ljava/nio/ByteBuffer;Lcoil3/request/Options;)V", "Lcoil3/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ljava/nio/ByteBuffer;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcoil3/request/Options;", "getHighSpeedVideoFpsRanges", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteBufferFetcher implements coil3.fetch.Fetcher {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.nio.ByteBuffer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.view.Options getHighSpeedVideoFpsRanges;

    public ByteBufferFetcher(java.nio.ByteBuffer byteBuffer, coil3.view.Options options) {
        this.Camera2StreamConfigurationMap = byteBuffer;
        this.getHighSpeedVideoFpsRanges = options;
    }

    @Override // coil3.fetch.Fetcher
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        return new coil3.fetch.SourceFetchResult(coil3.graphics.ImageSourceKt.ImageSource(okio.Okio.buffer(coil3.fetch.ByteBufferFetcherKt.asSource(this.Camera2StreamConfigurationMap)), this.getHighSpeedVideoFpsRanges.getFileSystem(), new coil3.graphics.ByteBufferMetadata(this.Camera2StreamConfigurationMap)), null, coil3.graphics.DataSource.MEMORY);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/fetch/ByteBufferFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Ljava/nio/ByteBuffer;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/fetch/Fetcher;", "create", "(Ljava/nio/ByteBuffer;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.fetch.Fetcher.Factory<java.nio.ByteBuffer> {
        @Override // coil3.fetch.Fetcher.Factory
        public final coil3.fetch.Fetcher create(java.nio.ByteBuffer data, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            return new coil3.fetch.ByteBufferFetcher(data, options);
        }
    }
}
