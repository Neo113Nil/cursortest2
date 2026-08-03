package b0;

/* loaded from: classes.dex */
public final class d implements a0.InterfaceC0060a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.window.extensions.layout.WindowLayoutComponent f2522a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f2523b = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f2524c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f2525d = new java.util.LinkedHashMap();

    public d(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent) {
        this.f2522a = windowLayoutComponent;
    }

    @Override // a0.InterfaceC0060a
    public final void a(P0.q qVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f2523b;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f2525d;
        try {
            android.content.Context context = (android.content.Context) linkedHashMap.get(qVar);
            if (context == null) {
                return;
            }
            java.util.LinkedHashMap linkedHashMap2 = this.f2524c;
            b0.f fVar = (b0.f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(qVar);
            linkedHashMap.remove(qVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f2522a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a0.InterfaceC0060a
    public final void b(android.content.Context context, N.c cVar, P0.q qVar) {
        h1.C0177i c0177i;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f2523b;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f2524c;
        try {
            b0.f fVar = (b0.f) linkedHashMap.get(context);
            java.util.LinkedHashMap linkedHashMap2 = this.f2525d;
            if (fVar != null) {
                fVar.b(qVar);
                linkedHashMap2.put(qVar, context);
                c0177i = h1.C0177i.f3302a;
            } else {
                c0177i = null;
            }
            if (c0177i == null) {
                b0.f fVar2 = new b0.f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(qVar, context);
                fVar2.b(qVar);
                this.f2522a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
