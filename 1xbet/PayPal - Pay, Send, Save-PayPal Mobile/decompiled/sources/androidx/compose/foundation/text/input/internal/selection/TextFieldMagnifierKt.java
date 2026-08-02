package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "calculateSelectionMagnifierCenterAndroid-hUlJWOE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "calculateSelectionMagnifierCenterAndroid"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldMagnifierKt {
    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m2297calculateSelectionMagnifierCenterAndroidhUlJWOE(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, long j) {
        int m8039getStartimpl;
        long m2307getHandleDragPositionF1C5BW0 = textFieldSelectionState.m2307getHandleDragPositionF1C5BW0();
        if ((9223372034707292159L & m2307getHandleDragPositionF1C5BW0) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats || transformedTextFieldState.getVisualText().length() == 0) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        long selection = transformedTextFieldState.getVisualText().getSelection();
        androidx.compose.foundation.text.Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i = draggingHandle == null ? -1 : androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierKt.WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(selection);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            m8039getStartimpl = androidx.compose.ui.text.TextRange.m8034getEndimpl(selection);
        }
        androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m2307getHandleDragPositionF1C5BW0 >> 32));
        int lineForOffset = layoutResult.getLineForOffset(m8039getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(intBitsToFloat, java.lang.Math.min(lineLeft, lineRight), java.lang.Math.max(lineLeft, lineRight));
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()) && java.lang.Math.abs(intBitsToFloat - coerceIn) > ((int) (j >> 32)) / 2) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop) & 4294967295L) | (java.lang.Float.floatToRawIntBits(coerceIn) << 32));
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                m5744constructorimpl = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2263coerceIn3MmeM6k(m5744constructorimpl, androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m2265fromTextLayoutToCoreUv8p0NA(textLayoutState, m5744constructorimpl);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.Handle.values().length];
            try {
                iArr[androidx.compose.foundation.text.Handle.Cursor.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.Handle.SelectionStart.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.Handle.SelectionEnd.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
