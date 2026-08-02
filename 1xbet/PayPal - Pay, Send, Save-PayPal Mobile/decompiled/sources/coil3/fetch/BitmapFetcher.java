package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcoil3/fetch/BitmapFetcher;", "Lcoil3/fetch/Fetcher;", "Landroid/graphics/Bitmap;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Landroid/graphics/Bitmap;)V", "Lcoil3/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/Bitmap;", "getHighResolutionOutputSizeshNQ4ISI", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapFetcher implements coil3.fetch.Fetcher {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;

    public BitmapFetcher(android.graphics.Bitmap bitmap) {
        this.getHighResolutionOutputSizeshNQ4ISI = bitmap;
    }

    @Override // coil3.fetch.Fetcher
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        return new coil3.fetch.ImageFetchResult(coil3.Image_androidKt.asImage$default(this.getHighResolutionOutputSizeshNQ4ISI, false, 1, null), false, coil3.graphics.DataSource.MEMORY);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcoil3/fetch/BitmapFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Landroid/graphics/Bitmap;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/fetch/Fetcher;", "create", "(Landroid/graphics/Bitmap;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.fetch.Fetcher.Factory<android.graphics.Bitmap> {
        @Override // coil3.fetch.Fetcher.Factory
        public final coil3.fetch.Fetcher create(android.graphics.Bitmap data, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            return new coil3.fetch.BitmapFetcher(data);
        }
    }
}
