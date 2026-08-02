package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi34;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi24;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "", "startStylusHandwriting", "()V", "prepareStylusHandwritingDelegation", "acceptStylusHandwritingDelegation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
class ComposeInputMethodManagerImplApi34 extends androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi24 {
    public ComposeInputMethodManagerImplApi34(android.view.View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
        getHighResolutionOutputSizeshNQ4ISI().startStylusHandwriting(getCamera2StreamConfigurationMap());
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
        getHighResolutionOutputSizeshNQ4ISI().prepareStylusHandwritingDelegation(getCamera2StreamConfigurationMap());
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
        getHighResolutionOutputSizeshNQ4ISI().acceptStylusHandwritingDelegation(getCamera2StreamConfigurationMap());
    }
}
