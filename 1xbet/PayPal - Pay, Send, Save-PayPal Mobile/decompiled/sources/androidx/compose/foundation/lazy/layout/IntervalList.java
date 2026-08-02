package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0012J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", "T", "", "", "index", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "get", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "fromIndex", "toIndex", "Lkotlin/Function1;", "", "block", "forEach", "(IILkotlin/jvm/functions/Function1;)V", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IntervalList<T> {
    void forEach(int fromIndex, int toIndex, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends T>, kotlin.Unit> block);

    androidx.compose.foundation.lazy.layout.IntervalList.Interval<T> get(int index);

    int getSize();

    static /* synthetic */ void forEach$default(androidx.compose.foundation.lazy.layout.IntervalList intervalList, int i, int i2, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = intervalList.getSize() - 1;
        }
        intervalList.forEach(i, i2, function1);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "T", "", "", "startIndex", io.ktor.http.ContentDisposition.Parameters.Size, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(IILjava/lang/Object;)V", com.visa.cbp.getEncExpo.warmup, "getStartIndex", "()I", "getSize", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Interval<T> {
        public static final int $stable = 0;
        private final int size;
        private final int startIndex;
        private final T value;

        public Interval(int i, int i2, T t) {
            this.startIndex = i;
            this.size = i2;
            this.value = t;
            if (i < 0) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("startIndex should be >= 0");
            }
            if (i2 > 0) {
                return;
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("size should be > 0");
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final int getSize() {
            return this.size;
        }

        public final T getValue() {
            return this.value;
        }
    }
}
