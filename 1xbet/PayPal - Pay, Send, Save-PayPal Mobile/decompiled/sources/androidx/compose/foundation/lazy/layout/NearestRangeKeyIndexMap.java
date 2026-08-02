package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "Lkotlin/ranges/IntRange;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervalContent", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "", "key", "", "getIndex", "(Ljava/lang/Object;)I", "index", "getKey", "(I)Ljava/lang/Object;", "Landroidx/collection/ObjectIntMap;", "getHighSpeedVideoSizes", "Landroidx/collection/ObjectIntMap;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRanges", "[Ljava/lang/Object;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NearestRangeKeyIndexMap implements androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.ObjectIntMap<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    public NearestRangeKeyIndexMap(kotlin.ranges.IntRange intRange, androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        androidx.compose.foundation.lazy.layout.IntervalList<?> intervals = lazyLayoutIntervalContent.getIntervals();
        final int first = intRange.getFirst();
        if (first < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("negative nearestRange.first");
        }
        final int min = java.lang.Math.min(intRange.getLast(), intervals.getSize() - 1);
        if (min < first) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.collection.ObjectIntMapKt.emptyObjectIntMap();
            this.Camera2StreamConfigurationMap = new java.lang.Object[0];
            this.getHighSpeedVideoFpsRangesFor = 0;
        } else {
            int i = (min - first) + 1;
            this.Camera2StreamConfigurationMap = new java.lang.Object[i];
            this.getHighSpeedVideoFpsRangesFor = first;
            final androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(i);
            intervals.forEach(first, min, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.getHighSpeedVideoFpsRanges(first, min, mutableObjectIntMap, this, (androidx.compose.foundation.lazy.layout.IntervalList.Interval) obj);
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = mutableObjectIntMap;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final kotlin.Unit getHighSpeedVideoFpsRanges(int i, int i2, androidx.collection.MutableObjectIntMap mutableObjectIntMap, androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap nearestRangeKeyIndexMap, androidx.compose.foundation.lazy.layout.IntervalList.Interval interval) {
        java.lang.Object defaultLazyLayoutKey;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> key = ((androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) interval.getValue()).getKey();
        int max = java.lang.Math.max(i, interval.getStartIndex());
        int min = java.lang.Math.min(i2, (interval.getStartIndex() + interval.getSize()) - 1);
        if (max <= min) {
            while (true) {
                if (key != null) {
                    defaultLazyLayoutKey = key.invoke(java.lang.Integer.valueOf(max - interval.getStartIndex()));
                }
                defaultLazyLayoutKey = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(max);
                mutableObjectIntMap.set(defaultLazyLayoutKey, max);
                nearestRangeKeyIndexMap.Camera2StreamConfigurationMap[max - nearestRangeKeyIndexMap.getHighSpeedVideoFpsRangesFor] = defaultLazyLayoutKey;
                if (max == min) {
                    break;
                }
                max++;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public final int getIndex(java.lang.Object key) {
        androidx.collection.ObjectIntMap<java.lang.Object> objectIntMap = this.getHighResolutionOutputSizeshNQ4ISI;
        int findKeyIndex = objectIntMap.findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return objectIntMap.values[findKeyIndex];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public final java.lang.Object getKey(int index) {
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = index - this.getHighSpeedVideoFpsRangesFor;
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }
}
