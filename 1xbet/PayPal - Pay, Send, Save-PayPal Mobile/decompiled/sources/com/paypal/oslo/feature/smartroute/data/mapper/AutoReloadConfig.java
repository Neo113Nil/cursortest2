package com.paypal.oslo.feature.smartroute.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/data/mapper/AutoReloadConfig;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class AutoReloadConfig {
    final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public AutoReloadConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.getHighSpeedVideoSizes = str4;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str4 = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadConfig(Camera2StreamConfigurationMap=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str2);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(str3);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.getHighSpeedVideoSizes;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadConfig)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadConfig autoReloadConfig = (com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadConfig) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, autoReloadConfig.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, autoReloadConfig.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, autoReloadConfig.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, autoReloadConfig.getHighSpeedVideoSizes);
    }
}
