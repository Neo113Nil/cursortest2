package androidx.compose.ui.text.input;

@kotlin.Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b \u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010&"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "", "restartInput", "()V", "showSoftInput", "hideSoftInput", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "getHighSpeedVideoFpsRanges", "Landroid/view/View;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/inputmethod/InputMethodManager;", "Lkotlin/Lazy;", "()Landroid/view/inputmethod/InputMethodManager;", "getHighSpeedVideoFpsRangesFor", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements androidx.compose.ui.text.input.InputMethodManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final android.view.inputmethod.InputMethodManager invoke() {
            android.view.View view;
            view = androidx.compose.ui.text.input.InputMethodManagerImpl.this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object systemService = view.getContext().getSystemService("input_method");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }

        {
            super(0);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.core.view.SoftwareKeyboardControllerCompat getHighSpeedVideoSizes;

    public InputMethodManagerImpl(android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        this.getHighSpeedVideoSizes = new androidx.core.view.SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getHighResolutionOutputSizeshNQ4ISI() {
        return (android.view.inputmethod.InputMethodManager) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final boolean isActive() {
        return getHighResolutionOutputSizeshNQ4ISI().isActive(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void restartInput() {
        getHighResolutionOutputSizeshNQ4ISI().restartInput(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void showSoftInput() {
        this.getHighSpeedVideoSizes.show();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void hideSoftInput() {
        this.getHighSpeedVideoSizes.hide();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void updateExtractedText(int token, android.view.inputmethod.ExtractedText extractedText) {
        getHighResolutionOutputSizeshNQ4ISI().updateExtractedText(this.getHighResolutionOutputSizeshNQ4ISI, token, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void updateSelection(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        getHighResolutionOutputSizeshNQ4ISI().updateSelection(this.getHighResolutionOutputSizeshNQ4ISI, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo cursorAnchorInfo) {
        getHighResolutionOutputSizeshNQ4ISI().updateCursorAnchorInfo(this.getHighResolutionOutputSizeshNQ4ISI, cursorAnchorInfo);
    }
}
