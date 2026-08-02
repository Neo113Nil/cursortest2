package D1;

import D1.C2806i0;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2804h0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H f5462a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2823x f5463b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC2810k0 f5464c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final G0 f5465d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private e.c f5466e;

    /* renamed from: f, reason: collision with root package name */
    private U0.b<e.b> f5467f;

    /* renamed from: g, reason: collision with root package name */
    private U0.b<e.b> f5468g;

    /* renamed from: h, reason: collision with root package name */
    private a f5469h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1.h0$a */
    /* loaded from: classes8.dex */
    final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private e.c f5470a;

        /* renamed from: b, reason: collision with root package name */
        private int f5471b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private U0.b<e.b> f5472c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private U0.b<e.b> f5473d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f5474e;

        public a(@NotNull e.c cVar, int i11, @NotNull U0.b<e.b> bVar, @NotNull U0.b<e.b> bVar2, boolean z11) {
            this.f5470a = cVar;
            this.f5471b = i11;
            this.f5472c = bVar;
            this.f5473d = bVar2;
            this.f5474e = z11;
        }

        public final boolean a(int i11, int i12) {
            e.b bVar = this.f5472c.l()[this.f5471b + i11];
            e.b bVar2 = this.f5473d.l()[this.f5471b + i12];
            int i13 = C2806i0.f5477b;
            return Intrinsics.d(bVar, bVar2) || bVar.getClass() == bVar2.getClass();
        }

        public final void b(int i11) {
            int i12 = this.f5471b + i11;
            e.c cVar = this.f5470a;
            e.b bVar = this.f5473d.l()[i12];
            C2804h0 c2804h0 = C2804h0.this;
            e.c a11 = C2804h0.a(c2804h0, bVar, cVar);
            this.f5470a = a11;
            if (!this.f5474e) {
                a11.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            e.c child$ui_release = a11.getChild$ui_release();
            Intrinsics.f(child$ui_release);
            AbstractC2810k0 coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
            Intrinsics.f(coordinator$ui_release);
            E c11 = C2809k.c(this.f5470a);
            if (c11 != null) {
                F f7 = new F(c2804h0.j(), c11);
                this.f5470a.updateCoordinator$ui_release(f7);
                C2804h0.d(c2804h0, this.f5470a, f7);
                f7.E2(coordinator$ui_release.g2());
                f7.D2(coordinator$ui_release);
                coordinator$ui_release.E2(f7);
            } else {
                this.f5470a.updateCoordinator$ui_release(coordinator$ui_release);
            }
            this.f5470a.markAsAttached$ui_release();
            this.f5470a.runAttachLifecycle$ui_release();
            p0.a(this.f5470a);
        }

        public final void c() {
            e.c child$ui_release = this.f5470a.getChild$ui_release();
            Intrinsics.f(child$ui_release);
            C2804h0 c2804h0 = C2804h0.this;
            c2804h0.getClass();
            if ((child$ui_release.getKindSet$ui_release() & 2) != 0) {
                AbstractC2810k0 coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                Intrinsics.f(coordinator$ui_release);
                AbstractC2810k0 g22 = coordinator$ui_release.g2();
                AbstractC2810k0 f22 = coordinator$ui_release.f2();
                Intrinsics.f(f22);
                if (g22 != null) {
                    g22.D2(f22);
                }
                f22.E2(g22);
                C2804h0.d(c2804h0, this.f5470a, f22);
            }
            this.f5470a = C2804h0.b(c2804h0, child$ui_release);
        }

        public final void d(int i11, int i12) {
            e.c child$ui_release = this.f5470a.getChild$ui_release();
            Intrinsics.f(child$ui_release);
            this.f5470a = child$ui_release;
            U0.b<e.b> bVar = this.f5472c;
            e.b bVar2 = bVar.l()[this.f5471b + i11];
            U0.b<e.b> bVar3 = this.f5473d;
            e.b bVar4 = bVar3.l()[this.f5471b + i12];
            boolean d11 = Intrinsics.d(bVar2, bVar4);
            C2804h0 c2804h0 = C2804h0.this;
            if (d11) {
                c2804h0.getClass();
            } else {
                C2804h0.e(c2804h0, bVar2, bVar4, this.f5470a);
            }
        }

        public final void e(@NotNull U0.b<e.b> bVar) {
            this.f5473d = bVar;
        }

        public final void f(@NotNull U0.b<e.b> bVar) {
            this.f5472c = bVar;
        }

        public final void g(@NotNull e.c cVar) {
            this.f5470a = cVar;
        }

        public final void h(int i11) {
            this.f5471b = i11;
        }

        public final void i(boolean z11) {
            this.f5474e = z11;
        }
    }

    public C2804h0(@NotNull H h11) {
        this.f5462a = h11;
        C2823x c2823x = new C2823x(h11);
        this.f5463b = c2823x;
        this.f5464c = c2823x;
        G0 Q22 = c2823x.Q2();
        this.f5465d = Q22;
        this.f5466e = Q22;
    }

    public static final /* synthetic */ e.c a(C2804h0 c2804h0, e.b bVar, e.c cVar) {
        c2804h0.getClass();
        return f(bVar, cVar);
    }

    public static final /* synthetic */ e.c b(C2804h0 c2804h0, e.c cVar) {
        c2804h0.getClass();
        return g(cVar);
    }

    public static final int c(C2804h0 c2804h0) {
        return c2804h0.f5466e.getAggregateChildKindSet$ui_release();
    }

    public static final void d(C2804h0 c2804h0, e.c cVar, AbstractC2810k0 abstractC2810k0) {
        C2806i0.a aVar;
        c2804h0.getClass();
        for (e.c parent$ui_release = cVar.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            aVar = C2806i0.f5476a;
            if (parent$ui_release == aVar) {
                H g02 = c2804h0.f5462a.g0();
                abstractC2810k0.E2(g02 != null ? g02.J() : null);
                c2804h0.f5464c = abstractC2810k0;
                return;
            } else {
                if ((parent$ui_release.getKindSet$ui_release() & 2) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(abstractC2810k0);
            }
        }
    }

    public static final /* synthetic */ void e(C2804h0 c2804h0, e.b bVar, e.b bVar2, e.c cVar) {
        c2804h0.getClass();
        x(bVar, bVar2, cVar);
    }

    private static e.c f(e.b bVar, e.c cVar) {
        e.c c2793c;
        if (bVar instanceof AbstractC2794c0) {
            c2793c = ((AbstractC2794c0) bVar).getF41119a();
            c2793c.setKindSet$ui_release(p0.g(c2793c));
        } else {
            c2793c = new C2793c(bVar);
        }
        if (c2793c.isAttached()) {
            A1.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        c2793c.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        e.c child$ui_release = cVar.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(c2793c);
            c2793c.setChild$ui_release(child$ui_release);
        }
        cVar.setChild$ui_release(c2793c);
        c2793c.setParent$ui_release(cVar);
        return c2793c;
    }

    private static e.c g(e.c cVar) {
        if (cVar.isAttached()) {
            int i11 = p0.f5546b;
            if (!cVar.isAttached()) {
                A1.a.b("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            p0.b(cVar, -1, 2);
            cVar.runDetachLifecycle$ui_release();
            cVar.markAsDetached$ui_release();
        }
        e.c child$ui_release = cVar.getChild$ui_release();
        e.c parent$ui_release = cVar.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            cVar.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            cVar.setParent$ui_release(null);
        }
        Intrinsics.f(parent$ui_release);
        return parent$ui_release;
    }

    private final void u(int i11, U0.b<e.b> bVar, U0.b<e.b> bVar2, e.c cVar, boolean z11) {
        C2804h0 c2804h0;
        int i12;
        U0.b<e.b> bVar3;
        U0.b<e.b> bVar4;
        C2806i0.a aVar;
        a aVar2 = this.f5469h;
        if (aVar2 == null) {
            c2804h0 = this;
            i12 = i11;
            bVar3 = bVar;
            bVar4 = bVar2;
            a aVar3 = c2804h0.new a(cVar, i12, bVar3, bVar4, z11);
            c2804h0.f5469h = aVar3;
            aVar2 = aVar3;
        } else {
            c2804h0 = this;
            i12 = i11;
            bVar3 = bVar;
            bVar4 = bVar2;
            aVar2.g(cVar);
            aVar2.h(i12);
            aVar2.f(bVar3);
            aVar2.e(bVar4);
            aVar2.i(z11);
        }
        C2800f0.a(bVar3.m() - i12, bVar4.m() - i12, aVar2);
        int i13 = 0;
        for (e.c parent$ui_release = c2804h0.f5465d.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            aVar = C2806i0.f5476a;
            if (parent$ui_release == aVar) {
                return;
            }
            i13 |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(i13);
        }
    }

    private static void x(e.b bVar, e.b bVar2, e.c cVar) {
        if ((bVar instanceof AbstractC2794c0) && (bVar2 instanceof AbstractC2794c0)) {
            int i11 = C2806i0.f5477b;
            Intrinsics.g(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC2794c0) bVar2).update(cVar);
            if (cVar.isAttached()) {
                p0.d(cVar);
                return;
            } else {
                cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(cVar instanceof C2793c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((C2793c) cVar).N1(bVar2);
        if (cVar.isAttached()) {
            p0.d(cVar);
        } else {
            cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    @NotNull
    public final e.c h() {
        return this.f5466e;
    }

    @NotNull
    public final C2823x i() {
        return this.f5463b;
    }

    @NotNull
    public final H j() {
        return this.f5462a;
    }

    @NotNull
    public final List<B1.b0> k() {
        U0.b<e.b> bVar = this.f5467f;
        if (bVar == null) {
            return kotlin.collections.K.f71697a;
        }
        U0.b bVar2 = new U0.b(new B1.b0[bVar.m()]);
        e.c cVar = this.f5466e;
        int i11 = 0;
        while (cVar != null) {
            G0 g02 = this.f5465d;
            if (cVar == g02) {
                break;
            }
            AbstractC2810k0 coordinator$ui_release = cVar.getCoordinator$ui_release();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            w0 b22 = coordinator$ui_release.b2();
            w0 b23 = this.f5463b.b2();
            e.c child$ui_release = cVar.getChild$ui_release();
            if (child$ui_release != g02 || cVar.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) {
                b23 = null;
            }
            if (b22 == null) {
                b22 = b23;
            }
            bVar2.b(new B1.b0(bVar.l()[i11], coordinator$ui_release, b22));
            cVar = cVar.getChild$ui_release();
            i11++;
        }
        return bVar2.g();
    }

    @NotNull
    public final AbstractC2810k0 l() {
        return this.f5464c;
    }

    @NotNull
    public final e.c m() {
        return this.f5465d;
    }

    public final boolean n() {
        return (this.f5466e.getAggregateChildKindSet$ui_release() & 7168) != 0;
    }

    public final boolean o(int i11) {
        return (i11 & this.f5466e.getAggregateChildKindSet$ui_release()) != 0;
    }

    public final void p() {
        for (e.c cVar = this.f5466e; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.markAsAttached$ui_release();
        }
    }

    public final void q() {
        for (e.c cVar = this.f5465d; cVar != null; cVar = cVar.getParent$ui_release()) {
            if (cVar.isAttached()) {
                cVar.markAsDetached$ui_release();
            }
        }
    }

    public final void r() {
        for (e.c cVar = this.f5465d; cVar != null; cVar = cVar.getParent$ui_release()) {
            if (cVar.isAttached()) {
                cVar.reset$ui_release();
            }
        }
        t();
        q();
    }

    public final void s() {
        for (e.c cVar = this.f5466e; cVar != null; cVar = cVar.getChild$ui_release()) {
            cVar.runAttachLifecycle$ui_release();
            if (cVar.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                p0.a(cVar);
            }
            if (cVar.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                p0.d(cVar);
            }
            cVar.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void t() {
        for (e.c cVar = this.f5465d; cVar != null; cVar = cVar.getParent$ui_release()) {
            if (cVar.isAttached()) {
                cVar.runDetachLifecycle$ui_release();
            }
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        e.c cVar = this.f5466e;
        G0 g02 = this.f5465d;
        if (cVar != g02) {
            while (true) {
                if (cVar == null || cVar == g02) {
                    break;
                }
                sb2.append(String.valueOf(cVar));
                if (cVar.getChild$ui_release() == g02) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                cVar = cVar.getChild$ui_release();
            }
        } else {
            sb2.append("]");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void v() {
        H h11;
        AbstractC2810k0 abstractC2810k0;
        e.c parent$ui_release = this.f5465d.getParent$ui_release();
        AbstractC2810k0 abstractC2810k02 = this.f5463b;
        while (true) {
            h11 = this.f5462a;
            if (parent$ui_release == null) {
                break;
            }
            E c11 = C2809k.c(parent$ui_release);
            if (c11 != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    AbstractC2810k0 coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    Intrinsics.g(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    abstractC2810k0 = (F) coordinator$ui_release;
                    E Q22 = abstractC2810k0.Q2();
                    abstractC2810k0.T2(c11);
                    if (Q22 != parent$ui_release) {
                        abstractC2810k0.q2();
                    }
                } else {
                    F f7 = new F(h11, c11);
                    parent$ui_release.updateCoordinator$ui_release(f7);
                    abstractC2810k0 = f7;
                }
                abstractC2810k02.E2(abstractC2810k0);
                abstractC2810k0.D2(abstractC2810k02);
                abstractC2810k02 = abstractC2810k0;
            } else {
                parent$ui_release.updateCoordinator$ui_release(abstractC2810k02);
            }
            parent$ui_release = parent$ui_release.getParent$ui_release();
        }
        H g02 = h11.g0();
        abstractC2810k02.E2(g02 != null ? g02.J() : null);
        this.f5464c = abstractC2810k02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.ui.e$c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(@NotNull androidx.compose.ui.e eVar) {
        C2806i0.a aVar;
        C2806i0.a aVar2;
        C2806i0.a aVar3;
        C2806i0.a aVar4;
        U0.b<e.b> bVar;
        C2806i0.a aVar5;
        C2806i0.a aVar6;
        boolean z11;
        C2806i0.a aVar7;
        C2806i0.a aVar8;
        C2806i0.a aVar9;
        C2806i0.a aVar10;
        C2806i0.a aVar11;
        C2806i0.a aVar12;
        e.c cVar = this.f5466e;
        aVar = C2806i0.f5476a;
        if (cVar == aVar) {
            A1.a.b("padChain called on already padded chain");
            throw null;
        }
        e.c cVar2 = this.f5466e;
        aVar2 = C2806i0.f5476a;
        cVar2.setParent$ui_release(aVar2);
        aVar3 = C2806i0.f5476a;
        aVar3.setChild$ui_release(cVar2);
        aVar4 = C2806i0.f5476a;
        U0.b<e.b> bVar2 = this.f5467f;
        int i11 = 0;
        int m11 = bVar2 != null ? bVar2.m() : 0;
        U0.b<e.b> bVar3 = this.f5468g;
        if (bVar3 == null) {
            bVar3 = new U0.b<>(new e.b[16]);
        }
        int m12 = bVar3.m();
        if (m12 < 16) {
            m12 = 16;
        }
        U0.b bVar4 = new U0.b(new androidx.compose.ui.e[m12]);
        bVar4.b(eVar);
        C2808j0 c2808j0 = null;
        while (bVar4.p()) {
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) Pk0.b.b(1, bVar4);
            if (eVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar13 = (androidx.compose.ui.a) eVar2;
                bVar4.b(aVar13.a());
                bVar4.b(aVar13.b());
            } else if (eVar2 instanceof e.b) {
                bVar3.b(eVar2);
            } else {
                if (c2808j0 == null) {
                    c2808j0 = new C2808j0(bVar3);
                }
                eVar2.w(c2808j0);
                c2808j0 = c2808j0;
            }
        }
        int m13 = bVar3.m();
        G0 g02 = this.f5465d;
        H h11 = this.f5462a;
        if (m13 == m11) {
            e.c child$ui_release = aVar4.getChild$ui_release();
            while (true) {
                if (child$ui_release == null || i11 >= m11) {
                    break;
                }
                if (bVar2 == null) {
                    A1.a.c("expected prior modifier list to be non-empty");
                    throw null;
                }
                e.b bVar5 = bVar2.l()[i11];
                e.b bVar6 = bVar3.l()[i11];
                char c11 = Intrinsics.d(bVar5, bVar6) ? (char) 2 : bVar5.getClass() == bVar6.getClass() ? (char) 1 : (char) 0;
                if (c11 == 0) {
                    child$ui_release = child$ui_release.getParent$ui_release();
                    break;
                }
                if (c11 == 1) {
                    x(bVar5, bVar6, child$ui_release);
                }
                child$ui_release = child$ui_release.getChild$ui_release();
                i11++;
            }
            if (i11 < m11) {
                if (bVar2 == null) {
                    A1.a.c("expected prior modifier list to be non-empty");
                    throw null;
                }
                if (child$ui_release == null) {
                    A1.a.c("structuralUpdate requires a non-null tail");
                    throw null;
                }
                bVar = bVar3;
                u(i11, bVar2, bVar, child$ui_release, !h11.w());
                aVar5 = aVar4;
                z11 = true;
                this.f5467f = bVar;
                if (bVar2 != null) {
                    bVar2.h();
                } else {
                    bVar2 = null;
                }
                this.f5468g = bVar2;
                aVar7 = C2806i0.f5476a;
                if (aVar5 != aVar7) {
                    A1.a.b("trimChain called on already trimmed chain");
                    throw null;
                }
                aVar8 = C2806i0.f5476a;
                ?? child$ui_release2 = aVar8.getChild$ui_release();
                if (child$ui_release2 != 0) {
                    g02 = child$ui_release2;
                }
                g02.setParent$ui_release(null);
                aVar9 = C2806i0.f5476a;
                aVar9.setChild$ui_release(null);
                aVar10 = C2806i0.f5476a;
                aVar10.setAggregateChildKindSet$ui_release(-1);
                aVar11 = C2806i0.f5476a;
                aVar11.updateCoordinator$ui_release(null);
                aVar12 = C2806i0.f5476a;
                if (g02 == aVar12) {
                    A1.a.b("trimChain did not update the head");
                    throw null;
                }
                this.f5466e = g02;
                if (z11) {
                    v();
                    return;
                }
                return;
            }
            bVar = bVar3;
            aVar5 = aVar4;
            z11 = false;
            this.f5467f = bVar;
            if (bVar2 != null) {
            }
            this.f5468g = bVar2;
            aVar7 = C2806i0.f5476a;
            if (aVar5 != aVar7) {
            }
        } else if (h11.w() && m11 == 0) {
            e.c cVar3 = aVar4;
            for (int i12 = 0; i12 < bVar3.m(); i12++) {
                cVar3 = f(bVar3.l()[i12], cVar3);
            }
            int i13 = 0;
            for (e.c parent$ui_release = g02.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                aVar6 = C2806i0.f5476a;
                if (parent$ui_release == aVar6) {
                    break;
                }
                i13 |= parent$ui_release.getKindSet$ui_release();
                parent$ui_release.setAggregateChildKindSet$ui_release(i13);
            }
            bVar = bVar3;
            aVar5 = aVar4;
            z11 = true;
            this.f5467f = bVar;
            if (bVar2 != null) {
            }
            this.f5468g = bVar2;
            aVar7 = C2806i0.f5476a;
            if (aVar5 != aVar7) {
            }
        } else if (bVar3.m() != 0) {
            if (bVar2 == null) {
                bVar2 = new U0.b<>(new e.b[16]);
            }
            bVar = bVar3;
            aVar5 = aVar4;
            u(0, bVar2, bVar, aVar5, !h11.w());
            z11 = true;
            this.f5467f = bVar;
            if (bVar2 != null) {
            }
            this.f5468g = bVar2;
            aVar7 = C2806i0.f5476a;
            if (aVar5 != aVar7) {
            }
        } else {
            if (bVar2 == null) {
                A1.a.c("expected prior modifier list to be non-empty");
                throw null;
            }
            e.c child$ui_release3 = aVar4.getChild$ui_release();
            for (int i14 = 0; child$ui_release3 != null && i14 < bVar2.m(); i14++) {
                child$ui_release3 = g(child$ui_release3).getChild$ui_release();
            }
            H g03 = h11.g0();
            C2823x J11 = g03 != null ? g03.J() : null;
            C2823x c2823x = this.f5463b;
            c2823x.E2(J11);
            this.f5464c = c2823x;
            bVar = bVar3;
            aVar5 = aVar4;
            z11 = false;
            this.f5467f = bVar;
            if (bVar2 != null) {
            }
            this.f5468g = bVar2;
            aVar7 = C2806i0.f5476a;
            if (aVar5 != aVar7) {
            }
        }
    }
}
