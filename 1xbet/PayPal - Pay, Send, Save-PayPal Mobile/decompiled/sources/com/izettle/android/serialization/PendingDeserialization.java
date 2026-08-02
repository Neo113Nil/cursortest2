package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/izettle/android/serialization/PendingDeserialization;", "", "Ljava/lang/Class;", "p0", "", "Ljava/lang/reflect/Type;", "p1", "", "p2", "<init>", "(Ljava/lang/Class;[Ljava/lang/reflect/Type;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Class;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "[Ljava/lang/reflect/Type;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class PendingDeserialization {
    final java.lang.reflect.Type[] Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.Class<?> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.util.List<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    public PendingDeserialization(java.lang.Class<?> cls, java.lang.reflect.Type[] typeArr, java.util.List<java.lang.Object> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = cls;
        this.Camera2StreamConfigurationMap = typeArr;
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    public final java.lang.String toString() {
        java.lang.Class<?> cls = this.getHighSpeedVideoSizes;
        java.lang.String arrays = java.util.Arrays.toString(this.Camera2StreamConfigurationMap);
        java.util.List<java.lang.Object> list = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PendingDeserialization(getHighSpeedVideoSizes=");
        sb.append(cls);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(arrays);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoSizes.hashCode() * 31) + java.util.Arrays.hashCode(this.Camera2StreamConfigurationMap)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.izettle.android.serialization.PendingDeserialization)) {
            return false;
        }
        com.izettle.android.serialization.PendingDeserialization pendingDeserialization = (com.izettle.android.serialization.PendingDeserialization) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, pendingDeserialization.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, pendingDeserialization.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, pendingDeserialization.getHighSpeedVideoFpsRangesFor);
    }
}
