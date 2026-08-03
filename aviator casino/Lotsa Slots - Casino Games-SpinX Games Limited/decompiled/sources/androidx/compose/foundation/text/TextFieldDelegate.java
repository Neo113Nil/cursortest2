package androidx.compose.foundation.text;

/* compiled from: TextFieldDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.TextFieldDelegate.Companion INSTANCE = new androidx.compose.foundation.text.TextFieldDelegate.Companion(null);

    /* compiled from: TextFieldDelegate.kt */
    @kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016JH\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JE\u0010#\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b*J1\u0010+\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/H\u0001¢\u0006\u0002\b0JA\u00101\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\b\u00105\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0002\b6JU\u00107\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000b0/H\u0001¢\u0006\u0002\b>JU\u0010?\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000b0/H\u0001¢\u0006\u0002\b@JF\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0012\u001a\u00020D2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0/H\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ-\u0010G\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020DH\u0001¢\u0006\u0002\bI\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "()V", "applyCompositionDecoration", "Landroidx/compose/ui/text/input/TransformedText;", "compositionRange", "Landroidx/compose/ui/text/TextRange;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "draw", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "draw$foundation_release", "layout", "Lkotlin/Triple;", "", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "prevResultText", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "notifyFocusedRect", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "hasFocus", "", "notifyFocusedRect$foundation_release", "onBlur", "editProcessor", "Landroidx/compose/ui/text/input/EditProcessor;", "onValueChange", "Lkotlin/Function1;", "onBlur$foundation_release", "onEditCommand", "ops", "", "Landroidx/compose/ui/text/input/EditCommand;", "session", "onEditCommand$foundation_release", "onFocus", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "onFocus$foundation_release", "restartInput", "restartInput$foundation_release", "setCursorOffset", "position", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V", "updateTextLayoutResult", "textFieldValue", "updateTextLayoutResult$foundation_release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ kotlin.Triple m923layout_EkL_Y$foundation_release$default(androidx.compose.foundation.text.TextFieldDelegate.Companion companion, androidx.compose.foundation.text.TextDelegate textDelegate, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m925layout_EkL_Y$foundation_release(textDelegate, j, layoutDirection, textLayoutResult);
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final kotlin.Triple<java.lang.Integer, java.lang.Integer, androidx.compose.ui.text.TextLayoutResult> m925layout_EkL_Y$foundation_release(androidx.compose.foundation.text.TextDelegate textDelegate, long constraints, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextLayoutResult prevResultText) {
            androidx.compose.ui.text.TextLayoutResult m915layoutNN6EwU = textDelegate.m915layoutNN6EwU(constraints, layoutDirection, prevResultText);
            return new kotlin.Triple<>(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(m915layoutNN6EwU.getSize())), java.lang.Integer.valueOf(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(m915layoutNN6EwU.getSize())), m915layoutNN6EwU);
        }

        @kotlin.jvm.JvmStatic
        public final void draw$foundation_release(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.graphics.Paint selectionPaint) {
            int originalToTransformed;
            int originalToTransformed2;
            if (!androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(value.getSelection()) && (originalToTransformed = offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m3962getMinimpl(value.getSelection()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m3961getMaximpl(value.getSelection())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), selectionPaint);
            }
            androidx.compose.ui.text.TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        @kotlin.jvm.JvmStatic
        public final void notifyFocusedRect$foundation_release(androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.foundation.text.TextDelegate textDelegate, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.text.input.TextInputSession textInputSession, boolean hasFocus, androidx.compose.ui.text.input.OffsetMapping offsetMapping) {
            androidx.compose.ui.geometry.Rect rect;
            if (hasFocus) {
                int originalToTransformed = offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m3961getMaximpl(value.getSelection()));
                if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed);
                } else if (originalToTransformed != 0) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
                } else {
                    rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 1.0f, androidx.compose.ui.unit.IntSize.m4651getHeightimpl(androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                }
                long mo3411localToRootMKHz9U = layoutCoordinates.mo3411localToRootMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(rect.getLeft(), rect.getTop()));
                textInputSession.notifyFocusedRect(androidx.compose.ui.geometry.RectKt.m1911Recttz77jQw(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3411localToRootMKHz9U), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3411localToRootMKHz9U)), androidx.compose.ui.geometry.SizeKt.Size(rect.getWidth(), rect.getHeight())));
            }
        }

        @kotlin.jvm.JvmStatic
        public final void updateTextLayoutResult$foundation_release(androidx.compose.ui.text.input.TextInputSession textInputSession, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResult) {
            androidx.compose.ui.layout.LayoutCoordinates decorationBoxCoordinates;
            final androidx.compose.ui.layout.LayoutCoordinates innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult.getValue(), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Matrix matrix) {
                    m927invoke58bKbWc(matrix.m2373unboximpl());
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m927invoke58bKbWc(float[] fArr) {
                    androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(androidx.compose.ui.layout.LayoutCoordinates.this).mo3413transformFromEL8BTi8(androidx.compose.ui.layout.LayoutCoordinates.this, fArr);
                }
            }, androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        @kotlin.jvm.JvmStatic
        public final void onEditCommand$foundation_release(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> ops, androidx.compose.ui.text.input.EditProcessor editProcessor, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, androidx.compose.ui.text.input.TextInputSession session) {
            androidx.compose.ui.text.input.TextFieldValue apply = editProcessor.apply(ops);
            if (session != null) {
                session.updateState(null, apply);
            }
            onValueChange.invoke(apply);
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m926setCursorOffsetULxng0E$foundation_release(long position, androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResult, androidx.compose.ui.text.input.EditProcessor editProcessor, androidx.compose.ui.text.input.OffsetMapping offsetMapping, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange) {
            onValueChange.invoke(androidx.compose.ui.text.input.TextFieldValue.m4200copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRangeKt.TextRange(offsetMapping.transformedToOriginal(androidx.compose.foundation.text.TextLayoutResultProxy.m951getOffsetForPosition3MmeM6k$default(textLayoutResult, position, false, 2, null))), (androidx.compose.ui.text.TextRange) null, 5, (java.lang.Object) null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @kotlin.jvm.JvmStatic
        public final androidx.compose.ui.text.input.TextInputSession restartInput$foundation_release(androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.ui.text.input.TextFieldValue value, final androidx.compose.ui.text.input.EditProcessor editProcessor, androidx.compose.ui.text.input.ImeOptions imeOptions, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = textInputService.startInput(value, imeOptions, new kotlin.jvm.functions.Function1<java.util.List<? extends androidx.compose.ui.text.input.EditCommand>, kotlin.Unit>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
                    invoke2(list);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.util.List<? extends androidx.compose.ui.text.input.EditCommand> list) {
                    androidx.compose.foundation.text.TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(list, androidx.compose.ui.text.input.EditProcessor.this, onValueChange, objectRef.element);
                }
            }, onImeActionPerformed);
            return (androidx.compose.ui.text.input.TextInputSession) objectRef.element;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.compose.ui.text.input.TextInputSession onFocus$foundation_release(androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.ui.text.input.EditProcessor editProcessor, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> onImeActionPerformed) {
            return restartInput$foundation_release(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        @kotlin.jvm.JvmStatic
        public final void onBlur$foundation_release(androidx.compose.ui.text.input.TextInputSession textInputSession, androidx.compose.ui.text.input.EditProcessor editProcessor, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange) {
            onValueChange.invoke(androidx.compose.ui.text.input.TextFieldValue.m4200copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (androidx.compose.ui.text.AnnotatedString) null, 0L, (androidx.compose.ui.text.TextRange) null, 3, (java.lang.Object) null));
            textInputSession.dispose();
        }

        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final androidx.compose.ui.text.input.TransformedText m924applyCompositionDecoration72CqOWE(long compositionRange, androidx.compose.ui.text.input.TransformedText transformed) {
            int originalToTransformed = transformed.getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m3964getStartimpl(compositionRange));
            int originalToTransformed2 = transformed.getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m3959getEndimpl(compositionRange));
            int min = java.lang.Math.min(originalToTransformed, originalToTransformed2);
            int max = java.lang.Math.max(originalToTransformed, originalToTransformed2);
            androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61439, (kotlin.jvm.internal.DefaultConstructorMarker) null), min, max);
            return new androidx.compose.ui.text.input.TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }
    }
}
