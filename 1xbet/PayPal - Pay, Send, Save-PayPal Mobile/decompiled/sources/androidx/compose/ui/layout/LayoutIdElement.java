package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutIdModifier;", "", "p0", "<init>", "(Ljava/lang/Object;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/layout/LayoutIdModifier;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/layout/LayoutIdModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class LayoutIdElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.layout.LayoutIdModifier> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    public LayoutIdElement(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.LayoutIdModifier getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.layout.LayoutIdModifier(this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.layout.LayoutIdModifier p0) {
        p0.setLayoutId$ui(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutIdElement(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.layout.LayoutIdElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((androidx.compose.ui.layout.LayoutIdElement) p0).getHighSpeedVideoFpsRangesFor);
    }
}
