package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends J0 {
    @Override // com.google.protobuf.J0
    public final void c(long j, byte[] bArr, long j3, long j7) {
        this.f12111a.copyMemory((Object) null, j, bArr, K0.f12120f + j3, j7);
    }

    @Override // com.google.protobuf.J0
    public final boolean d(long j, Object obj) {
        return this.f12111a.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.J0
    public final byte e(long j) {
        return this.f12111a.getByte(j);
    }

    @Override // com.google.protobuf.J0
    public final byte f(long j, Object obj) {
        return this.f12111a.getByte(obj, j);
    }

    @Override // com.google.protobuf.J0
    public final double g(long j, Object obj) {
        return this.f12111a.getDouble(obj, j);
    }

    @Override // com.google.protobuf.J0
    public final float h(long j, Object obj) {
        return this.f12111a.getFloat(obj, j);
    }

    @Override // com.google.protobuf.J0
    public final void m(Object obj, long j, boolean z4) {
        this.f12111a.putBoolean(obj, j, z4);
    }

    @Override // com.google.protobuf.J0
    public final void n(Object obj, long j, byte b7) {
        this.f12111a.putByte(obj, j, b7);
    }

    @Override // com.google.protobuf.J0
    public final void o(Object obj, long j, double d7) {
        this.f12111a.putDouble(obj, j, d7);
    }

    @Override // com.google.protobuf.J0
    public final void p(Object obj, long j, float f7) {
        this.f12111a.putFloat(obj, j, f7);
    }

    @Override // com.google.protobuf.J0
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f12111a.getClass();
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
            K0.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.J0
    public final boolean u() {
        Unsafe unsafe = this.f12111a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (K0.e() != null) {
                    try {
                        Class<?> cls3 = this.f12111a.getClass();
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
                        K0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                K0.a(th2);
            }
        }
        return false;
    }
}
