package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/Timing;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class Timing {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final long getHighResolutionOutputSizeshNQ4ISI;

    public Timing(long j, long j2) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
    }

    public final java.lang.String toString() {
        long j = this.Camera2StreamConfigurationMap;
        long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Timing(Camera2StreamConfigurationMap=");
        sb.append(j);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.Camera2StreamConfigurationMap) * 31) + java.lang.Long.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.datadog.android.rum.internal.domain.scope.Timing)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.scope.Timing timing = (com.datadog.android.rum.internal.domain.scope.Timing) p0;
        return this.Camera2StreamConfigurationMap == timing.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI == timing.getHighResolutionOutputSizeshNQ4ISI;
    }
}
