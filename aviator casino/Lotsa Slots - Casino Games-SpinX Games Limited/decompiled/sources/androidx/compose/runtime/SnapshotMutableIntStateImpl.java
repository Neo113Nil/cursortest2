package androidx.compose.runtime;

/* compiled from: SnapshotIntState.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001%B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001cH\u0096\u0002J\"\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\rH\u0016J\b\u0010#\u001a\u00020$H\u0016R\u001a\u0010\u0007\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0006R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableIntStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "(I)V", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "()I", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "intValue", "getIntValue", "setIntValue", io.ktor.http.LinkHeader.Rel.Next, "Landroidx/compose/runtime/SnapshotMutableIntStateImpl$IntStateStateRecord;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "component1", "()Ljava/lang/Integer;", "component2", "Lkotlin/Function1;", "", "mergeRecords", "previous", "current", "applied", "prependStateRecord", "toString", "", "IntStateStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SnapshotMutableIntStateImpl extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.MutableIntState, androidx.compose.runtime.snapshots.SnapshotMutableState<java.lang.Integer> {
    public static final int $stable = 0;
    private androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord next;

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState, androidx.compose.runtime.State
    public /* synthetic */ java.lang.Integer getValue() {
        return androidx.compose.runtime.MutableIntState.CC.$default$getValue((androidx.compose.runtime.MutableIntState) this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Integer, java.lang.Object] */
    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ java.lang.Integer getValue() {
        ?? value;
        value = getValue();
        return value;
    }

    @Override // androidx.compose.runtime.MutableIntState
    public /* synthetic */ void setValue(int i) {
        setIntValue(i);
    }

    @Override // androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(java.lang.Integer num) {
        setValue(num.intValue());
    }

    public SnapshotMutableIntStateImpl(int i) {
        this.next = new androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord(i);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState
    public int getIntValue() {
        return ((androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.MutableIntState
    public void setIntValue(int i) {
        androidx.compose.runtime.snapshots.Snapshot current;
        androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord intStateStateRecord = (androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.next);
        if (intStateStateRecord.getValue() != i) {
            androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord intStateStateRecord2 = this.next;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                ((androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.overwritableRecord(intStateStateRecord2, this, current, intStateStateRecord)).setValue(i);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public androidx.compose.runtime.SnapshotMutationPolicy<java.lang.Integer> getPolicy() {
        return androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public java.lang.Integer component1() {
        return java.lang.Integer.valueOf(getIntValue());
    }

    @Override // androidx.compose.runtime.MutableState
    public kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> component2() {
        return new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.SnapshotMutableIntStateImpl$component2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                invoke(num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i) {
                androidx.compose.runtime.SnapshotMutableIntStateImpl.this.setIntValue(i);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.next = (androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        kotlin.jvm.internal.Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) current).getValue() == ((androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) applied).getValue()) {
            return current;
        }
        return null;
    }

    public java.lang.String toString() {
        return "MutableIntState(value=" + ((androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    public final int getDebuggerDisplayValue() {
        return ((androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.next)).getValue();
    }

    /* compiled from: SnapshotIntState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableIntStateImpl$IntStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "(I)V", "getValue", "()I", "setValue", "assign", "", "create", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class IntStateStateRecord extends androidx.compose.runtime.snapshots.StateRecord {
        private int value;

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        public IntStateStateRecord(int i) {
            this.value = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.value = ((androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public androidx.compose.runtime.snapshots.StateRecord create() {
            return new androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord(this.value);
        }
    }
}
