package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ float getInputFormats;
    final /* synthetic */ float getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-827388388, intValue, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:464)");
            }
            final androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Float.valueOf(this.getHighSpeedVideoSizes ? 1.0f : 0.0f), "expanded state", composer2, 48, 0);
            final androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial, composer2, 6);
            final androidx.compose.animation.core.FiniteAnimationSpec value2 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, composer2, 6);
            kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<java.lang.Float>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<java.lang.Float> segment, androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    composer4.startReplaceGroup(-1114419602);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1114419602, intValue2, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
                    }
                    androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer4.endReplaceGroup();
                    return finiteAnimationSpec;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            float floatValue = ((java.lang.Number) updateTransition.getCurrentState()).floatValue();
            composer2.startReplaceGroup(-157343033);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer2.endReplaceGroup();
            float floatValue2 = ((java.lang.Number) updateTransition.getTargetState()).floatValue();
            composer2.startReplaceGroup(-157343033);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer2.endReplaceGroup();
            final androidx.compose.runtime.State createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue2), (androidx.compose.animation.core.FiniteAnimationSpec) function3.invoke(updateTransition.getSegment(), composer2, 0), vectorConverter, "FloatAnimation", composer2, 0);
            kotlin.jvm.functions.Function3 function32 = new kotlin.jvm.functions.Function3<androidx.compose.animation.core.Transition.Segment<java.lang.Float>, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedAlphaProgress$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(androidx.compose.animation.core.Transition.Segment<java.lang.Float> segment, androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    composer4.startReplaceGroup(-781713402);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-781713402, intValue2, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
                    }
                    androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = value2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer4.endReplaceGroup();
                    return finiteAnimationSpec;
                }
            };
            androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> vectorConverter2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE);
            float floatValue3 = ((java.lang.Number) updateTransition.getCurrentState()).floatValue();
            composer2.startReplaceGroup(175363167);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer2.endReplaceGroup();
            float floatValue4 = ((java.lang.Number) updateTransition.getTargetState()).floatValue();
            composer2.startReplaceGroup(175363167);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer2.endReplaceGroup();
            final androidx.compose.runtime.State createTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(updateTransition, java.lang.Float.valueOf(floatValue3), java.lang.Float.valueOf(floatValue4), (androidx.compose.animation.core.FiniteAnimationSpec) function32.invoke(updateTransition.getSegment(), composer2, 0), vectorConverter2, "FloatAnimation", composer2, 0);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer2.changed(this.getOutputFormats);
            boolean changed2 = composer2.changed(createTransitionAnimation);
            final float f = this.getOutputFormats;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5.getHighSpeedVideoFpsRangesFor(f, createTransitionAnimation, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.ui.layout.LayoutModifierKt.layout(companion, (kotlin.jvm.functions.Function3) rememberedValue), this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, 0.0f, 0.0f, 12, null), this.getInputFormats, 0.0f, this.Camera2StreamConfigurationMap, 0.0f, 10, null);
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRanges;
            float f2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getOutputMinFrameDuration;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            function2.invoke(composer2, 0);
            boolean changed3 = composer2.changed(updateTransition);
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5.getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.Transition.this));
                    }
                });
                composer2.updateRememberedValue(rememberedValue2);
            }
            if (!((java.lang.Boolean) ((androidx.compose.runtime.State) rememberedValue2).getValue()).booleanValue()) {
                composer2.startReplaceGroup(65675329);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion2, (kotlin.jvm.functions.Function1) rememberedValue3);
                boolean changed4 = composer2.changed(createTransitionAnimation2);
                java.lang.Object rememberedValue4 = composer2.rememberedValue();
                if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(clearAndSetSemantics, (kotlin.jvm.functions.Function1) rememberedValue4);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, f2), composer2, 0);
                function22.invoke(composer2, 0);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(65953058);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((java.lang.Number) state.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.Transition transition) {
        return ((java.lang.Number) transition.getCurrentState()).floatValue() == 0.0f && !transition.isRunning();
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRangesFor(float f, androidx.compose.runtime.State state, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        int lerp = androidx.compose.ui.util.MathHelpersKt.lerp(measureScope.mo1412roundToPx0680j_4(f), measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor())), ((java.lang.Number) state.getValue()).floatValue());
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(constraints.getGetHighSpeedVideoFpsRangesFor());
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, lerp, mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5.getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    FloatingActionButtonKt$ExtendedFloatingActionButton$5(boolean z, float f, float f2, float f3, float f4, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, float f5, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22) {
        this.getHighSpeedVideoSizes = z;
        this.getOutputFormats = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getInputFormats = f3;
        this.Camera2StreamConfigurationMap = f4;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = f5;
        this.getOutputMinFrameDuration = function22;
    }
}
