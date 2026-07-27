package I1;

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

/* renamed from: I1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0031h extends View implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f616a;

    /* renamed from: b, reason: collision with root package name */
    public Image f617b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f618c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f619d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f620e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0031h(Context context, int i3, int i4, int i5) {
        super(context, null);
        ImageReader f = f(i3, i4);
        this.f620e = false;
        this.f621g = false;
        this.f616a = f;
        this.f = i5;
        setAlpha(0.0f);
        this.f620e = F2.b.z(getContext());
    }

    public static ImageReader f(int i3, int i4) {
        ImageReader newInstance;
        if (i3 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i3 + ", set width=1");
            i3 = 1;
        }
        if (i4 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i4 + ", set height=1");
            i4 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i3, i4, 1, 3);
        }
        newInstance = ImageReader.newInstance(i3, i4, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f621g) {
            setAlpha(0.0f);
            e();
            this.f618c = null;
            Image image = this.f617b;
            if (image != null) {
                image.close();
                this.f617b = null;
            }
            invalidate();
            this.f621g = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d(io.flutter.embedding.engine.renderer.j jVar) {
        if (M.j.b(this.f) == 0) {
            Surface surface = this.f616a.getSurface();
            jVar.f9167c = surface;
            jVar.f9165a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f619d = jVar;
        this.f621g = true;
    }

    public final boolean e() {
        if (!this.f621g) {
            return false;
        }
        Image acquireLatestImage = this.f616a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f617b;
            if (image != null) {
                image.close();
                this.f617b = null;
            }
            this.f617b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i3, int i4) {
        if (this.f619d == null) {
            return;
        }
        if (i3 == this.f616a.getWidth() && i4 == this.f616a.getHeight()) {
            return;
        }
        Image image = this.f617b;
        if (image != null) {
            image.close();
            this.f617b = null;
        }
        this.f616a.close();
        this.f616a = f(i3, i4);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f619d;
    }

    public ImageReader getImageReader() {
        return this.f616a;
    }

    public Surface getSurface() {
        return this.f616a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        ColorSpace.Named unused;
        super.onDraw(canvas);
        Image image = this.f617b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f618c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f617b.getHeight();
                    Bitmap bitmap = this.f618c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f618c.getHeight() != height) {
                        this.f618c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f618c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f618c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f620e) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        if (!(i3 == this.f616a.getWidth() && i4 == this.f616a.getHeight()) && this.f == 1 && this.f621g) {
            g(i3, i4);
            io.flutter.embedding.engine.renderer.j jVar = this.f619d;
            Surface surface = this.f616a.getSurface();
            jVar.f9167c = surface;
            jVar.f9165a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c() {
    }
}
