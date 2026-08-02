package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "titlecaseImpl", "(C)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class _OneToManyTitlecaseMappingsKt {
    public static final java.lang.String titlecaseImpl(char c) {
        java.lang.String valueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
        java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (upperCase.length() <= 1) {
            return java.lang.String.valueOf(java.lang.Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(upperCase, "");
        java.lang.String substring = upperCase.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
        java.lang.String lowerCase = substring.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charAt);
        sb.append(lowerCase);
        return sb.toString();
    }
}
