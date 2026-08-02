package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "", "visible", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;", "textFieldMagnifierNode", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTextFieldMagnifier_androidKt {
    public static final androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode textFieldMagnifierNode(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, boolean z) {
        if (androidx.compose.foundation.Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            return new androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z);
        }
        return new androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode() { // from class: androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt$textFieldMagnifierNode$1
            @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
            public final void update(androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState2, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState2, boolean visible) {
            }
        };
    }
}
