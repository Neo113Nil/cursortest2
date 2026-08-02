package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\r\u001a+\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\n\u001a+\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u0000*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0010\u001a\u00020\u0000*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0015\u001a%\u0010\u0016\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0019\u001a\u00020\u0000*\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u0019\u001a\u00020\u0000*\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u0018*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010\u001d\u001a\u00020\u0018*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001f\u001a)\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000$*\u00020 2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\u00020\u0002*\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0005\u001a+\u0010(\u001a\u00020\u0002*\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)\u001a#\u0010+\u001a\u00020\u0002*\u00020\u00002\u0006\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b+\u0010\u0005\u001a#\u0010,\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-\u001a \u0010.\u001a\u00020\u0002*\u0004\u0018\u00010 2\b\u0010\u0001\u001a\u0004\u0018\u00010 H\u0086\u0004¢\u0006\u0004\b.\u0010/\u001a%\u0010.\u001a\u00020\u0002*\u0004\u0018\u00010 2\b\u0010\u0001\u001a\u0004\u0018\u00010 2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b.\u00100\u001a;\u00104\u001a\u00020\u0002*\u00020 2\u0006\u00101\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020 2\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00105\u001a;\u00104\u001a\u00020\u0002*\u00020\u00002\u0006\u00101\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00106\u001a\u0013\u00107\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b7\u00108\u001a\u001b\u00107\u001a\u00020\u0000*\u00020\u00002\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b7\u0010;\u001a\u0013\u0010<\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b<\u00108\u001a\u001b\u0010<\u001a\u00020\u0000*\u00020\u00002\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b<\u0010;\u001a\u0019\u0010>\u001a\u00020\u0000*\u00020 2\u0006\u0010=\u001a\u00020\u0012¢\u0006\u0004\b>\u0010?\"%\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u00000Aj\b\u0012\u0004\u0012\u00020\u0000`B*\u00020@8G¢\u0006\u0006\u001a\u0004\bC\u0010D"}, d2 = {"", "other", "", "ignoreCase", "equals", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "replace", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "replaceFirst", "", "concatToString", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "([CII)Ljava/lang/String;", "toCharArray", "(Ljava/lang/String;II)[C", "", "decodeToString", "([B)Ljava/lang/String;", "throwOnInvalidSequence", "([BIIZ)Ljava/lang/String;", "encodeToByteArray", "(Ljava/lang/String;)[B", "(Ljava/lang/String;IIZ)[B", "", "Ljava/util/regex/Pattern;", "regex", "limit", "", "split", "(Ljava/lang/CharSequence;Ljava/util/regex/Pattern;I)Ljava/util/List;", "prefix", "startsWith", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "endsWith", "compareTo", "(Ljava/lang/String;Ljava/lang/String;Z)I", "contentEquals", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "thisOffset", "otherOffset", "length", "regionMatches", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "capitalize", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "decapitalize", "n", "repeat", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringsJVMKt extends kotlin.text.StringsKt__StringNumberConversionsKt {
    public static /* synthetic */ boolean equals$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.equals(str, str2, z);
    }

    public static final boolean equals(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replace(str, c, c2, z);
    }

    public static final java.lang.String replace(java.lang.String str, char c, char c2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            java.lang.String replace = str.replace(c, c2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replace, "");
            return replace;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        java.lang.String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str2.charAt(i);
            if (kotlin.text.CharsKt.equals(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replace(str, str2, str3, z);
    }

    public static final java.lang.String replace(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = str;
        int i = 0;
        int indexOf = kotlin.text.StringsKt.indexOf(str4, str2, 0, z);
        if (indexOf < 0) {
            return str;
        }
        int length = str2.length();
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        do {
            sb.append((java.lang.CharSequence) str4, i, indexOf);
            sb.append(str3);
            i = indexOf + length;
            if (indexOf >= str.length()) {
                break;
            }
            indexOf = kotlin.text.StringsKt.indexOf(str4, str2, indexOf + coerceAtLeast, z);
        } while (indexOf > 0);
        sb.append((java.lang.CharSequence) str4, i, str.length());
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replaceFirst(str, c, c2, z);
    }

    public static final java.lang.String replaceFirst(java.lang.String str, char c, char c2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default(str2, c, 0, z, 2, (java.lang.Object) null);
        return indexOf$default < 0 ? str : kotlin.text.StringsKt.replaceRange(str2, indexOf$default, indexOf$default + 1, java.lang.String.valueOf(c2)).toString();
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replaceFirst(str, str2, str3, z);
    }

    public static final java.lang.String replaceFirst(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default(str4, str2, 0, z, 2, (java.lang.Object) null);
        return indexOf$default < 0 ? str : kotlin.text.StringsKt.replaceRange(str4, indexOf$default, str2.length() + indexOf$default, str3).toString();
    }

    public static final java.lang.String concatToString(char[] cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        return new java.lang.String(cArr);
    }

    public static /* synthetic */ java.lang.String concatToString$default(char[] cArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return kotlin.text.StringsKt.concatToString(cArr, i, i2);
    }

    public static final java.lang.String concatToString(char[] cArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, cArr.length);
        return new java.lang.String(cArr, i, i2 - i);
    }

    public static /* synthetic */ char[] toCharArray$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return kotlin.text.StringsKt.toCharArray(str, i, i2);
    }

    public static final char[] toCharArray(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static final java.lang.String decodeToString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }

    public static /* synthetic */ java.lang.String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.decodeToString(bArr, i, i2, z);
    }

    public static final java.lang.String decodeToString(byte[] bArr, int i, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (!z) {
            return new java.lang.String(bArr, i, i2 - i, kotlin.text.Charsets.UTF_8);
        }
        java.lang.String obj = kotlin.text.Charsets.UTF_8.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).decode(java.nio.ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static final byte[] encodeToByteArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.encodeToByteArray(str, i, i2, z);
    }

    public static final byte[] encodeToByteArray(java.lang.String str, int i, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        if (!z) {
            java.lang.String substring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        }
        java.nio.ByteBuffer encode = kotlin.text.Charsets.UTF_8.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).encode(java.nio.CharBuffer.wrap(str, i, i2));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            kotlin.jvm.internal.Intrinsics.checkNotNull(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                kotlin.jvm.internal.Intrinsics.checkNotNull(array2);
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, java.util.regex.Pattern pattern, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.split(charSequence, pattern, i);
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence charSequence, java.util.regex.Pattern pattern, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        kotlin.text.StringsKt.requireNonNegativeLimit(i);
        if (i == 0) {
            i = -1;
        }
        java.lang.String[] split = pattern.split(charSequence, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(split, "");
        return kotlin.collections.ArraysKt.asList(split);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(str, str2, z);
    }

    public static final boolean startsWith(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return kotlin.text.StringsKt.regionMatches(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(str, str2, i, z);
    }

    public static final boolean startsWith(java.lang.String str, java.lang.String str2, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return kotlin.text.StringsKt.regionMatches(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.endsWith(str, str2, z);
    }

    public static final boolean endsWith(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return kotlin.text.StringsKt.regionMatches(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ int compareTo$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.compareTo(str, str2, z);
    }

    public static final int compareTo(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    public static final boolean contentEquals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && charSequence2 != null) {
            return ((java.lang.String) charSequence).contentEquals(charSequence2);
        }
        return kotlin.text.StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    public static final boolean contentEquals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        if (z) {
            return kotlin.text.StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return kotlin.text.StringsKt.contentEquals(charSequence, charSequence2);
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.regionMatches(charSequence, i, charSequence2, i2, i3, z);
    }

    public static final boolean regionMatches(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.text.StringsKt.regionMatches((java.lang.String) charSequence, i, (java.lang.String) charSequence2, i2, i3, z);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.String str, int i, java.lang.String str2, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.regionMatches(str, i, str2, i2, i3, z);
    }

    public static final boolean regionMatches(java.lang.String str, int i, java.lang.String str2, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        return kotlin.text.StringsKt.capitalize(str, locale);
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!java.lang.Character.isLowerCase(charAt)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char titleCase = java.lang.Character.toTitleCase(charAt);
        if (titleCase != java.lang.Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            java.lang.String substring = str.substring(0, 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
            java.lang.String upperCase = substring.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            sb.append(upperCase);
        }
        java.lang.String substring2 = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        sb.append(substring2);
        return sb.toString();
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0 || java.lang.Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String substring = str.substring(0, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
        java.lang.String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        java.lang.String substring2 = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        sb.append(substring2);
        return sb.toString();
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        if (str.length() <= 0 || java.lang.Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String substring = str.substring(0, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
        java.lang.String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        java.lang.String substring2 = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        sb.append(substring2);
        return sb.toString();
    }

    public static final java.lang.String repeat(java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Count 'n' must be non-negative, but was ");
            sb.append(i);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new java.lang.String(cArr);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(charSequence.length() * i);
        if (i > 0) {
            while (true) {
                sb2.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        java.lang.String obj = sb2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return obj;
    }

    public static final java.util.Comparator<java.lang.String> getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject stringCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        java.util.Comparator<java.lang.String> comparator = java.lang.String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(comparator, "");
        return comparator;
    }
}
