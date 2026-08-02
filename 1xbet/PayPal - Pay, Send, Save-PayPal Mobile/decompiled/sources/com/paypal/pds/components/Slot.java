package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/paypal/pds/components/Slot;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class Slot {
    final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final float getHighSpeedVideoFpsRanges;

    private Slot(float f, float f2) {
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = f2;
    }

    public final java.lang.String toString() {
        java.lang.String m8612toStringimpl = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighSpeedVideoFpsRanges);
        java.lang.String m8612toStringimpl2 = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.Camera2StreamConfigurationMap);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Slot(getHighSpeedVideoFpsRanges=");
        sb.append(m8612toStringimpl);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(m8612toStringimpl2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.pds.components.Slot)) {
            return false;
        }
        com.paypal.pds.components.Slot slot = (com.paypal.pds.components.Slot) p0;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, slot.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, slot.Camera2StreamConfigurationMap);
    }

    public /* synthetic */ Slot(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
