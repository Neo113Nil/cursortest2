package androidx.camera.view;

import C.V;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class l extends V {

    /* renamed from: e, reason: collision with root package name */
    static final PointF f38556e = new PointF(2.0f, 2.0f);

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final g f38557b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f38558c = null;

    /* renamed from: d, reason: collision with root package name */
    private Matrix f38559d;

    l(@NonNull g gVar) {
        this.f38557b = gVar;
    }

    @Override // C.V
    @NonNull
    protected final PointF a(float f7, float f11) {
        float[] fArr = {f7, f11};
        synchronized (this) {
            try {
                Matrix matrix = this.f38559d;
                if (matrix == null) {
                    return f38556e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void d(@NonNull Size size, int i11) {
        Rect rect;
        G.q.a();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f38558c) != null) {
                    this.f38559d = this.f38557b.a(size, i11, rect);
                    return;
                }
                this.f38559d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(Rect rect) {
        c(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f38558c = rect;
        }
    }
}
