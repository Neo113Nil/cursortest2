package io.ktor.util;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001aE\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"", "escapeHTML", "(Ljava/lang/String;)Ljava/lang/String;", "separator", "Lkotlin/Function0;", "Lkotlin/Pair;", "onMissingDelimiter", "chomp", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Pair;", "toLowerCasePreservingASCIIRules", "toUpperCasePreservingASCIIRules", "", "ch", "toLowerCasePreservingASCII", "(C)C", "toUpperCasePreservingASCII", "Lio/ktor/util/CaseInsensitiveString;", "caseInsensitive", "(Ljava/lang/String;)Lio/ktor/util/CaseInsensitiveString;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextKt {
    public static final String escapeHTML(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
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

    public static final Pair<String, String> chomp(String str, String separator, Function0<Pair<String, String>> onMissingDelimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(onMissingDelimiter, "onMissingDelimiter");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, separator, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return onMissingDelimiter.invoke();
        }
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = str.substring(indexOf$default + separator.length());
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return TuplesKt.to(substring, substring2);
    }

    public static final String toLowerCasePreservingASCIIRules(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str2.charAt(i);
            if (toLowerCasePreservingASCII(charAt) != charAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str2, 0, i);
        int lastIndex = StringsKt.getLastIndex(str2);
        if (i <= lastIndex) {
            while (true) {
                sb.append(toLowerCasePreservingASCII(str.charAt(i)));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    public static final String toUpperCasePreservingASCIIRules(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = str;
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str2.charAt(i);
            if (toUpperCasePreservingASCII(charAt) != charAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str2, 0, i);
        int lastIndex = StringsKt.getLastIndex(str2);
        if (i <= lastIndex) {
            while (true) {
                sb.append(toUpperCasePreservingASCII(str.charAt(i)));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    private static final char toLowerCasePreservingASCII(char c) {
        return ('A' > c || c >= '[') ? (c < 0 || c >= 128) ? Character.toLowerCase(c) : c : (char) (c + ' ');
    }

    private static final char toUpperCasePreservingASCII(char c) {
        return ('a' > c || c >= '{') ? (c < 0 || c >= 128) ? Character.toLowerCase(c) : c : (char) (c - ' ');
    }

    public static final CaseInsensitiveString caseInsensitive(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new CaseInsensitiveString(str);
    }
}
