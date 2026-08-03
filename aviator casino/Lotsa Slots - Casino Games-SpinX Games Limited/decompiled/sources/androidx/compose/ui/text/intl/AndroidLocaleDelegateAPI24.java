package androidx.compose.ui.text.intl;

/* compiled from: AndroidLocaleDelegate.android.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "()V", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "lastLocaleList", "lastPlatformLocaleList", "Landroid/os/LocaleList;", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "parseLanguageTag", "Landroidx/compose/ui/text/intl/PlatformLocale;", "languageTag", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI24 implements androidx.compose.ui.text.intl.PlatformLocaleDelegate {
    public static final int $stable = 8;
    private androidx.compose.ui.text.intl.LocaleList lastLocaleList;
    private android.os.LocaleList lastPlatformLocaleList;
    private final androidx.compose.ui.text.platform.SynchronizedObject lock = androidx.compose.ui.text.platform.Synchronization_jvmKt.createSynchronizedObject();

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public androidx.compose.ui.text.intl.LocaleList getCurrent() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.lock) {
            androidx.compose.ui.text.intl.LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new androidx.compose.ui.text.intl.Locale(new androidx.compose.ui.text.intl.AndroidLocale(localeList.get(i))));
            }
            androidx.compose.ui.text.intl.LocaleList localeList3 = new androidx.compose.ui.text.intl.LocaleList(arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public androidx.compose.ui.text.intl.PlatformLocale parseLanguageTag(java.lang.String languageTag) {
        return new androidx.compose.ui.text.intl.AndroidLocale(java.util.Locale.forLanguageTag(languageTag));
    }
}
