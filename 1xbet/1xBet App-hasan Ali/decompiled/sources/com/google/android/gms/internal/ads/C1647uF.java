package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.uF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1647uF extends AbstractC1835yf {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15823j;

    /* renamed from: k, reason: collision with root package name */
    public int f15824k;

    /* renamed from: l, reason: collision with root package name */
    public long f15825l;

    /* renamed from: m, reason: collision with root package name */
    public int f15826m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f15827n;

    /* renamed from: o, reason: collision with root package name */
    public int f15828o;

    /* renamed from: p, reason: collision with root package name */
    public int f15829p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f15830q;

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void b(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !this.f16445g.hasRemaining()) {
            if (this.f15824k != 0) {
                AbstractC1668us.a0(this.f15828o < this.f15827n.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > 1024) {
                        int i5 = this.i;
                        limit = (position2 / i5) * i5;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i6 = this.f15828o;
                int i7 = this.f15829p;
                int i8 = i6 + i7;
                int length = this.f15827n.length;
                if (i8 < length) {
                    i = length - i8;
                } else {
                    i8 = i7 - (length - i6);
                    i = i6 - i8;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f15827n, i8, min);
                int i9 = this.f15829p + min;
                this.f15829p = i9;
                AbstractC1668us.a0(i9 <= this.f15827n.length);
                boolean z3 = limit < limit2 && position3 < i;
                o(z3);
                if (z3) {
                    this.f15824k = 0;
                    this.f15826m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f15827n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > 1024) {
                        int i10 = this.i;
                        position = ((limit4 / i10) * i10) + i10;
                        break;
                    }
                    limit4 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f15824k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    h(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final C0684Se e(C0684Se c0684Se) {
        if (c0684Se.f11557c == 2) {
            return c0684Se.f11555a == -1 ? C0684Se.f11554e : c0684Se;
        }
        throw new C0938ef(c0684Se);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf, com.google.android.gms.internal.ads.InterfaceC1431pf
    public final boolean f() {
        return super.f() && this.f15823j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void k() {
        if (f()) {
            int i = this.f16441b.f11556b;
            int i5 = i + i;
            this.i = i5;
            int i6 = ((((int) ((100000 * r0.f11555a) / 1000000)) / 2) / i5) * i5;
            int i7 = i6 + i6;
            if (this.f15827n.length != i7) {
                this.f15827n = new byte[i7];
                this.f15830q = new byte[i7];
            }
        }
        this.f15824k = 0;
        this.f15825l = 0L;
        this.f15826m = 0;
        this.f15828o = 0;
        this.f15829p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void l() {
        if (this.f15829p > 0) {
            o(true);
            this.f15826m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final void m() {
        this.f15823j = false;
        byte[] bArr = AbstractC1260lo.f;
        this.f15827n = bArr;
        this.f15830q = bArr;
    }

    public final int n(int i) {
        int length = ((((int) ((2000000 * this.f16441b.f11555a) / 1000000)) - this.f15826m) * this.i) - (this.f15827n.length >> 1);
        AbstractC1668us.a0(length >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i5 = this.i;
        return (min / i5) * i5;
    }

    public final void o(boolean z3) {
        int i;
        int i5;
        int i6 = this.f15829p;
        int length = this.f15827n.length;
        if (i6 != length) {
            if (!z3) {
                return;
            } else {
                z3 = true;
            }
        }
        if (this.f15826m == 0) {
            if (z3) {
                p(i6, 3);
                i5 = i6;
            } else {
                AbstractC1668us.a0(i6 >= (length >> 1));
                i5 = this.f15827n.length >> 1;
                p(i5, 0);
            }
            i = i5;
        } else {
            int i7 = length >> 1;
            int i8 = i6 - i7;
            if (z3) {
                int n5 = n(i8) + (this.f15827n.length >> 1);
                p(n5, 2);
                int i9 = i7 + i8;
                i = n5;
                i5 = i9;
            } else {
                int n6 = n(i8);
                p(n6, 1);
                i = n6;
                i5 = i8;
            }
        }
        boolean z5 = i5 % this.i == 0;
        String q5 = AbstractC2107A.q("bytesConsumed is not aligned to frame size: %s", i5);
        if (!z5) {
            throw new IllegalStateException(String.valueOf(q5));
        }
        AbstractC1668us.a0(i6 >= i);
        this.f15829p -= i5;
        int i10 = this.f15828o + i5;
        this.f15828o = i10;
        this.f15828o = i10 % this.f15827n.length;
        this.f15826m = (i / this.i) + this.f15826m;
        this.f15825l += (i5 - i) / r2;
    }

    public final void p(int i, int i5) {
        int i6;
        if (i == 0) {
            return;
        }
        AbstractC1668us.S(this.f15829p >= i);
        if (i5 == 2) {
            int i7 = this.f15828o;
            int i8 = this.f15829p;
            int i9 = i7 + i8;
            byte[] bArr = this.f15827n;
            int length = bArr.length;
            if (i9 <= length) {
                System.arraycopy(bArr, i9 - i, this.f15830q, 0, i);
            } else {
                int i10 = i8 - (length - i7);
                if (i10 >= i) {
                    System.arraycopy(bArr, i10 - i, this.f15830q, 0, i);
                } else {
                    int i11 = i - i10;
                    System.arraycopy(bArr, length - i11, this.f15830q, 0, i11);
                    System.arraycopy(this.f15827n, 0, this.f15830q, i11, i10);
                }
            }
        } else {
            int i12 = this.f15828o;
            int i13 = i12 + i;
            byte[] bArr2 = this.f15827n;
            int length2 = bArr2.length;
            if (i13 <= length2) {
                System.arraycopy(bArr2, i12, this.f15830q, 0, i);
            } else {
                int i14 = length2 - i12;
                System.arraycopy(bArr2, i12, this.f15830q, 0, i14);
                System.arraycopy(this.f15827n, 0, this.f15830q, i14, i - i14);
            }
        }
        AbstractC1668us.W("sizeToOutput is not aligned to frame size: " + i, i % this.i == 0);
        AbstractC1668us.a0(this.f15828o < this.f15827n.length);
        byte[] bArr3 = this.f15830q;
        AbstractC1668us.W(AbstractC2107A.q("byteOutput size is not aligned to frame size ", i), i % this.i == 0);
        if (i5 != 3) {
            for (int i15 = 0; i15 < i; i15 += 2) {
                int i16 = i15 + 1;
                int i17 = (bArr3[i16] << 8) | (bArr3[i15] & 255);
                if (i5 == 0) {
                    i6 = ((((i15 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i6 = 10;
                    if (i5 == 2) {
                        i6 = 10 + (((90000 * i15) / (i - 1)) / 1000);
                    }
                }
                int i18 = (i17 * i6) / 100;
                if (i18 >= 32767) {
                    bArr3[i15] = -1;
                    bArr3[i16] = Byte.MAX_VALUE;
                } else if (i18 <= -32768) {
                    bArr3[i15] = 0;
                    bArr3[i16] = Byte.MIN_VALUE;
                } else {
                    bArr3[i15] = (byte) (i18 & 255);
                    bArr3[i16] = (byte) (i18 >> 8);
                }
            }
        }
        h(i).put(bArr3, 0, i).flip();
    }
}
