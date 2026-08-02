package J9;

import h9.s;

/* loaded from: classes9.dex */
public final class d extends s {

    /* renamed from: c, reason: collision with root package name */
    private final float f14213c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14214d;

    d(float f7, float f11, float f12) {
        this(f7, f11, f12, 1);
    }

    final boolean e(float f7, float f11, float f12) {
        if (Math.abs(f11 - c()) > f7 || Math.abs(f12 - b()) > f7) {
            return false;
        }
        float f13 = this.f14213c;
        float abs = Math.abs(f7 - f13);
        return abs <= 1.0f || abs <= f13;
    }

    final d f(float f7, float f11, float f12) {
        int i11 = this.f14214d;
        int i12 = i11 + 1;
        float b11 = (b() * i11) + f11;
        float f13 = i12;
        return new d(b11 / f13, ((c() * i11) + f7) / f13, ((i11 * this.f14213c) + f12) / f13, i12);
    }

    final int g() {
        return this.f14214d;
    }

    public final float h() {
        return this.f14213c;
    }

    private d(float f7, float f11, float f12, int i11) {
        super(f7, f11);
        this.f14213c = f12;
        this.f14214d = i11;
    }
}
