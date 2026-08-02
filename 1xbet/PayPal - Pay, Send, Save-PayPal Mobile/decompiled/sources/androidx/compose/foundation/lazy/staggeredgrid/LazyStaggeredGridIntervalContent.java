package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\u0011\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0091\u0001\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u000b\u001a\u0015\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u0019\u0010\f\u001a\u0015\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0015\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042\u0019\u0010\u000e\u001a\u0015\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042'\u0010\u0017\u001a#\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkotlin/jvm/functions/Function3;)V", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "Lkotlin/ParameterName;", "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridIntervalContent extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> implements androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope {
    public static final int $stable = 8;
    private final androidx.compose.foundation.lazy.layout.MutableIntervalList<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> intervals = new androidx.compose.foundation.lazy.layout.MutableIntervalList<>();
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider spanProvider = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider(getIntervals());

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan getHighSpeedVideoSizes(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan staggeredGridItemSpan) {
        return staggeredGridItemSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj) {
        return obj;
    }

    public LazyStaggeredGridIntervalContent(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final androidx.compose.foundation.lazy.layout.IntervalList<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public final void item(final java.lang.Object key, final java.lang.Object contentType, final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan span, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        items(1, key != null ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object highSpeedVideoFpsRanges;
                java.lang.Object obj2 = key;
                ((java.lang.Integer) obj).intValue();
                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.getHighSpeedVideoFpsRanges(obj2);
                return highSpeedVideoFpsRanges;
            }
        } : null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object highSpeedVideoSizes;
                java.lang.Object obj2 = contentType;
                ((java.lang.Integer) obj).intValue();
                highSpeedVideoSizes = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.getHighSpeedVideoSizes(obj2);
                return highSpeedVideoSizes;
            }
        }, span != null ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan highSpeedVideoSizes;
                androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan staggeredGridItemSpan = androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan.this;
                ((java.lang.Integer) obj).intValue();
                highSpeedVideoSizes = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.getHighSpeedVideoSizes(staggeredGridItemSpan);
                return highSpeedVideoSizes;
            }
        } : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1062451479, true, new kotlin.jvm.functions.Function4() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                ((java.lang.Integer) obj2).intValue();
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3.this, (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope) obj, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3 function3, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope lazyStaggeredGridItemScope, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(lazyStaggeredGridItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 131) != 130, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1062451479, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:44)");
            }
            function3.invoke(lazyStaggeredGridItemScope, composer, java.lang.Integer.valueOf(i & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public final void items(int count, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> key, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> contentType, kotlin.jvm.functions.Function1<? super java.lang.Integer, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> span, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> itemContent) {
        getIntervals().addInterval(count, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval(key, contentType, span, itemContent));
    }
}
