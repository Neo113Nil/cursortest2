package com.iovation.mobile.android.d;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3942a = {-120, 38, -81, -60, -106, -98, -58, -67, 89, 18, Byte.MAX_VALUE, -75, -39, -79, -43, -15};

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        new java.security.SecureRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[bArr.length + 4];
        int length = bArr.length;
        byte[] bArr4 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr4[i] = (byte) (f3942a[i] ^ bArr2[i % 4]);
        }
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr4[i2 % 16]);
        }
        java.lang.System.arraycopy(bArr2, 0, bArr3, bArr.length, 4);
        return bArr3;
    }

    public static java.lang.String b(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        try {
            byte[] encode = android.util.Base64.encode(a(bArr), 2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
            return new java.lang.String(encode, charset);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }
}
