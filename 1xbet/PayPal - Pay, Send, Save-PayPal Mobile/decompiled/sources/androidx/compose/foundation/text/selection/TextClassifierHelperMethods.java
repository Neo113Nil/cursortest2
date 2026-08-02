package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/text/selection/TextClassifierHelperMethods;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/text/selection/SelectedTextType;", "selectedTextType", "Landroid/view/textclassifier/TextClassifier;", "createTextClassificationSession", "(Landroid/content/Context;Landroidx/compose/foundation/text/selection/SelectedTextType;)Landroid/view/textclassifier/TextClassifier;", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "Landroid/os/LocaleList;", "toAndroidLocaleList", "(Landroidx/compose/ui/text/intl/LocaleList;)Landroid/os/LocaleList;", "Landroid/view/textclassifier/TextClassification;", "", "hasLegacyAssistItem$foundation", "(Landroid/view/textclassifier/TextClassification;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextClassifierHelperMethods {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.selection.TextClassifierHelperMethods INSTANCE = new androidx.compose.foundation.text.selection.TextClassifierHelperMethods();

    private TextClassifierHelperMethods() {
    }

    public final android.view.textclassifier.TextClassifier createTextClassificationSession(android.content.Context context, androidx.compose.foundation.text.selection.SelectedTextType selectedTextType) {
        java.lang.String str;
        android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) context.getSystemService(android.view.textclassifier.TextClassificationManager.class);
        int i = androidx.compose.foundation.text.selection.TextClassifierHelperMethods.WhenMappings.$EnumSwitchMapping$0[selectedTextType.ordinal()];
        if (i == 1) {
            str = "edittext";
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new android.view.textclassifier.TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public final android.os.LocaleList toAndroidLocaleList(androidx.compose.ui.text.intl.LocaleList localeList) {
        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(localeList2, 10));
        java.util.Iterator<androidx.compose.ui.text.intl.Locale> it = localeList2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
    }

    public final boolean hasLegacyAssistItem$foundation(android.view.textclassifier.TextClassification textClassification) {
        if (textClassification.getIcon() == null && android.text.TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.selection.SelectedTextType.values().length];
            try {
                iArr[androidx.compose.foundation.text.selection.SelectedTextType.EditableText.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.SelectedTextType.StaticText.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
