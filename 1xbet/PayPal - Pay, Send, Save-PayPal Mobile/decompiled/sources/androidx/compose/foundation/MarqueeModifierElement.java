package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010!\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MarqueeModifierNode;", "", "p0", "Landroidx/compose/foundation/MarqueeAnimationMode;", "p1", "p2", "p3", "Landroidx/compose/foundation/MarqueeSpacing;", "p4", "Landroidx/compose/ui/unit/Dp;", "p5", "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/MarqueeSpacing;", "getInputFormats", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class MarqueeModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.MarqueeModifierNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.MarqueeSpacing getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;
    private final float getInputFormats;

    private MarqueeModifierElement(int i, int i2, int i3, int i4, androidx.compose.foundation.MarqueeSpacing marqueeSpacing, float f) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighSpeedVideoFpsRanges = i4;
        this.getHighSpeedVideoSizes = marqueeSpacing;
        this.getInputFormats = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode) {
        androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode2 = marqueeModifierNode;
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = this.getHighSpeedVideoFpsRanges;
        androidx.compose.foundation.MarqueeSpacing marqueeSpacing = this.getHighSpeedVideoSizes;
        float f = this.getInputFormats;
        marqueeModifierNode2.getHighSpeedVideoFpsRanges(marqueeSpacing);
        marqueeModifierNode2.getHighSpeedVideoFpsRangesFor(i2);
        if (marqueeModifierNode2.getHighSpeedVideoFpsRanges == i && marqueeModifierNode2.getHighSpeedVideoFpsRangesFor == i3 && marqueeModifierNode2.getHighResolutionOutputSizeshNQ4ISI == i4 && androidx.compose.ui.unit.Dp.m8606equalsimpl0(marqueeModifierNode2.getHighSpeedVideoSizes, f)) {
            return;
        }
        marqueeModifierNode2.getHighSpeedVideoFpsRanges = i;
        marqueeModifierNode2.getHighSpeedVideoFpsRangesFor = i3;
        marqueeModifierNode2.getHighResolutionOutputSizeshNQ4ISI = i4;
        marqueeModifierNode2.getHighSpeedVideoSizes = f;
        marqueeModifierNode2.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor));
        inspectorInfo.getProperties().set("animationMode", androidx.compose.foundation.MarqueeAnimationMode.m1350boximpl(this.getHighResolutionOutputSizeshNQ4ISI));
        inspectorInfo.getProperties().set("delayMillis", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap));
        inspectorInfo.getProperties().set("initialDelayMillis", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges));
        inspectorInfo.getProperties().set("spacing", this.getHighSpeedVideoSizes);
        inspectorInfo.getProperties().set("velocity", androidx.compose.ui.unit.Dp.m8599boximpl(this.getInputFormats));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.MarqueeModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.MarqueeModifierNode(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getInputFormats, null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MarqueeModifierElement(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append((java.lang.Object) androidx.compose.foundation.MarqueeAnimationMode.m1354toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getInputFormats=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getInputFormats));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + androidx.compose.foundation.MarqueeAnimationMode.m1353hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getInputFormats);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.MarqueeModifierElement)) {
            return false;
        }
        androidx.compose.foundation.MarqueeModifierElement marqueeModifierElement = (androidx.compose.foundation.MarqueeModifierElement) p0;
        return this.getHighSpeedVideoFpsRangesFor == marqueeModifierElement.getHighSpeedVideoFpsRangesFor && androidx.compose.foundation.MarqueeAnimationMode.m1352equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, marqueeModifierElement.getHighResolutionOutputSizeshNQ4ISI) && this.Camera2StreamConfigurationMap == marqueeModifierElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == marqueeModifierElement.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, marqueeModifierElement.getHighSpeedVideoSizes) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getInputFormats, marqueeModifierElement.getInputFormats);
    }

    public /* synthetic */ MarqueeModifierElement(int i, int i2, int i3, int i4, androidx.compose.foundation.MarqueeSpacing marqueeSpacing, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, marqueeSpacing, f);
    }
}
