package D1;

import B1.InterfaceC2541j;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.InterfaceC6991k;
import org.jetbrains.annotations.NotNull;
import v1.InterfaceC10180e;
import v1.InterfaceC10182g;
import z1.InterfaceC10971a;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.I<Object> f5545a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5546b = 0;

    static {
        int i11 = androidx.collection.P.f38645b;
        f5545a = new androidx.collection.I<>((Object) null);
    }

    public static final void a(@NotNull e.c cVar) {
        if (cVar.isAttached()) {
            b(cVar, -1, 1);
        } else {
            A1.a.b("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(@NotNull e.c cVar, int i11, int i12) {
        if (!(cVar instanceof AbstractC2813m)) {
            c(cVar, i11 & cVar.getKindSet$ui_release(), i12);
            return;
        }
        AbstractC2813m abstractC2813m = (AbstractC2813m) cVar;
        c(cVar, abstractC2813m.K1() & i11, i12);
        int i13 = (~abstractC2813m.K1()) & i11;
        for (e.c J12 = abstractC2813m.J1(); J12 != null; J12 = J12.getChild$ui_release()) {
            b(J12, i13, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(e.c cVar, int i11, int i12) {
        if (i12 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((i11 & 2) != 0 && (cVar instanceof E)) {
                C2809k.f((E) cVar).u0();
                if (i12 == 2) {
                    C2809k.d(cVar, 2).u2();
                }
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 && (cVar instanceof B) && i12 != 2) {
                C2809k.f(cVar).u0();
            }
            if ((i11 & 256) != 0 && (cVar instanceof InterfaceC2821v) && i12 != 2) {
                C2809k.f(cVar).v0();
            }
            if ((i11 & 4) != 0 && (cVar instanceof InterfaceC2819t)) {
                C2820u.a((InterfaceC2819t) cVar);
            }
            if ((i11 & 8) != 0 && (cVar instanceof E0)) {
                C2809k.f((E0) cVar).x0();
            }
            if ((i11 & 64) != 0 && (cVar instanceof A0)) {
                C2809k.f((A0) cVar).w0();
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof FocusTargetNode) && i12 != 2) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                ((FocusOwnerImpl) ((AndroidComposeView) C2809k.g(focusTargetNode)).q()).r(focusTargetNode);
            }
            if ((i11 & 2048) != 0 && (cVar instanceof j1.o)) {
                j1.o oVar = (j1.o) cVar;
                C2799f c2799f = C2799f.f5438a;
                C2799f.f();
                oVar.y0(c2799f);
                if (C2799f.e()) {
                    if (i12 != 2) {
                        ((AndroidComposeView) C2809k.g(oVar)).q().a(oVar);
                    } else {
                        if (!oVar.getNode().isAttached()) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        U0.b bVar = new U0.b(new e.c[16]);
                        e.c child$ui_release = oVar.getNode().getChild$ui_release();
                        if (child$ui_release == null) {
                            C2809k.a(bVar, oVar.getNode());
                        } else {
                            bVar.b(child$ui_release);
                        }
                        while (bVar.p()) {
                            e.c cVar2 = (e.c) Pk0.b.b(1, bVar);
                            if ((cVar2.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                C2809k.a(bVar, cVar2);
                            } else {
                                while (true) {
                                    if (cVar2 == null) {
                                        break;
                                    }
                                    if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        U0.b bVar2 = null;
                                        while (cVar2 != null) {
                                            if (cVar2 instanceof FocusTargetNode) {
                                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar2;
                                                ((FocusOwnerImpl) ((AndroidComposeView) C2809k.g(focusTargetNode2)).q()).r(focusTargetNode2);
                                            } else if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar2 instanceof AbstractC2813m)) {
                                                int i13 = 0;
                                                for (e.c J12 = ((AbstractC2813m) cVar2).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                                    if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                        i13++;
                                                        if (i13 == 1) {
                                                            cVar2 = J12;
                                                        } else {
                                                            if (bVar2 == null) {
                                                                bVar2 = new U0.b(new e.c[16]);
                                                            }
                                                            if (cVar2 != null) {
                                                                bVar2.b(cVar2);
                                                                cVar2 = null;
                                                            }
                                                            bVar2.b(J12);
                                                        }
                                                    }
                                                }
                                                if (i13 == 1) {
                                                }
                                            }
                                            cVar2 = C2809k.b(bVar2);
                                        }
                                    } else {
                                        cVar2 = cVar2.getChild$ui_release();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ((i11 & 4096) == 0 || !(cVar instanceof j1.e)) {
                return;
            }
            j1.e eVar = (j1.e) cVar;
            ((AndroidComposeView) C2809k.g(eVar)).q().c(eVar);
        }
    }

    public static final void d(@NotNull e.c cVar) {
        if (cVar.isAttached()) {
            b(cVar, -1, 0);
        } else {
            A1.a.b("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(@NotNull e.b bVar) {
        int i11 = bVar instanceof B1.J ? 3 : 1;
        if (bVar instanceof InterfaceC6991k) {
            i11 |= 4;
        }
        if (bVar instanceof I1.n) {
            i11 |= 8;
        }
        if (bVar instanceof x1.D) {
            i11 |= 16;
        }
        if ((bVar instanceof C1.d) || (bVar instanceof C1.j)) {
            i11 |= 32;
        }
        if (bVar instanceof j1.d) {
            i11 |= 4096;
        }
        if (bVar instanceof j1.j) {
            i11 |= 2048;
        }
        if (bVar instanceof B1.f0) {
            i11 |= 256;
        }
        if (bVar instanceof B1.j0) {
            i11 |= 64;
        }
        return ((bVar instanceof B1.g0) || (bVar instanceof B1.h0)) ? i11 | UserVerificationMethods.USER_VERIFY_PATTERN : i11;
    }

    public static final int f(@NotNull e.c cVar) {
        if (cVar.getKindSet$ui_release() != 0) {
            return cVar.getKindSet$ui_release();
        }
        Class<?> cls = cVar.getClass();
        androidx.collection.I<Object> i11 = f5545a;
        int a11 = i11.a(cls);
        if (a11 >= 0) {
            return i11.f38641c[a11];
        }
        int i12 = cVar instanceof E ? 3 : 1;
        if (cVar instanceof InterfaceC2819t) {
            i12 |= 4;
        }
        if (cVar instanceof E0) {
            i12 |= 8;
        }
        if (cVar instanceof C0) {
            i12 |= 16;
        }
        if (cVar instanceof C1.i) {
            i12 |= 32;
        }
        if (cVar instanceof A0) {
            i12 |= 64;
        }
        if (cVar instanceof B) {
            i12 |= UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (cVar instanceof InterfaceC2821v) {
            i12 |= 256;
        }
        if (cVar instanceof InterfaceC2541j) {
            i12 |= UserVerificationMethods.USER_VERIFY_NONE;
        }
        if (cVar instanceof FocusTargetNode) {
            i12 |= UserVerificationMethods.USER_VERIFY_ALL;
        }
        if (cVar instanceof j1.o) {
            i12 |= 2048;
        }
        if (cVar instanceof j1.e) {
            i12 |= 4096;
        }
        if (cVar instanceof InterfaceC10180e) {
            i12 |= 8192;
        }
        if (cVar instanceof InterfaceC10971a) {
            i12 |= 16384;
        }
        if (cVar instanceof InterfaceC2803h) {
            i12 |= 32768;
        }
        if (cVar instanceof InterfaceC10182g) {
            i12 |= 131072;
        }
        if (cVar instanceof I0) {
            i12 |= 262144;
        }
        i11.h(i12, cls);
        return i12;
    }

    public static final int g(@NotNull e.c cVar) {
        if (!(cVar instanceof AbstractC2813m)) {
            return f(cVar);
        }
        AbstractC2813m abstractC2813m = (AbstractC2813m) cVar;
        int K12 = abstractC2813m.K1();
        for (e.c J12 = abstractC2813m.J1(); J12 != null; J12 = J12.getChild$ui_release()) {
            K12 |= g(J12);
        }
        return K12;
    }

    public static final boolean h(int i11) {
        return (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }
}
