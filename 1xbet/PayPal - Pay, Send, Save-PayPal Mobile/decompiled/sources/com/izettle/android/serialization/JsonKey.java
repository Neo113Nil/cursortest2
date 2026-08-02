package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/izettle/android/serialization/JsonKey;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class JsonKey {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final boolean Camera2StreamConfigurationMap;

    public JsonKey(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = z;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonKey(getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.izettle.android.serialization.JsonKey)) {
            return false;
        }
        com.izettle.android.serialization.JsonKey jsonKey = (com.izettle.android.serialization.JsonKey) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, jsonKey.getHighSpeedVideoFpsRangesFor) && this.Camera2StreamConfigurationMap == jsonKey.Camera2StreamConfigurationMap;
    }
}
