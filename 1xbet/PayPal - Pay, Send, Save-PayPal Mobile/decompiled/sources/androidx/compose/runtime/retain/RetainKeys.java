package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0010\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/retain/RetainKeys;", "", "", "p0", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "p1", "", "p2", "<init>", "([Ljava/lang/Object;JI)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "[Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "J", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RetainKeys {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object[] getHighSpeedVideoFpsRanges;

    public RetainKeys(java.lang.Object[] objArr, long j, int i) {
        this.getHighSpeedVideoFpsRanges = objArr;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = i;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.runtime.retain.RetainKeys)) {
            return false;
        }
        androidx.compose.runtime.retain.RetainKeys retainKeys = (androidx.compose.runtime.retain.RetainKeys) p0;
        return retainKeys.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor && retainKeys.getHighSpeedVideoSizes == this.getHighSpeedVideoSizes && java.util.Arrays.equals(retainKeys.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRanges;
        return ((((objArr != null ? java.util.Arrays.hashCode(objArr) : 0) * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizes);
    }
}
