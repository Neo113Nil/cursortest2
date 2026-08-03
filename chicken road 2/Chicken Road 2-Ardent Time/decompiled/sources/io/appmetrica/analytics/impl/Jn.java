package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Jn implements io.appmetrica.analytics.impl.Gi {

    /* renamed from: a, reason: collision with root package name */
    public final int f4520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4521b;

    /* renamed from: c, reason: collision with root package name */
    public int f4522c = 0;

    public Jn(int i2, int i3) {
        this.f4520a = i2;
        this.f4521b = i3;
    }

    public final int a() {
        return this.f4521b;
    }

    public final boolean b() {
        int i2 = this.f4522c;
        this.f4522c = i2 + 1;
        return i2 < this.f4520a;
    }

    public final void c() {
        this.f4522c = 0;
    }
}
