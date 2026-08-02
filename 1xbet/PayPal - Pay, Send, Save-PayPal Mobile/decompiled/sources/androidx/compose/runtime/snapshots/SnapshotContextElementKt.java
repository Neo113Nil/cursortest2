package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "asContextElement", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/SnapshotContextElement;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapshotContextElementKt {
    public static final androidx.compose.runtime.snapshots.SnapshotContextElement asContextElement(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        return new androidx.compose.runtime.snapshots.SnapshotContextElementImpl(snapshot);
    }
}
