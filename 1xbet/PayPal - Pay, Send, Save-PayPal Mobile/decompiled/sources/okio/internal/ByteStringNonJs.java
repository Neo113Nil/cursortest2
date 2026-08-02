package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lokio/ByteString;", "commonDecodeHex", "(Ljava/lang/String;)Lokio/ByteString;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-ByteStringNonJs, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ByteStringNonJs {
    public static final okio.ByteString commonDecodeHex(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(java.lang.String.valueOf(str)).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((access$decodeHexDigit(str.charAt(i2)) << 4) + access$decodeHexDigit(str.charAt(i2 + 1)));
        }
        return new okio.ByteString(bArr);
    }

    public static final /* synthetic */ int access$decodeHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            throw new java.lang.IllegalArgumentException("Unexpected hex digit: ".concat(java.lang.String.valueOf(c)));
        }
        return c - '7';
    }
}
