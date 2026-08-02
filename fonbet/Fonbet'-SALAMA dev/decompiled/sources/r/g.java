package r;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class g {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<Object, Object> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public g(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i7;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    public Object create(Object obj) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final Object get(Object obj) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.map.get(obj);
                if (obj2 != null) {
                    this.hitCount++;
                    return obj2;
                }
                this.missCount++;
                Object create = create(obj);
                if (create == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.createCount++;
                        put = this.map.put(obj, create);
                        if (put != null) {
                            this.map.put(obj, put);
                        } else {
                            this.size += a(obj, create);
                        }
                    } finally {
                    }
                }
                if (put != null) {
                    entryRemoved(false, obj, create, put);
                    return put;
                }
                trimToSize(this.maxSize);
                return create;
            } finally {
            }
        }
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.putCount++;
                this.size += a(obj, obj2);
                put = this.map.put(obj, obj2);
                if (put != null) {
                    this.size -= a(obj, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, obj, put, obj2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final Object remove(Object obj) {
        Object remove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                remove = this.map.remove(obj);
                if (remove != null) {
                    this.size -= a(obj, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, obj, remove, null);
        }
        return remove;
    }

    public void resize(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i7;
        }
        trimToSize(i7);
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized Map<Object, Object> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i7;
        try {
            int i8 = this.hitCount;
            int i9 = this.missCount + i8;
            i7 = i9 != 0 ? (i8 * 100) / i9 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i7 + "%]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i7) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i7 || this.map.isEmpty()) {
                        break;
                    }
                    Map.Entry<Object, Object> next = this.map.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.map.remove(key);
                    this.size -= a(key, value);
                    this.evictionCount++;
                } finally {
                }
            }
            entryRemoved(true, key, value, null);
        }
    }

    public void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
    }
}
