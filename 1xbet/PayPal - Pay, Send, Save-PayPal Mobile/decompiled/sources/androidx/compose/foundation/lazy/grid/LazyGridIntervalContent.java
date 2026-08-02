package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 52\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00015B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\\\u0010\u0012\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0097\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u000b\u001a\u0015\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u001f\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017¢\u0006\u0002\b\u00062\u0019\u0010\u000f\u001a\u0015\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042'\u0010\u0018\u001a#\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001b\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b2\u00103"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "item", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "Lkotlin/ParameterName;", "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider$foundation", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "", "hasCustomSpans", "Z", "getHasCustomSpans$foundation", "()Z", "setHasCustomSpans$foundation", "(Z)V", "Landroidx/collection/MutableIntList;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "getHeaderIndexes", "()Landroidx/collection/IntList;", "headerIndexes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridIntervalContent extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<androidx.compose.foundation.lazy.grid.LazyGridInterval> implements androidx.compose.foundation.lazy.grid.LazyGridScope {
    private androidx.collection.MutableIntList getHighSpeedVideoFpsRangesFor;
    private boolean hasCustomSpans;
    private static final androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.Companion Companion = new androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, java.lang.Integer, androidx.compose.foundation.lazy.grid.GridItemSpan> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            androidx.compose.foundation.lazy.grid.GridItemSpan highSpeedVideoSizes;
            ((java.lang.Integer) obj2).intValue();
            highSpeedVideoSizes = androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    };
    private final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider spanLayoutProvider = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider(this);
    private final androidx.compose.foundation.lazy.layout.MutableIntervalList<androidx.compose.foundation.lazy.grid.LazyGridInterval> intervals = new androidx.compose.foundation.lazy.layout.MutableIntervalList<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        return obj;
    }

    public LazyGridIntervalContent(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> function1) {
        function1.invoke(this);
    }

    /* renamed from: getSpanLayoutProvider$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final androidx.compose.foundation.lazy.layout.IntervalList<androidx.compose.foundation.lazy.grid.LazyGridInterval> getIntervals() {
        return this.intervals;
    }

    /* renamed from: getHasCustomSpans$foundation, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final void setHasCustomSpans$foundation(boolean z) {
        this.hasCustomSpans = z;
    }

    public final androidx.collection.IntList getHeaderIndexes() {
        androidx.collection.MutableIntList mutableIntList = this.getHighSpeedVideoFpsRangesFor;
        return mutableIntList != null ? mutableIntList : androidx.collection.IntListKt.emptyIntList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public final void item(final java.lang.Object key, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, androidx.compose.foundation.lazy.grid.GridItemSpan> span, final java.lang.Object contentType, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        getIntervals().addInterval(1, new androidx.compose.foundation.lazy.grid.LazyGridInterval(key != null ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj2 = key;
                ((java.lang.Integer) obj).intValue();
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.getHighResolutionOutputSizeshNQ4ISI(obj2);
                return highResolutionOutputSizeshNQ4ISI;
            }
        } : null, span != null ? new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                androidx.compose.foundation.lazy.grid.GridItemSpan highSpeedVideoSizes;
                ((java.lang.Integer) obj2).intValue();
                highSpeedVideoSizes = androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, (androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope) obj);
                return highSpeedVideoSizes;
            }
        } : getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object highSpeedVideoFpsRanges;
                java.lang.Object obj2 = contentType;
                ((java.lang.Integer) obj).intValue();
                highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.getHighSpeedVideoFpsRanges(obj2);
                return highSpeedVideoFpsRanges;
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-291643851, true, new kotlin.jvm.functions.Function4() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                ((java.lang.Integer) obj2).intValue();
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3.this, (androidx.compose.foundation.lazy.grid.LazyGridItemScope) obj, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        })));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.GridItemSpan getHighSpeedVideoSizes(kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope) {
        return (androidx.compose.foundation.lazy.grid.GridItemSpan) function1.invoke(lazyGridItemSpanScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3 function3, androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(lazyGridItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 131) != 130, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-291643851, i, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:55)");
            }
            function3.invoke(lazyGridItemScope, composer, java.lang.Integer.valueOf(i & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public final void items(int count, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> key, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super java.lang.Integer, androidx.compose.foundation.lazy.grid.GridItemSpan> span, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> contentType, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> itemContent) {
        getIntervals().addInterval(count, new androidx.compose.foundation.lazy.grid.LazyGridInterval(key, span == null ? getHighSpeedVideoFpsRanges : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public final void stickyHeader(java.lang.Object key, java.lang.Object contentType, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        androidx.collection.MutableIntList mutableIntList = this.getHighSpeedVideoFpsRangesFor;
        if (mutableIntList == null) {
            mutableIntList = new androidx.collection.MutableIntList(0, 1, null);
            this.getHighSpeedVideoFpsRangesFor = mutableIntList;
        }
        final int size = getIntervals().getSize();
        mutableIntList.add(size);
        item(key, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.lazy.grid.GridItemSpan highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, contentType, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(46791243, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function4.this, size, (androidx.compose.foundation.lazy.grid.LazyGridItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.GridItemSpan getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope lazyGridItemSpanScope) {
        return androidx.compose.foundation.lazy.grid.GridItemSpan.m1803boximpl(androidx.compose.foundation.lazy.grid.LazyGridSpanKt.GridItemSpan(lazyGridItemSpanScope.getMaxLineSpan()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function4 function4, int i, androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, androidx.compose.runtime.Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.changed(lazyGridItemScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(46791243, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
            }
            function4.invoke(lazyGridItemScope, java.lang.Integer.valueOf(i), composer, java.lang.Integer.valueOf(i2 & 14));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b8\u0006¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$Companion;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.GridItemSpan getHighSpeedVideoSizes() {
        return androidx.compose.foundation.lazy.grid.GridItemSpan.m1803boximpl(androidx.compose.foundation.lazy.grid.LazyGridSpanKt.GridItemSpan(1));
    }
}
