package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusRequesterNode;", "Landroidx/compose/ui/focus/FocusRequester;", "p0", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "Camera2StreamConfigurationMap", "()Landroidx/compose/ui/focus/FocusRequesterNode;", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/focus/FocusRequesterNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/focus/FocusRequester;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class FocusRequesterElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusRequesterNode> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.focus.FocusRequester Camera2StreamConfigurationMap;

    public FocusRequesterElement(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.Camera2StreamConfigurationMap = focusRequester;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.focus.FocusRequesterNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.focus.FocusRequesterNode(this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.focus.FocusRequesterNode p0) {
        p0.getGetHighSpeedVideoFpsRanges().getFocusRequesterNodes$ui().remove(p0);
        p0.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
        p0.getGetHighSpeedVideoFpsRanges().getFocusRequesterNodes$ui().add(p0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set("focusRequester", this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FocusRequesterElement(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.focus.FocusRequesterElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.compose.ui.focus.FocusRequesterElement) p0).Camera2StreamConfigurationMap);
    }
}
