package F4;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[][] f2750c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2751a;

    /* renamed from: b, reason: collision with root package name */
    public int f2752b;

    public final void a(int i7) {
        int i8 = i7 + this.f2752b;
        byte[] bArr = this.f2751a;
        if (i8 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i8) {
            i8 = length;
        }
        this.f2751a = Arrays.copyOf(bArr, i8);
    }

    public final void b(byte b7) {
        if (b7 == 0) {
            d((byte) 0);
            d((byte) -1);
        } else if (b7 != -1) {
            d(b7);
        } else {
            d((byte) -1);
            d((byte) 0);
        }
    }

    public final void c(byte b7) {
        if (b7 == 0) {
            e((byte) 0);
            e((byte) -1);
        } else if (b7 != -1) {
            e(b7);
        } else {
            e((byte) -1);
            e((byte) 0);
        }
    }

    public final void d(byte b7) {
        a(1);
        byte[] bArr = this.f2751a;
        int i7 = this.f2752b;
        this.f2752b = i7 + 1;
        bArr[i7] = b7;
    }

    public final void e(byte b7) {
        a(1);
        byte[] bArr = this.f2751a;
        int i7 = this.f2752b;
        this.f2752b = i7 + 1;
        bArr[i7] = (byte) (~b7);
    }

    public final void f(long j) {
        int i7;
        long j3 = j < 0 ? ~j : j;
        byte[][] bArr = f2750c;
        if (j3 < 64) {
            a(1);
            byte[] bArr2 = this.f2751a;
            int i8 = this.f2752b;
            this.f2752b = i8 + 1;
            bArr2[i8] = (byte) (j ^ bArr[1][0]);
            return;
        }
        if (j3 < 0) {
            j3 = ~j3;
        }
        int u4 = Q0.a.u(65 - Long.numberOfLeadingZeros(j3), 7, RoundingMode.UP);
        a(u4);
        if (u4 < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(u4)));
        }
        byte b7 = j < 0 ? (byte) -1 : (byte) 0;
        int i9 = this.f2752b;
        if (u4 == 10) {
            i7 = i9 + 2;
            byte[] bArr3 = this.f2751a;
            bArr3[i9] = b7;
            bArr3[i9 + 1] = b7;
        } else if (u4 == 9) {
            i7 = i9 + 1;
            this.f2751a[i9] = b7;
        } else {
            i7 = i9;
        }
        for (int i10 = (u4 - 1) + i9; i10 >= i7; i10--) {
            this.f2751a[i10] = (byte) (255 & j);
            j >>= 8;
        }
        byte[] bArr4 = this.f2751a;
        int i11 = this.f2752b;
        byte b8 = bArr4[i11];
        byte[] bArr5 = bArr[u4];
        bArr4[i11] = (byte) (b8 ^ bArr5[0]);
        int i12 = i11 + 1;
        bArr4[i12] = (byte) (bArr5[1] ^ bArr4[i12]);
        this.f2752b = i11 + u4;
    }
}
