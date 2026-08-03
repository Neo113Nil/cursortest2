package coil.compose;

/* compiled from: SubcomposeAsyncImage.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0002HÂ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J]\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0015\u0010+\u001a\u00020,*\u00020,2\u0006\u0010\b\u001a\u00020\tH\u0097\u0001J\u0013\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\r\u00102\u001a\u00020,*\u00020,H\u0097\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcoil/compose/RealSubcomposeAsyncImageScope;", "Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/foundation/layout/BoxScope;", "parentScope", "painter", "Lcoil/compose/AsyncImagePainter;", "contentDescription", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "clipToBounds", "", "<init>", "(Landroidx/compose/foundation/layout/BoxScope;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Z)V", "getPainter", "()Lcoil/compose/AsyncImagePainter;", "getContentDescription", "()Ljava/lang/String;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getAlpha", "()F", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getClipToBounds", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "align", "Landroidx/compose/ui/Modifier;", "equals", "other", "", "hashCode", "", "matchParentSize", "toString", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class RealSubcomposeAsyncImageScope implements coil.compose.SubcomposeAsyncImageScope, androidx.compose.foundation.layout.BoxScope {
    private final androidx.compose.ui.Alignment alignment;
    private final float alpha;
    private final boolean clipToBounds;
    private final androidx.compose.ui.graphics.ColorFilter colorFilter;
    private final java.lang.String contentDescription;
    private final androidx.compose.ui.layout.ContentScale contentScale;
    private final coil.compose.AsyncImagePainter painter;
    private final androidx.compose.foundation.layout.BoxScope parentScope;

    /* renamed from: component1, reason: from getter */
    private final androidx.compose.foundation.layout.BoxScope getParentScope() {
        return this.parentScope;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment) {
        return this.parentScope.align(modifier, alignment);
    }

    /* renamed from: component2, reason: from getter */
    public final coil.compose.AsyncImagePainter getPainter() {
        return this.painter;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component5, reason: from getter */
    public final androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    /* renamed from: component6, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component7, reason: from getter */
    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final coil.compose.RealSubcomposeAsyncImageScope copy(androidx.compose.foundation.layout.BoxScope parentScope, coil.compose.AsyncImagePainter painter, java.lang.String contentDescription, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, boolean clipToBounds) {
        return new coil.compose.RealSubcomposeAsyncImageScope(parentScope, painter, contentDescription, alignment, contentScale, alpha, colorFilter, clipToBounds);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil.compose.RealSubcomposeAsyncImageScope)) {
            return false;
        }
        coil.compose.RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (coil.compose.RealSubcomposeAsyncImageScope) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.parentScope, realSubcomposeAsyncImageScope.parentScope) && kotlin.jvm.internal.Intrinsics.areEqual(this.painter, realSubcomposeAsyncImageScope.painter) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentDescription, realSubcomposeAsyncImageScope.contentDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.alignment, realSubcomposeAsyncImageScope.alignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentScale, realSubcomposeAsyncImageScope.contentScale) && java.lang.Float.compare(this.alpha, realSubcomposeAsyncImageScope.alpha) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.colorFilter, realSubcomposeAsyncImageScope.colorFilter) && this.clipToBounds == realSubcomposeAsyncImageScope.clipToBounds;
    }

    public int hashCode() {
        int hashCode = ((this.parentScope.hashCode() * 31) + this.painter.hashCode()) * 31;
        java.lang.String str = this.contentDescription;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.alpha)) * 31;
        androidx.compose.ui.graphics.ColorFilter colorFilter = this.colorFilter;
        return ((hashCode2 + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.clipToBounds);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public androidx.compose.ui.Modifier matchParentSize(androidx.compose.ui.Modifier modifier) {
        return this.parentScope.matchParentSize(modifier);
    }

    public java.lang.String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.parentScope + ", painter=" + this.painter + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ", clipToBounds=" + this.clipToBounds + ')';
    }

    public RealSubcomposeAsyncImageScope(androidx.compose.foundation.layout.BoxScope boxScope, coil.compose.AsyncImagePainter asyncImagePainter, java.lang.String str, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, boolean z) {
        this.parentScope = boxScope;
        this.painter = asyncImagePainter;
        this.contentDescription = str;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
        this.clipToBounds = z;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public coil.compose.AsyncImagePainter getPainter() {
        return this.painter;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public androidx.compose.ui.Alignment getAlignment() {
        return this.alignment;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public androidx.compose.ui.layout.ContentScale getContentScale() {
        return this.contentScale;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }
}
