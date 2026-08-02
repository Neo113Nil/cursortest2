package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class J2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0737a0 f9674a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9675b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9676c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9677d;

    /* renamed from: e, reason: collision with root package name */
    public int f9678e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public long f9679g;

    /* renamed from: h, reason: collision with root package name */
    public long f9680h;

    public J2(InterfaceC0737a0 interfaceC0737a0) {
        this.f9674a = interfaceC0737a0;
    }

    public final void a(byte[] bArr, int i, int i5) {
        if (this.f9676c) {
            int i6 = this.f;
            int i7 = (i + 1) - i6;
            if (i7 >= i5) {
                this.f = (i5 - i) + i6;
            } else {
                this.f9677d = ((bArr[i7] & 192) >> 6) == 0;
                this.f9676c = false;
            }
        }
    }

    public final void b(int i, long j5, boolean z3) {
        AbstractC1668us.a0(this.f9680h != -9223372036854775807L);
        if (this.f9678e == 182 && z3 && this.f9675b) {
            long j6 = j5 - this.f9679g;
            this.f9674a.d(this.f9680h, this.f9677d ? 1 : 0, (int) j6, i, null);
        }
        if (this.f9678e != 179) {
            this.f9679g = j5;
        }
    }
}
