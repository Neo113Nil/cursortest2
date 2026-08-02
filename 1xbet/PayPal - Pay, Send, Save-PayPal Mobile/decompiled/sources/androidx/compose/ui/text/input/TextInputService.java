package androidx.compose.ui.text.input;

@kotlin.Deprecated(message = "Use PlatformTextInputModifierNode instead.")
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR(\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001dj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/TextInputSession;", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;", "()V", "session", "stopInput", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "showSoftwareKeyboard", "hideSoftwareKeyboard", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/getHighResolutionOutputSizeshNQ4ISI;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicReference;", "getCurrentInputSession$ui_text", "()Landroidx/compose/ui/text/input/TextInputSession;", "currentInputSession"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class TextInputService {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.text.input.TextInputSession> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.PlatformTextInputService getHighSpeedVideoFpsRanges;

    public TextInputService(androidx.compose.ui.text.input.PlatformTextInputService platformTextInputService) {
        this.getHighSpeedVideoFpsRanges = platformTextInputService;
    }

    public final androidx.compose.ui.text.input.TextInputSession getCurrentInputSession$ui_text() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get();
    }

    public androidx.compose.ui.text.input.TextInputSession startInput(androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit> onEditCommand, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
        this.getHighSpeedVideoFpsRanges.startInput(value, imeOptions, onEditCommand, onImeActionPerformed);
        androidx.compose.ui.text.input.TextInputSession textInputSession = new androidx.compose.ui.text.input.TextInputSession(this, this.getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI.set(textInputSession);
        return textInputSession;
    }

    public final void startInput() {
        this.getHighSpeedVideoFpsRanges.startInput();
        this.getHighResolutionOutputSizeshNQ4ISI.set(new androidx.compose.ui.text.input.TextInputSession(this, this.getHighSpeedVideoFpsRanges));
    }

    public void stopInput(androidx.compose.ui.text.input.TextInputSession session) {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, session, null)) {
            this.getHighSpeedVideoFpsRanges.stopInput();
        }
    }

    public final void stopInput() {
        this.getHighResolutionOutputSizeshNQ4ISI.set(null);
        this.getHighSpeedVideoFpsRanges.stopInput();
    }

    @kotlin.Deprecated(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @kotlin.ReplaceWith(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text() != null) {
            this.getHighSpeedVideoFpsRanges.showSoftwareKeyboard();
        }
    }

    @kotlin.Deprecated(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @kotlin.ReplaceWith(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void hideSoftwareKeyboard() {
        this.getHighSpeedVideoFpsRanges.hideSoftwareKeyboard();
    }
}
