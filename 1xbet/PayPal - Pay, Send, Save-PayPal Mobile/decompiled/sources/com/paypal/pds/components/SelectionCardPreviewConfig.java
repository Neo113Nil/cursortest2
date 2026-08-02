package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0017\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001a\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b"}, d2 = {"Lcom/paypal/pds/components/SelectionCardPreviewConfig;", "", "", "p0", "Lcom/paypal/pds/components/SelectionCardConfig;", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/components/SelectionCardConfig;ZZZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/pds/components/SelectionCardConfig;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class SelectionCardPreviewConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.paypal.pds.components.SelectionCardConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final boolean getInputSizeshNQ4ISI;

    private SelectionCardPreviewConfig(java.lang.String str, com.paypal.pds.components.SelectionCardConfig selectionCardConfig, boolean z, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = selectionCardConfig;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoSizes = z2;
        this.Camera2StreamConfigurationMap = z3;
        this.getInputSizeshNQ4ISI = z4;
    }

    public /* synthetic */ SelectionCardPreviewConfig(java.lang.String str, com.paypal.pds.components.SelectionCardConfig selectionCardConfig, boolean z, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, selectionCardConfig, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.pds.components.SelectionCardConfig selectionCardConfig = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.getHighSpeedVideoFpsRanges;
        boolean z2 = this.getHighSpeedVideoSizes;
        boolean z3 = this.Camera2StreamConfigurationMap;
        boolean z4 = this.getInputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionCardPreviewConfig(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(selectionCardConfig);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(z);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(z2);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(z3);
        sb.append(", getInputSizeshNQ4ISI=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes)) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Boolean.hashCode(this.getInputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.pds.components.SelectionCardPreviewConfig)) {
            return false;
        }
        com.paypal.pds.components.SelectionCardPreviewConfig selectionCardPreviewConfig = (com.paypal.pds.components.SelectionCardPreviewConfig) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, selectionCardPreviewConfig.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, selectionCardPreviewConfig.getHighSpeedVideoFpsRangesFor) && this.getHighSpeedVideoFpsRanges == selectionCardPreviewConfig.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == selectionCardPreviewConfig.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == selectionCardPreviewConfig.Camera2StreamConfigurationMap && this.getInputSizeshNQ4ISI == selectionCardPreviewConfig.getInputSizeshNQ4ISI;
    }
}
