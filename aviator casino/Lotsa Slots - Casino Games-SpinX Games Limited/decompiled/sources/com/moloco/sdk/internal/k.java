package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7001a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f7001a = charArray;
    }

    public static final java.lang.String a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f7001a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & com.google.common.base.Ascii.SI];
        }
        return new java.lang.String(cArr);
    }
}
