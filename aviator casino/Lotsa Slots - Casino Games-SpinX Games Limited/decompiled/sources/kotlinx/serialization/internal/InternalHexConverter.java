package kotlinx.serialization.internal;

/* compiled from: Platform.common.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "<init>", "()V", "hexCode", "", "parseHexBinary", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "hexToInt", "", "ch", "", "printHexBinary", "data", "lowerCase", "", "toHexString", com.ironsource.B5.q, "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternalHexConverter {
    public static final kotlinx.serialization.internal.InternalHexConverter INSTANCE = new kotlinx.serialization.internal.InternalHexConverter();
    private static final java.lang.String hexCode = "0123456789ABCDEF";

    private final int hexToInt(char ch) {
        if ('0' <= ch && ch < ':') {
            return ch - '0';
        }
        if ('A' <= ch && ch < 'G') {
            return ch - '7';
        }
        if ('a' > ch || ch >= 'g') {
            return -1;
        }
        return ch - 'W';
    }

    private InternalHexConverter() {
    }

    public final byte[] parseHexBinary(java.lang.String s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "s");
        int length = s.length();
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("HexBinary string must be even length".toString());
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int hexToInt = hexToInt(s.charAt(i));
            int i2 = i + 1;
            int hexToInt2 = hexToInt(s.charAt(i2));
            if (hexToInt == -1 || hexToInt2 == -1) {
                throw new java.lang.IllegalArgumentException(("Invalid hex chars: " + s.charAt(i) + s.charAt(i2)).toString());
            }
            bArr[i / 2] = (byte) ((hexToInt << 4) + hexToInt2);
        }
        return bArr;
    }

    public static /* synthetic */ java.lang.String printHexBinary$default(kotlinx.serialization.internal.InternalHexConverter internalHexConverter, byte[] bArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return internalHexConverter.printHexBinary(bArr, z);
    }

    public final java.lang.String printHexBinary(byte[] data, boolean lowerCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(data.length * 2);
        for (byte b : data) {
            sb.append(hexCode.charAt((b >> 4) & 15));
            sb.append(hexCode.charAt(b & com.google.common.base.Ascii.SI));
        }
        if (lowerCase) {
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            java.lang.String lowerCase2 = sb2.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            return lowerCase2;
        }
        java.lang.String sb3 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final java.lang.String toHexString(int n) {
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (n >> (24 - (i * 8)));
        }
        java.lang.String trimStart = kotlin.text.StringsKt.trimStart(printHexBinary(bArr, true), '0');
        if (trimStart.length() <= 0) {
            trimStart = null;
        }
        return trimStart == null ? "0" : trimStart;
    }
}
