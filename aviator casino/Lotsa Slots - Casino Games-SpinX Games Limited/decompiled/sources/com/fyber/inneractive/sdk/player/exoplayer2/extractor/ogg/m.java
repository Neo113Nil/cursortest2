package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3991a;
    public final int b;
    public int c;
    public int d;

    public m(byte[] bArr) {
        this.f3991a = bArr;
        this.b = bArr.length;
    }

    public final boolean a() {
        boolean z = (((this.f3991a[this.c] & 255) >> this.d) & 1) == 1;
        b(1);
        return z;
    }

    public final void b(int i) {
        int i2 = i / 8;
        int i3 = this.c + i2;
        this.c = i3;
        int i4 = (i - (i2 * 8)) + this.d;
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        int i5 = this.c;
        if (i5 >= 0) {
            int i6 = this.b;
            if (i5 < i6) {
                return;
            }
            if (i5 == i6 && this.d == 0) {
                return;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public final int a(int i) {
        int i2 = this.c;
        int min = java.lang.Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.f3991a[i2] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f3991a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        b(i);
        return i5;
    }
}
