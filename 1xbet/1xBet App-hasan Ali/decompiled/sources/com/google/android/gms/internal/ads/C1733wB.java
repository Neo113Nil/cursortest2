package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.wB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1733wB extends AbstractC1823yB {

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f16097m;

    public C1733wB(byte[] bArr) {
        bArr.getClass();
        this.f16097m = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public byte d(int i) {
        return this.f16097m[i];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public byte e(int i) {
        return this.f16097m[i];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1823yB) && g() == ((AbstractC1823yB) obj).g()) {
            if (g() == 0) {
                return true;
            }
            if (!(obj instanceof C1733wB)) {
                return obj.equals(this);
            }
            C1733wB c1733wB = (C1733wB) obj;
            int i = this.f16415k;
            int i5 = c1733wB.f16415k;
            if (i == 0 || i5 == 0 || i == i5) {
                return u(c1733wB, 0, g());
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public int g() {
        return this.f16097m.length;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public void h(int i, int i5, int i6, byte[] bArr) {
        System.arraycopy(this.f16097m, i, bArr, i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final int k(int i, int i5, int i6) {
        int t5 = t() + i5;
        Charset charset = VB.f11871a;
        for (int i7 = t5; i7 < t5 + i6; i7++) {
            i = (i * 31) + this.f16097m[i7];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final AbstractC1823yB l(int i, int i5) {
        int o5 = AbstractC1823yB.o(i, i5, g());
        if (o5 == 0) {
            return AbstractC1823yB.f16414l;
        }
        return new C1688vB(this.f16097m, t() + i, o5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final AbstractC1674uy m() {
        return AbstractC1674uy.j(this.f16097m, t(), g());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final void n(EB eb) {
        eb.o(this.f16097m, t(), g());
    }

    public int t() {
        return 0;
    }

    public final boolean u(C1733wB c1733wB, int i, int i5) {
        if (i5 > c1733wB.g()) {
            throw new IllegalArgumentException("Length too large: " + i5 + g());
        }
        if (i + i5 > c1733wB.g()) {
            int g5 = c1733wB.g();
            StringBuilder w5 = AbstractC2107A.w("Ran off end of other: ", i, ", ", i5, ", ");
            w5.append(g5);
            throw new IllegalArgumentException(w5.toString());
        }
        int t5 = t() + i5;
        int t6 = t();
        int t7 = c1733wB.t() + i;
        while (t6 < t5) {
            if (this.f16097m[t6] != c1733wB.f16097m[t7]) {
                return false;
            }
            t6++;
            t7++;
        }
        return true;
    }
}
