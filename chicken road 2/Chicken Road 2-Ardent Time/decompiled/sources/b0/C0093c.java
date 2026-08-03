package b0;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093c implements a0.InterfaceC0060a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.window.extensions.layout.WindowLayoutComponent f2516a;

    /* renamed from: b, reason: collision with root package name */
    public final V.b f2517b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f2518c = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f2519d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashMap f2520e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f2521f = new java.util.LinkedHashMap();

    public C0093c(androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent, V.b bVar) {
        this.f2516a = windowLayoutComponent;
        this.f2517b = bVar;
    }

    @Override // a0.InterfaceC0060a
    public final void a(P0.q qVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f2518c;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f2520e;
        try {
            android.content.Context context = (android.content.Context) linkedHashMap.get(qVar);
            if (context == null) {
                return;
            }
            java.util.LinkedHashMap linkedHashMap2 = this.f2519d;
            b0.f fVar = (b0.f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(qVar);
            linkedHashMap.remove(qVar);
            if (fVar.f2529d.isEmpty()) {
                linkedHashMap2.remove(context);
                W.d dVar = (W.d) this.f2521f.remove(fVar);
                if (dVar != null) {
                    dVar.f1811a.invoke(dVar.f1812b, dVar.f1813c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a0.InterfaceC0060a
    public final void b(android.content.Context context, N.c cVar, P0.q qVar) {
        h1.C0177i c0177i;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f2518c;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = this.f2519d;
        try {
            b0.f fVar = (b0.f) linkedHashMap.get(context);
            java.util.LinkedHashMap linkedHashMap2 = this.f2520e;
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
                if (!(context instanceof android.app.Activity)) {
                    fVar2.accept(new androidx.window.extensions.layout.WindowLayoutInfo(i1.C0199r.f3325a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f2521f.put(fVar2, this.f2517b.a(this.f2516a, kotlin.jvm.internal.q.a(androidx.window.extensions.layout.WindowLayoutInfo.class), (android.app.Activity) context, new b0.C0092b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
