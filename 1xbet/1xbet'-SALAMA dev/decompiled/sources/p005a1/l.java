package p005a1;

import X0.i;
import Y0.a;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import p050g6.p;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l f7968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f7969d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f7970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7971b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f7970a = jVar;
        if (jVar != null) {
            jVar.h(new C1052y0(this, 12));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // Y0.a
    public final void a(Context context, p094n.a aVar, i iVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        p044f6.i iVar2 = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        p pVar = p.f13308a;
        if (activity != null) {
            ReentrantLock reentrantLock = f7969d;
            reentrantLock.lock();
            try {
                j jVar = this.f7970a;
                if (jVar == null) {
                    iVar.accept(new X0.l(pVar));
                    reentrantLock.unlock();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f7971b;
                boolean z4 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (((k) it.next()).f7965a.equals(activity)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, aVar, iVar);
                copyOnWriteArrayList.add(kVar);
                if (z4) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!activity.equals(((k) next).f7965a));
                    k kVar2 = (k) next;
                    X0.l lVar = kVar2 != null ? kVar2.f7967c : null;
                    if (lVar != null) {
                        kVar.f7967c = lVar;
                        kVar.f7966b.accept(lVar);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i(jVar, activity));
                    }
                }
                reentrantLock.unlock();
                iVar2 = p044f6.i.f13014a;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (iVar2 == null) {
            iVar.accept(new X0.l(pVar));
        }
    }

    @Override // Y0.a
    public final void b(i iVar) {
        synchronized (f7969d) {
            try {
                if (this.f7970a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (k kVar : this.f7971b) {
                    if (kVar.f7966b == iVar) {
                        arrayList.add(kVar);
                    }
                }
                this.f7971b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((k) it.next()).f7965a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f7971b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((k) it2.next()).f7965a.equals(activity)) {
                                }
                            }
                        }
                    }
                    j jVar = this.f7970a;
                    if (jVar != null) {
                        jVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
