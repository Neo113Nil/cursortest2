package s0;

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
import p.AbstractC0819i;

/* loaded from: classes.dex */
public class h extends View implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f6526a;

    /* renamed from: b, reason: collision with root package name */
    public Image f6527b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f6528c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f6529d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6530e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6531f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f6530e = false;
        this.f6532g = false;
        this.f6526a = f2;
        this.f6531f = i4;
        setAlpha(0.0f);
        this.f6530e = V.a.o(getContext());
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
    public final void a(io.flutter.embedding.engine.renderer.i iVar) {
        if (AbstractC0819i.c(this.f6531f) == 0) {
            Surface surface = this.f6526a.getSurface();
            iVar.f5785b = surface;
            iVar.f5784a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f6529d = iVar;
        this.f6532g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f6532g) {
            setAlpha(0.0f);
            e();
            this.f6528c = null;
            Image image = this.f6527b;
            if (image != null) {
                image.close();
                this.f6527b = null;
            }
            invalidate();
            this.f6532g = false;
        }
    }

    public final boolean e() {
        if (!this.f6532g) {
            return false;
        }
        Image acquireLatestImage = this.f6526a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f6527b;
            if (image != null) {
                image.close();
                this.f6527b = null;
            }
            this.f6527b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f6529d == null) {
            return;
        }
        if (i2 == this.f6526a.getWidth() && i3 == this.f6526a.getHeight()) {
            return;
        }
        Image image = this.f6527b;
        if (image != null) {
            image.close();
            this.f6527b = null;
        }
        this.f6526a.close();
        this.f6526a = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f6529d;
    }

    public ImageReader getImageReader() {
        return this.f6526a;
    }

    public Surface getSurface() {
        return this.f6526a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f6527b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f6528c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f6527b.getHeight();
                    Bitmap bitmap = this.f6528c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f6528c.getHeight() != height) {
                        this.f6528c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f6528c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f6528c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f6530e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f6526a.getWidth() && i3 == this.f6526a.getHeight()) && this.f6531f == 1 && this.f6532g) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.i iVar = this.f6529d;
            Surface surface = this.f6526a.getSurface();
            iVar.f5785b = surface;
            iVar.f5784a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
    }
}
