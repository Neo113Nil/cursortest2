package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f12111a;

    public J0(Unsafe unsafe) {
        this.f12111a = unsafe;
    }

    public final int a(Class cls) {
        return this.f12111a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f12111a.arrayIndexScale(cls);
    }

    public abstract void c(long j, byte[] bArr, long j3, long j7);

    public abstract boolean d(long j, Object obj);

    public abstract byte e(long j);

    public abstract byte f(long j, Object obj);

    public abstract double g(long j, Object obj);

    public abstract float h(long j, Object obj);

    public final int i(long j, Object obj) {
        return this.f12111a.getInt(obj, j);
    }

    public final long j(long j, Object obj) {
        return this.f12111a.getLong(obj, j);
    }

    public final Object k(long j, Object obj) {
        return this.f12111a.getObject(obj, j);
    }

    public final long l(Field field) {
        return this.f12111a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j, boolean z4);

    public abstract void n(Object obj, long j, byte b7);

    public abstract void o(Object obj, long j, double d7);

    public abstract void p(Object obj, long j, float f7);

    public final void q(long j, Object obj, int i7) {
        this.f12111a.putInt(obj, j, i7);
    }

    public final void r(Object obj, long j, long j3) {
        this.f12111a.putLong(obj, j, j3);
    }

    public final void s(Object obj, long j, Object obj2) {
        this.f12111a.putObject(obj, j, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f12111a;
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
            K0.a(th);
            return false;
        }
    }

    public abstract boolean u();
}
