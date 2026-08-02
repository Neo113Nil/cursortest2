package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dg1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f1644a;

    public dg1(Unsafe unsafe) {
        this.f1644a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m1203a(Class cls) {
        return this.f1644a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m1204b(Class cls) {
        return this.f1644a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo650c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract byte mo651d(Object obj, long j);

    /* JADX INFO: renamed from: e */
    public abstract double mo652e(Object obj, long j);

    /* JADX INFO: renamed from: f */
    public abstract float mo653f(Object obj, long j);

    /* JADX INFO: renamed from: g */
    public final int m1205g(Object obj, long j) {
        return this.f1644a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m1206h(Object obj, long j) {
        return this.f1644a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final Object m1207i(Object obj, long j) {
        return this.f1644a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m1208j(Field field) {
        return this.f1644a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo654k(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo655l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo656m(Object obj, long j, double d);

    /* JADX INFO: renamed from: n */
    public abstract void mo657n(Object obj, long j, float f);

    /* JADX INFO: renamed from: o */
    public final void m1209o(Object obj, long j, int i) {
        this.f1644a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m1210p(Object obj, long j, long j2) {
        this.f1644a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m1211q(long j, Object obj, Object obj2) {
        this.f1644a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo658r() {
        Unsafe unsafe = this.f1644a;
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
            fg1.m1775a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo659s();
}
