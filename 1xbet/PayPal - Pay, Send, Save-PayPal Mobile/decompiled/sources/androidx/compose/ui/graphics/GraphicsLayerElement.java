package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020#*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b5\u00103R\u0011\u0010!\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b!\u00103R\u0011\u0010$\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b7\u00103R\u0011\u00108\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b0\u00103R\u0011\u0010:\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b9\u00103R\u0011\u0010<\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b;\u00103R\u0011\u0010;\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b:\u00103R\u0011\u0010>\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b=\u00103R\u0011\u0010?\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b6\u00103R\u0011\u00105\u001a\u00020\u000e8\u0006¢\u0006\u0006\n\u0004\b@\u0010AR\u0011\u00109\u001a\u00020\u00108\u0006¢\u0006\u0006\n\u0004\bB\u0010CR\u0011\u0010=\u001a\u00020\u00128\u0006¢\u0006\u0006\n\u0004\b8\u0010DR\u0013\u0010B\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u0006\n\u0004\b<\u0010ER\u0011\u00102\u001a\u00020\u00168\u0006¢\u0006\u0006\n\u0004\b$\u0010AR\u0011\u0010G\u001a\u00020\u00168\u0006¢\u0006\u0006\n\u0004\bF\u0010AR\u0011\u00107\u001a\u00020\u00198\u0006¢\u0006\u0006\n\u0004\b>\u0010HR\u0011\u00100\u001a\u00020\u001b8\u0006¢\u0006\u0006\n\u0004\b4\u0010HR\u0013\u0010@\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u0006\n\u0004\b?\u0010I"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "Landroidx/compose/ui/graphics/TransformOrigin;", "p10", "Landroidx/compose/ui/graphics/Shape;", "p11", "", "p12", "Landroidx/compose/ui/graphics/RenderEffect;", "p13", "Landroidx/compose/ui/graphics/Color;", "p14", "p15", "Landroidx/compose/ui/graphics/CompositingStrategy;", "p16", "Landroidx/compose/ui/graphics/BlendMode;", "p17", "Landroidx/compose/ui/graphics/ColorFilter;", "p18", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getOutputSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "getOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "unwrapAs", "Camera2StreamConfigurationMap", "getOutputStallDuration", "getOutputFormats", "getHighSpeedVideoSizesFor", "getInputFormats", "getOutputStallDurationlomOqCM", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "isOutputSupportedFor", "J", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/ui/graphics/Shape;", "Z", "Landroidx/compose/ui/graphics/RenderEffect;", "isOutputSupportedForhNQ4ISI", "getValidOutputFormatsForInputhNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/ui/graphics/ColorFilter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.graphics.SimpleGraphicsLayerModifier> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getOutputStallDurationlomOqCM;
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getOutputSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int toString;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final float getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.RenderEffect getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.ColorFilter isOutputSupportedFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final int unwrapAs;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Shape getOutputStallDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final float getOutputFormats;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final float getOutputMinFrameDuration;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final long getOutputSizeshNQ4ISI;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final long getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: toString, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    private GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, androidx.compose.ui.graphics.Shape shape, boolean z, androidx.compose.ui.graphics.RenderEffect renderEffect, long j2, long j3, int i, int i2, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getHighSpeedVideoFpsRanges = f4;
        this.Camera2StreamConfigurationMap = f5;
        this.getOutputFormats = f6;
        this.getInputFormats = f7;
        this.getHighSpeedVideoSizesFor = f8;
        this.getOutputMinFrameDuration = f9;
        this.getInputSizeshNQ4ISI = f10;
        this.getOutputSizeshNQ4ISI = j;
        this.getOutputStallDuration = shape;
        this.getOutputStallDurationlomOqCM = z;
        this.getOutputMinFrameDurationlomOqCM = renderEffect;
        this.getOutputSizes = j2;
        this.getValidOutputFormatsForInputhNQ4ISI = j3;
        this.unwrapAs = i;
        this.toString = i2;
        this.isOutputSupportedFor = colorFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.graphics.SimpleGraphicsLayerModifier getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.graphics.SimpleGraphicsLayerModifier(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizes, this.getValidOutputFormatsForInputhNQ4ISI, this.unwrapAs, this.toString, this.isOutputSupportedFor, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.graphics.SimpleGraphicsLayerModifier p0) {
        p0.getOutputFormats(this.getHighSpeedVideoSizes);
        p0.getHighSpeedVideoSizesFor(this.getHighSpeedVideoFpsRangesFor);
        p0.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
        p0.getInputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
        p0.getOutputMinFrameDuration(this.Camera2StreamConfigurationMap);
        p0.getInputFormats(this.getOutputFormats);
        p0.Camera2StreamConfigurationMap(this.getInputFormats);
        p0.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration);
        p0.getHighSpeedVideoFpsRangesFor(this.getInputSizeshNQ4ISI);
        p0.getHighSpeedVideoFpsRangesFor(this.getOutputSizeshNQ4ISI);
        p0.getHighSpeedVideoSizes(this.getOutputStallDuration);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM);
        p0.Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.getOutputSizes);
        p0.getHighSpeedVideoSizes(this.getValidOutputFormatsForInputhNQ4ISI);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.unwrapAs);
        p0.Camera2StreamConfigurationMap(this.toString);
        p0.getHighResolutionOutputSizeshNQ4ISI(this.isOutputSupportedFor);
        p0.coroutineBoundary();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", java.lang.Float.valueOf(this.getHighSpeedVideoSizes));
        inspectorInfo.getProperties().set("scaleY", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor));
        inspectorInfo.getProperties().set("alpha", java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        inspectorInfo.getProperties().set("translationX", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges));
        inspectorInfo.getProperties().set("translationY", java.lang.Float.valueOf(this.Camera2StreamConfigurationMap));
        inspectorInfo.getProperties().set("shadowElevation", java.lang.Float.valueOf(this.getOutputFormats));
        inspectorInfo.getProperties().set("rotationX", java.lang.Float.valueOf(this.getInputFormats));
        inspectorInfo.getProperties().set("rotationY", java.lang.Float.valueOf(this.getHighSpeedVideoSizesFor));
        inspectorInfo.getProperties().set("rotationZ", java.lang.Float.valueOf(this.getOutputMinFrameDuration));
        inspectorInfo.getProperties().set("cameraDistance", java.lang.Float.valueOf(this.getInputSizeshNQ4ISI));
        inspectorInfo.getProperties().set("transformOrigin", androidx.compose.ui.graphics.TransformOrigin.m6365boximpl(this.getOutputSizeshNQ4ISI));
        inspectorInfo.getProperties().set(com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, this.getOutputStallDuration);
        inspectorInfo.getProperties().set("clip", java.lang.Boolean.valueOf(this.getOutputStallDurationlomOqCM));
        inspectorInfo.getProperties().set("renderEffect", this.getOutputMinFrameDurationlomOqCM);
        inspectorInfo.getProperties().set("ambientShadowColor", androidx.compose.ui.graphics.Color.m5986boximpl(this.getOutputSizes));
        inspectorInfo.getProperties().set("spotShadowColor", androidx.compose.ui.graphics.Color.m5986boximpl(this.getValidOutputFormatsForInputhNQ4ISI));
        inspectorInfo.getProperties().set("compositingStrategy", androidx.compose.ui.graphics.CompositingStrategy.m6073boximpl(this.unwrapAs));
        inspectorInfo.getProperties().set("blendMode", androidx.compose.ui.graphics.BlendMode.m5903boximpl(this.toString));
        inspectorInfo.getProperties().set("colorFilter", this.isOutputSupportedFor);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphicsLayerElement(getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getOutputFormats=");
        sb.append(this.getOutputFormats);
        sb.append(", getInputFormats=");
        sb.append(this.getInputFormats);
        sb.append(", getHighSpeedVideoSizesFor=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", getOutputMinFrameDuration=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", getInputSizeshNQ4ISI=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", getOutputSizeshNQ4ISI=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.TransformOrigin.m6376toStringimpl(this.getOutputSizeshNQ4ISI));
        sb.append(", getOutputStallDuration=");
        sb.append(this.getOutputStallDuration);
        sb.append(", getOutputStallDurationlomOqCM=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", getOutputMinFrameDurationlomOqCM=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(", getOutputSizes=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.getOutputSizes));
        sb.append(", getValidOutputFormatsForInputhNQ4ISI=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.getValidOutputFormatsForInputhNQ4ISI));
        sb.append(", unwrapAs=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.CompositingStrategy.m6078toStringimpl(this.unwrapAs));
        sb.append(", toString=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.BlendMode.m5908toStringimpl(this.toString));
        sb.append(", isOutputSupportedFor=");
        sb.append(this.isOutputSupportedFor);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.getHighSpeedVideoSizes);
        int hashCode2 = java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor);
        int hashCode3 = java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        int hashCode4 = java.lang.Float.hashCode(this.getHighSpeedVideoFpsRanges);
        int hashCode5 = java.lang.Float.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode6 = java.lang.Float.hashCode(this.getOutputFormats);
        int hashCode7 = java.lang.Float.hashCode(this.getInputFormats);
        int hashCode8 = java.lang.Float.hashCode(this.getHighSpeedVideoSizesFor);
        int hashCode9 = java.lang.Float.hashCode(this.getOutputMinFrameDuration);
        int hashCode10 = java.lang.Float.hashCode(this.getInputSizeshNQ4ISI);
        int m6375hashCodeimpl = androidx.compose.ui.graphics.TransformOrigin.m6375hashCodeimpl(this.getOutputSizeshNQ4ISI);
        int hashCode11 = this.getOutputStallDuration.hashCode();
        int hashCode12 = java.lang.Boolean.hashCode(this.getOutputStallDurationlomOqCM);
        androidx.compose.ui.graphics.RenderEffect renderEffect = this.getOutputMinFrameDurationlomOqCM;
        int hashCode13 = renderEffect == null ? 0 : renderEffect.hashCode();
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getOutputSizes);
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getValidOutputFormatsForInputhNQ4ISI);
        int m6077hashCodeimpl = androidx.compose.ui.graphics.CompositingStrategy.m6077hashCodeimpl(this.unwrapAs);
        int m5907hashCodeimpl = androidx.compose.ui.graphics.BlendMode.m5907hashCodeimpl(this.toString);
        androidx.compose.ui.graphics.ColorFilter colorFilter = this.isOutputSupportedFor;
        return (((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + m6375hashCodeimpl) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + m6003hashCodeimpl) * 31) + m6003hashCodeimpl2) * 31) + m6077hashCodeimpl) * 31) + m5907hashCodeimpl) * 31) + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.graphics.GraphicsLayerElement)) {
            return false;
        }
        androidx.compose.ui.graphics.GraphicsLayerElement graphicsLayerElement = (androidx.compose.ui.graphics.GraphicsLayerElement) p0;
        return java.lang.Float.compare(this.getHighSpeedVideoSizes, graphicsLayerElement.getHighSpeedVideoSizes) == 0 && java.lang.Float.compare(this.getHighSpeedVideoFpsRangesFor, graphicsLayerElement.getHighSpeedVideoFpsRangesFor) == 0 && java.lang.Float.compare(this.getHighResolutionOutputSizeshNQ4ISI, graphicsLayerElement.getHighResolutionOutputSizeshNQ4ISI) == 0 && java.lang.Float.compare(this.getHighSpeedVideoFpsRanges, graphicsLayerElement.getHighSpeedVideoFpsRanges) == 0 && java.lang.Float.compare(this.Camera2StreamConfigurationMap, graphicsLayerElement.Camera2StreamConfigurationMap) == 0 && java.lang.Float.compare(this.getOutputFormats, graphicsLayerElement.getOutputFormats) == 0 && java.lang.Float.compare(this.getInputFormats, graphicsLayerElement.getInputFormats) == 0 && java.lang.Float.compare(this.getHighSpeedVideoSizesFor, graphicsLayerElement.getHighSpeedVideoSizesFor) == 0 && java.lang.Float.compare(this.getOutputMinFrameDuration, graphicsLayerElement.getOutputMinFrameDuration) == 0 && java.lang.Float.compare(this.getInputSizeshNQ4ISI, graphicsLayerElement.getInputSizeshNQ4ISI) == 0 && androidx.compose.ui.graphics.TransformOrigin.m6372equalsimpl0(this.getOutputSizeshNQ4ISI, graphicsLayerElement.getOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputStallDuration, graphicsLayerElement.getOutputStallDuration) && this.getOutputStallDurationlomOqCM == graphicsLayerElement.getOutputStallDurationlomOqCM && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDurationlomOqCM, graphicsLayerElement.getOutputMinFrameDurationlomOqCM) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getOutputSizes, graphicsLayerElement.getOutputSizes) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getValidOutputFormatsForInputhNQ4ISI, graphicsLayerElement.getValidOutputFormatsForInputhNQ4ISI) && androidx.compose.ui.graphics.CompositingStrategy.m6076equalsimpl0(this.unwrapAs, graphicsLayerElement.unwrapAs) && androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.toString, graphicsLayerElement.toString) && kotlin.jvm.internal.Intrinsics.areEqual(this.isOutputSupportedFor, graphicsLayerElement.isOutputSupportedFor);
    }

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, androidx.compose.ui.graphics.Shape shape, boolean z, androidx.compose.ui.graphics.RenderEffect renderEffect, long j2, long j3, int i, int i2, androidx.compose.ui.graphics.ColorFilter colorFilter, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i, i2, colorFilter);
    }
}
