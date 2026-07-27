package w2;

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

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1518f extends View implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f12145a;

    /* renamed from: b, reason: collision with root package name */
    public Image f12146b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f12147c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f12148d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12149e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12150f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518f(Context context, int i2, int i3, int i6) {
        super(context, null);
        ImageReader f3 = f(i2, i3);
        this.f12149e = false;
        this.f12151g = false;
        this.f12145a = f3;
        this.f12150f = i6;
        setAlpha(0.0f);
        this.f12149e = e5.g.q(getContext());
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

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        if (this.f12151g) {
            setAlpha(0.0f);
            e();
            this.f12147c = null;
            Image image = this.f12146b;
            if (image != null) {
                image.close();
                this.f12146b = null;
            }
            invalidate();
            this.f12151g = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d(io.flutter.embedding.engine.renderer.i iVar) {
        if (O.j.b(this.f12150f) == 0) {
            Surface surface = this.f12145a.getSurface();
            iVar.f10147b = surface;
            iVar.f10146a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f12148d = iVar;
        this.f12151g = true;
    }

    public final boolean e() {
        if (!this.f12151g) {
            return false;
        }
        Image acquireLatestImage = this.f12145a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f12146b;
            if (image != null) {
                image.close();
                this.f12146b = null;
            }
            this.f12146b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f12148d == null) {
            return;
        }
        if (i2 == this.f12145a.getWidth() && i3 == this.f12145a.getHeight()) {
            return;
        }
        Image image = this.f12146b;
        if (image != null) {
            image.close();
            this.f12146b = null;
        }
        this.f12145a.close();
        this.f12145a = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f12148d;
    }

    public ImageReader getImageReader() {
        return this.f12145a;
    }

    public Surface getSurface() {
        return this.f12145a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f12146b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f12147c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f12146b.getHeight();
                    Bitmap bitmap = this.f12147c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f12147c.getHeight() != height) {
                        this.f12147c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f12147c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f12147c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f12149e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i6, int i7) {
        if (!(i2 == this.f12145a.getWidth() && i3 == this.f12145a.getHeight()) && this.f12150f == 1 && this.f12151g) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.i iVar = this.f12148d;
            Surface surface = this.f12145a.getSurface();
            iVar.f10147b = surface;
            iVar.f10146a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
    }
}
