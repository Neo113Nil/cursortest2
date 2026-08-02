package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00178\u0002@CX\u0083\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/retain/RetainContentPresenceIndicator;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "p0", "Landroidx/compose/runtime/Composer;", "p1", "<init>", "(Landroidx/compose/runtime/retain/RetainedValuesStore;Landroidx/compose/runtime/Composer;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/runtime/Composer;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/runtime/Composer;)V", "", "Z", "Landroidx/compose/runtime/CancellationHandle;", "Landroidx/compose/runtime/CancellationHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RetainContentPresenceIndicator implements androidx.compose.runtime.RememberObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.retain.RetainedValuesStore getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.CancellationHandle getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap;

    public RetainContentPresenceIndicator(androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore, androidx.compose.runtime.Composer composer) {
        this.getHighSpeedVideoFpsRanges = retainedValuesStore;
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(composer, null, 2, null);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer) {
        this.Camera2StreamConfigurationMap.setValue(composer);
    }

    public final androidx.compose.runtime.Composer getHighSpeedVideoFpsRanges() {
        return (androidx.compose.runtime.Composer) this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback = getHighSpeedVideoFpsRanges().scheduleFrameEndCallback(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.RetainContentPresenceIndicator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.runtime.retain.RetainContentPresenceIndicator.getHighSpeedVideoSizes(androidx.compose.runtime.retain.RetainContentPresenceIndicator.this);
            }
        });
        androidx.compose.runtime.CancellationHandle cancellationHandle = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cancellationHandle != null) {
            cancellationHandle.cancel();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = scheduleFrameEndCallback;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        androidx.compose.runtime.CancellationHandle cancellationHandle = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cancellationHandle != null) {
            cancellationHandle.cancel();
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges.onContentExitComposition();
            this.getHighSpeedVideoFpsRangesFor = false;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        androidx.compose.runtime.CancellationHandle cancellationHandle = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cancellationHandle != null) {
            cancellationHandle.cancel();
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.retain.RetainContentPresenceIndicator retainContentPresenceIndicator) {
        retainContentPresenceIndicator.getHighSpeedVideoFpsRangesFor = true;
        retainContentPresenceIndicator.getHighSpeedVideoFpsRanges.onContentEnteredComposition();
        return kotlin.Unit.INSTANCE;
    }
}
