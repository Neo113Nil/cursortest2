package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0019\u0010\u0006\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012'\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eR-\u0010\u0006\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R;\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/pager/PagerIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerIntervalContent implements androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function4<androidx.compose.foundation.pager.PagerScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> item;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> key;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerIntervalContent(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        this.key = function1;
        this.item = function4;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> getKey() {
        return this.key;
    }

    public final kotlin.jvm.functions.Function4<androidx.compose.foundation.pager.PagerScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getItem() {
        return this.item;
    }
}
