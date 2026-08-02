package androidx.compose.ui.focus;

import B1.C;
import D1.AbstractC2810k0;
import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import J0.C3349u1;
import Sc.o;
import Z1.s;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.r;
import j1.w;
import k1.C7460f;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40404a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40405b;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40404a = iArr;
            int[] iArr2 = new int[w.values().length];
            try {
                iArr2[w.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[w.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[w.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[w.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f40405b = iArr2;
        }
    }

    @NotNull
    public static final r a(@NotNull FocusTargetNode focusTargetNode, int i11, @NotNull s sVar) {
        r f7;
        r rVar;
        r rVar2;
        r m11;
        r rVar3;
        j1.n N12 = focusTargetNode.N1();
        if (i11 == 1) {
            return N12.j();
        }
        if (i11 == 2) {
            return N12.k();
        }
        if (i11 == 5) {
            return N12.n();
        }
        if (i11 == 6) {
            return N12.e();
        }
        if (i11 == 3) {
            int i12 = a.f40404a[sVar.ordinal()];
            if (i12 == 1) {
                m11 = N12.m();
            } else {
                if (i12 != 2) {
                    throw new o();
                }
                m11 = N12.f();
            }
            rVar3 = r.f68738b;
            rVar2 = m11 != rVar3 ? m11 : null;
            return rVar2 == null ? N12.i() : rVar2;
        }
        if (i11 != 4) {
            if (i11 == 7) {
                return N12.g().invoke(j1.c.a(i11));
            }
            if (i11 == 8) {
                return N12.h().invoke(j1.c.a(i11));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int i13 = a.f40404a[sVar.ordinal()];
        if (i13 == 1) {
            f7 = N12.f();
        } else {
            if (i13 != 2) {
                throw new o();
            }
            f7 = N12.m();
        }
        rVar = r.f68738b;
        rVar2 = f7 != rVar ? f7 : null;
        return rVar2 == null ? N12.l() : rVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0049, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode b(@NotNull FocusTargetNode focusTargetNode) {
        int i11 = a.f40405b[focusTargetNode.O1().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (!focusTargetNode.getNode().isAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                U0.b bVar = new U0.b(new e.c[16]);
                e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    C2809k.a(bVar, focusTargetNode.getNode());
                } else {
                    bVar.b(child$ui_release);
                }
                while (bVar.p()) {
                    e.c cVar = (e.c) Pk0.b.b(1, bVar);
                    if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        C2809k.a(bVar, cVar);
                    } else {
                        while (true) {
                            if (cVar == null) {
                                break;
                            }
                            if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                U0.b bVar2 = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        FocusTargetNode b11 = b((FocusTargetNode) cVar);
                                        if (b11 != null) {
                                            return b11;
                                        }
                                    } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                        int i12 = 0;
                                        for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                            if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVar = J12;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new U0.b(new e.c[16]);
                                                    }
                                                    if (cVar != null) {
                                                        bVar2.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar2.b(J12);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVar = C2809k.b(bVar2);
                                }
                            } else {
                                cVar = cVar.getChild$ui_release();
                            }
                        }
                    }
                }
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw new o();
                }
            }
            return null;
        }
        return focusTargetNode;
    }

    @NotNull
    public static final C7460f c(@NotNull FocusTargetNode focusTargetNode) {
        C7460f c7460f;
        AbstractC2810k0 coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return C.c(coordinator$ui_release).K(coordinator$ui_release, false);
        }
        c7460f = C7460f.f70279e;
        return c7460f;
    }

    public static final Boolean d(@NotNull FocusTargetNode focusTargetNode, int i11, @NotNull s sVar, C7460f c7460f, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        C2804h0 c02;
        if (i11 == 1 || i11 == 2) {
            return Boolean.valueOf(m.e(focusTargetNode, i11, function1));
        }
        int i12 = 3;
        if (i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6) {
            return n.k(i11, focusTargetNode, c7460f, function1);
        }
        FocusTargetNode focusTargetNode2 = null;
        if (i11 == 7) {
            int i13 = a.f40404a[sVar.ordinal()];
            if (i13 == 1) {
                i12 = 4;
            } else if (i13 != 2) {
                throw new o();
            }
            FocusTargetNode b11 = b(focusTargetNode);
            if (b11 != null) {
                return n.k(i12, b11, c7460f, function1);
            }
            return null;
        }
        if (i11 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) j1.c.c(i11))).toString());
        }
        FocusTargetNode b12 = b(focusTargetNode);
        boolean z11 = false;
        if (b12 != null) {
            if (!b12.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = b12.getNode().getParent$ui_release();
            H f7 = C2809k.f(b12);
            loop0: while (true) {
                if (f7 == null) {
                    break;
                }
                if ((C3349u1.c(f7) & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            e.c cVar = parent$ui_release;
                            U0.b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                                    if (focusTargetNode3.N1().c()) {
                                        focusTargetNode2 = focusTargetNode3;
                                        break loop0;
                                    }
                                } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                    int i14 = 0;
                                    for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                        if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                cVar = J12;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new U0.b(new e.c[16]);
                                                }
                                                if (cVar != null) {
                                                    bVar.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar.b(J12);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                cVar = C2809k.b(bVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                f7 = f7.g0();
                parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
            }
        }
        if (focusTargetNode2 != null && !focusTargetNode2.equals(focusTargetNode)) {
            z11 = ((Boolean) ((FocusOwnerImpl.c) function1).invoke(focusTargetNode2)).booleanValue();
        }
        return Boolean.valueOf(z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0035, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusTargetNode e(@NotNull FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getNode().isAttached()) {
            if (!focusTargetNode.getNode().isAttached()) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            U0.b bVar = new U0.b(new e.c[16]);
            e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                C2809k.a(bVar, focusTargetNode.getNode());
            } else {
                bVar.b(child$ui_release);
            }
            while (bVar.p()) {
                e.c cVar = (e.c) Pk0.b.b(1, bVar);
                if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                    C2809k.a(bVar, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        }
                        if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            U0.b bVar2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.getNode().isAttached()) {
                                        int i11 = a.f40405b[focusTargetNode2.O1().ordinal()];
                                        if (i11 == 1 || i11 == 2 || i11 == 3) {
                                            return focusTargetNode2;
                                        }
                                    }
                                } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                    int i12 = 0;
                                    for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                        if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                cVar = J12;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new U0.b(new e.c[16]);
                                                }
                                                if (cVar != null) {
                                                    bVar2.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar2.b(J12);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                cVar = C2809k.b(bVar2);
                            }
                        } else {
                            cVar = cVar.getChild$ui_release();
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean f(@NotNull FocusTargetNode focusTargetNode) {
        H B02;
        AbstractC2810k0 coordinator$ui_release;
        H B03;
        AbstractC2810k0 coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (B02 = coordinator$ui_release2.B0()) == null || !B02.B0() || (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) == null || (B03 = coordinator$ui_release.B0()) == null || !B03.z0()) ? false : true;
    }
}
