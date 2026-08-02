package W5;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements W5.b {

    /* renamed from: a, reason: collision with root package name */
    private final g<a, Object> f33261a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    private final b f33262b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f33263c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f33264d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f33265e;

    /* renamed from: f, reason: collision with root package name */
    private int f33266f;

    private static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        private final b f33267a;

        /* renamed from: b, reason: collision with root package name */
        int f33268b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f33269c;

        a(b bVar) {
            this.f33267a = bVar;
        }

        @Override // W5.k
        public final void a() {
            this.f33267a.c(this);
        }

        final void b(int i11, Class<?> cls) {
            this.f33268b = i11;
            this.f33269c = cls;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f33268b == aVar.f33268b && this.f33269c == aVar.f33269c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i11 = this.f33268b * 31;
            Class<?> cls = this.f33269c;
            return i11 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f33268b + "array=" + this.f33269c + '}';
        }
    }

    private static final class b extends c<a> {
        @Override // W5.c
        protected final a a() {
            return new a(this);
        }
    }

    public i(int i11) {
        this.f33265e = i11;
    }

    private void e(int i11, Class<?> cls) {
        NavigableMap<Integer, Integer> i12 = i(cls);
        Integer num = i12.get(Integer.valueOf(i11));
        if (num != null) {
            if (num.intValue() == 1) {
                i12.remove(Integer.valueOf(i11));
                return;
            } else {
                i12.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i11 + ", this: " + this);
    }

    private void f(int i11) {
        while (this.f33266f > i11) {
            Object c11 = this.f33261a.c();
            p6.k.b(c11);
            W5.a g10 = g(c11.getClass());
            this.f33266f -= g10.a(c11) * g10.b();
            e(g10.a(c11), c11.getClass());
            if (Log.isLoggable(g10.getTag(), 2)) {
                Log.v(g10.getTag(), "evicted: " + g10.a(c11));
            }
        }
    }

    private <T> W5.a<T> g(Class<T> cls) {
        W5.a<T> fVar;
        HashMap hashMap = this.f33264d;
        W5.a<T> aVar = (W5.a) hashMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            fVar = new f();
        }
        hashMap.put(cls, fVar);
        return fVar;
    }

    private <T> T h(a aVar, Class<T> cls) {
        W5.a<T> g10 = g(cls);
        T t2 = (T) this.f33261a.a(aVar);
        if (t2 != null) {
            this.f33266f -= g10.a(t2) * g10.b();
            e(g10.a(t2), cls);
        }
        if (t2 != null) {
            return t2;
        }
        if (Log.isLoggable(g10.getTag(), 2)) {
            Log.v(g10.getTag(), "Allocated " + aVar.f33268b + " bytes");
        }
        return g10.newArray(aVar.f33268b);
    }

    private NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.f33263c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    @Override // W5.b
    public final synchronized <T> void a(T t2) {
        Class<?> cls = t2.getClass();
        W5.a<T> g10 = g(cls);
        int a11 = g10.a(t2);
        int b11 = g10.b() * a11;
        if (b11 <= this.f33265e / 2) {
            a b12 = this.f33262b.b();
            b12.b(a11, cls);
            this.f33261a.b(b12, t2);
            NavigableMap<Integer, Integer> i11 = i(cls);
            Integer num = i11.get(Integer.valueOf(b12.f33268b));
            Integer valueOf = Integer.valueOf(b12.f33268b);
            int i12 = 1;
            if (num != null) {
                i12 = 1 + num.intValue();
            }
            i11.put(valueOf, Integer.valueOf(i12));
            this.f33266f += b11;
            f(this.f33265e);
        }
    }

    @Override // W5.b
    public final synchronized <T> T b(int i11, Class<T> cls) {
        a aVar;
        int i12;
        try {
            Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i11));
            if (ceilingKey == null || ((i12 = this.f33266f) != 0 && this.f33265e / i12 < 2 && ceilingKey.intValue() > i11 * 8)) {
                a b11 = this.f33262b.b();
                b11.b(i11, cls);
                aVar = b11;
            }
            b bVar = this.f33262b;
            int intValue = ceilingKey.intValue();
            aVar = bVar.b();
            aVar.b(intValue, cls);
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) h(aVar, cls);
    }

    @Override // W5.b
    public final synchronized Object c() {
        a b11;
        b11 = this.f33262b.b();
        b11.b(8, byte[].class);
        return h(b11, byte[].class);
    }

    public final synchronized void d() {
        f(0);
    }

    public final synchronized void j(int i11) {
        try {
            if (i11 >= 40) {
                d();
            } else if (i11 >= 20 || i11 == 15) {
                f(this.f33265e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // W5.b
    @Deprecated
    public final void put(Object obj) {
        a(obj);
    }
}
