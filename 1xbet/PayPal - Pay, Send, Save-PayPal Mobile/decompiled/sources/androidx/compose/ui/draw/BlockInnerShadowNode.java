package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B(\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0013\u001a\u00020\b*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010!\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010(R\u0016\u0010\u0010\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R'\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t8\u0002@CX\u0082\f¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u0014\u00100\u001a\u00020-8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R*\u00104\u001a\u00020-2\u0006\u00103\u001a\u00020-8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010/\"\u0004\b7\u00108R*\u00109\u001a\u00020-2\u0006\u00103\u001a\u00020-8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b9\u00105\u001a\u0004\b:\u0010/\"\u0004\b;\u00108R*\u0010=\u001a\u00020<2\u0006\u00103\u001a\u00020<8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010D\u001a\u00020C2\u0006\u00103\u001a\u00020C8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR.\u0010H\u001a\u0004\u0018\u00010G2\b\u00103\u001a\u0004\u0018\u00010G8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010N\u001a\u00020-2\u0006\u00103\u001a\u00020-8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bN\u00105\u001a\u0004\bO\u0010/\"\u0004\bP\u00108R*\u0010R\u001a\u00020Q2\u0006\u00103\u001a\u00020Q8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u001d\"\u0004\bU\u0010V"}, d2 = {"Landroidx/compose/ui/draw/BlockInnerShadowNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/draw/InnerShadowScope;", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function1;)V", "onAttach", "()V", "onDensityChange", "getHighResolutionOutputSizeshNQ4ISI", "update", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "onObservedReadsChanged", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/Density;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/shadow/Shadow;", "getInputFormats", "Landroidx/compose/ui/graphics/shadow/Shadow;", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "getHighSpeedVideoSizes", "Z", "Lkotlin/jvm/functions/Function1;", "getOutputFormats", "", "getDensity", "()F", "density", "getFontScale", "fontScale", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "radius", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getRadius", "setRadius", "(F)V", "spread", "getSpread", "setSpread", "Landroidx/compose/ui/geometry/Offset;", "offset", "J", "getOffset-F1C5BW0", "()J", "setOffset-k-4lQ0M", "(J)V", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "getColor-0d7_KjU", "setColor-8_81llA", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "alpha", "getAlpha", "setAlpha", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", com.visa.cbp.getEncExpo.warmup, "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlockInnerShadowNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.draw.InnerShadowScope {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.shadow.InnerShadowPainter getHighSpeedVideoSizes;
    private androidx.compose.ui.graphics.Brush brush;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.InnerShadowScope, kotlin.Unit> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Density Camera2StreamConfigurationMap;
    private androidx.compose.ui.graphics.Shape getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.shadow.Shadow getHighSpeedVideoFpsRanges;
    private float radius;
    private float spread;
    private long offset = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    private long color = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
    private float alpha = 1.0f;
    private int blendMode = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU();

    public BlockInnerShadowNode(androidx.compose.ui.graphics.Shape shape, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.InnerShadowScope, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = shape;
        this.getOutputFormats = function1;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        androidx.compose.ui.unit.Density density = this.Camera2StreamConfigurationMap;
        if (density != null) {
            return density.getDensity();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        androidx.compose.ui.unit.Density density = this.Camera2StreamConfigurationMap;
        if (density != null) {
            return density.getFontScale();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final float getRadius() {
        return this.radius;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setRadius(float f) {
        if (this.radius == f) {
            return;
        }
        this.radius = f;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final float getSpread() {
        return this.spread;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setSpread(float f) {
        if (this.spread == f) {
            return;
        }
        this.spread = f;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getOffset-F1C5BW0, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setOffset-k-4lQ0M */
    public final void mo5538setOffsetk4lQ0M(long j) {
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.offset, j)) {
            return;
        }
        this.offset = j;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getColor-0d7_KjU, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setColor-8_81llA */
    public final void mo5537setColor8_81llA(long j) {
        if (j == 16) {
            j = androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.color, j)) {
            return;
        }
        this.color = j;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setBrush(androidx.compose.ui.graphics.Brush brush) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public final void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* renamed from: setBlendMode-s9anfk8 */
    public final void mo5536setBlendModes9anfk8(int i) {
        if (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.blendMode, i)) {
            return;
        }
        this.blendMode = i;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        if (getIsAttached()) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.unit.Density requireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, requireDensity)) {
            return;
        }
        this.Camera2StreamConfigurationMap = requireDensity;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void update(androidx.compose.ui.graphics.Shape shape, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.InnerShadowScope, kotlin.Unit> block) {
        this.getHighSpeedVideoFpsRangesFor = shape;
        if (this.getOutputFormats != block) {
            this.getOutputFormats = block;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof androidx.compose.ui.draw.BlockInnerShadowNode)) {
            androidx.compose.ui.draw.BlockInnerShadowNode blockInnerShadowNode = (androidx.compose.ui.draw.BlockInnerShadowNode) other;
            return getAlpha() == blockInnerShadowNode.getAlpha() && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, blockInnerShadowNode.getHighSpeedVideoFpsRangesFor) && this.getOutputFormats == blockInnerShadowNode.getOutputFormats && getRadius() == blockInnerShadowNode.getRadius() && getSpread() == blockInnerShadowNode.getSpread() && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(getOffset(), blockInnerShadowNode.getOffset()) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(getColor(), blockInnerShadowNode.getColor()) && kotlin.jvm.internal.Intrinsics.areEqual(getBrush(), blockInnerShadowNode.getBrush()) && androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(getBlendMode(), blockInnerShadowNode.getBlendMode());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(getAlpha());
        int hashCode2 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int hashCode3 = this.getOutputFormats.hashCode();
        int hashCode4 = java.lang.Float.hashCode(getRadius());
        int hashCode5 = java.lang.Float.hashCode(getSpread());
        int m5754hashCodeimpl = androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(getOffset());
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(getColor());
        androidx.compose.ui.graphics.Brush brush = getBrush();
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + m5754hashCodeimpl) * 31) + m6003hashCodeimpl) * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.BlendMode.m5907hashCodeimpl(getBlendMode());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.graphics.shadow.Shadow shadow;
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            androidx.compose.ui.draw.ShadowKt.getHighSpeedVideoSizes(this);
            androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.draw.BlockInnerShadowNode$obtainPainter$1
                public final void getHighSpeedVideoFpsRangesFor() {
                    kotlin.jvm.functions.Function1 function1;
                    function1 = androidx.compose.ui.draw.BlockInnerShadowNode.this.getOutputFormats;
                    function1.invoke(androidx.compose.ui.draw.BlockInnerShadowNode.this);
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoFpsRangesFor();
                    return kotlin.Unit.INSTANCE;
                }

                {
                    super(0);
                }
            });
        }
        androidx.compose.ui.graphics.shadow.Shadow shadow2 = this.getHighSpeedVideoFpsRanges;
        androidx.compose.ui.graphics.shadow.InnerShadowPainter innerShadowPainter = this.getHighSpeedVideoSizes;
        androidx.compose.ui.graphics.Brush brush = getBrush();
        float f = mo1414toDpu2uoSUM(getRadius());
        float f2 = mo1414toDpu2uoSUM(getSpread());
        float f3 = mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (getOffset() >> 32)));
        long m8657constructorimpl = androidx.compose.ui.unit.DpOffset.m8657constructorimpl((java.lang.Float.floatToRawIntBits(mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (getOffset() & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f3) << 32));
        if (innerShadowPainter == null || shadow2 == null || !androidx.compose.ui.unit.Dp.m8606equalsimpl0(shadow2.getRadius(), f) || !androidx.compose.ui.unit.Dp.m8606equalsimpl0(shadow2.getSpread(), f2) || !androidx.compose.ui.graphics.Color.m5997equalsimpl0(shadow2.getColor(), getColor()) || !kotlin.jvm.internal.Intrinsics.areEqual(shadow2.getBrush(), brush) || shadow2.getAlpha() != getAlpha() || !androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(shadow2.getBlendMode(), getBlendMode()) || !androidx.compose.ui.unit.DpOffset.m8661equalsimpl0(shadow2.getOffset(), m8657constructorimpl)) {
            if (brush != null) {
                shadow = new androidx.compose.ui.graphics.shadow.Shadow(f, brush, f2, m8657constructorimpl, getAlpha(), getBlendMode(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                shadow = new androidx.compose.ui.graphics.shadow.Shadow(f, getColor(), f2, m8657constructorimpl, getAlpha(), getBlendMode(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            this.getHighSpeedVideoFpsRanges = shadow;
            innerShadowPainter = androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createInnerShadowPainter(this.getHighSpeedVideoFpsRangesFor, shadow);
            this.getHighSpeedVideoSizes = innerShadowPainter;
        }
        androidx.compose.ui.graphics.painter.Painter.m6651drawx_KDEd0$default(innerShadowPainter, contentDrawScope, contentDrawScope.mo6531getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }
}
