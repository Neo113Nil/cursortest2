package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/common/CenteredTopBarMeasurements;", "", "Landroidx/compose/ui/layout/Placeable;", "p0", "p1", "p2", "", "p3", "p4", "<init>", "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;II)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/Placeable;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class CenteredTopBarMeasurements {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final androidx.compose.ui.layout.Placeable getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final androidx.compose.ui.layout.Placeable getHighSpeedVideoSizes;
    final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final androidx.compose.ui.layout.Placeable Camera2StreamConfigurationMap;

    public CenteredTopBarMeasurements(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable placeable2, androidx.compose.ui.layout.Placeable placeable3, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeable2, "");
        this.getHighSpeedVideoSizes = placeable;
        this.Camera2StreamConfigurationMap = placeable2;
        this.getHighResolutionOutputSizeshNQ4ISI = placeable3;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    public final java.lang.String toString() {
        androidx.compose.ui.layout.Placeable placeable = this.getHighSpeedVideoSizes;
        androidx.compose.ui.layout.Placeable placeable2 = this.Camera2StreamConfigurationMap;
        androidx.compose.ui.layout.Placeable placeable3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CenteredTopBarMeasurements(getHighSpeedVideoSizes=");
        sb.append(placeable);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(placeable2);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(placeable3);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(i);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        androidx.compose.ui.layout.Placeable placeable = this.getHighSpeedVideoSizes;
        int hashCode = placeable == null ? 0 : placeable.hashCode();
        int hashCode2 = this.Camera2StreamConfigurationMap.hashCode();
        androidx.compose.ui.layout.Placeable placeable2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((((hashCode * 31) + hashCode2) * 31) + (placeable2 != null ? placeable2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.oneonboarding.ui.common.CenteredTopBarMeasurements)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.ui.common.CenteredTopBarMeasurements centeredTopBarMeasurements = (com.paypal.oslo.feature.oneonboarding.ui.common.CenteredTopBarMeasurements) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, centeredTopBarMeasurements.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, centeredTopBarMeasurements.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, centeredTopBarMeasurements.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges == centeredTopBarMeasurements.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == centeredTopBarMeasurements.getHighSpeedVideoFpsRangesFor;
    }
}
