package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/navigation/serialization/SavedStateArgStore;", "Landroidx/navigation/serialization/ArgStore;", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "p0", "", "", "Landroidx/navigation/NavType;", "p1", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRangesFor", "Landroid/os/Bundle;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SavedStateArgStore extends androidx.view.serialization.ArgStore {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.view.NavType<?>> getHighSpeedVideoSizes;
    private final android.os.Bundle getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateArgStore(android.os.Bundle bundle, java.util.Map<java.lang.String, ? extends androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRangesFor = bundle;
        this.getHighSpeedVideoSizes = map;
    }

    @Override // androidx.view.serialization.ArgStore
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        androidx.view.NavType<?> navType = this.getHighSpeedVideoSizes.get(p0);
        if (navType != null) {
            return navType.get(this.getHighSpeedVideoFpsRangesFor, p0);
        }
        return null;
    }

    @Override // androidx.view.serialization.ArgStore
    public final boolean Camera2StreamConfigurationMap(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return androidx.view.SavedStateReader.m9297containsimpl(androidx.view.SavedStateReader.m9296constructorimpl(this.getHighSpeedVideoFpsRangesFor), p0);
    }
}
