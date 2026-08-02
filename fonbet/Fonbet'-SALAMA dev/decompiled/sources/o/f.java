package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C1485c f15526a;

    /* renamed from: b, reason: collision with root package name */
    public C1485c f15527b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f15528c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f15529d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C1484b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f15529d != fVar.f15529d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            C1484b c1484b = (C1484b) it;
            if (!c1484b.hasNext()) {
                break;
            }
            C1484b c1484b2 = (C1484b) it2;
            if (!c1484b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1484b.next();
            Object next = c1484b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            C1484b c1484b = (C1484b) it;
            if (!c1484b.hasNext()) {
                return i7;
            }
            i7 += ((Map.Entry) c1484b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1484b c1484b = new C1484b(this.f15526a, this.f15527b, 0);
        this.f15528c.put(c1484b, Boolean.FALSE);
        return c1484b;
    }

    public C1485c l(Object obj) {
        C1485c c1485c = this.f15526a;
        while (c1485c != null && !c1485c.f15519a.equals(obj)) {
            c1485c = c1485c.f15521c;
        }
        return c1485c;
    }

    public Object m(Object obj) {
        C1485c l7 = l(obj);
        if (l7 == null) {
            return null;
        }
        this.f15529d--;
        WeakHashMap weakHashMap = this.f15528c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(l7);
            }
        }
        C1485c c1485c = l7.f15522d;
        if (c1485c != null) {
            c1485c.f15521c = l7.f15521c;
        } else {
            this.f15526a = l7.f15521c;
        }
        C1485c c1485c2 = l7.f15521c;
        if (c1485c2 != null) {
            c1485c2.f15522d = c1485c;
        } else {
            this.f15527b = c1485c;
        }
        l7.f15521c = null;
        l7.f15522d = null;
        return l7.f15520b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1484b c1484b = (C1484b) it;
            if (!c1484b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1484b.next()).toString());
            if (c1484b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
