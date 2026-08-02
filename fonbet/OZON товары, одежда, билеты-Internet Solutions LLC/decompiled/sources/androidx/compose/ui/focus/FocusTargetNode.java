package androidx.compose.ui.focus;

import D1.AbstractC2794c0;
import D1.AbstractC2810k0;
import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import D1.InterfaceC2803h;
import D1.r0;
import D1.s0;
import D1.x0;
import J0.C3349u1;
import Sc.o;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j1.w;
import j1.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class FocusTargetNode extends e.c implements InterfaceC2803h, r0, C1.i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40384a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40385b;

    /* renamed from: c, reason: collision with root package name */
    private w f40386c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "LD1/c0;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FocusTargetElement extends AbstractC2794c0<FocusTargetNode> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final FocusTargetElement f40387a = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // D1.AbstractC2794c0
        /* renamed from: create */
        public final FocusTargetNode getF41119a() {
            return new FocusTargetNode();
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }

        @Override // D1.AbstractC2794c0
        public final /* bridge */ /* synthetic */ void update(FocusTargetNode focusTargetNode) {
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40388a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40388a = iArr;
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M<j1.m> f40389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f40390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M<j1.m> m11, FocusTargetNode focusTargetNode) {
            super(0);
            this.f40389b = m11;
            this.f40390c = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, j1.n] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f40389b.f71787a = this.f40390c.N1();
            return Unit.f71690a;
        }
    }

    private static final boolean P1(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getNode().isAttached()) {
            A1.a.b("visitSubtreeIf called on an unattached node");
            throw null;
        }
        U0.b bVar = new U0.b(new e.c[16]);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            C2809k.a(bVar, focusTargetNode.getNode());
        } else {
            bVar.b(child$ui_release);
        }
        while (true) {
            if (!bVar.p()) {
                break;
            }
            e.c cVar = (e.c) Pk0.b.b(1, bVar);
            if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                for (e.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.getChild$ui_release()) {
                    if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        U0.b bVar2 = null;
                        e.c cVar3 = cVar2;
                        while (cVar3 != null) {
                            if (cVar3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar3;
                                if (focusTargetNode2.f40386c != null) {
                                    int i11 = a.f40388a[focusTargetNode2.O1().ordinal()];
                                    if (i11 == 1 || i11 == 2 || i11 == 3) {
                                        return true;
                                    }
                                    if (i11 != 4) {
                                        throw new o();
                                    }
                                }
                            } else if ((cVar3.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar3 instanceof AbstractC2813m)) {
                                int i12 = 0;
                                for (e.c J12 = ((AbstractC2813m) cVar3).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                    if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            cVar3 = J12;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new U0.b(new e.c[16]);
                                            }
                                            if (cVar3 != null) {
                                                bVar2.b(cVar3);
                                                cVar3 = null;
                                            }
                                            bVar2.b(J12);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            cVar3 = C2809k.b(bVar2);
                        }
                    }
                }
            }
            C2809k.a(bVar, cVar);
        }
        return false;
    }

    private static final boolean Q1(FocusTargetNode focusTargetNode) {
        C2804h0 c02;
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        H f7 = C2809k.f(focusTargetNode);
        while (true) {
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                if (focusTargetNode2.f40386c != null) {
                                    int i11 = a.f40388a[focusTargetNode2.O1().ordinal()];
                                    if (i11 != 1 && i11 != 2) {
                                        if (i11 == 3) {
                                            return true;
                                        }
                                        if (i11 != 4) {
                                            throw new o();
                                        }
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
                                if (i12 == 1) {
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
        return false;
    }

    public final void M1() {
        w f7 = ((AndroidComposeView) C2809k.g(this)).q().b().f(this);
        if (f7 != null) {
            this.f40386c = f7;
        } else {
            A1.a.c("committing a node that was not updated in the current transaction");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @NotNull
    public final j1.n N1() {
        C2804h0 c02;
        j1.n nVar = new j1.n();
        e.c node = getNode();
        if (!getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c node2 = getNode();
        H f7 = C2809k.f(this);
        loop0: while (f7 != null) {
            if ((C3349u1.c(f7) & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & 2048) != 0) {
                            AbstractC2813m abstractC2813m = node2;
                            ?? r62 = 0;
                            while (abstractC2813m != 0) {
                                if (abstractC2813m instanceof j1.o) {
                                    ((j1.o) abstractC2813m).y0(nVar);
                                } else if ((abstractC2813m.getKindSet$ui_release() & 2048) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                    e.c J12 = abstractC2813m.J1();
                                    int i11 = 0;
                                    abstractC2813m = abstractC2813m;
                                    r62 = r62;
                                    while (J12 != null) {
                                        if ((J12.getKindSet$ui_release() & 2048) != 0) {
                                            i11++;
                                            r62 = r62;
                                            if (i11 == 1) {
                                                abstractC2813m = J12;
                                            } else {
                                                if (r62 == 0) {
                                                    r62 = new U0.b(new e.c[16]);
                                                }
                                                if (abstractC2813m != 0) {
                                                    r62.b(abstractC2813m);
                                                    abstractC2813m = 0;
                                                }
                                                r62.b(J12);
                                            }
                                        }
                                        J12 = J12.getChild$ui_release();
                                        abstractC2813m = abstractC2813m;
                                        r62 = r62;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2813m = C2809k.b(r62);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            node2 = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
        }
        return nVar;
    }

    @NotNull
    public final w O1() {
        w f7;
        H B02;
        x0 f02;
        j1.l q11;
        AbstractC2810k0 coordinator$ui_release = getNode().getCoordinator$ui_release();
        x b11 = (coordinator$ui_release == null || (B02 = coordinator$ui_release.B0()) == null || (f02 = B02.f0()) == null || (q11 = ((AndroidComposeView) f02).q()) == null) ? null : q11.b();
        if (b11 != null && (f7 = b11.f(this)) != null) {
            return f7;
        }
        w wVar = this.f40386c;
        return wVar == null ? w.Inactive : wVar;
    }

    public final void R1() {
        boolean z11;
        w wVar = this.f40386c;
        if (wVar == null) {
            if (wVar != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            x b11 = ((AndroidComposeView) C2809k.g(this)).q().b();
            try {
                z11 = b11.f68745c;
                if (z11) {
                    x.b(b11);
                }
                x.a(b11);
                S1((Q1(this) && P1(this)) ? w.ActiveParent : w.Inactive);
                Unit unit = Unit.f71690a;
                x.c(b11);
            } catch (Throwable th2) {
                x.c(b11);
                throw th2;
            }
        }
        int i11 = a.f40388a[O1().ordinal()];
        if (i11 == 1 || i11 == 2) {
            M m11 = new M();
            s0.a(this, new b(m11, this));
            T t2 = m11.f71787a;
            if (t2 == 0) {
                Intrinsics.n("focusProperties");
                throw null;
            }
            if (((j1.m) t2).c()) {
                return;
            }
            ((AndroidComposeView) C2809k.g(this)).q().g(true);
        }
    }

    public final void S1(@NotNull w wVar) {
        ((AndroidComposeView) C2809k.g(this)).q().b().g(this, wVar);
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        boolean z11;
        int i11 = a.f40388a[O1().ordinal()];
        if (i11 == 1 || i11 == 2) {
            ((AndroidComposeView) C2809k.g(this)).q().e(8, true, false);
            ((FocusOwnerImpl) ((AndroidComposeView) C2809k.g(this)).q()).r(this);
        } else if (i11 == 3) {
            x b11 = ((AndroidComposeView) C2809k.g(this)).q().b();
            try {
                z11 = b11.f68745c;
                if (z11) {
                    x.b(b11);
                }
                x.a(b11);
                S1(w.Inactive);
                Unit unit = Unit.f71690a;
                x.c(b11);
            } catch (Throwable th2) {
                x.c(b11);
                throw th2;
            }
        }
        this.f40386c = null;
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        w O12 = O1();
        R1();
        if (O12 != O1()) {
            j1.f.b(this);
        }
    }
}
