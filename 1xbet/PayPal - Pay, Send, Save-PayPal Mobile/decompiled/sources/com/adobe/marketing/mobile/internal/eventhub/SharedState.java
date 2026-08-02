package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R!\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/SharedState;", "", "", "p0", "Lcom/adobe/marketing/mobile/SharedStateStatus;", "p1", "", "", "p2", "<init>", "(ILcom/adobe/marketing/mobile/SharedStateStatus;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/SharedStateStatus;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class SharedState {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.adobe.marketing.mobile.SharedStateStatus getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    public SharedState(int i, com.adobe.marketing.mobile.SharedStateStatus sharedStateStatus, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedStateStatus, "");
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = sharedStateStatus;
        this.getHighSpeedVideoSizes = map;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SharedState(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode2 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoSizes;
        return (((hashCode * 31) + hashCode2) * 31) + (map == null ? 0 : map.hashCode());
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.adobe.marketing.mobile.internal.eventhub.SharedState)) {
            return false;
        }
        com.adobe.marketing.mobile.internal.eventhub.SharedState sharedState = (com.adobe.marketing.mobile.internal.eventhub.SharedState) p0;
        return this.Camera2StreamConfigurationMap == sharedState.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI == sharedState.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, sharedState.getHighSpeedVideoSizes);
    }
}
