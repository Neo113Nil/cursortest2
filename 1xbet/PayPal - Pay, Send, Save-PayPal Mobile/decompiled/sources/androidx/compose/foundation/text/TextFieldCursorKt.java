package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "enabled", "cursor", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/graphics/Brush;Z)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldCursorKt {
    public static final androidx.compose.ui.Modifier cursor(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final androidx.compose.ui.text.input.OffsetMapping offsetMapping, final androidx.compose.ui.graphics.Brush brush, boolean z) {
        return z ? androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.TextFieldCursorKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.Brush.this, legacyTextFieldState, textFieldValue, offsetMapping, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.graphics.Brush brush, final androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier.Companion companion;
        composer.startReplaceGroup(-84507373);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-84507373, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
        }
        boolean booleanValue = ((java.lang.Boolean) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
        boolean changed = composer.changed(booleanValue);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.text.input.internal.CursorAnimationState(booleanValue);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.foundation.text.input.internal.CursorAnimationState cursorAnimationState = (androidx.compose.foundation.text.input.internal.CursorAnimationState) rememberedValue;
        boolean z = ((brush instanceof androidx.compose.ui.graphics.SolidColor) && ((androidx.compose.ui.graphics.SolidColor) brush).getValue() == 16) ? false : true;
        if (((androidx.compose.ui.platform.WindowInfo) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textFieldValue.getSelection()) && z) {
            composer.startReplaceGroup(-707487962);
            androidx.compose.ui.text.AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
            androidx.compose.ui.text.TextRange m8027boximpl = androidx.compose.ui.text.TextRange.m8027boximpl(textFieldValue.getSelection());
            boolean changedInstance = composer.changedInstance(cursorAnimationState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(annotatedString, m8027boximpl, (kotlin.jvm.functions.Function2) rememberedValue2, composer, 0);
            boolean changedInstance2 = composer.changedInstance(cursorAnimationState);
            boolean changedInstance3 = composer.changedInstance(offsetMapping);
            boolean changed2 = composer.changed(textFieldValue);
            boolean changedInstance4 = composer.changedInstance(legacyTextFieldState);
            boolean changed3 = composer.changed(brush);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changedInstance2 | changedInstance3 | changed2 | changedInstance4 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object obj = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.foundation.text.TextFieldCursorKt.getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.CursorAnimationState.this, offsetMapping, textFieldValue, legacyTextFieldState, brush, (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj2);
                        return highSpeedVideoSizes;
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            companion = androidx.compose.ui.draw.DrawModifierKt.drawWithContent(modifier, (kotlin.jvm.functions.Function1) rememberedValue3);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-705473241);
            composer.endReplaceGroup();
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return companion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.CursorAnimationState cursorAnimationState, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.geometry.Rect rect;
        float rint;
        androidx.compose.ui.text.TextLayoutResult value;
        contentDrawScope.drawContent();
        float cursorAlpha = cursorAnimationState.getCursorAlpha();
        if (cursorAlpha != 0.0f) {
            int originalToTransformed = offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(textFieldValue.getSelection()));
            androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast((float) java.lang.Math.floor(contentDrawScope.mo1418toPx0680j_4(androidx.compose.foundation.text.TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
            float f = coerceAtLeast / 2.0f;
            float coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(rect.getLeft() + f, java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) - f), f);
            if (((int) coerceAtLeast) % 2 == 1) {
                rint = ((float) java.lang.Math.floor(coerceAtLeast2)) + 0.5f;
            } else {
                rint = (float) java.lang.Math.rint(coerceAtLeast2);
            }
            float top = rect.getTop();
            androidx.compose.ui.graphics.drawscope.DrawScope.m6517drawLine1RTmtNc$default(contentDrawScope, brush, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(rint) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(rect.getBottom()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(rint) << 32)), coerceAtLeast, 0, null, cursorAlpha, null, 0, 432, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
