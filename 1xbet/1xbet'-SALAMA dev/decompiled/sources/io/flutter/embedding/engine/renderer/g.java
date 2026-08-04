package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReader f14085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f14086b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14087c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f14088d;

    public g(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f14088d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f14085a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image imageAcquireLatestImage;
                g gVar = this.f14084a;
                gVar.getClass();
                try {
                    imageAcquireLatestImage = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e7) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e7);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage == null) {
                    return;
                }
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = gVar.f14088d;
                if (flutterRenderer$ImageReaderSurfaceProducer2.released || gVar.f14087c) {
                    imageAcquireLatestImage.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, imageAcquireLatestImage);
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
