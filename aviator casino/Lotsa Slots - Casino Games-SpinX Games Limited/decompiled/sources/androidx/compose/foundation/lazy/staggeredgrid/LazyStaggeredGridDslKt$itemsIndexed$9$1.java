package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridDsl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "T", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$9$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$9$1(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function2, T[] tArr) {
        super(1);
        this.$span = function2;
        this.$items = tArr;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan invoke(int i) {
        return this.$span.invoke(java.lang.Integer.valueOf(i), this.$items[i]);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }
}
