package O5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f19986a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Path> f19987b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Path> f19988c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<float[]> f19989d = new d();

    /* renamed from: e, reason: collision with root package name */
    private static final float f19990e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19991f = 0;

    final class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        protected final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    final class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        protected final Path initialValue() {
            return new Path();
        }
    }

    final class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        protected final Path initialValue() {
            return new Path();
        }
    }

    final class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        protected final float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f7, float f11, float f12) {
        int i11 = B5.c.f2729d;
        PathMeasure pathMeasure = f19986a.get();
        Path path2 = f19987b.get();
        Path path3 = f19988c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f7 == 1.0f && f11 == 0.0f) && length >= 1.0f && Math.abs((f11 - f7) - 1.0f) >= 0.01d) {
            float f13 = f7 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = f.c(min, length);
                max = f.c(max, length);
            }
            if (min < 0.0f) {
                min = f.c(min, length);
            }
            if (max < 0.0f) {
                max = f.c(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f19989d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f7 = f19990e;
        fArr[2] = f7;
        fArr[3] = f7;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean e(Matrix matrix) {
        float[] fArr = f19989d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static Bitmap f(int i11, int i12, Bitmap bitmap) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void g(Canvas canvas, Paint paint, RectF rectF) {
        int i11 = B5.c.f2729d;
        canvas.saveLayer(rectF, paint);
    }
}
