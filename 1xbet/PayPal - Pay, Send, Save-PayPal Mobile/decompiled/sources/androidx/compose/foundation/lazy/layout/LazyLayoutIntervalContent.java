package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJB\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00062\"\u0010\u000f\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u000e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00028\u00010\rH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Interval", "", "<init>", "()V", "", "index", "getKey", "(I)Ljava/lang/Object;", "getContentType", "T", "globalIndex", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "block", "withInterval", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "getItemCount", "()I", "itemCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LazyLayoutIntervalContent<Interval extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval> {
    public static final int $stable = 0;

    public abstract androidx.compose.foundation.lazy.layout.IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final <T> T withInterval(int globalIndex, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super Interval, ? extends T> block) {
        androidx.compose.foundation.lazy.layout.IntervalList.Interval<Interval> interval = getIntervals().get(globalIndex);
        return block.invoke(java.lang.Integer.valueOf(globalIndex - interval.getStartIndex()), interval.getValue());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R'\u0010\u0007\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R'\u0010\t\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "getType", "type"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Interval {
        default kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> getKey() {
            return null;
        }

        default kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> getType() {
            return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return null;
                }
            };
        }
    }

    public final java.lang.Object getKey(int index) {
        java.lang.Object invoke;
        androidx.compose.foundation.lazy.layout.IntervalList.Interval<Interval> interval = getIntervals().get(index);
        int startIndex = interval.getStartIndex();
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> key = interval.getValue().getKey();
        return (key == null || (invoke = key.invoke(java.lang.Integer.valueOf(index - startIndex))) == null) ? androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(index) : invoke;
    }

    public final java.lang.Object getContentType(int index) {
        androidx.compose.foundation.lazy.layout.IntervalList.Interval<Interval> interval = getIntervals().get(index);
        return interval.getValue().getType().invoke(java.lang.Integer.valueOf(index - interval.getStartIndex()));
    }
}
