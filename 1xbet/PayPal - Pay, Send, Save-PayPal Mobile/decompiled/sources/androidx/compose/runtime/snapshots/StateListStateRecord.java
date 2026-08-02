package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0010R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "list", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getList$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "", "modification", com.visa.cbp.getEncExpo.warmup, "getModification$runtime", "()I", "setModification$runtime", "(I)V", "structuralChange", "getStructuralChange$runtime", "setStructuralChange$runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StateListStateRecord<T> extends androidx.compose.runtime.snapshots.StateRecord {
    public static final int $stable = 8;
    private androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> list;
    private int modification;
    private int structuralChange;

    public StateListStateRecord(long j, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> persistentList) {
        super(j);
        this.list = persistentList;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> getList$runtime() {
        return this.list;
    }

    public final void setList$runtime(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> persistentList) {
        this.list = persistentList;
    }

    /* renamed from: getModification$runtime, reason: from getter */
    public final int getModification() {
        return this.modification;
    }

    public final void setModification$runtime(int i) {
        this.modification = i;
    }

    /* renamed from: getStructuralChange$runtime, reason: from getter */
    public final int getStructuralChange() {
        return this.structuralChange;
    }

    public final void setStructuralChange$runtime(int i) {
        this.structuralChange = i;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(androidx.compose.runtime.snapshots.StateRecord value) {
        synchronized (androidx.compose.runtime.snapshots.SnapshotStateListKt.getHighSpeedVideoFpsRangesFor) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            this.list = ((androidx.compose.runtime.snapshots.StateListStateRecord) value).list;
            this.modification = ((androidx.compose.runtime.snapshots.StateListStateRecord) value).modification;
            this.structuralChange = ((androidx.compose.runtime.snapshots.StateListStateRecord) value).structuralChange;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final androidx.compose.runtime.snapshots.StateRecord create() {
        return create(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final androidx.compose.runtime.snapshots.StateRecord create(long snapshotId) {
        return new androidx.compose.runtime.snapshots.StateListStateRecord(snapshotId, this.list);
    }
}
