package codec.digest;

/* loaded from: classes7.dex */
public class XXHash32 implements java.util.zip.Checksum {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2778a;
    public final int[] b;
    public final byte[] c;
    public final int d;
    public int e;
    public int f;

    public XXHash32() {
        this(0);
    }

    public static int a(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            j |= (bArr[i + i2] & 255) << (i2 * 8);
        }
        return (int) (4294967295L & j);
    }

    public final void b(byte[] bArr, int i) {
        int[] iArr = this.b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int rotateLeft = java.lang.Integer.rotateLeft((a(bArr, i) * (-2048144777)) + i2, 13);
        int rotateLeft2 = java.lang.Integer.rotateLeft((a(bArr, i + 4) * (-2048144777)) + i3, 13);
        int rotateLeft3 = java.lang.Integer.rotateLeft((a(bArr, i + 8) * (-2048144777)) + i4, 13);
        int rotateLeft4 = java.lang.Integer.rotateLeft((a(bArr, i + 12) * (-2048144777)) + i5, 13);
        int[] iArr2 = this.b;
        iArr2[0] = rotateLeft * (-1640531535);
        iArr2[1] = rotateLeft2 * (-1640531535);
        iArr2[2] = rotateLeft3 * (-1640531535);
        iArr2[3] = rotateLeft4 * (-1640531535);
        this.f = 0;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int i;
        int i2 = 0;
        if (this.e > 16) {
            int rotateLeft = java.lang.Integer.rotateLeft(this.b[0], 1);
            i = java.lang.Integer.rotateLeft(this.b[3], 18) + java.lang.Integer.rotateLeft(this.b[2], 12) + java.lang.Integer.rotateLeft(this.b[1], 7) + rotateLeft;
        } else {
            i = this.b[2] + 374761393;
        }
        int i3 = i + this.e;
        int i4 = this.f;
        while (i2 <= i4 - 4) {
            i3 = java.lang.Integer.rotateLeft((a(this.c, i2) * (-1028477379)) + i3, 17) * 668265263;
            i2 += 4;
        }
        while (i2 < this.f) {
            i3 = java.lang.Integer.rotateLeft(((this.c[i2] & 255) * 374761393) + i3, 11) * (-1640531535);
            i2++;
        }
        int i5 = ((i3 >>> 15) ^ i3) * (-2048144777);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477379);
        return (i6 ^ (i6 >>> 16)) & 4294967295L;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        int[] iArr = this.b;
        int i = this.d;
        iArr[0] = 606290984 + i;
        iArr[1] = (-2048144777) + i;
        iArr[2] = i;
        iArr[3] = i + 1640531535;
        this.e = 0;
        this.f = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        byte[] bArr = this.f2778a;
        bArr[0] = (byte) (i & 255);
        update(bArr, 0, 1);
    }

    public XXHash32(int i) {
        this.f2778a = new byte[1];
        this.b = new int[]{606290984 + i, (-2048144777) + i, i, i + 1640531535};
        this.c = new byte[16];
        this.d = i;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            this.e += i2;
            int i3 = i + i2;
            int i4 = this.f;
            if (i4 + i2 < 16) {
                java.lang.System.arraycopy(bArr, i, this.c, i4, i2);
                this.f += i2;
                return;
            }
            if (i4 > 0) {
                int i5 = 16 - i4;
                java.lang.System.arraycopy(bArr, i, this.c, i4, i5);
                b(this.c, 0);
                i += i5;
            }
            while (i <= i3 - 16) {
                b(bArr, i);
                i += 16;
            }
            if (i < i3) {
                int i6 = i3 - i;
                this.f = i6;
                java.lang.System.arraycopy(bArr, i, this.c, 0, i6);
            }
        }
    }
}
