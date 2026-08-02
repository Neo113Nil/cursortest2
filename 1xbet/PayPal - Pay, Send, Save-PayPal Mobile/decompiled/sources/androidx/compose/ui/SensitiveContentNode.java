package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@GX\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Landroidx/compose/ui/SensitiveContentNode;", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "<init>", "(Z)V", "", "onAttach", "()V", "onDetach", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class SensitiveContentNode extends androidx.compose.ui.Modifier.Node {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    public SensitiveContentNode(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        if (this.getHighSpeedVideoFpsRangesFor) {
            if (this.Camera2StreamConfigurationMap) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("invalid sensitive content state");
            }
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
            this.Camera2StreamConfigurationMap = true;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        if (this.Camera2StreamConfigurationMap) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
            this.Camera2StreamConfigurationMap = false;
        }
        super.onDetach();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SensitiveContentNode(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.SensitiveContentNode) && this.getHighResolutionOutputSizeshNQ4ISI == ((androidx.compose.ui.SensitiveContentNode) p0).getHighResolutionOutputSizeshNQ4ISI;
    }
}
