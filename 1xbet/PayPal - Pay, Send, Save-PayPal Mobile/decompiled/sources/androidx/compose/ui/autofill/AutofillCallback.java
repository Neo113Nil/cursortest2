package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000f"}, d2 = {"Landroidx/compose/ui/autofill/AutofillCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "<init>", "()V", "Landroid/view/View;", "view", "", "virtualId", "event", "", "onAutofillEvent", "(Landroid/view/View;II)V", "Landroidx/compose/ui/autofill/AndroidAutofill;", "autofill", "register", "(Landroidx/compose/ui/autofill/AndroidAutofill;)V", "unregister"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutofillCallback extends android.view.autofill.AutofillManager.AutofillCallback {
    public static final androidx.compose.ui.autofill.AutofillCallback INSTANCE = new androidx.compose.ui.autofill.AutofillCallback();
    public static final int $stable = 8;

    private AutofillCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(android.view.View view, int virtualId, int event) {
        super.onAutofillEvent(view, virtualId, event);
    }

    public final void register(androidx.compose.ui.autofill.AndroidAutofill autofill) {
        autofill.getAutofillManager().registerCallback(this);
    }

    public final void unregister(androidx.compose.ui.autofill.AndroidAutofill autofill) {
        autofill.getAutofillManager().unregisterCallback(this);
    }
}
