package W5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f6832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f6833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M1 f6835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6837h;

    public J1(List list, Collection collection, Collection collection2, M1 m7, boolean z4, boolean z7, boolean z8, int i7) {
        this.f6831b = list;
        p113p3.f.k(collection, "drainedSubstreams");
        this.f6832c = collection;
        this.f6835f = m7;
        this.f6833d = collection2;
        this.f6836g = z4;
        this.f6830a = z7;
        this.f6837h = z8;
        this.f6834e = i7;
        p113p3.f.q("passThrough should imply buffer is null", !z7 || list == null);
        p113p3.f.q("passThrough should imply winningSubstream != null", (z7 && m7 == null) ? false : true);
        p113p3.f.q("passThrough should imply winningSubstream is drained", !z7 || (collection.size() == 1 && collection.contains(m7)) || (collection.size() == 0 && m7.f6878b));
        p113p3.f.q("cancelled should imply committed", (z4 && m7 == null) ? false : true);
    }

    public final J1 a(M1 m7) {
        Collection collectionUnmodifiableCollection;
        p113p3.f.q("hedging frozen", !this.f6837h);
        p113p3.f.q("already committed", this.f6835f == null);
        Collection collection = this.f6833d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(m7);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(m7);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new J1(this.f6831b, this.f6832c, collectionUnmodifiableCollection, this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e + 1);
    }

    public final J1 b(M1 m7) {
        ArrayList arrayList = new ArrayList(this.f6833d);
        arrayList.remove(m7);
        return new J1(this.f6831b, this.f6832c, Collections.unmodifiableCollection(arrayList), this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e);
    }

    public final J1 c(M1 m7, M1 m8) {
        ArrayList arrayList = new ArrayList(this.f6833d);
        arrayList.remove(m7);
        arrayList.add(m8);
        return new J1(this.f6831b, this.f6832c, Collections.unmodifiableCollection(arrayList), this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e);
    }

    public final J1 d(M1 m7) {
        m7.f6878b = true;
        Collection collection = this.f6832c;
        if (!collection.contains(m7)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(m7);
        return new J1(this.f6831b, Collections.unmodifiableCollection(arrayList), this.f6833d, this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e);
    }

    public final J1 e(M1 m7) {
        List list;
        p113p3.f.q("Already passThrough", !this.f6830a);
        boolean z4 = m7.f6878b;
        Collection collectionUnmodifiableCollection = this.f6832c;
        if (!z4) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(m7);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(m7);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        M1 m8 = this.f6835f;
        boolean z7 = m8 != null;
        if (z7) {
            p113p3.f.q("Another RPC attempt has already committed", m8 == m7);
            list = null;
        } else {
            list = this.f6831b;
        }
        return new J1(list, collection, this.f6833d, this.f6835f, this.f6836g, z7, this.f6837h, this.f6834e);
    }
}
