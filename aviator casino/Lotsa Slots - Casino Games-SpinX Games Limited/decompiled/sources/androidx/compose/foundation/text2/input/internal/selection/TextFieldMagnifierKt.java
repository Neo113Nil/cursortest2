package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: TextFieldMagnifier.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "selectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-hUlJWOE", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {

    /* compiled from: TextFieldMagnifier.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m1182calculateSelectionMagnifierCenterAndroidhUlJWOE(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, long j) {
        int m3964getStartimpl;
        long m1204getHandleDragPositionF1C5BW0 = textFieldSelectionState.m1204getHandleDragPositionF1C5BW0();
        if (androidx.compose.ui.geometry.OffsetKt.m1892isUnspecifiedk4lQ0M(m1204getHandleDragPositionF1C5BW0) || transformedTextFieldState.getText().length() == 0) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        long selectionInChars = transformedTextFieldState.getText().getSelectionInChars();
        androidx.compose.foundation.text.Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i = draggingHandle == null ? -1 : androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierKt.WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m3964getStartimpl = androidx.compose.ui.text.TextRange.m3964getStartimpl(selectionInChars);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            m3964getStartimpl = androidx.compose.ui.text.TextRange.m3959getEndimpl(selectionInChars);
        }
        androidx.compose.ui.text.TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(m1204getHandleDragPositionF1C5BW0);
        int lineForOffset = layoutResult.getLineForOffset(m3964getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(m1871getXimpl, java.lang.Math.min(lineLeft, lineRight), java.lang.Math.max(lineLeft, lineRight));
        if (java.lang.Math.abs(m1871getXimpl - coerceIn) > androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j) / 2) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(coerceIn, ((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                Offset = androidx.compose.foundation.text2.input.internal.TextLayoutStateKt.m1161coerceIn3MmeM6k(Offset, androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return androidx.compose.foundation.text2.input.internal.TextLayoutStateKt.m1163fromTextLayoutToCoreUv8p0NA(textLayoutState, Offset);
    }
}
