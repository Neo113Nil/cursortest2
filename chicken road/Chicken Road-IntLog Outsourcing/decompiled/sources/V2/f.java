package V2;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3240a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3241b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f3242c;

    static {
        char[] cArr = new char[512];
        for (int i2 = 0; i2 < 256; i2++) {
            cArr[i2] = "0123456789abcdef".charAt(i2 >>> 4);
            cArr[i2 | 256] = "0123456789abcdef".charAt(i2 & 15);
        }
        f3240a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 16; i3++) {
            bArr["0123456789abcdef".charAt(i3)] = (byte) i3;
        }
        f3241b = bArr;
        boolean[] zArr = new boolean[65535];
        int i6 = 0;
        while (i6 < 65535) {
            zArr[i6] = (48 <= i6 && i6 <= 57) || (97 <= i6 && i6 <= 102);
            i6++;
        }
        f3242c = zArr;
    }

    public static void a(String str, int i2, byte[] bArr) {
        byte[] bArr2;
        byte b6;
        byte b7;
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i6 = i3 / 2;
            char charAt = str.charAt(i3);
            char charAt2 = str.charAt(i3 + 1);
            if (charAt >= 128 || (b6 = (bArr2 = f3241b)[charAt]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt);
            }
            if (charAt2 >= 128 || (b7 = bArr2[charAt2]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt2);
            }
            bArr[i6] = (byte) (b7 | (b6 << 4));
        }
    }
}
