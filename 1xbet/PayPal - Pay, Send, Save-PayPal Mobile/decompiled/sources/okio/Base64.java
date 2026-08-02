package okio;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u00020\u00018\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n"}, d2 = {"", "", "decodeBase64ToArray", "(Ljava/lang/String;)[B", "map", "encodeBase64", "([B[B)Ljava/lang/String;", "BASE64", "[B", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Base64 {
    private static final byte[] BASE64 = okio.ByteString.INSTANCE.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData();
    private static final byte[] BASE64_URL_SAFE = okio.ByteString.INSTANCE.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData();

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static final byte[] decodeBase64ToArray(java.lang.String str) {
        int i;
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if ('A' <= charAt2 && charAt2 < '[') {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                bArr[i5 + 1] = (byte) (i4 >> 8);
                bArr[i5 + 2] = (byte) i4;
                i5 += 3;
            }
        }
        int i7 = i3 % 4;
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i7 == 3) {
            int i8 = i4 << 6;
            bArr[i5] = (byte) (i8 >> 16);
            bArr[i5 + 1] = (byte) (i8 >> 8);
            i5 += 2;
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, i5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public static /* synthetic */ java.lang.String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final java.lang.String encodeBase64(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            int i3 = i + 3;
            byte b3 = bArr[i + 2];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[((b2 & com.google.common.base.Ascii.SI) << 2) | ((b3 & 255) >> 6)];
            bArr3[i2 + 3] = bArr2[b3 & 63];
            i2 += 4;
            i = i3;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = kotlin.io.encoding.Base64.padSymbol;
            bArr3[i2 + 3] = kotlin.io.encoding.Base64.padSymbol;
        } else if (length2 == 2) {
            byte b5 = bArr[i];
            byte b6 = bArr[i + 1];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & com.google.common.base.Ascii.SI) << 2];
            bArr3[i2 + 3] = kotlin.io.encoding.Base64.padSymbol;
        }
        return okio._JvmPlatformKt.toUtf8String(bArr3);
    }
}
