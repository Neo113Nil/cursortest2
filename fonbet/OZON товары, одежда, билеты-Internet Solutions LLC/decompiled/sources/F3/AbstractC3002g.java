package F3;

import F3.F;
import F3.InterfaceC3018x;
import android.os.Handler;
import j3.AbstractC7252H;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import w3.i;

/* renamed from: F3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3002g<T> extends AbstractC2996a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<T, b<T>> f8674a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Handler f8675b;

    /* renamed from: c, reason: collision with root package name */
    private p3.z f8676c;

    /* renamed from: F3.g$a */
    private final class a implements F, w3.i {

        /* renamed from: a, reason: collision with root package name */
        private final T f8677a;

        /* renamed from: b, reason: collision with root package name */
        private F.a f8678b;

        /* renamed from: c, reason: collision with root package name */
        private i.a f8679c;

        public a(T t2) {
            this.f8678b = AbstractC3002g.this.createEventDispatcher(null);
            this.f8679c = AbstractC3002g.this.createDrmEventDispatcher(null);
            this.f8677a = t2;
        }

        private boolean c(int i11, InterfaceC3018x.b bVar) {
            InterfaceC3018x.b bVar2;
            T t2 = this.f8677a;
            AbstractC3002g abstractC3002g = AbstractC3002g.this;
            if (bVar != null) {
                bVar2 = abstractC3002g.c(t2, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int e11 = abstractC3002g.e(i11, t2);
            F.a aVar = this.f8678b;
            if (aVar.f8405a != e11 || !Objects.equals(aVar.f8406b, bVar2)) {
                this.f8678b = abstractC3002g.createEventDispatcher(e11, bVar2);
            }
            i.a aVar2 = this.f8679c;
            if (aVar2.f103476a == e11 && Objects.equals(aVar2.f103477b, bVar2)) {
                return true;
            }
            this.f8679c = abstractC3002g.createDrmEventDispatcher(e11, bVar2);
            return true;
        }

        private C3016v m(C3016v c3016v, InterfaceC3018x.b bVar) {
            AbstractC3002g abstractC3002g = AbstractC3002g.this;
            T t2 = this.f8677a;
            long j11 = c3016v.f8749f;
            long d11 = abstractC3002g.d(j11, t2);
            long j12 = c3016v.f8750g;
            long d12 = abstractC3002g.d(j12, t2);
            if (d11 == j11 && d12 == j12) {
                return c3016v;
            }
            return new C3016v(c3016v.f8744a, c3016v.f8745b, c3016v.f8746c, c3016v.f8747d, c3016v.f8748e, d11, d12);
        }

        @Override // w3.i
        public final void A(int i11, InterfaceC3018x.b bVar, int i12) {
            if (c(i11, bVar)) {
                this.f8679c.d(i12);
            }
        }

        @Override // w3.i
        public final void F(int i11, InterfaceC3018x.b bVar) {
            if (c(i11, bVar)) {
                this.f8679c.c();
            }
        }

        @Override // F3.F
        public final void H(int i11, InterfaceC3018x.b bVar, C3016v c3016v) {
            if (c(i11, bVar)) {
                F.a aVar = this.f8678b;
                C3016v m11 = m(c3016v, bVar);
                aVar.getClass();
                aVar.b(new C3019y(aVar, m11));
            }
        }

        @Override // F3.F
        public final void I(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v) {
            if (c(i11, bVar)) {
                F.a aVar = this.f8678b;
                C3016v m11 = m(c3016v, bVar);
                aVar.getClass();
                aVar.b(new A(aVar, c3013s, m11));
            }
        }

        @Override // F3.F
        public final void M(int i11, InterfaceC3018x.b bVar, C3016v c3016v) {
            if (c(i11, bVar)) {
                F.a aVar = this.f8678b;
                C3016v m11 = m(c3016v, bVar);
                InterfaceC3018x.b bVar2 = aVar.f8406b;
                bVar2.getClass();
                aVar.b(new D(aVar, bVar2, m11));
            }
        }

        @Override // w3.i
        public final void P(int i11, InterfaceC3018x.b bVar) {
            if (c(i11, bVar)) {
                this.f8679c.b();
            }
        }

        @Override // F3.F
        public final void U(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v, IOException iOException, boolean z11) {
            if (c(i11, bVar)) {
                F.a aVar = this.f8678b;
                C3016v m11 = m(c3016v, bVar);
                aVar.getClass();
                aVar.b(new B(aVar, c3013s, m11, iOException, z11));
            }
        }

        @Override // w3.i
        public final void V(int i11, InterfaceC3018x.b bVar) {
            if (c(i11, bVar)) {
                this.f8679c.f();
            }
        }

        @Override // F3.F
        public final void X(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v) {
            if (c(i11, bVar)) {
                F.a aVar = this.f8678b;
                C3016v m11 = m(c3016v, bVar);
                aVar.getClass();
                aVar.b(new C(aVar, c3013s, m11));
            }
        }

        @Override // F3.F
        public final void c0(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v, int i12) {
            if (c(i11, bVar)) {
                F.a aVar = this.f8678b;
                C3016v m11 = m(c3016v, bVar);
                aVar.getClass();
                aVar.b(new C3020z(aVar, c3013s, m11, i12));
            }
        }

        @Override // w3.i
        public final void q(int i11, InterfaceC3018x.b bVar, Exception exc) {
            if (c(i11, bVar)) {
                this.f8679c.e(exc);
            }
        }
    }

    /* renamed from: F3.g$b */
    private static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3018x f8681a;

        /* renamed from: b, reason: collision with root package name */
        public final C3001f f8682b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC3002g<T>.a f8683c;

        public b(InterfaceC3018x interfaceC3018x, C3001f c3001f, a aVar) {
            this.f8681a = interfaceC3018x;
            this.f8682b = c3001f;
            this.f8683c = aVar;
        }
    }

    protected AbstractC3002g() {
    }

    protected abstract InterfaceC3018x.b c(T t2, InterfaceC3018x.b bVar);

    protected long d(long j11, Object obj) {
        return j11;
    }

    @Override // F3.AbstractC2996a
    protected final void disableInternal() {
        for (b<T> bVar : this.f8674a.values()) {
            bVar.f8681a.disable(bVar.f8682b);
        }
    }

    protected int e(int i11, Object obj) {
        return i11;
    }

    @Override // F3.AbstractC2996a
    protected final void enableInternal() {
        for (b<T> bVar : this.f8674a.values()) {
            bVar.f8681a.enable(bVar.f8682b);
        }
    }

    protected abstract void f(Object obj, AbstractC2996a abstractC2996a, AbstractC7252H abstractC7252H);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [F3.f, F3.x$c] */
    protected final void g(final T t2, InterfaceC3018x interfaceC3018x) {
        HashMap<T, b<T>> hashMap = this.f8674a;
        G10.a.c(!hashMap.containsKey(t2));
        ?? r12 = new InterfaceC3018x.c() { // from class: F3.f
            @Override // F3.InterfaceC3018x.c
            public final void b(AbstractC2996a abstractC2996a, AbstractC7252H abstractC7252H) {
                AbstractC3002g.this.f(t2, abstractC2996a, abstractC7252H);
            }
        };
        a aVar = new a(t2);
        hashMap.put(t2, new b<>(interfaceC3018x, r12, aVar));
        Handler handler = this.f8675b;
        handler.getClass();
        interfaceC3018x.addEventListener(handler, aVar);
        Handler handler2 = this.f8675b;
        handler2.getClass();
        interfaceC3018x.addDrmEventListener(handler2, aVar);
        interfaceC3018x.prepareSource(r12, this.f8676c, getPlayerId());
        if (isEnabled()) {
            return;
        }
        interfaceC3018x.disable(r12);
    }

    @Override // F3.InterfaceC3018x
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it = this.f8674a.values().iterator();
        while (it.hasNext()) {
            it.next().f8681a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // F3.AbstractC2996a
    protected void prepareSourceInternal(p3.z zVar) {
        this.f8676c = zVar;
        this.f8675b = m3.N.p(null);
    }

    @Override // F3.AbstractC2996a
    protected void releaseSourceInternal() {
        HashMap<T, b<T>> hashMap = this.f8674a;
        for (b<T> bVar : hashMap.values()) {
            bVar.f8681a.releaseSource(bVar.f8682b);
            AbstractC3002g<T>.a aVar = bVar.f8683c;
            InterfaceC3018x interfaceC3018x = bVar.f8681a;
            interfaceC3018x.removeEventListener(aVar);
            interfaceC3018x.removeDrmEventListener(aVar);
        }
        hashMap.clear();
    }
}
