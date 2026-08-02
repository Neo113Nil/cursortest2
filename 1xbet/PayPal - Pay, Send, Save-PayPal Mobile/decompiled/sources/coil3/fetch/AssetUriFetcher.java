package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/fetch/AssetUriFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Lcoil3/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/Uri;", "Camera2StreamConfigurationMap", "Lcoil3/request/Options;", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AssetUriFetcher implements coil3.fetch.Fetcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final coil3.view.Options getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.Uri Camera2StreamConfigurationMap;

    public AssetUriFetcher(coil3.Uri uri, coil3.view.Options options) {
        this.Camera2StreamConfigurationMap = uri;
        this.getHighResolutionOutputSizeshNQ4ISI = options;
    }

    @Override // coil3.fetch.Fetcher
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.drop(coil3.UriKt.getPathSegments(this.Camera2StreamConfigurationMap), 1), androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, null, null, 0, null, null, 62, null);
        return new coil3.fetch.SourceFetchResult(coil3.graphics.ImageSourceKt.ImageSource(okio.Okio.buffer(okio.Okio.source(this.getHighResolutionOutputSizeshNQ4ISI.getContext().getAssets().open(joinToString$default))), this.getHighResolutionOutputSizeshNQ4ISI.getFileSystem(), new coil3.graphics.AssetMetadata(joinToString$default)), coil3.content.MimeTypeMap.INSTANCE.getMimeTypeFromUrl(joinToString$default), coil3.graphics.DataSource.DISK);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/fetch/AssetUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/fetch/Fetcher;", "create", "(Lcoil3/Uri;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.fetch.Fetcher.Factory<coil3.Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final coil3.fetch.Fetcher create(coil3.Uri data, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            if (coil3.content.Utils_androidKt.isAssetUri(data)) {
                return new coil3.fetch.AssetUriFetcher(data, options);
            }
            return null;
        }
    }
}
