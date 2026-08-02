package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "", "drawLayer", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/Outline;", "outline", "setOutline", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/Outline;)V", "", "DefaultCameraDistance", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void setOutline(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, androidx.compose.ui.graphics.Outline outline) {
        if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
            androidx.compose.ui.graphics.Outline.Rectangle rectangle = (androidx.compose.ui.graphics.Outline.Rectangle) outline;
            float left = rectangle.getRect().getLeft();
            float top = rectangle.getRect().getTop();
            long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(left) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L));
            androidx.compose.ui.geometry.Rect rect = rectangle.getRect();
            float right = rect.getRight();
            float left2 = rect.getLeft();
            androidx.compose.ui.geometry.Rect rect2 = rectangle.getRect();
            graphicsLayer.m6629setRectOutlinetz77jQw(m5744constructorimpl, androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(rect2.getBottom() - rect2.getTop()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(right - left2) << 32)));
            return;
        }
        if (outline instanceof androidx.compose.ui.graphics.Outline.Generic) {
            graphicsLayer.setPathOutline(((androidx.compose.ui.graphics.Outline.Generic) outline).getPath());
            return;
        }
        if (!(outline instanceof androidx.compose.ui.graphics.Outline.Rounded)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
        if (rounded.getRoundRectPath() != null) {
            graphicsLayer.setPathOutline(rounded.getRoundRectPath());
            return;
        }
        androidx.compose.ui.geometry.RoundRect roundRect = rounded.getRoundRect();
        float left3 = roundRect.getLeft();
        float top2 = roundRect.getTop();
        long m5744constructorimpl2 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(left3) << 32) | (java.lang.Float.floatToRawIntBits(top2) & 4294967295L));
        float width = roundRect.getWidth();
        graphicsLayer.m6630setRoundRectOutlineTNW_H78(m5744constructorimpl2, androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(roundRect.getHeight()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(width) << 32)), java.lang.Float.intBitsToFloat((int) (roundRect.m5800getBottomLeftCornerRadiuskKHJgLs() >> 32)));
    }

    public static final void drawLayer(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
        graphicsLayer.draw$ui_graphics(drawScope.getDrawContext().getCanvas(), drawScope.getDrawContext().getGraphicsLayer());
    }
}
