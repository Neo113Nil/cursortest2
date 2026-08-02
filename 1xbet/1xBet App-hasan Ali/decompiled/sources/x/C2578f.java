package x;

import u.AbstractC2453d;
import u.C2473u;
import u.InterfaceC2464k;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2578f implements InterfaceC2574d {

    /* renamed from: b, reason: collision with root package name */
    public final u.z0 f20759b = AbstractC2453d.m(125, 2, new C2473u(0.25f, 0.1f, 0.25f));

    @Override // x.InterfaceC2574d
    public final float a(float f, float f5, float f6) {
        float abs = Math.abs((f5 + f) - f);
        float f7 = (0.3f * f6) - (0.0f * abs);
        float f8 = f6 - f7;
        if ((abs <= f6) && f8 < abs) {
            f7 = f6 - abs;
        }
        return f - f7;
    }

    @Override // x.InterfaceC2574d
    public final InterfaceC2464k b() {
        return this.f20759b;
    }
}
