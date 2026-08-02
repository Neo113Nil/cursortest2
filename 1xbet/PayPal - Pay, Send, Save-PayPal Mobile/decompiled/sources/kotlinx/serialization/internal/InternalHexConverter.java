package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "<init>", "()V", "", lib.android.paypal.com.magnessdk.g.n2, "", "parseHexBinary", "(Ljava/lang/String;)[B", "", "p0", "", "getHighSpeedVideoFpsRangesFor", "(C)I", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "lowerCase", "printHexBinary", "([BZ)Ljava/lang/String;", "n", "toHexString", "(I)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InternalHexConverter {
    public static final kotlinx.serialization.internal.InternalHexConverter INSTANCE = new kotlinx.serialization.internal.InternalHexConverter();

    private static int getHighSpeedVideoFpsRangesFor(char p0) {
        if ('0' <= p0 && p0 < ':') {
            return p0 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if ('A' <= p0 && p0 < 'G') {
            return p0 - '7';
        }
        if ('a' > p0 || p0 >= 'g') {
            return -1;
        }
        return p0 - 'W';
    }

    private InternalHexConverter() {
    }

    public final byte[] parseHexBinary(java.lang.String s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        int length = s.length();
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("HexBinary string must be even length".toString());
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(s.charAt(i));
            int i2 = i + 1;
            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(s.charAt(i2));
            if (highSpeedVideoFpsRangesFor == -1 || highSpeedVideoFpsRangesFor2 == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid hex chars: ");
                sb.append(s.charAt(i));
                sb.append(s.charAt(i2));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            bArr[i / 2] = (byte) ((highSpeedVideoFpsRangesFor << 4) + highSpeedVideoFpsRangesFor2);
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(data.length * 2);
        for (byte b : data) {
            sb.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & com.google.common.base.Ascii.SI));
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        if (!lowerCase) {
            return obj;
        }
        java.lang.String lowerCase2 = obj.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return lowerCase2;
    }

    public final java.lang.String toHexString(int n) {
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (n >> (24 - (i * 8)));
        }
        java.lang.String trimStart = kotlin.text.StringsKt.trimStart(printHexBinary(bArr, true), com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        if (trimStart.length() <= 0) {
            trimStart = null;
        }
        return trimStart == null ? "0" : trimStart;
    }
}
