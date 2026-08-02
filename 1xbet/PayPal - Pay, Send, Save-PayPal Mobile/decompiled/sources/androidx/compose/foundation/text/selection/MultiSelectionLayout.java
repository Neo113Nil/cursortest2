package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001a\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#R\u0011\u0010\"\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u001a\u0010\u001a\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\u001f\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010'\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0014\u00108\u001a\u0002058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0014\u0010A\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0014\u0010C\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010:"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/collection/LongIntMap;", "p0", "", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "p1", "", "p2", "p3", "", "p4", "Landroidx/compose/foundation/text/selection/Selection;", "p5", "<init>", "(Landroidx/collection/LongIntMap;Ljava/util/List;IIZLandroidx/compose/foundation/text/selection/Selection;)V", "Lkotlin/Function1;", "", "forEachMiddleInfo", "(Lkotlin/jvm/functions/Function1;)V", "shouldRecomputeSelection", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "Landroidx/collection/LongObjectMap;", "createSubSelections", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "Landroidx/collection/MutableLongObjectMap;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/collection/MutableLongObjectMap;Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectableInfo;II)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "(IZ)I", "", "getHighSpeedVideoFpsRanges", "(J)I", "Camera2StreamConfigurationMap", "Landroidx/collection/LongIntMap;", "Ljava/util/List;", "getOutputMinFrameDuration", com.visa.cbp.getEncExpo.warmup, "getStartSlot", "()I", "getEndSlot", "getHighSpeedVideoFpsRangesFor", "Z", "isStartHandle", "()Z", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "getSize", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "getHighSpeedVideoSizesFor", "getStartInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "getInputFormats", "getEndInfo", "getOutputFormats", "getCurrentInfo", "getOutputSizeshNQ4ISI", "getFirstInfo", "getOutputMinFrameDurationlomOqCM", "getLastInfo", "getOutputSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MultiSelectionLayout implements androidx.compose.foundation.text.selection.SelectionLayout {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.collection.LongIntMap getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.selection.Selection getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public MultiSelectionLayout(androidx.collection.LongIntMap longIntMap, java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> list, int i, int i2, boolean z, androidx.compose.foundation.text.selection.Selection selection) {
        this.getHighSpeedVideoFpsRanges = longIntMap;
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoSizes = z;
        this.getOutputMinFrameDuration = selection;
        if (list.size() <= 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiSelectionLayout requires an infoList size greater than 1, was ");
            sb.append(list.size());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: getStartSlot, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: getEndSlot, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: isStartHandle, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: getPreviousSelection, reason: from getter */
    public final androidx.compose.foundation.text.selection.Selection getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final androidx.compose.foundation.text.selection.CrossStatus getCrossStatus() {
        return getGetHighResolutionOutputSizeshNQ4ISI() < getGetHighSpeedVideoFpsRangesFor() ? androidx.compose.foundation.text.selection.CrossStatus.NOT_CROSSED : getGetHighResolutionOutputSizeshNQ4ISI() > getGetHighSpeedVideoFpsRangesFor() ? androidx.compose.foundation.text.selection.CrossStatus.CROSSED : this.Camera2StreamConfigurationMap.get(getGetHighResolutionOutputSizeshNQ4ISI() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final androidx.compose.foundation.text.selection.SelectableInfo getStartInfo() {
        return this.Camera2StreamConfigurationMap.get(getHighSpeedVideoSizes(getGetHighResolutionOutputSizeshNQ4ISI(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final androidx.compose.foundation.text.selection.SelectableInfo getEndInfo() {
        return this.Camera2StreamConfigurationMap.get(getHighSpeedVideoSizes(getGetHighSpeedVideoFpsRangesFor(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: getCurrentInfo */
    public final androidx.compose.foundation.text.selection.SelectableInfo getGetHighSpeedVideoSizes() {
        return getGetHighSpeedVideoSizes() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final androidx.compose.foundation.text.selection.SelectableInfo getFirstInfo() {
        return getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final androidx.compose.foundation.text.selection.SelectableInfo getLastInfo() {
        return getCrossStatus() == androidx.compose.foundation.text.selection.CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final void forEachMiddleInfo(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.SelectableInfo, kotlin.Unit> p0) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getFirstInfo().getSelectableId());
        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(getLastInfo().getSelectableId());
        int i = highSpeedVideoFpsRanges + 1;
        if (i < highSpeedVideoFpsRanges2) {
            while (i < highSpeedVideoFpsRanges2) {
                p0.invoke(this.Camera2StreamConfigurationMap.get(i));
                i++;
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean shouldRecomputeSelection(androidx.compose.foundation.text.selection.SelectionLayout p0) {
        if (getGetOutputMinFrameDuration() == null || p0 == null || !(p0 instanceof androidx.compose.foundation.text.selection.MultiSelectionLayout)) {
            return true;
        }
        androidx.compose.foundation.text.selection.MultiSelectionLayout multiSelectionLayout = (androidx.compose.foundation.text.selection.MultiSelectionLayout) p0;
        if (getGetHighSpeedVideoSizes() != multiSelectionLayout.getGetHighSpeedVideoSizes() || getGetHighResolutionOutputSizeshNQ4ISI() != multiSelectionLayout.getGetHighResolutionOutputSizeshNQ4ISI() || getGetHighSpeedVideoFpsRangesFor() != multiSelectionLayout.getGetHighSpeedVideoFpsRangesFor() || getSize() != multiSelectionLayout.getSize()) {
            return true;
        }
        int size = this.Camera2StreamConfigurationMap.size();
        for (int i = 0; i < size; i++) {
            if (this.Camera2StreamConfigurationMap.get(i).shouldRecomputeSelection(multiSelectionLayout.Camera2StreamConfigurationMap.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selection> createSubSelections(final androidx.compose.foundation.text.selection.Selection p0) {
        if (p0.getStart().getSelectableId() == p0.getEnd().getSelectableId()) {
            if ((!p0.getHandlesCrossed() || p0.getStart().getOffset() < p0.getEnd().getOffset()) && (p0.getHandlesCrossed() || p0.getStart().getOffset() > p0.getEnd().getOffset())) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("unexpectedly miss-crossed selection: ".concat(java.lang.String.valueOf(p0)));
            }
            return androidx.collection.LongObjectMapKt.longObjectMapOf(p0.getStart().getSelectableId(), p0);
        }
        final androidx.collection.MutableLongObjectMap mutableLongObjectMapOf = androidx.collection.LongObjectMapKt.mutableLongObjectMapOf();
        getHighResolutionOutputSizeshNQ4ISI(mutableLongObjectMapOf, p0, getFirstInfo(), (p0.getHandlesCrossed() ? p0.getEnd() : p0.getStart()).getOffset(), getFirstInfo().getTextLength());
        forEachMiddleInfo(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.selection.MultiSelectionLayout.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.selection.MultiSelectionLayout.this, mutableLongObjectMapOf, p0, (androidx.compose.foundation.text.selection.SelectableInfo) obj);
            }
        });
        getHighResolutionOutputSizeshNQ4ISI(mutableLongObjectMapOf, p0, getLastInfo(), 0, (p0.getHandlesCrossed() ? p0.getStart() : p0.getEnd()).getOffset());
        return mutableLongObjectMapOf;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.collection.MutableLongObjectMap<androidx.compose.foundation.text.selection.Selection> mutableLongObjectMap, androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.SelectableInfo selectableInfo, int i, int i2) {
        androidx.compose.foundation.text.selection.Selection makeSingleLayoutSelection;
        if (selection.getHandlesCrossed()) {
            makeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i2, i);
        } else {
            makeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i, i2);
        }
        if (i > i2) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("minOffset should be less than or equal to maxOffset: ".concat(java.lang.String.valueOf(makeSingleLayoutSelection)));
        }
        mutableLongObjectMap.put(selectableInfo.getSelectableId(), makeSingleLayoutSelection);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(getGetHighSpeedVideoSizes());
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((getGetHighResolutionOutputSizeshNQ4ISI() + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((getGetHighSpeedVideoFpsRangesFor() + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(getCrossStatus());
        sb.append(", infos=");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[\n\t");
        java.util.List<androidx.compose.foundation.text.selection.SelectableInfo> list = this.Camera2StreamConfigurationMap;
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
        java.lang.String obj = sb2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getHighSpeedVideoSizes(int p0, boolean p1) {
        int i = androidx.compose.foundation.text.selection.MultiSelectionLayout.WhenMappings.$EnumSwitchMapping$0[getCrossStatus().ordinal()];
        int i2 = p1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (p1 != 0) {
                    i2 = 0;
                }
            }
            return (p0 - (i2 ^ 1)) / 2;
        }
        i2 = 1;
        return (p0 - (i2 ^ 1)) / 2;
    }

    private final int getHighSpeedVideoFpsRanges(long p0) {
        try {
            return this.getHighSpeedVideoFpsRanges.get(p0);
        } catch (java.util.NoSuchElementException e) {
            throw new java.lang.IllegalStateException("Invalid selectableId: ".concat(java.lang.String.valueOf(p0)), e);
        }
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.selection.MultiSelectionLayout multiSelectionLayout, androidx.collection.MutableLongObjectMap mutableLongObjectMap, androidx.compose.foundation.text.selection.Selection selection, androidx.compose.foundation.text.selection.SelectableInfo selectableInfo) {
        getHighResolutionOutputSizeshNQ4ISI(mutableLongObjectMap, selection, selectableInfo, 0, selectableInfo.getTextLength());
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
}
