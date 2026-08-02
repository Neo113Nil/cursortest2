package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CrossfadeKt$Crossfade$5$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ T $Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Transition<T> $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<T, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> $getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        getHighSpeedVideoFpsRanges(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, int i) {
        java.lang.Object currentState;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-934471669, i, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
        }
        final androidx.compose.animation.core.Transition<T> transition = this.$getHighResolutionOutputSizeshNQ4ISI;
        final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = this.$getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<T>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.Segment<T> segment, androidx.compose.runtime.Composer composer2, int i2) {
                composer2.startReplaceGroup(955869654);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(955869654, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
                }
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec2 = finiteAnimationSpec;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return finiteAnimationSpec2;
            }

            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                return getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.Transition.Segment) obj, composer2, num.intValue());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        };
        T t = this.$Camera2StreamConfigurationMap;
        androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean changed = composer.changed(transition);
            currentState = composer.rememberedValue();
            if (changed || currentState == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    java.lang.Object currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (java.lang.Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(1378811975);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f = kotlin.jvm.internal.Intrinsics.areEqual(currentState, t) ? 1.0f : 0.0f;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        boolean changed2 = composer.changed(transition);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$invoke$$inlined$animateFloat$1
                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    return (T) androidx.compose.animation.core.Transition.this.getTargetState();
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        java.lang.Object value = ((androidx.compose.runtime.State) rememberedValue).getValue();
        composer.startReplaceGroup(1378811975);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f2 = kotlin.jvm.internal.Intrinsics.areEqual(value, t) ? 1.0f : 0.0f;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        boolean changed3 = composer.changed(transition);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.animation.core.Transition.Segment<T>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$invoke$$inlined$animateFloat$2
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.animation.core.Transition.Segment<T> invoke() {
                    return androidx.compose.animation.core.Transition.this.getSegment();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.runtime.State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), (androidx.compose.animation.core.FiniteAnimationSpec) function3.invoke(((androidx.compose.runtime.State) rememberedValue2).getValue(), composer, 0), vectorConverter, "FloatAnimation", composer, 0);
        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
        boolean changed4 = composer.changed(createTransitionAnimation);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    float Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.animation.CrossfadeKt$Crossfade$5$1.Camera2StreamConfigurationMap(createTransitionAnimation);
                    graphicsLayerScope.setAlpha(Camera2StreamConfigurationMap);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    getHighSpeedVideoFpsRangesFor(graphicsLayerScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion2, (kotlin.jvm.functions.Function1) rememberedValue3);
        kotlin.jvm.functions.Function3<T, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = this.$getHighSpeedVideoFpsRangesFor;
        T t2 = this.$Camera2StreamConfigurationMap;
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, graphicsLayer);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        function32.invoke(t2, composer, 0);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CrossfadeKt$Crossfade$5$1(androidx.compose.animation.core.Transition<T> transition, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, T t, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        super(2);
        this.$getHighResolutionOutputSizeshNQ4ISI = transition;
        this.$getHighSpeedVideoSizes = finiteAnimationSpec;
        this.$Camera2StreamConfigurationMap = t;
        this.$getHighSpeedVideoFpsRangesFor = function3;
    }
}
