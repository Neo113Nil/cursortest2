package androidx.compose.runtime;

/* compiled from: SlotTable.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020\nJ\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020CJ\u000e\u0010E\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\u0006\u0010F\u001a\u00020CJ\u0006\u0010G\u001a\u00020CJ\f\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IJ\u0010\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u0010\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u0018\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010M\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010@\u001a\u00020;J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010N\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\u000e\u0010O\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\u000e\u0010*\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\nJ\b\u0010P\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010R\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010S\u001a\u00020C2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010T\u001a\u00020C2\u0006\u0010A\u001a\u00020\nJ\u0006\u0010U\u001a\u00020\nJ\u0006\u0010V\u001a\u00020CJ\u0006\u0010W\u001a\u00020CJ\u0006\u0010X\u001a\u00020CJ\b\u0010Y\u001a\u00020ZH\u0016J\u0016\u0010[\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010A\u001a\u00020\nH\u0002J\u0016\u0010Q\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010A\u001a\u00020\nH\u0002J\u0016\u0010\\\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010A\u001a\u00020\nH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b)\u0010\tR\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010\tR\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\rR\u001e\u0010-\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\rR\u0011\u0010/\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\rR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\rR\u0011\u00103\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u0010\rR\u0018\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000106X\u0082\u0004¢\u0006\u0004\n\u0002\u00107R\u000e\u00108\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u00109\u001a\"\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u00010:j\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u0001`=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006]"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", com.ironsource.B5.R, "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "closed", "getClosed", "()Z", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "inEmpty", "getInEmpty", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", io.ktor.http.LinkHeader.Parameters.Anchor, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "beginEmpty", "", "close", "containsMark", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "get", "groupGet", "group", "hasMark", "hasObjectKey", io.ktor.http.LinkHeader.Rel.Next, "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "toString", "", "aux", "objectKey", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    private final java.lang.Object[] slots;
    private final int slotsSize;
    private java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap;
    private final androidx.compose.runtime.SlotTable table;

    public SlotReader(androidx.compose.runtime.SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    /* renamed from: getTable$runtime_release, reason: from getter */
    public final androidx.compose.runtime.SlotTable getTable() {
        return this.table;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    /* renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        int slotAnchor;
        int i = this.currentSlot;
        slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(this.groups, this.parent);
        return i - slotAnchor;
    }

    public final int parent(int index) {
        int parentAnchor;
        parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, index);
        return parentAnchor;
    }

    public final boolean isNode() {
        boolean isNode;
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, this.currentGroup);
        return isNode;
    }

    public final boolean isNode(int index) {
        boolean isNode;
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, index);
        return isNode;
    }

    public final int getNodeCount() {
        int nodeCount;
        nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, this.currentGroup);
        return nodeCount;
    }

    public final int nodeCount(int index) {
        int nodeCount;
        nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, index);
        return nodeCount;
    }

    public final java.lang.Object node(int index) {
        boolean isNode;
        isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, index);
        if (isNode) {
            return node(this.groups, index);
        }
        return null;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int groupSize(int index) {
        int groupSize;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, index);
        return groupSize;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int groupEnd(int index) {
        int groupSize;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, index);
        return index + groupSize;
    }

    public final int getGroupKey() {
        int key;
        int i = this.currentGroup;
        if (i >= this.currentEnd) {
            return 0;
        }
        key = androidx.compose.runtime.SlotTableKt.key(this.groups, i);
        return key;
    }

    public final int groupKey(int index) {
        int key;
        key = androidx.compose.runtime.SlotTableKt.key(this.groups, index);
        return key;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i = this.currentSlot;
        slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(this.groups, this.parent);
        return i - slotAnchor;
    }

    public final boolean hasObjectKey(int index) {
        boolean hasObjectKey;
        hasObjectKey = androidx.compose.runtime.SlotTableKt.hasObjectKey(this.groups, index);
        return hasObjectKey;
    }

    public final java.lang.Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final java.lang.Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final java.lang.Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final java.lang.Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final java.lang.Object getGroupNode() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return node(this.groups, i);
        }
        return null;
    }

    public final int groupKey(androidx.compose.runtime.Anchor anchor) {
        int key;
        if (!anchor.getValid()) {
            return 0;
        }
        key = androidx.compose.runtime.SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        return key;
    }

    public final boolean hasMark(int index) {
        boolean hasMark;
        hasMark = androidx.compose.runtime.SlotTableKt.hasMark(this.groups, index);
        return hasMark;
    }

    public final boolean containsMark(int index) {
        boolean containsMark;
        containsMark = androidx.compose.runtime.SlotTableKt.containsMark(this.groups, index);
        return containsMark;
    }

    public final int getParentNodes() {
        int nodeCount;
        int i = this.parent;
        if (i < 0) {
            return 0;
        }
        nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, i);
        return nodeCount;
    }

    public final int parentOf(int index) {
        int parentAnchor;
        if (index >= 0 && index < this.groupsSize) {
            parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, index);
            return parentAnchor;
        }
        throw new java.lang.IllegalArgumentException(("Invalid group index " + index).toString());
    }

    public final int getGroupSlotCount() {
        int slotAnchor;
        int i = this.currentGroup;
        slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(this.groups, i);
        int i2 = i + 1;
        return (i2 < this.groupsSize ? androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, i2) : this.slotsSize) - slotAnchor;
    }

    public final java.lang.Object get(int index) {
        int i = this.currentSlot + index;
        return i < this.currentSlotEnd ? this.slots[i] : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final java.lang.Object groupGet(int index) {
        return groupGet(this.currentGroup, index);
    }

    public final java.lang.Object groupGet(int group, int index) {
        int slotAnchor;
        slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(this.groups, group);
        int i = group + 1;
        int i2 = slotAnchor + index;
        return i2 < (i < this.groupsSize ? androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, i) : this.slotsSize) ? this.slots[i2] : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final java.lang.Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        java.lang.Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void endEmpty() {
        int i = this.emptyCount;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i - 1;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final void startGroup() {
        int parentAnchor;
        int groupSize;
        int slotAnchor;
        int dataAnchor;
        androidx.compose.runtime.GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.currentGroup;
            parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, i2);
            if (parentAnchor != i) {
                throw new java.lang.IllegalArgumentException("Invalid slot table detected".toString());
            }
            java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
            if (hashMap != null && (groupSourceInformation = hashMap.get(anchor(i))) != null) {
                groupSourceInformation.reportGroup(this.table, i2);
            }
            this.parent = i2;
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, i2);
            this.currentEnd = groupSize + i2;
            int i3 = i2 + 1;
            this.currentGroup = i3;
            slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(this.groups, i2);
            this.currentSlot = slotAnchor;
            if (i2 < this.groupsSize - 1) {
                dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, i3);
            } else {
                dataAnchor = this.slotsSize;
            }
            this.currentSlotEnd = dataAnchor;
        }
    }

    public final void startNode() {
        boolean isNode;
        if (this.emptyCount <= 0) {
            isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, this.currentGroup);
            if (!isNode) {
                throw new java.lang.IllegalArgumentException("Expected a node group".toString());
            }
            startGroup();
        }
    }

    public final int skipGroup() {
        boolean isNode;
        int groupSize;
        if (this.emptyCount == 0) {
            isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, this.currentGroup);
            int nodeCount = isNode ? 1 : androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, this.currentGroup);
            int i = this.currentGroup;
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, i);
            this.currentGroup = i + groupSize;
            return nodeCount;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount == 0) {
            this.currentGroup = this.currentEnd;
        } else {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final void reposition(int index) {
        int groupSize;
        if (this.emptyCount == 0) {
            this.currentGroup = index;
            int parentAnchor = index < this.groupsSize ? androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, index) : -1;
            this.parent = parentAnchor;
            if (parentAnchor >= 0) {
                groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, parentAnchor);
                this.currentEnd = parentAnchor + groupSize;
            } else {
                this.currentEnd = this.groupsSize;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void restoreParent(int index) {
        int groupSize;
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, index);
        int i = groupSize + index;
        int i2 = this.currentGroup;
        if (!(i2 >= index && i2 <= i)) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError(("Index " + index + " is not a parent of " + i2).toString());
            throw new kotlin.KotlinNothingValueException();
        }
        this.parent = index;
        this.currentEnd = i;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void endGroup() {
        int parentAnchor;
        int groupSize;
        int i;
        if (this.emptyCount == 0) {
            if (this.currentGroup == this.currentEnd) {
                parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, this.parent);
                this.parent = parentAnchor;
                if (parentAnchor >= 0) {
                    groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, parentAnchor);
                    i = parentAnchor + groupSize;
                } else {
                    i = this.groupsSize;
                }
                this.currentEnd = i;
                return;
            }
            androidx.compose.runtime.ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final java.util.List<androidx.compose.runtime.KeyInfo> extractKeys() {
        int key;
        boolean isNode;
        int nodeCount;
        int i;
        int groupSize;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i2 = this.currentGroup;
        int i3 = 0;
        while (i2 < this.currentEnd) {
            key = androidx.compose.runtime.SlotTableKt.key(this.groups, i2);
            java.lang.Object objectKey = objectKey(this.groups, i2);
            isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, i2);
            if (isNode) {
                i = 1;
            } else {
                nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, i2);
                i = nodeCount;
            }
            arrayList.add(new androidx.compose.runtime.KeyInfo(key, objectKey, i2, i, i3));
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, i2);
            i2 += groupSize;
            i3++;
        }
        return arrayList;
    }

    public java.lang.String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    public static /* synthetic */ androidx.compose.runtime.Anchor anchor$default(androidx.compose.runtime.SlotReader slotReader, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.currentGroup;
        }
        return slotReader.anchor(i);
    }

    public final androidx.compose.runtime.Anchor anchor(int index) {
        java.util.ArrayList<androidx.compose.runtime.Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int search = androidx.compose.runtime.SlotTableKt.search(anchors$runtime_release, index, this.groupsSize);
        if (search < 0) {
            androidx.compose.runtime.Anchor anchor = new androidx.compose.runtime.Anchor(index);
            anchors$runtime_release.add(-(search + 1), anchor);
            return anchor;
        }
        return anchors$runtime_release.get(search);
    }

    private final java.lang.Object node(int[] iArr, int i) {
        boolean isNode;
        int nodeIndex;
        isNode = androidx.compose.runtime.SlotTableKt.isNode(iArr, i);
        if (isNode) {
            java.lang.Object[] objArr = this.slots;
            nodeIndex = androidx.compose.runtime.SlotTableKt.nodeIndex(iArr, i);
            return objArr[nodeIndex];
        }
        return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    private final java.lang.Object aux(int[] iArr, int i) {
        boolean hasAux;
        int auxIndex;
        hasAux = androidx.compose.runtime.SlotTableKt.hasAux(iArr, i);
        if (hasAux) {
            java.lang.Object[] objArr = this.slots;
            auxIndex = androidx.compose.runtime.SlotTableKt.auxIndex(iArr, i);
            return objArr[auxIndex];
        }
        return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    private final java.lang.Object objectKey(int[] iArr, int i) {
        boolean hasObjectKey;
        int objectKeyIndex;
        hasObjectKey = androidx.compose.runtime.SlotTableKt.hasObjectKey(iArr, i);
        if (!hasObjectKey) {
            return null;
        }
        java.lang.Object[] objArr = this.slots;
        objectKeyIndex = androidx.compose.runtime.SlotTableKt.objectKeyIndex(iArr, i);
        return objArr[objectKeyIndex];
    }
}
