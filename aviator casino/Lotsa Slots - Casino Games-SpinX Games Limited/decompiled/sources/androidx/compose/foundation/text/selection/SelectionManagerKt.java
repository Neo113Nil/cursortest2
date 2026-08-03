package androidx.compose.foundation.text.selection;

/* compiled from: SelectionManager.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u001a\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H 0\u0011\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u0011H\u0002\u001a\f\u0010!\u001a\u00020\u0001*\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"invertedInfiniteRect", "Landroidx/compose/ui/geometry/Rect;", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getMagnifierCenter", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getMagnifierCenter-JVtK1S4", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "getSelectedRegionRect", "selectableSubSelectionPairs", "", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/foundation/text/selection/Selection;", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "merge", "lhs", "rhs", "containsInclusive", "", "offset", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "firstAndLast", "T", "visibleBounds", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final androidx.compose.ui.geometry.Rect invertedInfiniteRect = new androidx.compose.ui.geometry.Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: SelectionManager.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.Handle.values().length];
            try {
                iArr[androidx.compose.foundation.text.Handle.SelectionStart.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.Handle.SelectionEnd.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.Handle.Cursor.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final androidx.compose.foundation.text.selection.Selection merge(androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.Selection selection2) {
        androidx.compose.foundation.text.selection.Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.List<T> firstAndLast(java.util.List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first((java.util.List) list), kotlin.collections.CollectionsKt.last((java.util.List) list));
    }

    public static final androidx.compose.ui.geometry.Rect getSelectedRegionRect(java.util.List<? extends kotlin.Pair<? extends androidx.compose.foundation.text.selection.Selectable, androidx.compose.foundation.text.selection.Selection>> list, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        int i;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        if (list.isEmpty()) {
            return invertedInfiniteRect;
        }
        androidx.compose.ui.geometry.Rect rect = invertedInfiniteRect;
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            kotlin.Pair<? extends androidx.compose.foundation.text.selection.Selectable, androidx.compose.foundation.text.selection.Selection> pair = list.get(i2);
            androidx.compose.foundation.text.selection.Selectable component1 = pair.component1();
            androidx.compose.foundation.text.selection.Selection component2 = pair.component2();
            int offset = component2.getStart().getOffset();
            int offset2 = component2.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates2 = component1.getLayoutCoordinates()) == null) {
                i = size;
            } else {
                int min = java.lang.Math.min(offset, offset2);
                int max = java.lang.Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[]{min};
                } else {
                    iArr = new int[]{min, max};
                }
                androidx.compose.ui.geometry.Rect rect2 = invertedInfiniteRect;
                float left2 = rect2.getLeft();
                float top2 = rect2.getTop();
                float right2 = rect2.getRight();
                float bottom2 = rect2.getBottom();
                int length = iArr.length;
                i = size;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    androidx.compose.ui.geometry.Rect boundingBox = component1.getBoundingBox(iArr[i3]);
                    left2 = java.lang.Math.min(left2, boundingBox.getLeft());
                    top2 = java.lang.Math.min(top2, boundingBox.getTop());
                    right2 = java.lang.Math.max(right2, boundingBox.getRight());
                    bottom2 = java.lang.Math.max(bottom2, boundingBox.getBottom());
                    i3++;
                    length = i4;
                }
                long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(left2, top2);
                long Offset2 = androidx.compose.ui.geometry.OffsetKt.Offset(right2, bottom2);
                long mo3410localPositionOfR5De75A = layoutCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates2, Offset);
                long mo3410localPositionOfR5De75A2 = layoutCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates2, Offset2);
                left = java.lang.Math.min(left, androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A));
                top = java.lang.Math.min(top, androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A));
                right = java.lang.Math.max(right, androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A2));
                bottom = java.lang.Math.max(bottom, androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A2));
            }
            i2++;
            size = i;
        }
        return new androidx.compose.ui.geometry.Rect(left, top, right, bottom);
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1054calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.SelectionManager selectionManager, long j) {
        androidx.compose.foundation.text.selection.Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        androidx.compose.foundation.text.Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : androidx.compose.foundation.text.selection.SelectionManagerKt.WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m1056getMagnifierCenterJVtK1S4(selectionManager, j, selection.getStart());
        }
        if (i == 2) {
            return m1056getMagnifierCenterJVtK1S4(selectionManager, j, selection.getEnd());
        }
        if (i == 3) {
            throw new java.lang.IllegalStateException("SelectionContainer does not support cursor".toString());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1056getMagnifierCenterJVtK1S4(androidx.compose.foundation.text.selection.SelectionManager selectionManager, long j, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo) {
        androidx.compose.ui.layout.LayoutCoordinates containerLayoutCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        int offset;
        float coerceIn;
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null && (offset = anchorInfo.getOffset()) <= anchorSelectable$foundation_release.getLastVisibleOffset()) {
            androidx.compose.ui.geometry.Offset m1043getCurrentDragPosition_m7T9E = selectionManager.m1043getCurrentDragPosition_m7T9E();
            kotlin.jvm.internal.Intrinsics.checkNotNull(m1043getCurrentDragPosition_m7T9E);
            float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(layoutCoordinates.mo3410localPositionOfR5De75A(containerLayoutCoordinates, m1043getCurrentDragPosition_m7T9E.getPackedValue()));
            long mo1004getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo1004getRangeOfLineContainingjx7JFs(offset);
            if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(mo1004getRangeOfLineContainingjx7JFs)) {
                coerceIn = anchorSelectable$foundation_release.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation_release.getLineLeft(androidx.compose.ui.text.TextRange.m3964getStartimpl(mo1004getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation_release.getLineRight(androidx.compose.ui.text.TextRange.m3959getEndimpl(mo1004getRangeOfLineContainingjx7JFs) - 1);
                coerceIn = kotlin.ranges.RangesKt.coerceIn(m1871getXimpl, java.lang.Math.min(lineLeft, lineRight), java.lang.Math.max(lineLeft, lineRight));
            }
            if (coerceIn == -1.0f) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            }
            if (java.lang.Math.abs(m1871getXimpl - coerceIn) > androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j) / 2) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            }
            float centerYForOffset = anchorSelectable$foundation_release.getCenterYForOffset(offset);
            if (centerYForOffset == -1.0f) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            }
            return containerLayoutCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates, androidx.compose.ui.geometry.OffsetKt.Offset(coerceIn, centerYForOffset));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
    }

    public static final androidx.compose.ui.geometry.Rect visibleBounds(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.geometry.Rect boundsInWindow = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return androidx.compose.ui.geometry.RectKt.m1909Rect0a9Yr6o(layoutCoordinates.mo3414windowToLocalMKHz9U(boundsInWindow.m1906getTopLeftF1C5BW0()), layoutCoordinates.mo3414windowToLocalMKHz9U(boundsInWindow.m1900getBottomRightF1C5BW0()));
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1055containsInclusiveUv8p0NA(androidx.compose.ui.geometry.Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(j);
        if (left <= m1871getXimpl && m1871getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(j);
            if (top <= m1872getYimpl && m1872getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }
}
