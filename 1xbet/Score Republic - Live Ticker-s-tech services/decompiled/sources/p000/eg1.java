package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eg1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f2088a;

    public eg1(Unsafe unsafe) {
        this.f2088a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m1416a(Class cls) {
        return this.f2088a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m1417b(Class cls) {
        return this.f2088a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo205c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract double mo206d(Object obj, long j);

    /* JADX INFO: renamed from: e */
    public abstract float mo207e(Object obj, long j);

    /* JADX INFO: renamed from: f */
    public final int m1418f(Object obj, long j) {
        return this.f2088a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public final long m1419g(Object obj, long j) {
        return this.f2088a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final Object m1420h(Object obj, long j) {
        return this.f2088a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final long m1421i(Field field) {
        return this.f2088a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo208j(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: k */
    public abstract void mo209k(Object obj, long j, byte b);

    /* JADX INFO: renamed from: l */
    public abstract void mo210l(Object obj, long j, double d);

    /* JADX INFO: renamed from: m */
    public abstract void mo211m(Object obj, long j, float f);

    /* JADX INFO: renamed from: n */
    public final void m1422n(Object obj, long j, int i) {
        this.f2088a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public final void m1423o(Object obj, long j, long j2) {
        this.f2088a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public final void m1424p(long j, Object obj, Object obj2) {
        this.f2088a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo931q() {
        Unsafe unsafe = this.f2088a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            gg1.m2036a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo212r();
}
