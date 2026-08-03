package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldCoreModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0015\u001a\u00020\bHÂ\u0003J\t\u0010\u0016\u001a\u00020\nHÂ\u0003J\t\u0010\u0017\u001a\u00020\fHÂ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0019\u001a\u00020\u000fHÂ\u0003J\t\u0010\u001a\u001a\u00020\u0011HÂ\u0003JY\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0013\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0002H\u0016J\f\u0010'\u001a\u00020%*\u00020(H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;", "isFocused", "", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "writeable", "scrollState", "Landroidx/compose/foundation/ScrollState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(ZLandroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldCoreModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode> {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.Brush cursorBrush;
    private final boolean isFocused;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final androidx.compose.foundation.ScrollState scrollState;
    private final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
    private final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
    private final boolean writeable;

    /* renamed from: component1, reason: from getter */
    private final boolean getIsFocused() {
        return this.isFocused;
    }

    /* renamed from: component2, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: component3, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: component4, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    /* renamed from: component5, reason: from getter */
    private final androidx.compose.ui.graphics.Brush getCursorBrush() {
        return this.cursorBrush;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getWriteable() {
        return this.writeable;
    }

    /* renamed from: component7, reason: from getter */
    private final androidx.compose.foundation.ScrollState getScrollState() {
        return this.scrollState;
    }

    /* renamed from: component8, reason: from getter */
    private final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier copy(boolean isFocused, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.graphics.Brush cursorBrush, boolean writeable, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.gestures.Orientation orientation) {
        return new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier(isFocused, textLayoutState, textFieldState, textFieldSelectionState, cursorBrush, writeable, scrollState, orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier)) {
            return false;
        }
        androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier textFieldCoreModifier = (androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier) other;
        return this.isFocused == textFieldCoreModifier.isFocused && kotlin.jvm.internal.Intrinsics.areEqual(this.textLayoutState, textFieldCoreModifier.textLayoutState) && kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldState, textFieldCoreModifier.textFieldState) && kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && kotlin.jvm.internal.Intrinsics.areEqual(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && kotlin.jvm.internal.Intrinsics.areEqual(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.isFocused) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public java.lang.String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ')';
    }

    public TextFieldCoreModifier(boolean z, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.graphics.Brush brush, boolean z2, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.gestures.Orientation orientation) {
        this.isFocused = z;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z2;
        this.scrollState = scrollState;
        this.orientation = orientation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode create() {
        return new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode(this.isFocused, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode node) {
        node.updateNode(this.isFocused, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }
}
