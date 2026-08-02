package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001Bf\u0012\u0019\u0010\u0006\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0019\u0010\u0007\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012'\u0010\r\u001a#\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fR-\u0010\u0006\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R;\u0010\r\u001a#\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "key", "type", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "getType", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListInterval implements androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> item;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> key;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListInterval(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        this.key = function1;
        this.type = function12;
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

    public final kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getItem() {
        return this.item;
    }
}
