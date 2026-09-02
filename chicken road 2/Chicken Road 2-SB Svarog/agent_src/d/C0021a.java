package d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021a implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f482b = new WeakHashMap();

    public C0021a() {
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0021a)) {
            return false;
        }
        C0021a c0021a = (C0021a) obj;
        c0021a.getClass();
        iterator();
        c0021a.iterator();
        return true;
    }

    public final int hashCode() {
        iterator();
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0022b c0022b = new C0022b();
        this.f482b.put(c0022b, Boolean.FALSE);
        return c0022b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        iterator();
        sb.append("]");
        return sb.toString();
    }
}
