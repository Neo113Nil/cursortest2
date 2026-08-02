package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi27Helper;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/autofill/AutofillManager;", "autofillManager", "", "semanticsId", "", "isVisible", "", "notifyViewVisibilityChanged", "(Landroid/view/View;Landroid/view/autofill/AutofillManager;IZ)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutofillApi27Helper {
    public static final int $stable = 0;
    public static final androidx.compose.ui.autofill.AutofillApi27Helper INSTANCE = new androidx.compose.ui.autofill.AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    public final void notifyViewVisibilityChanged(android.view.View view, android.view.autofill.AutofillManager autofillManager, int semanticsId, boolean isVisible) {
        autofillManager.notifyViewVisibilityChanged(view, semanticsId, isVisible);
    }
}
