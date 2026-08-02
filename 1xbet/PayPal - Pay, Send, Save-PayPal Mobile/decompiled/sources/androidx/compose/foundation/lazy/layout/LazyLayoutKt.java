package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aP\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"LazyLayout", "", "itemProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "MaxItemsToRetainForReuse", "", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use overload with LazyLayoutMeasurePolicy")
    public static final /* synthetic */ void LazyLayout(final kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, final kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2002163445);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2002163445, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:68)");
            }
            LazyLayout((kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider>) function0, modifier, lazyLayoutPrefetchState, new androidx.compose.foundation.lazy.layout.LazyLayoutKt$sam$androidx_compose_foundation_lazy_layout_LazyLayoutMeasurePolicy$0(function2), startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutKt.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0.this, modifier2, lazyLayoutPrefetchState2, function2, i, i2, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    public static final void LazyLayout(final kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> function0, final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, final androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1055276397);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(lazyLayoutMeasurePolicy) : startRestartGroup.changedInstance(lazyLayoutMeasurePolicy) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1055276397, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, i3 & 14);
            androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.LazySaveableStateHolderProvider(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-933153643, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutKt.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this, modifier, lazyLayoutMeasurePolicy, rememberUpdatedState, (androidx.compose.runtime.saveable.SaveableStateHolder) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return Camera2StreamConfigurationMap;
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.layout.LazyLayoutKt.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0.this, modifier2, lazyLayoutPrefetchState2, lazyLayoutMeasurePolicy, i, i2, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state) {
        return (androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider) ((kotlin.jvm.functions.Function0) state.getValue()).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult Camera2StreamConfigurationMap(final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory, androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState, androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler) {
        lazyLayoutPrefetchState.setPrefetchHandleProvider$foundation(new androidx.compose.foundation.lazy.layout.PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler));
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$lambda$1$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.lazy.layout.PrefetchHandleProvider prefetchHandleProvider = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this.getPrefetchHandleProvider();
                if (prefetchHandleProvider != null) {
                    prefetchHandleProvider.onDisposed();
                }
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this.setPrefetchHandleProvider$foundation(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory, androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
        return lazyLayoutMeasurePolicy.mo1785measure0kLqBqw(new androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), constraints.getGetHighSpeedVideoFpsRangesFor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, final androidx.compose.runtime.State state, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-933153643, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory(saveableStateHolder, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.layout.LazyLayoutKt.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this);
                    return highSpeedVideoFpsRangesFor;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.ui.layout.SubcomposeLayoutState(new androidx.compose.foundation.lazy.layout.LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState = (androidx.compose.ui.layout.SubcomposeLayoutState) rememberedValue2;
        if (lazyLayoutPrefetchState != null) {
            composer.startReplaceGroup(1743490539);
            final androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler = lazyLayoutPrefetchState.getPrefetchScheduler();
            if (prefetchScheduler == null) {
                composer.startReplaceGroup(887527095);
                prefetchScheduler = androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer, 0);
            } else {
                composer.startReplaceGroup(887526010);
            }
            composer.endReplaceGroup();
            java.lang.Object[] objArr = {lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler};
            boolean changed = composer.changed(lazyLayoutPrefetchState);
            boolean changedInstance = composer.changedInstance(lazyLayoutItemContentFactory);
            boolean changedInstance2 = composer.changedInstance(subcomposeLayoutState);
            boolean changedInstance3 = composer.changedInstance(prefetchScheduler);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed | changedInstance | changedInstance2 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.runtime.DisposableEffectResult Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutKt.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.this, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler);
                        return Camera2StreamConfigurationMap;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(objArr, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, composer, 0);
        } else {
            composer.startReplaceGroup(1737291469);
        }
        composer.endReplaceGroup();
        androidx.compose.ui.Modifier traversablePrefetchState = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchStateKt.traversablePrefetchState(modifier, lazyLayoutPrefetchState);
        boolean changed2 = composer.changed(lazyLayoutItemContentFactory);
        boolean changed3 = composer.changed(lazyLayoutMeasurePolicy);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changed2 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.ui.layout.MeasureResult highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.layout.LazyLayoutKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.this, lazyLayoutMeasurePolicy, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, traversablePrefetchState, (kotlin.jvm.functions.Function2) rememberedValue4, composer, androidx.compose.ui.layout.SubcomposeLayoutState.$stable, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyLayout((kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider>) function0, modifier, lazyLayoutPrefetchState, lazyLayoutMeasurePolicy, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyLayout(function0, modifier, lazyLayoutPrefetchState, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
