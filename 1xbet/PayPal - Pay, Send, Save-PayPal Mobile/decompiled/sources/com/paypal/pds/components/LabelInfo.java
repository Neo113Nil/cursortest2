package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/pds/components/LabelInfo;", "", "Lcom/paypal/pds/core/Color;", "p0", "Lcom/paypal/pds/core/Typography;", "p1", "<init>", "(Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Typography;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/pds/core/Color;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/pds/core/Typography;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class LabelInfo {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.paypal.pds.core.Color getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.paypal.pds.core.Typography Camera2StreamConfigurationMap;

    public LabelInfo(com.paypal.pds.core.Color color, com.paypal.pds.core.Typography typography) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
        this.getHighSpeedVideoSizes = color;
        this.Camera2StreamConfigurationMap = typography;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Color color = this.getHighSpeedVideoSizes;
        com.paypal.pds.core.Typography typography = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LabelInfo(getHighSpeedVideoSizes=");
        sb.append(color);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(typography);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.pds.components.LabelInfo)) {
            return false;
        }
        com.paypal.pds.components.LabelInfo labelInfo = (com.paypal.pds.components.LabelInfo) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, labelInfo.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, labelInfo.Camera2StreamConfigurationMap);
    }
}
