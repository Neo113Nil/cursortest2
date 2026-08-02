package androidx.compose.ui.layout;

import b0.p;
import i4.c;
import i4.f;
import x0.C2638y;
import x0.N;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(N n5) {
        Object k5 = n5.k();
        C2638y c2638y = k5 instanceof C2638y ? (C2638y) k5 : null;
        if (c2638y != null) {
            return c2638y.f21066y;
        }
        return null;
    }

    public static final p b(f fVar) {
        return new LayoutElement(fVar);
    }

    public static final p c(p pVar, String str) {
        return pVar.c(new LayoutIdElement(str));
    }

    public static final p d(p pVar, c cVar) {
        return pVar.c(new OnGloballyPositionedElement(cVar));
    }

    public static final p e(p pVar, c cVar) {
        return pVar.c(new OnSizeChangedModifier(cVar));
    }
}
