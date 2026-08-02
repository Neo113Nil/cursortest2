package j1;

import d1.n;
import i1.C1244c;
import i1.InterfaceC1243b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import k1.AbstractC1332d;
import m1.i;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1301b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14546a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f14547b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1332d f14548c;

    /* renamed from: d, reason: collision with root package name */
    public C1244c f14549d;

    public AbstractC1301b(AbstractC1332d abstractC1332d) {
        this.f14548c = abstractC1332d;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f14546a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f14546a.add(iVar.f15216a);
            }
        }
        if (this.f14546a.isEmpty()) {
            this.f14548c.b(this);
        } else {
            AbstractC1332d abstractC1332d = this.f14548c;
            synchronized (abstractC1332d.f14666c) {
                try {
                    if (abstractC1332d.f14667d.add(this)) {
                        if (abstractC1332d.f14667d.size() == 1) {
                            abstractC1332d.f14668e = abstractC1332d.a();
                            n.d().b(AbstractC1332d.f14663f, String.format("%s: initial state = %s", abstractC1332d.getClass().getSimpleName(), abstractC1332d.f14668e), new Throwable[0]);
                            abstractC1332d.d();
                        }
                        Object obj = abstractC1332d.f14668e;
                        this.f14547b = obj;
                        d(this.f14549d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f14549d, this.f14547b);
    }

    public final void d(C1244c c1244c, Object obj) {
        if (this.f14546a.isEmpty() || c1244c == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f14546a;
            synchronized (c1244c.f13836c) {
                InterfaceC1243b interfaceC1243b = c1244c.f13834a;
                if (interfaceC1243b != null) {
                    interfaceC1243b.d(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f14546a;
        synchronized (c1244c.f13836c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c1244c.a(str)) {
                        n.d().b(C1244c.f13833d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                InterfaceC1243b interfaceC1243b2 = c1244c.f13834a;
                if (interfaceC1243b2 != null) {
                    interfaceC1243b2.f(arrayList3);
                }
            } finally {
            }
        }
    }
}
