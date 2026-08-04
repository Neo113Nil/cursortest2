package E3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC0157o implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient TreeMap f1996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f1997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient G f1998f;

    @Override // E3.AbstractC0157o
    public final C0146d a() {
        C0146d c0151i;
        C0146d c0146d = this.f2065c;
        if (c0146d == null) {
            TreeMap treeMap = this.f1996d;
            if (treeMap != null) {
                c0151i = new C0148f(this, treeMap);
            } else {
                c0151i = treeMap != null ? new C0151i(this, treeMap) : new C0146d(this, treeMap);
            }
            c0146d = c0151i;
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
