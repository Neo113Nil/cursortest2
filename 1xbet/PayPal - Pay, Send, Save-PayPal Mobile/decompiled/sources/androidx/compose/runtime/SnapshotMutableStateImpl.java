package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001+B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008W@WX\u0096\u000e¢\u0006\u0012\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00028\u00008G¢\u0006\f\u0012\u0004\b)\u0010!\u001a\u0004\b(\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "Lkotlin/Function1;", "component2", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "getValue", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "StateStateRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SnapshotMutableStateImpl<T> extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.snapshots.SnapshotMutableState<T> {
    public static final int $stable = 0;
    private androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.SnapshotMutationPolicy<T> policy;

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public SnapshotMutableStateImpl(T t, androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.policy = snapshotMutationPolicy;
        androidx.compose.runtime.snapshots.Snapshot currentSnapshot = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot();
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T> stateStateRecord = new androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<>(currentSnapshot.getSnapshotId(), t);
        if (!(currentSnapshot instanceof androidx.compose.runtime.snapshots.GlobalSnapshot)) {
            stateStateRecord.setNext$runtime(new androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord(androidx.compose.runtime.snapshots.SnapshotId_jvmKt.toSnapshotId(1), t));
        }
        this.getHighSpeedVideoSizes = stateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public androidx.compose.runtime.SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return (T) ((androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable(this.getHighSpeedVideoSizes, this)).getHighSpeedVideoFpsRanges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        androidx.compose.runtime.snapshots.Snapshot current;
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord stateStateRecord = (androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighSpeedVideoSizes);
        if (getPolicy().equivalent(stateStateRecord.getHighSpeedVideoFpsRanges(), t)) {
            return;
        }
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T> stateStateRecord2 = this.getHighSpeedVideoSizes;
        androidx.compose.runtime.SnapshotMutableStateImpl<T> snapshotMutableStateImpl = this;
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord stateStateRecord3 = stateStateRecord;
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
            ((androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.overwritableRecord(stateStateRecord2, snapshotMutableStateImpl, current, stateStateRecord3)).Camera2StreamConfigurationMap(t);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, snapshotMutableStateImpl);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        this.getHighSpeedVideoSizes = (androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        androidx.compose.runtime.snapshots.StateRecord stateRecord;
        kotlin.jvm.internal.Intrinsics.checkNotNull(previous, "");
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord stateStateRecord = (androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) previous;
        kotlin.jvm.internal.Intrinsics.checkNotNull(current, "");
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord stateStateRecord2 = (androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) current;
        kotlin.jvm.internal.Intrinsics.checkNotNull(applied, "");
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord stateStateRecord3 = (androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) applied;
        if (getPolicy().equivalent(stateStateRecord2.getHighSpeedVideoFpsRanges(), stateStateRecord3.getHighSpeedVideoFpsRanges())) {
            return current;
        }
        java.lang.Object merge = getPolicy().merge(stateStateRecord.getHighSpeedVideoFpsRanges(), stateStateRecord2.getHighSpeedVideoFpsRanges(), stateStateRecord3.getHighSpeedVideoFpsRanges());
        if (merge != null) {
            stateStateRecord3.getSnapshotId();
            androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord highResolutionOutputSizeshNQ4ISI = stateStateRecord3.getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(merge);
            stateRecord = highResolutionOutputSizeshNQ4ISI;
        } else {
            stateRecord = null;
        }
        return stateRecord;
    }

    public java.lang.String toString() {
        androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord stateStateRecord = (androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighSpeedVideoSizes);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableState(value=");
        sb.append(stateStateRecord.getHighSpeedVideoFpsRanges());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rR\"\u0010\u0010\u001a\u00028\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\f\u0010\u0012"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "p1", "<init>", "(JLjava/lang/Object;)V", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "Camera2StreamConfigurationMap", "()Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class StateStateRecord<T> extends androidx.compose.runtime.snapshots.StateRecord {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private T getHighSpeedVideoFpsRanges;

        public StateStateRecord(long j, T t) {
            super(j);
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final /* synthetic */ androidx.compose.runtime.snapshots.StateRecord create(long j) {
            return getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(androidx.compose.runtime.snapshots.StateRecord p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
            this.getHighSpeedVideoFpsRanges = ((androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) p0).getHighSpeedVideoFpsRanges;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.compose.runtime.snapshots.StateRecord
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T> create() {
            return new androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<>(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId(), this.getHighSpeedVideoFpsRanges);
        }

        public final androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T> getHighResolutionOutputSizeshNQ4ISI() {
            return new androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<>(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId(), this.getHighSpeedVideoFpsRanges);
        }

        public final void Camera2StreamConfigurationMap(T t) {
            this.getHighSpeedVideoFpsRanges = t;
        }

        public final T getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.SnapshotMutableStateImpl snapshotMutableStateImpl, java.lang.Object obj) {
        snapshotMutableStateImpl.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.MutableState
    public kotlin.jvm.functions.Function1<T, kotlin.Unit> component2() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.SnapshotMutableStateImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotMutableStateImpl.Camera2StreamConfigurationMap(androidx.compose.runtime.SnapshotMutableStateImpl.this, obj);
                return Camera2StreamConfigurationMap;
            }
        };
    }

    public final T getDebuggerDisplayValue() {
        return (T) ((androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighSpeedVideoSizes)).getHighSpeedVideoFpsRanges();
    }
}
