package androidx.compose.foundation.selection;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u000e*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010&\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010(\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/selection/SelectableNode;", "", "p0", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p1", "Landroidx/compose/foundation/IndicationNodeFactory;", "p2", "p3", "p4", "Landroidx/compose/ui/semantics/Role;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/selection/SelectableNode;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/selection/SelectableNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getInputFormats", "Z", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/IndicationNodeFactory;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/semantics/Role;", "getHighSpeedVideoSizesFor", "Lkotlin/jvm/functions/Function0;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectableElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.selection.SelectableNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.IndicationNodeFactory getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.semantics.Role getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    private SelectableElement(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = mutableInteractionSource;
        this.getHighSpeedVideoFpsRanges = indicationNodeFactory;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
        this.getHighSpeedVideoSizesFor = role;
        this.getOutputMinFrameDuration = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.selection.SelectableNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.selection.SelectableNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.selection.SelectableNode p0) {
        p0.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("selectable");
        inspectorInfo.getProperties().set(com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap));
        inspectorInfo.getProperties().set("interactionSource", this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.getHighSpeedVideoFpsRanges);
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor));
        inspectorInfo.getProperties().set("role", this.getHighSpeedVideoSizesFor);
        inspectorInfo.getProperties().set("onClick", this.getOutputMinFrameDuration);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        androidx.compose.foundation.selection.SelectableElement selectableElement = (androidx.compose.foundation.selection.SelectableElement) p0;
        return this.Camera2StreamConfigurationMap == selectableElement.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, selectableElement.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, selectableElement.getHighSpeedVideoFpsRanges) && this.getHighResolutionOutputSizeshNQ4ISI == selectableElement.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == selectableElement.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, selectableElement.getHighSpeedVideoSizesFor) && this.getOutputMinFrameDuration == selectableElement.getOutputMinFrameDuration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoSizes;
        int hashCode2 = mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0;
        androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory = this.getHighSpeedVideoFpsRanges;
        int hashCode3 = indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0;
        int hashCode4 = java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        int hashCode5 = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
        androidx.compose.ui.semantics.Role role = this.getHighSpeedVideoSizesFor;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (role != null ? androidx.compose.ui.semantics.Role.m7795hashCodeimpl(role.getGetHighSpeedVideoSizes()) : 0)) * 31) + this.getOutputMinFrameDuration.hashCode();
    }

    public /* synthetic */ SelectableElement(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, function0);
    }
}
