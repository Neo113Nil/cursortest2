package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: AndroidTextFieldMagnifier.android.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¨\u0006\n"}, d2 = {"textFieldMagnifierNode", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "isFocused", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextFieldMagnifier_androidKt {
    public static final androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode textFieldMagnifierNode(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, boolean z) {
        if (androidx.compose.foundation.Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            return new androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z);
        }
        return new androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode() { // from class: androidx.compose.foundation.text2.input.internal.selection.AndroidTextFieldMagnifier_androidKt$textFieldMagnifierNode$1
            @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode
            public void update(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2, boolean isFocused) {
            }
        };
    }
}
