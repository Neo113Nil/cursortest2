package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0015"}, d2 = {"Landroidx/compose/ui/draw/SimpleInnerShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/SimpleInnerShadowNode;", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/shadow/Shadow;", "shadow", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;)V", "create", "()Landroidx/compose/ui/draw/SimpleInnerShadowNode;", "node", "", "update", "(Landroidx/compose/ui/draw/SimpleInnerShadowNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/ui/graphics/Shape;", "component2", "()Landroidx/compose/ui/graphics/shadow/Shadow;", "copy", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/draw/SimpleInnerShadowElement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Shape;", "getShape", "Landroidx/compose/ui/graphics/shadow/Shadow;", "getShadow"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SimpleInnerShadowElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.draw.SimpleInnerShadowNode> {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.shadow.Shadow shadow;
    private final androidx.compose.ui.graphics.Shape shape;

    public SimpleInnerShadowElement(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    public final androidx.compose.ui.graphics.shadow.Shadow getShadow() {
        return this.shadow;
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final androidx.compose.ui.draw.SimpleInnerShadowNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.draw.SimpleInnerShadowNode(this.shape, this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.draw.SimpleInnerShadowNode node) {
        node.update(this.shape, this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("innerShadow");
        inspectorInfo.getProperties().set(com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, this.shape);
        inspectorInfo.getProperties().set("innerShadow", this.shadow);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SimpleInnerShadowElement(shape=");
        sb.append(this.shape);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.shape.hashCode() * 31) + this.shadow.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.draw.SimpleInnerShadowElement)) {
            return false;
        }
        androidx.compose.ui.draw.SimpleInnerShadowElement simpleInnerShadowElement = (androidx.compose.ui.draw.SimpleInnerShadowElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.shape, simpleInnerShadowElement.shape) && kotlin.jvm.internal.Intrinsics.areEqual(this.shadow, simpleInnerShadowElement.shadow);
    }

    public final androidx.compose.ui.draw.SimpleInnerShadowElement copy(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
        return new androidx.compose.ui.draw.SimpleInnerShadowElement(shape, shadow);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.graphics.shadow.Shadow getShadow() {
        return this.shadow;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    public static /* synthetic */ androidx.compose.ui.draw.SimpleInnerShadowElement copy$default(androidx.compose.ui.draw.SimpleInnerShadowElement simpleInnerShadowElement, androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            shape = simpleInnerShadowElement.shape;
        }
        if ((i & 2) != 0) {
            shadow = simpleInnerShadowElement.shadow;
        }
        return simpleInnerShadowElement.copy(shape, shadow);
    }
}
