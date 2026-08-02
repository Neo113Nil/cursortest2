package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0010R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/StateSetStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "set", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "getSet$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "setSet$runtime", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "", "modification", com.visa.cbp.getEncExpo.warmup, "getModification$runtime", "()I", "setModification$runtime", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StateSetStateRecord<T> extends androidx.compose.runtime.snapshots.StateRecord {
    public static final int $stable = 8;
    private int modification;
    private androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends T> set;

    public StateSetStateRecord(long j, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends T> persistentSet) {
        super(j);
        this.set = persistentSet;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<T> getSet$runtime() {
        return this.set;
    }

    public final void setSet$runtime(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<? extends T> persistentSet) {
        this.set = persistentSet;
    }

    /* renamed from: getModification$runtime, reason: from getter */
    public final int getModification() {
        return this.modification;
    }

    public final void setModification$runtime(int i) {
        this.modification = i;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(androidx.compose.runtime.snapshots.StateRecord value) {
        synchronized (androidx.compose.runtime.snapshots.SnapshotStateSetKt.getHighSpeedVideoFpsRangesFor) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            this.set = ((androidx.compose.runtime.snapshots.StateSetStateRecord) value).set;
            this.modification = ((androidx.compose.runtime.snapshots.StateSetStateRecord) value).modification;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final androidx.compose.runtime.snapshots.StateRecord create() {
        return new androidx.compose.runtime.snapshots.StateSetStateRecord(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final androidx.compose.runtime.snapshots.StateRecord create(long snapshotId) {
        return new androidx.compose.runtime.snapshots.StateSetStateRecord(snapshotId, this.set);
    }
}
