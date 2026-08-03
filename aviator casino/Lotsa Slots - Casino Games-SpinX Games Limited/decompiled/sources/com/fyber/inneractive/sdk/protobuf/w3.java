package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final sun.misc.Unsafe f4226a;

    public w3(sun.misc.Unsafe unsafe) {
        this.f4226a = unsafe;
    }

    public abstract byte a(long j);

    public abstract void a(long j, byte[] bArr, long j2);

    public abstract void a(java.lang.Object obj, long j, byte b);

    public abstract void a(java.lang.Object obj, long j, double d);

    public abstract void a(java.lang.Object obj, long j, float f);

    public abstract void a(java.lang.Object obj, long j, boolean z);

    public boolean a() {
        sun.misc.Unsafe unsafe = this.f4226a;
        if (unsafe == null) {
            return false;
        }
        try {
            java.lang.Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", java.lang.Class.class);
            cls.getMethod("arrayIndexScale", java.lang.Class.class);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            cls.getMethod("getInt", java.lang.Object.class, cls2);
            cls.getMethod("putInt", java.lang.Object.class, cls2, java.lang.Integer.TYPE);
            cls.getMethod("getLong", java.lang.Object.class, cls2);
            cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
            cls.getMethod("getObject", java.lang.Object.class, cls2);
            cls.getMethod("putObject", java.lang.Object.class, cls2, java.lang.Object.class);
            return true;
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.protobuf.x3.a(th);
            return false;
        }
    }

    public abstract boolean a(java.lang.Object obj, long j);

    public abstract byte b(java.lang.Object obj, long j);

    public abstract boolean b();

    public abstract double c(java.lang.Object obj, long j);

    public abstract float d(java.lang.Object obj, long j);
}
