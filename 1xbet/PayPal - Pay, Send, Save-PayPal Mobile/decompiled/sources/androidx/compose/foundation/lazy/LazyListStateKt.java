package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"rememberLazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "prefetchStrategy", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "(IILandroidx/compose/foundation/lazy/LazyListPrefetchStrategy;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "cacheWindow", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "EmptyLazyListMeasureResult", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "NumberOfItemsToTeleport", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListStateKt {
    private static final androidx.compose.foundation.lazy.LazyListMeasureResult getHighResolutionOutputSizeshNQ4ISI;

    public static final androidx.compose.foundation.lazy.LazyListState rememberLazyListState(final int i, final int i2, androidx.compose.runtime.Composer composer, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1470655220, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:78)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.LazyListState, ?> saver = androidx.compose.foundation.lazy.LazyListState.INSTANCE.getSaver();
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.LazyListState Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyListStateKt.Camera2StreamConfigurationMap(i, i2);
                    return Camera2StreamConfigurationMap;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.LazyListState lazyListState = (androidx.compose.foundation.lazy.LazyListState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.LazyListState Camera2StreamConfigurationMap(int i, int i2) {
        return new androidx.compose.foundation.lazy.LazyListState(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoSizes(int i, int i2, androidx.compose.foundation.lazy.LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        return new androidx.compose.foundation.lazy.LazyListState(i, i2, lazyListPrefetchStrategy);
    }

    public static final androidx.compose.foundation.lazy.LazyListState rememberLazyListState(final androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, final int i, final int i2, androidx.compose.runtime.Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1588550476, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:130)");
        }
        java.lang.Object[] objArr = {lazyLayoutCacheWindow};
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.LazyListState, ?> saver$foundation = androidx.compose.foundation.lazy.LazyListState.INSTANCE.saver$foundation(lazyLayoutCacheWindow);
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(lazyLayoutCacheWindow)) || (i3 & 6) == 4;
        boolean z3 = (((i3 & 112) ^ 48) > 32 && composer.changed(i)) || (i3 & 48) == 32;
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changed(i2)) && (i3 & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.LazyListState highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyListStateKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow.this, i, i2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.LazyListState lazyListState = (androidx.compose.foundation.lazy.LazyListState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver$foundation, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.LazyListState getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2) {
        return new androidx.compose.foundation.lazy.LazyListState(lazyLayoutCacheWindow, i, i2);
    }

    static {
        androidx.compose.ui.layout.MeasureResult measureResult = new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$EmptyLazyListMeasureResult$1
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
        int i = 0;
        boolean z = false;
        androidx.compose.ui.layout.MeasureResult measureResult2 = measureResult;
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.lazy.LazyListMeasureResult(lazyListMeasuredItem, i, z, f, measureResult2, f2, z2, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE), androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), kotlin.collections.CollectionsKt.emptyList(), 0, 0, 0, false, androidx.compose.foundation.gestures.Orientation.Vertical, 0, 0, null);
    }

    public static final androidx.compose.foundation.lazy.LazyListState rememberLazyListState(final int i, final int i2, final androidx.compose.foundation.lazy.LazyListPrefetchStrategy lazyListPrefetchStrategy, androidx.compose.runtime.Composer composer, int i3, int i4) {
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
                rememberedValue = androidx.compose.foundation.lazy.LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
                composer.updateRememberedValue(rememberedValue);
            }
            lazyListPrefetchStrategy = (androidx.compose.foundation.lazy.LazyListPrefetchStrategy) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1287535208, i3, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:102)");
        }
        java.lang.Object[] objArr = {lazyListPrefetchStrategy};
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.LazyListState, ?> saver$foundation = androidx.compose.foundation.lazy.LazyListState.INSTANCE.saver$foundation(lazyListPrefetchStrategy);
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4;
        boolean z3 = (((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32;
        if ((((i3 & 896) ^ 384) <= 256 || !composer.changedInstance(lazyListPrefetchStrategy)) && (i3 & 384) != 256) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.LazyListState highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.lazy.LazyListStateKt.getHighSpeedVideoSizes(i, i2, lazyListPrefetchStrategy);
                    return highSpeedVideoSizes;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.foundation.lazy.LazyListState lazyListState = (androidx.compose.foundation.lazy.LazyListState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver$foundation, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyListState;
    }
}
