package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0016\u001a\u00028\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/collection/MutableMapEntry;", "K", "V", "", "", "", "p0", "p1", "", "p2", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;I)V", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getKey", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/Object;", "getValue", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableMapEntry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    public MutableMapEntry(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr2, "");
        this.getHighSpeedVideoFpsRanges = objArr;
        this.getHighSpeedVideoSizes = objArr2;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V p0) {
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
        int i = this.Camera2StreamConfigurationMap;
        V v = (V) objArr[i];
        objArr[i] = p0;
        return v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.getHighSpeedVideoFpsRanges[this.Camera2StreamConfigurationMap];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.getHighSpeedVideoSizes[this.Camera2StreamConfigurationMap];
    }
}
