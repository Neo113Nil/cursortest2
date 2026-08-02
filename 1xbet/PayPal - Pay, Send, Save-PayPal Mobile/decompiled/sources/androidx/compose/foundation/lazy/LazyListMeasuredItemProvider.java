package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010!\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010.\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "<init>", "(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "lane", "span", "getAndMeasure--hBUhpc", "(IIIJ)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getAndMeasure", "getAndMeasure-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "", "keepAround", "(I)V", "", "key", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem-X9ElhV4", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "createItem", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "getHighSpeedVideoFpsRangesFor", "childConstraints", "J", "getChildConstraints-msEJaDk", "()J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/collection/IntList;", "getHeaderIndexes", "()Landroidx/collection/IntList;", "headerIndexes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LazyListMeasuredItemProvider extends androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider<androidx.compose.foundation.lazy.LazyListMeasuredItem> {
    public static final int $stable = 8;
    private final long childConstraints;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.foundation.lazy.LazyListItemProvider getHighSpeedVideoSizes;

    /* renamed from: createItem-X9ElhV4 */
    public abstract androidx.compose.foundation.lazy.LazyListMeasuredItem mo1786createItemX9ElhV4(int index, java.lang.Object key, java.lang.Object contentType, java.util.List<? extends androidx.compose.ui.layout.Placeable> placeables, long constraints);

    private LazyListMeasuredItemProvider(long j, boolean z, androidx.compose.foundation.lazy.LazyListItemProvider lazyListItemProvider, androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.getHighSpeedVideoSizes = lazyListItemProvider;
        this.getHighSpeedVideoFpsRangesFor = lazyLayoutMeasureScope;
        this.childConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, z ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j), 5, null);
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc, reason: not valid java name */
    public androidx.compose.foundation.lazy.LazyListMeasuredItem mo1796getAndMeasurehBUhpc(int index, int lane, int span, long constraints) {
        return m1797getAndMeasure0kLqBqw(index, constraints);
    }

    /* renamed from: getAndMeasure-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.lazy.LazyListMeasuredItem m1795getAndMeasure0kLqBqw$default(androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, long j, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i2 & 2) != 0) {
            j = lazyListMeasuredItemProvider.childConstraints;
        }
        return lazyListMeasuredItemProvider.m1797getAndMeasure0kLqBqw(i, j);
    }

    /* renamed from: getAndMeasure-0kLqBqw, reason: not valid java name */
    public final androidx.compose.foundation.lazy.LazyListMeasuredItem m1797getAndMeasure0kLqBqw(int index, long constraints) {
        return mo1786createItemX9ElhV4(index, this.getHighSpeedVideoSizes.getKey(index), this.getHighSpeedVideoSizes.getContentType(index), m1858getPlaceables3p2s80s(this.getHighSpeedVideoFpsRangesFor, index, constraints), constraints);
    }

    public final void keepAround(int index) {
        this.getHighSpeedVideoFpsRangesFor.compose(index);
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.getHighSpeedVideoSizes.getKeyIndexMap();
    }

    public final androidx.collection.IntList getHeaderIndexes() {
        return this.getHighSpeedVideoSizes.getHeaderIndexes();
    }

    public /* synthetic */ LazyListMeasuredItemProvider(long j, boolean z, androidx.compose.foundation.lazy.LazyListItemProvider lazyListItemProvider, androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, lazyListItemProvider, lazyLayoutMeasureScope);
    }
}
