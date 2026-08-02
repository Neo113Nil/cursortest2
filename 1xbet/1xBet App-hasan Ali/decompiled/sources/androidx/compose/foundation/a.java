package androidx.compose.foundation;

import H0.g;
import b0.k;
import b0.p;
import i0.F;
import i0.J;
import i0.y;
import i4.InterfaceC2015a;
import v.T;
import v.Y;
import y.C2654j;

/* loaded from: classes.dex */
public abstract class a {
    public static p a(p pVar, y yVar) {
        return pVar.c(new BackgroundElement(0L, yVar, F.f17222a, 1));
    }

    public static final p b(p pVar, long j5, J j6) {
        return pVar.c(new BackgroundElement(j5, null, j6, 2));
    }

    public static p c(p pVar, C2654j c2654j, T t5, boolean z3, g gVar, InterfaceC2015a interfaceC2015a, int i) {
        if ((i & 16) != 0) {
            gVar = null;
        }
        g gVar2 = gVar;
        return pVar.c(t5 instanceof Y ? new ClickableElement(c2654j, (Y) t5, z3, null, gVar2, interfaceC2015a) : t5 == null ? new ClickableElement(c2654j, null, z3, null, gVar2, interfaceC2015a) : c2654j != null ? e.a(c2654j, t5).c(new ClickableElement(c2654j, null, z3, null, gVar2, interfaceC2015a)) : new k(new c(t5, z3, null, gVar2, interfaceC2015a)));
    }

    public static p d(p pVar, boolean z3, String str, InterfaceC2015a interfaceC2015a, int i) {
        if ((i & 1) != 0) {
            z3 = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return b0.a.a(pVar, new b(z3, str, interfaceC2015a));
    }
}
