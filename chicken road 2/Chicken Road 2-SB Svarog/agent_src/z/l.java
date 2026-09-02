package z;

import F.C0017s;
import X.m;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import o.ExecutorC0072d;
import x.InterfaceC0099a;

/* loaded from: classes.dex */
public final class l implements InterfaceC0099a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l f1340c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1341d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0106a f1342a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1343b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f1342a = jVar;
        if (jVar != null) {
            jVar.d(new io.flutter.plugin.platform.i(4, this));
        }
    }

    @Override // x.InterfaceC0099a
    public final void a(Context context, ExecutorC0072d executorC0072d, C0017s c0017s) {
        Object obj;
        WindowManager.LayoutParams attributes;
        W.g gVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        m mVar = m.f402b;
        if (activity != null) {
            ReentrantLock reentrantLock = f1341d;
            reentrantLock.lock();
            try {
                InterfaceC0106a interfaceC0106a = this.f1342a;
                if (interfaceC0106a == null) {
                    c0017s.accept(new w.k(mVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1343b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k) it.next()).f1337a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, executorC0072d, c0017s);
                copyOnWriteArrayList.add(kVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((k) obj).f1337a)) {
                                break;
                            }
                        }
                    }
                    k kVar2 = (k) obj;
                    w.k kVar3 = kVar2 != null ? kVar2.f1339c : null;
                    if (kVar3 != null) {
                        kVar.f1339c = kVar3;
                        kVar.f1338b.accept(kVar3);
                    }
                } else {
                    j jVar = (j) interfaceC0106a;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i(jVar, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = W.g.f394a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (gVar == null) {
            c0017s.accept(new w.k(mVar));
        }
    }

    @Override // x.InterfaceC0099a
    public final void b(C0017s c0017s) {
        synchronized (f1341d) {
            try {
                if (this.f1342a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f1343b.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.f1338b == c0017s) {
                        arrayList.add(kVar);
                    }
                }
                this.f1343b.removeAll(arrayList);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Activity activity = ((k) obj).f1337a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1343b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()).f1337a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    InterfaceC0106a interfaceC0106a = this.f1342a;
                    if (interfaceC0106a != null) {
                        ((j) interfaceC0106a).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
