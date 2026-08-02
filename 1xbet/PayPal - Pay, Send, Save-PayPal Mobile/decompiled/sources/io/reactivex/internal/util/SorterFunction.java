package io.reactivex.internal.util;

/* loaded from: classes3.dex */
public final class SorterFunction<T> implements io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> {
    final java.util.Comparator<? super T> getHighSpeedVideoFpsRanges;

    public SorterFunction(java.util.Comparator<? super T> comparator) {
        this.getHighSpeedVideoFpsRanges = comparator;
    }

    @Override // io.reactivex.functions.Function
    public final java.util.List<T> apply(java.util.List<T> list) throws java.lang.Exception {
        java.util.Collections.sort(list, this.getHighSpeedVideoFpsRanges);
        return list;
    }
}
