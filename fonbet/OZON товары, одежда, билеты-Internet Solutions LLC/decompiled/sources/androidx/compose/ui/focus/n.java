package androidx.compose.ui.focus;

import B1.InterfaceC2544m;
import D1.AbstractC2813m;
import D1.C2809k;
import Sc.o;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.C7237a;
import j1.w;
import k1.C7460f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40412a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40412a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<InterfaceC2544m.a, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f40413b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7460f f40414c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40415d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f40416e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, FocusTargetNode focusTargetNode, C7460f c7460f, Function1 function1) {
            super(1);
            this.f40413b = focusTargetNode;
            this.f40414c = c7460f;
            this.f40415d = i11;
            this.f40416e = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(InterfaceC2544m.a aVar) {
            InterfaceC2544m.a aVar2 = aVar;
            Function1<FocusTargetNode, Boolean> function1 = this.f40416e;
            boolean j11 = n.j(this.f40415d, this.f40413b, this.f40414c, function1);
            Boolean valueOf = Boolean.valueOf(j11);
            if (j11 || !aVar2.a()) {
                return valueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean b(C7460f c7460f, C7460f c7460f2, C7460f c7460f3, int i11) {
        float q11;
        float h11;
        float q12;
        float h12;
        float f7;
        float max;
        float h13;
        float h14;
        float q13;
        float q14;
        float f11;
        if (c(i11, c7460f3, c7460f) || !c(i11, c7460f2, c7460f)) {
            return false;
        }
        if (i11 == 3) {
            if (c7460f.n() < c7460f3.o()) {
                return true;
            }
        } else if (i11 == 4) {
            if (c7460f.o() > c7460f3.n()) {
                return true;
            }
        } else if (i11 == 5) {
            if (c7460f.q() < c7460f3.h()) {
                return true;
            }
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c7460f.h() > c7460f3.q()) {
                return true;
            }
        }
        if (i11 == 3 || i11 == 4) {
            return true;
        }
        if (i11 == 3) {
            q12 = c7460f.n();
            h12 = c7460f2.o();
        } else {
            if (i11 == 4) {
                q11 = c7460f2.n();
                h11 = c7460f.o();
            } else if (i11 == 5) {
                q12 = c7460f.q();
                h12 = c7460f2.h();
            } else {
                if (i11 != 6) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                q11 = c7460f2.q();
                h11 = c7460f.h();
            }
            f7 = q11 - h11;
            max = Math.max(0.0f, f7);
            if (i11 == 3) {
                if (i11 == 4) {
                    h13 = c7460f3.o();
                    h14 = c7460f.o();
                } else if (i11 == 5) {
                    q13 = c7460f.q();
                    q14 = c7460f3.q();
                } else {
                    if (i11 != 6) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    h13 = c7460f3.h();
                    h14 = c7460f.h();
                }
                f11 = h13 - h14;
                return max < Math.max(1.0f, f11);
            }
            q13 = c7460f.n();
            q14 = c7460f3.n();
            f11 = q13 - q14;
            if (max < Math.max(1.0f, f11)) {
            }
        }
        f7 = q12 - h12;
        max = Math.max(0.0f, f7);
        if (i11 == 3) {
        }
        f11 = q13 - q14;
        if (max < Math.max(1.0f, f11)) {
        }
    }

    private static final boolean c(int i11, C7460f c7460f, C7460f c7460f2) {
        if (i11 == 3 || i11 == 4) {
            return c7460f.h() > c7460f2.q() && c7460f.q() < c7460f2.h();
        }
        if (i11 == 5 || i11 == 6) {
            return c7460f.o() > c7460f2.n() && c7460f.n() < c7460f2.o();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final void d(FocusTargetNode focusTargetNode, U0.b bVar) {
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        U0.b bVar2 = new U0.b(new e.c[16]);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            C2809k.a(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.b(child$ui_release);
        }
        while (bVar2.p()) {
            e.c cVar = (e.c) Pk0.b.b(1, bVar2);
            if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                C2809k.a(bVar2, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        U0.b bVar3 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                if (focusTargetNode2.isAttached() && !C2809k.f(focusTargetNode2).A0()) {
                                    if (focusTargetNode2.N1().c()) {
                                        bVar.b(focusTargetNode2);
                                    } else {
                                        d(focusTargetNode2, bVar);
                                    }
                                }
                            } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                int i11 = 0;
                                for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                    if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar = J12;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new U0.b(new e.c[16]);
                                            }
                                            if (cVar != null) {
                                                bVar3.b(cVar);
                                                cVar = null;
                                            }
                                            bVar3.b(J12);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVar = C2809k.b(bVar3);
                        }
                    } else {
                        cVar = cVar.getChild$ui_release();
                    }
                }
            }
        }
    }

    private static final FocusTargetNode e(U0.b<FocusTargetNode> bVar, C7460f c7460f, int i11) {
        C7460f z11;
        if (i11 == 3) {
            z11 = c7460f.z(c7460f.u() + 1, 0.0f);
        } else if (i11 == 4) {
            z11 = c7460f.z(-(c7460f.u() + 1), 0.0f);
        } else if (i11 == 5) {
            z11 = c7460f.z(0.0f, c7460f.m() + 1);
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            z11 = c7460f.z(0.0f, -(c7460f.m() + 1));
        }
        int m11 = bVar.m();
        FocusTargetNode focusTargetNode = null;
        if (m11 > 0) {
            FocusTargetNode[] l11 = bVar.l();
            int i12 = 0;
            do {
                FocusTargetNode focusTargetNode2 = l11[i12];
                if (k.f(focusTargetNode2)) {
                    C7460f c11 = k.c(focusTargetNode2);
                    if (h(i11, c11, c7460f) && (!h(i11, z11, c7460f) || b(c7460f, c11, z11, i11) || (!b(c7460f, z11, c11, i11) && i(i11, c7460f, c11) < i(i11, c7460f, z11)))) {
                        focusTargetNode = focusTargetNode2;
                        z11 = c11;
                    }
                }
                i12++;
            } while (i12 < m11);
        }
        return focusTargetNode;
    }

    public static final boolean f(@NotNull FocusTargetNode focusTargetNode, int i11, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        C7460f c7460f;
        U0.b bVar = new U0.b(new FocusTargetNode[16]);
        d(focusTargetNode, bVar);
        if (bVar.m() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (bVar.o() ? null : bVar.l()[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
        } else {
            if (i11 == 7) {
                i11 = 4;
            }
            if (i11 == 4 || i11 == 6) {
                C7460f c11 = k.c(focusTargetNode);
                c7460f = new C7460f(c11.n(), c11.q(), c11.n(), c11.q());
            } else {
                if (i11 != 3 && i11 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C7460f c12 = k.c(focusTargetNode);
                c7460f = new C7460f(c12.o(), c12.h(), c12.o(), c12.h());
            }
            FocusTargetNode e11 = e(bVar, c7460f, i11);
            if (e11 != null) {
                return function1.invoke(e11).booleanValue();
            }
        }
        return false;
    }

    private static final boolean g(int i11, FocusTargetNode focusTargetNode, C7460f c7460f, Function1 function1) {
        if (j(i11, focusTargetNode, c7460f, function1)) {
            return true;
        }
        Boolean bool = (Boolean) C7237a.a(focusTargetNode, i11, new b(i11, focusTargetNode, c7460f, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean h(int i11, C7460f c7460f, C7460f c7460f2) {
        if (i11 == 3) {
            return (c7460f2.o() > c7460f.o() || c7460f2.n() >= c7460f.o()) && c7460f2.n() > c7460f.n();
        }
        if (i11 == 4) {
            return (c7460f2.n() < c7460f.n() || c7460f2.o() <= c7460f.n()) && c7460f2.o() < c7460f.o();
        }
        if (i11 == 5) {
            return (c7460f2.h() > c7460f.h() || c7460f2.q() >= c7460f.h()) && c7460f2.q() > c7460f.q();
        }
        if (i11 == 6) {
            return (c7460f2.q() < c7460f.q() || c7460f2.h() <= c7460f.q()) && c7460f2.h() < c7460f.h();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final long i(int i11, C7460f c7460f, C7460f c7460f2) {
        float q11;
        float h11;
        float f7;
        float m11;
        float q12;
        float m12;
        if (i11 == 3) {
            q11 = c7460f.n();
            h11 = c7460f2.o();
        } else if (i11 == 4) {
            q11 = c7460f2.n();
            h11 = c7460f.o();
        } else if (i11 == 5) {
            q11 = c7460f.q();
            h11 = c7460f2.h();
        } else {
            if (i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            q11 = c7460f2.q();
            h11 = c7460f.h();
        }
        long abs = (long) Math.abs(Math.max(0.0f, q11 - h11));
        if (i11 == 3 || i11 == 4) {
            f7 = 2;
            m11 = (c7460f.m() / f7) + c7460f.q();
            q12 = c7460f2.q();
            m12 = c7460f2.m();
        } else {
            if (i11 != 5 && i11 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f7 = 2;
            m11 = (c7460f.u() / f7) + c7460f.n();
            q12 = c7460f2.n();
            m12 = c7460f2.u();
        }
        long abs2 = (long) Math.abs(m11 - ((m12 / f7) + q12));
        return (abs2 * abs2) + (13 * abs * abs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(int i11, FocusTargetNode focusTargetNode, C7460f c7460f, Function1 function1) {
        FocusTargetNode e11;
        U0.b bVar = new U0.b(new FocusTargetNode[16]);
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        U0.b bVar2 = new U0.b(new e.c[16]);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            C2809k.a(bVar2, focusTargetNode.getNode());
        } else {
            bVar2.b(child$ui_release);
        }
        while (bVar2.p()) {
            e.c cVar = (e.c) Pk0.b.b(1, bVar2);
            if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                C2809k.a(bVar2, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        U0.b bVar3 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                if (focusTargetNode2.isAttached()) {
                                    bVar.b(focusTargetNode2);
                                }
                            } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                int i12 = 0;
                                for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                    if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVar = J12;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new U0.b(new e.c[16]);
                                            }
                                            if (cVar != null) {
                                                bVar3.b(cVar);
                                                cVar = null;
                                            }
                                            bVar3.b(J12);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVar = C2809k.b(bVar3);
                        }
                    } else {
                        cVar = cVar.getChild$ui_release();
                    }
                }
            }
        }
        while (bVar.p() && (e11 = e(bVar, c7460f, i11)) != null) {
            if (e11.N1().c()) {
                return ((Boolean) ((FocusOwnerImpl.c) function1).invoke(e11)).booleanValue();
            }
            if (g(i11, e11, c7460f, function1)) {
                return true;
            }
            bVar.s(e11);
        }
        return false;
    }

    public static final Boolean k(int i11, @NotNull FocusTargetNode focusTargetNode, C7460f c7460f, @NotNull Function1 function1) {
        w O12 = focusTargetNode.O1();
        int[] iArr = a.f40412a;
        int i12 = iArr[O12.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(f(focusTargetNode, i11, function1));
            }
            if (i12 == 4) {
                return focusTargetNode.N1().c() ? (Boolean) ((FocusOwnerImpl.c) function1).invoke(focusTargetNode) : c7460f == null ? Boolean.valueOf(f(focusTargetNode, i11, function1)) : Boolean.valueOf(j(i11, focusTargetNode, c7460f, function1));
            }
            throw new o();
        }
        FocusTargetNode e11 = k.e(focusTargetNode);
        if (e11 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i13 = iArr[e11.O1().ordinal()];
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3) {
                if (c7460f == null) {
                    c7460f = k.c(e11);
                }
                return Boolean.valueOf(g(i11, focusTargetNode, c7460f, function1));
            }
            if (i13 != 4) {
                throw new o();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        Boolean k11 = k(i11, e11, c7460f, function1);
        if (!Intrinsics.d(k11, Boolean.FALSE)) {
            return k11;
        }
        if (c7460f == null) {
            if (e11.O1() != w.ActiveParent) {
                throw new IllegalStateException("Searching for active node in inactive hierarchy");
            }
            FocusTargetNode b11 = k.b(e11);
            if (b11 == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            c7460f = k.c(b11);
        }
        return Boolean.valueOf(g(i11, focusTargetNode, c7460f, function1));
    }
}
