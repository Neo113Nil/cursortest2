package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829c3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12964c;

    /* renamed from: d, reason: collision with root package name */
    public int f12965d;

    /* renamed from: e, reason: collision with root package name */
    public String f12966e;

    public C0829c3(int i, int i5, int i6) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f12962a = str;
        this.f12963b = i5;
        this.f12964c = i6;
        this.f12965d = Integer.MIN_VALUE;
        this.f12966e = "";
    }

    public final void a() {
        int i = this.f12965d;
        int i5 = i == Integer.MIN_VALUE ? this.f12963b : i + this.f12964c;
        this.f12965d = i5;
        this.f12966e = this.f12962a + i5;
    }

    public final void b() {
        if (this.f12965d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
