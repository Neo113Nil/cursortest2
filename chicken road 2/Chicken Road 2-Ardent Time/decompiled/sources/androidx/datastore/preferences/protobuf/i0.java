package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final sun.misc.Unsafe f2321a;

    public i0(sun.misc.Unsafe unsafe) {
        this.f2321a = unsafe;
    }

    public final int a(java.lang.Class cls) {
        return this.f2321a.arrayBaseOffset(cls);
    }

    public final int b(java.lang.Class cls) {
        return this.f2321a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j2, java.lang.Object obj);

    public abstract double d(long j2, java.lang.Object obj);

    public abstract float e(long j2, java.lang.Object obj);

    public final int f(long j2, java.lang.Object obj) {
        return this.f2321a.getInt(obj, j2);
    }

    public final long g(long j2, java.lang.Object obj) {
        return this.f2321a.getLong(obj, j2);
    }

    public final java.lang.Object h(long j2, java.lang.Object obj) {
        return this.f2321a.getObject(obj, j2);
    }

    public final long i(java.lang.reflect.Field field) {
        return this.f2321a.objectFieldOffset(field);
    }

    public abstract void j(java.lang.Object obj, long j2, boolean z2);

    public abstract void k(java.lang.Object obj, long j2, byte b2);

    public abstract void l(java.lang.Object obj, long j2, double d2);

    public abstract void m(java.lang.Object obj, long j2, float f2);

    public final void n(java.lang.Object obj, long j2, int i2) {
        this.f2321a.putInt(obj, j2, i2);
    }

    public final void o(java.lang.Object obj, long j2, long j3) {
        this.f2321a.putLong(obj, j2, j3);
    }

    public final void p(java.lang.Object obj, long j2, java.lang.Object obj2) {
        this.f2321a.putObject(obj, j2, obj2);
    }

    public boolean q() {
        sun.misc.Unsafe unsafe = this.f2321a;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            java.lang.Class cls2 = java.lang.Long.TYPE;
            cls.getMethod("getInt", java.lang.Object.class, cls2);
            cls.getMethod("putInt", java.lang.Object.class, cls2, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, cls2);
            cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
            cls.getMethod("getObject", java.lang.Object.class, cls2);
            cls.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
            return true;
        } catch (java.lang.Throwable th) {
            androidx.datastore.preferences.protobuf.j0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
