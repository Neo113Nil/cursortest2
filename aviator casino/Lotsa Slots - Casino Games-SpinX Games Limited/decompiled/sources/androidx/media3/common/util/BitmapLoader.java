package androidx.media3.common.util;

/* loaded from: classes2.dex */
public interface BitmapLoader {
    com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> decodeBitmap(byte[] bArr);

    com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap(android.net.Uri uri);

    com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmapFromMetadata(androidx.media3.common.MediaMetadata mediaMetadata);

    boolean supportsMimeType(java.lang.String str);

    /* renamed from: androidx.media3.common.util.BitmapLoader$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static com.google.common.util.concurrent.ListenableFuture $default$loadBitmapFromMetadata(androidx.media3.common.util.BitmapLoader _this, androidx.media3.common.MediaMetadata mediaMetadata) {
            if (mediaMetadata.artworkData != null) {
                return _this.decodeBitmap(mediaMetadata.artworkData);
            }
            if (mediaMetadata.artworkUri != null) {
                return _this.loadBitmap(mediaMetadata.artworkUri);
            }
            return null;
        }
    }
}
