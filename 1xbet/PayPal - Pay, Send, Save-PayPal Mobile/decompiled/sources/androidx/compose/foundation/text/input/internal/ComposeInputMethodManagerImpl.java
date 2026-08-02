package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "Landroid/view/View;", "p0", "<init>", "(Landroid/view/View;)V", "", "restartInput", "()V", "showSoftInput", "hideSoftInput", "", "Landroid/view/inputmethod/ExtractedText;", "p1", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "p2", "p3", "updateSelection", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "startStylusHandwriting", "prepareStylusHandwritingDelegation", "acceptStylusHandwritingDelegation", "Landroid/view/inputmethod/InputMethodManager;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroid/view/inputmethod/InputMethodManager;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroid/view/View;", "getHighSpeedVideoFpsRangesFor", "()Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "getHighSpeedVideoFpsRanges", "Landroidx/core/view/SoftwareKeyboardControllerCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class ComposeInputMethodManagerImpl implements androidx.compose.foundation.text.input.internal.ComposeInputMethodManager {
    private final androidx.core.view.SoftwareKeyboardControllerCompat getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.view.inputmethod.InputMethodManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.view.View Camera2StreamConfigurationMap;

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
    }

    public ComposeInputMethodManagerImpl(android.view.View view) {
        this.Camera2StreamConfigurationMap = view;
        this.getHighSpeedVideoFpsRanges = new androidx.core.view.SoftwareKeyboardControllerCompat(view);
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    protected final android.view.View getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void restartInput() {
        getHighResolutionOutputSizeshNQ4ISI().restartInput(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void showSoftInput() {
        this.getHighSpeedVideoFpsRanges.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void hideSoftInput() {
        this.getHighSpeedVideoFpsRanges.hide();
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {
        getHighResolutionOutputSizeshNQ4ISI().updateExtractedText(this.Camera2StreamConfigurationMap, p0, p1);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateSelection(int p0, int p1, int p2, int p3) {
        getHighResolutionOutputSizeshNQ4ISI().updateSelection(this.Camera2StreamConfigurationMap, p0, p1, p2, p3);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {
        getHighResolutionOutputSizeshNQ4ISI().updateCursorAnchorInfo(this.Camera2StreamConfigurationMap, p0);
    }

    protected final android.view.inputmethod.InputMethodManager getHighResolutionOutputSizeshNQ4ISI() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.getHighSpeedVideoSizes;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        android.view.inputmethod.InputMethodManager Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        return Camera2StreamConfigurationMap;
    }

    private final android.view.inputmethod.InputMethodManager Camera2StreamConfigurationMap() {
        java.lang.Object systemService = this.Camera2StreamConfigurationMap.getContext().getSystemService("input_method");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }
}
