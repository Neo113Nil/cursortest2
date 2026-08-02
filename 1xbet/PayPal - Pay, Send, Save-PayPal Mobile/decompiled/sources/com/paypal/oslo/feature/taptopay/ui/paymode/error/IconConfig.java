package com.paypal.oslo.feature.taptopay.ui.paymode.error;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/error/IconConfig;", "", "Lcom/paypal/pds/core/Icon;", "p0", "Lcom/paypal/pds/core/Color;", "p1", "p2", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/pds/core/Icon;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/pds/core/Color;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class IconConfig {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final com.paypal.pds.core.Icon getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.paypal.pds.core.Color Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.pds.core.Color getHighSpeedVideoFpsRangesFor;

    public IconConfig(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color2, "");
        this.getHighSpeedVideoFpsRanges = icon;
        this.getHighSpeedVideoFpsRangesFor = color;
        this.Camera2StreamConfigurationMap = color2;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.getHighSpeedVideoFpsRanges;
        com.paypal.pds.core.Color color = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.pds.core.Color color2 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IconConfig(getHighSpeedVideoFpsRanges=");
        sb.append(icon);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(color);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(color2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.taptopay.ui.paymode.error.IconConfig)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.ui.paymode.error.IconConfig iconConfig = (com.paypal.oslo.feature.taptopay.ui.paymode.error.IconConfig) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, iconConfig.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, iconConfig.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, iconConfig.Camera2StreamConfigurationMap);
    }
}
