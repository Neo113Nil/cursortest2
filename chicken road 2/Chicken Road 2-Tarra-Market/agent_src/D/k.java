package D;

import L0.l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements B.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f156c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f157d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f158a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f159b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f158a = iVar;
        if (iVar != null) {
            iVar.h(new C0.a(20, this));
        }
    }

    @Override // B.a
    public final void a(Context context, r.c cVar, A.i iVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        K0.i iVar2 = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        l lVar = l.f214a;
        if (activity != null) {
            ReentrantLock reentrantLock = f157d;
            reentrantLock.lock();
            try {
                i iVar3 = this.f158a;
                if (iVar3 == null) {
                    iVar.accept(new A.l(lVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f159b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f153a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, cVar, iVar);
                copyOnWriteArrayList.add(jVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f153a)) {
                                break;
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    A.l lVar2 = jVar2 != null ? jVar2.f155c : null;
                    if (lVar2 != null) {
                        jVar.f155c = lVar2;
                        jVar.f154b.accept(lVar2);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar3.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new h(iVar3, activity));
                    }
                }
                reentrantLock.unlock();
                iVar2 = K0.i.f206a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (iVar2 == null) {
            iVar.accept(new A.l(lVar));
        }
    }

    @Override // B.a
    public final void b(A.i iVar) {
        synchronized (f157d) {
            try {
                if (this.f158a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f159b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f154b == iVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f159b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f153a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f159b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f153a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar2 = this.f158a;
                    if (iVar2 != null) {
                        iVar2.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
