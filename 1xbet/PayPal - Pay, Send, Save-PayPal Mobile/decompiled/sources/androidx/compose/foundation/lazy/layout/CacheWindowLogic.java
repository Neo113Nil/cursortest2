package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0016\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000b*\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJK\u0010!\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"JG\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0016\u0010#J#\u0010!\u001a\u00020\u001a*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010$J\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u000e\u0010%J'\u0010!\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010'J'\u0010!\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010(J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0016\u0010%J#\u0010!\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010)J\u0013\u0010\u0015\u001a\u00020\u000b*\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0016\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00102R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010+R$\u00109\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010;R$\u0010<\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010;R\u0016\u00104\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u00107R\u0016\u0010>\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010+R\u0016\u0010@\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u00107"}, d2 = {"Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "cacheWindow", "", "enableInitialPrefetch", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;Z)V", "Landroidx/compose/foundation/lazy/layout/CacheWindowScope;", "", "delta", "", "onScroll", "(Landroidx/compose/foundation/lazy/layout/CacheWindowScope;F)V", "getHighSpeedVideoSizes", "()V", "onVisibleItemsUpdated", "(Landroidx/compose/foundation/lazy/layout/CacheWindowScope;)V", "hasValidBounds", "()Z", "p0", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/lazy/layout/CacheWindowScope;Z)V", "getHighResolutionOutputSizeshNQ4ISI", "resetStrategy", "", "p1", "p2", "p3", "p4", "p5", "p6", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/lazy/layout/CacheWindowScope;IIIIIFZ)V", "(IIIIIFI)V", "(Landroidx/compose/foundation/lazy/layout/CacheWindowScope;IZ)I", "(II)V", "Landroidx/compose/foundation/lazy/layout/CachedItem;", "(IILjava/lang/Object;)Landroidx/compose/foundation/lazy/layout/CachedItem;", "(ILjava/lang/Object;I)V", "(Landroidx/compose/foundation/lazy/layout/CacheWindowScope;II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "Z", "Landroidx/collection/MutableIntObjectMap;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "getOutputMinFrameDuration", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "Landroidx/collection/MutableIntSet;", "getOutputMinFrameDurationlomOqCM", "getInputFormats", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "prefetchWindowStartLine", "getPrefetchWindowStartLine$foundation", "()I", "prefetchWindowEndLine", "getPrefetchWindowEndLine$foundation", "getOutputFormats", "getOutputStallDuration", "getOutputStallDurationlomOqCM"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CacheWindowLogic {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableIntSet getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private float getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<androidx.compose.foundation.lazy.layout.CachedItem> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private boolean getOutputMinFrameDurationlomOqCM;
    private int prefetchWindowEndLine;
    private int prefetchWindowStartLine;

    public CacheWindowLogic(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, boolean z) {
        this.getHighSpeedVideoSizes = lazyLayoutCacheWindow;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.IntSetKt.mutableIntSetOf();
        this.getHighSpeedVideoFpsRanges = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();
        this.getHighSpeedVideoSizesFor = -1;
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = Integer.MIN_VALUE;
    }

    public /* synthetic */ CacheWindowLogic(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyLayoutCacheWindow, (i & 2) != 0 ? true : z);
    }

    /* renamed from: getPrefetchWindowStartLine$foundation, reason: from getter */
    public final int getPrefetchWindowStartLine() {
        return this.prefetchWindowStartLine;
    }

    /* renamed from: getPrefetchWindowEndLine$foundation, reason: from getter */
    public final int getPrefetchWindowEndLine() {
        return this.prefetchWindowEndLine;
    }

    public final void onScroll(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, float f) {
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap(cacheWindowScope, f);
        getHighSpeedVideoSizes(cacheWindowScope, f);
        this.getOutputMinFrameDuration = f;
        getHighSpeedVideoSizes();
    }

    private final void getHighSpeedVideoSizes() {
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowStartExtraSpace", this.getInputFormats);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowEndExtraSpace", this.getOutputFormats);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowStartIndex", this.prefetchWindowStartLine);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowEndIndex", this.prefetchWindowEndLine);
    }

    public final void onVisibleItemsUpdated(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope) {
        if (!this.getInputSizeshNQ4ISI && this.Camera2StreamConfigurationMap) {
            androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow = this.getHighSpeedVideoSizes;
            androidx.compose.ui.unit.Density density = cacheWindowScope.getDensity();
            if (density != null && lazyLayoutCacheWindow.calculateAheadWindow(density, cacheWindowScope.getMainAxisViewportSize()) != 0) {
                this.getOutputMinFrameDurationlomOqCM = true;
            }
            this.getInputSizeshNQ4ISI = true;
        }
        int i = this.getHighSpeedVideoSizesFor;
        if (i != -1 && i != cacheWindowScope.getTotalItemsCount()) {
            getHighResolutionOutputSizeshNQ4ISI(cacheWindowScope);
        }
        this.getOutputStallDurationlomOqCM = cacheWindowScope.getTotalItemsCount();
        if (!cacheWindowScope.getHasVisibleItems()) {
            resetStrategy();
        } else {
            int visibleLineCount = cacheWindowScope.getVisibleLineCount();
            for (int i2 = 0; i2 < visibleLineCount; i2++) {
                int visibleItemLine = cacheWindowScope.getVisibleItemLine(i2);
                java.lang.Object visibleLineKey = cacheWindowScope.getVisibleLineKey(i2);
                int visibleItemSize = cacheWindowScope.getVisibleItemSize(i2);
                if (visibleItemLine != -1) {
                    getHighSpeedVideoFpsRanges(visibleItemLine, visibleLineKey, visibleItemSize);
                }
            }
            if (this.getOutputMinFrameDurationlomOqCM) {
                getHighSpeedVideoFpsRangesFor(cacheWindowScope, this.getOutputMinFrameDuration <= 0.0f);
                this.getOutputMinFrameDurationlomOqCM = false;
            }
        }
        this.getHighSpeedVideoSizesFor = cacheWindowScope.getTotalItemsCount();
    }

    public final boolean hasValidBounds() {
        return (this.prefetchWindowStartLine == Integer.MAX_VALUE || this.prefetchWindowEndLine == Integer.MIN_VALUE) ? false : true;
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, float f) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow = this.getHighSpeedVideoSizes;
            androidx.compose.ui.unit.Density density = cacheWindowScope.getDensity();
            int calculateBehindWindow = density != null ? lazyLayoutCacheWindow.calculateBehindWindow(density, mainAxisViewportSize) : 0;
            this.getOutputStallDurationlomOqCM = cacheWindowScope.getTotalItemsCount();
            getHighSpeedVideoFpsRangesFor(cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), calculateBehindWindow, f, cacheWindowScope.getTotalItemsCount());
        }
    }

    private final void getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, float f) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow = this.getHighSpeedVideoSizes;
            androidx.compose.ui.unit.Density density = cacheWindowScope.getDensity();
            int calculateAheadWindow = density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0;
            getHighSpeedVideoFpsRanges(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), calculateAheadWindow, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), f, f <= 0.0f);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, boolean z) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow = this.getHighSpeedVideoSizes;
            androidx.compose.ui.unit.Density density = cacheWindowScope.getDensity();
            getHighSpeedVideoFpsRanges(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), 0.0f, z);
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope) {
        this.getOutputMinFrameDurationlomOqCM = true;
        this.prefetchWindowStartLine = kotlin.ranges.RangesKt.coerceAtLeast(this.prefetchWindowStartLine, 0);
        int lastLineIndex = cacheWindowScope.getLastLineIndex();
        if (lastLineIndex != -1) {
            this.prefetchWindowEndLine = kotlin.ranges.RangesKt.coerceAtMost(this.prefetchWindowEndLine, lastLineIndex);
        }
        if (this.getOutputMinFrameDuration <= 0.0f) {
            getHighSpeedVideoFpsRangesFor(cacheWindowScope.getLastVisibleLineIndex(), this.getOutputStallDurationlomOqCM - 1);
        } else {
            getHighSpeedVideoFpsRangesFor(0, cacheWindowScope.getFirstVisibleLineIndex());
        }
    }

    public final void resetStrategy() {
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = Integer.MIN_VALUE;
        this.getInputFormats = 0;
        this.getOutputFormats = 0;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getHighSpeedVideoFpsRanges.clear();
        androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle>> mutableIntObjectMap = this.getHighResolutionOutputSizeshNQ4ISI;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = mutableIntObjectMap.keys[i4];
                        java.util.List list = (java.util.List) mutableIntObjectMap.values[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle) list.get(i6)).cancel();
                        }
                        mutableIntObjectMap.removeValueAt(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        boolean z2 = java.lang.Math.signum(f) == java.lang.Math.signum(this.getOutputMinFrameDuration);
        if (z) {
            if (!z2 || this.getOutputMinFrameDurationlomOqCM) {
                this.getOutputFormats = i3 - i4;
                this.prefetchWindowEndLine = i2;
            } else {
                this.getOutputFormats = kotlin.ranges.RangesKt.coerceAtMost(this.getOutputFormats + kotlin.math.MathKt.roundToInt(java.lang.Math.abs(f)), i3 - i4);
            }
            while (this.getOutputFormats > 0 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) != -1 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) < this.getOutputStallDurationlomOqCM - 1) {
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cacheWindowScope, this.prefetchWindowEndLine + 1, this.prefetchWindowEndLine + 1 == i2 + 1 && f != 0.0f && java.lang.Math.abs(f) >= ((float) i4));
                if (highSpeedVideoFpsRanges == -1) {
                    return;
                }
                this.prefetchWindowEndLine++;
                this.getOutputFormats -= highSpeedVideoFpsRanges;
            }
            return;
        }
        if (!z2 || this.getOutputMinFrameDurationlomOqCM) {
            this.getInputFormats = i3 - i5;
            this.prefetchWindowStartLine = i;
        } else {
            this.getInputFormats = kotlin.ranges.RangesKt.coerceAtMost(this.getInputFormats + kotlin.math.MathKt.roundToInt(java.lang.Math.abs(f)), i3 - i5);
        }
        while (this.getInputFormats > 0 && (i6 = this.prefetchWindowStartLine) > 0) {
            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(cacheWindowScope, this.prefetchWindowStartLine - 1, i6 + (-1) == i + (-1) && f != 0.0f && java.lang.Math.abs(f) >= ((float) i5));
            if (highSpeedVideoFpsRanges2 == -1) {
                return;
            }
            this.prefetchWindowStartLine--;
            this.getInputFormats -= highSpeedVideoFpsRanges2;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, int p1, int p2, int p3, int p4, float p5, int p6) {
        int i;
        int i2;
        if (p5 <= 0.0f) {
            this.getInputFormats = p4 - p3;
            this.prefetchWindowStartLine = p0;
            while (this.getInputFormats > 0 && (i2 = this.prefetchWindowStartLine) > 0 && this.getHighSpeedVideoFpsRanges.containsKey(i2 - 1)) {
                androidx.compose.foundation.lazy.layout.CachedItem cachedItem = this.getHighSpeedVideoFpsRanges.get(this.prefetchWindowStartLine - 1);
                kotlin.jvm.internal.Intrinsics.checkNotNull(cachedItem);
                this.prefetchWindowStartLine--;
                this.getInputFormats -= cachedItem.getMainAxisSize();
            }
            getHighSpeedVideoFpsRangesFor(0, this.prefetchWindowStartLine - 1);
            return;
        }
        this.getOutputFormats = p4 - p2;
        this.prefetchWindowEndLine = p1;
        while (this.getOutputFormats > 0 && (i = this.prefetchWindowEndLine) < p6 - 1 && this.getHighSpeedVideoFpsRanges.containsKey(i + 1)) {
            androidx.compose.foundation.lazy.layout.CachedItem cachedItem2 = this.getHighSpeedVideoFpsRanges.get(this.prefetchWindowEndLine + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cachedItem2);
            int mainAxisSize = cachedItem2.getMainAxisSize();
            this.prefetchWindowEndLine++;
            this.getOutputFormats -= mainAxisSize;
        }
        getHighSpeedVideoFpsRangesFor(this.prefetchWindowEndLine + 1, p6 - 1);
    }

    private final int getHighSpeedVideoFpsRanges(final androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, int i, boolean z) {
        java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> list;
        java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> list2;
        if (this.getHighSpeedVideoFpsRanges.containsKey(i)) {
            androidx.compose.foundation.lazy.layout.CachedItem cachedItem = this.getHighSpeedVideoFpsRanges.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cachedItem);
            return cachedItem.getMainAxisSize();
        }
        int i2 = 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(i)) {
            if (z && (list2 = this.getHighResolutionOutputSizeshNQ4ISI.get(i)) != null) {
                int size = list2.size();
                while (i2 < size) {
                    list2.get(i2).markAsUrgent();
                    i2++;
                }
            }
            return -1;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.set(i, cacheWindowScope.schedulePrefetch(i, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.CacheWindowLogic$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.CacheWindowLogic.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.CacheWindowLogic.this, cacheWindowScope, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
                return Camera2StreamConfigurationMap;
            }
        }));
        if (z && (list = this.getHighResolutionOutputSizeshNQ4ISI.get(i)) != null) {
            int size2 = list.size();
            while (i2 < size2) {
                list.get(i2).markAsUrgent();
                i2++;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.CacheWindowLogic cacheWindowLogic, androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, int i, int i2) {
        cacheWindowLogic.getHighSpeedVideoFpsRanges(cacheWindowScope, i, i2);
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighSpeedVideoSizes(int p0, int p1) {
        this.getHighSpeedVideoFpsRanges.set(p0, getHighSpeedVideoFpsRanges(p0, p1, androidx.compose.foundation.lazy.layout.CachedItem.INSTANCE));
        if (p0 > this.prefetchWindowEndLine) {
            this.prefetchWindowEndLine = p0;
            this.getOutputFormats -= p1;
        } else if (p0 < this.prefetchWindowStartLine) {
            this.prefetchWindowStartLine = p0;
            this.getInputFormats -= p1;
        }
    }

    private final androidx.compose.foundation.lazy.layout.CachedItem getHighSpeedVideoFpsRanges(int p0, int p1, java.lang.Object p2) {
        androidx.compose.foundation.lazy.layout.CachedItem cachedItem = this.getHighSpeedVideoFpsRanges.get(p0);
        if (cachedItem != null) {
            cachedItem.setMainAxisSize(p1);
            cachedItem.setKey(p2);
            return cachedItem;
        }
        return new androidx.compose.foundation.lazy.layout.CachedItem(androidx.compose.foundation.lazy.layout.CachedItem.INSTANCE, p1);
    }

    private final void getHighSpeedVideoFpsRanges(int p0, java.lang.Object p1, int p2) {
        if (this.getHighSpeedVideoFpsRanges.containsKey(p0)) {
            androidx.compose.foundation.lazy.layout.CachedItem cachedItem = this.getHighSpeedVideoFpsRanges.get(p0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cachedItem);
            int mainAxisSize = cachedItem.getMainAxisSize();
            androidx.compose.foundation.lazy.layout.CachedItem cachedItem2 = this.getHighSpeedVideoFpsRanges.get(p0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cachedItem2);
            java.lang.Object key = cachedItem2.getKey();
            if (mainAxisSize != p2 || !kotlin.jvm.internal.Intrinsics.areEqual(key, p1)) {
                this.getOutputMinFrameDurationlomOqCM = true;
            }
        }
        this.getHighSpeedVideoFpsRanges.set(p0, getHighSpeedVideoFpsRanges(p0, p2, p1));
        this.prefetchWindowStartLine = java.lang.Math.min(this.prefetchWindowStartLine, p0);
        this.prefetchWindowEndLine = java.lang.Math.max(this.prefetchWindowEndLine, p0);
        java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(p0);
        if (remove != null) {
            int size = remove.size();
            for (int i = 0; i < size; i++) {
                remove.get(i).cancel();
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, int p1) {
        int i;
        int i2;
        this.getHighSpeedVideoFpsRangesFor.clear();
        androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle>> mutableIntObjectMap = this.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr = mutableIntObjectMap.keys;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        char c = 7;
        long j = -9187201950435737472L;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j2 & 255) < 128 && p0 <= (i2 = iArr[(i3 << 3) + i5]) && i2 <= p1) {
                            this.getHighSpeedVideoFpsRangesFor.add(i2);
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                j = -9187201950435737472L;
            }
        }
        androidx.collection.MutableIntObjectMap<androidx.compose.foundation.lazy.layout.CachedItem> mutableIntObjectMap2 = this.getHighSpeedVideoFpsRanges;
        int[] iArr2 = mutableIntObjectMap2.keys;
        long[] jArr2 = mutableIntObjectMap2.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr2[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j3 & 255) < 128 && p0 <= (i = iArr2[(i6 << 3) + i8]) && i <= p1) {
                            this.getHighSpeedVideoFpsRangesFor.add(i);
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length2) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        androidx.collection.MutableIntSet mutableIntSet = this.getHighSpeedVideoFpsRangesFor;
        int[] iArr3 = mutableIntSet.elements;
        long[] jArr3 = mutableIntSet.metadata;
        int length3 = jArr3.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j4 = jArr3[i9];
            if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((j4 & 255) < 128) {
                        int i12 = iArr3[(i9 << 3) + i11];
                        java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(i12);
                        if (remove != null) {
                            int size = remove.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                remove.get(i13).cancel();
                            }
                        }
                        this.getHighSpeedVideoFpsRanges.remove(i12);
                    }
                    j4 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            }
            i9++;
            c = 7;
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, int i, int i2) {
        getHighSpeedVideoSizes(i, i2);
        Camera2StreamConfigurationMap(cacheWindowScope);
        getHighSpeedVideoSizes();
    }

    private final void Camera2StreamConfigurationMap(final androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope) {
        int i;
        if (java.lang.Math.signum(this.getOutputMinFrameDuration) <= 0.0f) {
            if (this.getOutputFormats > 0) {
                i = this.prefetchWindowEndLine + 1;
            }
            i = -1;
        } else {
            if (java.lang.Math.signum(this.getOutputMinFrameDuration) > 0.0f && this.getInputFormats > 0) {
                i = this.prefetchWindowStartLine - 1;
            }
            i = -1;
        }
        if (i <= 0 || cacheWindowScope.getLastIndexInLine(i) == -1 || cacheWindowScope.getLastIndexInLine(i) >= this.getOutputStallDurationlomOqCM) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.set(i, cacheWindowScope.schedulePrefetch(i, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.CacheWindowLogic$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.CacheWindowLogic.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.CacheWindowLogic.this, cacheWindowScope, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
                return highSpeedVideoSizes;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.CacheWindowLogic cacheWindowLogic, androidx.compose.foundation.lazy.layout.CacheWindowScope cacheWindowScope, int i, int i2) {
        cacheWindowLogic.getHighSpeedVideoFpsRanges(cacheWindowScope, i, i2);
        return kotlin.Unit.INSTANCE;
    }
}
