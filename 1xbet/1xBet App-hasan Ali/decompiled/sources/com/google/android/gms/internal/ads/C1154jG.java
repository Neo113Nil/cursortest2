package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154jG implements InterfaceC1402ov {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1402ov f14092k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14093l;

    /* renamed from: m, reason: collision with root package name */
    public final EG f14094m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f14095n;

    /* renamed from: o, reason: collision with root package name */
    public int f14096o;

    public C1154jG(InterfaceC1402ov interfaceC1402ov, int i, EG eg) {
        AbstractC1668us.S(i > 0);
        this.f14092k = interfaceC1402ov;
        this.f14093l = i;
        this.f14094m = eg;
        this.f14095n = new byte[1];
        this.f14096o = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Map b() {
        return this.f14092k.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void d(RB rb) {
        rb.getClass();
        this.f14092k.d(rb);
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        int i6 = this.f14096o;
        InterfaceC1402ov interfaceC1402ov = this.f14092k;
        if (i6 == 0) {
            byte[] bArr2 = this.f14095n;
            int i7 = 0;
            if (interfaceC1402ov.e(bArr2, 0, 1) != -1) {
                int i8 = (bArr2[0] & 255) << 4;
                if (i8 != 0) {
                    byte[] bArr3 = new byte[i8];
                    int i9 = i8;
                    while (i9 > 0) {
                        int e3 = interfaceC1402ov.e(bArr3, i7, i9);
                        if (e3 != -1) {
                            i7 += e3;
                            i9 -= e3;
                        }
                    }
                    while (i8 > 0) {
                        int i10 = i8 - 1;
                        if (bArr3[i10] != 0) {
                            break;
                        }
                        i8 = i10;
                    }
                    if (i8 > 0) {
                        C1617tm c1617tm = new C1617tm(i8, bArr3);
                        EG eg = this.f14094m;
                        long max = !eg.f8503l ? eg.i : Math.max(eg.f8504m.p(true), eg.i);
                        int o5 = c1617tm.o();
                        InterfaceC0737a0 interfaceC0737a0 = eg.f8502k;
                        interfaceC0737a0.getClass();
                        interfaceC0737a0.c(o5, c1617tm);
                        interfaceC0737a0.d(max, 1, o5, 0, null);
                        eg.f8503l = true;
                    }
                }
                i6 = this.f14093l;
                this.f14096o = i6;
            }
            return -1;
        }
        int e5 = interfaceC1402ov.e(bArr, i, Math.min(i6, i5));
        if (e5 != -1) {
            this.f14096o -= e5;
        }
        return e5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f14092k.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        throw new UnsupportedOperationException();
    }
}
