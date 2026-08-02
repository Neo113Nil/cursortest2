package androidx.work.impl;

import androidx.work.n;

/* loaded from: classes8.dex */
final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.work.impl.utils.futures.c f45320a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M f45321b;

    K(M m11, androidx.work.impl.utils.futures.c cVar) {
        this.f45321b = m11;
        this.f45320a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M m11 = this.f45321b;
        androidx.work.impl.utils.futures.c<n.a> cVar = m11.f45341q;
        if (cVar.isCancelled()) {
            return;
        }
        try {
            this.f45320a.get();
            androidx.work.o.e().a(M.f45324s, "Starting work for " + m11.f45329e.f63801c);
            cVar.m(m11.f45330f.startWork());
        } catch (Throwable th2) {
            cVar.l(th2);
        }
    }
}
