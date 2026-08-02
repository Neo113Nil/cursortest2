package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api34StartStylusHandwriting;", "", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroid/view/View;", "view", "", "startStylusHandwriting", "(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api34StartStylusHandwriting {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.input.internal.Api34StartStylusHandwriting INSTANCE = new androidx.compose.foundation.text.input.internal.Api34StartStylusHandwriting();

    private Api34StartStylusHandwriting() {
    }

    public final void startStylusHandwriting(android.view.inputmethod.InputMethodManager imm, android.view.View view) {
        imm.startStylusHandwriting(view);
    }
}
