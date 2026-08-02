package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782b0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12742a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f12743b;

    /* renamed from: c, reason: collision with root package name */
    public int f12744c;

    /* renamed from: d, reason: collision with root package name */
    public long f12745d;

    /* renamed from: e, reason: collision with root package name */
    public int f12746e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f12747g;

    public final void a(InterfaceC0737a0 interfaceC0737a0, Z z3) {
        if (this.f12744c > 0) {
            interfaceC0737a0.d(this.f12745d, this.f12746e, this.f, this.f12747g, z3);
            this.f12744c = 0;
        }
    }

    public final void b(InterfaceC0737a0 interfaceC0737a0, long j5, int i, int i5, int i6, Z z3) {
        if (!(this.f12747g <= i5 + i6)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f12743b) {
            int i7 = this.f12744c;
            int i8 = i7 + 1;
            this.f12744c = i8;
            if (i7 == 0) {
                this.f12745d = j5;
                this.f12746e = i;
                this.f = 0;
            }
            this.f += i5;
            this.f12747g = i6;
            if (i8 >= 16) {
                a(interfaceC0737a0, z3);
            }
        }
    }

    public final void c(G g5) {
        if (this.f12743b) {
            return;
        }
        byte[] bArr = this.f12742a;
        g5.E(bArr, 0, 10);
        g5.h();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f12743b = true;
        }
    }
}
