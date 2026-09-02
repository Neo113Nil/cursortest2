package j;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0915f implements java.lang.Iterable {

    /* renamed from: a, reason: collision with root package name */
    public j.C0912c f7933a;

    /* renamed from: b, reason: collision with root package name */
    public j.C0912c f7934b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.WeakHashMap f7935c = new java.util.WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f7936d = 0;

    public j.C0912c a(java.lang.Object obj) {
        j.C0912c c0912c = this.f7933a;
        while (c0912c != null && !c0912c.f7926a.equals(obj)) {
            c0912c = c0912c.f7928c;
        }
        return c0912c;
    }

    public java.lang.Object b(java.lang.Object obj) {
        j.C0912c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f7936d--;
        java.util.WeakHashMap weakHashMap = this.f7935c;
        if (!weakHashMap.isEmpty()) {
            java.util.Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((j.AbstractC0914e) it.next()).a(a2);
            }
        }
        j.C0912c c0912c = a2.f7929d;
        if (c0912c != null) {
            c0912c.f7928c = a2.f7928c;
        } else {
            this.f7933a = a2.f7928c;
        }
        j.C0912c c0912c2 = a2.f7928c;
        if (c0912c2 != null) {
            c0912c2.f7929d = c0912c;
        } else {
            this.f7934b = c0912c;
        }
        a2.f7928c = null;
        a2.f7929d = null;
        return a2.f7927b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((j.C0911b) r7).hasNext() != false) goto L28;
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
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j.C0915f)) {
            return false;
        }
        j.C0915f c0915f = (j.C0915f) obj;
        if (this.f7936d != c0915f.f7936d) {
            return false;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = c0915f.iterator();
        while (true) {
            j.C0911b c0911b = (j.C0911b) it;
            if (!c0911b.hasNext()) {
                break;
            }
            j.C0911b c0911b2 = (j.C0911b) it2;
            if (!c0911b2.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) c0911b.next();
            java.lang.Object next = c0911b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        java.util.Iterator it = iterator();
        int i2 = 0;
        while (true) {
            j.C0911b c0911b = (j.C0911b) it;
            if (!c0911b.hasNext()) {
                return i2;
            }
            i2 += ((java.util.Map.Entry) c0911b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        j.C0911b c0911b = new j.C0911b(this.f7933a, this.f7934b, 0);
        this.f7935c.put(c0911b, java.lang.Boolean.FALSE);
        return c0911b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator it = iterator();
        while (true) {
            j.C0911b c0911b = (j.C0911b) it;
            if (!c0911b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((java.util.Map.Entry) c0911b.next()).toString());
            if (c0911b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
