package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function1;", "", "onValueChange", "", "editable", "singleLine", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "textFieldKeyInput-2WJ9YEU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;I)Landroidx/compose/ui/Modifier;", "textFieldKeyInput"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldKeyInputKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes() {
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m2123textFieldKeyInput2WJ9YEU(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function1, final boolean z, final boolean z2, final androidx.compose.ui.text.input.OffsetMapping offsetMapping, final androidx.compose.foundation.text.UndoManager undoManager, final int i) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.TextFieldKeyInputKt.getHighSpeedVideoSizes(androidx.compose.foundation.text.LegacyTextFieldState.this, textFieldSelectionManager, textFieldValue, z, z2, offsetMapping, undoManager, function1, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoSizes;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighSpeedVideoSizes(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, boolean z, boolean z2, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.UndoManager undoManager, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        composer.startReplaceGroup(851809892);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(851809892, i2, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:255)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.text.selection.TextPreparedSelectionState();
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState = (androidx.compose.foundation.text.selection.TextPreparedSelectionState) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.foundation.text.DeadKeyCombiner();
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.foundation.text.TextFieldKeyInput textFieldKeyInput = new androidx.compose.foundation.text.TextFieldKeyInput(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, (androidx.compose.foundation.text.DeadKeyCombiner) rememberedValue2, null, function1, i, 512, null);
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        boolean changedInstance = composer.changedInstance(textFieldKeyInput);
        androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1$1 rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1$1(textFieldKeyInput);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.ui.Modifier onKeyEvent = androidx.compose.ui.input.key.KeyInputModifierKt.onKeyEvent(companion, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return onKeyEvent;
    }
}
