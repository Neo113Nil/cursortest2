package P0;

/* renamed from: P0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0052j extends android.view.View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public android.media.ImageReader f1359a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.Image f1360b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f1361c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1362d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1363e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1364f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052j(android.content.Context context, int i2, int i3, int i4) {
        super(context, null);
        android.media.ImageReader f2 = f(i2, i3);
        this.f1363e = false;
        this.f1365g = false;
        this.f1359a = f2;
        this.f1364f = i4;
        setAlpha(0.0f);
        this.f1363e = Q1.d.q(getContext());
    }

    public static android.media.ImageReader f(int i2, int i3) {
        android.media.ImageReader newInstance;
        if (i2 <= 0) {
            java.util.Locale locale = java.util.Locale.US;
            android.util.Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i2 + ", set width=1");
            i2 = 1;
        }
        if (i3 <= 0) {
            java.util.Locale locale2 = java.util.Locale.US;
            android.util.Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i3 + ", set height=1");
            i3 = 1;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return android.media.ImageReader.newInstance(i2, i3, 1, 3);
        }
        newInstance = android.media.ImageReader.newInstance(i2, i3, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        if (H.j.b(this.f1364f) == 0) {
            android.view.Surface surface = this.f1359a.getSurface();
            hVar.f7677b = surface;
            hVar.f7676a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f1362d = hVar;
        this.f1365g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1365g) {
            setAlpha(0.0f);
            e();
            this.f1361c = null;
            android.media.Image image = this.f1360b;
            if (image != null) {
                image.close();
                this.f1360b = null;
            }
            invalidate();
            this.f1365g = false;
        }
    }

    public final boolean e() {
        if (!this.f1365g) {
            return false;
        }
        android.media.Image acquireLatestImage = this.f1359a.acquireLatestImage();
        if (acquireLatestImage != null) {
            android.media.Image image = this.f1360b;
            if (image != null) {
                image.close();
                this.f1360b = null;
            }
            this.f1360b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f1362d == null) {
            return;
        }
        if (i2 == this.f1359a.getWidth() && i3 == this.f1359a.getHeight()) {
            return;
        }
        android.media.Image image = this.f1360b;
        if (image != null) {
            image.close();
            this.f1360b = null;
        }
        this.f1359a.close();
        this.f1359a = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1362d;
    }

    public android.media.ImageReader getImageReader() {
        return this.f1359a;
    }

    public android.view.Surface getSurface() {
        return this.f1359a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.hardware.HardwareBuffer hardwareBuffer;
        android.graphics.ColorSpace.Named named;
        android.graphics.ColorSpace colorSpace;
        android.graphics.Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        android.media.Image image = this.f1360b;
        if (image != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = android.graphics.ColorSpace.Named.SRGB;
                colorSpace = android.graphics.ColorSpace.get(named);
                wrapHardwareBuffer = android.graphics.Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f1361c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                android.media.Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    android.media.Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f1360b.getHeight();
                    android.graphics.Bitmap bitmap = this.f1361c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f1361c.getHeight() != height) {
                        this.f1361c = android.graphics.Bitmap.createBitmap(rowStride, height, android.graphics.Bitmap.Config.ARGB_8888);
                    }
                    java.nio.ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f1361c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        android.graphics.Bitmap bitmap2 = this.f1361c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1363e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        setMeasuredDimension(java.lang.Math.max(android.view.View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), java.lang.Math.max(android.view.View.MeasureSpec.getSize(i3), android.view.View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f1359a.getWidth() && i3 == this.f1359a.getHeight()) && this.f1364f == 1 && this.f1365g) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.h hVar = this.f1362d;
            android.view.Surface surface = this.f1359a.getSurface();
            hVar.f7677b = surface;
            hVar.f7676a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
    }
}
