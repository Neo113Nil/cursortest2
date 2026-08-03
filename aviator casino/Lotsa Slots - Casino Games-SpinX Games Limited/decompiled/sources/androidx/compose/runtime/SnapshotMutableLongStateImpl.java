package androidx.compose.runtime;

/* compiled from: SnapshotLongState.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001!B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u0018H\u0096\u0002J\"\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "(J)V", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "longValue", "getLongValue", "()J", "setLongValue", io.ktor.http.LinkHeader.Rel.Next, "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "component1", "()Ljava/lang/Long;", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "LongStateStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SnapshotMutableLongStateImpl extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.MutableLongState, androidx.compose.runtime.snapshots.SnapshotMutableState<java.lang.Long> {
    public static final int $stable = 0;
    private androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord next;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public /* synthetic */ java.lang.Long getValue() {
        return androidx.compose.runtime.MutableLongState.CC.$default$getValue((androidx.compose.runtime.MutableLongState) this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Long, java.lang.Object] */
    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ java.lang.Long getValue() {
        ?? value;
        value = getValue();
        return value;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public /* synthetic */ void setValue(long j) {
        setLongValue(j);
    }

    @Override // androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(java.lang.Long l) {
        setValue(l.longValue());
    }

    public SnapshotMutableLongStateImpl(long j) {
        this.next = new androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord(j);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j) {
        androidx.compose.runtime.snapshots.Snapshot current;
        androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord = (androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.next);
        if (longStateStateRecord.getValue() != j) {
            androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord2 = this.next;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.overwritableRecord(longStateStateRecord2, this, current, longStateStateRecord)).setValue(j);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
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

    @Override // androidx.compose.runtime.MutableState
    public kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> component2() {
        return new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.runtime.SnapshotMutableLongStateImpl$component2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                invoke(l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(long j) {
                androidx.compose.runtime.SnapshotMutableLongStateImpl.this.setLongValue(j);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        kotlin.jvm.internal.Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) current).getValue() == ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) applied).getValue()) {
            return current;
        }
        return null;
    }

    public java.lang.String toString() {
        return "MutableLongState(value=" + ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* compiled from: SnapshotLongState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "(J)V", "getValue", "()J", "setValue", "assign", "", "create", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LongStateStateRecord extends androidx.compose.runtime.snapshots.StateRecord {
        private long value;

        public final long getValue() {
            return this.value;
        }

        public final void setValue(long j) {
            this.value = j;
        }

        public LongStateStateRecord(long j) {
            this.value = j;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public androidx.compose.runtime.snapshots.StateRecord create() {
            return new androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord(this.value);
        }
    }
}
