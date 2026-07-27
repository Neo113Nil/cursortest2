package y0;

import B0.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import s0.s;
import x0.InterfaceC1536b;
import z0.e;
import z0.f;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1552b {

    /* renamed from: a, reason: collision with root package name */
    public final e f12333a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12334b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12335c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12336d;

    /* renamed from: e, reason: collision with root package name */
    public x0.c f12337e;

    public AbstractC1552b(e tracker) {
        i.e(tracker, "tracker");
        this.f12333a = tracker;
        this.f12334b = new ArrayList();
        this.f12335c = new ArrayList();
    }

    public abstract boolean a(q qVar);

    public abstract boolean b(Object obj);

    public final void c(Collection workSpecs) {
        i.e(workSpecs, "workSpecs");
        this.f12334b.clear();
        this.f12335c.clear();
        ArrayList arrayList = this.f12334b;
        for (Object obj : workSpecs) {
            if (a((q) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f12334b;
        ArrayList arrayList3 = this.f12335c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((q) it.next()).f173a);
        }
        if (this.f12334b.isEmpty()) {
            this.f12333a.b(this);
        } else {
            e eVar = this.f12333a;
            eVar.getClass();
            synchronized (eVar.f12454c) {
                try {
                    if (eVar.f12455d.add(this)) {
                        if (eVar.f12455d.size() == 1) {
                            eVar.f12456e = eVar.a();
                            s.d().a(f.f12457a, eVar.getClass().getSimpleName() + ": initial state = " + eVar.f12456e);
                            eVar.d();
                        }
                        Object obj2 = eVar.f12456e;
                        this.f12336d = obj2;
                        d(this.f12337e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f12337e, this.f12336d);
    }

    public final void d(x0.c cVar, Object obj) {
        if (this.f12334b.isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList workSpecs = this.f12334b;
            i.e(workSpecs, "workSpecs");
            synchronized (cVar.f12260c) {
                InterfaceC1536b interfaceC1536b = (InterfaceC1536b) cVar.f12258a;
                if (interfaceC1536b != null) {
                    interfaceC1536b.b(workSpecs);
                }
            }
            return;
        }
        ArrayList workSpecs2 = this.f12334b;
        i.e(workSpecs2, "workSpecs");
        synchronized (cVar.f12260c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = workSpecs2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (cVar.a(((q) next).f173a)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    s.d().a(x0.d.f12261a, "Constraints met for " + qVar);
                }
                InterfaceC1536b interfaceC1536b2 = (InterfaceC1536b) cVar.f12258a;
                if (interfaceC1536b2 != null) {
                    interfaceC1536b2.c(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
