package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"rememberLazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "prefetchStrategy", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "(IILandroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "cacheWindow", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "EmptyLazyGridLayoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridStateKt {
    private static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult getHighSpeedVideoFpsRangesFor;

    /* renamed from: $r8$lambda$Oqcv3kxMGgB_Adt-gOCSPZ0MaPg, reason: not valid java name */
    public static /* synthetic */ int m1835$r8$lambda$Oqcv3kxMGgB_AdtgOCSPZ0MaPg(int i) {
        return -1;
    }

    public static final androidx.compose.foundation.lazy.grid.LazyGridState rememberLazyGridState(final int i, final int i2, androidx.compose.runtime.Composer composer, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:79)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.grid.LazyGridState, ?> saver = androidx.compose.foundation.lazy.grid.LazyGridState.INSTANCE.getSaver();
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.grid.LazyGridState highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.grid.LazyGridStateKt.getHighSpeedVideoFpsRanges(i, i2);
                    return highSpeedVideoFpsRanges;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState = (androidx.compose.foundation.lazy.grid.LazyGridState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.LazyGridState getHighSpeedVideoFpsRanges(int i, int i2) {
        return new androidx.compose.foundation.lazy.grid.LazyGridState(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.LazyGridState getHighResolutionOutputSizeshNQ4ISI(int i, int i2, androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        return new androidx.compose.foundation.lazy.grid.LazyGridState(i, i2, lazyGridPrefetchStrategy);
    }

    public static final androidx.compose.foundation.lazy.grid.LazyGridState rememberLazyGridState(final androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, final int i, final int i2, androidx.compose.runtime.Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1537306572, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:131)");
        }
        java.lang.Object[] objArr = {lazyLayoutCacheWindow};
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.grid.LazyGridState, ?> saver$foundation = androidx.compose.foundation.lazy.grid.LazyGridState.INSTANCE.saver$foundation(lazyLayoutCacheWindow);
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(lazyLayoutCacheWindow)) || (i3 & 6) == 4;
        boolean z3 = (((i3 & 112) ^ 48) > 32 && composer.changed(i)) || (i3 & 48) == 32;
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changed(i2)) && (i3 & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.grid.LazyGridState Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.grid.LazyGridStateKt.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow.this, i, i2);
                    return Camera2StreamConfigurationMap;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState = (androidx.compose.foundation.lazy.grid.LazyGridState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver$foundation, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.LazyGridState Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2) {
        return new androidx.compose.foundation.lazy.grid.LazyGridState(lazyLayoutCacheWindow, i, i2);
    }

    static {
        androidx.compose.ui.layout.MeasureResult measureResult = new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$1
            private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines = kotlin.collections.MapsKt.emptyMap();
            private final int height;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                return this.alignmentLines;
            }
        };
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
        androidx.compose.ui.layout.MeasureResult measureResult2 = measureResult;
        getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(null, 0, false, 0.0f, measureResult2, 0.0f, false, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE), androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List Camera2StreamConfigurationMap;
                ((java.lang.Integer) obj).intValue();
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.grid.LazyGridStateKt.Camera2StreamConfigurationMap();
                return Camera2StreamConfigurationMap;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(androidx.compose.foundation.lazy.grid.LazyGridStateKt.m1835$r8$lambda$Oqcv3kxMGgB_AdtgOCSPZ0MaPg(((java.lang.Integer) obj).intValue()));
            }
        }, emptyList, 0, 0, 0, false, orientation, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List Camera2StreamConfigurationMap() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final androidx.compose.foundation.lazy.grid.LazyGridState rememberLazyGridState(final int i, final int i2, final androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy lazyGridPrefetchStrategy, androidx.compose.runtime.Composer composer, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        boolean z = true;
        if ((i4 & 4) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(rememberedValue);
            }
            lazyGridPrefetchStrategy = (androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-20335728, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:103)");
        }
        java.lang.Object[] objArr = {lazyGridPrefetchStrategy};
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.grid.LazyGridState, ?> saver$foundation = androidx.compose.foundation.lazy.grid.LazyGridState.INSTANCE.saver$foundation(lazyGridPrefetchStrategy);
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4;
        boolean z3 = (((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32;
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changedInstance(lazyGridPrefetchStrategy)) && (i3 & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.grid.LazyGridState highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.grid.LazyGridStateKt.getHighResolutionOutputSizeshNQ4ISI(i, i2, lazyGridPrefetchStrategy);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState = (androidx.compose.foundation.lazy.grid.LazyGridState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver$foundation, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridState;
    }
}
