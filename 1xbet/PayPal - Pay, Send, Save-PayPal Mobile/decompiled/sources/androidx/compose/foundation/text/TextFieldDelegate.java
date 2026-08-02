package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.TextFieldDelegate.Companion INSTANCE = new androidx.compose.foundation.text.TextFieldDelegate.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)JG\u00100\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b0\u00101J/\u00104\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u0006\u00102\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u000203H\u0001¢\u0006\u0004\b4\u00105JC\u0010>\u001a\u00020\u001f2\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010:\u001a\u0002092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0;2\b\u0010=\u001a\u0004\u0018\u00010,H\u0001¢\u0006\u0004\b>\u0010?JC\u0010D\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020@2\u0006\u0010\u001a\u001a\u0002032\u0006\u0010:\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0;H\u0001¢\u0006\u0004\bB\u0010CJW\u0010K\u001a\u00020,2\u0006\u0010F\u001a\u00020E2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010:\u001a\u0002092\u0006\u0010H\u001a\u00020G2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0;2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u001f0;H\u0001¢\u0006\u0004\bK\u0010LJW\u0010M\u001a\u00020,2\u0006\u0010F\u001a\u00020E2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010:\u001a\u0002092\u0006\u0010H\u001a\u00020G2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0;2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u001f0;H\u0001¢\u0006\u0004\bM\u0010LJ3\u0010N\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u0006\u0010:\u001a\u0002092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0;H\u0001¢\u0006\u0004\bN\u0010OJ\u001d\u0010U\u001a\u00020Q2\u0006\u0010P\u001a\u00020\u00152\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010T"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResultText", "Lkotlin/Triple;", "", "layout-_EkL_-Y$foundation", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/TextRange;", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "textLayoutResult", "Landroidx/compose/ui/graphics/Paint;", "highlightPaint", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "", "draw-Q1vqE60$foundation", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;JJLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;J)V", "draw", "p0", "p1", "p2", "p3", "p4", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "hasFocus", "notifyFocusedRect$foundation", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V", "textFieldValue", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "updateTextLayoutResult$foundation", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "ops", "Landroidx/compose/ui/text/input/EditProcessor;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "onEditCommand$foundation", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextInputSession;)V", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "setCursorOffset-ULxng0E$foundation", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V", "setCursorOffset", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "restartInput$foundation", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;", "onFocus$foundation", "onBlur$foundation", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;)V", "compositionRange", "Landroidx/compose/ui/text/input/TransformedText;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "applyCompositionDecoration"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: layout-_EkL_-Y$foundation$default, reason: not valid java name */
        public static /* synthetic */ kotlin.Triple m2109layout_EkL_Y$foundation$default(androidx.compose.foundation.text.TextFieldDelegate.Companion companion, androidx.compose.foundation.text.TextDelegate textDelegate, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m2112layout_EkL_Y$foundation(textDelegate, j, layoutDirection, textLayoutResult);
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: layout-_EkL_-Y$foundation, reason: not valid java name */
        public final kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m2112layout_EkL_Y$foundation(androidx.compose.foundation.text.TextDelegate textDelegate, long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextLayoutResult prevResultText) {
            androidx.compose.ui.text.TextLayoutResult m2100layoutNN6EwU = textDelegate.m2100layoutNN6EwU(constraints, layoutDirection, prevResultText);
            return new kotlin.Triple<>(java.lang.Integer.valueOf((int) (m2100layoutNN6EwU.getSize() >> 32)), java.lang.Integer.valueOf((int) (m2100layoutNN6EwU.getSize() & 4294967295L)), m2100layoutNN6EwU);
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: draw-Q1vqE60$foundation, reason: not valid java name */
        public final void m2111drawQ1vqE60$foundation(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.text.input.TextFieldValue value, long selectionPreviewHighlightRange, long deletionPreviewHighlightRange, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.graphics.Paint highlightPaint, long selectionBackgroundColor) {
            if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(selectionPreviewHighlightRange)) {
                highlightPaint.mo5873setColor8_81llA(selectionBackgroundColor);
                getHighSpeedVideoFpsRanges(canvas, selectionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(deletionPreviewHighlightRange)) {
                androidx.compose.ui.graphics.Color m5986boximpl = androidx.compose.ui.graphics.Color.m5986boximpl(textLayoutResult.getLayoutInput().getStyle().m8069getColor0d7_KjU());
                if (m5986boximpl.m6006unboximpl() == 16) {
                    m5986boximpl = null;
                }
                long m6006unboximpl = m5986boximpl != null ? m5986boximpl.m6006unboximpl() : androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
                highlightPaint.mo5873setColor8_81llA(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m6006unboximpl, androidx.compose.ui.graphics.Color.m5998getAlphaimpl(m6006unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                getHighSpeedVideoFpsRanges(canvas, deletionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(value.getSelection())) {
                highlightPaint.mo5873setColor8_81llA(selectionBackgroundColor);
                getHighSpeedVideoFpsRanges(canvas, value.getSelection(), offsetMapping, textLayoutResult, highlightPaint);
            }
            androidx.compose.ui.text.TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        private static void getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.Canvas p0, long p1, androidx.compose.ui.text.input.OffsetMapping p2, androidx.compose.ui.text.TextLayoutResult p3, androidx.compose.ui.graphics.Paint p4) {
            int originalToTransformed = p2.originalToTransformed(androidx.compose.ui.text.TextRange.m8037getMinimpl(p1));
            int originalToTransformed2 = p2.originalToTransformed(androidx.compose.ui.text.TextRange.m8036getMaximpl(p1));
            if (originalToTransformed != originalToTransformed2) {
                p0.drawPath(p3.getPathForRange(originalToTransformed, originalToTransformed2), p4);
            }
        }

        @kotlin.jvm.JvmStatic
        public final void notifyFocusedRect$foundation(androidx.compose.ui.text.input.TextFieldValue value, final androidx.compose.foundation.text.TextDelegate textDelegate, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.text.input.TextInputSession textInputSession, boolean hasFocus, androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
            if (hasFocus) {
                textInputSession.notifyFocusedRect(androidx.compose.foundation.text.TextFieldDelegateKt.focusedRectInRoot(textLayoutResult, layoutCoordinates, offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m8036getMaximpl(value.getSelection())), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.ui.unit.IntSize highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.foundation.text.TextFieldDelegate.Companion.getHighSpeedVideoSizes(androidx.compose.foundation.text.TextDelegate.this);
                        return highSpeedVideoSizes;
                    }
                }));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.IntSize getHighSpeedVideoSizes(androidx.compose.foundation.text.TextDelegate textDelegate) {
            return androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null));
        }

        @kotlin.jvm.JvmStatic
        public final void updateTextLayoutResult$foundation(androidx.compose.ui.text.input.TextInputSession textInputSession, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResult) {
            androidx.compose.ui.layout.LayoutCoordinates decorationBoxCoordinates;
            final androidx.compose.ui.layout.LayoutCoordinates innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult.getValue(), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Matrix matrix) {
                    Camera2StreamConfigurationMap(matrix.m6246unboximpl());
                    return kotlin.Unit.INSTANCE;
                }

                private void Camera2StreamConfigurationMap(float[] fArr) {
                    if (androidx.compose.ui.layout.LayoutCoordinates.this.isAttached()) {
                        androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(androidx.compose.ui.layout.LayoutCoordinates.this).mo7368transformFromEL8BTi8(androidx.compose.ui.layout.LayoutCoordinates.this, fArr);
                    }
                }
            }, androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        @kotlin.jvm.JvmStatic
        public final void onEditCommand$foundation(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> ops, androidx.compose.ui.text.input.EditProcessor editProcessor, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, androidx.compose.ui.text.input.TextInputSession session) {
            androidx.compose.ui.text.input.TextFieldValue apply = editProcessor.apply(ops);
            if (session != null) {
                session.updateState(null, apply);
            }
            onValueChange.invoke(apply);
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: setCursorOffset-ULxng0E$foundation, reason: not valid java name */
        public final void m2113setCursorOffsetULxng0E$foundation(long position, androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResult, androidx.compose.ui.text.input.EditProcessor editProcessor, androidx.compose.ui.text.input.OffsetMapping offsetMapping, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange) {
            onValueChange.invoke(androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRangeKt.TextRange(offsetMapping.transformedToOriginal(androidx.compose.foundation.text.TextLayoutResultProxy.m2135getOffsetForPosition3MmeM6k$default(textLayoutResult, position, false, 2, null))), (androidx.compose.ui.text.TextRange) null, 5, (java.lang.Object) null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @kotlin.jvm.JvmStatic
        public final androidx.compose.ui.text.input.TextInputSession restartInput$foundation(androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.ui.text.input.TextFieldValue value, final androidx.compose.ui.text.input.EditProcessor editProcessor, androidx.compose.ui.text.input.ImeOptions imeOptions, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = textInputService.startInput(value, imeOptions, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldDelegate.Companion.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.input.EditProcessor.this, onValueChange, objectRef, (java.util.List) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, onImeActionPerformed);
            return (androidx.compose.ui.text.input.TextInputSession) objectRef.element;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.input.EditProcessor editProcessor, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.util.List list) {
            androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation(list, editProcessor, function1, (androidx.compose.ui.text.input.TextInputSession) objectRef.element);
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.compose.ui.text.input.TextInputSession onFocus$foundation(androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.EditProcessor editProcessor, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
            return restartInput$foundation(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        @kotlin.jvm.JvmStatic
        public final void onBlur$foundation(androidx.compose.ui.text.input.TextInputSession textInputSession, androidx.compose.ui.text.input.EditProcessor editProcessor, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange) {
            onValueChange.invoke(androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (androidx.compose.ui.text.AnnotatedString) null, 0L, (androidx.compose.ui.text.TextRange) null, 3, (java.lang.Object) null));
            textInputSession.dispose();
        }

        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final androidx.compose.ui.text.input.TransformedText m2110applyCompositionDecoration72CqOWE(long compositionRange, androidx.compose.ui.text.input.TransformedText transformed) {
            int originalToTransformed = transformed.getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m8039getStartimpl(compositionRange));
            int originalToTransformed2 = transformed.getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(compositionRange));
            int min = java.lang.Math.min(originalToTransformed, originalToTransformed2);
            int max = java.lang.Math.max(originalToTransformed, originalToTransformed2);
            androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61439, (kotlin.jvm.internal.DefaultConstructorMarker) null), min, max);
            return new androidx.compose.ui.text.input.TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
