package com.discover.mpos.sdk.core.extensions;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\"\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015"}, d2 = {"", "hexToByteArray", "([B)[B", "", "numToLong", "([B)J", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "secNumToInt", "([BII)I", "fractionDigits", "", "toDouble", "([BI)D", "", "toHexString", "([B)Ljava/lang/String;", "toInt", "([B)I", "HEX_BYTE_LENGTH", com.visa.cbp.getEncExpo.warmup, "HEX_DIGIT", "HEX_DIGIT_BIT_SIZE", "NUM_RADIX", "NUM_RADIX_D", "D", "ONE_BIT", "ONE_DIGIT"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ByteArrayExtensionsKt {
    private static final int HEX_BYTE_LENGTH = 2;
    private static final int HEX_DIGIT = 15;
    private static final int HEX_DIGIT_BIT_SIZE = 4;
    private static final int NUM_RADIX = 10;
    private static final double NUM_RADIX_D = 10.0d;
    private static final int ONE_BIT = 1;
    private static final int ONE_DIGIT = 1;

    public static final java.lang.String toHexString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexChars(b));
        }
        return sb.toString();
    }

    public static final int secNumToInt(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i3 = 0;
        if (i <= i2) {
            while (true) {
                i3 = (i3 * 10) + bArr[i];
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return i3;
    }

    public static final byte[] hexToByteArray(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArr2 = new byte[bArr.length << 1];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            bArr2[i2] = (byte) ((b >>> 4) & 15);
            bArr2[i2 + 1] = (byte) (b & com.google.common.base.Ascii.SI);
        }
        return bArr2;
    }

    public static final long numToLong(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        long j = 0;
        for (int i = 0; i < hexToByteArray(bArr).length; i++) {
            j = (j * 10) + r6[i];
        }
        return j;
    }

    public static final int toInt(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int max = java.lang.Math.max(bArr.length, 4);
        int i = 0;
        for (int i2 = 0; i2 < max; i2++) {
            i = (i << 8) | bArr[i2];
        }
        return i;
    }

    public static final double toDouble(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return numToLong(bArr) / java.lang.Math.pow(10.0d, i);
    }
}
