package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J)\u0010'\u001a\u00020\u00052\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00050#¢\u0006\u0002\b%H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b)\u0010\"J\u0018\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b/\u0010-R\u0014\u00104\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "Landroid/view/KeyEvent;", "keyEvent", "", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroidx/compose/foundation/content/TransferableContent;", "transferableContent", "", "onCommitContent", "(Landroidx/compose/foundation/content/TransferableContent;)Z", "", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "isInTouchMode", "updateTouchMode", "(Z)V", "beginBatchEdit", "()Z", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Lkotlin/ExtensionFunctionType;", "block", "edit", "(Lkotlin/jvm/functions/Function1;)V", "endBatchEdit", "Landroidx/compose/ui/text/TextRange;", "range", "mapFromTransformed-GEjPoXI", "(J)J", "mapFromTransformed", "mapToTransformed-GEjPoXI", "mapToTransformed", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "text", "getTransformedLength", "()I", "transformedLength"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 implements androidx.compose.foundation.text.input.internal.TextInputSession, androidx.compose.foundation.text.input.internal.ImeEditCommandScope {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.DefaultImeEditCommandScope Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.CursorAnchorInfoController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextLayoutState getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.ComposeInputMethodManager getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.ui.platform.ViewConfiguration getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.content.internal.ReceiveContentConfiguration getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TransformedTextFieldState getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;
    private final /* synthetic */ androidx.compose.foundation.text.input.internal.DefaultImeEditCommandScope getOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(androidx.compose.foundation.text.input.internal.DefaultImeEditCommandScope defaultImeEditCommandScope, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1, androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration, androidx.compose.foundation.text.input.internal.CursorAnchorInfoController cursorAnchorInfoController, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12) {
        this.Camera2StreamConfigurationMap = defaultImeEditCommandScope;
        this.getOutputFormats = transformedTextFieldState;
        this.getHighSpeedVideoSizes = composeInputMethodManager;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getInputFormats = receiveContentConfiguration;
        this.getHighResolutionOutputSizeshNQ4ISI = cursorAnchorInfoController;
        this.getHighSpeedVideoFpsRanges = textLayoutState;
        this.getOutputMinFrameDuration = function0;
        this.getHighSpeedVideoSizesFor = viewConfiguration;
        this.getInputSizeshNQ4ISI = function12;
        this.getOutputSizeshNQ4ISI = defaultImeEditCommandScope;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public final androidx.compose.foundation.text.input.TextFieldCharSequence getText() {
        return this.getOutputFormats.getVisualText();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final int getTransformedLength() {
        return this.Camera2StreamConfigurationMap.getTransformedLength();
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public final void sendKeyEvent(android.view.KeyEvent keyEvent) {
        this.getHighSpeedVideoSizes.sendKeyEvent(keyEvent);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    public final void mo2208onImeActionKlQnJC8(int imeAction) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.text.input.ImeAction, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (function1 != null) {
            function1.invoke(androidx.compose.ui.text.input.ImeAction.m8198boximpl(imeAction));
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public final boolean onCommitContent(androidx.compose.foundation.content.TransferableContent transferableContent) {
        androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration = this.getInputFormats;
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.onCommitContent(transferableContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public final void requestCursorUpdates(int cursorUpdateMode) {
        this.getHighResolutionOutputSizeshNQ4ISI.requestUpdates(cursorUpdateMode);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public final int performHandwritingGesture(android.view.inputmethod.HandwritingGesture gesture) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation(this.getOutputFormats, gesture, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
        }
        return 2;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture gesture, android.os.CancellationSignal cancellationSignal) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation(this.getOutputFormats, gesture, this.getHighSpeedVideoFpsRanges, cancellationSignal);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public final void updateTouchMode(boolean isInTouchMode) {
        this.getInputSizeshNQ4ISI.invoke(java.lang.Boolean.valueOf(isInTouchMode));
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long mo2207mapToTransformedGEjPoXI(long range) {
        return this.getOutputSizeshNQ4ISI.mo2207mapToTransformedGEjPoXI(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long mo2206mapFromTransformedGEjPoXI(long range) {
        return this.getOutputSizeshNQ4ISI.mo2206mapFromTransformedGEjPoXI(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final boolean endBatchEdit() {
        return this.getOutputSizeshNQ4ISI.endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final void edit(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.TextFieldBuffer, kotlin.Unit> block) {
        this.getOutputSizeshNQ4ISI.edit(block);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final boolean beginBatchEdit() {
        return this.getOutputSizeshNQ4ISI.beginBatchEdit();
    }
}
