package c0;

/* loaded from: classes.dex */
public final class k implements a0.InterfaceC0060a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c0.k f2568c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f2569d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final c0.i f2570a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f2571b = new java.util.concurrent.CopyOnWriteArrayList();

    public k(c0.i iVar) {
        this.f2570a = iVar;
        if (iVar != null) {
            iVar.h(new Z0.h(15, this));
        }
    }

    @Override // a0.InterfaceC0060a
    public final void a(P0.q qVar) {
        synchronized (f2569d) {
            try {
                if (this.f2570a == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = this.f2571b.iterator();
                while (it.hasNext()) {
                    c0.j jVar = (c0.j) it.next();
                    if (jVar.f2566b == qVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f2571b.removeAll(arrayList);
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    android.app.Activity activity = ((c0.j) it2.next()).f2565a;
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2571b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        java.util.Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((c0.j) it3.next()).f2565a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    c0.i iVar = this.f2570a;
                    if (iVar != null) {
                        iVar.f(activity);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // a0.InterfaceC0060a
    public final void b(android.content.Context context, N.c cVar, P0.q qVar) {
        java.lang.Object obj;
        android.view.WindowManager.LayoutParams attributes;
        h1.C0177i c0177i = null;
        r1 = null;
        android.os.IBinder iBinder = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        i1.C0199r c0199r = i1.C0199r.f3325a;
        if (activity != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = f2569d;
            reentrantLock.lock();
            try {
                c0.i iVar = this.f2570a;
                if (iVar == null) {
                    qVar.accept(new Z.j(c0199r));
                    return;
                }
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f2571b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((c0.j) it.next()).f2565a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                c0.j jVar = new c0.j(activity, cVar, qVar);
                copyOnWriteArrayList.add(jVar);
                if (z2) {
                    java.util.Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((c0.j) obj).f2565a)) {
                                break;
                            }
                        }
                    }
                    c0.j jVar2 = (c0.j) obj;
                    Z.j jVar3 = jVar2 != null ? jVar2.f2567c : null;
                    if (jVar3 != null) {
                        jVar.f2567c = jVar3;
                        jVar.f2566b.accept(jVar3);
                    }
                } else {
                    android.view.Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c0.h(iVar, activity));
                    }
                }
                reentrantLock.unlock();
                c0177i = h1.C0177i.f3302a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0177i == null) {
            qVar.accept(new Z.j(c0199r));
        }
    }
}
