package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcoil3/compose/ImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Lcoil3/Image;", "image", "<init>", "(Lcoil3/Image;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Lcoil3/Image;", "getImage", "()Lcoil3/Image;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImagePainter extends androidx.compose.ui.graphics.painter.Painter {
    public static final int $stable = 8;
    private final coil3.Image image;

    public ImagePainter(coil3.Image image) {
        this.image = image;
    }

    public final coil3.Image getImage() {
        return this.image;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        int width = this.image.getWidth();
        float f = width > 0 ? width : Float.NaN;
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(this.image.getHeight() > 0 ? r2 : Float.NaN) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        int width = this.image.getWidth();
        float intBitsToFloat = width > 0 ? java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)) / width : 1.0f;
        int height = this.image.getHeight();
        float intBitsToFloat2 = height > 0 ? java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)) / height : 1.0f;
        long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6460scale0AR0LA0(intBitsToFloat, intBitsToFloat2, m5768getZeroF1C5BW0);
            this.image.draw(coil3.compose.ImagePainter_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()));
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
        }
    }
}
