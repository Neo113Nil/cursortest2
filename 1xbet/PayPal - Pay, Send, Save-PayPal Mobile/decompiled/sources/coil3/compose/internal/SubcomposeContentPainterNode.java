package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterNode;", "Lcoil3/compose/internal/AbstractContentPainterNode;", "Landroidx/compose/ui/graphics/painter/Painter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "clipToBounds", "", "contentDescription", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLjava/lang/String;)V", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubcomposeContentPainterNode extends coil3.compose.internal.AbstractContentPainterNode {
    public static final int $stable = 8;
    private androidx.compose.ui.graphics.painter.Painter painter;

    public SubcomposeContentPainterNode(androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, boolean z, java.lang.String str) {
        super(alignment, contentScale, f, colorFilter, z, str, null);
        this.painter = painter;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public final androidx.compose.ui.graphics.painter.Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(androidx.compose.ui.graphics.painter.Painter painter) {
        this.painter = painter;
    }
}
