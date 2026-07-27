package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Ln implements Li {

    /* renamed from: a, reason: collision with root package name */
    public final int f7111a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7112b;

    /* renamed from: c, reason: collision with root package name */
    public int f7113c = 0;

    public Ln(int i2, int i3) {
        this.f7111a = i2;
        this.f7112b = i3;
    }

    public final int a() {
        return this.f7112b;
    }

    public final boolean b() {
        int i2 = this.f7113c;
        this.f7113c = i2 + 1;
        return i2 < this.f7111a;
    }

    public final void c() {
        this.f7113c = 0;
    }
}
