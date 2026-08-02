package com.google.common.util.concurrent;

import androidx.media3.exoplayer.analytics.Z0;
import com.google.common.base.h;
import com.google.common.collect.G;
import com.google.common.collect.i0;
import com.google.common.collect.y0;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class o extends com.google.common.primitives.d {

    public static final class a<V> implements Runnable {
        public final Future<V> a;
        public final n<? super V> b;

        public a(u uVar, n nVar) {
            this.a = uVar;
            this.b = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable tryInternalFastPathGetFailure;
            Future<V> future = this.a;
            boolean z = future instanceof com.google.common.util.concurrent.internal.a;
            n<? super V> nVar = this.b;
            if (z && (tryInternalFastPathGetFailure = ((com.google.common.util.concurrent.internal.a) future).tryInternalFastPathGetFailure()) != null) {
                nVar.onFailure(tryInternalFastPathGetFailure);
                return;
            }
            try {
                nVar.onSuccess((Object) o.b(future));
            } catch (ExecutionException e) {
                nVar.onFailure(e.getCause());
            } catch (Throwable th) {
                nVar.onFailure(th);
            }
        }

        public final String toString() {
            h.a aVar = new h.a(a.class.getSimpleName());
            h.a.C0130a c0130a = new h.a.C0130a();
            aVar.c.b = c0130a;
            aVar.c = c0130a;
            c0130a.a = this.b;
            return aVar.toString();
        }
    }

    public static final class b<V> {
        public final G<u<? extends V>> a;

        public b(G g) {
            this.a = g;
        }

        public final void a(androidx.core.widget.c cVar) {
            p pVar = new p(cVar);
            G<u<? extends V>> g = this.a;
            int size = g.size();
            i iVar = new i();
            iVar.a = null;
            iVar.b = size;
            iVar.e = g;
            iVar.i = new i.a(pVar);
            j jVar = j.a;
            Objects.requireNonNull(iVar.e);
            if (iVar.e.isEmpty()) {
                iVar.b();
                return;
            }
            Z0 z0 = new Z0(4, iVar, null);
            y0 it = iVar.e.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar.isDone()) {
                    iVar.a(null);
                } else {
                    uVar.addListener(z0, jVar);
                }
            }
        }
    }

    public static <V> void a(u<V> uVar, n<? super V> nVar, Executor executor) {
        nVar.getClass();
        uVar.addListener(new a(uVar, nVar), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        V v;
        if (!future.isDone()) {
            throw new IllegalStateException(com.google.common.base.r.g("Future was expected to be done: %s", future));
        }
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static r.a c(RuntimeException runtimeException) {
        r.a aVar = new r.a();
        aVar.setException(runtimeException);
        return aVar;
    }

    public static r d(Object obj) {
        return obj == null ? r.b : new r(obj);
    }

    public static <V> b<V> e(Iterable<? extends u<? extends V>> iterable) {
        G g;
        G.b bVar = G.b;
        iterable.getClass();
        if (iterable instanceof Collection) {
            g = G.j((Collection) iterable);
        } else {
            Iterator<? extends u<? extends V>> it = iterable.iterator();
            if (it.hasNext()) {
                u<? extends V> next = it.next();
                if (it.hasNext()) {
                    G.a aVar = new G.a();
                    aVar.c(next);
                    while (it.hasNext()) {
                        aVar.c(it.next());
                    }
                    g = aVar.g();
                } else {
                    g = G.n(next);
                }
            } else {
                g = i0.e;
            }
        }
        return new b<>(g);
    }
}
