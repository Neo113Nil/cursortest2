package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\tJ\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\tJ\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\fJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\fJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\tJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u000fJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020#¢\u0006\u0004\b'\u0010%J\r\u0010(\u001a\u00020#¢\u0006\u0004\b(\u0010%J\r\u0010)\u001a\u00020#¢\u0006\u0004\b)\u0010%J\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020#¢\u0006\u0004\b,\u0010%J\u0015\u0010-\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00020#¢\u0006\u0004\b0\u0010%J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u00108J\u001d\u0010;\u001a\u0004\u0018\u00010\u0001*\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<J\u001d\u0010=\u001a\u0004\u0018\u00010\u0001*\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010<J\u001d\u0010>\u001a\u0004\u0018\u00010\u0001*\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010;\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010BR\u0014\u0010>\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010=\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010DR6\u0010O\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020K\u0018\u00010Jj\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020K\u0018\u0001`L8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010P\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\"\u0010T\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010D\u001a\u0004\bU\u0010+\"\u0004\bV\u0010.R$\u0010W\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bW\u0010D\u001a\u0004\bX\u0010+R$\u0010\b\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bY\u0010+R\u0014\u0010M\u001a\u00020Z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010[R\u0016\u0010\\\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010DR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010DR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0011\u0010^\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b]\u0010+R\u0011\u0010`\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b_\u0010+R\u0011\u0010\u000b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010SR\u0011\u0010\r\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\ba\u0010+R\u0011\u0010b\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\bb\u0010SR\u0011\u0010d\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\bc\u0010SR\u0011\u0010\u0010\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\be\u0010+R\u0011\u0010\u0013\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bf\u0010+R\u0011\u0010\u0014\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bg\u0010+R\u0011\u0010i\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bh\u0010+R\u0011\u0010\u0015\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\bj\u0010SR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\bk\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\bl\u0010\"R\u0013\u0010n\u001a\u0004\u0018\u00010\u00018G¢\u0006\u0006\u001a\u0004\bm\u0010\"R\u0011\u0010p\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bo\u0010+R\u0011\u0010r\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bq\u0010+R\u0011\u0010t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bs\u0010+R$\u0010u\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bu\u0010Q\u001a\u0004\bv\u0010S"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "parent", "(I)I", "", "isNode", "(I)Z", "nodeCount", "node", "(I)Ljava/lang/Object;", "groupSize", "group", "slotSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "(Landroidx/compose/runtime/Anchor;)I", "hasMark", "containsMark", "parentOf", "get", "groupGet", "(II)Ljava/lang/Object;", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "beginEmpty", "()V", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "()I", "skipToGroupEnd", "reposition", "(I)V", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "(I)Landroidx/compose/runtime/Anchor;", "", "p0", "getHighSpeedVideoSizes", "([II)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "[I", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "", "getOutputFormats", "[Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "getInputSizeshNQ4ISI", "Ljava/util/HashMap;", "Camera2StreamConfigurationMap", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Z", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "setCurrentGroup", "currentEnd", "getCurrentEnd", "getParent", "Landroidx/compose/runtime/IntStack;", "Landroidx/compose/runtime/IntStack;", "getHighSpeedVideoSizesFor", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getHasObjectKey", "getGroupObjectKey", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getRemainingSlots", "remainingSlots", "getGroupSlotCount", "groupSlotCount", "hadNext", "getHadNext"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.IntStack getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private java.lang.Object[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private boolean hadNext;
    private int parent;
    private final androidx.compose.runtime.SlotTable table;

    public SlotReader(androidx.compose.runtime.SlotTable slotTable) {
        this.table = slotTable;
        this.getHighSpeedVideoSizes = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.getHighSpeedVideoFpsRanges = groupsSize;
        this.getHighSpeedVideoFpsRangesFor = slotTable.getSlots();
        this.getHighResolutionOutputSizeshNQ4ISI = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.getInputSizeshNQ4ISI = new androidx.compose.runtime.IntStack();
    }

    /* renamed from: getTable$runtime, reason: from getter */
    public final androidx.compose.runtime.SlotTable getTable() {
        return this.table;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final void setCurrentGroup(int i) {
        this.currentGroup = i;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    /* renamed from: getSize, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getSlot() {
        int outputFormats;
        int i = this.getOutputMinFrameDuration;
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.getHighSpeedVideoSizes, this.parent);
        return i - outputFormats;
    }

    public final int parent(int index) {
        return this.getHighSpeedVideoSizes[(index * 5) + 2];
    }

    public final boolean isNode() {
        return (this.getHighSpeedVideoSizes[(this.currentGroup * 5) + 1] & 1073741824) != 0;
    }

    public final boolean isNode(int index) {
        return (this.getHighSpeedVideoSizes[(index * 5) + 1] & 1073741824) != 0;
    }

    public final int getNodeCount() {
        return this.getHighSpeedVideoSizes[(this.currentGroup * 5) + 1] & 67108863;
    }

    public final int nodeCount(int index) {
        return this.getHighSpeedVideoSizes[(index * 5) + 1] & 67108863;
    }

    public final java.lang.Object node(int index) {
        int[] iArr = this.getHighSpeedVideoSizes;
        if ((iArr[(index * 5) + 1] & 1073741824) != 0) {
            return getHighSpeedVideoSizes(iArr, index);
        }
        return null;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean getInEmpty() {
        return this.getHighSpeedVideoSizesFor > 0;
    }

    public final int getGroupSize() {
        int highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.currentGroup);
        return highSpeedVideoSizes;
    }

    public final int groupSize(int index) {
        int highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, index);
        return highSpeedVideoSizes;
    }

    public final int slotSize(int group) {
        int outputFormats;
        int i;
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.getHighSpeedVideoSizes, group);
        int i2 = group + 1;
        if (i2 >= this.getHighSpeedVideoFpsRanges) {
            i = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            i = this.getHighSpeedVideoSizes[(i2 * 5) + 4];
        }
        return i - outputFormats;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int groupEnd(int index) {
        int highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, index);
        return index + highSpeedVideoSizes;
    }

    public final int getGroupKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return this.getHighSpeedVideoSizes[i * 5];
        }
        return 0;
    }

    public final int groupKey(int index) {
        return this.getHighSpeedVideoSizes[index * 5];
    }

    public final int getGroupSlotIndex() {
        int outputFormats;
        int i = this.getOutputMinFrameDuration;
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.getHighSpeedVideoSizes, this.parent);
        return i - outputFormats;
    }

    public final boolean hasObjectKey(int index) {
        return (this.getHighSpeedVideoSizes[(index * 5) + 1] & 536870912) != 0;
    }

    public final boolean getHasObjectKey() {
        int i = this.currentGroup;
        return i < this.currentEnd && (this.getHighSpeedVideoSizes[(i * 5) + 1] & 536870912) != 0;
    }

    public final java.lang.Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, i);
        }
        return null;
    }

    public final java.lang.Object groupObjectKey(int index) {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, index);
    }

    public final java.lang.Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, i);
        }
        return 0;
    }

    public final java.lang.Object groupAux(int index) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, index);
    }

    public final java.lang.Object getGroupNode() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, i);
        }
        return null;
    }

    public final int groupKey(androidx.compose.runtime.Anchor anchor) {
        if (anchor.getValid()) {
            return this.getHighSpeedVideoSizes[this.table.anchorIndex(anchor) * 5];
        }
        return 0;
    }

    public final boolean hasMark(int index) {
        return (this.getHighSpeedVideoSizes[(index * 5) + 1] & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean containsMark(int index) {
        return (this.getHighSpeedVideoSizes[(index * 5) + 1] & 67108864) != 0;
    }

    public final int getParentNodes() {
        int i = this.parent;
        if (i >= 0) {
            return this.getHighSpeedVideoSizes[(i * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.getInputFormats - this.getOutputMinFrameDuration;
    }

    public final int parentOf(int index) {
        if (index < 0 || index >= this.getHighSpeedVideoFpsRanges) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Invalid group index ".concat(java.lang.String.valueOf(index)));
        }
        return this.getHighSpeedVideoSizes[(index * 5) + 2];
    }

    public final int getGroupSlotCount() {
        int outputFormats;
        int i;
        int i2 = this.currentGroup;
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.getHighSpeedVideoSizes, i2);
        int i3 = i2 + 1;
        if (i3 >= this.getHighSpeedVideoFpsRanges) {
            i = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            i = this.getHighSpeedVideoSizes[(i3 * 5) + 4];
        }
        return i - outputFormats;
    }

    public final java.lang.Object get(int index) {
        int i = this.getOutputMinFrameDuration + index;
        return i < this.getInputFormats ? this.getHighSpeedVideoFpsRangesFor[i] : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final java.lang.Object groupGet(int index) {
        return groupGet(this.currentGroup, index);
    }

    public final java.lang.Object groupGet(int group, int index) {
        int outputFormats;
        int i;
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.getHighSpeedVideoSizes, group);
        int i2 = group + 1;
        if (i2 >= this.getHighSpeedVideoFpsRanges) {
            i = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            i = this.getHighSpeedVideoSizes[(i2 * 5) + 4];
        }
        int i3 = outputFormats + index;
        return i3 < i ? this.getHighSpeedVideoFpsRangesFor[i3] : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final java.lang.Object next() {
        int i;
        if (this.getHighSpeedVideoSizesFor > 0 || (i = this.getOutputMinFrameDuration) >= this.getInputFormats) {
            this.hadNext = false;
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        this.hadNext = true;
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDuration = i + 1;
        return objArr[i];
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final void beginEmpty() {
        this.getHighSpeedVideoSizesFor++;
    }

    public final void endEmpty() {
        if (this.getHighSpeedVideoSizesFor <= 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.getHighSpeedVideoSizesFor--;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime(this, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Object[0];
    }

    public final void startGroup() {
        int highSpeedVideoSizes;
        int outputFormats;
        androidx.compose.runtime.GroupSourceInformation groupSourceInformation;
        if (this.getHighSpeedVideoSizesFor <= 0) {
            int i = this.parent;
            int i2 = this.currentGroup;
            if (this.getHighSpeedVideoSizes[(i2 * 5) + 2] != i) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.Camera2StreamConfigurationMap;
            if (hashMap != null && (groupSourceInformation = hashMap.get(anchor(i))) != null) {
                groupSourceInformation.reportGroup(this.table, i2);
            }
            androidx.compose.runtime.IntStack intStack = this.getInputSizeshNQ4ISI;
            int i3 = this.getOutputMinFrameDuration;
            int i4 = this.getInputFormats;
            if (i3 == 0 && i4 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i3);
            }
            this.parent = i2;
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, i2);
            this.currentEnd = highSpeedVideoSizes + i2;
            int i5 = i2 + 1;
            this.currentGroup = i5;
            outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.getHighSpeedVideoSizes, i2);
            this.getOutputMinFrameDuration = outputFormats;
            this.getInputFormats = i2 >= this.getHighSpeedVideoFpsRanges + (-1) ? this.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoSizes[(i5 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.getHighSpeedVideoSizesFor <= 0) {
            if ((this.getHighSpeedVideoSizes[(this.currentGroup * 5) + 1] & 1073741824) == 0) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public final int skipGroup() {
        int highSpeedVideoSizes;
        if (this.getHighSpeedVideoSizesFor != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.getHighSpeedVideoSizes;
        int i = this.currentGroup;
        int i2 = iArr[(i * 5) + 1];
        int i3 = (1073741824 & i2) == 0 ? 67108863 & i2 : 1;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(iArr, i);
        this.currentGroup = i + highSpeedVideoSizes;
        return i3;
    }

    public final void skipToGroupEnd() {
        if (this.getHighSpeedVideoSizesFor != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = 0;
    }

    public final void reposition(int index) {
        int highSpeedVideoSizes;
        if (this.getHighSpeedVideoSizesFor != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = index;
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = index < i ? this.getHighSpeedVideoSizes[(index * 5) + 2] : -1;
        if (i2 != this.parent) {
            this.parent = i2;
            if (i2 >= 0) {
                highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, i2);
                this.currentEnd = i2 + highSpeedVideoSizes;
            } else {
                this.currentEnd = i;
            }
            this.getOutputMinFrameDuration = 0;
            this.getInputFormats = 0;
        }
    }

    public final void restoreParent(int index) {
        int highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, index);
        int i = highSpeedVideoSizes + index;
        int i2 = this.currentGroup;
        if (i2 < index || i2 > i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(index);
            sb.append(" is not a parent of ");
            sb.append(i2);
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        this.parent = index;
        this.currentEnd = i;
        this.getOutputMinFrameDuration = 0;
        this.getInputFormats = 0;
    }

    public final void endGroup() {
        int highSpeedVideoSizes;
        int i;
        if (this.getHighSpeedVideoSizesFor == 0) {
            if (this.currentGroup != this.currentEnd) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.getHighSpeedVideoSizes;
            int i2 = iArr[(this.parent * 5) + 2];
            this.parent = i2;
            if (i2 >= 0) {
                highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(iArr, i2);
                i = highSpeedVideoSizes + i2;
            } else {
                i = this.getHighSpeedVideoFpsRanges;
            }
            this.currentEnd = i;
            int pop = this.getInputSizeshNQ4ISI.pop();
            if (pop < 0) {
                this.getOutputMinFrameDuration = 0;
                this.getInputFormats = 0;
            } else {
                this.getOutputMinFrameDuration = pop;
                this.getInputFormats = i2 >= this.getHighSpeedVideoFpsRanges + (-1) ? this.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoSizes[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final java.util.List<androidx.compose.runtime.KeyInfo> extractKeys() {
        int highSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.getHighSpeedVideoSizesFor <= 0) {
            int i = this.currentGroup;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.getHighSpeedVideoSizes;
                int i4 = i * 5;
                int i5 = iArr[i4];
                java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(iArr, i);
                int i6 = this.getHighSpeedVideoSizes[i4 + 1];
                int i7 = (1073741824 & i6) == 0 ? i6 & 67108863 : 1;
                i2 = i3 + 1;
                arrayList.add(new androidx.compose.runtime.KeyInfo(i5, highSpeedVideoFpsRanges, i, i7, i3));
                highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, i);
                i += highSpeedVideoSizes;
            }
        }
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SlotReader(current=");
        sb.append(this.currentGroup);
        sb.append(", key=");
        sb.append(getGroupKey());
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", end=");
        sb.append(this.currentEnd);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ androidx.compose.runtime.Anchor anchor$default(androidx.compose.runtime.SlotReader slotReader, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.currentGroup;
        }
        return slotReader.anchor(i);
    }

    public final androidx.compose.runtime.Anchor anchor(int index) {
        int Camera2StreamConfigurationMap;
        java.util.ArrayList<androidx.compose.runtime.Anchor> anchors$runtime = this.table.getAnchors$runtime();
        Camera2StreamConfigurationMap = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(anchors$runtime, index, this.getHighSpeedVideoFpsRanges);
        if (Camera2StreamConfigurationMap < 0) {
            androidx.compose.runtime.Anchor anchor = new androidx.compose.runtime.Anchor(index);
            anchors$runtime.add(-(Camera2StreamConfigurationMap + 1), anchor);
            return anchor;
        }
        return anchors$runtime.get(Camera2StreamConfigurationMap);
    }

    private final java.lang.Object getHighSpeedVideoSizes(int[] iArr, int i) {
        int i2 = i * 5;
        if ((iArr[i2 + 1] & 1073741824) == 0) {
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        return this.getHighSpeedVideoFpsRangesFor[iArr[i2 + 4]];
    }

    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i) {
        int highSpeedVideoFpsRanges;
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            java.lang.Object[] objArr = this.getHighSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRanges = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRanges(iArr, i);
            return objArr[highSpeedVideoFpsRanges];
        }
        return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    private final java.lang.Object getHighSpeedVideoFpsRanges(int[] iArr, int i) {
        int inputSizeshNQ4ISI;
        if ((iArr[(i * 5) + 1] & 536870912) == 0) {
            return null;
        }
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRangesFor;
        inputSizeshNQ4ISI = androidx.compose.runtime.SlotTableKt.getInputSizeshNQ4ISI(iArr, i);
        return objArr[inputSizeshNQ4ISI];
    }
}
