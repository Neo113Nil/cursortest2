package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "rememberStaggeredGridItemProviderLambda", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridItemProviderKt {
    public static final kotlin.jvm.functions.Function0<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(690901732, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:37)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i & 6) == 4;
        kotlin.jvm.internal.PropertyReference0Impl rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            final androidx.compose.runtime.State derivedStateOf = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.State.this);
                    return highSpeedVideoFpsRanges;
                }
            });
            final androidx.compose.runtime.State derivedStateOf2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.referentialEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.Camera2StreamConfigurationMap(androidx.compose.runtime.State.this, lazyStaggeredGridState);
                    return Camera2StreamConfigurationMap;
                }
            });
            rememberedValue = new kotlin.jvm.internal.PropertyReference0Impl(derivedStateOf2) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return ((androidx.compose.runtime.State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.reflect.KProperty0 kProperty0 = (kotlin.reflect.KProperty0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kProperty0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent getHighSpeedVideoFpsRanges(androidx.compose.runtime.State state) {
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent((kotlin.jvm.functions.Function1) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl Camera2StreamConfigurationMap(androidx.compose.runtime.State state, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent) state.getValue();
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl(lazyStaggeredGridState, lazyStaggeredGridIntervalContent, new androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap(lazyStaggeredGridState.getNearestRange$foundation(), lazyStaggeredGridIntervalContent));
    }
}
