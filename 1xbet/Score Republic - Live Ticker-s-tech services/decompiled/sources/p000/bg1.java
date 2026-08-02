package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bg1 extends dg1 {
    @Override // p000.dg1
    /* JADX INFO: renamed from: c */
    public final boolean mo650c(Object obj, long j) {
        return this.f1644a.getBoolean(obj, j);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: d */
    public final byte mo651d(Object obj, long j) {
        return this.f1644a.getByte(obj, j);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: e */
    public final double mo652e(Object obj, long j) {
        return this.f1644a.getDouble(obj, j);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: f */
    public final float mo653f(Object obj, long j) {
        return this.f1644a.getFloat(obj, j);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: k */
    public final void mo654k(Object obj, long j, boolean z) {
        this.f1644a.putBoolean(obj, j, z);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: l */
    public final void mo655l(Object obj, long j, byte b) {
        this.f1644a.putByte(obj, j, b);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: m */
    public final void mo656m(Object obj, long j, double d) {
        this.f1644a.putDouble(obj, j, d);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: n */
    public final void mo657n(Object obj, long j, float f) {
        this.f1644a.putFloat(obj, j, f);
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: r */
    public final boolean mo658r() {
        if (!super.mo658r()) {
            return false;
        }
        try {
            Class<?> cls = this.f1644a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            fg1.m1775a(th);
            return false;
        }
    }

    @Override // p000.dg1
    /* JADX INFO: renamed from: s */
    public final boolean mo659s() {
        Unsafe unsafe = this.f1644a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (fg1.m1779e() != null) {
                    try {
                        Class<?> cls3 = this.f1644a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        fg1.m1775a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                fg1.m1775a(th2);
            }
        }
        return false;
    }
}
