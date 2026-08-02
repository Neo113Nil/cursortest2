package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "Landroid/view/KeyEvent;", "", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroid/view/inputmethod/BaseInputConnection;", "getHighSpeedVideoSizes", "Landroid/view/inputmethod/BaseInputConnection;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
class ComposeInputMethodManagerImplApi21 extends androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.view.inputmethod.BaseInputConnection getHighResolutionOutputSizeshNQ4ISI;

    public ComposeInputMethodManagerImplApi21(android.view.View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(android.view.KeyEvent p0) {
        android.view.inputmethod.BaseInputConnection baseInputConnection = this.getHighResolutionOutputSizeshNQ4ISI;
        if (baseInputConnection == null) {
            baseInputConnection = new android.view.inputmethod.BaseInputConnection(getCamera2StreamConfigurationMap(), false);
            this.getHighResolutionOutputSizeshNQ4ISI = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(p0);
    }
}
