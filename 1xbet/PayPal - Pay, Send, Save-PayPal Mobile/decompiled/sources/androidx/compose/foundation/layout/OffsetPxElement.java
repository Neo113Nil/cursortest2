package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u000b*\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\u0006\n\u0004\b!\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetPxNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "p0", "", "p1", "Landroidx/compose/ui/platform/InspectorInfo;", "", "p2", "<init>", "(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/layout/OffsetPxNode;", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/layout/OffsetPxNode;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OffsetPxElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.OffsetPxNode> {
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public OffsetPxElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset> function1, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function12) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.layout.OffsetPxNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.layout.OffsetPxNode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.layout.OffsetPxNode p0) {
        p0.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        androidx.compose.foundation.layout.OffsetPxElement offsetPxElement = p0 instanceof androidx.compose.foundation.layout.OffsetPxElement ? (androidx.compose.foundation.layout.OffsetPxElement) p0 : null;
        return offsetPxElement != null && this.getHighSpeedVideoFpsRangesFor == offsetPxElement.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == offsetPxElement.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", rtlAware=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(inspectorInfo);
    }
}
