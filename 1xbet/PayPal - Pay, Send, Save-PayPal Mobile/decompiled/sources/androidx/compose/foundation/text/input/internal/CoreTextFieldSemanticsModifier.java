package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001a*\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b0\u00101Jt\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010'R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bF\u0010'R\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\b\f\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010+R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010-R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010/R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u00101"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "", "readOnly", "enabled", "isPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "create", "()Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "node", "", "update", "(Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/ui/text/input/TransformedText;", "component2", "()Landroidx/compose/ui/text/input/TextFieldValue;", "component3", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "component4", "()Z", "component5", "component6", "component7", "()Landroidx/compose/ui/text/input/OffsetMapping;", "component8", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "component9", "()Landroidx/compose/ui/text/input/ImeOptions;", "component10", "()Landroidx/compose/ui/focus/FocusRequester;", "copy", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "Z", "getReadOnly", "getEnabled", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "Landroidx/compose/ui/text/input/ImeOptions;", "getImeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final androidx.compose.ui.focus.FocusRequester focusRequester;
    private final androidx.compose.ui.text.input.ImeOptions imeOptions;
    private final boolean isPassword;
    private final androidx.compose.foundation.text.selection.TextFieldSelectionManager manager;
    private final androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private final boolean readOnly;
    private final androidx.compose.foundation.text.LegacyTextFieldState state;
    private final androidx.compose.ui.text.input.TransformedText transformedText;
    private final androidx.compose.ui.text.input.TextFieldValue value;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public CoreTextFieldSemanticsModifier(androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z2;
        this.isPassword = z3;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
    }

    public final androidx.compose.ui.text.input.TransformedText getTransformedText() {
        return this.transformedText;
    }

    public final androidx.compose.ui.text.input.TextFieldValue getValue() {
        return this.value;
    }

    public final androidx.compose.foundation.text.LegacyTextFieldState getState() {
        return this.state;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final androidx.compose.ui.text.input.OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final androidx.compose.ui.text.input.ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode node) {
        node.updateNodeSemantics(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append(this.transformedText);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", readOnly=");
        sb.append(this.readOnly);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", isPassword=");
        sb.append(this.isPassword);
        sb.append(", offsetMapping=");
        sb.append(this.offsetMapping);
        sb.append(", manager=");
        sb.append(this.manager);
        sb.append(", imeOptions=");
        sb.append(this.imeOptions);
        sb.append(", focusRequester=");
        sb.append(this.focusRequester);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((((((((((((((((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + java.lang.Boolean.hashCode(this.readOnly)) * 31) + java.lang.Boolean.hashCode(this.enabled)) * 31) + java.lang.Boolean.hashCode(this.isPassword)) * 31) + this.offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, coreTextFieldSemanticsModifier.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && kotlin.jvm.internal.Intrinsics.areEqual(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && kotlin.jvm.internal.Intrinsics.areEqual(this.manager, coreTextFieldSemanticsModifier.manager) && kotlin.jvm.internal.Intrinsics.areEqual(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public final androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier copy(androidx.compose.ui.text.input.TransformedText transformedText, androidx.compose.ui.text.input.TextFieldValue value, androidx.compose.foundation.text.LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextFieldSelectionManager manager, androidx.compose.ui.text.input.ImeOptions imeOptions, androidx.compose.ui.focus.FocusRequester focusRequester) {
        return new androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier(transformedText, value, state, readOnly, enabled, isPassword, offsetMapping, manager, imeOptions, focusRequester);
    }

    /* renamed from: component9, reason: from getter */
    public final androidx.compose.ui.text.input.ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    /* renamed from: component8, reason: from getter */
    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager getManager() {
        return this.manager;
    }

    /* renamed from: component7, reason: from getter */
    public final androidx.compose.ui.text.input.OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPassword() {
        return this.isPassword;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.foundation.text.LegacyTextFieldState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: component10, reason: from getter */
    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.text.input.TransformedText getTransformedText() {
        return this.transformedText;
    }
}
