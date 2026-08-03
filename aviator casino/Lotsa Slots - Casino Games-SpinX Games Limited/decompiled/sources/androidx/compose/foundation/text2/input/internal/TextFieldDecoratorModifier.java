package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldDecoratorModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0016\u001a\u00020\bHÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÂ\u0003J\t\u0010\u0018\u001a\u00020\fHÂ\u0003J\t\u0010\u0019\u001a\u00020\fHÂ\u0003J\t\u0010\u001a\u001a\u00020\u000fHÂ\u0003J\t\u0010\u001b\u001a\u00020\u0011HÂ\u0003J\t\u0010\u001c\u001a\u00020\fHÂ\u0003Je\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0002H\u0016J\f\u0010)\u001a\u00020'*\u00020*H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "filter", "Landroidx/compose/foundation/text2/input/InputTransformation;", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldDecoratorModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final androidx.compose.foundation.text2.input.InputTransformation filter;
    private final androidx.compose.foundation.text.KeyboardActions keyboardActions;
    private final androidx.compose.foundation.text.KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;
    private final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
    private final androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: component2, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: component3, reason: from getter */
    private final androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    /* renamed from: component4, reason: from getter */
    private final androidx.compose.foundation.text2.input.InputTransformation getFilter() {
        return this.filter;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component7, reason: from getter */
    private final androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* renamed from: component8, reason: from getter */
    private final androidx.compose.foundation.text.KeyboardActions getKeyboardActions() {
        return this.keyboardActions;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getSingleLine() {
        return this.singleLine;
    }

    public final androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier copy(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.InputTransformation filter, boolean enabled, boolean readOnly, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean singleLine) {
        return new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier(textFieldState, textLayoutState, textFieldSelectionState, filter, enabled, readOnly, keyboardOptions, keyboardActions, singleLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier)) {
            return false;
        }
        androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier textFieldDecoratorModifier = (androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldState, textFieldDecoratorModifier.textFieldState) && kotlin.jvm.internal.Intrinsics.areEqual(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && kotlin.jvm.internal.Intrinsics.areEqual(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && kotlin.jvm.internal.Intrinsics.areEqual(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyboardActions, textFieldDecoratorModifier.keyboardActions) && this.singleLine == textFieldDecoratorModifier.singleLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.textFieldState.hashCode() * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.filter;
        return ((((((((((hashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.enabled)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31) + this.keyboardActions.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.singleLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public java.lang.String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ')';
    }

    public TextFieldDecoratorModifier(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.InputTransformation inputTransformation, boolean z, boolean z2, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean z3) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActions = keyboardActions;
        this.singleLine = z3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode create() {
        return new androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActions, this.singleLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode node) {
        node.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActions, this.singleLine);
    }
}
