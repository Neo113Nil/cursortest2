package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f11805a;

    public n0(Unsafe unsafe) {
        this.f11805a = unsafe;
    }

    public final int a(Class cls) {
        return this.f11805a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f11805a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract byte d(long j, Object obj);

    public abstract double e(long j, Object obj);

    public abstract float f(long j, Object obj);

    public final int g(long j, Object obj) {
        return this.f11805a.getInt(obj, j);
    }

    public final long h(long j, Object obj) {
        return this.f11805a.getLong(obj, j);
    }

    public final Object i(long j, Object obj) {
        return this.f11805a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.f11805a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z4);

    public abstract void l(Object obj, long j, byte b7);

    public abstract void m(Object obj, long j, double d7);

    public abstract void n(Object obj, long j, float f7);

    public final void o(long j, Object obj, int i7) {
        this.f11805a.putInt(obj, j, i7);
    }

    public final void p(Object obj, long j, long j3) {
        this.f11805a.putLong(obj, j, j3);
    }

    public final void q(Object obj, long j, Object obj2) {
        this.f11805a.putObject(obj, j, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f11805a;
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
            o0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
