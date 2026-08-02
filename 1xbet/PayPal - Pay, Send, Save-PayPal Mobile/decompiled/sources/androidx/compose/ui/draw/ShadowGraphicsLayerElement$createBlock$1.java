package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ShadowGraphicsLayerElement$createBlock$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.draw.ShadowGraphicsLayerElement getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        getHighResolutionOutputSizeshNQ4ISI(graphicsLayerScope);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo1418toPx0680j_4(this.getHighSpeedVideoFpsRanges.m5610getElevationD9Ej5fM()));
        graphicsLayerScope.setShape(this.getHighSpeedVideoFpsRanges.getShape());
        graphicsLayerScope.setClip(this.getHighSpeedVideoFpsRanges.getClip());
        graphicsLayerScope.mo6176setAmbientShadowColor8_81llA(this.getHighSpeedVideoFpsRanges.m5609getAmbientColor0d7_KjU());
        graphicsLayerScope.mo6179setSpotShadowColor8_81llA(this.getHighSpeedVideoFpsRanges.m5611getSpotColor0d7_KjU());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShadowGraphicsLayerElement$createBlock$1(androidx.compose.ui.draw.ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.getHighSpeedVideoFpsRanges = shadowGraphicsLayerElement;
    }
}
