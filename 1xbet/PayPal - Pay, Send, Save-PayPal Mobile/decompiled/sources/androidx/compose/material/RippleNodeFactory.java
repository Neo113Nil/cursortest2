package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/material/RippleNodeFactory;", "Landroidx/compose/foundation/IndicationNodeFactory;", "", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "Landroidx/compose/ui/graphics/ColorProducer;", "p2", "Landroidx/compose/ui/graphics/Color;", "p3", "<init>", "(ZFLandroidx/compose/ui/graphics/ColorProducer;J)V", "(ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/ui/node/DelegatableNode;", "create", "(Landroidx/compose/foundation/interaction/InteractionSource;)Landroidx/compose/ui/node/DelegatableNode;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/ColorProducer;", "getHighSpeedVideoFpsRanges", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RippleNodeFactory implements androidx.compose.foundation.IndicationNodeFactory {
    private final androidx.compose.ui.graphics.ColorProducer Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    private RippleNodeFactory(boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, long j) {
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.Camera2StreamConfigurationMap = colorProducer;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    private RippleNodeFactory(boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer) {
        this(z, f, colorProducer, androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU());
    }

    private RippleNodeFactory(boolean z, float f, long j) {
        this(z, f, (androidx.compose.ui.graphics.ColorProducer) null, j);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final androidx.compose.ui.node.DelegatableNode create(androidx.compose.foundation.interaction.InteractionSource p0) {
        androidx.compose.ui.graphics.ColorProducer colorProducer = this.Camera2StreamConfigurationMap;
        if (colorProducer == null) {
            colorProducer = new androidx.compose.ui.graphics.ColorProducer() { // from class: androidx.compose.material.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long getGetHighSpeedVideoFpsRanges() {
                    long j;
                    j = androidx.compose.material.RippleNodeFactory.this.getHighResolutionOutputSizeshNQ4ISI;
                    return j;
                }
            };
        }
        return new androidx.compose.material.DelegatingThemeAwareRippleNode(p0, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, colorProducer, null);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.material.RippleNodeFactory)) {
            return false;
        }
        androidx.compose.material.RippleNodeFactory rippleNodeFactory = (androidx.compose.material.RippleNodeFactory) p0;
        if (this.getHighSpeedVideoSizes == rippleNodeFactory.getHighSpeedVideoSizes && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, rippleNodeFactory.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, rippleNodeFactory.Camera2StreamConfigurationMap)) {
            return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, rippleNodeFactory.getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
        int m8607hashCodeimpl = androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        androidx.compose.ui.graphics.ColorProducer colorProducer = this.Camera2StreamConfigurationMap;
        return (((((hashCode * 31) + m8607hashCodeimpl) * 31) + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, colorProducer);
    }

    public /* synthetic */ RippleNodeFactory(boolean z, float f, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, j);
    }
}
