package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/pds/components/ChipPreviewData;", "", "", "p0", "p1", "Lcom/paypal/pds/core/Icon;", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/pds/core/Icon;", "Camera2StreamConfigurationMap", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class ChipPreviewData {
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;
    final com.paypal.pds.core.Icon getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRanges;

    private ChipPreviewData(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRangesFor = icon;
        this.Camera2StreamConfigurationMap = z;
    }

    public /* synthetic */ ChipPreviewData(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? false : z);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        com.paypal.pds.core.Icon icon = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChipPreviewData(getHighSpeedVideoFpsRanges=");
        sb.append(str);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str2);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(icon);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode2 = this.getHighSpeedVideoSizes.hashCode();
        com.paypal.pds.core.Icon icon = this.getHighSpeedVideoFpsRangesFor;
        return (((((hashCode * 31) + hashCode2) * 31) + (icon == null ? 0 : icon.hashCode())) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.pds.components.ChipPreviewData)) {
            return false;
        }
        com.paypal.pds.components.ChipPreviewData chipPreviewData = (com.paypal.pds.components.ChipPreviewData) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, chipPreviewData.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, chipPreviewData.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, chipPreviewData.getHighSpeedVideoFpsRangesFor) && this.Camera2StreamConfigurationMap == chipPreviewData.Camera2StreamConfigurationMap;
    }
}
