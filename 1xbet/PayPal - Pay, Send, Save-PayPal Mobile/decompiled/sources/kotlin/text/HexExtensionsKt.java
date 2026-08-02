package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0019\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0016\n\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a3\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aG\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0010\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f*\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!\u001aG\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010\u001a\u001a'\u0010\u0010\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010$\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010%\u001a\u001b\u0010&\u001a\u00020\u001f*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010)\u001a\u001b\u0010*\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010,\u001a\u001b\u0010-\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b-\u0010.\u001a1\u0010-\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b-\u0010/\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u001b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u00100\u001a\u001b\u00101\u001a\u00020\u001b*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b1\u00102\u001a1\u00101\u001a\u00020\u001b*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b1\u00103\u001a+\u00105\u001a\u00020\u0003*\u00020\u001b2\u0006\u0010\n\u001a\u0002042\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106\u001a#\u00105\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00107\u001a3\u00108\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109\u001aC\u00105\u001a\u00020=*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010>\u001a+\u00105\u001a\u00020=*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010?\u001a#\u0010\u0010\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010@\u001aF\u0010E\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001d\u0010D\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020B0A¢\u0006\u0002\bCH\u0080\bø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a#\u0010G\u001a\u00020\u001b*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010H\u001aF\u0010I\u001a\u00020\u001b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001d\u0010D\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020B0A¢\u0006\u0002\bCH\u0080\bø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a3\u0010G\u001a\u00020=*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010K\u001a3\u0010\u0010\u001a\u00020=*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010L\u001a\u001b\u0010G\u001a\u00020B*\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010M\"\u001a\u0010N\u001a\u00020\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0014\u00108\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010O\"\u0014\u0010G\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010O\"\u0014\u00105\u001a\u00020R8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010S\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "Lkotlin/text/HexFormat;", "format", "", "toHexString", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "", "startIndex", "endIndex", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "p0", "", "p1", "", "p2", "p3", "getHighSpeedVideoSizes", "([BI[I[CI)I", "numberOfBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "formattedStringLength", "(IIIIIII)I", "", "(J)I", "hexToByteArray", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;I)B", "stringLength", "parsedByteArrayMaxSize", "(JII)J", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToByte", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToShort", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToInt", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "(Ljava/lang/String;IILkotlin/text/HexFormat;)I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToLong", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "(Ljava/lang/String;IILkotlin/text/HexFormat;)J", "Lkotlin/text/HexFormat$NumberHexFormat;", "getHighSpeedVideoFpsRanges", "(JLkotlin/text/HexFormat$NumberHexFormat;Ljava/lang/String;I)Ljava/lang/String;", "(Ljava/lang/String;[CI)I", "Camera2StreamConfigurationMap", "(Ljava/lang/String;IILkotlin/text/HexFormat;I)I", "", "p4", "p5", "", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZI)V", "(Ljava/lang/String;III)V", "(Ljava/lang/String;II)I", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "onError", "parseHexToInt", "(Ljava/lang/String;IILkotlin/jvm/functions/Function2;)I", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;II)J", "parseHexToLong", "(Ljava/lang/String;IILkotlin/jvm/functions/Function2;)J", "(Ljava/lang/String;IILjava/lang/String;I)V", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;I)Ljava/lang/Void;", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "[I", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "", "[J"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final long[] Camera2StreamConfigurationMap;
    private static final int[] getHighSpeedVideoFpsRangesFor;
    private static final int[] getHighSpeedVideoSizes;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        getHighSpeedVideoSizes = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < r3.length()) {
            iArr3[r3.charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < r3.length()) {
            iArr3[r3.charAt(i7)] = i8;
            i7++;
            i8++;
        }
        getHighSpeedVideoFpsRangesFor = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < r4.length()) {
            jArr[r4.charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < r5.length()) {
            jArr[r5.charAt(i)] = i12;
            i++;
            i12++;
        }
        Camera2StreamConfigurationMap = jArr;
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    public static final java.lang.String toHexString(byte[] bArr, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return toHexString(bArr, 0, bArr.length, hexFormat);
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] bArr, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] bArr, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String toHexString(byte[] bArr, int i, int i2, kotlin.text.HexFormat hexFormat) {
        int i3 = i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i3, i2, bArr.length);
        if (i3 == i2) {
            return "";
        }
        int[] iArr = hexFormat.getUpperCase() ? getHighSpeedVideoSizes : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        kotlin.text.HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        int i4 = 0;
        if (bytes.getNoLineAndGroupSeparator()) {
            if (bytes.getShortByteSeparatorNoPrefixAndSuffix()) {
                int length = bytes.getByteSeparator().length();
                if (length > 1) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                int i5 = i2 - i3;
                if (length == 0) {
                    char[] cArr = new char[getHighSpeedVideoSizes(i5 * 2)];
                    while (i3 < i2) {
                        i4 = getHighSpeedVideoSizes(bArr, i3, iArr, cArr, i4);
                        i3++;
                    }
                    return kotlin.text.StringsKt.concatToString(cArr);
                }
                char[] cArr2 = new char[getHighSpeedVideoSizes((i5 * 3) - 1)];
                char charAt = bytes.getByteSeparator().charAt(0);
                int highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, i3, iArr, cArr2, 0);
                for (int i6 = i3 + 1; i6 < i2; i6++) {
                    cArr2[highSpeedVideoSizes] = charAt;
                    highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, i6, iArr, cArr2, highSpeedVideoSizes + 1);
                }
                return kotlin.text.StringsKt.concatToString(cArr2);
            }
            java.lang.String bytePrefix = bytes.getBytePrefix();
            java.lang.String byteSuffix = bytes.getByteSuffix();
            java.lang.String byteSeparator = bytes.getByteSeparator();
            int length2 = byteSeparator.length();
            int length3 = bytePrefix.length();
            int length4 = byteSuffix.length();
            int i7 = i2 - i3;
            if (i7 > 0) {
                long j = length2;
                char[] cArr3 = new char[getHighSpeedVideoSizes((i7 * (((length3 + 2) + length4) + j)) - j)];
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(byteSuffix, cArr3, getHighSpeedVideoSizes(bArr, i, iArr, cArr3, getHighSpeedVideoFpsRanges(bytePrefix, cArr3, 0)));
                for (int i8 = i + 1; i8 < i2; i8++) {
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(byteSuffix, cArr3, getHighSpeedVideoSizes(bArr, i8, iArr, cArr3, getHighSpeedVideoFpsRanges(bytePrefix, cArr3, getHighSpeedVideoFpsRanges(byteSeparator, cArr3, highSpeedVideoFpsRanges))));
                }
                return kotlin.text.StringsKt.concatToString(cArr3);
            }
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        java.lang.String bytePrefix2 = bytes.getBytePrefix();
        java.lang.String byteSuffix2 = bytes.getByteSuffix();
        java.lang.String byteSeparator2 = bytes.getByteSeparator();
        java.lang.String groupSeparator = bytes.getGroupSeparator();
        int formattedStringLength = formattedStringLength(i2 - i3, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator2.length(), bytePrefix2.length(), byteSuffix2.length());
        char[] cArr4 = new char[formattedStringLength];
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < i2) {
            if (i11 == bytesPerLine) {
                cArr4[i10] = '\n';
                i10++;
                i11 = 0;
            } else {
                if (i12 == bytesPerGroup) {
                    i10 = getHighSpeedVideoFpsRanges(groupSeparator, cArr4, i10);
                }
                if (i12 == 0) {
                    i10 = getHighSpeedVideoFpsRanges(byteSeparator2, cArr4, i10);
                }
                i10 = getHighSpeedVideoFpsRanges(byteSuffix2, cArr4, getHighSpeedVideoSizes(bArr, i9, iArr, cArr4, getHighSpeedVideoFpsRanges(bytePrefix2, cArr4, i10)));
                i9++;
                i12++;
                i11++;
            }
            i12 = 0;
            if (i12 == 0) {
            }
            i10 = getHighSpeedVideoFpsRanges(byteSuffix2, cArr4, getHighSpeedVideoSizes(bArr, i9, iArr, cArr4, getHighSpeedVideoFpsRanges(bytePrefix2, cArr4, i10)));
            i9++;
            i12++;
            i11++;
        }
        if (i10 != formattedStringLength) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        return kotlin.text.StringsKt.concatToString(cArr4);
    }

    private static final int getHighSpeedVideoSizes(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final int formattedStringLength(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i8 = (i - 1) / i2;
        int i9 = (i2 - 1) / i3;
        int i10 = i % i2;
        if (i10 == 0) {
            i10 = i2;
        }
        return getHighSpeedVideoSizes(i8 + (((i9 * i8) + ((i10 - 1) / i3)) * i4) + (((r1 - i8) - r3) * i5) + (i * (i6 + 2 + i7)));
    }

    private static final int getHighSpeedVideoSizes(long j) {
        if (0 <= j && j <= androidx.collection.SieveCacheKt.NodeLinkMask) {
            return (int) j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The resulting string length is too big: ");
        sb.append((java.lang.Object) kotlin.ULong.m23498toStringimpl(kotlin.ULong.m23494constructorimpl(j)));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] hexToByteArray(java.lang.String str, kotlin.text.HexFormat hexFormat) {
        java.lang.String str2;
        java.lang.String str3;
        int i;
        int i2;
        java.lang.String str4;
        int i3;
        java.lang.String str5;
        java.lang.String str6;
        int i4;
        java.lang.String str7;
        int i5;
        java.lang.String str8;
        java.lang.String str9;
        int i6;
        int i7;
        byte[] bArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        int length = str.length();
        int i8 = 0;
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(0, length, str.length());
        if (length == 0) {
            return new byte[0];
        }
        kotlin.text.HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        if (!bytes.getNoLineAndGroupSeparator()) {
            str2 = "byte suffix";
            str3 = "byte separator";
        } else if (bytes.getShortByteSeparatorNoPrefixAndSuffix()) {
            int length2 = bytes.getByteSeparator().length();
            if (length2 > 1) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (length2 == 0) {
                if ((length & 1) == 0) {
                    int i9 = length >> 1;
                    bArr = new byte[i9];
                    int i10 = 0;
                    for (int i11 = 0; i11 < i9; i11++) {
                        bArr[i11] = getHighResolutionOutputSizeshNQ4ISI(str, i10);
                        i10 += 2;
                    }
                    str2 = "byte suffix";
                    str3 = "byte separator";
                    if (bArr != null) {
                        return bArr;
                    }
                }
                str2 = "byte suffix";
                str3 = "byte separator";
                bArr = null;
                if (bArr != null) {
                }
            } else {
                if (length % 3 == 2) {
                    int i12 = (length / 3) + 1;
                    bArr = new byte[i12];
                    char charAt = bytes.getByteSeparator().charAt(0);
                    bArr[0] = getHighResolutionOutputSizeshNQ4ISI(str, 0);
                    int i13 = 2;
                    int i14 = 1;
                    while (i14 < i12) {
                        if (str.charAt(i13) != charAt) {
                            java.lang.String byteSeparator = bytes.getByteSeparator();
                            boolean ignoreCase = bytes.getIgnoreCase();
                            java.lang.String str10 = byteSeparator;
                            if (str10.length() != 0) {
                                int length3 = str10.length();
                                while (i8 < length3) {
                                    int i15 = i12;
                                    char c = charAt;
                                    if (!kotlin.text.CharsKt.equals(byteSeparator.charAt(i8), str.charAt(i13 + i8), ignoreCase)) {
                                        getHighSpeedVideoSizes(str, i13, length, byteSeparator, "byte separator");
                                    }
                                    i8++;
                                    i12 = i15;
                                    charAt = c;
                                }
                            }
                        }
                        bArr[i14] = getHighResolutionOutputSizeshNQ4ISI(str, i13 + 1);
                        i13 += 3;
                        i14++;
                        i12 = i12;
                        charAt = charAt;
                        i8 = 0;
                    }
                    str2 = "byte suffix";
                    str3 = "byte separator";
                    if (bArr != null) {
                    }
                }
                str2 = "byte suffix";
                str3 = "byte separator";
                bArr = null;
                if (bArr != null) {
                }
            }
        } else {
            java.lang.String bytePrefix = bytes.getBytePrefix();
            java.lang.String byteSuffix = bytes.getByteSuffix();
            java.lang.String byteSeparator2 = bytes.getByteSeparator();
            long length4 = byteSeparator2.length();
            long length5 = bytePrefix.length() + 2 + byteSuffix.length() + length4;
            long j = length;
            java.lang.String str11 = "byte suffix";
            int i16 = (int) ((j + length4) / length5);
            str3 = "byte separator";
            if ((i16 * length5) - length4 != j) {
                str2 = str11;
                bArr = null;
                if (bArr != null) {
                }
            } else {
                boolean ignoreCase2 = bytes.getIgnoreCase();
                byte[] bArr2 = new byte[i16];
                java.lang.String str12 = bytePrefix;
                if (str12.length() != 0) {
                    int length6 = str12.length();
                    for (int i17 = 0; i17 < length6; i17++) {
                        if (!kotlin.text.CharsKt.equals(bytePrefix.charAt(i17), str.charAt(i17), ignoreCase2)) {
                            getHighSpeedVideoSizes(str, 0, length, bytePrefix, "byte prefix");
                        }
                    }
                    i6 = 0;
                    i7 = bytePrefix.length();
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(byteSuffix);
                sb.append(byteSeparator2);
                sb.append(bytePrefix);
                java.lang.String obj = sb.toString();
                int i18 = i16 - 1;
                int i19 = i6;
                while (i19 < i18) {
                    bArr2[i19] = getHighResolutionOutputSizeshNQ4ISI(str, i7);
                    i7 += 2;
                    java.lang.String str13 = obj;
                    if (str13.length() != 0) {
                        int length7 = str13.length();
                        for (int i20 = i6; i20 < length7; i20++) {
                            if (!kotlin.text.CharsKt.equals(obj.charAt(i20), str.charAt(i7 + i20), ignoreCase2)) {
                                getHighSpeedVideoSizes(str, i7, length, obj, "byte suffix + byte separator + byte prefix");
                            }
                        }
                        i7 += obj.length();
                    }
                    i19++;
                    i6 = 0;
                }
                bArr2[i18] = getHighResolutionOutputSizeshNQ4ISI(str, i7);
                int i21 = i7 + 2;
                java.lang.String str14 = byteSuffix;
                if (str14.length() != 0) {
                    int length8 = str14.length();
                    int i22 = 0;
                    while (i22 < length8) {
                        java.lang.String str15 = str11;
                        if (!kotlin.text.CharsKt.equals(byteSuffix.charAt(i22), str.charAt(i21 + i22), ignoreCase2)) {
                            getHighSpeedVideoSizes(str, i21, length, byteSuffix, str15);
                        }
                        i22++;
                        str11 = str15;
                    }
                }
                str2 = str11;
                bArr = bArr2;
                if (bArr != null) {
                }
            }
        }
        int bytesPerLine = bytes.getBytesPerLine();
        int bytesPerGroup = bytes.getBytesPerGroup();
        java.lang.String bytePrefix2 = bytes.getBytePrefix();
        java.lang.String byteSuffix2 = bytes.getByteSuffix();
        java.lang.String byteSeparator3 = bytes.getByteSeparator();
        java.lang.String groupSeparator = bytes.getGroupSeparator();
        boolean ignoreCase3 = bytes.getIgnoreCase();
        java.lang.String str16 = str2;
        java.lang.String str17 = byteSuffix2;
        int parsedByteArrayMaxSize = parsedByteArrayMaxSize(length, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator3.length(), bytePrefix2.length(), byteSuffix2.length());
        byte[] bArr3 = new byte[parsedByteArrayMaxSize];
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i23 < length) {
            if (i25 == bytesPerLine) {
                if (str.charAt(i23) == '\r') {
                    int i27 = i23 + 1;
                    i23 = (i27 >= length || str.charAt(i27) != '\n') ? i27 : i23 + 2;
                } else {
                    if (str.charAt(i23) != '\n') {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a new line at index ");
                        sb2.append(i23);
                        sb2.append(", but was ");
                        sb2.append(str.charAt(i23));
                        throw new java.lang.NumberFormatException(sb2.toString());
                    }
                    i23++;
                }
                i25 = 0;
            } else if (i26 == bytesPerGroup) {
                java.lang.String str18 = groupSeparator;
                if (str18.length() != 0) {
                    int length9 = str18.length();
                    int i28 = 0;
                    while (i28 < length9) {
                        int i29 = i25;
                        int i30 = length9;
                        if (!kotlin.text.CharsKt.equals(groupSeparator.charAt(i28), str.charAt(i23 + i28), ignoreCase3)) {
                            getHighSpeedVideoSizes(str, i23, length, groupSeparator, "group separator");
                        }
                        i28++;
                        i25 = i29;
                        length9 = i30;
                    }
                    i23 += groupSeparator.length();
                    i25 = i25;
                }
            } else {
                i = i25;
                if (i26 != 0) {
                    java.lang.String str19 = byteSeparator3;
                    if (str19.length() != 0) {
                        int length10 = str19.length();
                        int i31 = 0;
                        while (i31 < length10) {
                            int i32 = length10;
                            int i33 = i26;
                            if (kotlin.text.CharsKt.equals(byteSeparator3.charAt(i31), str.charAt(i23 + i31), ignoreCase3)) {
                                str5 = str3;
                            } else {
                                str5 = str3;
                                getHighSpeedVideoSizes(str, i23, length, byteSeparator3, str5);
                            }
                            i31++;
                            str3 = str5;
                            length10 = i32;
                            i26 = i33;
                        }
                        i2 = i26;
                        str4 = str3;
                        i23 += byteSeparator3.length();
                        i3 = i2;
                        int i34 = i + 1;
                        int i35 = i3 + 1;
                        str6 = bytePrefix2;
                        if (str6.length() == 0) {
                            str3 = str4;
                            i4 = i35;
                        } else {
                            int length11 = str6.length();
                            str3 = str4;
                            int i36 = 0;
                            while (i36 < length11) {
                                int i37 = i35;
                                int i38 = length11;
                                if (!kotlin.text.CharsKt.equals(bytePrefix2.charAt(i36), str.charAt(i23 + i36), ignoreCase3)) {
                                    getHighSpeedVideoSizes(str, i23, length, bytePrefix2, "byte prefix");
                                }
                                i36++;
                                i35 = i37;
                                length11 = i38;
                            }
                            i4 = i35;
                            i23 += bytePrefix2.length();
                        }
                        if (length - 2 < i23) {
                            getHighSpeedVideoFpsRangesFor(str, i23, length, "exactly", 2);
                        }
                        int i39 = i24 + 1;
                        bArr3[i24] = getHighResolutionOutputSizeshNQ4ISI(str, i23);
                        i23 += 2;
                        str7 = str17;
                        if (str7.length() != 0) {
                            int length12 = str7.length();
                            int i40 = 0;
                            while (i40 < length12) {
                                java.lang.String str20 = str17;
                                int i41 = length12;
                                int i42 = i39;
                                boolean equals = kotlin.text.CharsKt.equals(str20.charAt(i40), str.charAt(i23 + i40), ignoreCase3);
                                java.lang.String str21 = str16;
                                if (!equals) {
                                    getHighSpeedVideoSizes(str, i23, length, str20, str21);
                                }
                                i40++;
                                str16 = str21;
                                length12 = i41;
                                i39 = i42;
                                str17 = str20;
                            }
                            i5 = i39;
                            str8 = str16;
                            str9 = str17;
                            i23 += str9.length();
                        } else {
                            i5 = i39;
                            str8 = str16;
                            str9 = str17;
                        }
                        str16 = str8;
                        str17 = str9;
                        i25 = i34;
                        i26 = i4;
                        i24 = i5;
                    }
                }
                i2 = i26;
                str4 = str3;
                i3 = i2;
                int i342 = i + 1;
                int i352 = i3 + 1;
                str6 = bytePrefix2;
                if (str6.length() == 0) {
                }
                if (length - 2 < i23) {
                }
                int i392 = i24 + 1;
                bArr3[i24] = getHighResolutionOutputSizeshNQ4ISI(str, i23);
                i23 += 2;
                str7 = str17;
                if (str7.length() != 0) {
                }
                str16 = str8;
                str17 = str9;
                i25 = i342;
                i26 = i4;
                i24 = i5;
            }
            i = i25;
            str4 = str3;
            i3 = 0;
            int i3422 = i + 1;
            int i3522 = i3 + 1;
            str6 = bytePrefix2;
            if (str6.length() == 0) {
            }
            if (length - 2 < i23) {
            }
            int i3922 = i24 + 1;
            bArr3[i24] = getHighResolutionOutputSizeshNQ4ISI(str, i23);
            i23 += 2;
            str7 = str17;
            if (str7.length() != 0) {
            }
            str16 = str8;
            str17 = str9;
            i25 = i3422;
            i26 = i4;
            i24 = i5;
        }
        if (i24 == parsedByteArrayMaxSize) {
            return bArr3;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr3, i24);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    public static final int parsedByteArrayMaxSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long highSpeedVideoSizes;
        long j;
        long j2;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        long j3 = i6 + 2 + i7;
        long highSpeedVideoSizes2 = getHighSpeedVideoSizes(j3, i3, i5);
        if (i2 <= i3) {
            highSpeedVideoSizes = getHighSpeedVideoSizes(j3, i2, i5);
        } else {
            highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoSizes2, i2 / i3, i4);
            int i8 = i2 % i3;
            if (i8 != 0) {
                highSpeedVideoSizes = highSpeedVideoSizes + i4 + getHighSpeedVideoSizes(j3, i8, i5);
            }
        }
        long j4 = i;
        long j5 = (j4 <= 0 || highSpeedVideoSizes <= 0) ? 0L : (j4 + 1) / (highSpeedVideoSizes + 1);
        long j6 = j4 - ((highSpeedVideoSizes + 1) * j5);
        if (j6 <= 0 || highSpeedVideoSizes2 <= 0) {
            j = 0;
        } else {
            long j7 = i4;
            j = (j6 + j7) / (j7 + highSpeedVideoSizes2);
        }
        long j8 = j6 - ((highSpeedVideoSizes2 + i4) * j);
        if (j8 <= 0 || j3 <= 0) {
            j2 = 0;
        } else {
            long j9 = i5;
            j2 = (j8 + j9) / (j9 + j3);
        }
        return (int) ((j5 * i2) + (j * i3) + j2 + (j8 - ((j3 + ((long) i5)) * j2) > 0 ? 1 : 0));
    }

    private static final long getHighSpeedVideoSizes(long j, int i, int i2) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        long j2 = i;
        return (j * j2) + (i2 * (j2 - 1));
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte b, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    public static final java.lang.String toHexString(byte b, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        java.lang.String str = hexFormat.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        kotlin.text.HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b >> 4) & 15), str.charAt(b & com.google.common.base.Ascii.SI)};
            if (number.getRemoveLeadingZeros()) {
                return kotlin.text.StringsKt.concatToString$default(cArr, kotlin.ranges.RangesKt.coerceAtMost((java.lang.Integer.numberOfLeadingZeros(b & 255) - 24) >> 2, 1), 0, 2, null);
            }
            return kotlin.text.StringsKt.concatToString(cArr);
        }
        return getHighSpeedVideoFpsRanges(b, number, str, 8);
    }

    public static final byte hexToByte(java.lang.String str, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return (byte) Camera2StreamConfigurationMap(str, 0, str.length(), hexFormat, 2);
    }

    public static /* synthetic */ byte hexToByte$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    public static /* synthetic */ java.lang.String toHexString$default(short s, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    public static final java.lang.String toHexString(short s, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        java.lang.String str = hexFormat.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        kotlin.text.HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s >> 12) & 15), str.charAt((s >> 8) & 15), str.charAt((s >> 4) & 15), str.charAt(s & 15)};
            if (number.getRemoveLeadingZeros()) {
                return kotlin.text.StringsKt.concatToString$default(cArr, kotlin.ranges.RangesKt.coerceAtMost((java.lang.Integer.numberOfLeadingZeros(s & kotlin.UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return kotlin.text.StringsKt.concatToString(cArr);
        }
        return getHighSpeedVideoFpsRanges(s, number, str, 16);
    }

    public static final short hexToShort(java.lang.String str, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return (short) Camera2StreamConfigurationMap(str, 0, str.length(), hexFormat, 4);
    }

    public static /* synthetic */ short hexToShort$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    public static /* synthetic */ java.lang.String toHexString$default(int i, kotlin.text.HexFormat hexFormat, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static final java.lang.String toHexString(int i, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        java.lang.String str = hexFormat.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        kotlin.text.HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i >> 28) & 15), str.charAt((i >> 24) & 15), str.charAt((i >> 20) & 15), str.charAt((i >> 16) & 15), str.charAt((i >> 12) & 15), str.charAt((i >> 8) & 15), str.charAt((i >> 4) & 15), str.charAt(i & 15)};
            if (number.getRemoveLeadingZeros()) {
                return kotlin.text.StringsKt.concatToString$default(cArr, kotlin.ranges.RangesKt.coerceAtMost(java.lang.Integer.numberOfLeadingZeros(i) >> 2, 7), 0, 2, null);
            }
            return kotlin.text.StringsKt.concatToString(cArr);
        }
        return getHighSpeedVideoFpsRanges(i, number, str, 32);
    }

    public static final int hexToInt(java.lang.String str, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToInt(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i, i2, hexFormat);
    }

    public static final int hexToInt(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return Camera2StreamConfigurationMap(str, i, i2, hexFormat, 8);
    }

    public static /* synthetic */ java.lang.String toHexString$default(long j, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    public static final java.lang.String toHexString(long j, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        java.lang.String str = hexFormat.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        kotlin.text.HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (15 & j))};
            if (number.getRemoveLeadingZeros()) {
                return kotlin.text.StringsKt.concatToString$default(cArr, kotlin.ranges.RangesKt.coerceAtMost(java.lang.Long.numberOfLeadingZeros(j) >> 2, 15), 0, 2, null);
            }
            return kotlin.text.StringsKt.concatToString(cArr);
        }
        return getHighSpeedVideoFpsRanges(j, number, str, 64);
    }

    public static final long hexToLong(java.lang.String str, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToLong(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String str, kotlin.text.HexFormat hexFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = kotlin.text.HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i, i2, hexFormat);
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(long j, kotlin.text.HexFormat.NumberHexFormat numberHexFormat, java.lang.String str, int i) {
        if ((i & 3) != 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i >> 2;
        int minLength = numberHexFormat.getMinLength();
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(minLength - i2, 0);
        java.lang.String prefix = numberHexFormat.getPrefix();
        java.lang.String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int highSpeedVideoSizes = getHighSpeedVideoSizes(prefix.length() + coerceAtLeast + i2 + suffix.length());
        char[] cArr = new char[highSpeedVideoSizes];
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(prefix, cArr, 0);
        if (coerceAtLeast > 0) {
            int i3 = coerceAtLeast + highSpeedVideoFpsRanges;
            kotlin.collections.ArraysKt.fill(cArr, str.charAt(0), highSpeedVideoFpsRanges, i3);
            highSpeedVideoFpsRanges = i3;
        }
        int i4 = i;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 -= 4;
            int i6 = (int) ((j >> i4) & 15);
            removeLeadingZeros = removeLeadingZeros && i6 == 0 && (i4 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[highSpeedVideoFpsRanges] = str.charAt(i6);
                highSpeedVideoFpsRanges++;
            }
        }
        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(suffix, cArr, highSpeedVideoFpsRanges);
        return highSpeedVideoFpsRanges2 == highSpeedVideoSizes ? kotlin.text.StringsKt.concatToString(cArr) : kotlin.text.StringsKt.concatToString$default(cArr, 0, highSpeedVideoFpsRanges2, 1, null);
    }

    private static final int getHighSpeedVideoFpsRanges(java.lang.String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length == 1) {
                cArr[i] = str.charAt(0);
            } else {
                int length2 = str.length();
                kotlin.jvm.internal.Intrinsics.checkNotNull(str, "");
                str.getChars(0, length2, cArr, i);
            }
        }
        return i + str.length();
    }

    private static final int Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat, int i3) {
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        kotlin.text.HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            getHighSpeedVideoFpsRanges(str, i, i2, i3);
            return getHighSpeedVideoSizes(str, i, i2);
        }
        java.lang.String prefix = number.getPrefix();
        java.lang.String suffix = number.getSuffix();
        getHighSpeedVideoFpsRanges(str, i, i2, prefix, suffix, number.getIgnoreCase(), i3);
        return getHighSpeedVideoSizes(str, i + prefix.length(), i2 - suffix.length());
    }

    private static final void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, boolean z, int i3) {
        if ((i2 - i) - str2.length() > str3.length()) {
            java.lang.String str4 = str2;
            if (str4.length() != 0) {
                int length = str4.length();
                for (int i4 = 0; i4 < length; i4++) {
                    if (!kotlin.text.CharsKt.equals(str2.charAt(i4), str.charAt(i + i4), z)) {
                        getHighSpeedVideoSizes(str, i, i2, str2, "prefix");
                    }
                }
                i += str2.length();
            }
            int length2 = i2 - str3.length();
            java.lang.String str5 = str3;
            if (str5.length() != 0) {
                int length3 = str5.length();
                for (int i5 = 0; i5 < length3; i5++) {
                    if (!kotlin.text.CharsKt.equals(str3.charAt(i5), str.charAt(length2 + i5), z)) {
                        getHighSpeedVideoSizes(str, length2, i2, str3, "suffix");
                    }
                }
            }
            getHighSpeedVideoFpsRanges(str, i, length2, i3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "");
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a hexadecimal number with prefix \"");
        sb.append(str2);
        sb.append("\" and suffix \"");
        sb.append(str3);
        sb.append("\", but was ");
        sb.append(substring);
        throw new java.lang.NumberFormatException(sb.toString());
    }

    private static final void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 <= 0) {
            getHighSpeedVideoFpsRangesFor(str, i, i2, "at least", 1);
            return;
        }
        if (i4 > i3) {
            int i5 = (i4 + i) - i3;
            while (i < i5) {
                if (str.charAt(i) != '0') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected the hexadecimal digit '0' at index ");
                    sb.append(i);
                    sb.append(", but was '");
                    sb.append(str.charAt(i));
                    sb.append("'.\nThe result won't fit the type being parsed.");
                    throw new java.lang.NumberFormatException(sb.toString());
                }
                i++;
            }
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, java.lang.String str2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "");
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str2);
        sb.append(' ');
        sb.append(i3);
        sb.append(" hexadecimal digits at index ");
        sb.append(i);
        sb.append(", but was \"");
        sb.append(substring);
        sb.append("\" of length ");
        sb.append(i2 - i);
        throw new java.lang.NumberFormatException(sb.toString());
    }

    private static final void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(str2.length() + i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "");
        java.lang.String substring = str.substring(i, coerceAtMost);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str2);
        sb.append("\" at index ");
        sb.append(i);
        sb.append(", but was ");
        sb.append(substring);
        throw new java.lang.NumberFormatException(sb.toString());
    }

    private static final java.lang.Void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a hexadecimal digit at index ");
        sb.append(i);
        sb.append(", but was ");
        sb.append(str.charAt(i));
        throw new java.lang.NumberFormatException(sb.toString());
    }

    private static final byte getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i) {
        char charAt = str.charAt(i);
        if ((charAt >>> '\b') == 0 && getHighSpeedVideoFpsRangesFor[charAt] >= 0) {
            int i2 = getHighSpeedVideoFpsRangesFor[charAt];
            int i3 = i + 1;
            char charAt2 = str.charAt(i3);
            if ((charAt2 >>> '\b') == 0 && getHighSpeedVideoFpsRangesFor[charAt2] >= 0) {
                return (byte) (getHighSpeedVideoFpsRangesFor[charAt2] | (i2 << 4));
            }
            getHighSpeedVideoFpsRangesFor(str, i3);
            throw new kotlin.KotlinNothingValueException();
        }
        getHighSpeedVideoFpsRangesFor(str, i);
        throw new kotlin.KotlinNothingValueException();
    }

    private static final int getHighSpeedVideoSizes(java.lang.String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0 && getHighSpeedVideoFpsRangesFor[charAt] >= 0) {
                i3 = (i3 << 4) | getHighSpeedVideoFpsRangesFor[charAt];
                i++;
            } else {
                getHighSpeedVideoFpsRangesFor(str, i);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        return i3;
    }

    public static final int parseHexToInt(java.lang.String str, int i, int i2, kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        int i3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0 && getHighSpeedVideoFpsRangesFor[charAt] >= 0) {
                i3 = (i3 << 4) | getHighSpeedVideoFpsRangesFor[charAt];
                i++;
            } else {
                function2.invoke(str, java.lang.Integer.valueOf(i));
                throw new kotlin.KotlinNothingValueException();
            }
        }
        return i3;
    }

    private static final long getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0 && Camera2StreamConfigurationMap[charAt] >= 0) {
                j = (j << 4) | Camera2StreamConfigurationMap[charAt];
                i++;
            } else {
                getHighSpeedVideoFpsRangesFor(str, i);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        return j;
    }

    public static final long parseHexToLong(java.lang.String str, int i, int i2, kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        long j = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0 && Camera2StreamConfigurationMap[charAt] >= 0) {
                j = (j << 4) | Camera2StreamConfigurationMap[charAt];
                i++;
            } else {
                function2.invoke(str, java.lang.Integer.valueOf(i));
                throw new kotlin.KotlinNothingValueException();
            }
        }
        return j;
    }

    public static final long hexToLong(java.lang.String str, int i, int i2, kotlin.text.HexFormat hexFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexFormat, "");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        kotlin.text.HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            getHighSpeedVideoFpsRanges(str, i, i2, 16);
            return getHighSpeedVideoFpsRangesFor(str, i, i2);
        }
        java.lang.String prefix = number.getPrefix();
        java.lang.String suffix = number.getSuffix();
        getHighSpeedVideoFpsRanges(str, i, i2, prefix, suffix, number.getIgnoreCase(), 16);
        return getHighSpeedVideoFpsRangesFor(str, i + prefix.length(), i2 - suffix.length());
    }
}
