package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class b0 extends java.util.AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.Y f2286a;

    public b0(androidx.datastore.preferences.protobuf.Y y2) {
        this.f2286a = y2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f2286a.put((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2286a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.f2286a.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.a0(this.f2286a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f2286a.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2286a.size();
    }
}
