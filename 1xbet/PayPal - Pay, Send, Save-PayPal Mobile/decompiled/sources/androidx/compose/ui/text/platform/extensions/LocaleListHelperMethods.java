package androidx.compose.ui.text.platform.extensions;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "<init>", "()V", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "localeSpan", "(Landroidx/compose/ui/text/intl/LocaleList;)Ljava/lang/Object;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "", "setTextLocales", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;Landroidx/compose/ui/text/intl/LocaleList;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocaleListHelperMethods {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods INSTANCE = new androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    public final java.lang.Object localeSpan(androidx.compose.ui.text.intl.LocaleList localeList) {
        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(localeList2, 10));
        java.util.Iterator<androidx.compose.ui.text.intl.Locale> it = localeList2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.text.style.LocaleSpan(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void setTextLocales(androidx.compose.ui.text.platform.AndroidTextPaint textPaint, androidx.compose.ui.text.intl.LocaleList localeList) {
        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(localeList2, 10));
        java.util.Iterator<androidx.compose.ui.text.intl.Locale> it = localeList2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        textPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }
}
