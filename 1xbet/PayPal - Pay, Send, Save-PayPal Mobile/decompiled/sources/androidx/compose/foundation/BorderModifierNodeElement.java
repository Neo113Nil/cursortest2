package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/BorderModifierNode;", "node", "", "update", "(Landroidx/compose/foundation/BorderModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1-D9Ej5fM", "()F", "component1", "component2", "()Landroidx/compose/ui/graphics/Brush;", "component3", "()Landroidx/compose/ui/graphics/Shape;", "copy-8Feqmps", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/foundation/BorderModifierNodeElement;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWidth-D9Ej5fM", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "Landroidx/compose/ui/graphics/Shape;", "getShape"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BorderModifierNodeElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.BorderModifierNode> {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.Brush brush;
    private final androidx.compose.ui.graphics.Shape shape;
    private final float width;

    private BorderModifierNodeElement(float f, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
    }

    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.brush;
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1308getWidthD9Ej5fM() {
        return this.width;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.BorderModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.BorderModifierNode node) {
        node.m1304setWidth0680j_4(this.width);
        node.setBrush(this.brush);
        node.setShape(this.shape);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName(androidx.compose.material.OutlinedTextFieldKt.BorderId);
        inspectorInfo.getProperties().set("width", androidx.compose.ui.unit.Dp.m8599boximpl(this.width));
        if (this.brush instanceof androidx.compose.ui.graphics.SolidColor) {
            inspectorInfo.getProperties().set(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, androidx.compose.ui.graphics.Color.m5986boximpl(((androidx.compose.ui.graphics.SolidColor) this.brush).getValue()));
            inspectorInfo.setValue(androidx.compose.ui.graphics.Color.m5986boximpl(((androidx.compose.ui.graphics.SolidColor) this.brush).getValue()));
        } else {
            inspectorInfo.getProperties().set("brush", this.brush);
        }
        inspectorInfo.getProperties().set(com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, this.shape);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BorderModifierNodeElement(width=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.width));
        sb.append(", brush=");
        sb.append(this.brush);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.BorderModifierNodeElement)) {
            return false;
        }
        androidx.compose.foundation.BorderModifierNodeElement borderModifierNodeElement = (androidx.compose.foundation.BorderModifierNodeElement) other;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.width, borderModifierNodeElement.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.brush, borderModifierNodeElement.brush) && kotlin.jvm.internal.Intrinsics.areEqual(this.shape, borderModifierNodeElement.shape);
    }

    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final androidx.compose.foundation.BorderModifierNodeElement m1307copy8Feqmps(float width, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape) {
        return new androidx.compose.foundation.BorderModifierNodeElement(width, brush, shape, null);
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.brush;
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.BorderModifierNodeElement m1305copy8Feqmps$default(androidx.compose.foundation.BorderModifierNodeElement borderModifierNodeElement, float f, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = borderModifierNodeElement.width;
        }
        if ((i & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m1307copy8Feqmps(f, brush, shape);
    }

    public /* synthetic */ BorderModifierNodeElement(float f, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }
}
