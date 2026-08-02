package N9;

import android.graphics.Rect;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f18812a;

    /* renamed from: b, reason: collision with root package name */
    private int f18813b;

    /* renamed from: c, reason: collision with root package name */
    private int f18814c;

    public k(byte[] bArr, int i11, int i12) {
        this.f18812a = bArr;
        this.f18813b = i11;
        this.f18814c = i12;
    }

    public final k a(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        int i11 = rect.top;
        byte[] bArr = new byte[width * height];
        byte[] bArr2 = this.f18812a;
        int i12 = this.f18813b;
        int i13 = (i11 * i12) + rect.left;
        for (int i14 = 0; i14 < height; i14++) {
            System.arraycopy(bArr2, i13, bArr, i14 * width, width);
            i13 += i12;
        }
        return new k(bArr, width, height);
    }

    public final byte[] b() {
        return this.f18812a;
    }

    public final int c() {
        return this.f18814c;
    }

    public final int d() {
        return this.f18813b;
    }

    public final k e(int i11) {
        int i12 = 0;
        byte[] bArr = this.f18812a;
        int i13 = this.f18814c;
        int i14 = this.f18813b;
        if (i11 == 90) {
            byte[] bArr2 = new byte[i14 * i13];
            int i15 = 0;
            while (i12 < i14) {
                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                    bArr2[i15] = bArr[(i16 * i14) + i12];
                    i15++;
                }
                i12++;
            }
            return new k(bArr2, i13, i14);
        }
        if (i11 == 180) {
            int i17 = i14 * i13;
            byte[] bArr3 = new byte[i17];
            int i18 = i17 - 1;
            while (i12 < i17) {
                bArr3[i18] = bArr[i12];
                i18--;
                i12++;
            }
            return new k(bArr3, i14, i13);
        }
        if (i11 != 270) {
            return this;
        }
        int i19 = i14 * i13;
        byte[] bArr4 = new byte[i19];
        int i21 = i19 - 1;
        while (i12 < i14) {
            for (int i22 = i13 - 1; i22 >= 0; i22--) {
                bArr4[i21] = bArr[(i22 * i14) + i12];
                i21--;
            }
            i12++;
        }
        return new k(bArr4, i13, i14);
    }
}
