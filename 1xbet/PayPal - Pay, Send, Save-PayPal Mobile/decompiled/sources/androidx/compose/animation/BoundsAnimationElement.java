package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\u000b\u001a\u001e\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\t\u0012\u00070\n¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R6\u0010\u000b\u001a\u001e\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\t\u0012\u00070\n¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/animation/BoundsAnimationElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/BoundsAnimationModifierNode;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/unit/Constraints;", "resolveMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lkotlin/jvm/functions/Function2;Z)V", "create", "()Landroidx/compose/animation/BoundsAnimationModifierNode;", "node", "", "update", "(Landroidx/compose/animation/BoundsAnimationModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/LookaheadScope;", "getLookaheadScope", "()Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/animation/BoundsTransform;", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "Lkotlin/jvm/functions/Function2;", "getResolveMeasureConstraints", "()Lkotlin/jvm/functions/Function2;", "Z", "getAnimateMotionFrameOfReference", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BoundsAnimationElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.BoundsAnimationModifierNode> {
    public static final int $stable = 0;
    private final boolean animateMotionFrameOfReference;
    private final androidx.compose.animation.BoundsTransform boundsTransform;
    private final androidx.compose.ui.layout.LookaheadScope lookaheadScope;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> resolveMeasureConstraints;

    /* JADX WARN: Multi-variable type inference failed */
    public BoundsAnimationElement(androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.animation.BoundsTransform boundsTransform, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> function2, boolean z) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.resolveMeasureConstraints = function2;
        this.animateMotionFrameOfReference = z;
    }

    public final androidx.compose.ui.layout.LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    public final androidx.compose.animation.BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.Constraints, androidx.compose.ui.unit.Constraints> getResolveMeasureConstraints() {
        return this.resolveMeasureConstraints;
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.animation.BoundsAnimationModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.animation.BoundsAnimationModifierNode node) {
        node.setLookaheadScope(this.lookaheadScope);
        node.setBoundsTransform(this.boundsTransform);
        node.setOnChooseMeasureConstraints(this.resolveMeasureConstraints);
        node.setAnimateMotionFrameOfReference(this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("boundsAnimation");
        inspectorInfo.getProperties().set("lookaheadScope", this.lookaheadScope);
        inspectorInfo.getProperties().set("boundsTransform", this.boundsTransform);
        inspectorInfo.getProperties().set("onChooseMeasureConstraints", this.resolveMeasureConstraints);
        inspectorInfo.getProperties().set("animateMotionFrameOfReference", java.lang.Boolean.valueOf(this.animateMotionFrameOfReference));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((((this.lookaheadScope.hashCode() * 31) + this.boundsTransform.hashCode()) * 31) + this.resolveMeasureConstraints.hashCode()) * 31) + java.lang.Boolean.hashCode(this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.BoundsAnimationElement)) {
            return false;
        }
        androidx.compose.animation.BoundsAnimationElement boundsAnimationElement = (androidx.compose.animation.BoundsAnimationElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(boundsAnimationElement.lookaheadScope, this.lookaheadScope) && kotlin.jvm.internal.Intrinsics.areEqual(boundsAnimationElement.boundsTransform, this.boundsTransform) && boundsAnimationElement.resolveMeasureConstraints == this.resolveMeasureConstraints && boundsAnimationElement.animateMotionFrameOfReference == this.animateMotionFrameOfReference;
    }
}
