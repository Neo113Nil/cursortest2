package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5117s0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5129y0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.core.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5117s0<T> implements InterfaceC5129y0<T> {

    /* renamed from: a, reason: collision with root package name */
    final androidx.lifecycle.V<b<T>> f38386a = new androidx.lifecycle.V<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f38387b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.s0$a */
    static final class a<T> implements androidx.lifecycle.W<b<T>> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f38388a = new AtomicBoolean(true);

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC5129y0.a<? super T> f38389b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f38390c;

        a(@NonNull Executor executor, @NonNull InterfaceC5129y0.a<? super T> aVar) {
            this.f38390c = executor;
            this.f38389b = aVar;
        }

        @Override // androidx.lifecycle.W
        public final void onChanged(@NonNull Object obj) {
            final b bVar = (b) obj;
            this.f38390c.execute(new Runnable() { // from class: androidx.camera.core.impl.r0
                @Override // java.lang.Runnable
                public final void run() {
                    C5117s0.a aVar = C5117s0.a.this;
                    if (aVar.f38388a.get()) {
                        C5117s0.b bVar2 = bVar;
                        bVar2.getClass();
                        aVar.f38389b.a(bVar2.b());
                    }
                }
            });
        }
    }

    /* renamed from: androidx.camera.core.impl.s0$b */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final I.a f38391a;

        private b(I.a aVar) {
            this.f38391a = aVar;
        }

        static b a(I.a aVar) {
            return new b(aVar);
        }

        public final T b() {
            return (T) this.f38391a;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[Result: <");
            sb2.append("Value: " + this.f38391a);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public final void a(I.a aVar) {
        this.f38386a.postValue(b.a(aVar));
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    @NonNull
    public final com.google.common.util.concurrent.m<T> b() {
        return androidx.concurrent.futures.b.a(new B90.O(this));
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    public final void c(@NonNull Executor executor, @NonNull InterfaceC5129y0.a<? super T> aVar) {
        synchronized (this.f38387b) {
            final a aVar2 = (a) this.f38387b.get(aVar);
            if (aVar2 != null) {
                aVar2.f38388a.set(false);
            }
            final a aVar3 = new a(executor, aVar);
            this.f38387b.put(aVar, aVar3);
            H.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.o0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.lifecycle.P p11 = C5117s0.this.f38386a;
                    C5117s0.a aVar4 = aVar2;
                    if (aVar4 != null) {
                        p11.removeObserver(aVar4);
                    }
                    p11.observeForever(aVar3);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    public final void d(@NonNull InterfaceC5129y0.a<? super T> aVar) {
        synchronized (this.f38387b) {
            try {
                final a aVar2 = (a) this.f38387b.remove(aVar);
                if (aVar2 != null) {
                    aVar2.f38388a.set(false);
                    H.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5117s0.this.f38386a.removeObserver(aVar2);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
