package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\"\u001a\u00020\u0002H\u0016J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0002H\u0016J\f\u0010+\u001a\u00020)*\u00020,H\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/ScrollableNode;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "enabled", "", "reverseDirection", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "getBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getEnabled", "()Z", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "getReverseDirection", "getState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "create", "equals", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.gestures.ScrollableNode> {
    private final androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;
    private final androidx.compose.foundation.gestures.FlingBehavior flingBehavior;
    private final androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final androidx.compose.foundation.OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final androidx.compose.foundation.gestures.ScrollableState state;

    public final androidx.compose.foundation.gestures.ScrollableState getState() {
        return this.state;
    }

    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    public final androidx.compose.foundation.OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final androidx.compose.foundation.gestures.FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final androidx.compose.foundation.interaction.MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final androidx.compose.foundation.gestures.BringIntoViewSpec getBringIntoViewSpec() {
        return this.bringIntoViewSpec;
    }

    public ScrollableElement(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.gestures.ScrollableNode create() {
        return new androidx.compose.foundation.gestures.ScrollableNode(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.gestures.ScrollableNode node) {
        node.update(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        androidx.compose.foundation.OverscrollEffect overscrollEffect = this.overscrollEffect;
        int hashCode2 = (((((hashCode + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.enabled)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.reverseDirection)) * 31;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior = this.flingBehavior;
        int hashCode3 = (hashCode2 + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return ((hashCode3 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + this.bringIntoViewSpec.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.gestures.ScrollableElement)) {
            return false;
        }
        androidx.compose.foundation.gestures.ScrollableElement scrollableElement = (androidx.compose.foundation.gestures.ScrollableElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && kotlin.jvm.internal.Intrinsics.areEqual(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && kotlin.jvm.internal.Intrinsics.areEqual(this.flingBehavior, scrollableElement.flingBehavior) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionSource, scrollableElement.interactionSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollable");
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseDirection", java.lang.Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("flingBehavior", this.flingBehavior);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("scrollableBringIntoViewConfig", this.bringIntoViewSpec);
    }
}
