package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0007R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(F)V", "component1", "()Ljava/lang/Float;", "Lkotlin/Function1;", "", "component2", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "getHighResolutionOutputSizeshNQ4ISI", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFloatValue", "()F", "setFloatValue", "floatValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "FloatStateStateRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SnapshotMutableFloatStateImpl extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.snapshots.SnapshotMutableState<java.lang.Float> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord getHighResolutionOutputSizeshNQ4ISI;

    public SnapshotMutableFloatStateImpl(float f) {
        androidx.compose.runtime.snapshots.Snapshot currentSnapshot = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot();
        androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord = new androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord(currentSnapshot.getSnapshotId(), f);
        if (!(currentSnapshot instanceof androidx.compose.runtime.snapshots.GlobalSnapshot)) {
            floatStateStateRecord.setNext$runtime(new androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord(androidx.compose.runtime.snapshots.SnapshotId_jvmKt.toSnapshotId(1), f));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = floatStateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable(this.getHighResolutionOutputSizeshNQ4ISI, this)).getGetHighSpeedVideoFpsRanges();
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public void setFloatValue(float f) {
        androidx.compose.runtime.snapshots.Snapshot current;
        androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord = (androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighResolutionOutputSizeshNQ4ISI);
        if (floatStateStateRecord.getGetHighSpeedVideoFpsRanges() == f) {
            return;
        }
        androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord2 = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = this;
        androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord3 = floatStateStateRecord;
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
            ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.overwritableRecord(floatStateStateRecord2, snapshotMutableFloatStateImpl, current, floatStateStateRecord3)).Camera2StreamConfigurationMap(f);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, snapshotMutableFloatStateImpl);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public androidx.compose.runtime.SnapshotMutationPolicy<java.lang.Float> getPolicy() {
        return androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public java.lang.Float component1() {
        return java.lang.Float.valueOf(getFloatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl, float f) {
        snapshotMutableFloatStateImpl.setFloatValue(f);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.MutableState
    public kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> component2() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.SnapshotMutableFloatStateImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotMutableFloatStateImpl.Camera2StreamConfigurationMap(androidx.compose.runtime.SnapshotMutableFloatStateImpl.this, ((java.lang.Float) obj).floatValue());
                return Camera2StreamConfigurationMap;
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(current, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(applied, "");
        if (((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) current).getGetHighSpeedVideoFpsRanges() == ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) applied).getGetHighSpeedVideoFpsRanges()) {
            return current;
        }
        return null;
    }

    public java.lang.String toString() {
        androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord = (androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableFloatState(value=");
        sb.append(floatStateStateRecord.getGetHighSpeedVideoFpsRanges());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "", "p1", "<init>", "(JF)V", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "()F", "Camera2StreamConfigurationMap", "(F)V", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FloatStateStateRecord extends androidx.compose.runtime.snapshots.StateRecord {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private float getHighSpeedVideoFpsRanges;

        public FloatStateStateRecord(long j, float f) {
            super(j);
            this.getHighSpeedVideoFpsRanges = f;
        }

        public final void Camera2StreamConfigurationMap(float f) {
            this.getHighSpeedVideoFpsRanges = f;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final float getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(androidx.compose.runtime.snapshots.StateRecord p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
            this.getHighSpeedVideoFpsRanges = ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) p0).getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create() {
            return create(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create(long p0) {
            return new androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord(p0, this.getHighSpeedVideoFpsRanges);
        }
    }
}
