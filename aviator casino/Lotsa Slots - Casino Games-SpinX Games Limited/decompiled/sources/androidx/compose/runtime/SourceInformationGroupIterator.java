package androidx.compose.runtime;

/* compiled from: SlotTable.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\t\u0010\u0011\u001a\u00020\u0002H\u0096\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", com.ironsource.B5.R, "Landroidx/compose/runtime/SlotTable;", "group", "Landroidx/compose/runtime/GroupSourceInformation;", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/GroupSourceInformation;)V", "getGroup", "()Landroidx/compose/runtime/GroupSourceInformation;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getTable", "()Landroidx/compose/runtime/SlotTable;", "version", "hasNext", "", io.ktor.http.LinkHeader.Rel.Next, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SourceInformationGroupIterator implements java.util.Iterator<androidx.compose.runtime.tooling.CompositionGroup>, kotlin.jvm.internal.markers.KMappedMarker {
    private final androidx.compose.runtime.GroupSourceInformation group;
    private int index;
    private final androidx.compose.runtime.SlotTable table;
    private final int version;

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SourceInformationGroupIterator(androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        this.group = groupSourceInformation;
        this.version = slotTable.getVersion();
    }

    public final androidx.compose.runtime.SlotTable getTable() {
        return this.table;
    }

    public final androidx.compose.runtime.GroupSourceInformation getGroup() {
        return this.group;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.util.ArrayList<java.lang.Object> groups = this.group.getGroups();
        return groups != null && this.index < groups.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public androidx.compose.runtime.tooling.CompositionGroup next() {
        java.lang.Object obj;
        java.util.ArrayList<java.lang.Object> groups = this.group.getGroups();
        if (groups != null) {
            int i = this.index;
            this.index = i + 1;
            obj = groups.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof androidx.compose.runtime.Anchor) {
            return new androidx.compose.runtime.SlotTableGroup(this.table, ((androidx.compose.runtime.Anchor) obj).getLocation(), this.version);
        }
        if (obj instanceof androidx.compose.runtime.GroupSourceInformation) {
            return new androidx.compose.runtime.SourceInformationSlotTableGroup(this.table, (androidx.compose.runtime.GroupSourceInformation) obj);
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new kotlin.KotlinNothingValueException();
    }
}
