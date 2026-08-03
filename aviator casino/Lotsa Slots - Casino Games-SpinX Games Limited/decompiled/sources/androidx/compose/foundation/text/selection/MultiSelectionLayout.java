package androidx.compose.foundation.text.selection;

/* compiled from: SelectionLayout.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010,\u001a\u00020\u000eH\u0016J\u001c\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020.00H\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0004H\u0002J\u0010\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u0000H\u0002J\u0012\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0018\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\fH\u0002J\u0018\u00109\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\fH\u0002J\b\u0010;\u001a\u00020<H\u0016J8\u0010=\u001a\u00020.*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0>2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0005H\u0002R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001fR\u0014\u0010 \u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectableIdToInfoListIndex", "", "", "", "infoList", "", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "startSlot", "endSlot", "isStartHandle", "", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "(Ljava/util/Map;Ljava/util/List;IIZLandroidx/compose/foundation/text/selection/Selection;)V", "crossStatus", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "currentInfo", "getCurrentInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "endInfo", "getEndInfo", "getEndSlot", "()I", "firstInfo", "getFirstInfo", "getInfoList", "()Ljava/util/List;", "()Z", "lastInfo", "getLastInfo", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "getSelectableIdToInfoListIndex", "()Ljava/util/Map;", "size", "getSize", "startInfo", "getStartInfo", "getStartSlot", "createSubSelections", "selection", "forEachMiddleInfo", "", "block", "Lkotlin/Function1;", "getInfoListIndexBySelectableId", "id", "shouldAnyInfoRecomputeSelection", "other", "shouldRecomputeSelection", "slotToIndex", "slot", "isMinimumSlot", "startOrEndSlotToIndex", "isStartSlot", "toString", "", "createAndPutSubSelection", "", "info", "minOffset", "maxOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class MultiSelectionLayout implements androidx.compose.foundation.text.selection.SelectionLayout {
    private final int endSlot;
    private final java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final androidx.compose.foundation.text.selection.Selection previousSelection;
    private final java.util.Map<java.lang.Long, java.lang.Integer> selectableIdToInfoListIndex;
    private final int startSlot;

    /* compiled from: SelectionLayout.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.selection.CrossStatus.values().length];
            try {
                iArr[androidx.compose.foundation.text.selection.CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.CrossStatus.CROSSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(java.util.Map<java.lang.Long, java.lang.Integer> map, java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> list, int i, int i2, boolean z, androidx.compose.foundation.text.selection.Selection selection) {
        this.selectableIdToInfoListIndex = map;
        this.infoList = list;
        this.startSlot = i;
        this.endSlot = i2;
        this.isStartHandle = z;
        this.previousSelection = selection;
        if (list.size() > 1) {
            return;
        }
        throw new java.lang.IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.').toString());
    }

    public final java.util.Map<java.lang.Long, java.lang.Integer> getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    public final java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: isStartHandle, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public androidx.compose.foundation.text.selection.Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public androidx.compose.foundation.text.selection.CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? androidx.compose.foundation.text.selection.CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? androidx.compose.foundation.text.selection.CrossStatus.CROSSED : this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public androidx.compose.foundation.text.selection.SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public androidx.compose.foundation.text.selection.SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: getCurrentInfo */
    public androidx.compose.foundation.text.selection.SelectableInfo getInfo() {
        return getIsStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public androidx.compose.foundation.text.selection.SelectableInfo getFirstInfo() {
        return getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public androidx.compose.foundation.text.selection.SelectableInfo getLastInfo() {
        return getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.SelectableInfo, kotlin.Unit> block) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i = infoListIndexBySelectableId + 1;
        if (i >= infoListIndexBySelectableId2) {
            return;
        }
        while (i < infoListIndexBySelectableId2) {
            block.invoke(this.infoList.get(i));
            i++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(androidx.compose.foundation.text.selection.SelectionLayout other) {
        if (getPreviousSelection() != null && other != null && (other instanceof androidx.compose.foundation.text.selection.MultiSelectionLayout)) {
            androidx.compose.foundation.text.selection.MultiSelectionLayout multiSelectionLayout = (androidx.compose.foundation.text.selection.MultiSelectionLayout) other;
            if (getIsStartHandle() == multiSelectionLayout.getIsStartHandle() && getStartSlot() == multiSelectionLayout.getStartSlot() && getEndSlot() == multiSelectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection(multiSelectionLayout)) {
                return false;
            }
        }
        return true;
    }

    private final boolean shouldAnyInfoRecomputeSelection(androidx.compose.foundation.text.selection.MultiSelectionLayout other) {
        if (getSize() != other.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i = 0; i < size; i++) {
            if (this.infoList.get(i).shouldRecomputeSelection(other.infoList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection> createSubSelections(final androidx.compose.foundation.text.selection.Selection selection) {
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            if ((!selection.getHandlesCrossed() || selection.getStart().getOffset() < selection.getEnd().getOffset()) && (selection.getHandlesCrossed() || selection.getStart().getOffset() > selection.getEnd().getOffset())) {
                throw new java.lang.IllegalStateException(("unexpectedly miss-crossed selection: " + selection).toString());
            }
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Long.valueOf(selection.getStart().getSelectableId()), selection));
        }
        final java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection> createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createAndPutSubSelection(createMapBuilder, selection, getFirstInfo(), (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset(), getFirstInfo().getTextLength());
        forEachMiddleInfo(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.SelectableInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$createSubSelections$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo) {
                invoke2(selectableInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.foundation.text.selection.SelectableInfo selectableInfo) {
                androidx.compose.foundation.text.selection.MultiSelectionLayout.this.createAndPutSubSelection(createMapBuilder, selection, selectableInfo, 0, selectableInfo.getTextLength());
            }
        });
        createAndPutSubSelection(createMapBuilder, selection, getLastInfo(), 0, (selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset());
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndPutSubSelection(java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection> map, androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i, int i2) {
        androidx.compose.foundation.text.selection.Selection makeSingleLayoutSelection;
        if (selection.getHandlesCrossed()) {
            makeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i2, i);
        } else {
            makeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i, i2);
        }
        if (i > i2) {
            throw new java.lang.IllegalStateException(("minOffset should be less than or equal to maxOffset: " + makeSingleLayoutSelection).toString());
        }
        map.put(java.lang.Long.valueOf(selectableInfo.getSelectableId()), makeSingleLayoutSelection);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(getIsStartHandle());
        sb.append(", startPosition=");
        boolean z = true;
        float f = 2;
        sb.append((getStartSlot() + 1) / f);
        sb.append(", endPosition=");
        sb.append((getEndSlot() + 1) / f);
        sb.append(", crossed=");
        sb.append(getCrossStatus());
        sb.append(", infos=");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[\n\t");
        java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> list = this.infoList;
        int size = list.size();
        int i = 0;
        while (i < size) {
            androidx.compose.foundation.text.selection.SelectableInfo selectableInfo = list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        java.lang.String sb4 = sb2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        sb.append(sb4);
        sb.append(')');
        return sb.toString();
    }

    private final int startOrEndSlotToIndex(int slot, boolean isStartSlot) {
        int i = androidx.compose.foundation.text.selection.MultiSelectionLayout.WhenMappings.$EnumSwitchMapping$0[getCrossStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (isStartSlot) {
                    isStartSlot = false;
                }
            }
            return slotToIndex(slot, isStartSlot);
        }
        isStartSlot = true;
        return slotToIndex(slot, isStartSlot);
    }

    private final int slotToIndex(int slot, boolean isMinimumSlot) {
        return (slot - (!isMinimumSlot ? 1 : 0)) / 2;
    }

    private final int getInfoListIndexBySelectableId(long id) {
        java.lang.Integer num = this.selectableIdToInfoListIndex.get(java.lang.Long.valueOf(id));
        if (num != null) {
            return num.intValue();
        }
        throw new java.lang.IllegalArgumentException(("Invalid selectableId: " + id).toString());
    }
}
