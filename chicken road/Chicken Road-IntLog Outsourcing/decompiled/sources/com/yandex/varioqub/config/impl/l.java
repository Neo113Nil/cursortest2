package com.yandex.varioqub.config.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicLong[] f5426a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f5427b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5428c;

    static {
        int length = k.a(3).length;
        AtomicLong[] atomicLongArr = new AtomicLong[length];
        for (int i2 = 0; i2 < length; i2++) {
            atomicLongArr[i2] = new AtomicLong();
        }
        f5426a = atomicLongArr;
        f5427b = new LinkedHashMap();
        f5428c = new Object();
    }

    public static void a(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        AtomicLong[] atomicLongArr = f5426a;
        if (i2 == 0) {
            throw null;
        }
        long andSet = atomicLongArr[i2 - 1].getAndSet(0L);
        if (andSet > 0) {
            long j2 = currentTimeMillis - andSet;
            String str = "Finish tracking metric " + j.a(i2) + " with elapsed time - " + j2;
            if (C.f5392a) {
                Log.d("Varioqub/PerformanceMeter", str);
            }
            synchronized (f5428c) {
                f5427b.put(j.a(i2), Long.valueOf(j2));
            }
        }
    }

    public static void b(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        AtomicLong[] atomicLongArr = f5426a;
        if (i2 == 0) {
            throw null;
        }
        atomicLongArr[i2 - 1].set(currentTimeMillis);
        String concat = "Start tracking metric - ".concat(j.a(i2));
        if (C.f5392a) {
            Log.d("Varioqub/PerformanceMeter", concat);
        }
    }
}
