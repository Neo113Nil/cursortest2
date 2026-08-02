package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2240f implements Iterable {

    /* renamed from: k, reason: collision with root package name */
    public C2237c f18684k;

    /* renamed from: l, reason: collision with root package name */
    public C2237c f18685l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f18686m = new WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    public int f18687n = 0;

    public C2237c c(Object obj) {
        C2237c c2237c = this.f18684k;
        while (c2237c != null && !c2237c.f18677k.equals(obj)) {
            c2237c = c2237c.f18679m;
        }
        return c2237c;
    }

    public Object d(Object obj) {
        C2237c c5 = c(obj);
        if (c5 == null) {
            return null;
        }
        this.f18687n--;
        WeakHashMap weakHashMap = this.f18686m;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2239e) it.next()).a(c5);
            }
        }
        C2237c c2237c = c5.f18680n;
        if (c2237c != null) {
            c2237c.f18679m = c5.f18679m;
        } else {
            this.f18684k = c5.f18679m;
        }
        C2237c c2237c2 = c5.f18679m;
        if (c2237c2 != null) {
            c2237c2.f18680n = c2237c;
        } else {
            this.f18685l = c2237c;
        }
        c5.f18679m = null;
        c5.f18680n = null;
        return c5.f18678l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p.C2236b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240f)) {
            return false;
        }
        C2240f c2240f = (C2240f) obj;
        if (this.f18687n != c2240f.f18687n) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2240f.iterator();
        while (true) {
            C2236b c2236b = (C2236b) it;
            if (!c2236b.hasNext()) {
                break;
            }
            C2236b c2236b2 = (C2236b) it2;
            if (!c2236b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2236b.next();
            Object next = c2236b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C2236b c2236b = (C2236b) it;
            if (!c2236b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c2236b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2236b c2236b = new C2236b(this.f18684k, this.f18685l, 0);
        this.f18686m.put(c2236b, Boolean.FALSE);
        return c2236b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2236b c2236b = (C2236b) it;
            if (!c2236b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2236b.next()).toString());
            if (c2236b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
