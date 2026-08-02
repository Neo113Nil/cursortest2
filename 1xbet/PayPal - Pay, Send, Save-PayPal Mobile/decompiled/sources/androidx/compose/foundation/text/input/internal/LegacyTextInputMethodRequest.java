package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJU\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J5\u0010-\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R(\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010>\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010E\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010IR\"\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0K0J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010LR\u001b\u0010B\u001a\u00020M8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\b<\u0010OR$\u0010Q\u001a\u0004\u0018\u00010P8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u00107\u001a\u00020W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010X"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyTextInputMethodRequest;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "", "localToScreen", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManager", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "textInputNode", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttributes", "Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "getOutputMinFrameDuration", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getInputFormats", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getOutputFormats", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/platform/ViewConfiguration;", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/platform/ViewConfiguration;", "p0", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/ImeOptions;", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "Landroid/view/inputmethod/BaseInputConnection;", "Lkotlin/Lazy;", "()Landroid/view/inputmethod/BaseInputConnection;", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "getFocusedRect$foundation", "()Landroid/graphics/Rect;", "setFocusedRect$foundation", "(Landroid/graphics/Rect;)V", "Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;", "Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyTextInputMethodRequest implements androidx.compose.ui.platform.PlatformTextInputMethodRequest {
    public static final int $stable = 8;
    private android.graphics.Rect focusedRect;
    private final androidx.compose.foundation.text.input.internal.InputMethodManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoController getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.compose.ui.platform.ViewConfiguration getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.text.LegacyTextFieldState Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighResolutionOutputSizeshNQ4ISI;
    private final android.view.View view;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private androidx.compose.ui.text.input.TextFieldValue state = new androidx.compose.ui.text.input.TextFieldValue("", androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.ImeOptions getInputSizeshNQ4ISI = androidx.compose.ui.text.input.ImeOptions.INSTANCE.getDefault();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.List<java.lang.ref.WeakReference<androidx.compose.foundation.text.input.internal.RecordingInputConnection>> getOutputMinFrameDuration = new java.util.ArrayList();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.$r8$lambda$6HRoe4_Gt8HdqYaROehwHxxiIeI(androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this);
        }
    });

    public LegacyTextInputMethodRequest(android.view.View view, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> function1, androidx.compose.foundation.text.input.internal.InputMethodManager inputMethodManager) {
        this.view = view;
        this.getHighSpeedVideoFpsRangesFor = inputMethodManager;
        this.getInputFormats = new androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoController(function1, inputMethodManager);
    }

    public final android.view.View getView() {
        return this.view;
    }

    public final androidx.compose.ui.text.input.TextFieldValue getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.inputmethod.BaseInputConnection Camera2StreamConfigurationMap() {
        return (android.view.inputmethod.BaseInputConnection) this.getHighSpeedVideoSizesFor.getValue();
    }

    /* renamed from: getFocusedRect$foundation, reason: from getter */
    public final android.graphics.Rect getFocusedRect() {
        return this.focusedRect;
    }

    public final void setFocusedRect$foundation(android.graphics.Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode textInputNode, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit> onEditCommand, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
        this.state = value;
        this.getInputSizeshNQ4ISI = imeOptions;
        this.getHighSpeedVideoFpsRanges = onEditCommand;
        this.getHighSpeedVideoSizes = onImeActionPerformed;
        this.Camera2StreamConfigurationMap = textInputNode != null ? textInputNode.getLegacyTextFieldState() : null;
        this.getHighResolutionOutputSizeshNQ4ISI = textInputNode != null ? textInputNode.getTextFieldSelectionManager() : null;
        this.getOutputFormats = textInputNode != null ? textInputNode.getViewConfiguration() : null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final androidx.compose.foundation.text.input.internal.RecordingInputConnection createInputConnection(android.view.inputmethod.EditorInfo outAttributes) {
        androidx.compose.foundation.text.input.internal.EditorInfo_androidKt.m2222updatepLxbY9I$default(outAttributes, this.state.getText(), this.state.getSelection(), this.getInputSizeshNQ4ISI, null, 8, null);
        androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt.access$updateWithEmojiCompat(outAttributes);
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.state;
        boolean autoCorrect = this.getInputSizeshNQ4ISI.getAutoCorrect();
        androidx.compose.foundation.text.input.internal.RecordingInputConnection recordingInputConnection = new androidx.compose.foundation.text.input.internal.RecordingInputConnection(textFieldValue, new androidx.compose.foundation.text.input.internal.InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$createInputConnection$1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onEditCommands(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> editCommands) {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this.getHighSpeedVideoFpsRanges;
                function1.invoke(editCommands);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public final void mo2235onImeActionKlQnJC8(int imeAction) {
                kotlin.jvm.functions.Function1 function1;
                function1 = androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this.getHighSpeedVideoSizes;
                function1.invoke(androidx.compose.ui.text.input.ImeAction.m8198boximpl(imeAction));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onKeyEvent(android.view.KeyEvent event) {
                android.view.inputmethod.BaseInputConnection Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this.Camera2StreamConfigurationMap();
                Camera2StreamConfigurationMap.sendKeyEvent(event);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onRequestCursorAnchorInfo(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
                androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoController legacyCursorAnchorInfoController;
                legacyCursorAnchorInfoController = androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this.getInputFormats;
                legacyCursorAnchorInfoController.requestUpdate(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onConnectionClosed(androidx.compose.foundation.text.input.internal.RecordingInputConnection inputConnection) {
                java.util.List list;
                java.util.List list2;
                java.util.List list3;
                list = androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this.getOutputMinFrameDuration;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list2 = androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this.getOutputMinFrameDuration;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) list2.get(i)).get(), inputConnection)) {
                        list3 = androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.this.getOutputMinFrameDuration;
                        list3.remove(i);
                        return;
                    }
                }
            }
        }, autoCorrect, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats);
        this.getOutputMinFrameDuration.add(new java.lang.ref.WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final void updateState(androidx.compose.ui.text.input.TextFieldValue oldValue, androidx.compose.ui.text.input.TextFieldValue newValue) {
        boolean z = (androidx.compose.ui.text.TextRange.m8032equalsimpl0(this.state.getSelection(), newValue.getSelection()) && kotlin.jvm.internal.Intrinsics.areEqual(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.getOutputMinFrameDuration.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.text.input.internal.RecordingInputConnection recordingInputConnection = this.getOutputMinFrameDuration.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation(newValue);
            }
        }
        this.getInputFormats.invalidate();
        if (kotlin.jvm.internal.Intrinsics.areEqual(oldValue, newValue)) {
            if (z) {
                androidx.compose.foundation.text.input.internal.InputMethodManager inputMethodManager = this.getHighSpeedVideoFpsRangesFor;
                int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(newValue.getSelection());
                int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(newValue.getSelection());
                androidx.compose.ui.text.TextRange composition = this.state.getComposition();
                int m8037getMinimpl2 = composition != null ? androidx.compose.ui.text.TextRange.m8037getMinimpl(composition.getGetHighResolutionOutputSizeshNQ4ISI()) : -1;
                androidx.compose.ui.text.TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(m8037getMinimpl, m8036getMaximpl, m8037getMinimpl2, composition2 != null ? androidx.compose.ui.text.TextRange.m8036getMaximpl(composition2.getGetHighResolutionOutputSizeshNQ4ISI()) : -1);
                return;
            }
            return;
        }
        if (oldValue == null || (kotlin.jvm.internal.Intrinsics.areEqual(oldValue.getText(), newValue.getText()) && (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(oldValue.getSelection(), newValue.getSelection()) || kotlin.jvm.internal.Intrinsics.areEqual(oldValue.getComposition(), newValue.getComposition())))) {
            int size2 = this.getOutputMinFrameDuration.size();
            for (int i2 = 0; i2 < size2; i2++) {
                androidx.compose.foundation.text.input.internal.RecordingInputConnection recordingInputConnection2 = this.getOutputMinFrameDuration.get(i2).get();
                if (recordingInputConnection2 != null) {
                    recordingInputConnection2.updateInputState(this.state, this.getHighSpeedVideoFpsRangesFor);
                }
            }
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.restartInput();
    }

    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        android.graphics.Rect rect2;
        this.focusedRect = new android.graphics.Rect(kotlin.math.MathKt.roundToInt(rect.getLeft()), kotlin.math.MathKt.roundToInt(rect.getTop()), kotlin.math.MathKt.roundToInt(rect.getRight()), kotlin.math.MathKt.roundToInt(rect.getBottom()));
        if (!this.getOutputMinFrameDuration.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new android.graphics.Rect(rect2));
    }

    public final void updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        this.getInputFormats.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
    }

    public static /* synthetic */ android.view.inputmethod.BaseInputConnection $r8$lambda$6HRoe4_Gt8HdqYaROehwHxxiIeI(androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        return new android.view.inputmethod.BaseInputConnection(legacyTextInputMethodRequest.view, false);
    }
}
