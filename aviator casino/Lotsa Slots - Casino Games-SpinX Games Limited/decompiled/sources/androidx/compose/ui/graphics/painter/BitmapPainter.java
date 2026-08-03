package androidx.compose.ui.graphics.painter;

/* compiled from: BitmapPainter.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0013\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\"\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\f\u0010'\u001a\u00020(*\u00020)H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u00020\u000eX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I$ui_graphics_release", "()I", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "I", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "size", "J", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "validateSize", "validateSize-N5eqBDc", "(JJ)J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitmapPainter extends androidx.compose.ui.graphics.painter.Painter {
    private float alpha;
    private androidx.compose.ui.graphics.ColorFilter colorFilter;
    private int filterQuality;
    private final androidx.compose.ui.graphics.ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j, j2);
    }

    public /* synthetic */ BitmapPainter(androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : j, (i & 4) != 0 ? androidx.compose.ui.unit.IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2, null);
    }

    private BitmapPainter(androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = androidx.compose.ui.graphics.FilterQuality.INSTANCE.m2214getLowfv9h1I();
        this.size = m2743validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name and from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m2746setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.filterQuality = i;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2661drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, androidx.compose.ui.unit.IntSizeKt.IntSize(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc())), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo2745getIntrinsicSizeNHjbRc() {
        return androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(this.size);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m2743validateSizeN5eqBDc(long srcOffset, long srcSize) {
        if (androidx.compose.ui.unit.IntOffset.m4610getXimpl(srcOffset) < 0 || androidx.compose.ui.unit.IntOffset.m4611getYimpl(srcOffset) < 0 || androidx.compose.ui.unit.IntSize.m4652getWidthimpl(srcSize) < 0 || androidx.compose.ui.unit.IntSize.m4651getHeightimpl(srcSize) < 0 || androidx.compose.ui.unit.IntSize.m4652getWidthimpl(srcSize) > this.image.getWidth() || androidx.compose.ui.unit.IntSize.m4651getHeightimpl(srcSize) > this.image.getHeight()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return srcSize;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.graphics.painter.BitmapPainter)) {
            return false;
        }
        androidx.compose.ui.graphics.painter.BitmapPainter bitmapPainter = (androidx.compose.ui.graphics.painter.BitmapPainter) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, bitmapPainter.image) && androidx.compose.ui.unit.IntOffset.m4609equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && androidx.compose.ui.unit.IntSize.m4650equalsimpl0(this.srcSize, bitmapPainter.srcSize) && androidx.compose.ui.graphics.FilterQuality.m2209equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + androidx.compose.ui.unit.IntOffset.m4612hashCodeimpl(this.srcOffset)) * 31) + androidx.compose.ui.unit.IntSize.m4653hashCodeimpl(this.srcSize)) * 31) + androidx.compose.ui.graphics.FilterQuality.m2210hashCodeimpl(this.filterQuality);
    }

    public java.lang.String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((java.lang.Object) androidx.compose.ui.unit.IntOffset.m4617toStringimpl(this.srcOffset)) + ", srcSize=" + ((java.lang.Object) androidx.compose.ui.unit.IntSize.m4655toStringimpl(this.srcSize)) + ", filterQuality=" + ((java.lang.Object) androidx.compose.ui.graphics.FilterQuality.m2211toStringimpl(this.filterQuality)) + ')';
    }
}
