package com.vungle.ads.internal.downloader;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f11899a;
    public int b;
    public long c;
    public long d;
    public long e;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.f11899a;
    }

    public final void c(long j) {
        this.c = j;
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("Progress(status=").append(this.f11899a).append(", percent=").append(this.b).append(", startAt=").append(this.c).append(", readed=").append(this.d).append(", total=").append(this.e).append(')').toString();
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(int i) {
        this.f11899a = i;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.e = j;
    }
}
