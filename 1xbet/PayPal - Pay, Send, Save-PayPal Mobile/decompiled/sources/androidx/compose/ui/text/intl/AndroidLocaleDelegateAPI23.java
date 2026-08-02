package androidx.compose.ui.text.intl;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI23;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "<init>", "()V", "", "languageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/getHighSpeedVideoSizes;", "parseLanguageTag", "(Ljava/lang/String;)Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLocaleDelegateAPI23 implements androidx.compose.ui.text.intl.PlatformLocaleDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public final androidx.compose.ui.text.intl.LocaleList getCurrent() {
        return new androidx.compose.ui.text.intl.LocaleList((java.util.List<androidx.compose.ui.text.intl.Locale>) kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.text.intl.Locale(java.util.Locale.getDefault())));
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public final java.util.Locale parseLanguageTag(java.lang.String languageTag) {
        java.lang.String unused;
        java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(languageTag);
        if (kotlin.jvm.internal.Intrinsics.areEqual(forLanguageTag.toLanguageTag(), androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            unused = androidx.compose.ui.text.intl.AndroidLocaleDelegate_androidKt.Camera2StreamConfigurationMap;
        }
        return forLanguageTag;
    }
}
