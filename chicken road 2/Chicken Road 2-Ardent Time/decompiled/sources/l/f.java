package l;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f7985a;

    /* renamed from: b, reason: collision with root package name */
    public int f7986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7987c;

    /* renamed from: d, reason: collision with root package name */
    public int f7988d;

    /* renamed from: e, reason: collision with root package name */
    public int f7989e;

    public f(int i2) {
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f7987c = i2;
        this.f7985a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public final java.lang.Object a(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                java.lang.Object obj2 = this.f7985a.get(obj);
                if (obj2 != null) {
                    this.f7988d++;
                    return obj2;
                }
                this.f7989e++;
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f7986b++;
                put = this.f7985a.put(obj, obj2);
                if (put != null) {
                    this.f7986b--;
                }
            } finally {
            }
        }
        int i2 = this.f7987c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f7986b < 0 || (this.f7985a.isEmpty() && this.f7986b != 0)) {
                        break;
                    }
                    if (this.f7986b <= i2 || this.f7985a.isEmpty()) {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) this.f7985a.entrySet().iterator().next();
                    java.lang.Object key = entry.getKey();
                    entry.getValue();
                    this.f7985a.remove(key);
                    this.f7986b--;
                } finally {
                }
            }
        }
        return put;
    }

    public final synchronized java.lang.String toString() {
        int i2;
        int i3;
        int i4;
        try {
            i2 = this.f7988d;
            i3 = this.f7989e;
            int i5 = i2 + i3;
            i4 = i5 != 0 ? (i2 * 100) / i5 : 0;
            java.util.Locale locale = java.util.Locale.US;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f7987c + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i4 + "%]";
    }
}
