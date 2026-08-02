package l2;

import f2.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import k2.C2032c;
import k2.InterfaceC2031b;
import m2.AbstractC2087d;
import o2.i;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17765a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f17766b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2087d f17767c;

    /* renamed from: d, reason: collision with root package name */
    public C2032c f17768d;

    public b(AbstractC2087d abstractC2087d) {
        this.f17767c = abstractC2087d;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f17765a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f17765a.add(iVar.f18633a);
            }
        }
        if (this.f17765a.isEmpty()) {
            this.f17767c.b(this);
        } else {
            AbstractC2087d abstractC2087d = this.f17767c;
            synchronized (abstractC2087d.f17986c) {
                try {
                    if (abstractC2087d.f17987d.add(this)) {
                        if (abstractC2087d.f17987d.size() == 1) {
                            abstractC2087d.f17988e = abstractC2087d.a();
                            m.d().a(AbstractC2087d.f, String.format("%s: initial state = %s", abstractC2087d.getClass().getSimpleName(), abstractC2087d.f17988e), new Throwable[0]);
                            abstractC2087d.d();
                        }
                        Object obj = abstractC2087d.f17988e;
                        this.f17766b = obj;
                        d(this.f17768d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f17768d, this.f17766b);
    }

    public final void d(C2032c c2032c, Object obj) {
        if (this.f17765a.isEmpty() || c2032c == null) {
            return;
        }
        if (obj == null || b(obj)) {
            c2032c.b(this.f17765a);
            return;
        }
        ArrayList arrayList = this.f17765a;
        synchronized (c2032c.f17585c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    String str = (String) obj2;
                    if (c2032c.a(str)) {
                        m.d().a(C2032c.f17582d, "Constraints met for " + str, new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                InterfaceC2031b interfaceC2031b = c2032c.f17583a;
                if (interfaceC2031b != null) {
                    interfaceC2031b.e(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
