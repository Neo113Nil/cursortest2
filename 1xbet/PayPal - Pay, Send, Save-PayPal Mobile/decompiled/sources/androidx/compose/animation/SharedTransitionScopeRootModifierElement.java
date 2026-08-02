package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeRootModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SharedTransitionScopeRootModifierNode;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "p0", "<init>", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class SharedTransitionScopeRootModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.SharedTransitionScopeRootModifierNode> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.SharedTransitionScopeImpl Camera2StreamConfigurationMap;

    public SharedTransitionScopeRootModifierElement(androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.Camera2StreamConfigurationMap = sharedTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.animation.SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode) {
        androidx.compose.animation.SharedTransitionScopeRootModifierNode sharedTransitionScopeRootModifierNode2 = sharedTransitionScopeRootModifierNode;
        androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl = this.Camera2StreamConfigurationMap;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(sharedTransitionScopeImpl, sharedTransitionScopeRootModifierNode2.getHighSpeedVideoSizes)) {
            androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(sharedTransitionScopeRootModifierNode2, sharedTransitionScopeImpl.getObserveAnimatingBlock$animation());
        }
        sharedTransitionScopeRootModifierNode2.getHighSpeedVideoSizes = sharedTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("SharedTransitionScopeRootModifier");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.animation.SharedTransitionScopeRootModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.SharedTransitionScopeRootModifierNode(this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SharedTransitionScopeRootModifierElement(Camera2StreamConfigurationMap=");
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
        return (p0 instanceof androidx.compose.animation.SharedTransitionScopeRootModifierElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.compose.animation.SharedTransitionScopeRootModifierElement) p0).Camera2StreamConfigurationMap);
    }
}
