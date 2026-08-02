package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0001H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\f*\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010'\u001a\u00020\f*\u00020%2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\f*\u00020)2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010*\u001a\u001c\u0010'\u001a\u00020+*\u00020\f2\u0006\u0010&\u001a\u00020+H\u0080\u0004¢\u0006\u0004\b'\u0010,\u001a\u001b\u00100\u001a\u00020/*\u00020-2\u0006\u0010.\u001a\u00020\fH\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\f*\u000202H\u0000¢\u0006\u0004\b3\u00104\u001a!\u00107\u001a\u00020/2\f\u00106\u001a\b\u0012\u0004\u0012\u00020/05H\u0080\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001b\u0010;\u001a\u00020\f*\u0002092\u0006\u0010:\u001a\u00020%H\u0000¢\u0006\u0004\b;\u0010<\u001a\u001d\u0010=\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010>\u001a\u0019\u0010@\u001a\u00020+*\u00020\u00012\u0006\u0010?\u001a\u00020+¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010B\u001a\u00020\f*\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020\fH\u0000¢\u0006\u0004\bB\u0010>\u001a\u0015\u0010E\u001a\u00020/*\u00060Cj\u0002`D¢\u0006\u0004\bE\u0010F\u001a\u001b\u0010J\u001a\u00020\b*\u00020G2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010M\u001a\u00020/*\u00020G2\u0006\u0010L\u001a\u00020HH\u0000¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010P\u001a\u00020/*\u00020G2\u0006\u0010O\u001a\u00020HH\u0000¢\u0006\u0004\bP\u0010N\u001a'\u0010T\u001a\u00020/\"\u0004\b\u0000\u0010Q*\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010S\u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010U\u001a)\u0010[\u001a\u00020Z*\u00060Vj\u0002`W2\u0010\u0010Y\u001a\f\u0012\b\u0012\u00060Vj\u0002`W0XH\u0000¢\u0006\u0004\b[\u0010\\\u001aB\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]*\b\u0012\u0004\u0012\u00028\u00000^2\u0017\u0010a\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0_¢\u0006\u0002\b`H\u0080\bø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a'\u0010g\u001a\u00020/2\u0006\u0010d\u001a\u00020+2\u0006\u0010e\u001a\u00020+2\u0006\u0010f\u001a\u00020+H\u0000¢\u0006\u0004\bg\u0010h\u001a7\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000^2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000^H\u0000¢\u0006\u0004\bj\u0010k\"\u0014\u0010m\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u001a\u0010p\u001a\u00020o8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0014\u0010t\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\bt\u0010u\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "", "other", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "name", "isSensitiveHeader", "(Ljava/lang/String;)Z", "parseHexDigit", "(C)I", "", com.daon.sdk.face.license.License.FEATURE_MASK, "and", "(BI)I", "", "(SI)I", "", "(IJ)J", "Lokio/BufferedSink;", "medium", "", "writeMedium", "(Lokio/BufferedSink;I)V", "Lokio/BufferedSource;", "readMedium", "(Lokio/BufferedSource;)I", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(Lkotlin/jvm/functions/Function0;)V", "Lokio/Buffer;", util.h.xy.cb.b.f1091, "skipAll", "(Lokio/Buffer;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "closeQuietly", "(Ljava/io/Closeable;)V", "Lokio/FileSystem;", "Lokio/Path;", "file", "isCivilized", "(Lokio/FileSystem;Lokio/Path;)Z", "path", "deleteIfExists", "(Lokio/FileSystem;Lokio/Path;)V", "directory", "deleteContents", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "suppressed", "", "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "T", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "predicate", "filterList", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "arrayLength", "offset", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "checkOffsetAndCount", "(JJJ)V", "a", "interleave", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "", "EMPTY_BYTE_ARRAY", "[B", "Lokio/Options;", "UNICODE_BOMS", "Lokio/Options;", "getUNICODE_BOMS", "()Lokio/Options;", "USER_AGENT", "Ljava/lang/String;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _UtilCommonKt {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final okio.Options UNICODE_BOMS = okio.Options.INSTANCE.of(okio.ByteString.INSTANCE.decodeHex("efbbbf"), okio.ByteString.INSTANCE.decodeHex("feff"), okio.ByteString.INSTANCE.decodeHex("fffe0000"), okio.ByteString.INSTANCE.decodeHex("fffe"), okio.ByteString.INSTANCE.decodeHex("0000feff"));
    public static final java.lang.String USER_AGENT = "okhttp/5.3.2";

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final okio.Options getUNICODE_BOMS() {
        return UNICODE_BOMS;
    }

    public static final java.lang.String[] intersect(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator<? super java.lang.String> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static final boolean hasIntersection(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator<? super java.lang.String> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (java.lang.String str : strArr) {
                for (java.lang.String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final java.lang.String[] concat(java.lang.String[] strArr, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(strArr, strArr.length + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        java.lang.String[] strArr2 = (java.lang.String[]) copyOf;
        strArr2[kotlin.collections.ArraysKt.getLastIndex(strArr2)] = str;
        return strArr2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfFirstNonAsciiWhitespace(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ java.lang.String trimSubstring$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final java.lang.String trimSubstring(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        java.lang.String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final int delimiterOffset(java.lang.String str, java.lang.String str2, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        while (i < i2) {
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, str.charAt(i), false, 2, (java.lang.Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(java.lang.String str, char c, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final int delimiterOffset(java.lang.String str, char c, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int indexOfControlOrNonAscii(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 31) <= 0 || kotlin.jvm.internal.Intrinsics.compare((int) charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean isSensitiveHeader(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.equals(str, "Authorization", true) || kotlin.text.StringsKt.equals(str, "Cookie", true) || kotlin.text.StringsKt.equals(str, com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION, true) || kotlin.text.StringsKt.equals(str, "Set-Cookie", true);
    }

    public static final void writeMedium(okio.BufferedSink bufferedSink, int i) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "");
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public static final int readMedium(okio.BufferedSource bufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    public static final void ignoreIoExceptions(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        try {
            function0.invoke();
        } catch (java.io.IOException unused) {
        }
    }

    public static final int skipAll(okio.Buffer buffer, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final int indexOfNonWhitespace(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final long toLongOrDefault(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(java.lang.String str, int i) {
        if (str != null) {
            try {
                long parseLong = java.lang.Long.parseLong(str);
                if (parseLong > androidx.collection.SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final void closeQuietly(java.io.Closeable closeable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeable, "");
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isCivilized(okio.FileSystem fileSystem, okio.Path path) {
        java.lang.Throwable th;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        okio.Sink sink = fileSystem.sink(path);
        try {
            okio.Sink sink2 = sink;
        } catch (java.lang.Throwable th2) {
            if (sink != null) {
                try {
                    sink.close();
                } catch (java.lang.Throwable th3) {
                    kotlin.ExceptionsKt.addSuppressed(th2, th3);
                }
            }
            th = th2;
        }
        try {
            fileSystem.delete(path);
            if (sink == null) {
                return true;
            }
            try {
                sink.close();
                return true;
            } catch (java.lang.Throwable unused) {
                return true;
            }
        } catch (java.io.IOException unused2) {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (sink != null) {
                try {
                    sink.close();
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    if (th != null) {
                        fileSystem.delete(path);
                        return false;
                    }
                    throw th;
                }
            }
            th = null;
            if (th != null) {
            }
        }
    }

    public static final void deleteIfExists(okio.FileSystem fileSystem, okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        try {
            fileSystem.delete(path);
        } catch (java.io.FileNotFoundException unused) {
        }
    }

    public static final void deleteContents(okio.FileSystem fileSystem, okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        try {
            java.io.IOException iOException = null;
            for (okio.Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        deleteContents(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (java.io.IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (java.io.FileNotFoundException unused) {
        }
    }

    public static final <E> void addIfAbsent(java.util.List<E> list, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final java.lang.Throwable withSuppressed(java.lang.Exception exc, java.util.List<? extends java.lang.Exception> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<? extends java.lang.Exception> it = list.iterator();
        while (it.hasNext()) {
            kotlin.ExceptionsKt.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final <T> java.util.List<T> filterList(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList emptyList = kotlin.collections.CollectionsKt.emptyList();
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                if (emptyList.isEmpty()) {
                    emptyList = new java.util.ArrayList();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(emptyList, "");
                kotlin.jvm.internal.TypeIntrinsics.asMutableList(emptyList).add(t);
            }
        }
        return emptyList;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("length=");
            sb.append(j);
            sb.append(", offset=");
            sb.append(j2);
            sb.append(", count=");
            sb.append(j2);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final <T> java.util.List<T> interleave(java.lang.Iterable<? extends T> iterable, java.lang.Iterable<? extends T> iterable2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable2, "");
        java.util.Iterator<? extends T> it = iterable.iterator();
        java.util.Iterator<? extends T> it2 = iterable2.iterator();
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return kotlin.collections.CollectionsKt.build(createListBuilder);
            }
            if (it.hasNext()) {
                createListBuilder.add(it.next());
            }
            if (it2.hasNext()) {
                createListBuilder.add(it2.next());
            }
        }
    }

    public static final int indexOf(java.lang.String[] strArr, java.lang.String str, java.util.Comparator<java.lang.String> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }
}
