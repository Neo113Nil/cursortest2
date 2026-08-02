package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012,\u0010\u0012\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\u0002\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R:\u0010/\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\u0002\b\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010+\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00101"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/KeyboardOptions;)V", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "node", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Camera2StreamConfigurationMap", "getInputFormats", "Landroidx/compose/ui/text/TextStyle;", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "Landroidx/compose/foundation/text/KeyboardOptions;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.KeyboardOptions getInputFormats;
    private final androidx.compose.foundation.text.input.internal.TextLayoutState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TransformedTextFieldState Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.text.TextStyle getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2, androidx.compose.foundation.text.KeyboardOptions keyboardOptions) {
        this.getHighResolutionOutputSizeshNQ4ISI = textLayoutState;
        this.Camera2StreamConfigurationMap = transformedTextFieldState;
        this.getHighSpeedVideoFpsRanges = textStyle;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getInputFormats = keyboardOptions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode node) {
        node.updateNode(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier textFieldTextLayoutModifier = (androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier) other;
        return this.getHighSpeedVideoSizes == textFieldTextLayoutModifier.getHighSpeedVideoSizes && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, textFieldTextLayoutModifier.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, textFieldTextLayoutModifier.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, textFieldTextLayoutModifier.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoFpsRangesFor == textFieldTextLayoutModifier.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, textFieldTextLayoutModifier.getInputFormats);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
        int hashCode2 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode3 = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode4 = this.getHighSpeedVideoFpsRanges.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRangesFor;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (function2 != null ? function2.hashCode() : 0)) * 31) + this.getInputFormats.hashCode();
    }
}
