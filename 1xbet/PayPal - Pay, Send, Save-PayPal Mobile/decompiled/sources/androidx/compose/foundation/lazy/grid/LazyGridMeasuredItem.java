package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J/\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J=\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003¢\u0006\u0004\b(\u0010,J\u0015\u0010.\u001a\u00020'2\u0006\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020'2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u00020'2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b\b\u0010@R\u001a\u0010\t\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\bA\u0010;R\u0014\u0010C\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010?R\u0014\u0010E\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u00109R\u0014\u0010F\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u00109R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\bM\u0010>R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010NR\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\bP\u0010QR\u001a\u0010\u001a\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\bR\u0010;R\u001a\u0010\u001b\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\bS\u0010;R\u001a\u0010T\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bU\u0010;R\u001a\u0010V\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bV\u00109\u001a\u0004\bW\u0010;R\u0014\u0010Y\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010;R\u0016\u0010Z\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u00109R\u0016\u0010H\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u00109R\u0016\u0010B\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u00109R\u001a\u0010\\\u001a\u00020[8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\\\u0010L\u001a\u0004\b]\u0010QR$\u0010_\u001a\u00020\u00132\u0006\u0010^\u001a\u00020\u00138\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010QR$\u0010*\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\ba\u0010;R$\u0010+\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bb\u0010;R\"\u0010c\u001a\u00020\u00078\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bc\u0010?\u001a\u0004\bd\u0010@\"\u0004\be\u0010fR\u0018\u0010h\u001a\u00020\u0003*\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010gR\u0018\u0010j\u001a\u00020\u0003*\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010i"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", "getOffset-Bjo55l4", "(I)J", "getOffset", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "(IIII)V", "row", "column", "(IIIIII)V", "mainAxisLayoutSize", "updateMainAxisLayoutSize", "(I)V", "delta", "updateAnimations", "applyScrollDelta", "(IZ)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "isLookingAhead", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Z", "()Z", "getCrossAxisSize", "getInputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/unit/LayoutDirection;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getOutputFormats", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getInputFormats", "J", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getOutputMinFrameDuration", "getConstraints-msEJaDk", "()J", "getLane", "getSpan", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "getPlaceablesCount", "placeablesCount", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "getSize-YbymL2g", "p0", "offset", "getOffset-nOcc-ac", "getRow", "getColumn", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "(J)I", "getOutputStallDurationlomOqCM", "(Landroidx/compose/ui/layout/Placeable;)I", "getOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridMeasuredItem implements androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;
    private int column;
    private final long constraints;
    private final java.lang.Object contentType;
    private final int crossAxisSize;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.LayoutDirection getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getOutputFormats;
    private final long getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.layout.Placeable> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;
    private final int index;
    private final boolean isVertical;
    private final java.lang.Object key;
    private final int lane;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private boolean nonScrollableItem;
    private long offset;
    private int row;
    private final long size;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, java.lang.Object obj, boolean z, int i2, int i3, boolean z2, androidx.compose.ui.unit.LayoutDirection layoutDirection, int i4, int i5, java.util.List<? extends androidx.compose.ui.layout.Placeable> list, long j, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> lazyLayoutItemAnimator, long j2, int i6, int i7) {
        long m8767constructorimpl;
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getHighSpeedVideoSizes = layoutDirection;
        this.Camera2StreamConfigurationMap = i4;
        this.getHighResolutionOutputSizeshNQ4ISI = i5;
        this.getHighSpeedVideoFpsRanges = list;
        this.getInputFormats = j;
        this.contentType = obj2;
        this.getOutputMinFrameDuration = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.lane = i6;
        this.span = i7;
        this.getHighSpeedVideoSizesFor = Integer.MIN_VALUE;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i9);
            i8 = java.lang.Math.max(i8, getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i8;
        this.mainAxisSizeWithSpacings = kotlin.ranges.RangesKt.coerceAtLeast(i3 + i8, 0);
        if (getIsVertical()) {
            m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((this.crossAxisSize << 32) | (4294967295L & i8));
        } else {
            m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((i8 << 32) | (4294967295L & this.crossAxisSize));
        }
        this.size = m8767constructorimpl;
        this.offset = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final java.lang.Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final java.lang.Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getSpan() {
        return this.span;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getPlaceablesCount() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final java.lang.Object getParentData(int index) {
        return this.getHighSpeedVideoFpsRanges.get(index).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public final long mo1794getOffsetBjo55l4(int index) {
        return getOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        position(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        long m8723constructorimpl;
        this.getHighSpeedVideoSizesFor = getIsVertical() ? layoutHeight : layoutWidth;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.getHighSpeedVideoSizes == androidx.compose.ui.unit.LayoutDirection.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        if (getIsVertical()) {
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((crossAxisOffset << 32) | (mainAxisOffset & 4294967295L));
        } else {
            m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((crossAxisOffset & 4294967295L) | (mainAxisOffset << 32));
        }
        this.offset = m8723constructorimpl;
        this.row = row;
        this.column = column;
        this.getOutputFormats = -this.Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor + this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.getHighSpeedVideoSizesFor = mainAxisLayoutSize;
        this.getInputSizeshNQ4ISI = mainAxisLayoutSize + this.getHighResolutionOutputSizeshNQ4ISI;
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
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation animation = this.getOutputMinFrameDuration.getAnimation(getKey(), i);
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

    public final void place(androidx.compose.ui.layout.Placeable.PlacementScope scope, boolean isLookingAhead) {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer;
        int m8730getYimpl;
        if (this.getHighSpeedVideoSizesFor == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            androidx.compose.ui.layout.Placeable placeable = this.getHighSpeedVideoFpsRanges.get(i);
            int highSpeedVideoFpsRanges = this.getOutputFormats - getHighSpeedVideoFpsRanges(placeable);
            int i2 = this.getInputSizeshNQ4ISI;
            long offset = getOffset();
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation animation = this.getOutputMinFrameDuration.getAnimation(getKey(), i);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m1850setLookaheadOffsetgyyYBs(offset);
                } else {
                    long m8733plusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(animation.getLookaheadOffset(), androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.INSTANCE.m1852getNotInitializednOccac()) ? animation.getLookaheadOffset() : offset, animation.m1847getPlacementDeltanOccac());
                    if ((getHighSpeedVideoSizes(offset) <= highSpeedVideoFpsRanges && getHighSpeedVideoSizes(m8733plusqkQi6aY) <= highSpeedVideoFpsRanges) || (getHighSpeedVideoSizes(offset) >= i2 && getHighSpeedVideoSizes(m8733plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    offset = m8733plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                int m8729getXimpl = getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8729getXimpl(offset) : (this.getHighSpeedVideoSizesFor - androidx.compose.ui.unit.IntOffset.m8729getXimpl(offset)) - getHighSpeedVideoFpsRanges(placeable);
                if (getIsVertical()) {
                    m8730getYimpl = (this.getHighSpeedVideoSizesFor - androidx.compose.ui.unit.IntOffset.m8730getYimpl(offset)) - getHighSpeedVideoFpsRanges(placeable);
                } else {
                    m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(offset);
                }
                offset = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((m8730getYimpl & 4294967295L) | (m8729getXimpl << 32));
            }
            long m8733plusqkQi6aY2 = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(offset, this.getInputFormats);
            if (!isLookingAhead && animation != null) {
                animation.m1849setFinalOffsetgyyYBs(m8733plusqkQi6aY2);
            }
            if (getIsVertical()) {
                if (graphicsLayer != null) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.m7420placeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY2, graphicsLayer, 0.0f, 4, (java.lang.Object) null);
                } else {
                    androidx.compose.ui.layout.Placeable.PlacementScope.m7419placeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY2, 0.0f, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null);
                }
            } else if (graphicsLayer != null) {
                androidx.compose.ui.layout.Placeable.PlacementScope.m7418placeRelativeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY2, graphicsLayer, 0.0f, 4, (java.lang.Object) null);
            } else {
                androidx.compose.ui.layout.Placeable.PlacementScope.m7417placeRelativeWithLayeraW9wM$default(scope, placeable, m8733plusqkQi6aY2, 0.0f, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null);
            }
        }
    }

    private final int getHighSpeedVideoSizes(long j) {
        return getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) : androidx.compose.ui.unit.IntOffset.m8729getXimpl(j);
    }

    private final int getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public /* synthetic */ LazyGridMeasuredItem(int i, java.lang.Object obj, boolean z, int i2, int i3, boolean z2, androidx.compose.ui.unit.LayoutDirection layoutDirection, int i4, int i5, java.util.List list, long j, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }
}
