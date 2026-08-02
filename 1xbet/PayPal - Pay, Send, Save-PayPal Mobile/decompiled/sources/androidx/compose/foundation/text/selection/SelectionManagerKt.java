package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00000\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0014*\u00020\u0012H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010*\u001a\u00020'*\u00020\u00142\u0006\u0010&\u001a\u00020\u001aH\u0000¢\u0006\u0004\b(\u0010)\"\u0014\u0010\"\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "lhs", "rhs", "merge", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/foundation/text/selection/SelectionManager;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilder", "(Landroidx/compose/foundation/text/selection/SelectionManager;Landroidx/compose/foundation/contextmenu/ContextMenuState;)Lkotlin/jvm/functions/Function1;", "", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableSubSelectionPairs", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "Landroidx/compose/ui/geometry/Rect;", "getSelectedRegionRect", "(Ljava/util/List;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "manager", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "calculateSelectionMagnifierCenterAndroid", "p0", "p1", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "p2", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "visibleBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "offset", "", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "containsInclusive", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/geometry/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionManagerKt {
    private static final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.geometry.Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final androidx.compose.foundation.text.selection.Selection merge(androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.Selection selection2) {
        androidx.compose.foundation.text.selection.Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    public static final kotlin.jvm.functions.Function1<androidx.compose.foundation.contextmenu.ContextMenuScope, kotlin.Unit> contextMenuBuilder(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState) {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.SelectionManagerKt.$r8$lambda$GDkOq1ipTlD2CfAIE0GNjVDX96w(androidx.compose.foundation.text.selection.SelectionManager.this, contextMenuState, (androidx.compose.foundation.contextmenu.ContextMenuScope) obj);
            }
        };
    }

    public static final androidx.compose.ui.geometry.Rect getSelectedRegionRect(java.util.List<? extends kotlin.Pair<? extends androidx.compose.foundation.text.selection.Selectable, androidx.compose.foundation.text.selection.Selection>> list, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        int i;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        java.util.List<? extends kotlin.Pair<? extends androidx.compose.foundation.text.selection.Selectable, androidx.compose.foundation.text.selection.Selection>> list2 = list;
        if (list.isEmpty()) {
            return getHighSpeedVideoFpsRangesFor;
        }
        androidx.compose.ui.geometry.Rect rect = getHighSpeedVideoFpsRangesFor;
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            kotlin.Pair<? extends androidx.compose.foundation.text.selection.Selectable, androidx.compose.foundation.text.selection.Selection> pair = list2.get(i2);
            androidx.compose.foundation.text.selection.Selectable component1 = pair.component1();
            androidx.compose.foundation.text.selection.Selection component2 = pair.component2();
            int offset = component2.getStart().getOffset();
            int offset2 = component2.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates2 = component1.getLayoutCoordinates()) == null) {
                i = size;
                top = top;
                right = right;
            } else {
                int min = java.lang.Math.min(offset, offset2);
                int max = java.lang.Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[]{min};
                } else {
                    iArr = new int[]{min, max};
                }
                androidx.compose.ui.geometry.Rect rect2 = getHighSpeedVideoFpsRangesFor;
                float left2 = rect2.getLeft();
                float top2 = rect2.getTop();
                float right2 = rect2.getRight();
                float bottom2 = rect2.getBottom();
                int i3 = 0;
                for (int length = iArr.length; i3 < length; length = length) {
                    int i4 = size;
                    androidx.compose.ui.geometry.Rect boundingBox = component1.getBoundingBox(iArr[i3]);
                    left2 = java.lang.Math.min(left2, boundingBox.getLeft());
                    top2 = java.lang.Math.min(top2, boundingBox.getTop());
                    right2 = java.lang.Math.max(right2, boundingBox.getRight());
                    bottom2 = java.lang.Math.max(bottom2, boundingBox.getBottom());
                    i3++;
                    size = i4;
                }
                i = size;
                long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(left2) << 32) | (java.lang.Float.floatToRawIntBits(top2) & 4294967295L));
                long floatToRawIntBits = java.lang.Float.floatToRawIntBits(right2);
                float f = top;
                long m5744constructorimpl2 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(bottom2) & 4294967295L) | (floatToRawIntBits << 32));
                long mo7362localPositionOfR5De75A = layoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates2, m5744constructorimpl);
                long mo7362localPositionOfR5De75A2 = layoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates2, m5744constructorimpl2);
                left = java.lang.Math.min(left, java.lang.Float.intBitsToFloat((int) (mo7362localPositionOfR5De75A >> 32)));
                float min2 = java.lang.Math.min(f, java.lang.Float.intBitsToFloat((int) (mo7362localPositionOfR5De75A & 4294967295L)));
                float max2 = java.lang.Math.max(right, java.lang.Float.intBitsToFloat((int) (mo7362localPositionOfR5De75A2 >> 32)));
                bottom = java.lang.Math.max(bottom, java.lang.Float.intBitsToFloat((int) (mo7362localPositionOfR5De75A2 & 4294967295L)));
                right = max2;
                top = min2;
            }
            i2++;
            list2 = list;
            size = i;
        }
        return new androidx.compose.ui.geometry.Rect(left, top, right, bottom);
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m2424calculateSelectionMagnifierCenterAndroidO0kMr_c(androidx.compose.foundation.text.selection.SelectionManager selectionManager, long j) {
        androidx.compose.foundation.text.selection.Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        androidx.compose.foundation.text.Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : androidx.compose.foundation.text.selection.SelectionManagerKt.WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return Camera2StreamConfigurationMap(selectionManager, j, selection.getStart());
        }
        if (i == 2) {
            return Camera2StreamConfigurationMap(selectionManager, j, selection.getEnd());
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    private static final long Camera2StreamConfigurationMap(androidx.compose.foundation.text.selection.SelectionManager selectionManager, long j, androidx.compose.foundation.text.selection.Selection.AnchorInfo anchorInfo) {
        androidx.compose.ui.layout.LayoutCoordinates containerLayoutCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        int offset;
        float coerceIn;
        androidx.compose.foundation.text.selection.Selectable anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation(anchorInfo);
        if (anchorSelectable$foundation != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation.getLayoutCoordinates()) != null && (offset = anchorInfo.getOffset()) <= anchorSelectable$foundation.getLastVisibleOffset()) {
            androidx.compose.ui.geometry.Offset m2416getCurrentDragPosition_m7T9E = selectionManager.m2416getCurrentDragPosition_m7T9E();
            kotlin.jvm.internal.Intrinsics.checkNotNull(m2416getCurrentDragPosition_m7T9E);
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (layoutCoordinates.mo7362localPositionOfR5De75A(containerLayoutCoordinates, m2416getCurrentDragPosition_m7T9E.m5762unboximpl()) >> 32));
            long mo2375getRangeOfLineContainingjx7JFs = anchorSelectable$foundation.mo2375getRangeOfLineContainingjx7JFs(offset);
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(mo2375getRangeOfLineContainingjx7JFs)) {
                coerceIn = anchorSelectable$foundation.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation.getLineLeft(androidx.compose.ui.text.TextRange.m8039getStartimpl(mo2375getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation.getLineRight(androidx.compose.ui.text.TextRange.m8034getEndimpl(mo2375getRangeOfLineContainingjx7JFs) - 1);
                coerceIn = kotlin.ranges.RangesKt.coerceIn(intBitsToFloat, java.lang.Math.min(lineLeft, lineRight), java.lang.Math.max(lineLeft, lineRight));
            }
            if (coerceIn == -1.0f) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            }
            if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()) && java.lang.Math.abs(intBitsToFloat - coerceIn) > ((int) (j >> 32)) / 2) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            }
            if (anchorSelectable$foundation.getCenterYForOffset(offset) == -1.0f) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            }
            return containerLayoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(coerceIn) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(r9))));
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }

    public static final androidx.compose.ui.geometry.Rect visibleBounds(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.geometry.Rect boundsInWindow$default = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
        return androidx.compose.ui.geometry.RectKt.m5790Rect0a9Yr6o(layoutCoordinates.mo7370windowToLocalMKHz9U(boundsInWindow$default.m5787getTopLeftF1C5BW0()), layoutCoordinates.mo7370windowToLocalMKHz9U(boundsInWindow$default.m5781getBottomRightF1C5BW0()));
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m2425containsInclusiveUv8p0NA(androidx.compose.ui.geometry.Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope, androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (z) {
            androidx.compose.foundation.contextmenu.ContextMenuScope.item$default(contextMenuScope, new androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2(function0, contextMenuState), 14, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D9dP50ChNMff9SDFc86OTiXYFgk(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        selectionManager.selectAll$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GDkOq1ipTlD2CfAIE0GNjVDX96w(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope) {
        getHighSpeedVideoFpsRanges(contextMenuScope, contextMenuState, androidx.compose.foundation.text.TextContextMenuItems.Copy, selectionManager.isNonEmptySelection$foundation(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.SelectionManagerKt.$r8$lambda$sUkbeiMEC9UDFsJu1gU0zezWsfg(androidx.compose.foundation.text.selection.SelectionManager.this);
            }
        });
        getHighSpeedVideoFpsRanges(contextMenuScope, contextMenuState, androidx.compose.foundation.text.TextContextMenuItems.SelectAll, !selectionManager.isEntireContainerSelected$foundation(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionManagerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.selection.SelectionManagerKt.$r8$lambda$D9dP50ChNMff9SDFc86OTiXYFgk(androidx.compose.foundation.text.selection.SelectionManager.this);
            }
        });
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Unit[]{unit, unit});
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sUkbeiMEC9UDFsJu1gU0zezWsfg(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        selectionManager.copy$foundation();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.List access$firstAndLast(java.util.List list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first(list), kotlin.collections.CollectionsKt.last(list));
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
}
