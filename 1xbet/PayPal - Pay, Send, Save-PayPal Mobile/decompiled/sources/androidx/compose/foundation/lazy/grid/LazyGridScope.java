package androidx.compose.foundation.lazy.grid;

@androidx.compose.foundation.lazy.grid.LazyGridScopeMarker
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001Jb\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ¢\u0001\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u001b\b\u0002\u0010\u0002\u001a\u0015\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032&\b\u0002\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\u0002\b\u00062\u001b\b\u0002\u0010\b\u001a\u0015\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032'\u0010\u0013\u001a#\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0001\u0001\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "span", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "Lkotlin/ParameterName;", "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyGridScope {
    void item(java.lang.Object key, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, androidx.compose.foundation.lazy.grid.GridItemSpan> span, java.lang.Object contentType, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content);

    void items(int count, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> key, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super java.lang.Integer, androidx.compose.foundation.lazy.grid.GridItemSpan> span, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> contentType, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> itemContent);

    void stickyHeader(java.lang.Object key, java.lang.Object contentType, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void item$default(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, java.lang.Object obj2, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj3) {
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, function1, obj2, function3);
    }

    static /* synthetic */ void items$default(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function4 function4, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        kotlin.jvm.functions.Function1 function13 = (i2 & 2) != 0 ? null : function1;
        kotlin.jvm.functions.Function2 function22 = (i2 & 4) != 0 ? null : function2;
        if ((i2 & 8) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope$items$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(i, function13, function22, function12, function4);
    }

    static /* synthetic */ void stickyHeader$default(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj3) {
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyGridScope.stickyHeader(obj, obj2, function4);
    }
}
