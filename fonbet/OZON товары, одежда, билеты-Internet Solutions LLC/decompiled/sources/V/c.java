package V;

import J.f;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.M0;
import androidx.camera.core.w;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.X;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.K;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27873a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f27874b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f27875c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<J> f27876d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    D.a f27877e;

    static abstract class a {
        a() {
        }

        @NonNull
        public abstract f.b a();

        @NonNull
        public abstract J b();
    }

    private static class b implements I {

        /* renamed from: a, reason: collision with root package name */
        private final c f27878a;

        /* renamed from: b, reason: collision with root package name */
        private final J f27879b;

        b(J j11, c cVar) {
            this.f27879b = j11;
            this.f27878a = cVar;
        }

        final J a() {
            return this.f27879b;
        }

        @X(AbstractC5434v.a.ON_DESTROY)
        public void onDestroy(J j11) {
            this.f27878a.m(j11);
        }

        @X(AbstractC5434v.a.ON_START)
        public void onStart(J j11) {
            this.f27878a.h(j11);
        }

        @X(AbstractC5434v.a.ON_STOP)
        public void onStop(J j11) {
            this.f27878a.i(j11);
        }
    }

    c() {
    }

    private b d(J j11) {
        synchronized (this.f27873a) {
            try {
                for (b bVar : this.f27875c.keySet()) {
                    if (j11.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean f(J j11) {
        synchronized (this.f27873a) {
            try {
                b d11 = d(j11);
                if (d11 == null) {
                    return false;
                }
                Iterator it = ((Set) this.f27875c.get(d11)).iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f27874b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.s().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g(V.b bVar) {
        synchronized (this.f27873a) {
            try {
                J q11 = bVar.q();
                V.a aVar = new V.a(q11, J.f.v((M0) bVar.b(), bVar.r()));
                b d11 = d(q11);
                Set hashSet = d11 != null ? (Set) this.f27875c.get(d11) : new HashSet();
                hashSet.add(aVar);
                this.f27874b.put(aVar, bVar);
                if (d11 == null) {
                    b bVar2 = new b(q11, this);
                    this.f27875c.put(bVar2, hashSet);
                    q11.getLifecycle().a(bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void j(J j11) {
        synchronized (this.f27873a) {
            try {
                b d11 = d(j11);
                if (d11 == null) {
                    return;
                }
                Iterator it = ((Set) this.f27875c.get(d11)).iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f27874b.get((a) it.next());
                    bVar.getClass();
                    bVar.u();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(J j11) {
        synchronized (this.f27873a) {
            try {
                Iterator it = ((Set) this.f27875c.get(d(j11))).iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f27874b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.s().isEmpty()) {
                        bVar.x();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void a(@NonNull V.b bVar, @NonNull K k11, @NonNull Collection collection, D.a aVar) {
        synchronized (this.f27873a) {
            try {
                x2.i.b(!collection.isEmpty());
                this.f27877e = aVar;
                J q11 = bVar.q();
                b d11 = d(q11);
                if (d11 == null) {
                    return;
                }
                Set set = (Set) this.f27875c.get(d11);
                D.a aVar2 = this.f27877e;
                if (aVar2 == null || ((A.a) aVar2).b() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        V.b bVar2 = (V.b) this.f27874b.get((a) it.next());
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.s().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.j().J();
                    bVar.j().H(k11);
                    bVar.d(collection);
                    if (q11.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                        h(q11);
                    }
                } catch (f.a e11) {
                    throw new IllegalArgumentException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final V.b b(@NonNull J j11, @NonNull J.f fVar) {
        synchronized (this.f27873a) {
            try {
                x2.i.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.f27874b.get(new V.a(j11, fVar.w())) == null);
                V.b bVar = new V.b(j11, fVar);
                if (((ArrayList) fVar.B()).isEmpty()) {
                    bVar.u();
                }
                if (j11.getLifecycle().b() == AbstractC5434v.b.DESTROYED) {
                    return bVar;
                }
                g(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final V.b c(J j11, @NonNull f.b bVar) {
        V.b bVar2;
        synchronized (this.f27873a) {
            bVar2 = (V.b) this.f27874b.get(new V.a(j11, bVar));
        }
        return bVar2;
    }

    final Collection<V.b> e() {
        Collection<V.b> unmodifiableCollection;
        synchronized (this.f27873a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f27874b.values());
        }
        return unmodifiableCollection;
    }

    final void h(J j11) {
        synchronized (this.f27873a) {
            try {
                if (f(j11)) {
                    if (this.f27876d.isEmpty()) {
                        this.f27876d.push(j11);
                    } else {
                        D.a aVar = this.f27877e;
                        if (aVar == null || ((A.a) aVar).b() != 2) {
                            J peek = this.f27876d.peek();
                            if (!j11.equals(peek)) {
                                j(peek);
                                this.f27876d.remove(j11);
                                this.f27876d.push(j11);
                            }
                        }
                    }
                    n(j11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void i(J j11) {
        synchronized (this.f27873a) {
            try {
                this.f27876d.remove(j11);
                j(j11);
                if (!this.f27876d.isEmpty()) {
                    n(this.f27876d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void k(@NonNull Collection<w> collection) {
        synchronized (this.f27873a) {
            try {
                Iterator it = this.f27874b.keySet().iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f27874b.get((a) it.next());
                    boolean isEmpty = bVar.s().isEmpty();
                    bVar.v(collection);
                    if (!isEmpty && bVar.s().isEmpty()) {
                        i(bVar.q());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void l() {
        synchronized (this.f27873a) {
            try {
                Iterator it = this.f27874b.keySet().iterator();
                while (it.hasNext()) {
                    V.b bVar = (V.b) this.f27874b.get((a) it.next());
                    bVar.w();
                    i(bVar.q());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void m(J j11) {
        synchronized (this.f27873a) {
            try {
                b d11 = d(j11);
                if (d11 == null) {
                    return;
                }
                i(j11);
                Iterator it = ((Set) this.f27875c.get(d11)).iterator();
                while (it.hasNext()) {
                    this.f27874b.remove((a) it.next());
                }
                this.f27875c.remove(d11);
                d11.a().getLifecycle().e(d11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
