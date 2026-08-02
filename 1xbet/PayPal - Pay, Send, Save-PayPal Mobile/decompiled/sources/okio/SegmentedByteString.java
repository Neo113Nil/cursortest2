package okio;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u001b\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u0011\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001b\u001a7\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010&\u001a\u00020%*\u00020\nH\u0000¢\u0006\u0004\b&\u0010(\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010)\u001a\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010,\u001a\u00020\n*\u00020.2\u0006\u0010/\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00100\u001a\u001b\u0010,\u001a\u00020\n*\u00020\u001f2\u0006\u00101\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00102\"\u001a\u00103\u001a\u00020*8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u001a\u00107\u001a\u00020\n8\u0001X\u0081D¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:"}, d2 = {"", io.ktor.http.ContentDisposition.Parameters.Size, "offset", "byteCount", "", "checkOffsetAndCount", "(JJJ)V", "", "reverseBytes", "(S)S", "", "(I)I", "(J)J", "bitCount", "leftRotate", "(II)I", "rightRotate", "(JI)J", "", "other", "shr", "(BI)I", "shl", "and", "(BJ)J", "xor", "(BB)B", "(IJ)J", "a", util.h.xy.cb.b.f1091, "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "([BI[BII)Z", "", "toHexString", "(B)Ljava/lang/String;", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "resolveDefaultParameter", "(Lokio/Buffer$UnsafeCursor;)Lokio/Buffer$UnsafeCursor;", "Lokio/ByteString;", com.daon.sdk.face.license.License.FEATURE_POSITION, "(Lokio/ByteString;I)I", "sizeParam", "([BI)I", "DEFAULT__new_UnsafeCursor", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "DEFAULT__ByteString_size", com.visa.cbp.getEncExpo.warmup, "getDEFAULT__ByteString_size", "()I"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes3.dex */
public final class SegmentedByteString {
    private static final okio.Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new okio.Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final long and(byte b, long j) {
        return b & j;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final int leftRotate(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    public static final int reverseBytes(int i) {
        return ((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static final long reverseBytes(long j) {
        return ((j & 65280) << 40) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_ALPHA & j) << 8) | ((16711680 & j) << 24) | ((255 & j) << 56);
    }

    public static final short reverseBytes(short s) {
        return (short) (((s & 65280) >>> 8) | ((s & 255) << 8));
    }

    public static final long rightRotate(long j, int i) {
        return (j >>> i) | (j << (64 - i));
    }

    public static final int shl(byte b, int i) {
        return b << i;
    }

    public static final int shr(byte b, int i) {
        return b >> i;
    }

    public static final byte xor(byte b, byte b2) {
        return (byte) (b ^ b2);
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final long minOf(long j, int i) {
        return java.lang.Math.min(j, i);
    }

    public static final long minOf(int i, long j) {
        return java.lang.Math.min(i, j);
    }

    public static final boolean arrayRangeEquals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.String toHexString(byte b) {
        return kotlin.text.StringsKt.concatToString(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b & com.google.common.base.Ascii.SI]});
    }

    public static final java.lang.String toHexString(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return kotlin.text.StringsKt.concatToString(cArr, i2, 8);
    }

    public static final java.lang.String toHexString(long j) {
        if (j == 0) {
            return "0";
        }
        int i = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return kotlin.text.StringsKt.concatToString(cArr, i, 16);
    }

    public static final okio.Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static final okio.Buffer.UnsafeCursor resolveDefaultParameter(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new okio.Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    public static final int resolveDefaultParameter(okio.ByteString byteString, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return i == DEFAULT__ByteString_size ? byteString.size() : i;
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return i == DEFAULT__ByteString_size ? bArr.length : i;
    }
}
