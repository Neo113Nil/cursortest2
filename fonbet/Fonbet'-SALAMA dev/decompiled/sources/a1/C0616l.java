package a1;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import f6.C1116i;
import g6.C1167p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import n.ExecutorC1441a;
import w1.C1761y0;

/* renamed from: a1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616l implements Y0.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0616l f7968c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f7969d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final C0614j f7970a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7971b = new CopyOnWriteArrayList();

    public C0616l(C0614j c0614j) {
        this.f7970a = c0614j;
        if (c0614j != null) {
            c0614j.h(new C1761y0(this, 12));
        }
    }

    @Override // Y0.a
    public final void a(Context context, ExecutorC1441a executorC1441a, X0.i iVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        C1116i c1116i = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        C1167p c1167p = C1167p.f13302a;
        if (activity != null) {
            ReentrantLock reentrantLock = f7969d;
            reentrantLock.lock();
            try {
                C0614j c0614j = this.f7970a;
                if (c0614j == null) {
                    iVar.accept(new X0.l(c1167p));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f7971b;
                boolean z4 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((C0615k) it.next()).f7965a.equals(activity)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                C0615k c0615k = new C0615k(activity, executorC1441a, iVar);
                copyOnWriteArrayList.add(c0615k);
                if (z4) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((C0615k) obj).f7965a)) {
                                break;
                            }
                        }
                    }
                    C0615k c0615k2 = (C0615k) obj;
                    X0.l lVar = c0615k2 != null ? c0615k2.f7967c : null;
                    if (lVar != null) {
                        c0615k.f7967c = lVar;
                        c0615k.f7966b.accept(lVar);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        c0614j.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0613i(c0614j, activity));
                    }
                }
                reentrantLock.unlock();
                c1116i = C1116i.f13008a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c1116i == null) {
            iVar.accept(new X0.l(c1167p));
        }
    }

    @Override // Y0.a
    public final void b(X0.i iVar) {
        synchronized (f7969d) {
            try {
                if (this.f7970a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f7971b.iterator();
                while (it.hasNext()) {
                    C0615k c0615k = (C0615k) it.next();
                    if (c0615k.f7966b == iVar) {
                        arrayList.add(c0615k);
                    }
                }
                this.f7971b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C0615k) it2.next()).f7965a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f7971b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((C0615k) it3.next()).f7965a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    C0614j c0614j = this.f7970a;
                    if (c0614j != null) {
                        c0614j.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
