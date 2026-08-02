package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000f*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/ParentSizeNode;", "", "p0", "Landroidx/compose/runtime/State;", "", "p1", "p2", "", "p3", "<init>", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/lazy/ParentSizeNode;", "", "(Landroidx/compose/foundation/lazy/ParentSizeNode;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/State;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ParentSizeElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.ParentSizeNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<java.lang.Integer> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    public ParentSizeElement(float f, androidx.compose.runtime.State<java.lang.Integer> state, androidx.compose.runtime.State<java.lang.Integer> state2, java.lang.String str) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getHighSpeedVideoFpsRanges = state2;
        this.getHighSpeedVideoSizes = str;
    }

    public /* synthetic */ ParentSizeElement(float f, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? null : state, (i & 4) != 0 ? null : state2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.lazy.ParentSizeNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.lazy.ParentSizeNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.lazy.ParentSizeNode p0) {
        p0.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
        p0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.lazy.ParentSizeElement)) {
            return false;
        }
        androidx.compose.foundation.lazy.ParentSizeElement parentSizeElement = (androidx.compose.foundation.lazy.ParentSizeElement) p0;
        return this.Camera2StreamConfigurationMap == parentSizeElement.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, parentSizeElement.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, parentSizeElement.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        androidx.compose.runtime.State<java.lang.Integer> state = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = state != null ? state.hashCode() : 0;
        androidx.compose.runtime.State<java.lang.Integer> state2 = this.getHighSpeedVideoFpsRanges;
        return (((hashCode * 31) + (state2 != null ? state2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.getHighSpeedVideoSizes);
        inspectorInfo.setValue(java.lang.Float.valueOf(this.Camera2StreamConfigurationMap));
    }
}
