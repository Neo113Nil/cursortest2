package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cg1 extends eg1 {
    @Override // p000.eg1
    /* JADX INFO: renamed from: c */
    public final boolean mo205c(Object obj, long j) {
        return this.f2088a.getBoolean(obj, j);
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: d */
    public final double mo206d(Object obj, long j) {
        return this.f2088a.getDouble(obj, j);
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: e */
    public final float mo207e(Object obj, long j) {
        return this.f2088a.getFloat(obj, j);
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: j */
    public final void mo208j(Object obj, long j, boolean z) {
        this.f2088a.putBoolean(obj, j, z);
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: k */
    public final void mo209k(Object obj, long j, byte b) {
        this.f2088a.putByte(obj, j, b);
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: l */
    public final void mo210l(Object obj, long j, double d) {
        this.f2088a.putDouble(obj, j, d);
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: m */
    public final void mo211m(Object obj, long j, float f) {
        this.f2088a.putFloat(obj, j, f);
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: q */
    public final boolean mo931q() {
        if (!super.mo931q()) {
            return false;
        }
        try {
            Class<?> cls = this.f2088a.getClass();
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
            gg1.m2036a(th);
            return false;
        }
    }

    @Override // p000.eg1
    /* JADX INFO: renamed from: r */
    public final boolean mo212r() {
        Unsafe unsafe = this.f2088a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (gg1.m2042g() != null) {
                    try {
                        Class<?> cls3 = this.f2088a.getClass();
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
                        gg1.m2036a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                gg1.m2036a(th2);
            }
        }
        return false;
    }
}
