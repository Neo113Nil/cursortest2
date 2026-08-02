package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcoil3/decode/ContentMetadata;", "Lcoil3/decode/ImageSource$Metadata;", "Lcoil3/Uri;", "uri", "Landroid/content/res/AssetFileDescriptor;", "assetFileDescriptor", "<init>", "(Lcoil3/Uri;Landroid/content/res/AssetFileDescriptor;)V", "Lcoil3/Uri;", "getUri", "()Lcoil3/Uri;", "Landroid/content/res/AssetFileDescriptor;", "getAssetFileDescriptor", "()Landroid/content/res/AssetFileDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentMetadata extends coil3.decode.ImageSource.Metadata {
    private final android.content.res.AssetFileDescriptor assetFileDescriptor;
    private final coil3.Uri uri;

    public ContentMetadata(coil3.Uri uri, android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.uri = uri;
        this.assetFileDescriptor = assetFileDescriptor;
    }

    public final coil3.Uri getUri() {
        return this.uri;
    }

    public final android.content.res.AssetFileDescriptor getAssetFileDescriptor() {
        return this.assetFileDescriptor;
    }
}
