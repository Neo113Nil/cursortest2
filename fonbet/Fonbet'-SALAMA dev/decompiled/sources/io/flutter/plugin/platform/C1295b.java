package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;

/* renamed from: io.flutter.plugin.platform.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1295b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1296c f14138a;

    public C1295b(C1296c c1296c) {
        this.f14138a = c1296c;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e7) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e7.toString());
            image = null;
        }
        if (image == null) {
            return;
        }
        this.f14138a.f14139a.pushImage(image);
    }
}
