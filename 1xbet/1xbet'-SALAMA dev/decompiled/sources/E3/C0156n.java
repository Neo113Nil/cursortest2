package E3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: E3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0156n extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2061a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2062b;

    public C0156n(H h6) {
        this.f2062b = h6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f2061a) {
            case 0:
                ((H) this.f2062b).b();
                break;
            default:
                ((C0146d) this.f2062b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2061a) {
            case 0:
                Iterator it = ((C0156n) ((H) this.f2062b).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return ((C0146d) this.f2062b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2061a) {
            case 1:
                return ((C0146d) this.f2062b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2061a) {
            case 0:
                return new C0143a((H) this.f2062b);
            default:
                return new F(((C0146d) this.f2062b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f2061a) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0146d c0146d = (C0146d) this.f2062b;
                    for (Map.Entry entry : c0146d.entrySet()) {
                        if (p097n3.a.t(obj, entry.getValue())) {
                            c0146d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f2061a) {
            case 1:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0146d c0146d = (C0146d) this.f2062b;
                    for (Map.Entry entry : c0146d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0146d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f2061a) {
            case 1:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0146d c0146d = (C0146d) this.f2062b;
                    for (Map.Entry entry : c0146d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0146d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f2061a) {
            case 0:
                return ((H) this.f2062b).f1997e;
            default:
                return ((C0146d) this.f2062b).size();
        }
    }

    public C0156n(C0146d c0146d) {
        this.f2062b = c0146d;
    }
}
