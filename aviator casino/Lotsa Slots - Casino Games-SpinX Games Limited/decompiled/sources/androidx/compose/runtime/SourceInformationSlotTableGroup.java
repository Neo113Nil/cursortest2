package androidx.compose.runtime;

/* compiled from: SlotTable.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0096\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/runtime/SourceInformationSlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", com.ironsource.B5.R, "Landroidx/compose/runtime/SlotTable;", "sourceInformation", "Landroidx/compose/runtime/GroupSourceInformation;", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/GroupSourceInformation;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "", "getData", "isEmpty", "", "()Z", com.ironsource.X3.i.W, "getKey", "()Ljava/lang/Object;", "node", "getNode", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "getSourceInformation", "()Landroidx/compose/runtime/GroupSourceInformation;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "iterator", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SourceInformationSlotTableGroup implements androidx.compose.runtime.tooling.CompositionGroup, java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.lang.Object key;
    private final androidx.compose.runtime.GroupSourceInformation sourceInformation;
    private final androidx.compose.runtime.SlotTable table;
    private final java.lang.Iterable<java.lang.Object> data = kotlin.collections.CollectionsKt.emptyList();
    private final java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup> compositionGroups = this;

    @Override // androidx.compose.runtime.tooling.CompositionData
    public /* synthetic */ androidx.compose.runtime.tooling.CompositionGroup find(java.lang.Object obj) {
        return androidx.compose.runtime.tooling.CompositionData.CC.$default$find(this, obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public /* synthetic */ int getGroupSize() {
        return androidx.compose.runtime.tooling.CompositionGroup.CC.$default$getGroupSize(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public /* synthetic */ java.lang.Object getIdentity() {
        return androidx.compose.runtime.tooling.CompositionGroup.CC.$default$getIdentity(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.Object getNode() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public /* synthetic */ int getSlotsSize() {
        return androidx.compose.runtime.tooling.CompositionGroup.CC.$default$getSlotsSize(this);
    }

    public SourceInformationSlotTableGroup(androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        this.sourceInformation = groupSourceInformation;
        this.key = java.lang.Integer.valueOf(groupSourceInformation.getKey());
    }

    public final androidx.compose.runtime.SlotTable getTable() {
        return this.table;
    }

    public final androidx.compose.runtime.GroupSourceInformation getSourceInformation() {
        return this.sourceInformation;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.String getSourceInfo() {
        return this.sourceInformation.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.Iterable<java.lang.Object> getData() {
        return this.data;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup> getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        java.util.ArrayList<java.lang.Object> groups = this.sourceInformation.getGroups();
        boolean z = false;
        if (groups != null && !groups.isEmpty()) {
            z = true;
        }
        return !z;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<androidx.compose.runtime.tooling.CompositionGroup> iterator() {
        return new androidx.compose.runtime.SourceInformationGroupIterator(this.table, this.sourceInformation);
    }
}
