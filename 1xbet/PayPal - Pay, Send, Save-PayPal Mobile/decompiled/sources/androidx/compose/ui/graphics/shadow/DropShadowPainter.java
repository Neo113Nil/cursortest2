package androidx.compose.ui.graphics.shadow;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R\u0016\u0010\"\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0014\u0010,\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/shadow/Shadow;", "shadow", "Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "renderCreator", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;)V", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/graphics/Shape;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/shadow/Shadow;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/ColorFilter;", "getOutputMinFrameDuration", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DropShadowPainter extends androidx.compose.ui.graphics.painter.Painter {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.shadow.Shadow getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.unit.LayoutDirection getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.ColorFilter getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.shadow.DropShadowRendererProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Shape getHighResolutionOutputSizeshNQ4ISI;

    public DropShadowPainter(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow, androidx.compose.ui.graphics.shadow.DropShadowRendererProvider dropShadowRendererProvider) {
        this.getHighResolutionOutputSizeshNQ4ISI = shape;
        this.getHighSpeedVideoFpsRanges = shadow;
        this.Camera2StreamConfigurationMap = dropShadowRendererProvider;
        this.getHighSpeedVideoFpsRangesFor = 1.0f;
        this.getHighSpeedVideoSizes = androidx.compose.ui.unit.LayoutDirection.Ltr;
    }

    public DropShadowPainter(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.shadow.Shadow shadow) {
        this(shape, shadow, androidx.compose.ui.graphics.shadow.DropShadowRendererProvider.INSTANCE.getDefault());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        return androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.shadow.DropShadowRenderer mo6653obtainDropShadowRenderereZhPAX0 = this.Camera2StreamConfigurationMap.mo6653obtainDropShadowRenderereZhPAX0(this.getHighResolutionOutputSizeshNQ4ISI, drawScope.mo6531getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope, this.getHighSpeedVideoFpsRanges);
        float f = drawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.DpOffset.m8662getXD9Ej5fM(this.getHighSpeedVideoFpsRanges.getOffset()));
        float f2 = drawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.DpOffset.m8664getYD9Ej5fM(this.getHighSpeedVideoFpsRanges.getOffset()));
        drawScope.getDrawContext().getTransform().translate(f, f2);
        try {
            mo6653obtainDropShadowRenderereZhPAX0.m6669drawShadowerFMhIw(drawScope, this.getOutputMinFrameDuration, drawScope.mo6531getSizeNHjbRc(), mo6653obtainDropShadowRenderereZhPAX0.getShadow().getColor(), mo6653obtainDropShadowRenderereZhPAX0.getShadow().getBrush(), kotlin.ranges.RangesKt.coerceIn(this.getHighSpeedVideoFpsRangesFor * mo6653obtainDropShadowRenderereZhPAX0.getShadow().getAlpha(), 0.0f, 1.0f), mo6653obtainDropShadowRenderereZhPAX0.getShadow().getBlendMode());
        } finally {
            drawScope.getDrawContext().getTransform().translate(-f, -f2);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float alpha) {
        this.getHighSpeedVideoFpsRangesFor = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getOutputMinFrameDuration = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.getHighSpeedVideoSizes = layoutDirection;
        return true;
    }
}
