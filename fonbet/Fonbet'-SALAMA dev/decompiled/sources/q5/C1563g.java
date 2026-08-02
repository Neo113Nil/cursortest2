package q5;

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

/* renamed from: q5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1563g extends View implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f15894a;

    /* renamed from: b, reason: collision with root package name */
    public Image f15895b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f15896c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f15897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15898e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563g(Context context, int i7, int i8, int i9) {
        super(context, null);
        ImageReader d7 = d(i7, i8);
        this.f15899f = false;
        this.f15894a = d7;
        this.f15898e = i9;
        setAlpha(0.0f);
    }

    public static ImageReader d(int i7, int i8) {
        ImageReader newInstance;
        if (i7 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i7 + ", set width=1");
            i7 = 1;
        }
        if (i8 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i8 + ", set height=1");
            i8 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i7, i8, 1, 3);
        }
        newInstance = ImageReader.newInstance(i7, i8, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.k kVar) {
        if (t.e.e(this.f15898e) == 0) {
            Surface surface = this.f15894a.getSurface();
            kVar.f14108c = surface;
            kVar.f14106a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f15897d = kVar;
        this.f15899f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f15899f) {
            setAlpha(0.0f);
            c();
            this.f15896c = null;
            Image image = this.f15895b;
            if (image != null) {
                image.close();
                this.f15895b = null;
            }
            invalidate();
            this.f15899f = false;
        }
    }

    public final boolean c() {
        if (!this.f15899f) {
            return false;
        }
        Image acquireLatestImage = this.f15894a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f15895b;
            if (image != null) {
                image.close();
                this.f15895b = null;
            }
            this.f15895b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void e(int i7, int i8) {
        if (this.f15897d == null) {
            return;
        }
        if (i7 == this.f15894a.getWidth() && i8 == this.f15894a.getHeight()) {
            return;
        }
        Image image = this.f15895b;
        if (image != null) {
            image.close();
            this.f15895b = null;
        }
        this.f15894a.close();
        this.f15894a = d(i7, i8);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.k getAttachedRenderer() {
        return this.f15897d;
    }

    public ImageReader getImageReader() {
        return this.f15894a;
    }

    public Surface getSurface() {
        return this.f15894a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f15895b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f15896c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f15895b.getHeight();
                    Bitmap bitmap = this.f15896c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f15896c.getHeight() != height) {
                        this.f15896c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f15896c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f15896c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        if (!(i7 == this.f15894a.getWidth() && i8 == this.f15894a.getHeight()) && this.f15898e == 1 && this.f15899f) {
            e(i7, i8);
            io.flutter.embedding.engine.renderer.k kVar = this.f15897d;
            Surface surface = this.f15894a.getSurface();
            kVar.f14108c = surface;
            kVar.f14106a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
    }
}
