package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/internal/PredictiveBackStateImpl;", "Landroidx/compose/material3/internal/PredictiveBackState;", "<init>", "()V", "Landroidx/compose/material3/internal/BackEventProgress;", "p0", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableState;", "getValue", "()Landroidx/compose/material3/internal/BackEventProgress;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/material3/internal/BackEventProgress;)V", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PredictiveBackStateImpl implements androidx.compose.material3.internal.PredictiveBackState {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material3.internal.BackEventProgress.NotRunning.INSTANCE, null, 2, null);

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.material3.internal.BackEventProgress backEventProgress) {
        this.getHighSpeedVideoFpsRanges.setValue(backEventProgress);
    }

    @Override // androidx.compose.material3.internal.PredictiveBackState
    public final androidx.compose.material3.internal.BackEventProgress getValue() {
        return (androidx.compose.material3.internal.BackEventProgress) this.getHighSpeedVideoFpsRanges.getValue();
    }
}
