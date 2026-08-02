package androidx.compose.foundation.lazy.staggeredgrid;

@androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScopeMarker
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001JQ\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\f\u0010\rJ\u0097\u0001\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u001b\b\u0002\u0010\u0002\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u001b\b\u0002\u0010\u0003\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062'\u0010\u0012\u001a#\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "key", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkotlin/jvm/functions/Function3;)V", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "Lkotlin/ParameterName;", "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {
    void item(java.lang.Object key, java.lang.Object contentType, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan span, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content);

    void items(int count, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> key, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> contentType, kotlin.jvm.functions.Function1<? super java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> span, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> itemContent);

    static /* synthetic */ void item$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.lang.Object obj, java.lang.Object obj2, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan staggeredGridItemSpan, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj3) {
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, function3);
    }

    static /* synthetic */ void items$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function4 function4, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        kotlin.jvm.functions.Function1 function14 = (i2 & 2) != 0 ? null : function1;
        if ((i2 & 4) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$items$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return null;
                }
            };
        }
        lazyStaggeredGridScope.items(i, function14, function12, (i2 & 8) != 0 ? null : function13, function4);
    }
}
