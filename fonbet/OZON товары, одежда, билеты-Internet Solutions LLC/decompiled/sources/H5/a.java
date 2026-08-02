package H5;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f10597a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f10598b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f10599c;

    public a() {
        this.f10597a = new PointF();
        this.f10598b = new PointF();
        this.f10599c = new PointF();
    }

    public final PointF a() {
        return this.f10597a;
    }

    public final PointF b() {
        return this.f10598b;
    }

    public final PointF c() {
        return this.f10599c;
    }

    public final void d(float f7, float f11) {
        this.f10597a.set(f7, f11);
    }

    public final void e(float f7, float f11) {
        this.f10598b.set(f7, f11);
    }

    public final void f(float f7, float f11) {
        this.f10599c.set(f7, f11);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        PointF pointF = this.f10599c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f10597a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f10598b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f10597a = pointF;
        this.f10598b = pointF2;
        this.f10599c = pointF3;
    }
}
