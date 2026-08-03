package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridMeasure.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FJ\u001e\u0010G\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003J\b\u0010I\u001a\u00020JH\u0016J+\u0010K\u001a\u00020-*\u00020-2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030MH\u0082\bø\u0001\u0000¢\u0006\u0004\bN\u0010OR\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001c\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u000e\u0010'\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001fR&\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020-@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u001c\u00104\u001a\u000205X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00101\u001a\u0004\b6\u00100R\u0011\u00107\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0018R\u0018\u0010:\u001a\u00020\u0003*\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0019\u0010%\u001a\u00020\u0003*\u00020\b8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", com.ironsource.X3.i.W, "", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "animator", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;)V", "getContentType", "()Ljava/lang/Object;", "crossAxisOffset", "getCrossAxisOffset", "()I", "crossAxisSize", "getCrossAxisSize", "getIndex", "()Z", com.ironsource.C3023e8.k, "setVisible", "(Z)V", "getKey", "getLane", "mainAxisLayoutSize", "mainAxisOffset", "getMainAxisOffset", "mainAxisSize", "getMainAxisSize", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", "offset", "getOffset-nOcc-ac", "()J", "J", "placeablesCount", "getPlaceablesCount", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "sizeWithSpacings", "getSizeWithSpacings", "getSpan", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "getParentData", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "context", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "crossAxis", "toString", "", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator animator;
    private final int beforeContentPadding;
    private final java.lang.Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible = true;
    private final java.lang.Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final java.util.List<androidx.compose.ui.layout.Placeable> placeables;
    private final long size;
    private final int sizeWithSpacings;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i, java.lang.Object obj, java.util.List<? extends androidx.compose.ui.layout.Placeable> list, boolean z, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj2, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator) {
        java.lang.Integer valueOf;
        long IntSize;
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.lane = i3;
        this.span = i4;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.contentType = obj2;
        this.animator = lazyStaggeredGridItemPlacementAnimator;
        int i7 = 1;
        java.lang.Integer num = null;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(0);
            valueOf = java.lang.Integer.valueOf(z ? placeable.getHeight() : placeable.getWidth());
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i8 = 1;
                while (true) {
                    androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) list.get(i8);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.isVertical ? placeable2.getHeight() : placeable2.getWidth());
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i8 == lastIndex) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        java.lang.Integer num2 = valueOf;
        int intValue = num2 != null ? num2.intValue() : 0;
        this.mainAxisSize = intValue;
        this.sizeWithSpacings = kotlin.ranges.RangesKt.coerceAtLeast(intValue + i2, 0);
        java.util.List<androidx.compose.ui.layout.Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            androidx.compose.ui.layout.Placeable placeable3 = list2.get(0);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.isVertical ? placeable3.getWidth() : placeable3.getHeight());
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list2);
            if (1 <= lastIndex2) {
                while (true) {
                    androidx.compose.ui.layout.Placeable placeable4 = list2.get(i7);
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(this.isVertical ? placeable4.getWidth() : placeable4.getHeight());
                    valueOf3 = valueOf4.compareTo(valueOf3) > 0 ? valueOf4 : valueOf3;
                    if (i7 == lastIndex2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            num = valueOf3;
        }
        java.lang.Integer num3 = num;
        int intValue2 = num3 != null ? num3.intValue() : 0;
        this.crossAxisSize = intValue2;
        this.mainAxisLayoutSize = -1;
        if (this.isVertical) {
            IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(intValue2, this.mainAxisSize);
        } else {
            IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(this.mainAxisSize, intValue2);
        }
        this.size = IntSize;
        this.offset = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public java.lang.Object getKey() {
        return this.key;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    public final int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public java.lang.Object getContentType() {
        return this.contentType;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    public final java.lang.Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final void position(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        long IntOffset;
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
        if (this.isVertical) {
            IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(crossAxis, mainAxis);
        } else {
            IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(mainAxis, crossAxis);
        }
        this.offset = IntOffset;
    }

    public final int getMainAxisOffset() {
        return !this.isVertical ? androidx.compose.ui.unit.IntOffset.m4610getXimpl(getOffset()) : androidx.compose.ui.unit.IntOffset.m4611getYimpl(getOffset());
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? androidx.compose.ui.unit.IntOffset.m4610getXimpl(getOffset()) : androidx.compose.ui.unit.IntOffset.m4611getYimpl(getOffset());
    }

    public final void place(androidx.compose.ui.layout.Placeable.PlacementScope scope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext context) {
        int m4610getXimpl;
        int m4611getYimpl;
        if (this.mainAxisLayoutSize == -1) {
            throw new java.lang.IllegalArgumentException("position() should be called first".toString());
        }
        java.util.List<androidx.compose.ui.layout.Placeable> list = this.placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable = list.get(i);
            int height = this.minMainAxisOffset - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            androidx.compose.foundation.lazy.layout.LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long m718getPlacementDeltanOccac = animation.m718getPlacementDeltanOccac();
                long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(m718getPlacementDeltanOccac), androidx.compose.ui.unit.IntOffset.m4611getYimpl(offset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(m718getPlacementDeltanOccac));
                if ((m783getMainAxisgyyYBs(offset) <= height && m783getMainAxisgyyYBs(IntOffset) <= height) || (m783getMainAxisgyyYBs(offset) >= i2 && m783getMainAxisgyyYBs(IntOffset) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                offset = IntOffset;
            }
            if (context.getReverseLayout()) {
                if (this.isVertical) {
                    m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset);
                } else {
                    m4610getXimpl = (this.mainAxisLayoutSize - androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
                }
                if (!this.isVertical) {
                    m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(offset);
                } else {
                    m4611getYimpl = (this.mainAxisLayoutSize - androidx.compose.ui.unit.IntOffset.m4611getYimpl(offset)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth());
                }
                offset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(m4610getXimpl, m4611getYimpl);
            }
            long contentOffset = context.getContentOffset();
            androidx.compose.ui.layout.Placeable.PlacementScope.m3458placeRelativeWithLayeraW9wM$default(scope, placeable, androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(contentOffset), androidx.compose.ui.unit.IntOffset.m4611getYimpl(offset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(contentOffset)), 0.0f, null, 6, null);
        }
    }

    public final void applyScrollDelta(int delta) {
        if (this.nonScrollableItem) {
            return;
        }
        long offset = getOffset();
        int m4610getXimpl = this.isVertical ? androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset) : androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset) + delta;
        boolean z = this.isVertical;
        int m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(offset);
        if (z) {
            m4611getYimpl += delta;
        }
        this.offset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(m4610getXimpl, m4611getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            androidx.compose.foundation.lazy.layout.LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long rawOffset = animation.getRawOffset();
                int m4610getXimpl2 = this.isVertical ? androidx.compose.ui.unit.IntOffset.m4610getXimpl(rawOffset) : java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m4610getXimpl(rawOffset) + delta).intValue();
                boolean z2 = this.isVertical;
                int m4611getYimpl2 = androidx.compose.ui.unit.IntOffset.m4611getYimpl(rawOffset);
                if (z2) {
                    m4611getYimpl2 += delta;
                }
                animation.m721setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffsetKt.IntOffset(m4610getXimpl2, m4611getYimpl2));
            }
        }
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m783getMainAxisgyyYBs(long j) {
        return this.isVertical ? androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) : androidx.compose.ui.unit.IntOffset.m4610getXimpl(j);
    }

    private final int getMainAxisSize(androidx.compose.ui.layout.Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m782copy4Tuh3kE(long j, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        int m4610getXimpl = this.isVertical ? androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) : function1.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(j);
        if (z) {
            m4611getYimpl = function1.invoke(java.lang.Integer.valueOf(m4611getYimpl)).intValue();
        }
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(m4610getXimpl, m4611getYimpl);
    }

    public java.lang.String toString() {
        return super.toString();
    }
}
