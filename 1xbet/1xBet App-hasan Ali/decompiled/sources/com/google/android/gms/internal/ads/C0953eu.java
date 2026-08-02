package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.eu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953eu extends Lt {

    /* renamed from: o, reason: collision with root package name */
    public Uri f13373o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f13374p;

    /* renamed from: q, reason: collision with root package name */
    public int f13375q;

    /* renamed from: r, reason: collision with root package name */
    public int f13376r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13377s;

    /* renamed from: t, reason: collision with root package name */
    public final Ps f13378t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0953eu(byte[] bArr) {
        super(false);
        Ps ps = new Ps(bArr);
        this.f13378t = ps;
        AbstractC1668us.S(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        g(ww);
        this.f13373o = ww.f12125a;
        byte[] bArr = (byte[]) this.f13378t.f11130k;
        this.f13374p = bArr;
        int length = bArr.length;
        long j5 = length;
        long j6 = ww.f12127c;
        if (j6 > j5) {
            throw new C1806xv();
        }
        int i = (int) j6;
        this.f13375q = i;
        int i5 = length - i;
        this.f13376r = i5;
        long j7 = ww.f12128d;
        if (j7 != -1) {
            this.f13376r = (int) Math.min(i5, j7);
        }
        this.f13377s = true;
        k(ww);
        return j7 != -1 ? j7 : this.f13376r;
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f13376r;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i5, i6);
        byte[] bArr2 = this.f13374p;
        AbstractC1668us.F(bArr2);
        System.arraycopy(bArr2, this.f13375q, bArr, i, min);
        this.f13375q += min;
        this.f13376r -= min;
        B(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f13373o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        if (this.f13377s) {
            this.f13377s = false;
            f();
        }
        this.f13373o = null;
        this.f13374p = null;
    }
}
