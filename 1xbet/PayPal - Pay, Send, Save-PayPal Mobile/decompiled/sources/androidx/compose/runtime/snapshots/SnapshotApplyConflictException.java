package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotApplyConflictException extends java.lang.Exception {
    public static final int $stable = 8;
    private final androidx.compose.runtime.snapshots.Snapshot snapshot;

    public SnapshotApplyConflictException(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    public final androidx.compose.runtime.snapshots.Snapshot getSnapshot() {
        return this.snapshot;
    }
}
