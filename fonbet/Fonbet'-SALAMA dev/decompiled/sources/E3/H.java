package E3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class H extends AbstractC0157o implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient TreeMap f1996d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f1997e;

    /* renamed from: f, reason: collision with root package name */
    public transient G f1998f;

    @Override // E3.AbstractC0157o
    public final C0146d a() {
        C0146d c0146d = this.f2065c;
        if (c0146d == null) {
            TreeMap treeMap = this.f1996d;
            c0146d = treeMap != null ? new C0148f(this, treeMap) : treeMap != null ? new C0151i(this, treeMap) : new C0146d(this, treeMap);
            this.f2065c = c0146d;
        }
        return c0146d;
    }

    public final void b() {
        TreeMap treeMap = this.f1996d;
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        treeMap.clear();
        this.f1997e = 0;
    }

    public final List c() {
        return (List) this.f1998f.get();
    }
}
