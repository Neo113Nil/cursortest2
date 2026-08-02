package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/a;", "", "", "p0", "p1", "", "p2", "<init>", "(JJZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final /* data */ class a {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final boolean getHighSpeedVideoSizes;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RunnableEntry(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.getHighSpeedVideoFpsRanges);
        int hashCode2 = java.lang.Long.hashCode(this.getHighSpeedVideoFpsRangesFor);
        boolean z = this.getHighSpeedVideoSizes;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.miteksystems.misnap.workflow.util.a)) {
            return false;
        }
        com.miteksystems.misnap.workflow.util.a aVar = (com.miteksystems.misnap.workflow.util.a) p0;
        return this.getHighSpeedVideoFpsRanges == aVar.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == aVar.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == aVar.getHighSpeedVideoSizes;
    }

    public a(long j, long j2, boolean z) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
        this.getHighSpeedVideoSizes = z;
    }
}
