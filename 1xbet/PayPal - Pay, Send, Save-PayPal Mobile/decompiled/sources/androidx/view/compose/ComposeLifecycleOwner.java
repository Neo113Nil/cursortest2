package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\n8\u0006@GX\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Landroidx/lifecycle/compose/ComposeLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/LifecycleRegistry;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/LifecycleRegistry;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/Lifecycle$State;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/Lifecycle$State;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ComposeLifecycleOwner implements androidx.view.LifecycleOwner {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.LifecycleRegistry getHighSpeedVideoFpsRangesFor = new androidx.view.LifecycleRegistry(this);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    androidx.lifecycle.Lifecycle.State getHighSpeedVideoFpsRanges = androidx.lifecycle.Lifecycle.State.INITIALIZED;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    androidx.lifecycle.Lifecycle.State Camera2StreamConfigurationMap = androidx.lifecycle.Lifecycle.State.INITIALIZED;

    final void getHighSpeedVideoFpsRanges() {
        androidx.lifecycle.Lifecycle.State state;
        if (this.getHighSpeedVideoFpsRanges.ordinal() < this.Camera2StreamConfigurationMap.ordinal()) {
            state = this.getHighSpeedVideoFpsRanges;
        } else {
            state = this.Camera2StreamConfigurationMap;
        }
        if (this.getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.INITIALIZED && state == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.setCurrentState(state);
    }

    @Override // androidx.view.LifecycleOwner
    public final /* bridge */ /* synthetic */ androidx.view.Lifecycle getLifecycle() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
