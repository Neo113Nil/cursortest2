package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "<init>", "()V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "addInterval", "(II)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "interval", "", "removeInterval", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;)V", "", "hasIntervals", "()Z", "Landroidx/compose/runtime/collection/MutableVector;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRanges", "getStart", "()I", "getEnd", "Interval"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = androidx.compose.runtime.collection.MutableVector.$stable;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval> getHighSpeedVideoFpsRanges = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval[16], 0);

    public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval addInterval(int start, int end) {
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval interval = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval(start, end);
        this.getHighSpeedVideoFpsRanges.add(interval);
        return interval;
    }

    public final void removeInterval(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval interval) {
        this.getHighSpeedVideoFpsRanges.remove(interval);
    }

    public final boolean hasIntervals() {
        return this.getHighSpeedVideoFpsRanges.getSize() != 0;
    }

    public final int getStart() {
        int start = this.getHighSpeedVideoFpsRanges.first().getStart();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval> mutableVector = this.getHighSpeedVideoFpsRanges;
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval interval = intervalArr[i];
            if (interval.getStart() < start) {
                start = interval.getStart();
            }
        }
        if (start < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative minIndex");
        }
        return start;
    }

    public final int getEnd() {
        int end = this.getHighSpeedVideoFpsRanges.first().getEnd();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval> mutableVector = this.getHighSpeedVideoFpsRanges;
        androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval interval = intervalArr[i];
            if (interval.getEnd() > end) {
                end = interval.getEnd();
            }
        }
        return end;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStart", "getEnd"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Interval(int i, int i2) {
            this.start = i;
            this.end = i2;
            if (i < 0) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative start index");
            }
            if (i2 >= i) {
                return;
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("end index greater than start");
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interval(start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.start) * 31) + java.lang.Integer.hashCode(this.end);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval)) {
                return false;
            }
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval interval = (androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval copy(int start, int end) {
            return new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval(start, end);
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public static /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval copy$default(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval interval, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = interval.start;
            }
            if ((i3 & 2) != 0) {
                i2 = interval.end;
            }
            return interval.copy(i, i2);
        }
    }
}
