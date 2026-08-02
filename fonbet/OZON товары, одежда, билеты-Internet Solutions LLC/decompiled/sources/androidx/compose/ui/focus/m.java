package androidx.compose.ui.focus;

import B1.InterfaceC2544m;
import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import J0.C3349u1;
import Sc.o;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.C7237a;
import j1.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40407a;

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
            f40407a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<InterfaceC2544m.a, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f40408b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f40409c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40410d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<FocusTargetNode, Boolean> f40411e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i11, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f40408b = focusTargetNode;
            this.f40409c = focusTargetNode2;
            this.f40410d = i11;
            this.f40411e = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(InterfaceC2544m.a aVar) {
            InterfaceC2544m.a aVar2 = aVar;
            boolean h11 = m.h(this.f40408b, this.f40409c, this.f40410d, this.f40411e);
            Boolean valueOf = Boolean.valueOf(h11);
            if (h11 || !aVar2.a()) {
                return valueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean b(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        w O12 = focusTargetNode.O1();
        int[] iArr = a.f40407a;
        int i11 = iArr[O12.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return f(focusTargetNode, function1);
            }
            if (i11 != 4) {
                throw new o();
            }
            if (!f(focusTargetNode, function1)) {
                if (!(focusTargetNode.N1().c() ? ((Boolean) ((FocusOwnerImpl.c) function1).invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode e11 = k.e(focusTargetNode);
        if (e11 == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[e11.O1().ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return d(focusTargetNode, e11, 2, function1);
            }
            if (i12 != 4) {
                throw new o();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (b(e11, function1) || d(focusTargetNode, e11, 2, function1) || (e11.N1().c() && ((Boolean) ((FocusOwnerImpl.c) function1).invoke(e11)).booleanValue())) {
            return true;
        }
    }

    private static final boolean c(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int i11 = a.f40407a[focusTargetNode.O1().ordinal()];
        if (i11 == 1) {
            FocusTargetNode e11 = k.e(focusTargetNode);
            if (e11 != null) {
                return c(e11, function1) || d(focusTargetNode, e11, 1, function1);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i11 == 2 || i11 == 3) {
            return g(focusTargetNode, function1);
        }
        if (i11 == 4) {
            return focusTargetNode.N1().c() ? ((Boolean) ((FocusOwnerImpl.c) function1).invoke(focusTargetNode)).booleanValue() : g(focusTargetNode, function1);
        }
        throw new o();
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i11, Function1<? super FocusTargetNode, Boolean> function1) {
        if (h(focusTargetNode, focusTargetNode2, i11, function1)) {
            return true;
        }
        Boolean bool = (Boolean) C7237a.a(focusTargetNode, i11, new b(focusTargetNode, focusTargetNode2, i11, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean e(@NotNull FocusTargetNode focusTargetNode, int i11, @NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        if (i11 == 1) {
            return c(focusTargetNode, function1);
        }
        if (i11 == 2) {
            return b(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean f(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
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
                                bVar.b((FocusTargetNode) cVar);
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
        bVar.z(l.f40406a);
        int m11 = bVar.m();
        if (m11 > 0) {
            int i12 = m11 - 1;
            Object[] l11 = bVar.l();
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) l11[i12];
                if (k.f(focusTargetNode2) && b(focusTargetNode2, function1)) {
                    return true;
                }
                i12--;
            } while (i12 >= 0);
        }
        return false;
    }

    private static final boolean g(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
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
                                bVar.b((FocusTargetNode) cVar);
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
        bVar.z(l.f40406a);
        int m11 = bVar.m();
        if (m11 > 0) {
            Object[] l11 = bVar.l();
            int i12 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) l11[i12];
                if (k.f(focusTargetNode2) && c(focusTargetNode2, function1)) {
                    return true;
                }
                i12++;
            } while (i12 < m11);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i11, Function1<? super FocusTargetNode, Boolean> function1) {
        e.c cVar;
        C2804h0 c02;
        if (focusTargetNode.O1() != w.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
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
        while (true) {
            cVar = null;
            if (!bVar2.p()) {
                break;
            }
            e.c cVar2 = (e.c) Pk0.b.b(1, bVar2);
            if ((cVar2.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                C2809k.a(bVar2, cVar2);
            } else {
                while (true) {
                    if (cVar2 == null) {
                        break;
                    }
                    if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        U0.b bVar3 = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof FocusTargetNode) {
                                bVar.b((FocusTargetNode) cVar2);
                            } else if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar2 instanceof AbstractC2813m)) {
                                int i12 = 0;
                                for (e.c J12 = ((AbstractC2813m) cVar2).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                    if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVar2 = J12;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new U0.b(new e.c[16]);
                                            }
                                            if (cVar2 != null) {
                                                bVar3.b(cVar2);
                                                cVar2 = null;
                                            }
                                            bVar3.b(J12);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVar2 = C2809k.b(bVar3);
                        }
                    } else {
                        cVar2 = cVar2.getChild$ui_release();
                    }
                }
            }
        }
        bVar.z(l.f40406a);
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            IntRange intRange = new IntRange(0, bVar.m() - 1, 1);
            int f71842a = intRange.getF71842a();
            int f71843b = intRange.getF71843b();
            if (f71842a <= f71843b) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) bVar.l()[f71843b];
                        if (k.f(focusTargetNode3) && b(focusTargetNode3, function1)) {
                            break;
                        }
                    }
                    if (Intrinsics.d(bVar.l()[f71843b], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (f71843b == f71842a) {
                        break;
                    }
                    f71843b--;
                }
                return true;
            }
            if (i11 != 1) {
                if (focusTargetNode.getNode().isAttached()) {
                }
            }
            return false;
        }
        IntRange intRange2 = new IntRange(0, bVar.m() - 1, 1);
        int f71842a2 = intRange2.getF71842a();
        int f71843b2 = intRange2.getF71843b();
        if (f71842a2 <= f71843b2) {
            boolean z12 = false;
            while (true) {
                if (z12) {
                    FocusTargetNode focusTargetNode4 = (FocusTargetNode) bVar.l()[f71842a2];
                    if (k.f(focusTargetNode4) && c(focusTargetNode4, function1)) {
                        break;
                    }
                }
                if (Intrinsics.d(bVar.l()[f71842a2], focusTargetNode2)) {
                    z12 = true;
                }
                if (f71842a2 == f71843b2) {
                    break;
                }
                f71842a2++;
            }
            return true;
        }
        if (i11 != 1 && focusTargetNode.N1().c()) {
            if (focusTargetNode.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
            H f7 = C2809k.f(focusTargetNode);
            loop5: while (true) {
                if (f7 == null) {
                    break;
                }
                if ((C3349u1.c(f7) & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            e.c cVar3 = parent$ui_release;
                            U0.b bVar4 = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof FocusTargetNode) {
                                    cVar = cVar3;
                                    break loop5;
                                }
                                if ((cVar3.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar3 instanceof AbstractC2813m)) {
                                    int i13 = 0;
                                    for (e.c J13 = ((AbstractC2813m) cVar3).J1(); J13 != null; J13 = J13.getChild$ui_release()) {
                                        if ((J13.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                cVar3 = J13;
                                            } else {
                                                if (bVar4 == null) {
                                                    bVar4 = new U0.b(new e.c[16]);
                                                }
                                                if (cVar3 != null) {
                                                    bVar4.b(cVar3);
                                                    cVar3 = null;
                                                }
                                                bVar4.b(J13);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                cVar3 = C2809k.b(bVar4);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                f7 = f7.g0();
                parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
            }
            if (cVar != null) {
                return ((Boolean) ((FocusOwnerImpl.c) function1).invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }
}
