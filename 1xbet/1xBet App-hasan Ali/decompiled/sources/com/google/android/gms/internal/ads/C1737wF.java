package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737wF extends AbstractC1835yf {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f16100j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16101k;

    /* renamed from: l, reason: collision with root package name */
    public int f16102l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f16103m;

    /* renamed from: n, reason: collision with root package name */
    public int f16104n;

    /* renamed from: o, reason: collision with root package name */
    public long f16105o;

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f16102l);
        this.f16105o += min / this.f16441b.f11558d;
        this.f16102l -= min;
        byteBuffer.position(position + min);
        if (this.f16102l <= 0) {
            int i5 = i - min;
            int length = (this.f16104n + i5) - this.f16103m.length;
            ByteBuffer h3 = h(length);
            int max = Math.max(0, Math.min(length, this.f16104n));
            h3.put(this.f16103m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i5));
            byteBuffer.limit(byteBuffer.position() + max2);
            h3.put(byteBuffer);
            byteBuffer.limit(limit);
            int i6 = i5 - max2;
            int i7 = this.f16104n - max;
            this.f16104n = i7;
            byte[] bArr = this.f16103m;
            System.arraycopy(bArr, max, bArr, 0, i7);
            byteBuffer.get(this.f16103m, this.f16104n, i6);
            this.f16104n += i6;
            h3.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf, com.google.android.gms.internal.ads.InterfaceC1431pf
    public final ByteBuffer d() {
        int i;
        if (super.g() && (i = this.f16104n) > 0) {
            h(i).put(this.f16103m, 0, this.f16104n).flip();
            this.f16104n = 0;
        }
        return super.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final C0684Se e(C0684Se c0684Se) {
        if (c0684Se.f11557c != 2) {
            throw new C0938ef(c0684Se);
        }
        this.f16101k = true;
        return (this.i == 0 && this.f16100j == 0) ? C0684Se.f11554e : c0684Se;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf, com.google.android.gms.internal.ads.InterfaceC1431pf
    public final boolean g() {
        return super.g() && this.f16104n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void k() {
        if (this.f16101k) {
            this.f16101k = false;
            int i = this.f16100j;
            int i5 = this.f16441b.f11558d;
            this.f16103m = new byte[i * i5];
            this.f16102l = this.i * i5;
        }
        this.f16104n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void l() {
        if (this.f16101k) {
            if (this.f16104n > 0) {
                this.f16105o += r0 / this.f16441b.f11558d;
            }
            this.f16104n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void m() {
        this.f16103m = AbstractC1260lo.f;
    }
}
