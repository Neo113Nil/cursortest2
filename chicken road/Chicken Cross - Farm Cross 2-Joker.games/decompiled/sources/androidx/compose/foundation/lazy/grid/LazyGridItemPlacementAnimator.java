package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JM\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J;\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)JD\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00052\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020+J\u0018\u00105\u001a\u00020+2\u0006\u00106\u001a\u0002012\u0006\u00107\u001a\u00020\fH\u0002J\u001c\u00108\u001a\u00020\u0015*\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b9\u0010:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\t*\u00020\u00158BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "keyToIndexMap", "", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "positionedKeys", "", "slotsPerLine", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "viewportStartItemIndex", "viewportStartItemNotVisiblePartSize", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "calculateExpectedOffset", "index", "mainAxisSizeWithSpacings", "averageLineMainAxisSize", "scrolledBy", "reverseLayout", "mainAxisLayoutSize", "fallback", "calculateExpectedOffset-tGxSNXI", "(IIIJZII)I", "getAnimatedOffset", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "reset", "startAnimationsIfNeeded", "item", "itemInfo", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimator {
    private final boolean isVertical;
    private Map<Object, Integer> keyToIndexMap;
    private final Map<Object, ItemInfo> keyToItemInfoMap;
    private final Set<Object> positionedKeys;
    private final CoroutineScope scope;
    private int slotsPerLine;
    private int viewportEndItemIndex;
    private int viewportEndItemNotVisiblePartSize;
    private int viewportStartItemIndex;
    private int viewportStartItemNotVisiblePartSize;

    public LazyGridItemPlacementAnimator(CoroutineScope scope, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.isVertical = z;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    /* renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m589getAnimatedOffsetYT5a7pE(Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        Intrinsics.checkNotNullParameter(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return rawOffset;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(placeableIndex);
        long packedValue = placeableInfo.getAnimatedOffset().getValue().getPackedValue();
        long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(packedValue) + IntOffset.m3958getXimpl(notAnimatableDelta), IntOffset.m3959getYimpl(packedValue) + IntOffset.m3959getYimpl(notAnimatableDelta));
        long targetOffset = placeableInfo.getTargetOffset();
        long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(targetOffset) + IntOffset.m3958getXimpl(notAnimatableDelta2), IntOffset.m3959getYimpl(targetOffset) + IntOffset.m3959getYimpl(notAnimatableDelta2));
        if (placeableInfo.getInProgress() && ((m587getMainAxisgyyYBs(IntOffset2) < minOffset && m587getMainAxisgyyYBs(IntOffset) < minOffset) || (m587getMainAxisgyyYBs(IntOffset2) > maxOffset && m587getMainAxisgyyYBs(IntOffset) > maxOffset))) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return IntOffset;
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.viewportStartItemIndex = -1;
        this.viewportStartItemNotVisiblePartSize = 0;
        this.viewportEndItemIndex = -1;
        this.viewportEndItemNotVisiblePartSize = 0;
    }

    /* renamed from: calculateExpectedOffset-tGxSNXI, reason: not valid java name */
    private final int m586calculateExpectedOffsettGxSNXI(int index, int mainAxisSizeWithSpacings, int averageLineMainAxisSize, long scrolledBy, boolean reverseLayout, int mainAxisLayoutSize, int fallback) {
        if (this.slotsPerLine == 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z = false;
        int i = this.viewportEndItemIndex;
        boolean z2 = reverseLayout ? i > index : i < index;
        if (reverseLayout ? this.viewportStartItemIndex < index : this.viewportStartItemIndex > index) {
            z = true;
        }
        if (z2) {
            int abs = Math.abs(index - this.viewportEndItemIndex);
            int i2 = this.slotsPerLine;
            return mainAxisLayoutSize + this.viewportEndItemNotVisiblePartSize + (averageLineMainAxisSize * ((((abs + i2) - 1) / i2) - 1)) + m587getMainAxisgyyYBs(scrolledBy);
        }
        if (!z) {
            return fallback;
        }
        int abs2 = Math.abs(this.viewportStartItemIndex - index);
        int i3 = this.slotsPerLine;
        return ((this.viewportStartItemNotVisiblePartSize - mainAxisSizeWithSpacings) - (averageLineMainAxisSize * ((((abs2 + i3) - 1) / i3) - 1))) + m587getMainAxisgyyYBs(scrolledBy);
    }

    private final void startAnimationsIfNeeded(LazyGridPositionedItem item, ItemInfo itemInfo) {
        while (itemInfo.getPlaceables().size() > item.getPlaceablesCount()) {
            CollectionsKt.removeLast(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < item.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long offset = item.getOffset();
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(offset) - IntOffset.m3958getXimpl(notAnimatableDelta), IntOffset.m3959getYimpl(offset) - IntOffset.m3959getYimpl(notAnimatableDelta)), item.getMainAxisSize(size), null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i = 0; i < size2; i++) {
            PlaceableInfo placeableInfo = placeables2.get(i);
            long targetOffset = placeableInfo.getTargetOffset();
            long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(targetOffset) + IntOffset.m3958getXimpl(notAnimatableDelta2), IntOffset.m3959getYimpl(targetOffset) + IntOffset.m3959getYimpl(notAnimatableDelta2));
            long placeableOffset = item.getPlaceableOffset();
            placeableInfo.setMainAxisSize(item.getMainAxisSize(i));
            FiniteAnimationSpec<IntOffset> animationSpec = item.getAnimationSpec(i);
            if (!IntOffset.m3957equalsimpl0(IntOffset, placeableOffset)) {
                long notAnimatableDelta3 = itemInfo.getNotAnimatableDelta();
                placeableInfo.m629setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(placeableOffset) - IntOffset.m3958getXimpl(notAnimatableDelta3), IntOffset.m3959getYimpl(placeableOffset) - IntOffset.m3959getYimpl(notAnimatableDelta3)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, null), 3, null);
                }
            }
        }
    }

    /* renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m588toOffsetBjo55l4(int i) {
        boolean z = this.isVertical;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return IntOffsetKt.IntOffset(i2, i);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m587getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m3959getYimpl(j) : IntOffset.m3958getXimpl(j);
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, int slotsPerLine, boolean reverseLayout, final List<LazyGridPositionedItem> positionedItems, LazyMeasuredItemProvider measuredItemProvider) {
        boolean z;
        boolean z2;
        long m3805fixedHeightOenEA2s;
        int i;
        int i2;
        int m587getMainAxisgyyYBs;
        long j;
        ItemInfo itemInfo;
        LazyGridPositionedItem lazyGridPositionedItem;
        int m586calculateExpectedOffsettGxSNXI;
        long m3954copyiSbpLlY$default;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        int size = positionedItems.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (positionedItems.get(i3).getHasAnimations()) {
                this.slotsPerLine = slotsPerLine;
                int i4 = this.isVertical ? layoutHeight : layoutWidth;
                long m588toOffsetBjo55l4 = m588toOffsetBjo55l4(reverseLayout ? -consumedScroll : consumedScroll);
                LazyGridPositionedItem lazyGridPositionedItem2 = (LazyGridPositionedItem) CollectionsKt.first((List) positionedItems);
                LazyGridPositionedItem lazyGridPositionedItem3 = (LazyGridPositionedItem) CollectionsKt.last((List) positionedItems);
                int size2 = positionedItems.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    LazyGridPositionedItem lazyGridPositionedItem4 = positionedItems.get(i5);
                    ItemInfo itemInfo2 = this.keyToItemInfoMap.get(lazyGridPositionedItem4.getKey());
                    if (itemInfo2 != null) {
                        itemInfo2.setIndex(lazyGridPositionedItem4.getIndex());
                        itemInfo2.setCrossAxisSize(lazyGridPositionedItem4.getCrossAxisSize());
                        itemInfo2.setCrossAxisOffset(lazyGridPositionedItem4.getCrossAxisOffset());
                    }
                }
                Function1<Integer, Integer> function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Integer invoke(int i6) {
                        boolean z3;
                        z3 = LazyGridItemPlacementAnimator.this.isVertical;
                        return Integer.valueOf(z3 ? positionedItems.get(i6).getRow() : positionedItems.get(i6).getColumn());
                    }
                };
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i6 < positionedItems.size()) {
                    int intValue = function1.invoke(Integer.valueOf(i6)).intValue();
                    if (intValue == -1) {
                        i6++;
                    } else {
                        int i9 = 0;
                        while (i6 < positionedItems.size() && function1.invoke(Integer.valueOf(i6)).intValue() == intValue) {
                            i9 = Math.max(i9, positionedItems.get(i6).getMainAxisSizeWithSpacings());
                            i6++;
                        }
                        i7 += i9;
                        i8++;
                    }
                }
                int i10 = i7 / i8;
                this.positionedKeys.clear();
                int i11 = 0;
                for (int size3 = positionedItems.size(); i11 < size3; size3 = i2) {
                    LazyGridPositionedItem lazyGridPositionedItem5 = positionedItems.get(i11);
                    this.positionedKeys.add(lazyGridPositionedItem5.getKey());
                    ItemInfo itemInfo3 = this.keyToItemInfoMap.get(lazyGridPositionedItem5.getKey());
                    if (itemInfo3 == null) {
                        if (lazyGridPositionedItem5.getHasAnimations()) {
                            ItemInfo itemInfo4 = new ItemInfo(lazyGridPositionedItem5.getIndex(), lazyGridPositionedItem5.getCrossAxisSize(), lazyGridPositionedItem5.getCrossAxisOffset());
                            Integer num = this.keyToIndexMap.get(lazyGridPositionedItem5.getKey());
                            long placeableOffset = lazyGridPositionedItem5.getPlaceableOffset();
                            if (num == null) {
                                m586calculateExpectedOffsettGxSNXI = m587getMainAxisgyyYBs(placeableOffset);
                                j = placeableOffset;
                                itemInfo = itemInfo4;
                                lazyGridPositionedItem = lazyGridPositionedItem5;
                                i = i11;
                                i2 = size3;
                            } else {
                                if (!reverseLayout) {
                                    m587getMainAxisgyyYBs = m587getMainAxisgyyYBs(placeableOffset);
                                } else {
                                    m587getMainAxisgyyYBs = m587getMainAxisgyyYBs(placeableOffset) - lazyGridPositionedItem5.getMainAxisSizeWithSpacings();
                                }
                                j = placeableOffset;
                                itemInfo = itemInfo4;
                                lazyGridPositionedItem = lazyGridPositionedItem5;
                                i = i11;
                                i2 = size3;
                                m586calculateExpectedOffsettGxSNXI = m586calculateExpectedOffsettGxSNXI(num.intValue(), lazyGridPositionedItem5.getMainAxisSizeWithSpacings(), i10, m588toOffsetBjo55l4, reverseLayout, i4, m587getMainAxisgyyYBs);
                            }
                            if (this.isVertical) {
                                m3954copyiSbpLlY$default = IntOffset.m3954copyiSbpLlY$default(j, 0, m586calculateExpectedOffsettGxSNXI, 1, null);
                            } else {
                                m3954copyiSbpLlY$default = IntOffset.m3954copyiSbpLlY$default(j, m586calculateExpectedOffsettGxSNXI, 0, 2, null);
                            }
                            int placeablesCount = lazyGridPositionedItem.getPlaceablesCount();
                            for (int i12 = 0; i12 < placeablesCount; i12++) {
                                itemInfo.getPlaceables().add(new PlaceableInfo(m3954copyiSbpLlY$default, lazyGridPositionedItem.getMainAxisSize(i12), null));
                                Unit unit = Unit.INSTANCE;
                            }
                            LazyGridPositionedItem lazyGridPositionedItem6 = lazyGridPositionedItem;
                            ItemInfo itemInfo5 = itemInfo;
                            this.keyToItemInfoMap.put(lazyGridPositionedItem6.getKey(), itemInfo5);
                            startAnimationsIfNeeded(lazyGridPositionedItem6, itemInfo5);
                        } else {
                            i = i11;
                            i2 = size3;
                        }
                    } else {
                        i = i11;
                        i2 = size3;
                        if (lazyGridPositionedItem5.getHasAnimations()) {
                            long notAnimatableDelta = itemInfo3.getNotAnimatableDelta();
                            itemInfo3.m577setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(notAnimatableDelta) + IntOffset.m3958getXimpl(m588toOffsetBjo55l4), IntOffset.m3959getYimpl(notAnimatableDelta) + IntOffset.m3959getYimpl(m588toOffsetBjo55l4)));
                            startAnimationsIfNeeded(lazyGridPositionedItem5, itemInfo3);
                        } else {
                            this.keyToItemInfoMap.remove(lazyGridPositionedItem5.getKey());
                        }
                    }
                    i11 = i + 1;
                }
                if (!reverseLayout) {
                    this.viewportStartItemIndex = lazyGridPositionedItem2.getIndex();
                    this.viewportStartItemNotVisiblePartSize = m587getMainAxisgyyYBs(lazyGridPositionedItem2.getOffset());
                    this.viewportEndItemIndex = lazyGridPositionedItem3.getIndex();
                    this.viewportEndItemNotVisiblePartSize = (m587getMainAxisgyyYBs(lazyGridPositionedItem3.getOffset()) + lazyGridPositionedItem3.getLineMainAxisSizeWithSpacings()) - i4;
                } else {
                    this.viewportStartItemIndex = lazyGridPositionedItem3.getIndex();
                    this.viewportStartItemNotVisiblePartSize = (i4 - m587getMainAxisgyyYBs(lazyGridPositionedItem3.getOffset())) - lazyGridPositionedItem3.getLineMainAxisSize();
                    this.viewportEndItemIndex = lazyGridPositionedItem2.getIndex();
                    this.viewportEndItemNotVisiblePartSize = (-m587getMainAxisgyyYBs(lazyGridPositionedItem2.getOffset())) + (lazyGridPositionedItem2.getLineMainAxisSizeWithSpacings() - (this.isVertical ? IntSize.m3999getHeightimpl(lazyGridPositionedItem2.getSize()) : IntSize.m4000getWidthimpl(lazyGridPositionedItem2.getSize())));
                }
                Iterator<Map.Entry<Object, ItemInfo>> it = this.keyToItemInfoMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Object, ItemInfo> next = it.next();
                    if (!this.positionedKeys.contains(next.getKey())) {
                        ItemInfo value = next.getValue();
                        long notAnimatableDelta2 = value.getNotAnimatableDelta();
                        value.m577setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(notAnimatableDelta2) + IntOffset.m3958getXimpl(m588toOffsetBjo55l4), IntOffset.m3959getYimpl(notAnimatableDelta2) + IntOffset.m3959getYimpl(m588toOffsetBjo55l4)));
                        Integer num2 = measuredItemProvider.getKeyToIndexMap().get(next.getKey());
                        List<PlaceableInfo> placeables = value.getPlaceables();
                        int size4 = placeables.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                z = false;
                                break;
                            }
                            PlaceableInfo placeableInfo = placeables.get(i13);
                            long targetOffset = placeableInfo.getTargetOffset();
                            long notAnimatableDelta3 = value.getNotAnimatableDelta();
                            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m3958getXimpl(targetOffset) + IntOffset.m3958getXimpl(notAnimatableDelta3), IntOffset.m3959getYimpl(targetOffset) + IntOffset.m3959getYimpl(notAnimatableDelta3));
                            if (m587getMainAxisgyyYBs(IntOffset) + placeableInfo.getMainAxisSize() > 0 && m587getMainAxisgyyYBs(IntOffset) < i4) {
                                z = true;
                                break;
                            }
                            i13++;
                        }
                        List<PlaceableInfo> placeables2 = value.getPlaceables();
                        int size5 = placeables2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size5) {
                                z2 = false;
                                break;
                            } else {
                                if (placeables2.get(i14).getInProgress()) {
                                    z2 = true;
                                    break;
                                }
                                i14++;
                            }
                        }
                        if ((!z && !z2) || num2 == null || value.getPlaceables().isEmpty()) {
                            it.remove();
                        } else {
                            int m565constructorimpl = ItemIndex.m565constructorimpl(num2.intValue());
                            if (this.isVertical) {
                                m3805fixedHeightOenEA2s = Constraints.INSTANCE.m3806fixedWidthOenEA2s(value.getCrossAxisSize());
                            } else {
                                m3805fixedHeightOenEA2s = Constraints.INSTANCE.m3805fixedHeightOenEA2s(value.getCrossAxisSize());
                            }
                            LazyMeasuredItem m610getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m610getAndMeasureednRnyU$default(measuredItemProvider, m565constructorimpl, 0, m3805fixedHeightOenEA2s, 2, null);
                            int m586calculateExpectedOffsettGxSNXI2 = m586calculateExpectedOffsettGxSNXI(num2.intValue(), m610getAndMeasureednRnyU$default.getMainAxisSizeWithSpacings(), i10, m588toOffsetBjo55l4, reverseLayout, i4, i4);
                            if (reverseLayout) {
                                m586calculateExpectedOffsettGxSNXI2 = (i4 - m586calculateExpectedOffsettGxSNXI2) - m610getAndMeasureednRnyU$default.getMainAxisSize();
                            }
                            LazyGridPositionedItem position = m610getAndMeasureednRnyU$default.position(m586calculateExpectedOffsettGxSNXI2, value.getCrossAxisOffset(), layoutWidth, layoutHeight, -1, -1, m610getAndMeasureednRnyU$default.getMainAxisSize());
                            positionedItems.add(position);
                            startAnimationsIfNeeded(position, value);
                        }
                    }
                }
                this.keyToIndexMap = measuredItemProvider.getKeyToIndexMap();
                return;
            }
        }
        reset();
    }
}
