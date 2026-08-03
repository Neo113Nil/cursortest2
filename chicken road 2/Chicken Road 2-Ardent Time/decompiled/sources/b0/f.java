package b0;

/* loaded from: classes.dex */
public final class f implements x.InterfaceC1010a, androidx.window.extensions.core.util.function.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f2526a;

    /* renamed from: c, reason: collision with root package name */
    public Z.j f2528c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f2527b = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashSet f2529d = new java.util.LinkedHashSet();

    public f(android.content.Context context) {
        this.f2526a = context;
    }

    @Override // x.InterfaceC1010a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(androidx.window.extensions.layout.WindowLayoutInfo value) {
        kotlin.jvm.internal.i.e(value, "value");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f2527b;
        reentrantLock.lock();
        try {
            this.f2528c = b0.e.c(this.f2526a, value);
            java.util.Iterator it = this.f2529d.iterator();
            while (it.hasNext()) {
                ((x.InterfaceC1010a) it.next()).accept(this.f2528c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(P0.q qVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f2527b;
        reentrantLock.lock();
        try {
            Z.j jVar = this.f2528c;
            if (jVar != null) {
                qVar.accept(jVar);
            }
            this.f2529d.add(qVar);
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f2529d.isEmpty();
    }

    public final void d(P0.q qVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f2527b;
        reentrantLock.lock();
        try {
            this.f2529d.remove(qVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
