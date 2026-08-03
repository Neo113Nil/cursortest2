package androidx.compose.ui.text.platform.extensions;

/* compiled from: LocaleExtensions.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "()V", "localeSpan", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setTextLocales", "", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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
            arrayList.add(androidx.compose.ui.text.platform.extensions.LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.text.style.LocaleSpan(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void setTextLocales(androidx.compose.ui.text.platform.AndroidTextPaint textPaint, androidx.compose.ui.text.intl.LocaleList localeList) {
        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(localeList2, 10));
        java.util.Iterator<androidx.compose.ui.text.intl.Locale> it = localeList2.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.compose.ui.text.platform.extensions.LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        textPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }
}
