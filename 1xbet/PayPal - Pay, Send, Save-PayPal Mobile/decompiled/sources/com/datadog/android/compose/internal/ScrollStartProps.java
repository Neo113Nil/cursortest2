package com.datadog.android.compose.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/compose/internal/ScrollStartProps;", "", "", "p0", "<init>", "(Ljava/lang/Integer;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class ScrollStartProps {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.Integer Camera2StreamConfigurationMap;

    public ScrollStartProps(java.lang.Integer num) {
        this.Camera2StreamConfigurationMap = num;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollStartProps(Camera2StreamConfigurationMap=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.Camera2StreamConfigurationMap;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof com.datadog.android.compose.internal.ScrollStartProps) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((com.datadog.android.compose.internal.ScrollStartProps) p0).Camera2StreamConfigurationMap);
    }
}
