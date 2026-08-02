package okhttp3.internal.url;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0010\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010\"\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b(\u0010\"\"\u0014\u0010)\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b)\u0010\"\"\u0014\u0010*\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b*\u0010\"\"\u0014\u0010+\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b+\u0010\"\"\u0014\u0010,\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0006\n\u0004\b,\u0010\""}, d2 = {"Lokio/Buffer;", "", "input", "", "pos", "limit", "encodeSet", "", "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "writeCanonicalized", "(Lokio/Buffer;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "canonicalizeWithCharset", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encoded", "writePercentDecoded", "(Lokio/Buffer;Ljava/lang/String;IIZ)V", "canonicalize", "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;", "percentDecode", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "isPercentEncoded", "(Ljava/lang/String;II)Z", "", "HEX_DIGITS", "[C", "getHEX_DIGITS", "()[C", "USERNAME_ENCODE_SET", "Ljava/lang/String;", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_ENCODE_SET", "QUERY_COMPONENT_REENCODE_SET", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "FORM_ENCODE_SET", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _UrlKt {
    public static final java.lang.String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";
    public static final java.lang.String FRAGMENT_ENCODE_SET = "";
    public static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";
    public static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    public static final char[] getHEX_DIGITS() {
        return HEX_DIGITS;
    }

    public static final void writeCanonicalized(okio.Buffer buffer, java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int i3 = i;
        okio.Buffer buffer2 = null;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (z && (codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                java.lang.String str3 = "+";
                if (codePointAt == 32 && str2 == FORM_ENCODE_SET) {
                    buffer.writeUtf8("+");
                } else if (codePointAt == 43 && z3) {
                    if (!z) {
                        str3 = "%2B";
                    }
                    buffer.writeUtf8(str3);
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (char) codePointAt, false, 2, (java.lang.Object) null) || (codePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i3, i2)))))) {
                    if (buffer2 == null) {
                        buffer2 = new okio.Buffer();
                    }
                    if (charset == null || kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8)) {
                        buffer2.writeUtf8CodePoint(codePointAt);
                    } else {
                        buffer2.writeString(str, i3, java.lang.Character.charCount(codePointAt) + i3, charset);
                    }
                    while (!buffer2.exhausted()) {
                        byte readByte = buffer2.readByte();
                        buffer.writeByte(37);
                        char[] cArr = HEX_DIGITS;
                        buffer.writeByte((int) cArr[((readByte & 255) >> 4) & 15]);
                        buffer.writeByte((int) cArr[readByte & com.google.common.base.Ascii.SI]);
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i3 += java.lang.Character.charCount(codePointAt);
        }
    }

    public static /* synthetic */ java.lang.String canonicalizeWithCharset$default(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        return canonicalizeWithCharset(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
    }

    public static final java.lang.String canonicalizeWithCharset(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (char) codePointAt, false, 2, (java.lang.Object) null) || ((codePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i3, i2)))) || (codePointAt == 43 && z3)))) {
                okio.Buffer buffer = new okio.Buffer();
                buffer.writeUtf8(str, i, i3);
                writeCanonicalized(buffer, str, i3, i2, str2, z, z2, z3, z4, charset);
                return buffer.readUtf8();
            }
            i3 += java.lang.Character.charCount(codePointAt);
        }
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final void writePercentDecoded(okio.Buffer buffer, java.lang.String str, int i, int i2, boolean z) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int parseHexDigit = okhttp3.internal._UtilCommonKt.parseHexDigit(str.charAt(i + 1));
                int parseHexDigit2 = okhttp3.internal._UtilCommonKt.parseHexDigit(str.charAt(i3));
                if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                    buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                    i = java.lang.Character.charCount(codePointAt) + i3;
                }
                buffer.writeUtf8CodePoint(codePointAt);
                i += java.lang.Character.charCount(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    buffer.writeByte(32);
                    i++;
                }
                buffer.writeUtf8CodePoint(codePointAt);
                i += java.lang.Character.charCount(codePointAt);
            }
        }
    }

    public static final java.lang.String canonicalize(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return canonicalizeWithCharset$default(str, i, i2, str2, z, z2, z3, z4, null, 128, null);
    }

    public static /* synthetic */ java.lang.String percentDecode$default(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return percentDecode(str, i, i2, z);
    }

    public static final java.lang.String percentDecode(java.lang.String str, int i, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                okio.Buffer buffer = new okio.Buffer();
                buffer.writeUtf8(str, i, i3);
                writePercentDecoded(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public static final boolean isPercentEncoded(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && okhttp3.internal._UtilCommonKt.parseHexDigit(str.charAt(i + 1)) != -1 && okhttp3.internal._UtilCommonKt.parseHexDigit(str.charAt(i3)) != -1;
    }
}
