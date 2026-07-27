package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class L1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f2652a;

    public L1(Unsafe unsafe) {
        this.f2652a = unsafe;
    }

    public abstract double a(long j3, Object obj);

    public abstract float b(long j3, Object obj);

    public abstract void c(Object obj, long j3, boolean z3);

    public abstract void d(Object obj, long j3, byte b3);

    public abstract void e(Object obj, long j3, double d3);

    public abstract void f(Object obj, long j3, float f);

    public abstract boolean g(long j3, Object obj);
}
