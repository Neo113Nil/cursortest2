package androidx.media3.session;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes3.dex */
public final class CacheBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;
    private BitmapLoadRequest lastBitmapLoadRequest;

    public static class BitmapLoadRequest {

        @Nullable
        private final byte[] data;

        @Nullable
        private final com.google.common.util.concurrent.u<Bitmap> future;

        @Nullable
        private final Uri uri;

        public BitmapLoadRequest(byte[] bArr, com.google.common.util.concurrent.u<Bitmap> uVar) {
            this.data = bArr;
            this.uri = null;
            this.future = uVar;
        }

        public com.google.common.util.concurrent.u<Bitmap> getFuture() {
            return (com.google.common.util.concurrent.u) Assertions.checkStateNotNull(this.future);
        }

        public boolean matches(@Nullable byte[] bArr) {
            byte[] bArr2 = this.data;
            return bArr2 != null && Arrays.equals(bArr2, bArr);
        }

        public boolean matches(@Nullable Uri uri) {
            Uri uri2 = this.uri;
            return uri2 != null && uri2.equals(uri);
        }

        public BitmapLoadRequest(Uri uri, com.google.common.util.concurrent.u<Bitmap> uVar) {
            this.data = null;
            this.uri = uri;
            this.future = uVar;
        }
    }

    public CacheBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
        this.bitmapLoader = bitmapLoader;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.u<Bitmap> decodeBitmap(byte[] bArr) {
        BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(bArr)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.u<Bitmap> decodeBitmap = this.bitmapLoader.decodeBitmap(bArr);
        this.lastBitmapLoadRequest = new BitmapLoadRequest(bArr, decodeBitmap);
        return decodeBitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.u<Bitmap> loadBitmap(Uri uri) {
        BitmapLoadRequest bitmapLoadRequest = this.lastBitmapLoadRequest;
        if (bitmapLoadRequest != null && bitmapLoadRequest.matches(uri)) {
            return this.lastBitmapLoadRequest.getFuture();
        }
        com.google.common.util.concurrent.u<Bitmap> loadBitmap = this.bitmapLoader.loadBitmap(uri);
        this.lastBitmapLoadRequest = new BitmapLoadRequest(uri, loadBitmap);
        return loadBitmap;
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return this.bitmapLoader.supportsMimeType(str);
    }
}
