package androidx.compose.runtime.snapshots.tooling;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "", "readonly", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "onPreCreate", "(Landroidx/compose/runtime/snapshots/Snapshot;Z)Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "snapshot", "observers", "", "onCreated", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;)V", "onPreDispose", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "", "changed", "onApplied", "(Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Set;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SnapshotObserver {
    default void onApplied(androidx.compose.runtime.snapshots.Snapshot snapshot, java.util.Set<? extends java.lang.Object> changed) {
    }

    default void onCreated(androidx.compose.runtime.snapshots.Snapshot snapshot, androidx.compose.runtime.snapshots.Snapshot parent, androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers observers) {
    }

    default androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers onPreCreate(androidx.compose.runtime.snapshots.Snapshot parent, boolean readonly) {
        return null;
    }

    default void onPreDispose(androidx.compose.runtime.snapshots.Snapshot snapshot) {
    }
}
