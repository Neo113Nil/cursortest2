package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00058\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "<init>", "()V", "", io.ktor.http.ContentDisposition.Parameters.Size, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "addInterval", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "block", "forEach", "(IILkotlin/jvm/functions/Function1;)V", "index", "get", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;I)Z", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", com.visa.cbp.getEncExpo.warmup, "getSize", "()I", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableIntervalList<T> implements androidx.compose.foundation.lazy.layout.IntervalList<T> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.IntervalList.Interval<T>> getHighSpeedVideoSizes = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.lazy.layout.IntervalList.Interval[16], 0);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends T> getHighSpeedVideoFpsRanges;
    private int size;

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final int getSize() {
        return this.size;
    }

    private final androidx.compose.foundation.lazy.layout.IntervalList.Interval<T> getHighResolutionOutputSizeshNQ4ISI(int p0) {
        int highSpeedVideoSizes;
        androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends T> interval = this.getHighSpeedVideoFpsRanges;
        if (interval != null && getHighSpeedVideoSizes(interval, p0)) {
            return interval;
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.IntervalList.Interval<T>> mutableVector = this.getHighSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.IntervalListKt.getHighSpeedVideoSizes(mutableVector, p0);
        androidx.compose.foundation.lazy.layout.IntervalList.Interval interval2 = (androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends T>) mutableVector.content[highSpeedVideoSizes];
        this.getHighSpeedVideoFpsRanges = interval2;
        return interval2;
    }

    private static boolean getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends T> interval, int i) {
        return i < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i;
    }

    public final void addInterval(int size, T value) {
        if (size < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("size should be >=0");
        }
        if (size == 0) {
            return;
        }
        androidx.compose.foundation.lazy.layout.IntervalList.Interval<T> interval = new androidx.compose.foundation.lazy.layout.IntervalList.Interval<>(getSize(), size, value);
        this.size = getSize() + size;
        this.getHighSpeedVideoSizes.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final void forEach(int fromIndex, int toIndex, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends T>, kotlin.Unit> block) {
        int highSpeedVideoSizes;
        if (fromIndex < 0 || fromIndex >= getSize()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(fromIndex);
            sb.append(", size ");
            sb.append(getSize());
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIndexOutOfBoundsException(sb.toString());
        }
        if (toIndex < 0 || toIndex >= getSize()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Index ");
            sb2.append(toIndex);
            sb2.append(", size ");
            sb2.append(getSize());
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIndexOutOfBoundsException(sb2.toString());
        }
        if (toIndex < fromIndex) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("toIndex (");
            sb3.append(toIndex);
            sb3.append(") should be not smaller than fromIndex (");
            sb3.append(fromIndex);
            sb3.append(')');
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb3.toString());
        }
        highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.IntervalListKt.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, fromIndex);
        int startIndex = this.getHighSpeedVideoSizes.content[highSpeedVideoSizes].getStartIndex();
        while (startIndex <= toIndex) {
            androidx.compose.foundation.lazy.layout.IntervalList.Interval<T> interval = this.getHighSpeedVideoSizes.content[highSpeedVideoSizes];
            block.invoke(interval);
            startIndex += interval.getSize();
            highSpeedVideoSizes++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final androidx.compose.foundation.lazy.layout.IntervalList.Interval<T> get(int index) {
        if (index < 0 || index >= getSize()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(index);
            sb.append(", size ");
            sb.append(getSize());
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIndexOutOfBoundsException(sb.toString());
        }
        return getHighResolutionOutputSizeshNQ4ISI(index);
    }
}
