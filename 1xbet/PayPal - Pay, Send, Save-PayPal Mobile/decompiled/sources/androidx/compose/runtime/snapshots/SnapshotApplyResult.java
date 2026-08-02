package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "", "<init>", "()V", "", "check", "", "getSucceeded", "()Z", "succeeded", "Success", "Failure", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SnapshotApplyResult {
    public static final int $stable = 0;

    public abstract void check();

    public abstract boolean getSucceeded();

    private SnapshotApplyResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "<init>", "()V", "", "check", "", "getSucceeded", "()Z", "succeeded"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends androidx.compose.runtime.snapshots.SnapshotApplyResult {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.snapshots.SnapshotApplyResult.Success INSTANCE = new androidx.compose.runtime.snapshots.SnapshotApplyResult.Success();

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public final void check() {
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public final boolean getSucceeded() {
            return true;
        }

        private Success() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "", "check", "()V", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "", "getSucceeded", "()Z", "succeeded"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Failure extends androidx.compose.runtime.snapshots.SnapshotApplyResult {
        public static final int $stable = 8;
        private final androidx.compose.runtime.snapshots.Snapshot snapshot;

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public final boolean getSucceeded() {
            return false;
        }

        public Failure(androidx.compose.runtime.snapshots.Snapshot snapshot) {
            super(null);
            this.snapshot = snapshot;
        }

        public final androidx.compose.runtime.snapshots.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public final void check() {
            this.snapshot.dispose();
            throw new androidx.compose.runtime.snapshots.SnapshotApplyConflictException(this.snapshot);
        }
    }

    public /* synthetic */ SnapshotApplyResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
