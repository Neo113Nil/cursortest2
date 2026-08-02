package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/HowItWorksSectionItem;", "", "", "p0", "Lcom/paypal/pds/core/Icon;", "p1", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/pds/core/Icon;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class HowItWorksSectionItem {
    final com.paypal.pds.core.Icon Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRanges;

    public HowItWorksSectionItem(java.lang.String str, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = icon;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        com.paypal.pds.core.Icon icon = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HowItWorksSectionItem(getHighSpeedVideoFpsRanges=");
        sb.append(str);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(icon);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.HowItWorksSectionItem)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.HowItWorksSectionItem howItWorksSectionItem = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.HowItWorksSectionItem) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, howItWorksSectionItem.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, howItWorksSectionItem.Camera2StreamConfigurationMap);
    }
}
