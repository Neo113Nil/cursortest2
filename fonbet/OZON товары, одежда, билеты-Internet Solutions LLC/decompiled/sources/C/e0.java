package C;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class e0 extends V {

    /* renamed from: b, reason: collision with root package name */
    private final float f4179b;

    /* renamed from: c, reason: collision with root package name */
    private final float f4180c;

    public e0(float f7, float f11) {
        this.f4179b = f7;
        this.f4180c = f11;
    }

    @Override // C.V
    @NonNull
    protected final PointF a(float f7, float f11) {
        return new PointF(f7 / this.f4179b, f11 / this.f4180c);
    }
}
