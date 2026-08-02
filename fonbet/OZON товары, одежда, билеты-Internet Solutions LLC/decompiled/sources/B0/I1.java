package B0;

import k1.C7460f;
import r0.EnumC9142v;

/* loaded from: classes.dex */
public final class I1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1409a;

        static {
            int[] iArr = new int[EnumC9142v.values().length];
            try {
                iArr[EnumC9142v.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9142v.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1409a = iArr;
        }
    }

    public static final C7460f a(Z1.d dVar, int i11, Q1.W w11, K1.K k11, boolean z11, int i12) {
        C7460f e11 = k11 != null ? k11.e(w11.a().originalToTransformed(i11)) : C7460f.f70279e;
        int Y02 = dVar.Y0(C2489l1.a());
        return C7460f.g(e11, z11 ? (i12 - e11.n()) - Y02 : e11.n(), z11 ? i12 - e11.n() : Y02 + e11.n(), 0.0f, 10);
    }
}
