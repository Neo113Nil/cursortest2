package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Ln implements Li {

    /* renamed from: a, reason: collision with root package name */
    public final int f6253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6254b;

    /* renamed from: c, reason: collision with root package name */
    public int f6255c = 0;

    public Ln(int i3, int i4) {
        this.f6253a = i3;
        this.f6254b = i4;
    }

    public final int a() {
        return this.f6254b;
    }

    public final boolean b() {
        int i3 = this.f6255c;
        this.f6255c = i3 + 1;
        return i3 < this.f6253a;
    }

    public final void c() {
        this.f6255c = 0;
    }
}
