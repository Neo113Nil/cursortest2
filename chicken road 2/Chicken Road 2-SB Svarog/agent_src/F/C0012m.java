package F;

import a.AbstractC0018a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import o.AbstractC0071c;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0012m extends View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f92a;

    /* renamed from: b, reason: collision with root package name */
    public Image f93b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f94c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f95d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96e;

    /* renamed from: f, reason: collision with root package name */
    public final int f97f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f98g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012m(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f96e = false;
        this.f98g = false;
        this.f92a = f2;
        this.f97f = i4;
        setAlpha(0.0f);
        this.f96e = AbstractC0018a.o(getContext());
    }

    public static ImageReader f(int i2, int i3) {
        ImageReader newInstance;
        if (i2 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i2 + ", set width=1");
            i2 = 1;
        }
        if (i3 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i3 + ", set height=1");
            i3 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i2, i3, 1, 3);
        }
        newInstance = ImageReader.newInstance(i2, i3, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        if (AbstractC0071c.a(this.f97f) == 0) {
            Surface surface = this.f92a.getSurface();
            hVar.f594b = surface;
            hVar.f593a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f95d = hVar;
        this.f98g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f98g) {
            setAlpha(0.0f);
            e();
            this.f94c = null;
            Image image = this.f93b;
            if (image != null) {
                image.close();
                this.f93b = null;
            }
            invalidate();
            this.f98g = false;
        }
    }

    public final boolean e() {
        if (!this.f98g) {
            return false;
        }
        Image acquireLatestImage = this.f92a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f93b;
            if (image != null) {
                image.close();
                this.f93b = null;
            }
            this.f93b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f95d == null) {
            return;
        }
        if (i2 == this.f92a.getWidth() && i3 == this.f92a.getHeight()) {
            return;
        }
        Image image = this.f93b;
        if (image != null) {
            image.close();
            this.f93b = null;
        }
        this.f92a.close();
        this.f92a = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f95d;
    }

    public ImageReader getImageReader() {
        return this.f92a;
    }

    public Surface getSurface() {
        return this.f92a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        ColorSpace.Named unused;
        super.onDraw(canvas);
        Image image = this.f93b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f94c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f93b.getHeight();
                    Bitmap bitmap = this.f94c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f94c.getHeight() != height) {
                        this.f94c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f94c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f94c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f96e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f92a.getWidth() && i3 == this.f92a.getHeight()) && this.f97f == 1 && this.f98g) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.h hVar = this.f95d;
            Surface surface = this.f92a.getSurface();
            hVar.f594b = surface;
            hVar.f593a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
    }
}
