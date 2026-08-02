package Ub;

import Hf.A;
import Hf.v;
import Hf.w;
import Hf.x;
import Hf.y;
import Hf.z;
import Ub.l;
import ac.C4993b;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private final f f27510a;

    /* renamed from: b, reason: collision with root package name */
    private final r f27511b;

    /* renamed from: c, reason: collision with root package name */
    private final u f27512c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends Hf.u>, l.b<? extends Hf.u>> f27513d;

    /* loaded from: classes.dex */
    static class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f27514a = new HashMap();

        a() {
        }

        @Override // Ub.l.a
        @NonNull
        public final <N extends Hf.u> l.a a(@NonNull Class<N> cls, l.b<? super N> bVar) {
            this.f27514a.put(cls, bVar);
            return this;
        }

        @NonNull
        public final l b(@NonNull f fVar, @NonNull r rVar) {
            return new o(fVar, rVar, new u(), Collections.unmodifiableMap(this.f27514a), new ru.ozon.android.messenger.framework.data.remote.serialize.a());
        }
    }

    o(@NonNull f fVar, @NonNull r rVar, @NonNull u uVar, @NonNull Map map, @NonNull ru.ozon.android.messenger.framework.data.remote.serialize.a aVar) {
        this.f27510a = fVar;
        this.f27511b = rVar;
        this.f27512c = uVar;
        this.f27513d = map;
    }

    private void I(@NonNull Hf.u uVar) {
        l.b<? extends Hf.u> bVar = this.f27513d.get(uVar.getClass());
        if (bVar != null) {
            bVar.a(uVar, this);
        } else {
            b(uVar);
        }
    }

    @Override // Ub.l
    public final boolean A(@NonNull Hf.u uVar) {
        return uVar.e() != null;
    }

    @Override // Hf.B
    public final void B(Hf.q qVar) {
        I(qVar);
    }

    @Override // Hf.B
    public final void C(Hf.t tVar) {
        I(tVar);
    }

    @Override // Hf.B
    public final void D(Hf.o oVar) {
        I(oVar);
    }

    @Override // Ub.l
    public final <N extends Hf.u> void E(@NonNull N n11, int i11) {
        Class<?> cls = n11.getClass();
        f fVar = this.f27510a;
        t a11 = ((k) fVar.e()).a(cls);
        if (a11 != null) {
            a(i11, a11.a(fVar, this.f27511b));
        }
    }

    @Override // Hf.B
    public final void F(Hf.n nVar) {
        I(nVar);
    }

    @Override // Hf.B
    public final void G(Hf.m mVar) {
        I(mVar);
    }

    @Override // Hf.B
    public final void H(Hf.r rVar) {
        I(rVar);
    }

    @Override // Ub.l
    public final void a(int i11, Object obj) {
        u uVar = this.f27512c;
        u.f(uVar, obj, i11, uVar.length());
    }

    @Override // Ub.l
    public final void b(@NonNull Hf.u uVar) {
        Hf.u c11 = uVar.c();
        while (c11 != null) {
            Hf.u e11 = c11.e();
            c11.a(this);
            c11 = e11;
        }
    }

    @Override // Hf.B
    public final void c(y yVar) {
        I(yVar);
    }

    @Override // Ub.l
    @NonNull
    public final u d() {
        return this.f27512c;
    }

    @Override // Hf.B
    public final void e(v vVar) {
        I(vVar);
    }

    @Override // Hf.B
    public final void f(Hf.e eVar) {
        I(eVar);
    }

    @Override // Ub.l
    public final void g(@NonNull C4993b c4993b, int i11) {
        f fVar = this.f27510a;
        t a11 = ((k) fVar.e()).a(C4993b.class);
        if (a11 == null) {
            throw new NullPointerException(C4993b.class.getName());
        }
        a(i11, a11.a(fVar, this.f27511b));
    }

    @Override // Hf.B
    public final void h(Hf.d dVar) {
        I(dVar);
    }

    @Override // Ub.l
    @NonNull
    public final r i() {
        return this.f27511b;
    }

    @Override // Hf.B
    public final void j(Hf.g gVar) {
        I(gVar);
    }

    @Override // Ub.l
    public final void k() {
        w();
    }

    @Override // Hf.B
    public final void l(x xVar) {
        I(xVar);
    }

    @Override // Ub.l
    public final int length() {
        return this.f27512c.length();
    }

    @Override // Hf.B
    public final void m(Hf.p pVar) {
        I(pVar);
    }

    @Override // Hf.B
    public final void n(A a11) {
        I(a11);
    }

    @Override // Hf.B
    public final void o(Hf.j jVar) {
        I(jVar);
    }

    @Override // Hf.B
    public final void p(w wVar) {
        I(wVar);
    }

    @Override // Ub.l
    public final void q(@NonNull Hf.u uVar) {
        if (uVar.e() != null) {
            w();
            this.f27512c.a('\n');
        }
    }

    @Override // Hf.B
    public final void r(Hf.c cVar) {
        I(cVar);
    }

    @Override // Hf.B
    public final void s(Hf.h hVar) {
        I(hVar);
    }

    @Override // Ub.l
    @NonNull
    public final f t() {
        return this.f27510a;
    }

    @Override // Hf.B
    public final void u(Hf.f fVar) {
        I(fVar);
    }

    @Override // Hf.B
    public final void v(Hf.k kVar) {
        I(kVar);
    }

    @Override // Ub.l
    public final void w() {
        u uVar = this.f27512c;
        if (uVar.length() <= 0 || '\n' == uVar.e()) {
            return;
        }
        uVar.a('\n');
    }

    @Override // Hf.B
    public final void x(z zVar) {
        I(zVar);
    }

    @Override // Hf.B
    public final void y(Hf.l lVar) {
        I(lVar);
    }

    @Override // Hf.B
    public final void z(Hf.i iVar) {
        I(iVar);
    }
}
