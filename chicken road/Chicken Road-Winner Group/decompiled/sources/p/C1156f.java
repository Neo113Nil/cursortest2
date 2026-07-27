package p;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1156f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10202a;

    /* renamed from: b, reason: collision with root package name */
    public int f10203b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10204c;

    /* renamed from: d, reason: collision with root package name */
    public int f10205d;

    /* renamed from: e, reason: collision with root package name */
    public int f10206e;

    public C1156f(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f10204c = i3;
        this.f10202a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f10202a.get(obj);
                if (obj2 != null) {
                    this.f10205d++;
                    return obj2;
                }
                this.f10206e++;
                return null;
            } catch (Throwable th) {
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
    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f10203b++;
                put = this.f10202a.put(obj, obj2);
                if (put != null) {
                    this.f10203b--;
                }
            } finally {
            }
        }
        int i3 = this.f10204c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f10203b < 0 || (this.f10202a.isEmpty() && this.f10203b != 0)) {
                        break;
                    }
                    if (this.f10203b <= i3 || this.f10202a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f10202a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f10202a.remove(key);
                    this.f10203b--;
                } finally {
                }
            }
        }
        return put;
    }

    public final synchronized String toString() {
        int i3;
        int i4;
        int i5;
        try {
            i3 = this.f10205d;
            i4 = this.f10206e;
            int i6 = i3 + i4;
            i5 = i6 != 0 ? (i3 * 100) / i6 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f10204c + ",hits=" + i3 + ",misses=" + i4 + ",hitRate=" + i5 + "%]";
    }
}
