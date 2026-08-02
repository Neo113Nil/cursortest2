package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AvatarSlot;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class AvatarSlot {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final float Camera2StreamConfigurationMap;

    private AvatarSlot(float f, float f2) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRanges = f2;
    }

    public final java.lang.String toString() {
        java.lang.String m8612toStringimpl = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.Camera2StreamConfigurationMap);
        java.lang.String m8612toStringimpl2 = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighSpeedVideoFpsRanges);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AvatarSlot(Camera2StreamConfigurationMap=");
        sb.append(m8612toStringimpl);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(m8612toStringimpl2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.core.commonui.components.AvatarSlot)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.AvatarSlot avatarSlot = (com.paypal.oslo.core.commonui.components.AvatarSlot) p0;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, avatarSlot.Camera2StreamConfigurationMap) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRanges, avatarSlot.getHighSpeedVideoFpsRanges);
    }

    public /* synthetic */ AvatarSlot(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
