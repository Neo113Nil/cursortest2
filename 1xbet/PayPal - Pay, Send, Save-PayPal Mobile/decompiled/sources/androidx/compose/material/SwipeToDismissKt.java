package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0081\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u00052\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\"\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"rememberDismissState", "Landroidx/compose/material/DismissState;", "initialValue", "Landroidx/compose/material/DismissValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "SwipeToDismiss", "", "state", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Landroidx/compose/material/ThresholdConfig;", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "DISMISS_THRESHOLD", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeToDismissKt {
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);

    public static /* synthetic */ boolean $r8$lambda$P5yUIEODp1XSJQYQxj_nJcYMDkk(androidx.compose.material.DismissValue dismissValue) {
        return true;
    }

    public static final androidx.compose.material.DismissState rememberDismissState(final androidx.compose.material.DismissValue dismissValue, final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissValue, java.lang.Boolean> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            dismissValue = androidx.compose.material.DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(androidx.compose.material.SwipeToDismissKt.$r8$lambda$P5yUIEODp1XSJQYQxj_nJcYMDkk((androidx.compose.material.DismissValue) obj));
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1753522702, i, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:135)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.material.DismissState, androidx.compose.material.DismissValue> Saver = androidx.compose.material.DismissState.INSTANCE.Saver(function1);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(dismissValue.ordinal())) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(function1)) && (i & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material.SwipeToDismissKt.$r8$lambda$UH3BsKjMKHqO4V612H7mLAWaF28(androidx.compose.material.DismissValue.this, function1);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.material.DismissState dismissState = (androidx.compose.material.DismissState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) Saver, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return dismissState;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismiss(final androidx.compose.material.DismissState dismissState, androidx.compose.ui.Modifier modifier, java.util.Set<? extends androidx.compose.material.DismissDirection> set, kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function1, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.util.Set<? extends androidx.compose.material.DismissDirection> set2;
        int i5;
        kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function12;
        final androidx.compose.ui.Modifier modifier3;
        final java.util.Set<? extends androidx.compose.material.DismissDirection> set3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function14;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-9746411);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(dismissState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                set2 = set;
                i3 |= startRestartGroup.changedInstance(set2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        set3 = set2;
                        function13 = function12;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.util.Set<? extends androidx.compose.material.DismissDirection> of = i4 != 0 ? kotlin.collections.SetsKt.setOf((java.lang.Object[]) new androidx.compose.material.DismissDirection[]{androidx.compose.material.DismissDirection.EndToStart, androidx.compose.material.DismissDirection.StartToEnd}) : set2;
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material.SwipeToDismissKt.$r8$lambda$HFJYBXV54uEUcONZ6qIGlMhVvcc((androidx.compose.material.DismissDirection) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function14 = function12;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-9746411, i3, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                        }
                        final java.util.Set<? extends androidx.compose.material.DismissDirection> set4 = of;
                        final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function15 = function14;
                        androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1281726977, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return androidx.compose.material.SwipeToDismissKt.$r8$lambda$40uFYA4SFGAAHu5ks4qEMx8NPFY(set4, function15, dismissState, function3, function32, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = companion;
                        set3 = of;
                        function13 = function14;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.SwipeToDismissKt.$r8$lambda$Uy1vFzjSmEBSxIethSmg68zHieg(androidx.compose.material.DismissState.this, modifier3, set3, function13, function3, function32, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i & 24576) == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            set2 = set;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        set2 = set;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$40uFYA4SFGAAHu5ks4qEMx8NPFY(java.util.Set set, final kotlin.jvm.functions.Function1 function1, final androidx.compose.material.DismissState dismissState, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.ui.Modifier m2774swipeablepPrIpRY;
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1281726977, i2, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:167)");
            }
            float m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(boxWithConstraintsScope.getCamera2StreamConfigurationMap());
            boolean z = composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl;
            java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(0.0f), androidx.compose.material.DismissValue.Default));
            if (set.contains(androidx.compose.material.DismissDirection.StartToEnd)) {
                kotlin.Pair pair = kotlin.TuplesKt.to(java.lang.Float.valueOf(m8554getMaxWidthimpl), androidx.compose.material.DismissValue.DismissedToEnd);
                mutableMapOf.put(pair.getFirst(), pair.getSecond());
            }
            if (set.contains(androidx.compose.material.DismissDirection.EndToStart)) {
                kotlin.Pair pair2 = kotlin.TuplesKt.to(java.lang.Float.valueOf(-m8554getMaxWidthimpl), androidx.compose.material.DismissValue.DismissedToStart);
                mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.SwipeToDismissKt.$r8$lambda$qfFdH6HLayDr_dOAptZ8DtXRzOU(kotlin.jvm.functions.Function1.this, (androidx.compose.material.DismissValue) obj, (androidx.compose.material.DismissValue) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            m2774swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m2774swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, dismissState, mutableMapOf, androidx.compose.foundation.gestures.Orientation.Horizontal, (r26 & 8) != 0 ? true : dismissState.getCurrentValue() == androidx.compose.material.DismissValue.Default, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.material.FixedThreshold highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.material.SwipeableKt.getHighSpeedVideoFpsRangesFor();
                    return highSpeedVideoFpsRangesFor;
                }
            } : (kotlin.jvm.functions.Function2) rememberedValue, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new androidx.compose.material.ResistanceConfig(m8554getMaxWidthimpl, set.contains(androidx.compose.material.DismissDirection.EndToStart) ? 10.0f : 20.0f, set.contains(androidx.compose.material.DismissDirection.StartToEnd) ? 10.0f : 20.0f), (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m2770getVelocityThresholdD9Ej5fM() : 0.0f);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m2774swipeablepPrIpRY);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier matchParentSize = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.matchParentSize(androidx.compose.ui.Modifier.INSTANCE);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, matchParentSize);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            function3.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed2 = composer.changed(dismissState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.ui.unit.IntOffset m8720boximpl;
                        androidx.compose.material.DismissState dismissState2 = androidx.compose.material.DismissState.this;
                        m8720boximpl = androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(kotlin.math.MathKt.roundToInt(dismissState2.getOffset().getValue().floatValue()) << 32));
                        return m8720boximpl;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier offset = androidx.compose.foundation.layout.OffsetKt.offset(companion, (kotlin.jvm.functions.Function1) rememberedValue2);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, offset);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            function32.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.material.FixedThreshold $r8$lambda$HFJYBXV54uEUcONZ6qIGlMhVvcc(androidx.compose.material.DismissDirection dismissDirection) {
        return new androidx.compose.material.FixedThreshold(getHighSpeedVideoFpsRanges, null);
    }

    public static /* synthetic */ androidx.compose.material.DismissState $r8$lambda$UH3BsKjMKHqO4V612H7mLAWaF28(androidx.compose.material.DismissValue dismissValue, kotlin.jvm.functions.Function1 function1) {
        return new androidx.compose.material.DismissState(dismissValue, function1);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Uy1vFzjSmEBSxIethSmg68zHieg(androidx.compose.material.DismissState dismissState, androidx.compose.ui.Modifier modifier, java.util.Set set, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SwipeToDismiss(dismissState, modifier, set, function1, function3, function32, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.material.ThresholdConfig $r8$lambda$qfFdH6HLayDr_dOAptZ8DtXRzOU(kotlin.jvm.functions.Function1 function1, androidx.compose.material.DismissValue dismissValue, androidx.compose.material.DismissValue dismissValue2) {
        androidx.compose.material.DismissDirection dismissDirection;
        if (dismissValue != dismissValue2 || dismissValue != androidx.compose.material.DismissValue.Default) {
            if (dismissValue == dismissValue2 && dismissValue == androidx.compose.material.DismissValue.DismissedToEnd) {
                dismissDirection = androidx.compose.material.DismissDirection.StartToEnd;
            } else if (dismissValue == dismissValue2 && dismissValue == androidx.compose.material.DismissValue.DismissedToStart) {
                dismissDirection = androidx.compose.material.DismissDirection.EndToStart;
            } else if (dismissValue == androidx.compose.material.DismissValue.Default && dismissValue2 == androidx.compose.material.DismissValue.DismissedToEnd) {
                dismissDirection = androidx.compose.material.DismissDirection.StartToEnd;
            } else if (dismissValue == androidx.compose.material.DismissValue.Default && dismissValue2 == androidx.compose.material.DismissValue.DismissedToStart) {
                dismissDirection = androidx.compose.material.DismissDirection.EndToStart;
            } else if (dismissValue == androidx.compose.material.DismissValue.DismissedToEnd && dismissValue2 == androidx.compose.material.DismissValue.Default) {
                dismissDirection = androidx.compose.material.DismissDirection.StartToEnd;
            } else if (dismissValue == androidx.compose.material.DismissValue.DismissedToStart && dismissValue2 == androidx.compose.material.DismissValue.Default) {
                dismissDirection = androidx.compose.material.DismissDirection.EndToStart;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(dismissDirection);
            return (androidx.compose.material.ThresholdConfig) function1.invoke(dismissDirection);
        }
        dismissDirection = null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(dismissDirection);
        return (androidx.compose.material.ThresholdConfig) function1.invoke(dismissDirection);
    }
}
