package androidx.compose.ui.text.intl;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "<init>", "()V", "", "languageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/getHighSpeedVideoSizes;", "parseLanguageTag", "(Ljava/lang/String;)Ljava/util/Locale;", "Landroid/os/LocaleList;", "getHighSpeedVideoSizes", "Landroid/os/LocaleList;", "Landroidx/compose/ui/text/intl/LocaleList;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/intl/LocaleList;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLocaleDelegateAPI24 implements androidx.compose.ui.text.intl.PlatformLocaleDelegate {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.platform.SynchronizedObject getHighSpeedVideoFpsRanges = new androidx.compose.ui.text.platform.SynchronizedObject();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.text.intl.LocaleList Camera2StreamConfigurationMap;
    private android.os.LocaleList getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public final androidx.compose.ui.text.intl.LocaleList getCurrent() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.getHighSpeedVideoFpsRanges) {
            androidx.compose.ui.text.intl.LocaleList localeList2 = this.Camera2StreamConfigurationMap;
            if (localeList2 != null && localeList == this.getHighSpeedVideoSizes) {
                return localeList2;
            }
            int size = localeList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new androidx.compose.ui.text.intl.Locale(localeList.get(i)));
            }
            androidx.compose.ui.text.intl.LocaleList localeList3 = new androidx.compose.ui.text.intl.LocaleList(arrayList);
            this.getHighSpeedVideoSizes = localeList;
            this.Camera2StreamConfigurationMap = localeList3;
            return localeList3;
        }
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
