package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/DefaultModalWideNavigationRailOverride;", "Landroidx/compose/material3/ModalWideNavigationRailOverride;", "<init>", "()V", "ModalWideNavigationRail", "", "Landroidx/compose/material3/ModalWideNavigationRailOverrideScope;", "(Landroidx/compose/material3/ModalWideNavigationRailOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "isCollapsed", "", "modalExpanded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultModalWideNavigationRailOverride implements androidx.compose.material3.ModalWideNavigationRailOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultModalWideNavigationRailOverride INSTANCE = new androidx.compose.material3.DefaultModalWideNavigationRailOverride();

    private DefaultModalWideNavigationRailOverride() {
    }

    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    @Override // androidx.compose.material3.ModalWideNavigationRailOverride
    public final void ModalWideNavigationRail(final androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2;
        int i3;
        androidx.compose.runtime.Composer composer3;
        ?? r12;
        int i4;
        float f;
        boolean z;
        float f2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1751235721);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(modalWideNavigationRailOverrideScope) : startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1751235721, i2, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail (WideNavigationRail.kt:503)");
            }
            if (modalWideNavigationRailOverrideScope.getShouldHideOnCollapse()) {
                startRestartGroup.startReplaceGroup(95781714);
                startRestartGroup.endReplaceGroup();
                function2 = modalWideNavigationRailOverrideScope.getContent();
            } else {
                startRestartGroup.startReplaceGroup(95826602);
                boolean changed = startRestartGroup.changed(modalWideNavigationRailOverrideScope.getContent());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.MovableContentKt.movableContentOf(modalWideNavigationRailOverrideScope.getContent());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            }
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            boolean changed2 = startRestartGroup.changed(modalWideNavigationRailOverrideScope.getState());
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.compose.material3.ModalWideNavigationRailState(modalWideNavigationRailOverrideScope.getState(), density, value);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.material3.ModalWideNavigationRailState modalWideNavigationRailState = (androidx.compose.material3.ModalWideNavigationRailState) rememberedValue2;
            final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(!androidx.compose.material3.WideNavigationRailStateKt.isExpanded(modalWideNavigationRailOverrideScope.getState().getTargetValue()) ? 0.0f : 1.0f, androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.DefaultModalWideNavigationRailOverride.m3221$r8$lambda$Yuc1PHHuVmgvlzCRrADXOtVOKY(androidx.compose.runtime.State.this));
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.DefaultModalWideNavigationRailOverride.m3219$r8$lambda$4DgMzMUt0QZnwbdy0W_2bmtODU(androidx.compose.runtime.State.this));
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final androidx.compose.runtime.State state2 = (androidx.compose.runtime.State) rememberedValue4;
            int i5 = i2 & 14;
            boolean z2 = i5 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope));
            boolean changedInstance = startRestartGroup.changedInstance(modalWideNavigationRailState);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((z2 | changedInstance) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function1) new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1(modalWideNavigationRailOverrideScope, modalWideNavigationRailState, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue5;
            boolean z3 = i5 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(modalWideNavigationRailOverrideScope));
            boolean changedInstance2 = startRestartGroup.changedInstance(modalWideNavigationRailState);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((z3 | changedInstance2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(modalWideNavigationRailOverrideScope, modalWideNavigationRailState, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            final kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue6;
            if (!modalWideNavigationRailOverrideScope.getShouldHideOnCollapse() && ((java.lang.Boolean) state.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(97400069);
                i3 = i2;
                composer3 = startRestartGroup;
                androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor(modalWideNavigationRailOverrideScope.getModifier(), false, false, modalWideNavigationRailOverrideScope.getColors(), modalWideNavigationRailOverrideScope.getCollapsedShape(), modalWideNavigationRailOverrideScope.getHeader(), modalWideNavigationRailOverrideScope.getWindowInsets(), modalWideNavigationRailOverrideScope.getArrangement(), function2, composer3, 432);
                composer3.endReplaceGroup();
            } else {
                i3 = i2;
                composer3 = startRestartGroup;
                composer3.startReplaceGroup(97788313);
                composer3.endReplaceGroup();
            }
            java.lang.Object rememberedValue7 = composer3.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
                composer3.updateRememberedValue(rememberedValue7);
            }
            final kotlinx.coroutines.channels.Channel channel = (kotlinx.coroutines.channels.Channel) rememberedValue7;
            if (modalWideNavigationRailOverrideScope.getShouldHideOnCollapse()) {
                composer3.startReplaceGroup(97908438);
                boolean changedInstance3 = composer3.changedInstance(channel);
                boolean changedInstance4 = composer3.changedInstance(modalWideNavigationRailState);
                androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 rememberedValue8 = composer3.rememberedValue();
                if ((changedInstance3 | changedInstance4) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(channel, modalWideNavigationRailState, null);
                    composer3.updateRememberedValue(rememberedValue8);
                }
                r12 = 0;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(channel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue8, composer3, 0);
                composer3.endReplaceGroup();
            } else {
                r12 = 0;
                composer3.startReplaceGroup(98341849);
                composer3.endReplaceGroup();
            }
            if (!((java.lang.Boolean) state.getValue()).booleanValue()) {
                composer3.startReplaceGroup(98512256);
                if (!modalWideNavigationRailOverrideScope.getShouldHideOnCollapse()) {
                    composer3.startReplaceGroup(98472731);
                    androidx.compose.ui.Modifier m1285backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(androidx.compose.ui.Modifier.INSTANCE, modalWideNavigationRailOverrideScope.getColors().getContainerColor(), modalWideNavigationRailOverrideScope.getCollapsedShape());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r12);
                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, r12);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m1285backgroundbw27NRU);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier modifier = modalWideNavigationRailOverrideScope.getModifier();
                    f2 = androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoSizes;
                    i4 = 2;
                    f = 0.0f;
                    z = true;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.m1747widthInVpY3zN4$default(modifier, f2, 0.0f, 2, null), 0.0f, 1, null), composer3, 0);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else {
                    i4 = 2;
                    f = 0.0f;
                    z = true;
                    composer3.startReplaceGroup(98809081);
                    composer3.endReplaceGroup();
                }
                java.lang.Object rememberedValue9 = composer3.rememberedValue();
                if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer3);
                    composer3.updateRememberedValue(rememberedValue9);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue9;
                java.lang.Object rememberedValue10 = composer3.rememberedValue();
                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = androidx.compose.animation.core.AnimatableKt.Animatable$default(f, f, i4, null);
                    composer3.updateRememberedValue(rememberedValue10);
                }
                final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue10;
                java.lang.Object rememberedValue11 = composer3.rememberedValue();
                if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new androidx.compose.material3.RailPredictiveBackState();
                    composer3.updateRememberedValue(rememberedValue11);
                }
                final androidx.compose.material3.RailPredictiveBackState railPredictiveBackState = (androidx.compose.material3.RailPredictiveBackState) rememberedValue11;
                boolean changedInstance5 = composer3.changedInstance(channel);
                boolean z4 = (i5 == 4 || ((i3 & 8) != 0 && composer3.changedInstance(modalWideNavigationRailOverrideScope))) ? z : false;
                java.lang.Object rememberedValue12 = composer3.rememberedValue();
                if ((changedInstance5 | z4) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.DefaultModalWideNavigationRailOverride.m3222$r8$lambda$mviEI6WeT0djQCyc3WiLDNtf_Y(kotlinx.coroutines.channels.Channel.this, modalWideNavigationRailOverrideScope);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue12);
                }
                boolean z5 = false;
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue12, composer3, 0);
                androidx.compose.material3.ModalWideNavigationRailProperties expandedProperties = modalWideNavigationRailOverrideScope.getExpandedProperties();
                boolean changedInstance6 = composer3.changedInstance(coroutineScope);
                if (i5 == 4 || ((i3 & 8) != 0 && composer3.changedInstance(modalWideNavigationRailOverrideScope))) {
                    z5 = true;
                }
                java.lang.Object rememberedValue13 = composer3.rememberedValue();
                if ((changedInstance6 | z5) || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.DefaultModalWideNavigationRailOverride.$r8$lambda$tSB9zDVnfn6q3_FOdF7jGM3aFB8(kotlinx.coroutines.CoroutineScope.this, modalWideNavigationRailOverrideScope);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue13);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue13;
                boolean changedInstance7 = composer3.changedInstance(coroutineScope);
                boolean changedInstance8 = composer3.changedInstance(animatable);
                java.lang.Object rememberedValue14 = composer3.rememberedValue();
                if ((changedInstance7 | changedInstance8) || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DefaultModalWideNavigationRailOverride.$r8$lambda$XKWfNLrSern6px3Gvg2r5VupmsY(kotlinx.coroutines.CoroutineScope.this, animatable, ((java.lang.Float) obj).floatValue());
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue14);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue14;
                boolean changedInstance9 = composer3.changedInstance(coroutineScope);
                boolean changedInstance10 = composer3.changedInstance(animatable);
                java.lang.Object rememberedValue15 = composer3.rememberedValue();
                if ((changedInstance9 | changedInstance10) || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.DefaultModalWideNavigationRailOverride.$r8$lambda$_wFA5KxzBDi6hucVW_zAFon8wLw(kotlinx.coroutines.CoroutineScope.this, animatable);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue15);
                }
                composer2 = composer3;
                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = function2;
                androidx.compose.material3.WideNavigationRail_androidKt.ModalWideNavigationRailDialog(function0, expandedProperties, function12, (kotlin.jvm.functions.Function0) rememberedValue15, railPredictiveBackState, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1345045690, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7
                    /* JADX WARN: Removed duplicated region for block: B:31:0x015d  */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                        boolean booleanValue;
                        boolean z6;
                        boolean z7;
                        float f3;
                        boolean booleanValue2;
                        androidx.compose.runtime.Composer composer5 = composer4;
                        int intValue = num.intValue();
                        if (!composer5.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                            composer5.skipToGroupEnd();
                        } else {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1345045690, intValue, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous> (WideNavigationRail.kt:600)");
                            }
                            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
                            final androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope2 = androidx.compose.material3.ModalWideNavigationRailOverrideScope.this;
                            androidx.compose.material3.ModalWideNavigationRailState modalWideNavigationRailState2 = modalWideNavigationRailState;
                            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function13 = function1;
                            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2 = animatable;
                            androidx.compose.material3.RailPredictiveBackState railPredictiveBackState2 = railPredictiveBackState;
                            kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function24 = function22;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function23;
                            androidx.compose.runtime.State<java.lang.Boolean> state3 = state2;
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, imePadding);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor2);
                            } else {
                                composer5.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            if (modalWideNavigationRailOverrideScope2.getShouldHideOnCollapse()) {
                                z6 = modalWideNavigationRailState2.getTargetValue() != androidx.compose.material3.WideNavigationRailValue.Collapsed;
                            } else {
                                booleanValue = ((java.lang.Boolean) state3.getValue()).booleanValue();
                                z6 = booleanValue;
                            }
                            androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor(modalWideNavigationRailOverrideScope2.getColors().getModalScrimColor(), function13, z6, composer5, 0);
                            if (!modalWideNavigationRailOverrideScope2.getShouldHideOnCollapse()) {
                                booleanValue2 = ((java.lang.Boolean) state3.getValue()).booleanValue();
                                if (!booleanValue2) {
                                    z7 = false;
                                    boolean shouldHideOnCollapse = modalWideNavigationRailOverrideScope2.getShouldHideOnCollapse();
                                    androidx.compose.ui.Modifier modifier2 = modalWideNavigationRailOverrideScope2.getModifier();
                                    androidx.compose.material3.WideNavigationRailColors colors = modalWideNavigationRailOverrideScope2.getColors();
                                    androidx.compose.ui.graphics.Shape expandedShape = modalWideNavigationRailOverrideScope2.getExpandedShape();
                                    f3 = androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor;
                                    androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor(z7, shouldHideOnCollapse, animatable2, railPredictiveBackState2, function24, modifier2, modalWideNavigationRailState2, colors, expandedShape, f3, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(208840989, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num2) {
                                            androidx.compose.runtime.Composer composer7 = composer6;
                                            int intValue2 = num2.intValue();
                                            if (!composer7.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                                composer7.skipToGroupEnd();
                                            } else {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(208840989, intValue2, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous>.<anonymous>.<anonymous> (WideNavigationRail.kt:626)");
                                                }
                                                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.material3.ModalWideNavigationRailOverrideScope.this.getExpandedHeaderTopPadding(), 0.0f, 0.0f, 13, null);
                                                androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope3 = androidx.compose.material3.ModalWideNavigationRailOverrideScope.this;
                                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                                int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer7, m1710paddingqDBjuR0$default);
                                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                if (!(composer7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer7.startReusableNode();
                                                if (composer7.getInserting()) {
                                                    composer7.createNode(constructor3);
                                                } else {
                                                    composer7.useNode();
                                                }
                                                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer7);
                                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                                    m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                                    m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> header = modalWideNavigationRailOverrideScope3.getHeader();
                                                if (header == null) {
                                                    composer7.startReplaceGroup(-1627801290);
                                                } else {
                                                    composer7.startReplaceGroup(-2130719701);
                                                    header.invoke(composer7, 0);
                                                }
                                                composer7.endReplaceGroup();
                                                composer7.endNode();
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }, composer5, 54), modalWideNavigationRailOverrideScope2.getWindowInsets(), modalWideNavigationRailOverrideScope2.getShouldHideOnCollapse(), modalWideNavigationRailOverrideScope2.getArrangement(), function25, composer5, (androidx.compose.animation.core.Animatable.$stable << 6) | 805309440, 6);
                                    composer5.endNode();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                            z7 = true;
                            boolean shouldHideOnCollapse2 = modalWideNavigationRailOverrideScope2.getShouldHideOnCollapse();
                            androidx.compose.ui.Modifier modifier22 = modalWideNavigationRailOverrideScope2.getModifier();
                            androidx.compose.material3.WideNavigationRailColors colors2 = modalWideNavigationRailOverrideScope2.getColors();
                            androidx.compose.ui.graphics.Shape expandedShape2 = modalWideNavigationRailOverrideScope2.getExpandedShape();
                            f3 = androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor;
                            androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor(z7, shouldHideOnCollapse2, animatable2, railPredictiveBackState2, function24, modifier22, modalWideNavigationRailState2, colors2, expandedShape2, f3, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(208840989, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num2) {
                                    androidx.compose.runtime.Composer composer7 = composer6;
                                    int intValue2 = num2.intValue();
                                    if (!composer7.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                        composer7.skipToGroupEnd();
                                    } else {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(208840989, intValue2, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous>.<anonymous>.<anonymous> (WideNavigationRail.kt:626)");
                                        }
                                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.material3.ModalWideNavigationRailOverrideScope.this.getExpandedHeaderTopPadding(), 0.0f, 0.0f, 13, null);
                                        androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope3 = androidx.compose.material3.ModalWideNavigationRailOverrideScope.this;
                                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                        int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer7, m1710paddingqDBjuR0$default);
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        if (!(composer7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            composer7.createNode(constructor3);
                                        } else {
                                            composer7.useNode();
                                        }
                                        androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer7);
                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                            m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                            m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> header = modalWideNavigationRailOverrideScope3.getHeader();
                                        if (header == null) {
                                            composer7.startReplaceGroup(-1627801290);
                                        } else {
                                            composer7.startReplaceGroup(-2130719701);
                                            header.invoke(composer7, 0);
                                        }
                                        composer7.endReplaceGroup();
                                        composer7.endNode();
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }, composer5, 54), modalWideNavigationRailOverrideScope2.getWindowInsets(), modalWideNavigationRailOverrideScope2.getShouldHideOnCollapse(), modalWideNavigationRailOverrideScope2.getArrangement(), function25, composer5, (androidx.compose.animation.core.Animatable.$stable << 6) | 805309440, 6);
                            composer5.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, 221184);
                composer2.endReplaceGroup();
            } else {
                composer2 = composer3;
                composer2.startReplaceGroup(101334713);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultModalWideNavigationRailOverride$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultModalWideNavigationRailOverride.m3220$r8$lambda$5cYzX22qb65FThhXf03wBrIiTw(androidx.compose.material3.DefaultModalWideNavigationRailOverride.this, modalWideNavigationRailOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$4DgM-zMUt0QZnwbdy0W_2bmtODU, reason: not valid java name */
    public static /* synthetic */ boolean m3219$r8$lambda$4DgMzMUt0QZnwbdy0W_2bmtODU(androidx.compose.runtime.State state) {
        return ((java.lang.Number) state.getValue()).floatValue() >= 0.3f;
    }

    /* renamed from: $r8$lambda$5cYzX22qb65FThhXf03wB-rIiTw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3220$r8$lambda$5cYzX22qb65FThhXf03wBrIiTw(androidx.compose.material3.DefaultModalWideNavigationRailOverride defaultModalWideNavigationRailOverride, androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultModalWideNavigationRailOverride.ModalWideNavigationRail(modalWideNavigationRailOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XKWfNLrSern6px3Gvg2r5VupmsY(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.Animatable animatable, float f) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$5$1$1(animatable, f, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Yuc1PHHuVmgvlzCRrADXOtV-OKY, reason: not valid java name */
    public static /* synthetic */ boolean m3221$r8$lambda$Yuc1PHHuVmgvlzCRrADXOtVOKY(androidx.compose.runtime.State state) {
        return ((java.lang.Number) state.getValue()).floatValue() == 0.0f;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_wFA5KxzBDi6hucVW_zAFon8wLw(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.Animatable animatable) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$6$1$1(animatable, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mviEI-6WeT0djQCyc3WiLDNtf_Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3222$r8$lambda$mviEI6WeT0djQCyc3WiLDNtf_Y(kotlinx.coroutines.channels.Channel channel, androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope) {
        channel.mo9266trySendJP2dKIU(java.lang.Boolean.valueOf(androidx.compose.material3.WideNavigationRailStateKt.isExpanded(modalWideNavigationRailOverrideScope.getState().getTargetValue())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tSB9zDVnfn6q3_FOdF7jGM3aFB8(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$4$1$1(modalWideNavigationRailOverrideScope, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
