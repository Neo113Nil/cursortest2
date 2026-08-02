package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001'B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0007R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(D)V", "component1", "()Ljava/lang/Double;", "Lkotlin/Function1;", "", "component2", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getDoubleValue", "()D", "setDoubleValue", "doubleValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "DoubleStateStateRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SnapshotMutableDoubleStateImpl extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.snapshots.SnapshotMutableState<java.lang.Double> {
    public static final int $stable = 0;
    private androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord getHighSpeedVideoSizes;

    public SnapshotMutableDoubleStateImpl(double d) {
        androidx.compose.runtime.snapshots.Snapshot currentSnapshot = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot();
        androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord = new androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord(currentSnapshot.getSnapshotId(), d);
        if (!(currentSnapshot instanceof androidx.compose.runtime.snapshots.GlobalSnapshot)) {
            doubleStateStateRecord.setNext$runtime(new androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord(androidx.compose.runtime.snapshots.SnapshotId_jvmKt.toSnapshotId(1), d));
        }
        this.getHighSpeedVideoSizes = doubleStateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return ((androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable(this.getHighSpeedVideoSizes, this)).getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void setDoubleValue(double d) {
        androidx.compose.runtime.snapshots.Snapshot current;
        androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord = (androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighSpeedVideoSizes);
        if (doubleStateStateRecord.getHighSpeedVideoFpsRangesFor == d) {
            return;
        }
        androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord2 = this.getHighSpeedVideoSizes;
        androidx.compose.runtime.SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = this;
        androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord3 = doubleStateStateRecord;
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
            ((androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.overwritableRecord(doubleStateStateRecord2, snapshotMutableDoubleStateImpl, current, doubleStateStateRecord3)).getHighSpeedVideoFpsRangesFor = d;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, snapshotMutableDoubleStateImpl);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public androidx.compose.runtime.SnapshotMutationPolicy<java.lang.Double> getPolicy() {
        return androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public java.lang.Double component1() {
        return java.lang.Double.valueOf(getDoubleValue());
    }

    @Override // androidx.compose.runtime.MutableState
    public kotlin.jvm.functions.Function1<java.lang.Double, kotlin.Unit> component2() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.SnapshotMutableDoubleStateImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.runtime.SnapshotMutableDoubleStateImpl.m5277$r8$lambda$snifROT7l0ZcZI9Kr_sjlSvWpU(androidx.compose.runtime.SnapshotMutableDoubleStateImpl.this, ((java.lang.Double) obj).doubleValue());
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        this.getHighSpeedVideoSizes = (androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(applied, "");
        if (((androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) current).getHighSpeedVideoFpsRangesFor == ((androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) applied).getHighSpeedVideoFpsRangesFor) {
            return current;
        }
        return null;
    }

    public java.lang.String toString() {
        androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord = (androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighSpeedVideoSizes);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableDoubleState(value=");
        sb.append(doubleStateStateRecord.getHighSpeedVideoFpsRangesFor);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00058\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "", "p1", "<init>", "(JD)V", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "getHighResolutionOutputSizeshNQ4ISI", "D", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DoubleStateStateRecord extends androidx.compose.runtime.snapshots.StateRecord {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        double getHighSpeedVideoFpsRangesFor;

        public DoubleStateStateRecord(long j, double d) {
            super(j);
            this.getHighSpeedVideoFpsRangesFor = d;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(androidx.compose.runtime.snapshots.StateRecord p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
            this.getHighSpeedVideoFpsRangesFor = ((androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord) p0).getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create() {
            return create(getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create(long p0) {
            return new androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord(p0, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    /* renamed from: $r8$lambda$-snifROT7l0ZcZI9Kr_sjlSvWpU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m5277$r8$lambda$snifROT7l0ZcZI9Kr_sjlSvWpU(androidx.compose.runtime.SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl, double d) {
        snapshotMutableDoubleStateImpl.setDoubleValue(d);
        return kotlin.Unit.INSTANCE;
    }
}
