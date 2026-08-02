package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LocaleListHelper;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "", "setHintLocales", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/intl/LocaleList;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocaleListHelper {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.input.internal.LocaleListHelper INSTANCE = new androidx.compose.foundation.text.input.internal.LocaleListHelper();

    private LocaleListHelper() {
    }

    public final void setHintLocales(android.view.inputmethod.EditorInfo editorInfo, androidx.compose.ui.text.intl.LocaleList localeList) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(localeList, androidx.compose.ui.text.intl.LocaleList.INSTANCE.getEmpty())) {
            editorInfo.hintLocales = null;
            return;
        }
        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(localeList2, 10));
        java.util.Iterator<androidx.compose.ui.text.intl.Locale> it = localeList2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
    }
}
