package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5376w;
import androidx.datastore.preferences.protobuf.C5372s;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
final class V<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Q f42495a;

    /* renamed from: b, reason: collision with root package name */
    private final m0<?, ?> f42496b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42497c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5370p<?> f42498d;

    private V(m0<?, ?> m0Var, AbstractC5370p<?> abstractC5370p, Q q11) {
        this.f42496b = m0Var;
        this.f42497c = abstractC5370p.e(q11);
        this.f42498d = abstractC5370p;
        this.f42495a = q11;
    }

    static <T> V<T> f(m0<?, ?> m0Var, AbstractC5370p<?> abstractC5370p, Q q11) {
        return new V<>(m0Var, abstractC5370p, q11);
    }

    private boolean g(C5364j c5364j, C5369o c5369o, AbstractC5370p abstractC5370p, C5372s c5372s, m0 m0Var, Object obj) throws IOException {
        int c11 = c5364j.c();
        int i11 = 0;
        Q q11 = this.f42495a;
        if (c11 != 11) {
            if ((c11 & 7) != 2) {
                return c5364j.U();
            }
            AbstractC5376w.e b11 = abstractC5370p.b(c5369o, q11, c11 >>> 3);
            if (b11 == null) {
                return m0Var.l(0, c5364j, obj);
            }
            abstractC5370p.h(b11);
            throw null;
        }
        AbstractC5376w.e eVar = null;
        AbstractC5362h abstractC5362h = null;
        while (c5364j.b() != Integer.MAX_VALUE) {
            int c12 = c5364j.c();
            if (c12 == 16) {
                i11 = c5364j.O();
                eVar = abstractC5370p.b(c5369o, q11, i11);
            } else if (c12 == 26) {
                if (eVar != null) {
                    abstractC5370p.h(eVar);
                    throw null;
                }
                abstractC5362h = c5364j.j();
            } else if (!c5364j.U()) {
                break;
            }
        }
        if (c5364j.c() != 12) {
            throw new C5379z("Protocol message end-group tag did not match expected tag.");
        }
        if (abstractC5362h == null) {
            return true;
        }
        if (eVar == null) {
            m0Var.d(obj, i11, abstractC5362h);
            return true;
        }
        abstractC5370p.i(eVar);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final int a(AbstractC5355a abstractC5355a) {
        m0<?, ?> m0Var = this.f42496b;
        int i11 = m0Var.i(m0Var.g(abstractC5355a));
        if (this.f42497c) {
            this.f42498d.c(abstractC5355a).f();
        }
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void b(Object obj, C5364j c5364j, C5369o c5369o) throws IOException {
        m0<?, ?> m0Var = this.f42496b;
        n0 f7 = m0Var.f(obj);
        AbstractC5370p<?> abstractC5370p = this.f42498d;
        C5372s<?> d11 = abstractC5370p.d(obj);
        while (c5364j.b() != Integer.MAX_VALUE) {
            try {
                C5364j c5364j2 = c5364j;
                C5369o c5369o2 = c5369o;
                if (!g(c5364j2, c5369o2, abstractC5370p, d11, m0Var, f7)) {
                    return;
                }
                c5364j = c5364j2;
                c5369o = c5369o2;
            } finally {
                m0Var.n(obj, f7);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void c(T t2, t0 t0Var) throws IOException {
        Iterator<Map.Entry<?, Object>> m11 = this.f42498d.c(t2).m();
        if (m11.hasNext()) {
            ((C5372s.b) m11.next().getKey()).getLiteJavaType();
            throw null;
        }
        m0<?, ?> m0Var = this.f42496b;
        m0Var.q(m0Var.g(t2), t0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean d(AbstractC5376w abstractC5376w, AbstractC5376w abstractC5376w2) {
        m0<?, ?> m0Var = this.f42496b;
        if (!m0Var.g(abstractC5376w).equals(m0Var.g(abstractC5376w2))) {
            return false;
        }
        if (!this.f42497c) {
            return true;
        }
        AbstractC5370p<?> abstractC5370p = this.f42498d;
        return abstractC5370p.c(abstractC5376w).equals(abstractC5370p.c(abstractC5376w2));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final int e(AbstractC5376w abstractC5376w) {
        int hashCode = this.f42496b.g(abstractC5376w).hashCode();
        return this.f42497c ? (hashCode * 53) + this.f42498d.c(abstractC5376w).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean isInitialized(T t2) {
        this.f42498d.c(t2).k();
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void makeImmutable(T t2) {
        this.f42496b.j(t2);
        this.f42498d.f(t2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void mergeFrom(T t2, T t11) {
        int i11 = g0.f42523d;
        m0<?, ?> m0Var = this.f42496b;
        m0Var.o(t2, m0Var.k(m0Var.g(t2), m0Var.g(t11)));
        if (this.f42497c) {
            AbstractC5370p<?> abstractC5370p = this.f42498d;
            C5372s<?> c11 = abstractC5370p.c(t11);
            if (c11.i()) {
                return;
            }
            abstractC5370p.d(t2).o(c11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final T newInstance() {
        Q q11 = this.f42495a;
        return q11 instanceof AbstractC5376w ? (T) ((AbstractC5376w) q11).q() : (T) q11.newBuilderForType().d();
    }
}
