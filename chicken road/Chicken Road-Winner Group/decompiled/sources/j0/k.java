package j0;

import I1.n;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import d2.C0279i;
import e2.o;
import g0.C0311j;
import h0.InterfaceC0324a;
import io.flutter.plugin.platform.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements InterfaceC0324a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f9522c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f9523d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f9524a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f9525b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f9524a = iVar;
        if (iVar != null) {
            iVar.d(new io.flutter.plugin.editing.k(this));
        }
    }

    @Override // h0.InterfaceC0324a
    public final void a(Context context, S.c cVar, n nVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        C0279i c0279i = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        o oVar = o.f4877a;
        if (activity != null) {
            ReentrantLock reentrantLock = f9523d;
            reentrantLock.lock();
            try {
                i iVar = this.f9524a;
                if (iVar == null) {
                    nVar.accept(new C0311j(oVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f9525b;
                boolean z3 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f9519a.equals(activity)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, cVar, nVar);
                copyOnWriteArrayList.add(jVar);
                if (z3) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f9519a)) {
                                break;
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    C0311j c0311j = jVar2 != null ? jVar2.f9521c : null;
                    if (c0311j != null) {
                        jVar.f9521c = c0311j;
                        jVar.f9520b.accept(c0311j);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new B(iVar, activity));
                    }
                }
                reentrantLock.unlock();
                c0279i = C0279i.f4852a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0279i == null) {
            nVar.accept(new C0311j(oVar));
        }
    }

    @Override // h0.InterfaceC0324a
    public final void b(n nVar) {
        synchronized (f9523d) {
            try {
                if (this.f9524a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f9525b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f9520b == nVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f9525b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f9519a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f9525b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f9519a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar = this.f9524a;
                    if (iVar != null) {
                        iVar.b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
