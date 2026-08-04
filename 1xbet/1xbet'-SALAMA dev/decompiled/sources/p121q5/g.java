package p121q5;

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
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.m;
import java.nio.ByteBuffer;
import java.util.Locale;
import p136t.e;

/* JADX INFO: loaded from: classes2.dex */
public class g extends View implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageReader f15900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Image f15901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f15902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f15903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i7, int i8, int i9) {
        super(context, null);
        ImageReader imageReaderD = d(i7, i8);
        this.f15905f = false;
        this.f15900a = imageReaderD;
        this.f15904e = i9;
        setAlpha(0.0f);
    }

    public static ImageReader d(int i7, int i8) {
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
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i7, i8, 1, 3, 768L) : ImageReader.newInstance(i7, i8, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(k kVar) {
        if (e.e(this.f15904e) == 0) {
            Surface surface = this.f15900a.getSurface();
            kVar.f14114c = surface;
            kVar.f14112a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f15903d = kVar;
        this.f15905f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f15905f) {
            setAlpha(0.0f);
            c();
            this.f15902c = null;
            Image image = this.f15901b;
            if (image != null) {
                image.close();
                this.f15901b = null;
            }
            invalidate();
            this.f15905f = false;
        }
    }

    public final boolean c() {
        if (!this.f15905f) {
            return false;
        }
        Image imageAcquireLatestImage = this.f15900a.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f15901b;
            if (image != null) {
                image.close();
                this.f15901b = null;
            }
            this.f15901b = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void e(int i7, int i8) {
        if (this.f15903d == null) {
            return;
        }
        if (i7 == this.f15900a.getWidth() && i8 == this.f15900a.getHeight()) {
            return;
        }
        Image image = this.f15901b;
        if (image != null) {
            image.close();
            this.f15901b = null;
        }
        this.f15900a.close();
        this.f15900a = d(i7, i8);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public k getAttachedRenderer() {
        return this.f15903d;
    }

    public ImageReader getImageReader() {
        return this.f15900a;
    }

    public Surface getSurface() {
        return this.f15900a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f15901b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                this.f15902c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f15901b.getHeight();
                    Bitmap bitmap = this.f15902c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f15902c.getHeight() != height) {
                        this.f15902c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f15902c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f15902c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        if (!(i7 == this.f15900a.getWidth() && i8 == this.f15900a.getHeight()) && this.f15904e == 1 && this.f15905f) {
            e(i7, i8);
            k kVar = this.f15903d;
            Surface surface = this.f15900a.getSurface();
            kVar.f14114c = surface;
            kVar.f14112a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
    }
}
