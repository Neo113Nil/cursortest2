package io.ktor.util;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0005¢\u0006\u0004\b\u0001\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\b\u001a\u00060\u0005j\u0002`\n*\u00020\u0005¢\u0006\u0004\b\b\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"", "encodeBase64", "(Ljava/lang/String;)Ljava/lang/String;", "", "([B)Ljava/lang/String;", "Lkotlinx/io/Source;", "(Lkotlinx/io/Source;)Ljava/lang/String;", "decodeBase64String", "decodeBase64Bytes", "(Ljava/lang/String;)[B", "Lio/ktor/utils/io/core/Input;", "(Lkotlinx/io/Source;)Lkotlinx/io/Source;", "", "", "toBase64", "(I)C", "", "fromBase64", "(B)B", "", "getHighResolutionOutputSizeshNQ4ISI", "[I", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Base64Kt {
    private static final int[] getHighResolutionOutputSizeshNQ4ISI;

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i, 0, false, 6, (java.lang.Object) null);
        }
        iArr[45] = iArr[43];
        iArr[95] = iArr[47];
        getHighResolutionOutputSizeshNQ4ISI = iArr;
    }

    public static final java.lang.String encodeBase64(byte[] bArr) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i3 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 3;
            if (i6 > bArr.length) {
                break;
            }
            byte b = bArr[i4];
            byte b2 = bArr[i4 + 1];
            byte b3 = bArr[i4 + 2];
            int i7 = 3;
            while (i7 >= 0) {
                cArr[i5] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((((b3 & 255) | (((b & 255) << 16) | ((b2 & 255) << 8))) >> (i7 * 6)) & 63);
                i7--;
                i5++;
            }
            i4 = i6;
        }
        int length = bArr.length - i4;
        if (length == 0) {
            return kotlin.text.StringsKt.concatToString(cArr, 0, i5);
        }
        if (length == 1) {
            i = (bArr[i4] & 255) << 16;
        } else {
            i = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16);
        }
        int i8 = ((3 - length) * 8) / 6;
        if (i8 <= 3) {
            while (true) {
                i2 = i5 + 1;
                cArr[i5] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i >> (i3 * 6)) & 63);
                if (i3 == i8) {
                    break;
                }
                i3--;
                i5 = i2;
            }
            i5 = i2;
        }
        int i9 = 0;
        while (i9 < i8) {
            cArr[i5] = '=';
            i9++;
            i5++;
        }
        return kotlin.text.StringsKt.concatToString(cArr, 0, i5);
    }

    public static final java.lang.String encodeBase64(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return encodeBase64(kotlinx.io.SourcesKt.readByteArray(source));
    }

    public static final java.lang.String decodeBase64String(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] decodeBase64Bytes = decodeBase64Bytes(str);
        return kotlin.text.StringsKt.decodeToString$default(decodeBase64Bytes, 0, decodeBase64Bytes.length, false, 4, null);
    }

    public static final char toBase64(int i) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i);
    }

    public static final byte fromBase64(byte b) {
        return (byte) (((byte) getHighResolutionOutputSizeshNQ4ISI[b & 255]) & 63);
    }

    public static final java.lang.String encodeBase64(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.StringsKt.writeText$default(buffer, str, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        return encodeBase64(buffer);
    }

    public static final byte[] decodeBase64Bytes(java.lang.String str) {
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.Buffer buffer2 = buffer;
        int lastIndex = kotlin.text.StringsKt.getLastIndex(str);
        while (true) {
            if (lastIndex >= 0) {
                if (str.charAt(lastIndex) != '=') {
                    java.lang.String substring = str.substring(0, lastIndex + 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    str2 = substring;
                    break;
                }
                lastIndex--;
            } else {
                break;
            }
        }
        io.ktor.utils.io.core.StringsKt.writeText$default(buffer2, str2, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        return kotlinx.io.SourcesKt.readByteArray(decodeBase64Bytes(buffer));
    }

    public static final kotlinx.io.Source decodeBase64Bytes(kotlinx.io.Source source) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.Buffer buffer2 = buffer;
        byte[] bArr = new byte[4];
        while (!source.exhausted()) {
            int readAvailable$default = io.ktor.utils.io.core.InputKt.readAvailable$default(source, bArr, 0, 0, 6, null);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < 4) {
                i3 |= ((byte) (((byte) getHighResolutionOutputSizeshNQ4ISI[bArr[i2] & 255]) & 63)) << ((3 - i4) * 6);
                i2++;
                i4++;
            }
            int i5 = 4 - readAvailable$default;
            if (i5 <= 2) {
                while (true) {
                    buffer2.writeByte((byte) ((i3 >> (i * 8)) & 255));
                    i = i != i5 ? i - 1 : 2;
                }
            }
        }
        return buffer;
    }
}
