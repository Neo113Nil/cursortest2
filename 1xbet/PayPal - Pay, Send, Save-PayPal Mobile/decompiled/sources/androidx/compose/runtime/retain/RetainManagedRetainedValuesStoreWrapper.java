package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/retain/RetainManagedRetainedValuesStoreWrapper;", "Landroidx/compose/runtime/retain/RetainObserver;", "<init>", "()V", "", "onRetained", "onEnteredComposition", "onExitedComposition", "onRetired", "onUnused", "Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RetainManagedRetainedValuesStoreWrapper implements androidx.compose.runtime.retain.RetainObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.retain.ManagedRetainedValuesStore getHighSpeedVideoFpsRanges = new androidx.compose.runtime.retain.ManagedRetainedValuesStore();

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onExitedComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onRetained() {
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final androidx.compose.runtime.retain.ManagedRetainedValuesStore getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onRetired() {
        this.getHighSpeedVideoFpsRanges.dispose();
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onUnused() {
        this.getHighSpeedVideoFpsRanges.dispose();
    }
}
