package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong[] f2692a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f2693b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f2694c;

    static {
        int length = com.yandex.varioqub.config.impl.k.a(3).length;
        java.util.concurrent.atomic.AtomicLong[] atomicLongArr = new java.util.concurrent.atomic.AtomicLong[length];
        for (int i2 = 0; i2 < length; i2++) {
            atomicLongArr[i2] = new java.util.concurrent.atomic.AtomicLong();
        }
        f2692a = atomicLongArr;
        f2693b = new java.util.LinkedHashMap();
        f2694c = new java.lang.Object();
    }

    public static void a(int i2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.atomic.AtomicLong[] atomicLongArr = f2692a;
        if (i2 == 0) {
            throw null;
        }
        long andSet = atomicLongArr[i2 - 1].getAndSet(0L);
        if (andSet > 0) {
            long j2 = currentTimeMillis - andSet;
            java.lang.String str = "Finish tracking metric " + com.yandex.varioqub.config.impl.j.a(i2) + " with elapsed time - " + j2;
            if (com.yandex.varioqub.config.impl.C.f2658a) {
                android.util.Log.d("Varioqub/PerformanceMeter", str);
            }
            synchronized (f2694c) {
                f2693b.put(com.yandex.varioqub.config.impl.j.a(i2), java.lang.Long.valueOf(j2));
            }
        }
    }

    public static void b(int i2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.atomic.AtomicLong[] atomicLongArr = f2692a;
        if (i2 == 0) {
            throw null;
        }
        atomicLongArr[i2 - 1].set(currentTimeMillis);
        java.lang.String concat = "Start tracking metric - ".concat(com.yandex.varioqub.config.impl.j.a(i2));
        if (com.yandex.varioqub.config.impl.C.f2658a) {
            android.util.Log.d("Varioqub/PerformanceMeter", concat);
        }
    }
}
