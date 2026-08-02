package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001c*\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0080\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00107\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010/R\u0014\u0010>\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u00103\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010?R\u0014\u00105\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010@R\u0016\u0010B\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010A"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "", "isFocused", "isDragHovered", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "writeable", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "toolbarRequester", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "platformSelectionBehaviors", "<init>", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;)V", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;", "node", "", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(ZZLandroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;)Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Brush;", "getOutputStallDurationlomOqCM", "getOutputFormats", "Landroidx/compose/foundation/ScrollState;", "getInputFormats", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "getOutputSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldCoreModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.selection.PlatformSelectionBehaviors getOutputSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Orientation getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Brush getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TextLayoutState getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.ScrollState getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TransformedTextFieldState getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final boolean getOutputFormats;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public TextFieldCoreModifier(boolean z, boolean z2, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.graphics.Brush brush, boolean z3, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester, androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighSpeedVideoFpsRangesFor = textLayoutState;
        this.getHighSpeedVideoSizes = transformedTextFieldState;
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldSelectionState;
        this.getInputSizeshNQ4ISI = brush;
        this.getOutputFormats = z3;
        this.getInputFormats = scrollState;
        this.getHighSpeedVideoSizesFor = orientation;
        this.getOutputMinFrameDuration = toolbarRequester;
        this.getOutputSizes = platformSelectionBehaviors;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode node) {
        node.updateNode(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputSizes);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextFieldCoreModifier(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getInputSizeshNQ4ISI=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", getOutputFormats=");
        sb.append(this.getOutputFormats);
        sb.append(", getInputFormats=");
        sb.append(this.getInputFormats);
        sb.append(", getHighSpeedVideoSizesFor=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", getOutputMinFrameDuration=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", getOutputSizes=");
        sb.append(this.getOutputSizes);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
        int hashCode2 = java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode3 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int hashCode4 = this.getHighSpeedVideoSizes.hashCode();
        int hashCode5 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode6 = this.getInputSizeshNQ4ISI.hashCode();
        int hashCode7 = java.lang.Boolean.hashCode(this.getOutputFormats);
        int hashCode8 = this.getInputFormats.hashCode();
        int hashCode9 = this.getHighSpeedVideoSizesFor.hashCode();
        int hashCode10 = this.getOutputMinFrameDuration.hashCode();
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = this.getOutputSizes;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (platformSelectionBehaviors == null ? 0 : platformSelectionBehaviors.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.input.internal.TextFieldCoreModifier)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.TextFieldCoreModifier textFieldCoreModifier = (androidx.compose.foundation.text.input.internal.TextFieldCoreModifier) other;
        return this.getHighSpeedVideoFpsRanges == textFieldCoreModifier.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == textFieldCoreModifier.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, textFieldCoreModifier.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, textFieldCoreModifier.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, textFieldCoreModifier.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, textFieldCoreModifier.getInputSizeshNQ4ISI) && this.getOutputFormats == textFieldCoreModifier.getOutputFormats && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, textFieldCoreModifier.getInputFormats) && this.getHighSpeedVideoSizesFor == textFieldCoreModifier.getHighSpeedVideoSizesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, textFieldCoreModifier.getOutputMinFrameDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputSizes, textFieldCoreModifier.getOutputSizes);
    }

    public final androidx.compose.foundation.text.input.internal.TextFieldCoreModifier copy(boolean isFocused, boolean isDragHovered, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.graphics.Brush cursorBrush, boolean writeable, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester, androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors) {
        return new androidx.compose.foundation.text.input.internal.TextFieldCoreModifier(isFocused, isDragHovered, textLayoutState, textFieldState, textFieldSelectionState, cursorBrush, writeable, scrollState, orientation, toolbarRequester, platformSelectionBehaviors);
    }
}
