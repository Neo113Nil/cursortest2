package W5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6830a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6831b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f6832c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f6833d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6834e;

    /* renamed from: f, reason: collision with root package name */
    public final M1 f6835f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6836g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6837h;

    public J1(List list, Collection collection, Collection collection2, M1 m12, boolean z4, boolean z7, boolean z8, int i7) {
        this.f6831b = list;
        p3.f.k(collection, "drainedSubstreams");
        this.f6832c = collection;
        this.f6835f = m12;
        this.f6833d = collection2;
        this.f6836g = z4;
        this.f6830a = z7;
        this.f6837h = z8;
        this.f6834e = i7;
        p3.f.q("passThrough should imply buffer is null", !z7 || list == null);
        p3.f.q("passThrough should imply winningSubstream != null", (z7 && m12 == null) ? false : true);
        p3.f.q("passThrough should imply winningSubstream is drained", !z7 || (collection.size() == 1 && collection.contains(m12)) || (collection.size() == 0 && m12.f6878b));
        p3.f.q("cancelled should imply committed", (z4 && m12 == null) ? false : true);
    }

    public final J1 a(M1 m12) {
        Collection unmodifiableCollection;
        p3.f.q("hedging frozen", !this.f6837h);
        p3.f.q("already committed", this.f6835f == null);
        Collection collection = this.f6833d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(m12);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(m12);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new J1(this.f6831b, this.f6832c, unmodifiableCollection, this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e + 1);
    }

    public final J1 b(M1 m12) {
        ArrayList arrayList = new ArrayList(this.f6833d);
        arrayList.remove(m12);
        return new J1(this.f6831b, this.f6832c, Collections.unmodifiableCollection(arrayList), this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e);
    }

    public final J1 c(M1 m12, M1 m13) {
        ArrayList arrayList = new ArrayList(this.f6833d);
        arrayList.remove(m12);
        arrayList.add(m13);
        return new J1(this.f6831b, this.f6832c, Collections.unmodifiableCollection(arrayList), this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e);
    }

    public final J1 d(M1 m12) {
        m12.f6878b = true;
        Collection collection = this.f6832c;
        if (!collection.contains(m12)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(m12);
        return new J1(this.f6831b, Collections.unmodifiableCollection(arrayList), this.f6833d, this.f6835f, this.f6836g, this.f6830a, this.f6837h, this.f6834e);
    }

    public final J1 e(M1 m12) {
        List list;
        p3.f.q("Already passThrough", !this.f6830a);
        boolean z4 = m12.f6878b;
        Collection collection = this.f6832c;
        if (!z4) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(m12);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(m12);
                collection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        M1 m13 = this.f6835f;
        boolean z7 = m13 != null;
        if (z7) {
            p3.f.q("Another RPC attempt has already committed", m13 == m12);
            list = null;
        } else {
            list = this.f6831b;
        }
        return new J1(list, collection2, this.f6833d, this.f6835f, this.f6836g, z7, this.f6837h, this.f6834e);
    }
}
