package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UnspecifiedConstraintsElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.UnspecifiedConstraintsNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    private UnspecifiedConstraintsElement(float f, float f2) {
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRanges = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.UnspecifiedConstraintsNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.UnspecifiedConstraintsNode(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.UnspecifiedConstraintsNode p0) {
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        p0.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        inspectorInfo.getProperties().set("minWidth", androidx.compose.ui.unit.Dp.m8599boximpl(this.getHighSpeedVideoSizes));
        inspectorInfo.getProperties().set("minHeight", androidx.compose.ui.unit.Dp.m8599boximpl(this.getHighSpeedVideoFpsRanges));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.foundation.layout.UnspecifiedConstraintsElement)) {
            return false;
        }
        androidx.compose.foundation.layout.UnspecifiedConstraintsElement unspecifiedConstraintsElement = (androidx.compose.foundation.layout.UnspecifiedConstraintsElement) p0;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes, unspecifiedConstraintsElement.getHighSpeedVideoSizes) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, unspecifiedConstraintsElement.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoSizes) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
