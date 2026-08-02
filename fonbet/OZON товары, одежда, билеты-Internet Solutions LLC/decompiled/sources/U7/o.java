package U7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* loaded from: classes9.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f27414a = f(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static byte[] a(byte[] bArr, byte[] bArr2) {
        int[] b11 = b(f(bArr), f(bArr2));
        ByteBuffer order = ByteBuffer.allocate(b11.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b11);
        return order.array();
    }

    static int[] b(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        d(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        e(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    static void c(int i11, int i12, int i13, int i14, int[] iArr) {
        int i15 = iArr[i11] + iArr[i12];
        iArr[i11] = i15;
        int i16 = i15 ^ iArr[i14];
        int i17 = (i16 >>> (-16)) | (i16 << 16);
        iArr[i14] = i17;
        int i18 = iArr[i13] + i17;
        iArr[i13] = i18;
        int i19 = iArr[i12] ^ i18;
        int i21 = (i19 >>> (-12)) | (i19 << 12);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i14] ^ i22;
        int i24 = (i23 >>> (-8)) | (i23 << 8);
        iArr[i14] = i24;
        int i25 = iArr[i13] + i24;
        iArr[i13] = i25;
        int i26 = iArr[i12] ^ i25;
        iArr[i12] = (i26 >>> (-7)) | (i26 << 7);
    }

    static void d(int[] iArr, int[] iArr2) {
        int[] iArr3 = f27414a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void e(int[] iArr) {
        for (int i11 = 0; i11 < 10; i11++) {
            c(0, 4, 8, 12, iArr);
            c(1, 5, 9, 13, iArr);
            c(2, 6, 10, 14, iArr);
            c(3, 7, 11, 15, iArr);
            c(0, 5, 10, 15, iArr);
            c(1, 6, 11, 12, iArr);
            c(2, 7, 8, 13, iArr);
            c(3, 4, 9, 14, iArr);
        }
    }

    static int[] f(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
