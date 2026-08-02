package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "p0", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "p1", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "p2", "<init>", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode> {
    private final androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.LegacyTextFieldState Camera2StreamConfigurationMap;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public LegacyAdaptingPlatformTextInputModifier(androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.getHighSpeedVideoFpsRanges = legacyPlatformTextInputServiceAdapter;
        this.Camera2StreamConfigurationMap = legacyTextFieldState;
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode2 = legacyAdaptingPlatformTextInputModifierNode;
        legacyAdaptingPlatformTextInputModifierNode2.setServiceAdapter(this.getHighSpeedVideoFpsRanges);
        legacyAdaptingPlatformTextInputModifierNode2.setLegacyTextFieldState(this.Camera2StreamConfigurationMap);
        legacyAdaptingPlatformTextInputModifierNode2.setTextFieldSelectionManager(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LegacyAdaptingPlatformTextInputModifier(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifier) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, legacyAdaptingPlatformTextInputModifier.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, legacyAdaptingPlatformTextInputModifier.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, legacyAdaptingPlatformTextInputModifier.getHighResolutionOutputSizeshNQ4ISI);
    }
}
