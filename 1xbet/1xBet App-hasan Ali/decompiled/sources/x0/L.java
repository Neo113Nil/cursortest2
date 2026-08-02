package x0;

import n.C2145o;
import z0.AbstractC2739O;

/* loaded from: classes.dex */
public final class L extends Y {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20957l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f20958m;

    public /* synthetic */ L(int i, Object obj) {
        this.f20957l = i;
        this.f20958m = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i4.e, kotlin.jvm.internal.m] */
    @Override // x0.Y
    public float b(C2630p c2630p) {
        float intBitsToFloat;
        int G02;
        switch (this.f20957l) {
            case 0:
                ?? r02 = c2630p.f21031a;
                if (r02 != 0) {
                    return ((Number) r02.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC2739O abstractC2739O = (AbstractC2739O) this.f20958m;
                if (abstractC2739O.f21683u) {
                    return Float.NaN;
                }
                AbstractC2739O abstractC2739O2 = abstractC2739O;
                while (true) {
                    C2145o c2145o = abstractC2739O2.f21685w;
                    if (!Float.isNaN((c2145o == null || (G02 = X3.l.G0((C2630p[]) c2145o.f18295b, c2630p)) < 0) ? Float.NaN : ((float[]) c2145o.f18296c)[G02])) {
                        abstractC2739O2.f0(abstractC2739O.p0(), c2630p);
                        InterfaceC2637x n02 = abstractC2739O2.n0();
                        InterfaceC2637x n03 = abstractC2739O.n0();
                        switch (c2630p.f21032b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (n03.o(n02, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (n02.I() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (n03.o(n02, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (n02.I() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    AbstractC2739O r03 = abstractC2739O2.r0();
                    if (r03 == null) {
                        abstractC2739O2.f0(abstractC2739O.p0(), c2630p);
                        return Float.NaN;
                    }
                    abstractC2739O2 = r03;
                }
                break;
            default:
                return super.b(c2630p);
        }
    }

    @Override // W0.c
    public final float c() {
        switch (this.f20957l) {
            case 0:
                return ((AbstractC2739O) this.f20958m).c();
            default:
                return ((A0.F) this.f20958m).getDensity().c();
        }
    }

    @Override // x0.Y
    public final W0.m e() {
        switch (this.f20957l) {
            case 0:
                return ((AbstractC2739O) this.f20958m).getLayoutDirection();
            default:
                return ((A0.F) this.f20958m).getLayoutDirection();
        }
    }

    @Override // x0.Y
    public final int f() {
        switch (this.f20957l) {
            case 0:
                return ((AbstractC2739O) this.f20958m).X();
            default:
                return ((A0.F) this.f20958m).getRoot().f21613P.f21663p.f20973k;
        }
    }

    @Override // W0.c
    public final float n() {
        switch (this.f20957l) {
            case 0:
                return ((AbstractC2739O) this.f20958m).n();
            default:
                return ((A0.F) this.f20958m).getDensity().n();
        }
    }
}
