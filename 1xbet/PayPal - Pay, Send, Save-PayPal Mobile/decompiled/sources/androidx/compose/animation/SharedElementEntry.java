package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010\u001eR+\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00108W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u0010\r\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R+\u0010\u0004\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010#\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010\b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010#\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R+\u0010\n\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010#\u001a\u0004\bA\u0010%\"\u0004\bB\u0010'R+\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010#\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010#\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bM\u0010%R$\u0010O\u001a\u0004\u0018\u00010N8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010U\u001a\u0004\u0018\u00010\u00008\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0011\u0010\\\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b[\u0010%R$\u0010^\u001a\u0004\u0018\u00010]8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR/\u0010j\u001a\u0004\u0018\u00010d2\b\u0010!\u001a\u0004\u0018\u00010d8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010#\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010%R\u0014\u0010n\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010%R\u0011\u0010p\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bo\u0010%"}, d2 = {"Landroidx/compose/animation/SharedElementEntry;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/animation/SharedElement;", "sharedElement", "Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;", "placeholderSize", "", "renderOnlyWhenVisible", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "overlayClip", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "userState", "", "zIndex", "<init>", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "Landroidx/compose/ui/geometry/Rect;", "previousTargetBoundsBeforeLosingTarget", "calculateTargetBounds", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "", "drawInOverlay", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "<set-?>", "isAttached$delegate", "Landroidx/compose/runtime/MutableState;", "isAttached", "()Z", "setAttached", "(Z)V", "zIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getZIndex", "()F", "setZIndex", "(F)V", "renderInOverlayDuringTransition$delegate", "getRenderInOverlayDuringTransition", "setRenderInOverlayDuringTransition", "sharedElement$delegate", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "setSharedElement", "(Landroidx/compose/animation/SharedElement;)V", "boundsAnimation$delegate", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "setBoundsAnimation", "(Landroidx/compose/animation/BoundsAnimation;)V", "placeholderSize$delegate", "getPlaceholderSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;", "setPlaceholderSize", "(Landroidx/compose/animation/SharedTransitionScope$PlaceholderSize;)V", "renderOnlyWhenVisible$delegate", "getRenderOnlyWhenVisible", "setRenderOnlyWhenVisible", "overlayClip$delegate", "getOverlayClip", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "setOverlayClip", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "userState$delegate", "getUserState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "setUserState", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "isEnabled", "Landroidx/compose/ui/graphics/Path;", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay$animation", "()Landroidx/compose/ui/graphics/Path;", "setClipPathInOverlay$animation", "(Landroidx/compose/ui/graphics/Path;)V", "parentState", "Landroidx/compose/animation/SharedElementEntry;", "getParentState", "()Landroidx/compose/animation/SharedElementEntry;", "setParentState", "(Landroidx/compose/animation/SharedElementEntry;)V", "getTarget", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Landroidx/compose/animation/BoundsProvider;", "boundsProvider", "Landroidx/compose/animation/BoundsProvider;", "getBoundsProvider", "()Landroidx/compose/animation/BoundsProvider;", "setBoundsProvider", "(Landroidx/compose/animation/BoundsProvider;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer$delegate", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getShouldRenderInOverlay$animation", "shouldRenderInOverlay", "getShouldRenderInPlace", "shouldRenderInPlace"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedElementEntry implements androidx.compose.animation.LayerRenderer, androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;

    /* renamed from: boundsAnimation$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState boundsAnimation;
    private androidx.compose.animation.BoundsProvider boundsProvider;
    private androidx.compose.ui.graphics.Path clipPathInOverlay;

    /* renamed from: isAttached$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isAttached = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: layer$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState layer = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: overlayClip$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState overlayClip;
    private androidx.compose.animation.SharedElementEntry parentState;

    /* renamed from: placeholderSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState placeholderSize;

    /* renamed from: renderInOverlayDuringTransition$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState renderInOverlayDuringTransition;

    /* renamed from: renderOnlyWhenVisible$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState renderOnlyWhenVisible;

    /* renamed from: sharedElement$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState sharedElement;

    /* renamed from: userState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState userState;

    /* renamed from: zIndex$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState zIndex;

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    public SharedElementEntry(androidx.compose.animation.SharedElement sharedElement, androidx.compose.animation.BoundsAnimation boundsAnimation, androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize, boolean z, androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip, boolean z2, androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState, float f) {
        this.zIndex = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.renderInOverlayDuringTransition = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z2), null, 2, null);
        this.sharedElement = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeholderSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeholderSize, null, 2, null);
        this.renderOnlyWhenVisible = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z), null, 2, null);
        this.overlayClip = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAttached() {
        return ((java.lang.Boolean) this.isAttached.getValue()).booleanValue();
    }

    public final void setAttached(boolean z) {
        this.isAttached.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final float getZIndex() {
        return this.zIndex.getFloatValue();
    }

    public final void setZIndex(float f) {
        this.zIndex.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((java.lang.Boolean) this.renderInOverlayDuringTransition.getValue()).booleanValue();
    }

    public final void setRenderInOverlayDuringTransition(boolean z) {
        this.renderInOverlayDuringTransition.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.animation.SharedElement getSharedElement() {
        return (androidx.compose.animation.SharedElement) this.sharedElement.getValue();
    }

    public final void setSharedElement(androidx.compose.animation.SharedElement sharedElement) {
        this.sharedElement.setValue(sharedElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.animation.BoundsAnimation getBoundsAnimation() {
        return (androidx.compose.animation.BoundsAnimation) this.boundsAnimation.getValue();
    }

    public final void setBoundsAnimation(androidx.compose.animation.BoundsAnimation boundsAnimation) {
        this.boundsAnimation.setValue(boundsAnimation);
    }

    public final androidx.compose.animation.SharedTransitionScope.PlaceholderSize getPlaceholderSize() {
        return (androidx.compose.animation.SharedTransitionScope.PlaceholderSize) this.placeholderSize.getValue();
    }

    public final void setPlaceholderSize(androidx.compose.animation.SharedTransitionScope.PlaceholderSize placeholderSize) {
        this.placeholderSize.setValue(placeholderSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((java.lang.Boolean) this.renderOnlyWhenVisible.getValue()).booleanValue();
    }

    public final void setRenderOnlyWhenVisible(boolean z) {
        this.renderOnlyWhenVisible.setValue(java.lang.Boolean.valueOf(z));
    }

    public final androidx.compose.animation.SharedTransitionScope.OverlayClip getOverlayClip() {
        return (androidx.compose.animation.SharedTransitionScope.OverlayClip) this.overlayClip.getValue();
    }

    public final void setOverlayClip(androidx.compose.animation.SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip.setValue(overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.animation.SharedTransitionScope.SharedContentState getUserState() {
        return (androidx.compose.animation.SharedTransitionScope.SharedContentState) this.userState.getValue();
    }

    public final void setUserState(androidx.compose.animation.SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState.setValue(sharedContentState);
    }

    public final boolean isEnabled() {
        return isAttached() && getUserState().isEnabledByUser$animation();
    }

    public final androidx.compose.ui.geometry.Rect calculateTargetBounds(androidx.compose.ui.geometry.Rect previousTargetBoundsBeforeLosingTarget) {
        return getUserState().getConfig$animation().m1143alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(getUserState(), previousTargetBoundsBeforeLosingTarget, androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(getSharedElement().getScope().getLookaheadRoot$animation().mo7361getSizeYbymL2g()));
    }

    /* renamed from: getClipPathInOverlay$animation, reason: from getter */
    public final androidx.compose.ui.graphics.Path getClipPathInOverlay() {
        return this.clipPathInOverlay;
    }

    public final void setClipPathInOverlay$animation(androidx.compose.ui.graphics.Path path) {
        this.clipPathInOverlay = path;
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final void drawInOverlay(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.geometry.Rect currentBounds;
        androidx.compose.ui.graphics.layer.GraphicsLayer layer = getLayer();
        if (layer == null || (currentBounds = getSharedElement().getState$animation().getCurrentBounds()) == null || !getShouldRenderInOverlay$animation()) {
            return;
        }
        long m5787getTopLeftF1C5BW0 = currentBounds.m5787getTopLeftF1C5BW0();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5787getTopLeftF1C5BW0 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5787getTopLeftF1C5BW0 & 4294967295L));
        androidx.compose.ui.graphics.Path path = this.clipPathInOverlay;
        if (path != null) {
            int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
            long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6455clipPathmtrdDE(path, m5985getIntersectrtfAjoo);
                drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                try {
                    androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(drawScope, layer);
                    return;
                } finally {
                }
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            }
        }
        drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
        try {
            androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(drawScope, layer);
        } finally {
        }
    }

    @Override // androidx.compose.animation.LayerRenderer
    public final androidx.compose.animation.SharedElementEntry getParentState() {
        return this.parentState;
    }

    public final void setParentState(androidx.compose.animation.SharedElementEntry sharedElementEntry) {
        this.parentState = sharedElementEntry;
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    public final androidx.compose.animation.BoundsProvider getBoundsProvider() {
        return this.boundsProvider;
    }

    public final void setBoundsProvider(androidx.compose.animation.BoundsProvider boundsProvider) {
        this.boundsProvider = boundsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.graphics.layer.GraphicsLayer getLayer() {
        return (androidx.compose.ui.graphics.layer.GraphicsLayer) this.layer.getValue();
    }

    public final void setLayer(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
        this.layer.setValue(graphicsLayer);
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        if (getBoundsAnimation().getTarget()) {
            return true;
        }
        return (getSharedElement().getState$animation().getMatchIsOrHasBeenConfigured() && !getSharedElement().getState$animation().getActiveMatchFound()) || !getRenderOnlyWhenVisible();
    }

    public final boolean getShouldRenderInOverlay$animation() {
        return getHighSpeedVideoFpsRanges() && getSharedElement().getBoundsTransformIsActive() && isEnabled() && getRenderInOverlayDuringTransition() && getSharedElement().getScope().isTransitionActive();
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getBoundsTransformIsActive()) {
            return !getShouldRenderInOverlay$animation() && getHighSpeedVideoFpsRanges();
        }
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        getSharedElement().getScope().onEntryAdded$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        getSharedElement().getScope().onEntryRemoved$animation(this);
        getSharedElement().invalidateTargetBoundsProvider();
    }
}
