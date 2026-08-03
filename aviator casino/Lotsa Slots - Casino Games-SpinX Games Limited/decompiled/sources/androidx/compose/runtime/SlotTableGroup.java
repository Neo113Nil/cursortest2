package androidx.compose.runtime;

/* compiled from: SlotTable.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\rH\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010¨\u0006,"}, d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", com.ironsource.B5.R, "Landroidx/compose/runtime/SlotTable;", "group", "", "version", "(Landroidx/compose/runtime/SlotTable;II)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "", "getData", "getGroup", "()I", "groupSize", "getGroupSize", "identity", "getIdentity", "()Ljava/lang/Object;", "isEmpty", "", "()Z", com.ironsource.X3.i.W, "getKey", "node", "getNode", "slotsSize", "getSlotsSize", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "getVersion", "find", "identityToFind", "iterator", "", "validateRead", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SlotTableGroup implements androidx.compose.runtime.tooling.CompositionGroup, java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup>, kotlin.jvm.internal.markers.KMappedMarker {
    private final int group;
    private final androidx.compose.runtime.SlotTable table;
    private final int version;

    public SlotTableGroup(androidx.compose.runtime.SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.group = i;
        this.version = i2;
    }

    public final androidx.compose.runtime.SlotTable getTable() {
        return this.table;
    }

    public final int getGroup() {
        return this.group;
    }

    public /* synthetic */ SlotTableGroup(androidx.compose.runtime.SlotTable slotTable, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(slotTable, i, (i3 & 4) != 0 ? slotTable.getVersion() : i2);
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        int groupSize;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize == 0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.Object getKey() {
        boolean hasObjectKey;
        int key;
        int objectKeyIndex;
        hasObjectKey = androidx.compose.runtime.SlotTableKt.hasObjectKey(this.table.getGroups(), this.group);
        if (!hasObjectKey) {
            key = androidx.compose.runtime.SlotTableKt.key(this.table.getGroups(), this.group);
            return java.lang.Integer.valueOf(key);
        }
        java.lang.Object[] slots = this.table.getSlots();
        objectKeyIndex = androidx.compose.runtime.SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group);
        java.lang.Object obj = slots[objectKeyIndex];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.String getSourceInfo() {
        boolean hasAux;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap$runtime_release;
        androidx.compose.runtime.GroupSourceInformation groupSourceInformation;
        int auxIndex;
        hasAux = androidx.compose.runtime.SlotTableKt.hasAux(this.table.getGroups(), this.group);
        if (hasAux) {
            java.lang.Object[] slots = this.table.getSlots();
            auxIndex = androidx.compose.runtime.SlotTableKt.auxIndex(this.table.getGroups(), this.group);
            java.lang.Object obj = slots[auxIndex];
            if (obj instanceof java.lang.String) {
                return (java.lang.String) obj;
            }
            return null;
        }
        androidx.compose.runtime.Anchor tryAnchor = this.table.tryAnchor(this.group);
        if (tryAnchor == null || (sourceInformationMap$runtime_release = this.table.getSourceInformationMap$runtime_release()) == null || (groupSourceInformation = sourceInformationMap$runtime_release.get(tryAnchor)) == null) {
            return null;
        }
        return groupSourceInformation.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.Object getNode() {
        boolean isNode;
        int nodeIndex;
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.table.getGroups(), this.group);
        if (!isNode) {
            return null;
        }
        java.lang.Object[] slots = this.table.getSlots();
        nodeIndex = androidx.compose.runtime.SlotTableKt.nodeIndex(this.table.getGroups(), this.group);
        return slots[nodeIndex];
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.Iterable<java.lang.Object> getData() {
        return new androidx.compose.runtime.DataIterator(this.table, this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public java.lang.Object getIdentity() {
        validateRead();
        androidx.compose.runtime.SlotReader openReader = this.table.openReader();
        try {
            return openReader.anchor(this.group);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<androidx.compose.runtime.tooling.CompositionGroup> iterator() {
        int groupSize;
        validateRead();
        androidx.compose.runtime.GroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        if (sourceInformationOf != null) {
            return new androidx.compose.runtime.SourceInformationGroupIterator(this.table, sourceInformationOf);
        }
        androidx.compose.runtime.SlotTable slotTable = this.table;
        int i = this.group;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(slotTable.getGroups(), this.group);
        return new androidx.compose.runtime.GroupIterator(slotTable, i + 1, i + groupSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int groupSize;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int dataAnchor;
        int groupSize = this.group + getGroupSize();
        if (groupSize < this.table.getGroupsSize()) {
            slotsSize = androidx.compose.runtime.SlotTableKt.dataAnchor(this.table.getGroups(), groupSize);
        } else {
            slotsSize = this.table.getSlotsSize();
        }
        dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(this.table.getGroups(), this.group);
        return slotsSize - dataAnchor;
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public androidx.compose.runtime.tooling.CompositionGroup find(java.lang.Object identityToFind) {
        int anchorIndex;
        int i;
        int groupSize;
        androidx.compose.runtime.SlotTableGroup slotTableGroup = null;
        androidx.compose.runtime.Anchor anchor = identityToFind instanceof androidx.compose.runtime.Anchor ? (androidx.compose.runtime.Anchor) identityToFind : null;
        if (anchor != null && this.table.ownsAnchor(anchor) && (anchorIndex = this.table.anchorIndex(anchor)) >= (i = this.group)) {
            int i2 = anchorIndex - i;
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.table.getGroups(), this.group);
            if (i2 < groupSize) {
                slotTableGroup = new androidx.compose.runtime.SlotTableGroup(this.table, anchorIndex, this.version);
            }
        }
        return slotTableGroup;
    }
}
