package androidx.compose.foundation.layout;

import W0.m;
import b0.p;
import z.C2681E;

/* loaded from: classes.dex */
public abstract class b {
    public static C2681E a(float f, float f5, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f5 = 0;
        }
        return new C2681E(f, f5, f, f5);
    }

    public static final C2681E b(float f, float f5, float f6, float f7) {
        return new C2681E(f, f5, f6, f7);
    }

    public static final float c(C2681E c2681e, m mVar) {
        return mVar == m.f6016k ? c2681e.a(mVar) : c2681e.b(mVar);
    }

    public static final p d(p pVar, float f, float f5) {
        return pVar.c(new OffsetElement(f, f5));
    }

    public static final p e(p pVar, C2681E c2681e) {
        return pVar.c(new PaddingValuesElement(c2681e));
    }

    public static final p f(p pVar, float f) {
        return pVar.c(new PaddingElement(f, f, f, f));
    }

    public static final p g(p pVar, float f, float f5) {
        return pVar.c(new PaddingElement(f, f5, f, f5));
    }

    public static p h(p pVar, float f, float f5, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f5 = 0;
        }
        return g(pVar, f, f5);
    }

    public static p i(p pVar, float f, float f5, float f6, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f5 = 0;
        }
        if ((i & 4) != 0) {
            f6 = 0;
        }
        return pVar.c(new PaddingElement(f, f5, f6, 0));
    }

    public static final p j(p pVar) {
        return pVar.c(new IntrinsicWidthElement());
    }
}
