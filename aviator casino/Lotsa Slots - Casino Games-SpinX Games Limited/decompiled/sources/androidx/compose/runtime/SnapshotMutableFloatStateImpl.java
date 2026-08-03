package androidx.compose.runtime;

/* compiled from: SnapshotFloatState.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001!B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u0018H\u0096\u0002J\"\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "(F)V", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "floatValue", "getFloatValue", "()F", "setFloatValue", io.ktor.http.LinkHeader.Rel.Next, "Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "component1", "()Ljava/lang/Float;", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "FloatStateStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SnapshotMutableFloatStateImpl extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.snapshots.SnapshotMutableState<java.lang.Float> {
    public static final int $stable = 0;
    private androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord next;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    public /* synthetic */ java.lang.Float getValue() {
        return androidx.compose.runtime.MutableFloatState.CC.$default$getValue((androidx.compose.runtime.MutableFloatState) this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Float, java.lang.Object] */
    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ java.lang.Float getValue() {
        ?? value;
        value = getValue();
        return value;
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public /* synthetic */ void setValue(float f) {
        setFloatValue(f);
    }

    @Override // androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(java.lang.Float f) {
        setValue(f.floatValue());
    }

    public SnapshotMutableFloatStateImpl(float f) {
        this.next = new androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord(f);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public void setFloatValue(float f) {
        androidx.compose.runtime.snapshots.Snapshot current;
        androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord = (androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.next);
        float value = floatStateStateRecord.getValue();
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (value == f) {
                return;
            }
        } else if (!androidx.compose.runtime.internal.FloatingPointEquality_androidKt.isNan(value) && !androidx.compose.runtime.internal.FloatingPointEquality_androidKt.isNan(f) && value == f) {
            return;
        }
        androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord2 = this.next;
        androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
            ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.overwritableRecord(floatStateStateRecord2, this, current, floatStateStateRecord)).setValue(f);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
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

    @Override // androidx.compose.runtime.MutableState
    public kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> component2() {
        return new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.runtime.SnapshotMutableFloatStateImpl$component2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                invoke(f.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(float f) {
                androidx.compose.runtime.SnapshotMutableFloatStateImpl.this.setFloatValue(f);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        kotlin.jvm.internal.Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        float value = ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) current).getValue();
        float value2 = ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) applied).getValue();
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (value == value2) {
                return current;
            }
        } else if (!androidx.compose.runtime.internal.FloatingPointEquality_androidKt.isNan(value) && !androidx.compose.runtime.internal.FloatingPointEquality_androidKt.isNan(value2) && value == value2) {
            return current;
        }
        return null;
    }

    public java.lang.String toString() {
        return "MutableFloatState(value=" + ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* compiled from: SnapshotFloatState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "(F)V", "getValue", "()F", "setValue", "assign", "", "create", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class FloatStateStateRecord extends androidx.compose.runtime.snapshots.StateRecord {
        private float value;

        public final float getValue() {
            return this.value;
        }

        public final void setValue(float f) {
            this.value = f;
        }

        public FloatStateStateRecord(float f) {
            this.value = f;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public androidx.compose.runtime.snapshots.StateRecord create() {
            return new androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord(this.value);
        }
    }
}
