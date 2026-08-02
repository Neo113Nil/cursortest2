package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001e"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SkipToLookaheadSizeNode;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "scaleToBounds", "Lkotlin/Function0;", "", "isEnabled", "<init>", "(Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;)V", "create", "()Landroidx/compose/animation/SkipToLookaheadSizeNode;", "node", "", "update", "(Landroidx/compose/animation/SkipToLookaheadSizeNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/animation/ScaleToBoundsImpl;", "getScaleToBounds", "()Landroidx/compose/animation/ScaleToBoundsImpl;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SkipToLookaheadSizeElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.SkipToLookaheadSizeNode> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> isEnabled;
    private final androidx.compose.animation.ScaleToBoundsImpl scaleToBounds;

    public SkipToLookaheadSizeElement(androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.scaleToBounds = scaleToBoundsImpl;
        this.isEnabled = function0;
    }

    public final androidx.compose.animation.ScaleToBoundsImpl getScaleToBounds() {
        return this.scaleToBounds;
    }

    public /* synthetic */ SkipToLookaheadSizeElement(androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : scaleToBoundsImpl, (i & 2) != 0 ? androidx.compose.animation.SkipToLookaheadSizeNodeKt.getHighResolutionOutputSizeshNQ4ISI : function0);
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> isEnabled() {
        return this.isEnabled;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.animation.SkipToLookaheadSizeNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.SkipToLookaheadSizeNode(this.scaleToBounds, this.isEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.animation.SkipToLookaheadSizeNode node) {
        node.setScaleToBounds(this.scaleToBounds);
        node.setEnabled(this.isEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("skipToLookahead");
        inspectorInfo.getProperties().set("scaleToBounds", this.scaleToBounds);
        inspectorInfo.getProperties().set("isEnabled", this.isEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.isEnabled.hashCode();
        androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl = this.scaleToBounds;
        return (hashCode * 31) + (scaleToBoundsImpl != null ? scaleToBoundsImpl.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.SkipToLookaheadSizeElement)) {
            return false;
        }
        androidx.compose.animation.SkipToLookaheadSizeElement skipToLookaheadSizeElement = (androidx.compose.animation.SkipToLookaheadSizeElement) other;
        return skipToLookaheadSizeElement.isEnabled == this.isEnabled && kotlin.jvm.internal.Intrinsics.areEqual(skipToLookaheadSizeElement.scaleToBounds, this.scaleToBounds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkipToLookaheadSizeElement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
