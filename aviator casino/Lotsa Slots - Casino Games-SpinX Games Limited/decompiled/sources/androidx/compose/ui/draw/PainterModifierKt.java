package androidx.compose.ui.draw;

/* compiled from: PainterModifier.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PainterModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier paint$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.painter.Painter painter, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, java.lang.Object obj) {
        boolean z2 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        }
        androidx.compose.ui.Alignment alignment2 = alignment;
        if ((i & 8) != 0) {
            contentScale = androidx.compose.ui.layout.ContentScale.INSTANCE.getInside();
        }
        androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
        float f2 = (i & 16) != 0 ? 1.0f : f;
        if ((i & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z2, alignment2, contentScale2, f2, colorFilter);
    }

    public static final androidx.compose.ui.Modifier paint(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.painter.Painter painter, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        return modifier.then(new androidx.compose.ui.draw.PainterElement(painter, z, alignment, contentScale, f, colorFilter));
    }
}
