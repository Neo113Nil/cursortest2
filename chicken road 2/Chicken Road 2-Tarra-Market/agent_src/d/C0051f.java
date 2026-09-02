package d;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: d.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0051f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C0048c f884a;

    /* renamed from: b, reason: collision with root package name */
    public C0048c f885b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f886c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f887d = 0;

    public C0048c a(Object obj) {
        C0048c c0048c = this.f884a;
        while (c0048c != null && !c0048c.f877a.equals(obj)) {
            c0048c = c0048c.f879c;
        }
        return c0048c;
    }

    public Object b(Object obj) {
        C0048c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f887d--;
        WeakHashMap weakHashMap = this.f886c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0050e) it.next()).a(a2);
            }
        }
        C0048c c0048c = a2.f880d;
        if (c0048c != null) {
            c0048c.f879c = a2.f879c;
        } else {
            this.f884a = a2.f879c;
        }
        C0048c c0048c2 = a2.f879c;
        if (c0048c2 != null) {
            c0048c2.f880d = c0048c;
        } else {
            this.f885b = c0048c;
        }
        a2.f879c = null;
        a2.f880d = null;
        return a2.f878b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((d.C0047b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0051f)) {
            return false;
        }
        C0051f c0051f = (C0051f) obj;
        if (this.f887d != c0051f.f887d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0051f.iterator();
        while (true) {
            C0047b c0047b = (C0047b) it;
            if (!c0047b.hasNext()) {
                break;
            }
            C0047b c0047b2 = (C0047b) it2;
            if (!c0047b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0047b.next();
            Object next = c0047b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C0047b c0047b = (C0047b) it;
            if (!c0047b.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) c0047b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0047b c0047b = new C0047b(this.f884a, this.f885b, 0);
        this.f886c.put(c0047b, Boolean.FALSE);
        return c0047b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0047b c0047b = (C0047b) it;
            if (!c0047b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0047b.next()).toString());
            if (c0047b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
