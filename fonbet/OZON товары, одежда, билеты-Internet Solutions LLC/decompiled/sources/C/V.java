package C;

import android.graphics.PointF;
import android.util.Rational;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    private Rational f4137a = null;

    @NonNull
    protected abstract PointF a(float f7, float f11);

    @NonNull
    public final U b(float f7, float f11) {
        PointF a11 = a(f7, f11);
        return new U(a11.x, a11.y, this.f4137a);
    }

    protected final void c(@NonNull Rational rational) {
        this.f4137a = rational;
    }
}
