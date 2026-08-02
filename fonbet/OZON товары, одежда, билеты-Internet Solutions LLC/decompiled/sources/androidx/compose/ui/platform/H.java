package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class H {
    public static final boolean a(I1.r rVar) {
        I1.l k11 = rVar.k();
        int i11 = I1.u.f11751H;
        return !k11.e(I1.u.d());
    }

    public static final D1.H b(D1.H h11, Function1 function1) {
        for (D1.H g02 = h11.g0(); g02 != null; g02 = g02.g0()) {
            if (((Boolean) function1.invoke(g02)).booleanValue()) {
                return g02;
            }
        }
        return null;
    }

    public static final boolean c(I1.r rVar) {
        return rVar.m().O() == Z1.s.Rtl;
    }
}
