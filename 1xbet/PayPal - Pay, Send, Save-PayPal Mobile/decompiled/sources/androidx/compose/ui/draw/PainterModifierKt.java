package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/painter/Painter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "", "sizeToIntrinsics", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "paint", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PainterModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier paint$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.painter.Painter painter, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        }
        androidx.compose.ui.Alignment alignment2 = alignment;
        if ((i & 8) != 0) {
            contentScale = androidx.compose.ui.layout.ContentScale.INSTANCE.getInside();
        }
        androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z2, alignment2, contentScale2, f2, colorFilter);
    }

    public static final androidx.compose.ui.Modifier paint(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.painter.Painter painter, boolean z, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, float f, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        return modifier.then(new androidx.compose.ui.draw.PainterElement(painter, z, alignment, contentScale, f, colorFilter));
    }
}
