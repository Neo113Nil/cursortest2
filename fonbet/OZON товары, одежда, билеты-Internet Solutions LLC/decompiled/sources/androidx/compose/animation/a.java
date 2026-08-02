package androidx.compose.animation;

import androidx.recyclerview.widget.LinearLayoutManager;
import e1.InterfaceC6250b;
import i1.C6988h;
import m0.C8004n;
import m0.H;
import m0.T0;
import m0.l1;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f38763a = Z1.r.a(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);

    public static androidx.compose.ui.e a(androidx.compose.ui.e eVar, T0 t02, int i11) {
        H h11 = t02;
        if ((i11 & 1) != 0) {
            int i12 = l1.f73821b;
            h11 = C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1);
        }
        return C6988h.b(eVar).l0(new SizeAnimationModifierElement(h11, InterfaceC6250b.a.o()));
    }

    public static final long b() {
        return f38763a;
    }

    public static final boolean c(long j11) {
        return !Z1.q.c(j11, f38763a);
    }
}
