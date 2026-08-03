package androidx.compose.foundation.text.selection;

/* compiled from: SelectionLayout.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\u0002\u0010\u000fJN\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u000201J \u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "currentPosition", "Landroidx/compose/ui/geometry/Offset;", "previousHandlePosition", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isStartHandle", "", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "selectableIdOrderingComparator", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCurrentPosition-F1C5BW0", "()J", "J", "currentSlot", "", "endSlot", "infoList", "", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "()Z", "getPreviousHandlePosition-F1C5BW0", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "getSelectableIdOrderingComparator", "()Ljava/util/Comparator;", "selectableIdToInfoListIndex", "", "startSlot", "appendInfo", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "Landroidx/compose/foundation/text/selection/Direction;", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "build", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "updateSlot", "slot", "xPositionDirection", "yPositionDirection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;
    private final androidx.compose.ui.layout.LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;
    private final java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;
    private final androidx.compose.foundation.text.selection.Selection previousSelection;
    private final java.util.Comparator<java.lang.Long> selectableIdOrderingComparator;
    private final java.util.Map<java.lang.Long, java.lang.Integer> selectableIdToInfoListIndex;
    private int startSlot;

    /* compiled from: SelectionLayout.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.selection.Direction.values().length];
            try {
                iArr[androidx.compose.foundation.text.selection.Direction.BEFORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.Direction.ON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.Direction.AFTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SelectionLayoutBuilder(long j, long j2, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, boolean z, androidx.compose.foundation.text.selection.Selection selection, java.util.Comparator comparator, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, layoutCoordinates, z, selection, comparator);
    }

    private SelectionLayoutBuilder(long j, long j2, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, boolean z, androidx.compose.foundation.text.selection.Selection selection, java.util.Comparator<java.lang.Long> comparator) {
        this.currentPosition = j;
        this.previousHandlePosition = j2;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = new java.util.LinkedHashMap();
        this.infoList = new java.util.ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    /* renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    /* renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousHandlePosition() {
        return this.previousHandlePosition;
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: isStartHandle, reason: from getter */
    public final boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    public final androidx.compose.foundation.text.selection.Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final java.util.Comparator<java.lang.Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final androidx.compose.foundation.text.selection.SelectionLayout build() {
        int i = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size == 1) {
            androidx.compose.foundation.text.selection.SelectableInfo selectableInfo = (androidx.compose.foundation.text.selection.SelectableInfo) kotlin.collections.CollectionsKt.single((java.util.List) this.infoList);
            int i2 = this.startSlot;
            int i3 = i2 == -1 ? i : i2;
            int i4 = this.endSlot;
            return new androidx.compose.foundation.text.selection.SingleSelectionLayout(this.isStartHandle, i3, i4 == -1 ? i : i4, this.previousSelection, selectableInfo);
        }
        java.util.Map<java.lang.Long, java.lang.Integer> map = this.selectableIdToInfoListIndex;
        java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> list = this.infoList;
        int i5 = this.startSlot;
        int i6 = i5 == -1 ? i : i5;
        int i7 = this.endSlot;
        return new androidx.compose.foundation.text.selection.MultiSelectionLayout(map, list, i6, i7 == -1 ? i : i7, this.isStartHandle, this.previousSelection);
    }

    public final androidx.compose.foundation.text.selection.SelectableInfo appendInfo(long selectableId, int rawStartHandleOffset, androidx.compose.foundation.text.selection.Direction startXHandleDirection, androidx.compose.foundation.text.selection.Direction startYHandleDirection, int rawEndHandleOffset, androidx.compose.foundation.text.selection.Direction endXHandleDirection, androidx.compose.foundation.text.selection.Direction endYHandleDirection, int rawPreviousHandleOffset, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        androidx.compose.foundation.text.selection.SelectableInfo selectableInfo = new androidx.compose.foundation.text.selection.SelectableInfo(selectableId, this.currentSlot, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, startXHandleDirection, startYHandleDirection);
        this.endSlot = updateSlot(this.endSlot, endXHandleDirection, endYHandleDirection);
        this.selectableIdToInfoListIndex.put(java.lang.Long.valueOf(selectableId), java.lang.Integer.valueOf(this.infoList.size()));
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    private final int updateSlot(int slot, androidx.compose.foundation.text.selection.Direction xPositionDirection, androidx.compose.foundation.text.selection.Direction yPositionDirection) {
        if (slot != -1) {
            return slot;
        }
        int i = androidx.compose.foundation.text.selection.SelectionLayoutBuilder.WhenMappings.$EnumSwitchMapping$0[androidx.compose.foundation.text.selection.SelectionLayoutKt.resolve2dDirection(xPositionDirection, yPositionDirection).ordinal()];
        if (i == 1) {
            return this.currentSlot - 1;
        }
        if (i == 2) {
            return this.currentSlot;
        }
        if (i == 3) {
            return slot;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
