package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/DefaultSingleRowTopAppBarOverride;", "Landroidx/compose/material3/SingleRowTopAppBarOverride;", "<init>", "()V", "SingleRowTopAppBar", "", "Landroidx/compose/material3/SingleRowTopAppBarOverrideScope;", "(Landroidx/compose/material3/SingleRowTopAppBarOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "targetColor", "Landroidx/compose/ui/graphics/Color;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultSingleRowTopAppBarOverride implements androidx.compose.material3.SingleRowTopAppBarOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultSingleRowTopAppBarOverride INSTANCE = new androidx.compose.material3.DefaultSingleRowTopAppBarOverride();

    public static /* synthetic */ float $r8$lambda$Gdhxy2Pf5GuUGtY3zexDquRCpBI() {
        return 1.0f;
    }

    private DefaultSingleRowTopAppBarOverride() {
    }

    @Override // androidx.compose.material3.SingleRowTopAppBarOverride
    public final void SingleRowTopAppBar(final androidx.compose.material3.SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2137486921);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(singleRowTopAppBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2137486921, i2, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2510)");
            }
            if (java.lang.Float.isNaN(singleRowTopAppBarOverrideScope.getExpandedHeight()) || (java.lang.Float.floatToRawIntBits(singleRowTopAppBarOverrideScope.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
            }
            java.lang.Object colors = singleRowTopAppBarOverrideScope.getColors();
            java.lang.Object scrollBehavior = singleRowTopAppBarOverrideScope.getScrollBehavior();
            boolean changed = startRestartGroup.changed(colors);
            boolean changed2 = startRestartGroup.changed(scrollBehavior);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$targetColor$2$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ androidx.compose.ui.graphics.Color invoke() {
                        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor;
                        androidx.compose.material3.TopAppBarScrollBehavior scrollBehavior2 = androidx.compose.material3.SingleRowTopAppBarOverrideScope.this.getScrollBehavior();
                        return androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.material3.SingleRowTopAppBarOverrideScope.this.getColors().m4180containerColorvNxB06k$material3(((scrollBehavior2 == null || (getHighSpeedVideoFpsRangesFor = scrollBehavior2.getGetHighSpeedVideoFpsRangesFor()) == null) ? 0.0f : getHighSpeedVideoFpsRangesFor.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f));
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m1150animateColorAsStateeuL9pac = androidx.compose.animation.SingleValueAnimationKt.m1150animateColorAsStateeuL9pac(((androidx.compose.ui.graphics.Color) ((androidx.compose.runtime.State) rememberedValue).getValue()).m6006unboximpl(), androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1658896622, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$actionsRow$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    if (!composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1658896622, intValue, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar.<anonymous> (AppBar.kt:2537)");
                        }
                        androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> actions = androidx.compose.material3.SingleRowTopAppBarOverrideScope.this.getActions();
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(end, centerVertically, composer4, 54);
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, companion2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer4);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        actions.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer4, 6);
                        composer4.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54);
            if (singleRowTopAppBarOverrideScope.getScrollBehavior() != null && !singleRowTopAppBarOverrideScope.getScrollBehavior().getGetHighResolutionOutputSizeshNQ4ISI()) {
                startRestartGroup.startReplaceGroup(689467622);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
                int i3 = i2 & 14;
                boolean z = i3 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DefaultSingleRowTopAppBarOverride.m3223$r8$lambda$DD0ClO80LrsXGwdtZfDh7pujh0(androidx.compose.material3.SingleRowTopAppBarOverrideScope.this, ((java.lang.Float) obj).floatValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.foundation.gestures.DraggableState rememberDraggableState = androidx.compose.foundation.gestures.DraggableKt.rememberDraggableState((kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0);
                androidx.compose.ui.Modifier.Companion companion3 = companion2;
                boolean z2 = i3 == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function3) new androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(singleRowTopAppBarOverrideScope, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                companion = androidx.compose.foundation.gestures.DraggableKt.draggable(companion3, rememberDraggableState, orientation, (r20 & 4) != 0, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : null, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : (kotlin.jvm.functions.Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(690108113);
                startRestartGroup.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = singleRowTopAppBarOverrideScope.getModifier().then(companion);
            boolean changed3 = startRestartGroup.changed(m1150animateColorAsStateeuL9pac);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DefaultSingleRowTopAppBarOverride.$r8$lambda$QFtEftgb6tdTkSKTNU_VPfVbiAI(androidx.compose.runtime.State.this, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(then, (kotlin.jvm.functions.Function1) rememberedValue4);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DefaultSingleRowTopAppBarOverride.$r8$lambda$JexEeAX9ETXPhZT33ClQG88KbXY((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(drawBehind, false, (kotlin.jvm.functions.Function1) rememberedValue5, 1, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$4$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return kotlin.Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics$default, unit, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue6);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier access$adjustHeightOffsetLimit = androidx.compose.material3.AppBarKt.access$adjustHeightOffsetLimit(androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.ui.Modifier.INSTANCE, singleRowTopAppBarOverrideScope.getWindowInsets())), singleRowTopAppBarOverrideScope.getScrollBehavior());
            boolean z3 = (i2 & 14) == 4;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new androidx.compose.material3.internal.FloatProducer() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda3
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        return androidx.compose.material3.DefaultSingleRowTopAppBarOverride.m3224$r8$lambda$u5Qsih8DYsNXKioTOsM2r05hIg(androidx.compose.material3.SingleRowTopAppBarOverrideScope.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.material3.internal.FloatProducer floatProducer = (androidx.compose.material3.internal.FloatProducer) rememberedValue7;
            long navigationIconContentColor = singleRowTopAppBarOverrideScope.getColors().getNavigationIconContentColor();
            long titleContentColor = singleRowTopAppBarOverrideScope.getColors().getTitleContentColor();
            long actionIconContentColor = singleRowTopAppBarOverrideScope.getColors().getActionIconContentColor();
            long subtitleContentColor = singleRowTopAppBarOverrideScope.getColors().getSubtitleContentColor();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> title = singleRowTopAppBarOverrideScope.getTitle();
            androidx.compose.ui.text.TextStyle titleTextStyle = singleRowTopAppBarOverrideScope.getTitleTextStyle();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> subtitle = singleRowTopAppBarOverrideScope.getSubtitle();
            androidx.compose.ui.text.TextStyle subtitleTextStyle = singleRowTopAppBarOverrideScope.getSubtitleTextStyle();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Alignment.Horizontal titleHorizontalAlignment = singleRowTopAppBarOverrideScope.getTitleHorizontalAlignment();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> navigationIcon = singleRowTopAppBarOverrideScope.getNavigationIcon();
            float expandedHeight = singleRowTopAppBarOverrideScope.getExpandedHeight();
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Float.valueOf(androidx.compose.material3.DefaultSingleRowTopAppBarOverride.$r8$lambda$Gdhxy2Pf5GuUGtY3zexDquRCpBI());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.AppBarKt.getHighSpeedVideoFpsRanges(access$adjustHeightOffsetLimit, floatProducer, navigationIconContentColor, titleContentColor, subtitleContentColor, actionIconContentColor, title, titleTextStyle, subtitle, subtitleTextStyle, (kotlin.jvm.functions.Function0) rememberedValue8, center, titleHorizontalAlignment, 0, false, navigationIcon, rememberComposableLambda, expandedHeight, composer2, 0, 1600566);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultSingleRowTopAppBarOverride.$r8$lambda$2RIql7mftdrCHfmfzgoGfK939I4(androidx.compose.material3.DefaultSingleRowTopAppBarOverride.this, singleRowTopAppBarOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2RIql7mftdrCHfmfzgoGfK939I4(androidx.compose.material3.DefaultSingleRowTopAppBarOverride defaultSingleRowTopAppBarOverride, androidx.compose.material3.SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultSingleRowTopAppBarOverride.SingleRowTopAppBar(singleRowTopAppBarOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DD0ClO-80LrsXGwdtZfDh7pujh0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3223$r8$lambda$DD0ClO80LrsXGwdtZfDh7pujh0(androidx.compose.material3.SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, float f) {
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor = singleRowTopAppBarOverrideScope.getScrollBehavior().getGetHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRangesFor.setHeightOffset(getHighSpeedVideoFpsRangesFor.getHeightOffset() + f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JexEeAX9ETXPhZT33ClQG88KbXY(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QFtEftgb6tdTkSKTNU_VPfVbiAI(androidx.compose.runtime.State state, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        long m6006unboximpl = ((androidx.compose.ui.graphics.Color) state.getValue()).m6006unboximpl();
        if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(m6006unboximpl, androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU())) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, m6006unboximpl, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u5Qsih8DYsN-XKioTOsM2r05hIg, reason: not valid java name */
    public static /* synthetic */ float m3224$r8$lambda$u5Qsih8DYsNXKioTOsM2r05hIg(androidx.compose.material3.SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope) {
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor;
        androidx.compose.material3.TopAppBarScrollBehavior scrollBehavior = singleRowTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (getHighSpeedVideoFpsRangesFor = scrollBehavior.getGetHighSpeedVideoFpsRangesFor()) == null) {
            return 0.0f;
        }
        return getHighSpeedVideoFpsRangesFor.getHeightOffset();
    }
}
