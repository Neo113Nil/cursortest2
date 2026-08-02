package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e31 {

    /* JADX INFO: renamed from: a */
    public final boolean f1931a;

    /* JADX INFO: renamed from: b */
    public final List f1932b;

    /* JADX INFO: renamed from: c */
    public final Collection f1933c;

    /* JADX INFO: renamed from: d */
    public final Collection f1934d;

    /* JADX INFO: renamed from: e */
    public final int f1935e;

    /* JADX INFO: renamed from: f */
    public final i31 f1936f;

    /* JADX INFO: renamed from: g */
    public final boolean f1937g;

    /* JADX INFO: renamed from: h */
    public final boolean f1938h;

    public e31(List list, Collection collection, Collection collection2, i31 i31Var, boolean z, boolean z2, boolean z3, int i) {
        this.f1932b = list;
        a90.m127k(collection, "drainedSubstreams");
        this.f1933c = collection;
        this.f1936f = i31Var;
        this.f1934d = collection2;
        this.f1937g = z;
        this.f1931a = z2;
        this.f1938h = z3;
        this.f1935e = i;
        a90.m132p("passThrough should imply buffer is null", !z2 || list == null);
        a90.m132p("passThrough should imply winningSubstream != null", (z2 && i31Var == null) ? false : true);
        a90.m132p("passThrough should imply winningSubstream is drained", !z2 || (collection.size() == 1 && collection.contains(i31Var)) || (collection.size() == 0 && i31Var.f3419b));
        a90.m132p("cancelled should imply committed", (z && i31Var == null) ? false : true);
    }

    /* JADX INFO: renamed from: a */
    public final e31 m1355a(i31 i31Var) {
        Collection collectionUnmodifiableCollection;
        a90.m132p("hedging frozen", !this.f1938h);
        a90.m132p("already committed", this.f1936f == null);
        Collection collection = this.f1934d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(i31Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(i31Var);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new e31(this.f1932b, this.f1933c, collectionUnmodifiableCollection, this.f1936f, this.f1937g, this.f1931a, this.f1938h, this.f1935e + 1);
    }

    /* JADX INFO: renamed from: b */
    public final e31 m1356b(i31 i31Var) {
        ArrayList arrayList = new ArrayList(this.f1934d);
        arrayList.remove(i31Var);
        return new e31(this.f1932b, this.f1933c, Collections.unmodifiableCollection(arrayList), this.f1936f, this.f1937g, this.f1931a, this.f1938h, this.f1935e);
    }

    /* JADX INFO: renamed from: c */
    public final e31 m1357c(i31 i31Var, i31 i31Var2) {
        ArrayList arrayList = new ArrayList(this.f1934d);
        arrayList.remove(i31Var);
        arrayList.add(i31Var2);
        return new e31(this.f1932b, this.f1933c, Collections.unmodifiableCollection(arrayList), this.f1936f, this.f1937g, this.f1931a, this.f1938h, this.f1935e);
    }

    /* JADX INFO: renamed from: d */
    public final e31 m1358d(i31 i31Var) {
        i31Var.f3419b = true;
        Collection collection = this.f1933c;
        if (!collection.contains(i31Var)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(i31Var);
        return new e31(this.f1932b, Collections.unmodifiableCollection(arrayList), this.f1934d, this.f1936f, this.f1937g, this.f1931a, this.f1938h, this.f1935e);
    }

    /* JADX INFO: renamed from: e */
    public final e31 m1359e(i31 i31Var) {
        List list;
        a90.m132p("Already passThrough", !this.f1931a);
        boolean z = i31Var.f3419b;
        Collection collectionUnmodifiableCollection = this.f1933c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(i31Var);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(i31Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        i31 i31Var2 = this.f1936f;
        boolean z2 = i31Var2 != null;
        if (z2) {
            a90.m132p("Another RPC attempt has already committed", i31Var2 == i31Var);
            list = null;
        } else {
            list = this.f1932b;
        }
        return new e31(list, collection, this.f1934d, this.f1936f, this.f1937g, z2, this.f1938h, this.f1935e);
    }
}
