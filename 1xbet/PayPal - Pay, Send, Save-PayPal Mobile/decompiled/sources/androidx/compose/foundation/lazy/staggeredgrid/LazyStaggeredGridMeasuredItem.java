package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J/\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010(J%\u0010.\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020!2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\b\u000b\u0010CR\u001a\u0010\r\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bD\u0010;R\u001a\u0010\u000e\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010;R\u0014\u0010F\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u00109R\u0014\u0010H\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u00109R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bI\u0010>R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010JR\u001a\u0010\u0015\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010NR\"\u0010O\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010B\u001a\u0004\bO\u0010C\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010;R\u001a\u0010T\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bU\u0010;R\u001a\u0010V\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bV\u00109\u001a\u0004\bW\u0010;R\u001a\u0010X\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u00109\u001a\u0004\bY\u0010;R\u0016\u0010G\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u00109R\u0016\u0010[\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u00109R\u0016\u0010Z\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u00109R\"\u0010\\\u001a\u00020\n8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010C\"\u0004\b^\u0010QR\u001a\u0010`\u001a\u00020_8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b`\u0010L\u001a\u0004\ba\u0010NR$\u0010c\u001a\u00020\u001a2\u0006\u0010b\u001a\u00020\u001a8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bd\u0010NR\u0011\u0010$\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\be\u0010;R\u0018\u0010?\u001a\u00020\u0003*\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "mainAxis", "crossAxis", "mainAxisLayoutSize", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "(III)V", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "(IIII)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "context", "isLookingAhead", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;Z)V", "updateMainAxisLayoutSize", "(I)V", "delta", "updateAnimations", "applyScrollDelta", "(IZ)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getInputSizeshNQ4ISI", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "()Z", "getLane", "getSpan", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Camera2StreamConfigurationMap", "J", "getConstraints-msEJaDk", "()J", "isVisible", "setVisible", "(Z)V", "getPlaceablesCount", "placeablesCount", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "getInputFormats", "getOutputMinFrameDuration", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "getSize-YbymL2g", "p0", "offset", "getOffset-nOcc-ac", "getMainAxisOffset", "(J)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridMeasuredItem implements androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getInputFormats;
    private final long constraints;
    private final java.lang.Object contentType;
    private final int crossAxisSize;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.layout.Placeable> getHighResolutionOutputSizeshNQ4ISI;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final java.lang.Object key;
    private final int lane;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private boolean nonScrollableItem;
    private long offset;
    private final long size;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i, java.lang.Object obj, java.util.List<? extends androidx.compose.ui.layout.Placeable> list, boolean z, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j) {
        int height;
        long m8767constructorimpl;
        this.index = i;
        this.key = obj;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.isVertical = z;
        this.lane = i3;
        this.span = i4;
        this.getHighSpeedVideoSizes = i5;
        this.getHighSpeedVideoFpsRangesFor = i6;
        this.contentType = obj2;
        this.Camera2StreamConfigurationMap = lazyLayoutItemAnimator;
        this.constraints = j;
        int i7 = 1;
        this.isVisible = true;
        int i8 = 0;
        if (list.isEmpty()) {
            height = 0;
        } else {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(0);
            height = getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i9 = 1;
                while (true) {
                    androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) list.get(i9);
                    int height2 = getIsVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i9 == lastIndex) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        this.mainAxisSizeWithSpacings = kotlin.ranges.RangesKt.coerceAtLeast(height + i2, 0);
        java.util.List<androidx.compose.ui.layout.Placeable> list2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!list2.isEmpty()) {
            androidx.compose.ui.layout.Placeable placeable3 = list2.get(0);
            int width = getIsVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list2);
            if (lastIndex2 > 0) {
                while (true) {
                    androidx.compose.ui.layout.Placeable placeable4 = list2.get(i7);
                    int width2 = getIsVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i7 == lastIndex2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            i8 = width;
        }
        this.crossAxisSize = i8;
        this.getHighSpeedVideoFpsRanges = Integer.MIN_VALUE;
        if (getIsVertical()) {
            m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((i8 << 32) | (4294967295L & this.mainAxisSize));
        } else {
            m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((this.mainAxisSize << 32) | (i8 & 4294967295L));
        }
        this.size = m8767constructorimpl;
        this.offset = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final java.lang.Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public final java.lang.Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getPlaceablesCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final java.lang.Object getParentData(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(index).getParentData();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public final long mo1794getOffsetBjo55l4(int index) {
        return getOffset();
    }

    public final void position(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        long m8723constructorimpl;
        this.getHighSpeedVideoFpsRanges = mainAxisLayoutSize;
        this.getOutputMinFrameDuration = -this.getHighSpeedVideoSizes;
        this.getInputFormats = mainAxisLayoutSize + this.getHighSpeedVideoFpsRangesFor;
        if (getIsVertical()) {
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((crossAxis << 32) | (mainAxis & 4294967295L));
        } else {
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((crossAxis & 4294967295L) | (mainAxis << 32));
        }
        this.offset = m8723constructorimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        if (getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        position(mainAxisOffset, crossAxisOffset, layoutWidth);
    }

    public final int getMainAxisOffset() {
        return !getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8729getXimpl(getOffset()) : androidx.compose.ui.unit.IntOffset.m8730getYimpl(getOffset());
    }

    public final void place(androidx.compose.ui.layout.Placeable.PlacementScope scope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext context, boolean isLookingAhead) {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer;
        int m8729getXimpl;
        int m8730getYimpl;
        if (this.getHighSpeedVideoFpsRanges == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        java.util.List<androidx.compose.ui.layout.Placeable> list = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable = list.get(i);
            int height = this.getOutputMinFrameDuration - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
            int i2 = this.getInputFormats;
            long offset = getOffset();
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation animation = this.Camera2StreamConfigurationMap.getAnimation(getKey(), i);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m1850setLookaheadOffsetgyyYBs(offset);
                } else {
                    long m8733plusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(animation.getLookaheadOffset(), androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.INSTANCE.m1852getNotInitializednOccac()) ? animation.getLookaheadOffset() : offset, animation.m1847getPlacementDeltanOccac());
                    if ((getHighSpeedVideoFpsRangesFor(offset) <= height && getHighSpeedVideoFpsRangesFor(m8733plusqkQi6aY) <= height) || (getHighSpeedVideoFpsRangesFor(offset) >= i2 && getHighSpeedVideoFpsRangesFor(m8733plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    offset = m8733plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (context.getReverseLayout()) {
                if (getIsVertical()) {
                    m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(offset);
                } else {
                    m8729getXimpl = (this.getHighSpeedVideoFpsRanges - androidx.compose.ui.unit.IntOffset.m8729getXimpl(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
                }
                if (!getIsVertical()) {
                    m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(offset);
                } else {
                    m8730getYimpl = (this.getHighSpeedVideoFpsRanges - androidx.compose.ui.unit.IntOffset.m8730getYimpl(offset)) - (getIsVertical() ? placeable.getHeight() : placeable.getWidth());
                }
                offset = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((m8730getYimpl & 4294967295L) | (m8729getXimpl << 32));
            }
            long m8733plusqkQi6aY2 = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(offset, context.getContentOffset());
            if (!isLookingAhead && animation != null) {
                animation.m1849setFinalOffsetgyyYBs(m8733plusqkQi6aY2);
            }
            if (graphicsLayer != null) {
                androidx.compose.ui.layout.Placeable.PlacementScope.m7418placeRelativeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY2, graphicsLayer, 0.0f, 4, (java.lang.Object) null);
            } else {
                androidx.compose.ui.layout.Placeable.PlacementScope.m7417placeRelativeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY2, 0.0f, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null);
            }
        }
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.getHighSpeedVideoFpsRanges = mainAxisLayoutSize;
        this.getInputFormats = mainAxisLayoutSize + this.getHighSpeedVideoFpsRangesFor;
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int m8729getXimpl = getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8729getXimpl(offset) : androidx.compose.ui.unit.IntOffset.m8729getXimpl(offset) + delta;
        boolean isVertical = getIsVertical();
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(offset);
        if (isVertical) {
            m8730getYimpl += delta;
        }
        this.offset = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((m8729getXimpl << 32) | (m8730getYimpl & 4294967295L));
        if (updateAnimations) {
            int placeablesCount = getPlaceablesCount();
            for (int i = 0; i < placeablesCount; i++) {
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation animation = this.Camera2StreamConfigurationMap.getAnimation(getKey(), i);
                if (animation != null) {
                    long rawOffset = animation.getRawOffset();
                    int m8729getXimpl2 = getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8729getXimpl(rawOffset) : java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m8729getXimpl(rawOffset) + delta).intValue();
                    boolean isVertical2 = getIsVertical();
                    int m8730getYimpl2 = androidx.compose.ui.unit.IntOffset.m8730getYimpl(rawOffset);
                    if (isVertical2) {
                        m8730getYimpl2 = java.lang.Integer.valueOf(m8730getYimpl2 + delta).intValue();
                    }
                    animation.m1851setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffset.m8723constructorimpl((m8730getYimpl2 & 4294967295L) | (m8729getXimpl2 << 32)));
                }
            }
        }
    }

    private final int getHighSpeedVideoFpsRangesFor(long j) {
        return getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) : androidx.compose.ui.unit.IntOffset.m8729getXimpl(j);
    }

    public final java.lang.String toString() {
        return super.toString();
    }

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i, java.lang.Object obj, java.util.List list, boolean z, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, list, z, i2, i3, i4, i5, i6, obj2, lazyLayoutItemAnimator, j);
    }
}
