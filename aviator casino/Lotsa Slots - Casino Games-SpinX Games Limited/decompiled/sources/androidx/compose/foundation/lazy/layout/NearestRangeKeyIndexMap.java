package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutKeyIndexMap.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "nearestRange", "Lkotlin/ranges/IntRange;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "", "[Ljava/lang/Object;", "keysStartIndex", "", "map", "Landroidx/collection/ObjectIntMap;", "getIndex", com.ironsource.X3.i.W, "getKey", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap {
    public static final int $stable = 8;
    private final java.lang.Object[] keys;
    private final int keysStartIndex;
    private final androidx.collection.ObjectIntMap<java.lang.Object> map;

    public NearestRangeKeyIndexMap(kotlin.ranges.IntRange intRange, androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        androidx.compose.foundation.lazy.layout.IntervalList<?> intervals = lazyLayoutIntervalContent.getIntervals();
        final int first = intRange.getFirst();
        if (first < 0) {
            throw new java.lang.IllegalStateException("negative nearestRange.first".toString());
        }
        final int min = java.lang.Math.min(intRange.getLast(), intervals.getSize() - 1);
        if (min < first) {
            this.map = androidx.collection.ObjectIntMapKt.emptyObjectIntMap();
            this.keys = new java.lang.Object[0];
            this.keysStartIndex = 0;
        } else {
            int i = (min - first) + 1;
            this.keys = new java.lang.Object[i];
            this.keysStartIndex = first;
            final androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(i);
            intervals.forEach(first, min, new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval>, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval> interval) {
                    invoke2(interval);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
                
                    if (r3 == null) goto L7;
                 */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke2(androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval> interval) {
                    java.lang.Object defaultLazyLayoutKey;
                    java.lang.Object[] objArr;
                    int i2;
                    kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> key = interval.getValue().getKey();
                    int max = java.lang.Math.max(first, interval.getStartIndex());
                    int min2 = java.lang.Math.min(min, (interval.getStartIndex() + interval.getSize()) - 1);
                    if (max > min2) {
                        return;
                    }
                    while (true) {
                        if (key != null) {
                            defaultLazyLayoutKey = key.invoke(java.lang.Integer.valueOf(max - interval.getStartIndex()));
                        }
                        defaultLazyLayoutKey = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(max);
                        mutableObjectIntMap.set(defaultLazyLayoutKey, max);
                        objArr = this.keys;
                        i2 = this.keysStartIndex;
                        objArr[max - i2] = defaultLazyLayoutKey;
                        if (max == min2) {
                            return;
                        } else {
                            max++;
                        }
                    }
                }
            });
            this.map = mutableObjectIntMap;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(java.lang.Object key) {
        androidx.collection.ObjectIntMap<java.lang.Object> objectIntMap = this.map;
        int findKeyIndex = objectIntMap.findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return objectIntMap.values[findKeyIndex];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public java.lang.Object getKey(int index) {
        java.lang.Object[] objArr = this.keys;
        int i = index - this.keysStartIndex;
        if (i < 0 || i > kotlin.collections.ArraysKt.getLastIndex(objArr)) {
            return null;
        }
        return objArr[i];
    }
}
