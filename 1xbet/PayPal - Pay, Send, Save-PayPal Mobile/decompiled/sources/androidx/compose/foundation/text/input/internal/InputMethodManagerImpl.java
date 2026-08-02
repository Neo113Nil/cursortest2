package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020!8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/foundation/text/input/internal/InputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "", "restartInput", "()V", "showSoftInput", "hideSoftInput", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "startStylusHandwriting", "getHighSpeedVideoSizes", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "()Landroid/view/inputmethod/InputMethodManager;", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "getHighSpeedVideoFpsRanges", "Landroidx/core/view/SoftwareKeyboardControllerCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InputMethodManagerImpl implements androidx.compose.foundation.text.input.internal.InputMethodManager {
    public static final int $stable = 8;
    private final androidx.core.view.SoftwareKeyboardControllerCompat getHighSpeedVideoFpsRanges;
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.InputMethodManagerImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.foundation.text.input.internal.InputMethodManagerImpl.$r8$lambda$qDKzEDjgALcAYesM4UJqxJCaKKc(androidx.compose.foundation.text.input.internal.InputMethodManagerImpl.this);
        }
    });
    private final android.view.View getHighSpeedVideoSizes;

    public InputMethodManagerImpl(android.view.View view) {
        this.getHighSpeedVideoSizes = view;
        this.getHighSpeedVideoFpsRanges = new androidx.core.view.SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getHighSpeedVideoSizes() {
        return (android.view.inputmethod.InputMethodManager) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final boolean isActive() {
        return getHighSpeedVideoSizes().isActive(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void restartInput() {
        getHighSpeedVideoSizes().restartInput(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void showSoftInput() {
        this.getHighSpeedVideoFpsRanges.show();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void hideSoftInput() {
        this.getHighSpeedVideoFpsRanges.hide();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void updateExtractedText(int token, android.view.inputmethod.ExtractedText extractedText) {
        getHighSpeedVideoSizes().updateExtractedText(this.getHighSpeedVideoSizes, token, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void updateSelection(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        getHighSpeedVideoSizes().updateSelection(this.getHighSpeedVideoSizes, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo cursorAnchorInfo) {
        getHighSpeedVideoSizes().updateCursorAnchorInfo(this.getHighSpeedVideoSizes, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void startStylusHandwriting() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.compose.foundation.text.input.internal.Api34StartStylusHandwriting.INSTANCE.startStylusHandwriting(getHighSpeedVideoSizes(), this.getHighSpeedVideoSizes);
        }
    }

    public static /* synthetic */ android.view.inputmethod.InputMethodManager $r8$lambda$qDKzEDjgALcAYesM4UJqxJCaKKc(androidx.compose.foundation.text.input.internal.InputMethodManagerImpl inputMethodManagerImpl) {
        java.lang.Object systemService = inputMethodManagerImpl.getHighSpeedVideoSizes.getContext().getSystemService("input_method");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }
}
