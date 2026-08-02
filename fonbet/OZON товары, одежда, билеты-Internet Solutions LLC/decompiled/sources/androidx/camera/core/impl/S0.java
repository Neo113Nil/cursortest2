package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5129y0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public abstract class S0<T> implements InterfaceC5129y0<T> {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<Object> f38198b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f38197a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private int f38199c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38200d = false;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f38201e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<b<T>> f38202f = new CopyOnWriteArraySet<>();

    static abstract class a {
        a() {
        }

        @NonNull
        public abstract Throwable a();
    }

    private static final class b<T> implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        private static final Object f38203h = new Object();

        /* renamed from: a, reason: collision with root package name */
        private final Executor f38204a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5129y0.a<? super T> f38205b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReference<Object> f38207d;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f38206c = new AtomicBoolean(true);

        /* renamed from: e, reason: collision with root package name */
        private Object f38208e = f38203h;

        /* renamed from: f, reason: collision with root package name */
        private int f38209f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f38210g = false;

        b(@NonNull AtomicReference<Object> atomicReference, @NonNull Executor executor, @NonNull InterfaceC5129y0.a<? super T> aVar) {
            this.f38207d = atomicReference;
            this.f38204a = executor;
            this.f38205b = aVar;
        }

        final void a() {
            this.f38206c.set(false);
        }

        final void b(int i11) {
            synchronized (this) {
                try {
                    if (this.f38206c.get()) {
                        if (i11 <= this.f38209f) {
                            return;
                        }
                        this.f38209f = i11;
                        if (this.f38210g) {
                            return;
                        }
                        this.f38210g = true;
                        try {
                            this.f38204a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f38210g = false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                try {
                    if (!this.f38206c.get()) {
                        this.f38210g = false;
                        return;
                    }
                    Object obj = this.f38207d.get();
                    int i11 = this.f38209f;
                    while (true) {
                        if (!Objects.equals(this.f38208e, obj)) {
                            this.f38208e = obj;
                            if (obj instanceof a) {
                                this.f38205b.onError(((a) obj).a());
                            } else {
                                this.f38205b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i11 == this.f38209f || !this.f38206c.get()) {
                                    break;
                                }
                                obj = this.f38207d.get();
                                i11 = this.f38209f;
                            } finally {
                            }
                        }
                    }
                    this.f38210g = false;
                } finally {
                }
            }
        }
    }

    S0(Object obj) {
        this.f38198b = new AtomicReference<>(obj);
    }

    private void a(@NonNull InterfaceC5129y0.a<? super T> aVar) {
        b bVar = (b) this.f38201e.remove(aVar);
        if (bVar != null) {
            bVar.a();
            this.f38202f.remove(bVar);
        }
    }

    private void j(Object obj) {
        Iterator<b<T>> it;
        int i11;
        synchronized (this.f38197a) {
            try {
                if (Objects.equals(this.f38198b.getAndSet(obj), obj)) {
                    return;
                }
                int i12 = this.f38199c + 1;
                this.f38199c = i12;
                if (this.f38200d) {
                    return;
                }
                this.f38200d = true;
                Iterator<b<T>> it2 = this.f38202f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i12);
                    } else {
                        synchronized (this.f38197a) {
                            try {
                                if (this.f38199c == i12) {
                                    this.f38200d = false;
                                    return;
                                } else {
                                    it = this.f38202f.iterator();
                                    i11 = this.f38199c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i12 = i11;
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    @NonNull
    public final com.google.common.util.concurrent.m<T> b() {
        Object obj = this.f38198b.get();
        return obj instanceof a ? I.k.f(((a) obj).a()) : I.k.h(obj);
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    public final void c(@NonNull Executor executor, @NonNull InterfaceC5129y0.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f38197a) {
            a(aVar);
            bVar = new b<>(this.f38198b, executor, aVar);
            this.f38201e.put(aVar, bVar);
            this.f38202f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    public final void d(@NonNull InterfaceC5129y0.a<? super T> aVar) {
        synchronized (this.f38197a) {
            a(aVar);
        }
    }

    public final void f() {
        synchronized (this.f38197a) {
            try {
                Iterator it = new HashSet(this.f38201e.keySet()).iterator();
                while (it.hasNext()) {
                    a((InterfaceC5129y0.a) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(@NonNull Throwable th2) {
        j(new C5103l(th2));
    }

    public void h(T t2) {
        i(t2);
    }

    final void i(T t2) {
        j(t2);
    }
}
