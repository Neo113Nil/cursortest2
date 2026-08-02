package J9;

import h9.s;

/* loaded from: classes9.dex */
public final class a extends s {

    /* renamed from: c, reason: collision with root package name */
    private final float f14201c;

    a(float f7, float f11, float f12) {
        super(f7, f11);
        this.f14201c = f12;
    }

    final boolean e(float f7, float f11, float f12) {
        if (Math.abs(f11 - c()) > f7 || Math.abs(f12 - b()) > f7) {
            return false;
        }
        float f13 = this.f14201c;
        float abs = Math.abs(f7 - f13);
        return abs <= 1.0f || abs <= f13;
    }

    final a f(float f7, float f11, float f12) {
        return new a((b() + f11) / 2.0f, (c() + f7) / 2.0f, (this.f14201c + f12) / 2.0f);
    }
}
