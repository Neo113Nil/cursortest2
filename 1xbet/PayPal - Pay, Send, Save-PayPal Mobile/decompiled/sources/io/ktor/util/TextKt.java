package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001aE\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "escapeHTML", "(Ljava/lang/String;)Ljava/lang/String;", "separator", "Lkotlin/Function0;", "Lkotlin/Pair;", "onMissingDelimiter", "chomp", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Pair;", "toLowerCasePreservingASCIIRules", "toUpperCasePreservingASCIIRules", "", "p0", "getHighSpeedVideoSizes", "(C)C", "Camera2StreamConfigurationMap", "Lio/ktor/util/CaseInsensitiveString;", "caseInsensitive", "(Ljava/lang/String;)Lio/ktor/util/CaseInsensitiveString;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextKt {
    public static final java.lang.String escapeHTML(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("&quot;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt == '\'') {
                sb.append("&#x27;");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> chomp(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.String>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return function0.invoke();
        }
        java.lang.String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = str.substring(indexOf$default + str2.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        return kotlin.TuplesKt.to(substring, substring2);
    }

    public static final java.lang.String toLowerCasePreservingASCIIRules(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str2.charAt(i);
            if (getHighSpeedVideoSizes(charAt) != charAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        sb.append((java.lang.CharSequence) str2, 0, i);
        int lastIndex = kotlin.text.StringsKt.getLastIndex(str2);
        if (i <= lastIndex) {
            while (true) {
                sb.append(getHighSpeedVideoSizes(str.charAt(i)));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    public static final java.lang.String toUpperCasePreservingASCIIRules(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str2.charAt(i);
            if (Camera2StreamConfigurationMap(charAt) != charAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        sb.append((java.lang.CharSequence) str2, 0, i);
        int lastIndex = kotlin.text.StringsKt.getLastIndex(str2);
        if (i <= lastIndex) {
            while (true) {
                sb.append(Camera2StreamConfigurationMap(str.charAt(i)));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    private static final char getHighSpeedVideoSizes(char c) {
        return ('A' > c || c >= '[') ? (c < 0 || c >= 128) ? java.lang.Character.toLowerCase(c) : c : (char) (c + ' ');
    }

    private static final char Camera2StreamConfigurationMap(char c) {
        return ('a' > c || c >= '{') ? (c < 0 || c >= 128) ? java.lang.Character.toLowerCase(c) : c : (char) (c - ' ');
    }

    public static final io.ktor.util.CaseInsensitiveString caseInsensitive(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new io.ktor.util.CaseInsensitiveString(str);
    }
}
