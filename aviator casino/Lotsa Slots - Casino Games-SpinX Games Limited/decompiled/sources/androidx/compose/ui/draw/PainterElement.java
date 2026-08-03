package androidx.compose.ui.draw;

/* compiled from: PainterModifier.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\b\u0010#\u001a\u00020\u0002H\u0016J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002H\u0016J\f\u0010.\u001a\u00020,*\u00020/H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/PainterNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getAlpha", "()F", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getSizeToIntrinsics", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.draw.PainterNode> {
    private final androidx.compose.ui.Alignment alignment;
    private final float alpha;
    private final androidx.compose.ui.graphics.ColorFilter colorFilter;
    private final androidx.compose.ui.layout.ContentScale contentScale;
    private final androidx.compose.ui.graphics.painter.Painter painter;
    private final boolean sizeToIntrinsics;

    public static /* synthetic */ androidx.compose.ui.draw.PainterElement copy$default(androidx.compose.ui.draw.PainterElement painterElement, androidx.compose.ui.graphics.painter.Painter painter, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            painter = painterElement.painter;
        }
        if ((i & 2) != 0) {
            z = painterElement.sizeToIntrinsics;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            alignment = painterElement.alignment;
        }
        androidx.compose.ui.Alignment alignment2 = alignment;
        if ((i & 8) != 0) {
            contentScale = painterElement.contentScale;
        }
        androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
        if ((i & 16) != 0) {
            f = painterElement.alpha;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            colorFilter = painterElement.colorFilter;
        }
        return painterElement.copy(painter, z2, alignment2, contentScale2, f2, colorFilter);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.graphics.painter.Painter getPainter() {
        return this.painter;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    /* renamed from: component5, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component6, reason: from getter */
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final androidx.compose.ui.draw.PainterElement copy(androidx.compose.ui.graphics.painter.Painter painter, boolean sizeToIntrinsics, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        return new androidx.compose.ui.draw.PainterElement(painter, sizeToIntrinsics, alignment, contentScale, alpha, colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.draw.PainterElement)) {
            return false;
        }
        androidx.compose.ui.draw.PainterElement painterElement = (androidx.compose.ui.draw.PainterElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && kotlin.jvm.internal.Intrinsics.areEqual(this.alignment, painterElement.alignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentScale, painterElement.contentScale) && java.lang.Float.compare(this.alpha, painterElement.alpha) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.colorFilter, painterElement.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((((this.painter.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.alpha)) * 31;
        androidx.compose.ui.graphics.ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public java.lang.String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public final androidx.compose.ui.graphics.painter.Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public PainterElement(androidx.compose.ui.graphics.painter.Painter painter, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.ui.draw.PainterNode create() {
        return new androidx.compose.ui.draw.PainterNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.ui.draw.PainterNode node) {
        boolean sizeToIntrinsics = node.getSizeToIntrinsics();
        boolean z = this.sizeToIntrinsics;
        boolean z2 = sizeToIntrinsics != z || (z && !androidx.compose.ui.geometry.Size.m1936equalsimpl0(node.getPainter().mo2745getIntrinsicSizeNHjbRc(), this.painter.mo2745getIntrinsicSizeNHjbRc()));
        node.setPainter(this.painter);
        node.setSizeToIntrinsics(this.sizeToIntrinsics);
        node.setAlignment(this.alignment);
        node.setContentScale(this.contentScale);
        node.setAlpha(this.alpha);
        node.setColorFilter(this.colorFilter);
        if (z2) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(node);
        }
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(node);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("sizeToIntrinsics", java.lang.Boolean.valueOf(this.sizeToIntrinsics));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", java.lang.Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }
}
