package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/serialization/SavedStateHandleArgStore;", "Landroidx/navigation/serialization/ArgStore;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "", "", "Landroidx/navigation/NavType;", "p1", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/SavedStateHandle;", "getHighSpeedVideoSizes", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SavedStateHandleArgStore extends androidx.view.serialization.ArgStore {
    private final androidx.view.SavedStateHandle getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.view.NavType<?>> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleArgStore(androidx.view.SavedStateHandle savedStateHandle, java.util.Map<java.lang.String, ? extends androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRangesFor = savedStateHandle;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    @Override // androidx.view.serialization.ArgStore
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        kotlin.Pair[] pairArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(p0, this.getHighSpeedVideoFpsRangesFor.get(p0)));
        if (mapOf.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(mapOf.size());
            for (java.util.Map.Entry entry : mapOf.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        androidx.view.NavType<?> navType = this.getHighResolutionOutputSizeshNQ4ISI.get(p0);
        if (navType != null) {
            return navType.get(bundleOf, p0);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to find type for ");
        sb.append(p0);
        sb.append(" when decoding ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    @Override // androidx.view.serialization.ArgStore
    public final boolean Camera2StreamConfigurationMap(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRangesFor.contains(p0);
    }
}
