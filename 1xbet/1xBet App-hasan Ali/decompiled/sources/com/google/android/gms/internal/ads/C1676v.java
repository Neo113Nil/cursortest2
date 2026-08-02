package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1676v implements U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1766x f15940a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15941b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15942c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15943d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15944e;
    public final long f;

    public C1676v(InterfaceC1766x interfaceC1766x, long j5, long j6, long j7, long j8, long j9) {
        this.f15940a = interfaceC1766x;
        this.f15941b = j5;
        this.f15942c = j6;
        this.f15943d = j7;
        this.f15944e = j8;
        this.f = j9;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f15941b;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        V v4 = new V(j5, C1721w.a(this.f15940a.i(j5), 0L, this.f15942c, this.f15943d, this.f15944e, this.f));
        return new T(v4, v4);
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return true;
    }
}
