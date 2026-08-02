package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/DefaultTwoRowsTopAppBarOverride;", "Landroidx/compose/material3/TwoRowsTopAppBarOverride;", "<init>", "()V", "TwoRowsTopAppBar", "", "Landroidx/compose/material3/TwoRowsTopAppBarOverrideScope;", "(Landroidx/compose/material3/TwoRowsTopAppBarOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "hideTopRowSemantics", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTwoRowsTopAppBarOverride implements androidx.compose.material3.TwoRowsTopAppBarOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultTwoRowsTopAppBarOverride INSTANCE = new androidx.compose.material3.DefaultTwoRowsTopAppBarOverride();

    /* renamed from: $r8$lambda$Vt8vQsu7_k7_-KTaSk1A2qpUeD0, reason: not valid java name */
    public static /* synthetic */ float m3228$r8$lambda$Vt8vQsu7_k7_KTaSk1A2qpUeD0() {
        return 0.0f;
    }

    private DefaultTwoRowsTopAppBarOverride() {
    }

    @Override // androidx.compose.material3.TwoRowsTopAppBarOverride
    public final void TwoRowsTopAppBar(final androidx.compose.material3.TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1640665680);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(twoRowsTopAppBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1640665680, i2, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar (AppBar.kt:2732)");
            }
            if (java.lang.Float.isNaN(twoRowsTopAppBarOverrideScope.getCollapsedHeight()) || (java.lang.Float.floatToRawIntBits(twoRowsTopAppBarOverrideScope.getCollapsedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new java.lang.IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
            }
            if (java.lang.Float.isNaN(twoRowsTopAppBarOverrideScope.getExpandedHeight()) || (java.lang.Float.floatToRawIntBits(twoRowsTopAppBarOverrideScope.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
            }
            if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(twoRowsTopAppBarOverrideScope.getExpandedHeight(), twoRowsTopAppBarOverrideScope.getCollapsedHeight()) < 0) {
                throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight".toString());
            }
            int mo1412roundToPx0680j_4 = ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1412roundToPx0680j_4(twoRowsTopAppBarOverrideScope.getTitleBottomPadding());
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Float.valueOf(androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.m3229$r8$lambda$zzwKcsBxuXl4SPazLnB3AJn44(androidx.compose.material3.TwoRowsTopAppBarOverrideScope.this));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z2 = i3 == 4;
            boolean changed = startRestartGroup.changed(function0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z2 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarContainerColor$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ androidx.compose.ui.graphics.Color invoke() {
                        return androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.material3.TwoRowsTopAppBarOverrideScope.this.getColors().m4180containerColorvNxB06k$material3(function0.invoke().floatValue()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1333673671, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$actionsRow$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    if (!composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1333673671, intValue, -1, "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2755)");
                        }
                        androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> actions = androidx.compose.material3.TwoRowsTopAppBarOverrideScope.this.getActions();
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
            boolean changed2 = startRestartGroup.changed(function0);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        float transform;
                        transform = androidx.compose.material3.AppBarKt.getTopTitleAlphaEasing().transform(((java.lang.Number) kotlin.jvm.functions.Function0.this.invoke()).floatValue());
                        return java.lang.Float.valueOf(transform);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed3 = startRestartGroup.changed(function0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Float.valueOf(androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.$r8$lambda$z1lLa40un8Aiwyv6Vmv3GwdJI4E(kotlin.jvm.functions.Function0.this));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean changed4 = startRestartGroup.changed(function0);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.$r8$lambda$J8pOnJRps86VPEbRBIW0SBWGA28(kotlin.jvm.functions.Function0.this));
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue5;
            boolean booleanValue = ((java.lang.Boolean) state.getValue()).booleanValue();
            if (twoRowsTopAppBarOverrideScope.getScrollBehavior() != null && !twoRowsTopAppBarOverrideScope.getScrollBehavior().getGetHighResolutionOutputSizeshNQ4ISI()) {
                startRestartGroup.startReplaceGroup(-341140385);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
                boolean z3 = i3 == 4;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.m3226$r8$lambda$l6N2wOjHmTpB_sYrUZn31zs8c(androidx.compose.material3.TwoRowsTopAppBarOverrideScope.this, ((java.lang.Float) obj).floatValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.foundation.gestures.DraggableState rememberDraggableState = androidx.compose.foundation.gestures.DraggableKt.rememberDraggableState((kotlin.jvm.functions.Function1) rememberedValue6, startRestartGroup, 0);
                androidx.compose.ui.Modifier.Companion companion3 = companion2;
                boolean z4 = i3 == 4;
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = (kotlin.jvm.functions.Function3) new androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1(twoRowsTopAppBarOverrideScope, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                companion = androidx.compose.foundation.gestures.DraggableKt.draggable(companion3, rememberDraggableState, orientation, (r20 & 4) != 0, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : null, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : (kotlin.jvm.functions.Function3) rememberedValue7, (r20 & 128) != 0 ? false : false);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-340499894);
                startRestartGroup.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = twoRowsTopAppBarOverrideScope.getModifier().then(companion);
            boolean changed5 = startRestartGroup.changed(function02);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.$r8$lambda$kW_NeiaTAAje0poqrYyaVjS4CLc(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(then, (kotlin.jvm.functions.Function1) rememberedValue8);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.$r8$lambda$NDqDJLG0PIkLts6llRQawuoxxvs((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(drawBehind, false, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$6$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return kotlin.Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(semantics$default, unit, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue10);
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
            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.ui.Modifier.INSTANCE, twoRowsTopAppBarOverrideScope.getWindowInsets()));
            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new androidx.compose.material3.internal.FloatProducer() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda7
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        return androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.m3228$r8$lambda$Vt8vQsu7_k7_KTaSk1A2qpUeD0();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            androidx.compose.material3.AppBarKt.getHighSpeedVideoFpsRanges(clipToBounds, (androidx.compose.material3.internal.FloatProducer) rememberedValue11, twoRowsTopAppBarOverrideScope.getColors().getNavigationIconContentColor(), twoRowsTopAppBarOverrideScope.getColors().getTitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getSubtitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getActionIconContentColor(), twoRowsTopAppBarOverrideScope.getSmallTitle(), twoRowsTopAppBarOverrideScope.getSmallTitleTextStyle(), twoRowsTopAppBarOverrideScope.getSmallSubtitle(), twoRowsTopAppBarOverrideScope.getSmallSubtitleTextStyle(), function03, androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), twoRowsTopAppBarOverrideScope.getTitleHorizontalAlignment(), 0, ((java.lang.Boolean) state.getValue()).booleanValue(), twoRowsTopAppBarOverrideScope.getNavigationIcon(), rememberComposableLambda, twoRowsTopAppBarOverrideScope.getCollapsedHeight(), startRestartGroup, 0, 1575984);
            androidx.compose.ui.Modifier access$adjustHeightOffsetLimit = androidx.compose.material3.AppBarKt.access$adjustHeightOffsetLimit(androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.WindowInsetsKt.m1752onlybOOhFvg(twoRowsTopAppBarOverrideScope.getWindowInsets(), androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE.m1773getHorizontalJoeWqyM()))), twoRowsTopAppBarOverrideScope.getScrollBehavior());
            boolean z5 = i3 == 4;
            java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new androidx.compose.material3.internal.FloatProducer() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda8
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        return androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.$r8$lambda$tKCZfaz0uwa7Is3DQCzLxTIvhIk(androidx.compose.material3.TwoRowsTopAppBarOverrideScope.this);
                    }
                };
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue12);
            } else {
                composer2 = startRestartGroup;
            }
            androidx.compose.material3.AppBarKt.getHighSpeedVideoFpsRanges(access$adjustHeightOffsetLimit, (androidx.compose.material3.internal.FloatProducer) rememberedValue12, twoRowsTopAppBarOverrideScope.getColors().getNavigationIconContentColor(), twoRowsTopAppBarOverrideScope.getColors().getTitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getSubtitleContentColor(), twoRowsTopAppBarOverrideScope.getColors().getActionIconContentColor(), twoRowsTopAppBarOverrideScope.getTitle(), twoRowsTopAppBarOverrideScope.getTitleTextStyle(), twoRowsTopAppBarOverrideScope.getSubtitle(), twoRowsTopAppBarOverrideScope.getSubtitleTextStyle(), function04, androidx.compose.foundation.layout.Arrangement.INSTANCE.getBottom(), twoRowsTopAppBarOverrideScope.getTitleHorizontalAlignment(), mo1412roundToPx0680j_4, !booleanValue, androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE.m3113getLambda$2101264077$material3(), androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE.getLambda$37575796$material3(), androidx.compose.ui.unit.Dp.m8601constructorimpl(twoRowsTopAppBarOverrideScope.getExpandedHeight() - twoRowsTopAppBarOverrideScope.getCollapsedHeight()), composer2, 0, 1769520);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.m3227$r8$lambda$0YayVdFNzwszv0rIaAWOfvUQ(androidx.compose.material3.DefaultTwoRowsTopAppBarOverride.this, twoRowsTopAppBarOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0YayVd--FNzwszv0-rIaAWOfvUQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3227$r8$lambda$0YayVdFNzwszv0rIaAWOfvUQ(androidx.compose.material3.DefaultTwoRowsTopAppBarOverride defaultTwoRowsTopAppBarOverride, androidx.compose.material3.TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar(twoRowsTopAppBarOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-l6N2-wOjHmTpB_sYrUZn31zs8c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3226$r8$lambda$l6N2wOjHmTpB_sYrUZn31zs8c(androidx.compose.material3.TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope, float f) {
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor = twoRowsTopAppBarOverrideScope.getScrollBehavior().getGetHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRangesFor.setHeightOffset(getHighSpeedVideoFpsRangesFor.getHeightOffset() + f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$J8pOnJRps86VPEbRBIW0SBWGA28(kotlin.jvm.functions.Function0 function0) {
        return ((java.lang.Number) function0.invoke()).floatValue() < 0.5f;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NDqDJLG0PIkLts6llRQawuoxxvs(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kW_NeiaTAAje0poqrYyaVjS4CLc(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, ((androidx.compose.ui.graphics.Color) function0.invoke()).m6006unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ float $r8$lambda$tKCZfaz0uwa7Is3DQCzLxTIvhIk(androidx.compose.material3.TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope) {
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor;
        androidx.compose.material3.TopAppBarScrollBehavior scrollBehavior = twoRowsTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (getHighSpeedVideoFpsRangesFor = scrollBehavior.getGetHighSpeedVideoFpsRangesFor()) == null) {
            return 0.0f;
        }
        return getHighSpeedVideoFpsRangesFor.getHeightOffset();
    }

    public static /* synthetic */ float $r8$lambda$z1lLa40un8Aiwyv6Vmv3GwdJI4E(kotlin.jvm.functions.Function0 function0) {
        return 1.0f - ((java.lang.Number) function0.invoke()).floatValue();
    }

    /* renamed from: $r8$lambda$zzwKcsBxu-Xl4SP-azLnB3AJn44, reason: not valid java name */
    public static /* synthetic */ float m3229$r8$lambda$zzwKcsBxuXl4SPazLnB3AJn44(androidx.compose.material3.TwoRowsTopAppBarOverrideScope twoRowsTopAppBarOverrideScope) {
        androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor;
        androidx.compose.material3.TopAppBarScrollBehavior scrollBehavior = twoRowsTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (getHighSpeedVideoFpsRangesFor = scrollBehavior.getGetHighSpeedVideoFpsRangesFor()) == null) {
            return 0.0f;
        }
        return getHighSpeedVideoFpsRangesFor.getCollapsedFraction();
    }
}
