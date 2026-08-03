package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0852Lj {
    public static byte[] A00;
    public static final java.lang.String A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{91, 78, 76, 6, 52, 3, 3, com.google.common.base.Ascii.RS, 3, 81, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, 2, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 81, 3, com.google.common.base.Ascii.DC4, 2, com.google.common.base.Ascii.RS, 4, 3, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC4, 107, 98, 19};
    }

    static {
        A04();
        A01 = com.facebook.ads.redexgen.core.C0852Lj.class.getSimpleName();
    }

    public static java.lang.String A01(java.lang.String str) {
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        java.lang.String extension = android.webkit.MimeTypeMap.getFileExtensionFromUrl(str);
        if (android.text.TextUtils.isEmpty(extension)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(extension);
    }

    public static java.lang.String A02(java.lang.String str) {
        try {
            return A03(java.security.MessageDigest.getInstance(A00(26, 3, 55)).digest(str.getBytes()));
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static java.lang.String A03(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(java.lang.String.format(java.util.Locale.US, A00(0, 4, 111), java.lang.Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    public static void A05(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e) {
                android.util.Log.e(A01, A00(4, 22, 96), e);
            }
        }
    }
}
