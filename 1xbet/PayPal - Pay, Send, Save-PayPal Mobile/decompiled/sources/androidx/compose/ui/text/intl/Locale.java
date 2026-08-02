package androidx.compose.ui.text.intl;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u000bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/getHighSpeedVideoSizes;", "platformLocale", "<init>", "(Ljava/util/Locale;)V", "", "languageTag", "(Ljava/lang/String;)V", "toLanguageTag", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Locale;", "getPlatformLocale", "()Ljava/util/Locale;", "getLanguage", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "getScript", "script", "getRegion", "region", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Locale {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.intl.Locale.Companion INSTANCE = new androidx.compose.ui.text.intl.Locale.Companion(null);
    private final java.util.Locale platformLocale;

    public Locale(java.util.Locale locale) {
        this.platformLocale = locale;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.intl.Locale getCurrent() {
            return androidx.compose.ui.text.intl.PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.util.Locale getPlatformLocale() {
        return this.platformLocale;
    }

    public Locale(java.lang.String str) {
        this(androidx.compose.ui.text.intl.PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }

    public final java.lang.String getLanguage() {
        return androidx.compose.ui.text.intl.PlatformLocale_jvmKt.getLanguage(this.platformLocale);
    }

    public final java.lang.String getScript() {
        return androidx.compose.ui.text.intl.PlatformLocale_jvmKt.getScript(this.platformLocale);
    }

    public final java.lang.String getRegion() {
        return androidx.compose.ui.text.intl.PlatformLocale_jvmKt.getRegion(this.platformLocale);
    }

    public final java.lang.String toLanguageTag() {
        return androidx.compose.ui.text.intl.PlatformLocale_jvmKt.getLanguageTag(this.platformLocale);
    }

    public final boolean equals(java.lang.Object other) {
        if (other == null || !(other instanceof androidx.compose.ui.text.intl.Locale)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(toLanguageTag(), ((androidx.compose.ui.text.intl.Locale) other).toLanguageTag());
    }

    public final int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final java.lang.String toString() {
        return toLanguageTag();
    }
}
