package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u000f*\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/RenderInTransitionOverlayNode;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "sharedTransitionScope", "Lkotlin/Function0;", "", "renderInOverlay", "", "zIndexInOverlay", "<init>", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;F)V", "create", "()Landroidx/compose/animation/RenderInTransitionOverlayNode;", "node", "", "update", "(Landroidx/compose/animation/RenderInTransitionOverlayNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "getSharedTransitionScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "setSharedTransitionScope", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "Lkotlin/jvm/functions/Function0;", "getRenderInOverlay", "()Lkotlin/jvm/functions/Function0;", "setRenderInOverlay", "(Lkotlin/jvm/functions/Function0;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getZIndexInOverlay", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RenderInTransitionOverlayNodeElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.animation.RenderInTransitionOverlayNode> {
    public static final int $stable = 0;
    private kotlin.jvm.functions.Function0<java.lang.Boolean> renderInOverlay;
    private androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScope;
    private final float zIndexInOverlay;

    public RenderInTransitionOverlayNodeElement(androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, float f) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
        this.renderInOverlay = function0;
        this.zIndexInOverlay = f;
    }

    public final androidx.compose.animation.SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    public final void setSharedTransitionScope(androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getRenderInOverlay() {
        return this.renderInOverlay;
    }

    public final void setRenderInOverlay(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.renderInOverlay = function0;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.animation.RenderInTransitionOverlayNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.RenderInTransitionOverlayNode(this.sharedTransitionScope, this.renderInOverlay, this.zIndexInOverlay);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.animation.RenderInTransitionOverlayNode node) {
        node.setSharedScope(this.sharedTransitionScope);
        node.setRenderInOverlay(this.renderInOverlay);
        node.setZIndexInOverlay(this.zIndexInOverlay);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.sharedTransitionScope.hashCode() * 31) + this.renderInOverlay.hashCode()) * 31) + java.lang.Float.hashCode(this.zIndexInOverlay);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.RenderInTransitionOverlayNodeElement)) {
            return false;
        }
        androidx.compose.animation.RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (androidx.compose.animation.RenderInTransitionOverlayNodeElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sharedTransitionScope, renderInTransitionOverlayNodeElement.sharedTransitionScope) && this.renderInOverlay == renderInTransitionOverlayNodeElement.renderInOverlay && this.zIndexInOverlay == renderInTransitionOverlayNodeElement.zIndexInOverlay;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("renderInSharedTransitionOverlay");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
        inspectorInfo.getProperties().set("renderInOverlay", this.renderInOverlay);
        inspectorInfo.getProperties().set("zIndexInOverlay", java.lang.Float.valueOf(this.zIndexInOverlay));
    }
}
