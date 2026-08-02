package E3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: E3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0143a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f2033a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2034b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f2035c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f2036d = E.f1991a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f2037e;

    public C0143a(H h6) {
        this.f2037e = h6;
        this.f2033a = h6.f1996d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2033a.hasNext() || this.f2036d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2036d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f2033a.next();
            this.f2034b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f2035c = collection;
            this.f2036d = collection.iterator();
        }
        return this.f2036d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2036d.remove();
        Collection collection = this.f2035c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f2033a.remove();
        }
        H h6 = this.f2037e;
        h6.f1997e--;
    }
}
