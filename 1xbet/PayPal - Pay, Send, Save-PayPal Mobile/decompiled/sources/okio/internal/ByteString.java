package okio.internal;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010 \u001a4\u0010$\u001a\u00020#*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u00002\u0006\u0010&\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b'\u0010)\u001a\u001c\u0010+\u001a\u00020\u001d*\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010(\u001a\u001c\u0010+\u001a\u00020\u001d*\u00020\u00002\u0006\u0010*\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b+\u0010)\u001a$\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b-\u0010.\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u00100\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u0010.\u001a\u001e\u00102\u001a\u00020\u001d*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u000101H\u0080\b¢\u0006\u0004\b2\u00103\u001a\u0014\u00104\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010\u0014\u001a\u001c\u00105\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0018\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b8\u00109\u001a$\u0010:\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b<\u0010=\u001a\u0016\u0010>\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b>\u0010=\u001a+\u0010A\u001a\u00020#*\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\bC\u0010\u0003\"\u001a\u0010E\u001a\u00020D8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H"}, d2 = {"Lokio/ByteString;", "", "commonUtf8", "(Lokio/ByteString;)Ljava/lang/String;", "commonBase64", "commonBase64Url", "commonHex", "commonToAsciiLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "commonToAsciiUppercase", "", "beginIndex", "endIndex", "commonSubstring", "(Lokio/ByteString;II)Lokio/ByteString;", "pos", "", "commonGetByte", "(Lokio/ByteString;I)B", "commonGetSize", "(Lokio/ByteString;)I", "", "commonToByteArray", "(Lokio/ByteString;)[B", "commonInternalArray", "offset", "other", "otherOffset", "byteCount", "", "commonRangeEquals", "(Lokio/ByteString;ILokio/ByteString;II)Z", "(Lokio/ByteString;I[BII)Z", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "targetOffset", "", "commonCopyInto", "(Lokio/ByteString;I[BII)V", "prefix", "commonStartsWith", "(Lokio/ByteString;Lokio/ByteString;)Z", "(Lokio/ByteString;[B)Z", "suffix", "commonEndsWith", "fromIndex", "commonIndexOf", "(Lokio/ByteString;[BI)I", "commonLastIndexOf", "(Lokio/ByteString;Lokio/ByteString;I)I", "", "commonEquals", "(Lokio/ByteString;Ljava/lang/Object;)Z", "commonHashCode", "commonCompareTo", "(Lokio/ByteString;Lokio/ByteString;)I", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "commonOf", "([B)Lokio/ByteString;", "commonToByteString", "([BII)Lokio/ByteString;", "commonEncodeUtf8", "(Ljava/lang/String;)Lokio/ByteString;", "commonDecodeBase64", "Lokio/Buffer;", "buffer", "commonWrite", "(Lokio/ByteString;Lokio/Buffer;II)V", "commonToString", "", "HEX_DIGIT_CHARS", "[C", "getHEX_DIGIT_CHARS", "()[C"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-ByteString, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static final java.lang.String commonUtf8(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        java.lang.String utf8 = byteString.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        java.lang.String utf8String = okio._JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final java.lang.String commonBase64(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return okio.Base64.encodeBase64$default(byteString.getData(), null, 1, null);
    }

    public static final java.lang.String commonBase64Url(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return okio.Base64.encodeBase64(byteString.getData(), okio.Base64.getBASE64_URL_SAFE());
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final java.lang.String commonHex(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        char[] cArr = new char[byteString.getData().length * 2];
        byte[] data = byteString.getData();
        int length = data.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = data[i2];
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            cArr[i + 1] = getHEX_DIGIT_CHARS()[b & com.google.common.base.Ascii.SI];
            i2++;
            i += 2;
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b = byteString.getData()[i];
            if (b >= 65 && b <= 90) {
                byte[] data = byteString.getData();
                byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new okio.ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b = byteString.getData()[i];
            if (b >= 97 && b <= 122) {
                byte[] data = byteString.getData();
                byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        copyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new okio.ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(byteString, i2);
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0".toString());
        }
        if (resolveDefaultParameter <= byteString.getData().length) {
            if (resolveDefaultParameter - i >= 0) {
                return (i == 0 && resolveDefaultParameter == byteString.getData().length) ? byteString : new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(byteString.getData(), i, resolveDefaultParameter));
            }
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex > length(");
        sb.append(byteString.getData().length);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public static final byte commonGetByte(okio.ByteString byteString, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return byteString.getData()[i];
    }

    public static final int commonGetSize(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return byteString.getData().length;
    }

    public static final byte[] commonToByteArray(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        byte[] data = byteString.getData();
        byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public static final byte[] commonInternalArray(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return byteString.getData();
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, okio.ByteString byteString2, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        return byteString2.rangeEquals(i2, byteString.getData(), i, i3);
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return i >= 0 && i <= byteString.getData().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && okio.SegmentedByteString.arrayRangeEquals(byteString.getData(), i, bArr, i2, i3);
    }

    public static final void commonCopyInto(okio.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.collections.ArraysKt.copyInto(byteString.getData(), bArr, i2, i, i3 + i);
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonIndexOf(okio.ByteString byteString, byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int length = byteString.getData().length - bArr.length;
        int max = java.lang.Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!okio.SegmentedByteString.arrayRangeEquals(byteString.getData(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString byteString2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i);
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        for (int min = java.lang.Math.min(okio.SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData().length - bArr.length); min >= 0; min--) {
            if (okio.SegmentedByteString.arrayRangeEquals(byteString.getData(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonEquals(okio.ByteString byteString, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final int commonHashCode(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        int hashCode = byteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int hashCode2 = java.util.Arrays.hashCode(byteString.getData());
        byteString.setHashCode$okio(hashCode2);
        return hashCode2;
    }

    public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = java.lang.Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = byteString.getByte(i) & 255;
            int i3 = byteString2.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final okio.ByteString commonOf(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return new okio.ByteString(copyOf);
    }

    public static final okio.ByteString commonToByteString(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(bArr, i2);
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i, resolveDefaultParameter);
        return new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(bArr, i, resolveDefaultParameter + i));
    }

    public static final okio.ByteString commonEncodeUtf8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        okio.ByteString byteString = new okio.ByteString(okio._JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final okio.ByteString commonDecodeBase64(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] decodeBase64ToArray = okio.Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new okio.ByteString(decodeBase64ToArray);
        }
        return null;
    }

    public static final void commonWrite(okio.ByteString byteString, okio.Buffer buffer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        buffer.write(byteString.getData(), i, i2);
    }

    public static final java.lang.String commonToString(okio.ByteString byteString) {
        okio.ByteString byteString2 = byteString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        if (byteString.getData().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = access$codePointIndexToCharIndex(byteString.getData(), 64);
        if (access$codePointIndexToCharIndex == -1) {
            if (byteString.getData().length <= 64) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[hex=");
                sb.append(byteString.hex());
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[size=");
            sb2.append(byteString.getData().length);
            sb2.append(" hex=");
            int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(byteString2, 64);
            if (resolveDefaultParameter > byteString.getData().length) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("endIndex > length(");
                sb3.append(byteString.getData().length);
                sb3.append(')');
                throw new java.lang.IllegalArgumentException(sb3.toString().toString());
            }
            if (resolveDefaultParameter < 0) {
                throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
            }
            if (resolveDefaultParameter != byteString.getData().length) {
                byteString2 = new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(byteString.getData(), 0, resolveDefaultParameter));
            }
            sb2.append(byteString2.hex());
            sb2.append("…]");
            return sb2.toString();
        }
        java.lang.String utf8 = byteString.utf8();
        java.lang.String substring = utf8.substring(0, access$codePointIndexToCharIndex);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (java.lang.Object) null), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n", false, 4, (java.lang.Object) null), "\r", "\\r", false, 4, (java.lang.Object) null);
        if (access$codePointIndexToCharIndex < utf8.length()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[size=");
            sb4.append(byteString.getData().length);
            sb4.append(" text=");
            sb4.append(replace$default);
            sb4.append("…]");
            return sb4.toString();
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[text=");
        sb5.append(replace$default);
        sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb5.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0188, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] bArr, int i) {
        byte b;
        int i2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                if (i4 == i) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (Byte.MAX_VALUE > b2 || b2 >= 160))) && b2 != 65533) {
                    i5 += b2 < 65536 ? 1 : 2;
                    i3++;
                    while (true) {
                        i4 = i6;
                        if (i3 < length && (b = bArr[i3]) >= 0) {
                            i3++;
                            i6 = i4 + 1;
                            if (i4 == i) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (Byte.MAX_VALUE > b || b >= 160))) && b != 65533) {
                                i5 += b < 65536 ? 1 : 2;
                            }
                        } else {
                            break;
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            } else if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length > i7) {
                    byte b3 = bArr[i7];
                    if ((b3 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        int i8 = (b2 << 6) ^ (b3 ^ 3968);
                        if (i8 >= 128) {
                            if (i4 == i) {
                                break;
                            }
                            if ((i8 == 10 || i8 == 13 || ((i8 < 0 || i8 >= 32) && (127 > i8 || i8 >= 160))) && i8 != 65533) {
                                i5 += i8 < 65536 ? 1 : 2;
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                i3 += 2;
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                i4++;
                            }
                        } else if (i4 != i) {
                            return -1;
                        }
                    } else if (i4 != i) {
                        return -1;
                    }
                } else if (i4 != i) {
                    return -1;
                }
            } else if ((b2 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length > i9) {
                    byte b4 = bArr[i3 + 1];
                    if ((b4 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        byte b5 = bArr[i9];
                        if ((b5 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i10 = (b2 << com.google.common.base.Ascii.FF) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                            if (i10 < 2048) {
                                if (i4 != i) {
                                    return -1;
                                }
                            } else if (55296 > i10 || i10 >= 57344) {
                                i2 = i4 + 1;
                                if (i4 == i) {
                                    break;
                                }
                                if ((i10 == 10 || i10 == 13 || ((i10 < 0 || i10 >= 32) && (127 > i10 || i10 >= 160))) && i10 != 65533) {
                                    i5 += i10 < 65536 ? 1 : 2;
                                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                    i3 += 3;
                                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                    i4 = i2;
                                }
                            } else if (i4 != i) {
                                return -1;
                            }
                        } else if (i4 != i) {
                            return -1;
                        }
                    } else if (i4 != i) {
                        return -1;
                    }
                } else if (i4 != i) {
                    return -1;
                }
            } else if ((b2 >> 3) == -2) {
                int i11 = i3 + 3;
                if (length > i11) {
                    byte b6 = bArr[i3 + 1];
                    if ((b6 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                        byte b7 = bArr[i3 + 2];
                        if ((b7 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b8 = bArr[i11];
                            if ((b8 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                int i12 = (b2 << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << com.google.common.base.Ascii.FF));
                                if (i12 > 1114111) {
                                    if (i4 != i) {
                                        return -1;
                                    }
                                } else if (55296 > i12 || i12 >= 57344) {
                                    if (i12 >= 65536) {
                                        i2 = i4 + 1;
                                        if (i4 == i) {
                                            break;
                                        }
                                        if ((i12 == 10 || i12 == 13 || ((i12 < 0 || i12 >= 32) && (127 > i12 || i12 >= 160))) && i12 != 65533) {
                                            i5 += i12 < 65536 ? 1 : 2;
                                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                            i3 += 4;
                                            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                            i4 = i2;
                                        }
                                    } else if (i4 != i) {
                                        return -1;
                                    }
                                } else if (i4 != i) {
                                    return -1;
                                }
                            } else if (i4 != i) {
                                return -1;
                            }
                        } else if (i4 != i) {
                            return -1;
                        }
                    } else if (i4 != i) {
                        return -1;
                    }
                } else if (i4 != i) {
                    return -1;
                }
            } else if (i4 != i) {
                return -1;
            }
        }
        return -1;
    }
}
