package androidx.compose.ui.text.platform;

/* compiled from: AndroidStringDelegate.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", "string", "locale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidStringDelegate implements androidx.compose.ui.text.PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public java.lang.String toUpperCase(java.lang.String string, androidx.compose.ui.text.intl.PlatformLocale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        java.lang.String upperCase = string.toUpperCase(((androidx.compose.ui.text.intl.AndroidLocale) locale).getJavaLocale());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public java.lang.String toLowerCase(java.lang.String string, androidx.compose.ui.text.intl.PlatformLocale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        java.lang.String lowerCase = string.toLowerCase(((androidx.compose.ui.text.intl.AndroidLocale) locale).getJavaLocale());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public java.lang.String capitalize(java.lang.String string, androidx.compose.ui.text.intl.PlatformLocale locale) {
        java.lang.String valueOf;
        if (string.length() <= 0) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char charAt = string.charAt(0);
        if (java.lang.Character.isLowerCase(charAt)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            valueOf = kotlin.text.CharsKt.titlecase(charAt, ((androidx.compose.ui.text.intl.AndroidLocale) locale).getJavaLocale());
        } else {
            valueOf = java.lang.String.valueOf(charAt);
        }
        sb.append((java.lang.Object) valueOf);
        java.lang.String substring = string.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public java.lang.String decapitalize(java.lang.String string, androidx.compose.ui.text.intl.PlatformLocale locale) {
        if (string.length() <= 0) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char charAt = string.charAt(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        sb.append((java.lang.Object) kotlin.text.CharsKt.lowercase(charAt, ((androidx.compose.ui.text.intl.AndroidLocale) locale).getJavaLocale()));
        java.lang.String substring = string.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }
}
