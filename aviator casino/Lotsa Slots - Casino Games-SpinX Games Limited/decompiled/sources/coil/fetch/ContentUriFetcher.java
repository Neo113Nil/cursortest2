package coil.fetch;

/* compiled from: ContentUriFetcher.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u000fJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcoil/fetch/ContentUriFetcher;", "Lcoil/fetch/Fetcher;", "data", "Landroid/net/Uri;", "options", "Lcoil/request/Options;", "<init>", "(Landroid/net/Uri;Lcoil/request/Options;)V", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isContactPhotoUri", "", "isContactPhotoUri$coil_base_release", "isMusicThumbnailUri", "isMusicThumbnailUri$coil_base_release", "newMusicThumbnailSizeOptions", "Landroid/os/Bundle;", "Factory", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentUriFetcher implements coil.fetch.Fetcher {
    private final android.net.Uri data;
    private final coil.request.Options options;

    public ContentUriFetcher(android.net.Uri uri, coil.request.Options options) {
        this.data = uri;
        this.options = options;
    }

    @Override // coil.fetch.Fetcher
    public java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> continuation) {
        java.io.FileInputStream openInputStream;
        java.io.FileInputStream createInputStream;
        android.content.ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (isContactPhotoUri$coil_base_release(this.data)) {
            android.content.res.AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.data, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            createInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (createInputStream == null) {
                throw new java.lang.IllegalStateException(("Unable to find a contact photo associated with '" + this.data + "'.").toString());
            }
            openInputStream = createInputStream;
        } else if (android.os.Build.VERSION.SDK_INT >= 29 && isMusicThumbnailUri$coil_base_release(this.data)) {
            android.content.res.AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(this.data, "image/*", newMusicThumbnailSizeOptions(), null);
            createInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
            if (createInputStream == null) {
                throw new java.lang.IllegalStateException(("Unable to find a music thumbnail associated with '" + this.data + "'.").toString());
            }
            openInputStream = createInputStream;
        } else {
            openInputStream = contentResolver.openInputStream(this.data);
            if (openInputStream == null) {
                throw new java.lang.IllegalStateException(("Unable to open '" + this.data + "'.").toString());
            }
        }
        return new coil.fetch.SourceResult(coil.decode.ImageSources.create(okio.Okio.buffer(okio.Okio.source(openInputStream)), this.options.getContext(), new coil.decode.ContentMetadata(this.data)), contentResolver.getType(this.data), coil.decode.DataSource.DISK);
    }

    public final boolean isContactPhotoUri$coil_base_release(android.net.Uri data) {
        return kotlin.jvm.internal.Intrinsics.areEqual(data.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.Intrinsics.areEqual(data.getLastPathSegment(), "display_photo");
    }

    public final boolean isMusicThumbnailUri$coil_base_release(android.net.Uri data) {
        java.util.List<java.lang.String> pathSegments;
        int size;
        return kotlin.jvm.internal.Intrinsics.areEqual(data.getAuthority(), "media") && (size = (pathSegments = data.getPathSegments()).size()) >= 3 && kotlin.jvm.internal.Intrinsics.areEqual(pathSegments.get(size + (-3)), "audio") && kotlin.jvm.internal.Intrinsics.areEqual(pathSegments.get(size + (-2)), "albums");
    }

    private final android.os.Bundle newMusicThumbnailSizeOptions() {
        coil.size.Dimension width = this.options.getSize().getWidth();
        coil.size.Dimension.Pixels pixels = width instanceof coil.size.Dimension.Pixels ? (coil.size.Dimension.Pixels) width : null;
        if (pixels == null) {
            return null;
        }
        int i = pixels.px;
        coil.size.Dimension height = this.options.getSize().getHeight();
        coil.size.Dimension.Pixels pixels2 = height instanceof coil.size.Dimension.Pixels ? (coil.size.Dimension.Pixels) height : null;
        if (pixels2 == null) {
            return null;
        }
        int i2 = pixels2.px;
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new android.graphics.Point(i, i2));
        return bundle;
    }

    /* compiled from: ContentUriFetcher.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcoil/fetch/ContentUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "<init>", "()V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements coil.fetch.Fetcher.Factory<android.net.Uri> {
        @Override // coil.fetch.Fetcher.Factory
        public coil.fetch.Fetcher create(android.net.Uri data, coil.request.Options options, coil.ImageLoader imageLoader) {
            if (isApplicable(data)) {
                return new coil.fetch.ContentUriFetcher(data, options);
            }
            return null;
        }

        private final boolean isApplicable(android.net.Uri data) {
            return kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "content");
        }
    }
}
