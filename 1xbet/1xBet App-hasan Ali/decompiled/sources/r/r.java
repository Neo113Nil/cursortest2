package r;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.C2023c;
import l3.C2054a;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f19036a;

    /* renamed from: b, reason: collision with root package name */
    public final C2023c f19037b;

    /* renamed from: c, reason: collision with root package name */
    public final C2054a f19038c;

    /* renamed from: d, reason: collision with root package name */
    public int f19039d;

    /* renamed from: e, reason: collision with root package name */
    public int f19040e;
    public int f;

    public r(int i) {
        this.f19036a = i;
        if (i <= 0) {
            AbstractC2351a.c("maxSize <= 0");
            throw null;
        }
        this.f19037b = new C2023c(8);
        this.f19038c = new C2054a(5);
    }

    public void a(Object obj, Object obj2, Object obj3) {
        kotlin.jvm.internal.l.f("key", obj);
        kotlin.jvm.internal.l.f("oldValue", obj2);
    }

    public final Object b(Object obj) {
        kotlin.jvm.internal.l.f("key", obj);
        synchronized (this.f19038c) {
            C2023c c2023c = this.f19037b;
            c2023c.getClass();
            Object obj2 = ((LinkedHashMap) c2023c.f17544l).get(obj);
            if (obj2 != null) {
                this.f19040e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object put;
        kotlin.jvm.internal.l.f("key", obj);
        synchronized (this.f19038c) {
            this.f19039d += e(obj, obj2);
            C2023c c2023c = this.f19037b;
            c2023c.getClass();
            put = ((LinkedHashMap) c2023c.f17544l).put(obj, obj2);
            if (put != null) {
                this.f19039d -= e(obj, put);
            }
        }
        if (put != null) {
            a(obj, put, obj2);
        }
        g(this.f19036a);
        return put;
    }

    public final Object d(Object obj) {
        Object remove;
        synchronized (this.f19038c) {
            C2023c c2023c = this.f19037b;
            c2023c.getClass();
            remove = ((LinkedHashMap) c2023c.f17544l).remove(obj);
            if (remove != null) {
                this.f19039d -= e(obj, remove);
            }
        }
        if (remove != null) {
            a(obj, remove, null);
        }
        return remove;
    }

    public final int e(Object obj, Object obj2) {
        int f = f(obj, obj2);
        if (f >= 0) {
            return f;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        kotlin.jvm.internal.l.f("message", str);
        throw new IllegalStateException(str);
    }

    public int f(Object obj, Object obj2) {
        kotlin.jvm.internal.l.f("key", obj);
        kotlin.jvm.internal.l.f("value", obj2);
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0014, B:13:0x0021, B:15:0x0025, B:17:0x0032, B:19:0x0048, B:22:0x0066, B:24:0x006c, B:31:0x0052, B:32:0x0057, B:35:0x0062, B:42:0x0096, B:43:0x009d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0019, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0014, B:13:0x0021, B:15:0x0025, B:17:0x0032, B:19:0x0048, B:22:0x0066, B:24:0x006c, B:31:0x0052, B:32:0x0057, B:35:0x0062, B:42:0x0096, B:43:0x009d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i) {
        boolean z3;
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.f19038c) {
                try {
                    if (this.f19039d < 0 || (((LinkedHashMap) this.f19037b.f17544l).isEmpty() && this.f19039d != 0)) {
                        z3 = false;
                        if (!z3) {
                            if (this.f19039d <= i || ((LinkedHashMap) this.f19037b.f17544l).isEmpty()) {
                                break;
                            }
                            Set entrySet = ((LinkedHashMap) this.f19037b.f17544l).entrySet();
                            kotlin.jvm.internal.l.e("<get-entries>(...)", entrySet);
                            Set set = entrySet;
                            if (set instanceof List) {
                                List list = (List) set;
                                if (!list.isEmpty()) {
                                    next = list.get(0);
                                    entry = (Map.Entry) next;
                                    if (entry != null) {
                                        return;
                                    }
                                    key = entry.getKey();
                                    value = entry.getValue();
                                    C2023c c2023c = this.f19037b;
                                    c2023c.getClass();
                                    kotlin.jvm.internal.l.f("key", key);
                                    ((LinkedHashMap) c2023c.f17544l).remove(key);
                                    this.f19039d -= e(key, value);
                                }
                                next = null;
                                entry = (Map.Entry) next;
                                if (entry != null) {
                                }
                            } else {
                                Iterator it = set.iterator();
                                if (it.hasNext()) {
                                    next = it.next();
                                    entry = (Map.Entry) next;
                                    if (entry != null) {
                                    }
                                } else {
                                    next = null;
                                    entry = (Map.Entry) next;
                                    if (entry != null) {
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                        }
                    }
                    z3 = true;
                    if (!z3) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f19038c) {
            try {
                int i = this.f19040e;
                int i5 = this.f + i;
                str = "LruCache[maxSize=" + this.f19036a + ",hits=" + this.f19040e + ",misses=" + this.f + ",hitRate=" + (i5 != 0 ? (i * 100) / i5 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
