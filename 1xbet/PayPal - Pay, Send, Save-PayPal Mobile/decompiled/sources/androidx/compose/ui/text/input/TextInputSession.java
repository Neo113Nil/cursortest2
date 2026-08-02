package androidx.compose.ui.text.input;

@kotlin.Deprecated(message = "Use PlatformTextInputModifierNode instead.")
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\r¢\u0006\u0004\b#\u0010\"R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b*\u0010\""}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "", "dispose", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)Z", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Z", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)Z", "showSoftwareKeyboard", "()Z", "hideSoftwareKeyboard", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/input/TextInputService;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "getHighResolutionOutputSizeshNQ4ISI", "isOpen"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputSession {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.TextInputService getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.text.input.PlatformTextInputService getHighResolutionOutputSizeshNQ4ISI;

    public TextInputSession(androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.ui.text.input.PlatformTextInputService platformTextInputService) {
        this.getHighSpeedVideoSizes = textInputService;
        this.getHighResolutionOutputSizeshNQ4ISI = platformTextInputService;
    }

    public final boolean isOpen() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes.getCurrentInputSession$ui_text(), this);
    }

    public final void dispose() {
        this.getHighSpeedVideoSizes.stopInput(this);
    }

    public final boolean notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.getHighResolutionOutputSizeshNQ4ISI.notifyFocusedRect(rect);
        }
        return isOpen;
    }

    public final boolean updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> textFieldToRootTransform, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.getHighResolutionOutputSizeshNQ4ISI.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
        }
        return isOpen;
    }

    public final boolean updateState(androidx.compose.ui.text.input.TextFieldValue oldValue, androidx.compose.ui.text.input.TextFieldValue newValue) {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.getHighResolutionOutputSizeshNQ4ISI.updateState(oldValue, newValue);
        }
        return isOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.getHighResolutionOutputSizeshNQ4ISI.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean hideSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.getHighResolutionOutputSizeshNQ4ISI.hideSoftwareKeyboard();
        }
        return isOpen;
    }
}
