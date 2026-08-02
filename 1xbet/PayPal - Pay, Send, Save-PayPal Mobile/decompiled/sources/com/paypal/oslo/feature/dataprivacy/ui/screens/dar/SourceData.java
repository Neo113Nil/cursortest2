package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/screens/dar/SourceData;", "", "", "p0", "p1", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARStatus;", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARStatus;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARStatus;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class SourceData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String Camera2StreamConfigurationMap;

    public SourceData(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dARStatus, "");
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = dARStatus;
        this.getHighSpeedVideoFpsRanges = str3;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARStatus dARStatus = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SourceData(getHighSpeedVideoSizes=");
        sb.append(str);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(str2);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(dARStatus);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        int hashCode2 = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode3 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.dataprivacy.ui.screens.dar.SourceData)) {
            return false;
        }
        com.paypal.oslo.feature.dataprivacy.ui.screens.dar.SourceData sourceData = (com.paypal.oslo.feature.dataprivacy.ui.screens.dar.SourceData) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, sourceData.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, sourceData.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRangesFor == sourceData.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, sourceData.getHighSpeedVideoFpsRanges);
    }
}
