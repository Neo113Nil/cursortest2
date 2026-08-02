package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J%\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b&\u0010(J\u0015\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b\t\u0010?R\u0016\u0010A\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010>R\u0014\u0010;\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u00108R\u0014\u0010I\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u00108R\u0014\u0010K\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u00108R\u0014\u0010N\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010\u0017\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\bR\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010SR\u001a\u0010\u001c\u001a\u00020\u001b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010M\u001a\u0004\bU\u0010VR$\u0010X\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bX\u00108\u001a\u0004\b.\u0010:R\u001a\u0010Y\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bY\u00108\u001a\u0004\bZ\u0010:R\u001a\u0010[\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\b[\u00108\u001a\u0004\b\\\u0010:R\u001a\u0010]\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\b]\u00108\u001a\u0004\b^\u0010:R\u001a\u0010_\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b_\u00108\u001a\u0004\b`\u0010:R\u001a\u0010a\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u00108\u001a\u0004\bb\u0010:R\"\u0010c\u001a\u00020\b8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bc\u0010>\u001a\u0004\bd\u0010?\"\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u00108R\u0016\u0010G\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u00108R\u0016\u0010B\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u00108R\u0014\u0010J\u001a\u00020h8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010iR\u0014\u0010k\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010:R\u0018\u0010L\u001a\u00020\u0003*\u00020\u00148CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010lR\u0018\u0010n\u001a\u00020\u0003*\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010m"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "index", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "", "isVertical", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", "key", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParentData", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "(IIII)V", "(III)V", "mainAxisLayoutSize", "updateMainAxisLayoutSize", "(I)V", "getOffset-Bjo55l4", "(I)J", "getOffset", "delta", "updateAnimations", "applyScrollDelta", "(IZ)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "isLookingAhead", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "getInputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Z", "()Z", "Landroidx/compose/ui/Alignment$Horizontal;", "getHighSpeedVideoFpsRangesFor", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/Alignment$Vertical;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/LayoutDirection;", "getHighSpeedVideoSizes", "getOutputSizeshNQ4ISI", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getOutputSizes", "getInputFormats", "getOutputMinFrameDurationlomOqCM", "J", "getOutputMinFrameDuration", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getOutputFormats", "getConstraints-msEJaDk", "()J", "p0", "offset", io.ktor.http.ContentDisposition.Parameters.Size, "getSize", "lane", "getLane", "span", "getSpan", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "getOutputStallDuration", "", "[I", "getPlaceablesCount", "placeablesCount", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "isOutputSupportedForhNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListMeasuredItem implements androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.LayoutDirection getHighSpeedVideoSizes;
    private final long constraints;
    private final java.lang.Object contentType;
    private final int crossAxisSize;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment.Horizontal getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getOutputStallDurationlomOqCM;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int[] getOutputSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.layout.Placeable> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int getOutputStallDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final long getOutputMinFrameDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final int getInputFormats;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment.Vertical Camera2StreamConfigurationMap;
    private final int index;
    private final boolean isVertical;
    private final java.lang.Object key;
    private final int lane;
    private final int mainAxisSizeWithSpacings;
    private boolean nonScrollableItem;
    private int offset;
    private final int size;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i, java.util.List<? extends androidx.compose.ui.layout.Placeable> list, boolean z, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, java.lang.Object obj, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> lazyLayoutItemAnimator, long j2) {
        this.index = i;
        this.getHighSpeedVideoFpsRanges = list;
        this.isVertical = z;
        this.getHighSpeedVideoFpsRangesFor = horizontal;
        this.Camera2StreamConfigurationMap = vertical;
        this.getHighSpeedVideoSizes = layoutDirection;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getInputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizesFor = i3;
        this.getInputFormats = i4;
        this.getOutputMinFrameDuration = j;
        this.key = obj;
        this.contentType = obj2;
        this.getOutputFormats = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.span = 1;
        this.getOutputStallDuration = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i7);
            i5 += getIsVertical() ? placeable.getHeight() : placeable.getWidth();
            i6 = java.lang.Math.max(i6, !getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = i5;
        this.mainAxisSizeWithSpacings = kotlin.ranges.RangesKt.coerceAtLeast(getSize() + this.getInputFormats, 0);
        this.crossAxisSize = i6;
        this.getOutputSizes = new int[this.getHighSpeedVideoFpsRanges.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final java.lang.Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final java.lang.Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getSpan() {
        return this.span;
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getPlaceablesCount() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final java.lang.Object getParentData(int index) {
        return this.getHighSpeedVideoFpsRanges.get(index).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        position(mainAxisOffset, layoutWidth, layoutHeight);
    }

    public final void position(int mainAxisOffset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = mainAxisOffset;
        this.getOutputStallDuration = getIsVertical() ? layoutHeight : layoutWidth;
        java.util.List<androidx.compose.ui.layout.Placeable> list = this.getHighSpeedVideoFpsRanges;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Placeable placeable = list.get(i);
            int i2 = i * 2;
            if (getIsVertical()) {
                int[] iArr = this.getOutputSizes;
                androidx.compose.ui.Alignment.Horizontal horizontal = this.getHighSpeedVideoFpsRangesFor;
                if (horizontal != null) {
                    iArr[i2] = horizontal.align(placeable.getWidth(), layoutWidth, this.getHighSpeedVideoSizes);
                    this.getOutputSizes[i2 + 1] = mainAxisOffset;
                    width = placeable.getHeight();
                } else {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == true");
                    throw new kotlin.KotlinNothingValueException();
                }
            } else {
                int[] iArr2 = this.getOutputSizes;
                iArr2[i2] = mainAxisOffset;
                androidx.compose.ui.Alignment.Vertical vertical = this.Camera2StreamConfigurationMap;
                if (vertical != null) {
                    iArr2[i2 + 1] = vertical.align(placeable.getHeight(), layoutHeight);
                    width = placeable.getWidth();
                } else {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment when isVertical == false");
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            mainAxisOffset += width;
        }
        this.getOutputSizeshNQ4ISI = -this.getInputSizeshNQ4ISI;
        this.getOutputStallDurationlomOqCM = this.getOutputStallDuration + this.getHighSpeedVideoSizesFor;
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.getOutputStallDuration = mainAxisLayoutSize;
        this.getOutputStallDurationlomOqCM = mainAxisLayoutSize + this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long mo1794getOffsetBjo55l4(int index) {
        if (index == 0 && getPlaceablesCount() == 0) {
            return getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8723constructorimpl(getOffset() & 4294967295L) : androidx.compose.ui.unit.IntOffset.m8723constructorimpl(getOffset() << 32);
        }
        int[] iArr = this.getOutputSizes;
        int i = index * 2;
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((4294967295L & iArr[i + 1]) | (iArr[i] << 32));
    }

    public final void applyScrollDelta(int delta, boolean updateAnimations) {
        int intValue;
        int m8730getYimpl;
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + delta;
        int length = this.getOutputSizes.length;
        for (int i = 0; i < length; i++) {
            int i2 = i & 1;
            if ((getIsVertical() && i2 != 0) || (!getIsVertical() && i2 == 0)) {
                int[] iArr = this.getOutputSizes;
                iArr[i] = iArr[i] + delta;
            }
        }
        if (updateAnimations) {
            int placeablesCount = getPlaceablesCount();
            for (int i3 = 0; i3 < placeablesCount; i3++) {
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation animation = this.getOutputFormats.getAnimation(getKey(), i3);
                if (animation != null) {
                    long rawOffset = animation.getRawOffset();
                    if (getIsVertical()) {
                        intValue = androidx.compose.ui.unit.IntOffset.m8729getXimpl(rawOffset);
                        m8730getYimpl = java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m8730getYimpl(rawOffset) + delta).intValue();
                    } else {
                        intValue = java.lang.Integer.valueOf(androidx.compose.ui.unit.IntOffset.m8729getXimpl(rawOffset) + delta).intValue();
                        m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(rawOffset);
                    }
                    animation.m1851setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffset.m8723constructorimpl((intValue << 32) | (m8730getYimpl & 4294967295L)));
                }
            }
        }
    }

    public final void place(androidx.compose.ui.layout.Placeable.PlacementScope scope, boolean isLookingAhead) {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer;
        long m8730getYimpl;
        if (this.getOutputStallDuration == Integer.MIN_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            androidx.compose.ui.layout.Placeable placeable = this.getHighSpeedVideoFpsRanges.get(i);
            int highSpeedVideoSizes = this.getOutputSizeshNQ4ISI - getHighSpeedVideoSizes(placeable);
            int i2 = this.getOutputStallDurationlomOqCM;
            long mo1794getOffsetBjo55l4 = mo1794getOffsetBjo55l4(i);
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation animation = this.getOutputFormats.getAnimation(getKey(), i);
            if (animation != null) {
                if (isLookingAhead) {
                    animation.m1850setLookaheadOffsetgyyYBs(mo1794getOffsetBjo55l4);
                } else {
                    if (!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(animation.getLookaheadOffset(), androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.INSTANCE.m1852getNotInitializednOccac())) {
                        mo1794getOffsetBjo55l4 = animation.getLookaheadOffset();
                    }
                    long m8733plusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(mo1794getOffsetBjo55l4, animation.m1847getPlacementDeltanOccac());
                    if ((Camera2StreamConfigurationMap(mo1794getOffsetBjo55l4) <= highSpeedVideoSizes && Camera2StreamConfigurationMap(m8733plusqkQi6aY) <= highSpeedVideoSizes) || (Camera2StreamConfigurationMap(mo1794getOffsetBjo55l4) >= i2 && Camera2StreamConfigurationMap(m8733plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo1794getOffsetBjo55l4 = m8733plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (getIsVertical()) {
                    int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo1794getOffsetBjo55l4);
                    int m8730getYimpl2 = androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo1794getOffsetBjo55l4);
                    m8730getYimpl = (((this.getOutputStallDuration - m8730getYimpl2) - getHighSpeedVideoSizes(placeable)) & 4294967295L) | (m8729getXimpl << 32);
                } else {
                    int m8729getXimpl2 = androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo1794getOffsetBjo55l4);
                    int i3 = this.getOutputStallDuration;
                    int highSpeedVideoSizes2 = getHighSpeedVideoSizes(placeable);
                    m8730getYimpl = (androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo1794getOffsetBjo55l4) & 4294967295L) | (((i3 - m8729getXimpl2) - highSpeedVideoSizes2) << 32);
                }
                mo1794getOffsetBjo55l4 = androidx.compose.ui.unit.IntOffset.m8723constructorimpl(m8730getYimpl);
            }
            long m8733plusqkQi6aY2 = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(mo1794getOffsetBjo55l4, this.getOutputMinFrameDuration);
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

    private final int Camera2StreamConfigurationMap(long j) {
        return getIsVertical() ? androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) : androidx.compose.ui.unit.IntOffset.m8729getXimpl(j);
    }

    private final int getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public /* synthetic */ LazyListMeasuredItem(int i, java.util.List list, boolean z, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, java.lang.Object obj, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, horizontal, vertical, layoutDirection, z2, i2, i3, i4, j, obj, obj2, lazyLayoutItemAnimator, j2);
    }
}
