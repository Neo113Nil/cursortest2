package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B|\u0012\u0019\u0010\u0006\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0019\u0010\u0007\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0019\u0010\t\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002\u0012\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011R-\u0010\u0006\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R-\u0010\u0007\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R-\u0010\t\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R6\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "key", "type", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "getType", "getSpan", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridInterval implements androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> item;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> key;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> span;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridInterval(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function1<? super java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function13, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        this.key = function1;
        this.type = function12;
        this.span = function13;
        this.item = function4;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> getType() {
        return this.type;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> getSpan() {
        return this.span;
    }

    public final kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getItem() {
        return this.item;
    }
}
