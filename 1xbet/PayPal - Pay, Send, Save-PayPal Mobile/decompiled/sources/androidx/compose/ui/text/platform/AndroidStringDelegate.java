package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\r\u0010\n"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "<init>", "()V", "", "string", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/getHighSpeedVideoSizes;", "locale", "toUpperCase", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "toLowerCase", "capitalize", "decapitalize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidStringDelegate implements androidx.compose.ui.text.PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final java.lang.String toUpperCase(java.lang.String string, java.util.Locale locale) {
        java.lang.String upperCase = string.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final java.lang.String toLowerCase(java.lang.String string, java.util.Locale locale) {
        java.lang.String lowerCase = string.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final java.lang.String capitalize(java.lang.String string, java.util.Locale locale) {
        if (string.length() <= 0) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char charAt = string.charAt(0);
        sb.append((java.lang.Object) (java.lang.Character.isLowerCase(charAt) ? kotlin.text.CharsKt.titlecase(charAt, locale) : java.lang.String.valueOf(charAt)));
        java.lang.String substring = string.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        sb.append(substring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public final java.lang.String decapitalize(java.lang.String string, java.util.Locale locale) {
        if (string.length() <= 0) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) kotlin.text.CharsKt.lowercase(string.charAt(0), locale));
        java.lang.String substring = string.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        sb.append(substring);
        return sb.toString();
    }
}
