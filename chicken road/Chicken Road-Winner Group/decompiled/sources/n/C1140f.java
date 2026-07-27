package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1140f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C1137c f10124a;

    /* renamed from: b, reason: collision with root package name */
    public C1137c f10125b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f10126c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f10127d = 0;

    public C1137c b(Object obj) {
        C1137c c1137c = this.f10124a;
        while (c1137c != null && !c1137c.f10117a.equals(obj)) {
            c1137c = c1137c.f10119c;
        }
        return c1137c;
    }

    public Object c(Object obj) {
        C1137c b3 = b(obj);
        if (b3 == null) {
            return null;
        }
        this.f10127d--;
        WeakHashMap weakHashMap = this.f10126c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1139e) it.next()).a(b3);
            }
        }
        C1137c c1137c = b3.f10120d;
        if (c1137c != null) {
            c1137c.f10119c = b3.f10119c;
        } else {
            this.f10124a = b3.f10119c;
        }
        C1137c c1137c2 = b3.f10119c;
        if (c1137c2 != null) {
            c1137c2.f10120d = c1137c;
        } else {
            this.f10125b = c1137c;
        }
        b3.f10119c = null;
        b3.f10120d = null;
        return b3.f10118b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((n.C1136b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C1140f)) {
            return false;
        }
        C1140f c1140f = (C1140f) obj;
        if (this.f10127d != c1140f.f10127d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1140f.iterator();
        while (true) {
            C1136b c1136b = (C1136b) it;
            if (!c1136b.hasNext()) {
                break;
            }
            C1136b c1136b2 = (C1136b) it2;
            if (!c1136b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1136b.next();
            Object next = c1136b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C1136b c1136b = (C1136b) it;
            if (!c1136b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c1136b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1136b c1136b = new C1136b(this.f10124a, this.f10125b, 0);
        this.f10126c.put(c1136b, Boolean.FALSE);
        return c1136b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1136b c1136b = (C1136b) it;
            if (!c1136b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1136b.next()).toString());
            if (c1136b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
