package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcoil3/fetch/ContentUriFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Lcoil3/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isContactPhotoUri$coil_core", "(Lcoil3/Uri;)Z", "isMusicThumbnailUri$coil_core", "Camera2StreamConfigurationMap", "Lcoil3/Uri;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcoil3/request/Options;", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentUriFetcher implements coil3.fetch.Fetcher {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final coil3.Uri getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final coil3.view.Options Camera2StreamConfigurationMap;

    public ContentUriFetcher(coil3.Uri uri, coil3.view.Options options) {
        this.getHighSpeedVideoSizes = uri;
        this.Camera2StreamConfigurationMap = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    @Override // coil3.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        android.content.res.AssetFileDescriptor openAssetFileDescriptor;
        android.os.Bundle bundle;
        android.net.Uri androidUri = coil3.Uri_androidKt.toAndroidUri(this.getHighSpeedVideoSizes);
        android.content.ContentResolver contentResolver = this.Camera2StreamConfigurationMap.getContext().getContentResolver();
        if (isContactPhotoUri$coil_core(this.getHighSpeedVideoSizes)) {
            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(androidUri, "r");
            if (openAssetFileDescriptor == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find a contact photo associated with '");
                sb.append(androidUri);
                sb.append("'.");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
        } else if (android.os.Build.VERSION.SDK_INT < 29 || !isMusicThumbnailUri$coil_core(this.getHighSpeedVideoSizes)) {
            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(androidUri, "r");
            if (openAssetFileDescriptor == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to open '");
                sb2.append(androidUri);
                sb2.append("'.");
                throw new java.lang.IllegalStateException(sb2.toString().toString());
            }
        } else {
            coil3.view.Dimension width = this.Camera2StreamConfigurationMap.getSize().getWidth();
            coil3.size.Dimension.Pixels pixels = width instanceof coil3.size.Dimension.Pixels ? (coil3.size.Dimension.Pixels) width : null;
            if (pixels != null) {
                int m9807unboximpl = pixels.m9807unboximpl();
                coil3.view.Dimension height = this.Camera2StreamConfigurationMap.getSize().getHeight();
                coil3.size.Dimension.Pixels pixels2 = height instanceof coil3.size.Dimension.Pixels ? (coil3.size.Dimension.Pixels) height : null;
                if (pixels2 != null) {
                    int m9807unboximpl2 = pixels2.m9807unboximpl();
                    bundle = new android.os.Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new android.graphics.Point(m9807unboximpl, m9807unboximpl2));
                    openAssetFileDescriptor = contentResolver.openTypedAssetFile(androidUri, "image/*", bundle, null);
                    if (openAssetFileDescriptor == null) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to find a music thumbnail associated with '");
                        sb3.append(androidUri);
                        sb3.append("'.");
                        throw new java.lang.IllegalStateException(sb3.toString().toString());
                    }
                }
            }
            bundle = null;
            openAssetFileDescriptor = contentResolver.openTypedAssetFile(androidUri, "image/*", bundle, null);
            if (openAssetFileDescriptor == null) {
            }
        }
        return new coil3.fetch.SourceFetchResult(coil3.graphics.ImageSourceKt.ImageSource(okio.Okio.buffer(okio.Okio.source(openAssetFileDescriptor.createInputStream())), this.Camera2StreamConfigurationMap.getFileSystem(), new coil3.graphics.ContentMetadata(this.getHighSpeedVideoSizes, openAssetFileDescriptor)), contentResolver.getType(androidUri), coil3.graphics.DataSource.DISK);
    }

    public final boolean isContactPhotoUri$coil_core(coil3.Uri data) {
        return kotlin.jvm.internal.Intrinsics.areEqual(data.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.lastOrNull((java.util.List) coil3.UriKt.getPathSegments(data)), "display_photo");
    }

    public final boolean isMusicThumbnailUri$coil_core(coil3.Uri data) {
        java.util.List<java.lang.String> pathSegments;
        int size;
        return kotlin.jvm.internal.Intrinsics.areEqual(data.getAuthority(), io.ktor.http.LinkHeader.Parameters.Media) && (size = (pathSegments = coil3.UriKt.getPathSegments(data)).size()) >= 3 && kotlin.jvm.internal.Intrinsics.areEqual(pathSegments.get(size + (-3)), "audio") && kotlin.jvm.internal.Intrinsics.areEqual(pathSegments.get(size + (-2)), "albums");
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/fetch/ContentUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/fetch/Fetcher;", "create", "(Lcoil3/Uri;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.fetch.Fetcher.Factory<coil3.Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final coil3.fetch.Fetcher create(coil3.Uri data, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "content")) {
                return new coil3.fetch.ContentUriFetcher(data, options);
            }
            return null;
        }
    }
}
