package kotlin.text;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001a\u0019\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"", "", "isWhitespace", "(C)Z", "Ljava/util/Locale;", "locale", "", "uppercase", "(CLjava/util/Locale;)Ljava/lang/String;", "lowercase", "titlecase", "char", "", "radix", "digitOf", "(CI)I", "checkRadix", "(I)I", "Lkotlin/text/CharCategory;", "getCategory", "(C)Lkotlin/text/CharCategory;", "category", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "directionality"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class CharsKt__CharJVMKt {
    public static final kotlin.text.CharCategory getCategory(char c) {
        return kotlin.text.CharCategory.INSTANCE.valueOf(java.lang.Character.getType(c));
    }

    public static final boolean isWhitespace(char c) {
        return java.lang.Character.isWhitespace(c) || java.lang.Character.isSpaceChar(c);
    }

    public static final java.lang.String uppercase(char c, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String valueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
        java.lang.String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final java.lang.String lowercase(char c, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String valueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
        java.lang.String lowerCase = valueOf.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final java.lang.String titlecase(char c, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String uppercase = kotlin.text.CharsKt.uppercase(c, locale);
        if (uppercase.length() <= 1) {
            java.lang.String valueOf = java.lang.String.valueOf(c);
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
            java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(uppercase, upperCase)) {
                return java.lang.String.valueOf(java.lang.Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char charAt = uppercase.charAt(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(uppercase, "");
            java.lang.String substring = uppercase.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
            java.lang.String lowerCase = substring.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(charAt);
            sb.append(lowerCase);
            return sb.toString();
        }
        return uppercase;
    }

    public static final kotlin.text.CharDirectionality getDirectionality(char c) {
        return kotlin.text.CharDirectionality.INSTANCE.valueOf(java.lang.Character.getDirectionality(c));
    }

    public static final int digitOf(char c, int i) {
        return java.lang.Character.digit((int) c, i);
    }

    @kotlin.IgnorableReturnValue
    public static final int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new kotlin.ranges.IntRange(2, 36));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
