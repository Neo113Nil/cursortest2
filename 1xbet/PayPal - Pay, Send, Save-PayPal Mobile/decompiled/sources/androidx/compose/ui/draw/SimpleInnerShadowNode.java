package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\r\u001a\u00020\n*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/draw/SimpleInnerShadowNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/shadow/Shadow;", "shadow", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;)V", "", "update", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "onObservedReadsChanged", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/Shape;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/shadow/Shadow;", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleInnerShadowNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.ObserverModifierNode {
    public static final int $stable = 8;
    private androidx.compose.ui.graphics.shadow.Shadow getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Shape getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.shadow.InnerShadowPainter getHighSpeedVideoFpsRanges;

    public SimpleInnerShadowNode(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
        this.getHighSpeedVideoSizes = shape;
        this.getHighResolutionOutputSizeshNQ4ISI = shadow;
    }

    public final void update(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, shape) || !kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, shadow)) {
            this.getHighSpeedVideoFpsRanges = null;
        }
        this.getHighSpeedVideoSizes = shape;
        this.getHighResolutionOutputSizeshNQ4ISI = shadow;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.getHighSpeedVideoFpsRanges = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.compose.ui.draw.SimpleInnerShadowNode simpleInnerShadowNode = (androidx.compose.ui.draw.SimpleInnerShadowNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, simpleInnerShadowNode.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, simpleInnerShadowNode.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.graphics.shadow.InnerShadowPainter innerShadowPainter = this.getHighSpeedVideoFpsRanges;
        if (innerShadowPainter == null) {
            innerShadowPainter = androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createInnerShadowPainter(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges = innerShadowPainter;
        }
        androidx.compose.ui.graphics.painter.Painter.m6651drawx_KDEd0$default(innerShadowPainter, contentDrawScope, contentDrawScope.mo6531getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }
}
