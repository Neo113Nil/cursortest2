package x;

import u.InterfaceC2464k;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2570b implements InterfaceC2574d {
    @Override // x.InterfaceC2574d
    public final float a(float f, float f5, float f6) {
        InterfaceC2574d.f20750a.getClass();
        float f7 = f5 + f;
        if ((f >= 0.0f && f7 <= f6) || (f < 0.0f && f7 > f6)) {
            return 0.0f;
        }
        float f8 = f7 - f6;
        return Math.abs(f) < Math.abs(f8) ? f : f8;
    }

    @Override // x.InterfaceC2574d
    public final InterfaceC2464k b() {
        InterfaceC2574d.f20750a.getClass();
        return C2572c.f20744b;
    }
}
