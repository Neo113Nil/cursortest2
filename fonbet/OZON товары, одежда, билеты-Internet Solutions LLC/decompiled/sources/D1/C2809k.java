package D1;

import androidx.compose.ui.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2809k {
    public static final void a(U0.b bVar, e.c cVar) {
        U0.b<H> o02 = f(cVar).o0();
        int m11 = o02.m();
        if (m11 > 0) {
            int i11 = m11 - 1;
            H[] l11 = o02.l();
            do {
                bVar.b(l11[i11].c0().h());
                i11--;
            } while (i11 >= 0);
        }
    }

    public static final e.c b(U0.b bVar) {
        if (bVar == null || bVar.o()) {
            return null;
        }
        return (e.c) Pk0.b.b(1, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final E c(@NotNull e.c cVar) {
        if ((cVar.getKindSet$ui_release() & 2) != 0) {
            if (cVar instanceof E) {
                return (E) cVar;
            }
            if (cVar instanceof AbstractC2813m) {
                e.c J12 = ((AbstractC2813m) cVar).J1();
                while (J12 != 0) {
                    if (J12 instanceof E) {
                        return (E) J12;
                    }
                    J12 = (!(J12 instanceof AbstractC2813m) || (J12.getKindSet$ui_release() & 2) == 0) ? J12.getChild$ui_release() : ((AbstractC2813m) J12).J1();
                }
            }
        }
        return null;
    }

    @NotNull
    public static final AbstractC2810k0 d(@NotNull InterfaceC2807j interfaceC2807j, int i11) {
        AbstractC2810k0 coordinator$ui_release = interfaceC2807j.getNode().getCoordinator$ui_release();
        Intrinsics.f(coordinator$ui_release);
        if (coordinator$ui_release.e2() != interfaceC2807j || !p0.h(i11)) {
            return coordinator$ui_release;
        }
        AbstractC2810k0 f22 = coordinator$ui_release.f2();
        Intrinsics.f(f22);
        return f22;
    }

    @NotNull
    public static final AbstractC2810k0 e(@NotNull InterfaceC2807j interfaceC2807j) {
        if (!interfaceC2807j.getNode().isAttached()) {
            A1.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        AbstractC2810k0 d11 = d(interfaceC2807j, 2);
        if (d11.I()) {
            return d11;
        }
        A1.a.b("LayoutCoordinates is not attached.");
        throw null;
    }

    @NotNull
    public static final H f(@NotNull InterfaceC2807j interfaceC2807j) {
        AbstractC2810k0 coordinator$ui_release = interfaceC2807j.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.B0();
        }
        A1.a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    @NotNull
    public static final x0 g(@NotNull InterfaceC2807j interfaceC2807j) {
        x0 f02 = f(interfaceC2807j).f0();
        if (f02 != null) {
            return f02;
        }
        A1.a.c("This node does not have an owner.");
        throw null;
    }
}
