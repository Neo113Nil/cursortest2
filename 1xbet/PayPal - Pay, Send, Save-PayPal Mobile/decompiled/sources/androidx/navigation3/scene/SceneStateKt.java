package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\u0010\f\u001au\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f0\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\u0010\u0012\u001ab\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0014\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u00052\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f0\u0005H\u0002¨\u0006\u0019²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u008a\u0084\u0002"}, d2 = {"rememberSceneState", "Landroidx/navigation3/scene/SceneState;", "T", "", "entries", "", "Landroidx/navigation3/runtime/NavEntry;", "sceneStrategy", "Landroidx/navigation3/scene/SceneStrategy;", "onBack", "Lkotlin/Function0;", "", "(Ljava/util/List;Landroidx/navigation3/scene/SceneStrategy;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/navigation3/scene/SceneState;", "sceneStrategies", "sceneDecoratorStrategies", "Landroidx/navigation3/scene/SceneDecoratorStrategy;", "sharedTransitionScope", "Landroidx/compose/animation/SharedTransitionScope;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/animation/SharedTransitionScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/navigation3/scene/SceneState;", "provideScene", "Landroidx/navigation3/scene/Scene;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/navigation3/scene/SceneDecoratorStrategyScope;", "decoratedEntries", "sceneDecorators", "navigation3-ui", "currentOnBack"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SceneStateKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of rememberSceneState that supports sharedTransitionScope, sceneDecoratorStrategies, and list of SceneStrategies")
    public static final /* synthetic */ androidx.navigation3.scene.SceneState rememberSceneState(java.util.List list, androidx.navigation3.scene.SceneStrategy sceneStrategy, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-193177615, i, -1, "androidx.navigation3.scene.rememberSceneState (SceneState.kt:50)");
        }
        androidx.navigation3.scene.SceneState rememberSceneState = rememberSceneState(list, kotlin.collections.CollectionsKt.listOf(sceneStrategy), null, null, function0, composer, (i & 14) | 3072 | ((i << 6) & 57344), 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberSceneState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> androidx.navigation3.scene.SceneState<T> rememberSceneState(java.util.List<androidx.navigation3.runtime.NavEntry<T>> list, java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list2, java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list3, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.navigation3.scene.SharedEntryInSceneNavEntryDecorator rememberSharedEntryInSceneNavEntryDecorator;
        java.util.List<androidx.navigation3.runtime.NavEntry<T>> overlaidEntries;
        java.util.List<androidx.navigation3.runtime.NavEntry<T>> list4;
        if ((i2 & 4) != 0) {
            list3 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i2 & 8) != 0) {
            sharedTransitionScope = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1982736406, i, -1, "androidx.navigation3.scene.rememberSceneState (SceneState.kt:81)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, composer, (i >> 12) & 14);
        if (sharedTransitionScope == null) {
            composer.startReplaceGroup(-984503628);
            composer.endReplaceGroup();
            rememberSharedEntryInSceneNavEntryDecorator = null;
        } else {
            composer.startReplaceGroup(-984503627);
            rememberSharedEntryInSceneNavEntryDecorator = androidx.navigation3.scene.SharedEntryInSceneNavEntryDecoratorKt.rememberSharedEntryInSceneNavEntryDecorator(sharedTransitionScope, composer, 0);
            composer.endReplaceGroup();
        }
        int i3 = i & 14;
        java.util.List rememberDecoratedNavEntries = androidx.navigation3.runtime.DecoratedNavEntriesKt.rememberDecoratedNavEntries(list, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new androidx.navigation3.runtime.NavEntryDecorator[]{rememberSharedEntryInSceneNavEntryDecorator, androidx.navigation3.scene.SceneSetupNavEntryDecoratorKt.rememberSceneSetupNavEntryDecorator(composer, 0), androidx.navigation3.scene.BackStackAwareLifecycleNavEntryDecoratorKt.rememberBackStackAwareLifecycleNavEntryDecorator(list, composer, i3)}), composer, i3, 0);
        boolean changed = composer.changed(kotlin.collections.CollectionsKt.toList(list2));
        boolean changed2 = composer.changed(rememberDecoratedNavEntries);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.navigation3.scene.SceneDecoratorStrategyScope sceneDecoratorStrategyScope = new androidx.navigation3.scene.SceneDecoratorStrategyScope(new kotlin.jvm.functions.Function0() { // from class: androidx.navigation3.scene.SceneStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.navigation3.scene.SceneStateKt.m9237$r8$lambda$vTju2Qvq3ExygaLfxFA5PLGD7o(androidx.compose.runtime.State.this);
                }
            });
            java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(getHighSpeedVideoFpsRangesFor(sceneDecoratorStrategyScope, rememberDecoratedNavEntries, list2, list3));
            do {
                java.lang.Object last = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) mutableListOf);
                androidx.navigation3.scene.OverlayScene overlayScene = last instanceof androidx.navigation3.scene.OverlayScene ? (androidx.navigation3.scene.OverlayScene) last : null;
                overlaidEntries = overlayScene != null ? overlayScene.getOverlaidEntries() : null;
                if (overlaidEntries != null) {
                    if (overlaidEntries.isEmpty()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Overlaid entries from ");
                        sb.append(overlayScene);
                        sb.append(" must not be empty");
                        throw new java.lang.IllegalArgumentException(sb.toString().toString());
                    }
                    mutableListOf.add(getHighSpeedVideoFpsRangesFor(sceneDecoratorStrategyScope, overlaidEntries, list2, list3));
                }
            } while (overlaidEntries != null);
            java.util.List dropLast = kotlin.collections.CollectionsKt.dropLast(mutableListOf, 1);
            java.util.ArrayList arrayList = new java.util.ArrayList(dropLast.size());
            int size = dropLast.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.navigation3.scene.Scene scene = (androidx.navigation3.scene.Scene) dropLast.get(i4);
                kotlin.jvm.internal.Intrinsics.checkNotNull(scene, "");
                arrayList.add((androidx.navigation3.scene.OverlayScene) scene);
            }
            java.util.ArrayList arrayList2 = arrayList;
            androidx.navigation3.scene.Scene scene2 = (androidx.navigation3.scene.Scene) kotlin.collections.CollectionsKt.last(mutableListOf);
            java.util.List mutableListOf2 = kotlin.collections.CollectionsKt.mutableListOf(kotlin.collections.CollectionsKt.first(mutableListOf));
            do {
                androidx.navigation3.scene.Scene scene3 = (androidx.navigation3.scene.Scene) kotlin.collections.CollectionsKt.firstOrNull(mutableListOf2);
                java.util.List<androidx.navigation3.runtime.NavEntry<T>> previousEntries = scene3 != null ? scene3.getPreviousEntries() : null;
                list4 = previousEntries;
                if (list4 != null && !list4.isEmpty()) {
                    mutableListOf2.add(0, getHighSpeedVideoFpsRangesFor(sceneDecoratorStrategyScope, previousEntries, list2, list3));
                }
                if (list4 == null) {
                    break;
                }
            } while (!list4.isEmpty());
            mutableListOf2.remove(scene2);
            java.lang.Object sceneState = new androidx.navigation3.scene.SceneState(rememberDecoratedNavEntries, arrayList2, scene2, mutableListOf2);
            composer.updateRememberedValue(sceneState);
            rememberedValue = sceneState;
        }
        androidx.navigation3.scene.SceneState<T> sceneState2 = (androidx.navigation3.scene.SceneState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return sceneState2;
    }

    private static final <T> androidx.navigation3.scene.Scene<T> getHighSpeedVideoFpsRangesFor(androidx.navigation3.scene.SceneDecoratorStrategyScope<T> sceneDecoratorStrategyScope, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list, java.util.List<? extends androidx.navigation3.scene.SceneStrategy<T>> list2, java.util.List<? extends androidx.navigation3.scene.SceneDecoratorStrategy<T>> list3) {
        androidx.navigation3.scene.Scene<T> calculateSceneWithSinglePaneFallback = androidx.navigation3.scene.SinglePaneSceneKt.calculateSceneWithSinglePaneFallback(list2, sceneDecoratorStrategyScope, list);
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            androidx.navigation3.scene.SceneDecoratorStrategy<T> sceneDecoratorStrategy = list3.get(i);
            androidx.navigation3.scene.OverlayScene overlayScene = calculateSceneWithSinglePaneFallback instanceof androidx.navigation3.scene.OverlayScene ? (androidx.navigation3.scene.OverlayScene) calculateSceneWithSinglePaneFallback : null;
            calculateSceneWithSinglePaneFallback = overlayScene != null ? overlayScene : androidx.navigation3.scene.SinglePaneSceneKt.decorateScene(sceneDecoratorStrategy, sceneDecoratorStrategyScope, calculateSceneWithSinglePaneFallback);
        }
        return calculateSceneWithSinglePaneFallback;
    }

    /* renamed from: $r8$lambda$vTju2Qvq3ExygaL-fxFA5PLGD7o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9237$r8$lambda$vTju2Qvq3ExygaLfxFA5PLGD7o(androidx.compose.runtime.State state) {
        ((kotlin.jvm.functions.Function0) state.getValue()).invoke();
        return kotlin.Unit.INSTANCE;
    }
}
