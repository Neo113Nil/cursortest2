package io.flutter.embedding.engine.renderer;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.ImageReader f7645a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayDeque f7646b = new java.util.ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f7647c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer f7648d;

    public e(io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, android.media.ImageReader imageReader) {
        this.f7648d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f7645a = imageReader;
        imageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.d
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(android.media.ImageReader imageReader2) {
                android.media.Image image;
                boolean z2;
                io.flutter.embedding.engine.renderer.e eVar = io.flutter.embedding.engine.renderer.e.this;
                eVar.getClass();
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (java.lang.IllegalStateException e2) {
                    android.util.Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e2);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = eVar.f7648d;
                z2 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                if (z2 || eVar.f7647c) {
                    image.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                }
            }
        }, new android.os.Handler(android.os.Looper.getMainLooper()));
    }
}
