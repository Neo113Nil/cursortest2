package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class i implements com.bumptech.glide.load.engine.bitmap_recycle.b {
    public final g<a, Object> a = new g<>();
    public final b b = new b();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public static final class a implements k {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
        public final void a() {
            this.a.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    public static final class b extends c<a> {
        public final k b() {
            return new a(this);
        }
    }

    public i(int i) {
        this.e = i;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public final synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20 || i == 15) {
                f(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public final synchronized void b() {
        f(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public final synchronized Object c(Class cls, int i) {
        a aVar;
        int i2;
        try {
            Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && ceilingKey.intValue() > i * 8)) {
                b bVar = this.b;
                k kVar = (k) bVar.a.poll();
                if (kVar == null) {
                    kVar = bVar.b();
                }
                aVar = (a) kVar;
                aVar.b = i;
                aVar.c = cls;
            }
            b bVar2 = this.b;
            int intValue = ceilingKey.intValue();
            k kVar2 = (k) bVar2.a.poll();
            if (kVar2 == null) {
                kVar2 = bVar2.b();
            }
            aVar = (a) kVar2;
            aVar.b = intValue;
            aVar.c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return h(aVar, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public final synchronized Object d() {
        a aVar;
        b bVar = this.b;
        k kVar = (k) bVar.a.poll();
        if (kVar == null) {
            kVar = bVar.b();
        }
        aVar = (a) kVar;
        aVar.b = 8;
        aVar.c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(Class cls, int i) {
        NavigableMap<Integer, Integer> i2 = i(cls);
        Integer num = i2.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                i2.remove(Integer.valueOf(i));
                return;
            } else {
                i2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void f(int i) {
        while (this.f > i) {
            Object c = this.a.c();
            com.bumptech.glide.util.l.b(c);
            com.bumptech.glide.load.engine.bitmap_recycle.a g = g(c.getClass());
            this.f -= g.a() * g.b(c);
            e(c.getClass(), g.b(c));
            if (Log.isLoggable(g.getTag(), 2)) {
                g.b(c);
            }
        }
    }

    public final <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> g(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> fVar;
        HashMap hashMap = this.d;
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) hashMap.get(cls);
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

    public final <T> T h(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> g = g(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f -= g.a() * g.b(t);
            e(cls, g.b(t));
        }
        if (t != null) {
            return t;
        }
        Log.isLoggable(g.getTag(), 2);
        return g.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> g = g(cls);
        int b2 = g.b(t);
        int a2 = g.a() * b2;
        if (a2 <= this.e / 2) {
            b bVar = this.b;
            k kVar = (k) bVar.a.poll();
            if (kVar == null) {
                kVar = bVar.b();
            }
            a aVar = (a) kVar;
            aVar.b = b2;
            aVar.c = cls;
            this.a.b(aVar, t);
            NavigableMap<Integer, Integer> i = i(cls);
            Integer num = i.get(Integer.valueOf(aVar.b));
            Integer valueOf = Integer.valueOf(aVar.b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            i.put(valueOf, Integer.valueOf(i2));
            this.f += a2;
            f(this.e);
        }
    }
}
