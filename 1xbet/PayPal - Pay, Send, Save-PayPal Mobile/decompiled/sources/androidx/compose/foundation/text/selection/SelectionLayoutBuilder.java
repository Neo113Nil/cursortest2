package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020 0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010;\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010>R\u0016\u0010=\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010>"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "previousHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/getOutputStallDuration;", "selectableIdOrderingComparator", "<init>", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "build", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectableId", "", "rawStartHandleOffset", "Landroidx/compose/foundation/text/selection/Direction;", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "appendInfo", "(JILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/SelectableInfo;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)I", "J", "getCurrentPosition-F1C5BW0", "()J", "getPreviousHandlePosition-F1C5BW0", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Z", "()Z", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "Ljava/util/Comparator;", "getSelectableIdOrderingComparator", "()Ljava/util/Comparator;", "Landroidx/collection/MutableLongIntMap;", "Landroidx/collection/MutableLongIntMap;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.layout.LayoutCoordinates containerCoordinates;
    private final long currentPosition;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.MutableLongIntMap getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private final boolean isStartHandle;
    private final long previousHandlePosition;
    private final androidx.compose.foundation.text.selection.Selection previousSelection;
    private final java.util.Comparator<java.lang.Long> selectableIdOrderingComparator;

    private SelectionLayoutBuilder(long j, long j2, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, boolean z, androidx.compose.foundation.text.selection.Selection selection, java.util.Comparator<java.lang.Long> comparator) {
        this.currentPosition = j;
        this.previousHandlePosition = j2;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.getHighSpeedVideoSizes = androidx.collection.LongIntMapKt.mutableLongIntMapOf();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = -1;
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
        int i = this.getHighSpeedVideoFpsRangesFor + 1;
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            androidx.compose.foundation.text.selection.SelectableInfo selectableInfo = (androidx.compose.foundation.text.selection.SelectableInfo) kotlin.collections.CollectionsKt.single((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI);
            int i2 = this.Camera2StreamConfigurationMap;
            int i3 = i2 == -1 ? i : i2;
            int i4 = this.getHighSpeedVideoFpsRanges;
            return new androidx.compose.foundation.text.selection.SingleSelectionLayout(this.isStartHandle, i3, i4 != -1 ? i4 : i, this.previousSelection, selectableInfo);
        }
        androidx.collection.MutableLongIntMap mutableLongIntMap = this.getHighSpeedVideoSizes;
        java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> list = this.getHighResolutionOutputSizeshNQ4ISI;
        int i5 = this.Camera2StreamConfigurationMap;
        int i6 = i5 == -1 ? i : i5;
        int i7 = this.getHighSpeedVideoFpsRanges;
        return new androidx.compose.foundation.text.selection.MultiSelectionLayout(mutableLongIntMap, list, i6, i7 != -1 ? i7 : i, this.isStartHandle, this.previousSelection);
    }

    public final androidx.compose.foundation.text.selection.SelectableInfo appendInfo(long selectableId, int rawStartHandleOffset, androidx.compose.foundation.text.selection.Direction startXHandleDirection, androidx.compose.foundation.text.selection.Direction startYHandleDirection, int rawEndHandleOffset, androidx.compose.foundation.text.selection.Direction endXHandleDirection, androidx.compose.foundation.text.selection.Direction endYHandleDirection, int rawPreviousHandleOffset, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        int i = this.getHighSpeedVideoFpsRangesFor + 2;
        this.getHighSpeedVideoFpsRangesFor = i;
        androidx.compose.foundation.text.selection.SelectableInfo selectableInfo = new androidx.compose.foundation.text.selection.SelectableInfo(selectableId, i, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, textLayoutResult);
        this.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, startXHandleDirection, startYHandleDirection);
        this.getHighSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, endXHandleDirection, endYHandleDirection);
        this.getHighSpeedVideoSizes.set(selectableId, this.getHighResolutionOutputSizeshNQ4ISI.size());
        this.getHighResolutionOutputSizeshNQ4ISI.add(selectableInfo);
        return selectableInfo;
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(int p0, androidx.compose.foundation.text.selection.Direction p1, androidx.compose.foundation.text.selection.Direction p2) {
        if (p0 != -1) {
            return p0;
        }
        int i = androidx.compose.foundation.text.selection.SelectionLayoutBuilder.WhenMappings.$EnumSwitchMapping$0[androidx.compose.foundation.text.selection.SelectionLayoutKt.resolve2dDirection(p1, p2).ordinal()];
        if (i == 1) {
            return this.getHighSpeedVideoFpsRangesFor - 1;
        }
        if (i == 2) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        if (i == 3) {
            return p0;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
}
