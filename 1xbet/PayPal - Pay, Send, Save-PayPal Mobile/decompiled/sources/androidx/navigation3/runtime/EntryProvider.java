package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BP\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0016\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR2\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR+\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0019\u0010 "}, d2 = {"Landroidx/navigation3/runtime/EntryProvider;", "", "K", "p0", "p1", "Lkotlin/Function1;", "", "", "p2", "", "Landroidx/compose/runtime/Composable;", "p3", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "()Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class EntryProvider<K> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<K, java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<K, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final K getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public EntryProvider(K k, java.lang.Object obj, kotlin.jvm.functions.Function1<? super K, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> function1, kotlin.jvm.functions.Function3<? super K, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.getHighSpeedVideoFpsRanges = k;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function3;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final java.lang.Object getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.jvm.functions.Function1<K, java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.jvm.functions.Function3<K, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EntryProvider(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.navigation3.runtime.EntryProvider)) {
            return false;
        }
        androidx.navigation3.runtime.EntryProvider entryProvider = (androidx.navigation3.runtime.EntryProvider) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, entryProvider.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, entryProvider.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, entryProvider.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, entryProvider.getHighResolutionOutputSizeshNQ4ISI);
    }
}
