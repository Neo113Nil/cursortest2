package I1;

import D1.AbstractC2810k0;
import D1.C2809k;
import D1.E0;
import D1.H;
import D1.InterfaceC2807j;
import I1.m;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.List;
import k1.C7460f;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e.c f11731a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11732b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final H f11733c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final l f11734d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11735e;

    /* renamed from: f, reason: collision with root package name */
    private r f11736f;

    /* renamed from: g, reason: collision with root package name */
    private final int f11737g;

    public static final class a extends e.c implements E0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f11738a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super D, Unit> function1) {
            this.f11738a = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // D1.E0
        public final void applySemantics(@NotNull D d11) {
            this.f11738a.invoke(d11);
        }
    }

    static final class b extends AbstractC7737t implements Function1<H, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f11739b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(H h11) {
            l B11 = h11.B();
            boolean z11 = false;
            if (B11 != null && B11.o()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    static final class c extends AbstractC7737t implements Function1<H, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f11740b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(H h11) {
            l B11 = h11.B();
            boolean z11 = false;
            if (B11 != null && B11.o()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    static final class d extends AbstractC7737t implements Function1<H, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f11741b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(H h11) {
            return Boolean.valueOf(h11.c0().o(8));
        }
    }

    public r(@NotNull e.c cVar, boolean z11, @NotNull H h11, @NotNull l lVar) {
        this.f11731a = cVar;
        this.f11732b = z11;
        this.f11733c = h11;
        this.f11734d = lVar;
        this.f11737g = h11.i0();
    }

    private final r b(i iVar, Function1<? super D, Unit> function1) {
        l lVar = new l();
        lVar.s(false);
        lVar.r(false);
        function1.invoke(lVar);
        r rVar = new r(new a(function1), false, new H(true, this.f11737g + (iVar != null ? 1000000000 : 2000000000)), lVar);
        rVar.f11735e = true;
        rVar.f11736f = this;
        return rVar;
    }

    private final void c(H h11, ArrayList arrayList) {
        U0.b<H> n02 = h11.n0();
        int m11 = n02.m();
        if (m11 > 0) {
            H[] l11 = n02.l();
            int i11 = 0;
            do {
                H h12 = l11[i11];
                if (h12.z0() && !h12.A0()) {
                    if (h12.c0().o(8)) {
                        arrayList.add(s.a(h12, this.f11732b));
                    } else {
                        c(h12, arrayList);
                    }
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final void e(ArrayList arrayList) {
        List v11 = v(false);
        int size = v11.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) v11.get(i11);
            if (rVar.s()) {
                arrayList.add(rVar);
            } else if (!rVar.f11734d.n()) {
                rVar.e(arrayList);
            }
        }
    }

    public static /* synthetic */ List j(r rVar, int i11) {
        return rVar.i((i11 & 1) != 0 ? !rVar.f11732b : false, (i11 & 2) == 0);
    }

    private final boolean s() {
        return this.f11732b && this.f11734d.o();
    }

    private final void u(l lVar) {
        if (this.f11734d.n()) {
            return;
        }
        List v11 = v(false);
        int size = v11.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = (r) v11.get(i11);
            if (!rVar.s()) {
                lVar.q(rVar.f11734d);
                rVar.u(lVar);
            }
        }
    }

    @NotNull
    public final r a() {
        return new r(this.f11731a, true, this.f11733c, this.f11734d);
    }

    public final AbstractC2810k0 d() {
        if (this.f11735e) {
            r o11 = o();
            if (o11 != null) {
                return o11.d();
            }
            return null;
        }
        InterfaceC2807j c11 = s.c(this.f11733c);
        if (c11 == null) {
            c11 = this.f11731a;
        }
        return C2809k.d(c11, 8);
    }

    @NotNull
    public final C7460f f() {
        C7460f c7460f;
        C7460f c7460f2;
        r o11 = o();
        if (o11 == null) {
            c7460f2 = C7460f.f70279e;
            return c7460f2;
        }
        AbstractC2810k0 d11 = d();
        if (d11 != null) {
            if (!d11.I()) {
                d11 = null;
            }
            if (d11 != null) {
                return C2809k.d(o11.f11731a, 8).K(d11, true);
            }
        }
        c7460f = C7460f.f70279e;
        return c7460f;
    }

    @NotNull
    public final C7460f g() {
        C7460f c7460f;
        AbstractC2810k0 d11 = d();
        if (d11 != null) {
            if (!d11.I()) {
                d11 = null;
            }
            if (d11 != null) {
                return B1.C.c(d11).K(d11, true);
            }
        }
        c7460f = C7460f.f70279e;
        return c7460f;
    }

    @NotNull
    public final C7460f h() {
        C7460f c7460f;
        AbstractC2810k0 d11 = d();
        if (d11 != null) {
            if (!d11.I()) {
                d11 = null;
            }
            if (d11 != null) {
                return B1.C.b(d11);
            }
        }
        c7460f = C7460f.f70279e;
        return c7460f;
    }

    @NotNull
    public final List i(boolean z11, boolean z12) {
        if (!z11 && this.f11734d.n()) {
            return K.f71697a;
        }
        if (!s()) {
            return v(z12);
        }
        ArrayList arrayList = new ArrayList();
        e(arrayList);
        return arrayList;
    }

    @NotNull
    public final l k() {
        boolean s11 = s();
        l lVar = this.f11734d;
        if (!s11) {
            return lVar;
        }
        l i11 = lVar.i();
        u(i11);
        return i11;
    }

    public final int l() {
        return this.f11737g;
    }

    @NotNull
    public final H m() {
        return this.f11733c;
    }

    @NotNull
    public final H n() {
        return this.f11733c;
    }

    public final r o() {
        r rVar = this.f11736f;
        if (rVar != null) {
            return rVar;
        }
        H h11 = this.f11733c;
        boolean z11 = this.f11732b;
        H b11 = z11 ? s.b(h11, c.f11740b) : null;
        if (b11 == null) {
            b11 = s.b(h11, d.f11741b);
        }
        if (b11 == null) {
            return null;
        }
        return s.a(b11, z11);
    }

    @NotNull
    public final C7460f p() {
        C7460f c7460f;
        InterfaceC2807j c11;
        l lVar = this.f11734d;
        boolean o11 = lVar.o();
        InterfaceC2807j interfaceC2807j = this.f11731a;
        if (o11 && (c11 = s.c(this.f11733c)) != null) {
            interfaceC2807j = c11;
        }
        e.c node = interfaceC2807j.getNode();
        boolean z11 = lVar.m(k.k(), m.a.f11727b) != null;
        if (!node.getNode().isAttached()) {
            c7460f = C7460f.f70279e;
            return c7460f;
        }
        if (z11) {
            return C2809k.d(node, 8).J2();
        }
        AbstractC2810k0 d11 = C2809k.d(node, 8);
        return B1.C.c(d11).K(d11, true);
    }

    @NotNull
    public final l q() {
        return this.f11734d;
    }

    public final boolean r() {
        return this.f11735e;
    }

    public final boolean t() {
        return !this.f11735e && j(this, 4).isEmpty() && s.b(this.f11733c, b.f11739b) == null;
    }

    @NotNull
    public final List v(boolean z11) {
        if (this.f11735e) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        c(this.f11733c, arrayList);
        if (z11) {
            l lVar = this.f11734d;
            int i11 = u.f11751H;
            C w11 = u.w();
            m.a aVar = m.a.f11727b;
            i iVar = (i) lVar.m(w11, aVar);
            if (iVar != null && lVar.o() && !arrayList.isEmpty()) {
                arrayList.add(b(iVar, new p(iVar)));
            }
            if (lVar.e(u.c()) && !arrayList.isEmpty() && lVar.o()) {
                List list = (List) lVar.m(u.c(), aVar);
                String str = list != null ? (String) C7714v.M(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new q(str)));
                }
            }
        }
        return arrayList;
    }
}
