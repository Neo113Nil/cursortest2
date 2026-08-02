package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0007R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(J)V", "component1", "()Ljava/lang/Long;", "Lkotlin/Function1;", "", "component2", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "getHighSpeedVideoFpsRangesFor", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getLongValue", "()J", "setLongValue", "longValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "LongStateStateRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SnapshotMutableLongStateImpl extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.MutableLongState, androidx.compose.runtime.snapshots.SnapshotMutableState<java.lang.Long> {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord getHighSpeedVideoFpsRangesFor;

    public SnapshotMutableLongStateImpl(long j) {
        androidx.compose.runtime.snapshots.Snapshot currentSnapshot = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot();
        androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord = new androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord(currentSnapshot.getSnapshotId(), j);
        if (!(currentSnapshot instanceof androidx.compose.runtime.snapshots.GlobalSnapshot)) {
            longStateStateRecord.setNext$runtime(new androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord(androidx.compose.runtime.snapshots.SnapshotId_jvmKt.toSnapshotId(1), j));
        }
        this.getHighSpeedVideoFpsRangesFor = longStateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable(this.getHighSpeedVideoFpsRangesFor, this)).getCamera2StreamConfigurationMap();
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j) {
        androidx.compose.runtime.snapshots.Snapshot current;
        androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord = (androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighSpeedVideoFpsRangesFor);
        if (longStateStateRecord.getCamera2StreamConfigurationMap() != j) {
            androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord2 = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.runtime.SnapshotMutableLongStateImpl snapshotMutableLongStateImpl = this;
            androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord3 = longStateStateRecord;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.overwritableRecord(longStateStateRecord2, snapshotMutableLongStateImpl, current, longStateStateRecord3)).getHighResolutionOutputSizeshNQ4ISI(j);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, snapshotMutableLongStateImpl);
        }
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public androidx.compose.runtime.SnapshotMutationPolicy<java.lang.Long> getPolicy() {
        return androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public java.lang.Long component1() {
        return java.lang.Long.valueOf(getLongValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.SnapshotMutableLongStateImpl snapshotMutableLongStateImpl, long j) {
        snapshotMutableLongStateImpl.setLongValue(j);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.MutableState
    public kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> component2() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.SnapshotMutableLongStateImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotMutableLongStateImpl.Camera2StreamConfigurationMap(androidx.compose.runtime.SnapshotMutableLongStateImpl.this, ((java.lang.Long) obj).longValue());
                return Camera2StreamConfigurationMap;
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        this.getHighSpeedVideoFpsRangesFor = (androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(applied, "");
        if (((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) current).getCamera2StreamConfigurationMap() == ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) applied).getCamera2StreamConfigurationMap()) {
            return current;
        }
        return null;
    }

    public java.lang.String toString() {
        androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord = (androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighSpeedVideoFpsRangesFor);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableLongState(value=");
        sb.append(longStateStateRecord.getCamera2StreamConfigurationMap());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\rR\"\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "p1", "<init>", "(JJ)V", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Camera2StreamConfigurationMap", "J", "()J", "getHighResolutionOutputSizeshNQ4ISI", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class LongStateStateRecord extends androidx.compose.runtime.snapshots.StateRecord {
        private long Camera2StreamConfigurationMap;

        public LongStateStateRecord(long j, long j2) {
            super(j);
            this.Camera2StreamConfigurationMap = j2;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final long getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            this.Camera2StreamConfigurationMap = j;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(androidx.compose.runtime.snapshots.StateRecord p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
            this.Camera2StreamConfigurationMap = ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) p0).Camera2StreamConfigurationMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create() {
            return create(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create(long p0) {
            return new androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord(p0, this.Camera2StreamConfigurationMap);
        }
    }
}
