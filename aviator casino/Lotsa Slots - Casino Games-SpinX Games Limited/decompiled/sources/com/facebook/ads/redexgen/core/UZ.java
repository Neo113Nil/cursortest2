package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class UZ {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"bU9TaOq2H1BCoTTudHgTa6noiTEuLI16", "3dC6vQggwfY", "sSGIgptGmRpdYm1DWaL7pn14ju5", "", "MWUI4wrCJQVvfxcejCMbIiiXK3H", "jomkRAByJcuN5WcossiIAnU6", "EV4d58k22VMnbcsySNbmwKm2xbXDyfIQ", "0y1Y4yK8RTgYo"};
    public final java.io.File A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[7].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[7] = "66mt0TcJLXpax";
            strArr2[1] = "NTsH2gO48Ko";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
            i4++;
        }
    }

    public static void A02() {
        byte[] bArr = {7, 37, 42, 42, 43, 48, 100, 33, 42, 55, 49, 54, 33, 100, 99, 97, 55, 99, 100, 45, 55, 100, 37, 100, 32, 45, 54, 33, 39, 48, 43, 54, kotlin.io.encoding.Base64.padSymbol, 7, 32, 40, 45, 36, 37, 97, 53, 46, 97, 34, 51, 36, 32, 53, 36, 97, 37, 40, 51, 36, 34, 53, 46, 51, 56, 97, 102, 100, 50, 102, 124, 120, 105, 126, 113, 69, 118, 117, 125};
        java.lang.String[] strArr = A02;
        if (strArr[3].length() == strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[3] = "";
        strArr2[5] = "lx0xFtkenAwJEtKSHitpjLSh";
        A01 = bArr;
    }

    static {
        A02();
    }

    public UZ(java.io.File file) {
        this.A00 = file;
    }

    public static com.facebook.ads.redexgen.core.UZ A00(java.lang.String str, android.content.Context context) throws java.io.IOException {
        java.io.File filesDir = new java.io.File(context.getFilesDir(), A01(64, 9, 96));
        A03(filesDir);
        java.io.File fbsdklogDir = new java.io.File(filesDir, str);
        A03(fbsdklogDir);
        return new com.facebook.ads.redexgen.core.UZ(fbsdklogDir);
    }

    public static void A03(java.io.File file) throws java.io.IOException {
        if (file.exists() || file.mkdir()) {
            if (file.isDirectory()) {
                return;
            } else {
                throw new com.facebook.ads.redexgen.core.C1071Ua(java.lang.String.format(java.util.Locale.US, A01(0, 33, 62), file.getCanonicalPath()));
            }
        }
        throw new com.facebook.ads.redexgen.core.C1071Ua(java.lang.String.format(java.util.Locale.US, A01(33, 31, 59), file.getCanonicalPath()));
    }

    public final com.facebook.ads.redexgen.core.UZ A04(java.lang.String str) throws java.io.IOException {
        java.io.File file = new java.io.File(this.A00, str);
        A03(file);
        return new com.facebook.ads.redexgen.core.UZ(file);
    }

    public final java.io.File A05() {
        return this.A00;
    }
}
