package a2;

import Hj.C3143a;
import b7.InterfaceC5572a;

/* loaded from: classes8.dex */
public final class d implements InterfaceC5572a {
    public static float a(float f7, float f11, float f12, float f13, float f14) {
        return b(f7, f11, Math.max(0.0f, Math.min(1.0f, f12 == f13 ? 0.0f : (f14 - f12) / (f13 - f12))));
    }

    public static float b(float f7, float f11, float f12) {
        return C3143a.d(f11, f7, f12, f7);
    }

    @Override // b7.InterfaceC5572a
    public long t() {
        return System.currentTimeMillis();
    }
}
