package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000\u001a:\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u0015\u001a9\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003¢\u0006\u0002\u0010!\u001a)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010#*b\b\u0002\u0010\u0016\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¨\u0006$"}, d2 = {"SnackbarHost", "", "hostState", "Landroidx/compose/material3/SnackbarHostState;", "modifier", "Landroidx/compose/ui/Modifier;", "snackbar", "Lkotlin/Function1;", "Landroidx/compose/material3/SnackbarData;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "toMillis", "", "Landroidx/compose/material3/SnackbarDuration;", "hasAction", "", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutWithScale", "current", "content", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FadeInFadeOutTransition", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", "visible", "onAnimationFinish", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnackbarHostKt {
    public static final void SnackbarHost(final androidx.compose.material3.SnackbarHostState snackbarHostState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1077081618);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(snackbarHostState) ? 4 : 2) | i;
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
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function3 = androidx.compose.material3.ComposableSingletons$SnackbarHostKt.INSTANCE.m3132getLambda$1548712596$material3();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1077081618, i3, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:220)");
            }
            androidx.compose.material3.SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            androidx.compose.ui.platform.AccessibilityManager accessibilityManager = (androidx.compose.ui.platform.AccessibilityManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalAccessibilityManager());
            boolean changed = startRestartGroup.changed(currentSnackbarData);
            boolean changedInstance = startRestartGroup.changedInstance(accessibilityManager);
            androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(currentSnackbarData, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            getHighSpeedVideoFpsRanges(snackbarHostState.getCurrentSnackbarData(), modifier, function3, startRestartGroup, i3 & 1008, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32 = function3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.SnackbarHostKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.SnackbarHostKt.$r8$lambda$s8WPQoNpvpDsvoDPlf84xdjAi7E(androidx.compose.material3.SnackbarHostState.this, modifier2, function32, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final long toMillis(androidx.compose.material3.SnackbarDuration snackbarDuration, boolean z, androidx.compose.ui.platform.AccessibilityManager accessibilityManager) {
        long j;
        int i = androidx.compose.material3.SnackbarHostKt.WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            j = com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.DEFAULT_AUTO_DISMISS_DELAY_MS;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final androidx.compose.material3.SnackbarData snackbarData, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-977568115);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            } else {
                companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-977568115, i3, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
                }
                androidx.compose.material3.internal.Strings.Companion companion2 = androidx.compose.material3.internal.Strings.INSTANCE;
                java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_snackbar_pane_title), startRestartGroup, 0);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.material3.FadeInFadeOutState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.material3.FadeInFadeOutState fadeInFadeOutState = (androidx.compose.material3.FadeInFadeOutState) rememberedValue;
                if (kotlin.jvm.internal.Intrinsics.areEqual(snackbarData, fadeInFadeOutState.Camera2StreamConfigurationMap)) {
                    startRestartGroup.startReplaceGroup(1443908949);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1154891761);
                    fadeInFadeOutState.Camera2StreamConfigurationMap = snackbarData;
                    java.util.List<androidx.compose.material3.FadeInFadeOutAnimationItem<T>> list = fadeInFadeOutState.getHighSpeedVideoFpsRangesFor;
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add((androidx.compose.material3.SnackbarData) ((androidx.compose.material3.FadeInFadeOutAnimationItem) list.get(i5)).getHighSpeedVideoFpsRanges);
                    }
                    java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList);
                    if (!mutableList.contains(snackbarData)) {
                        mutableList.add(snackbarData);
                    }
                    fadeInFadeOutState.getHighSpeedVideoFpsRangesFor.clear();
                    java.util.List fastFilterNotNull = androidx.compose.ui.util.ListUtilsKt.fastFilterNotNull(mutableList);
                    java.util.Collection collection = fadeInFadeOutState.getHighSpeedVideoFpsRangesFor;
                    int size2 = fastFilterNotNull.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        androidx.compose.material3.SnackbarData snackbarData2 = (androidx.compose.material3.SnackbarData) fastFilterNotNull.get(i6);
                        collection.add(new androidx.compose.material3.FadeInFadeOutAnimationItem(snackbarData2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1952400805, true, new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1(snackbarData2, snackbarData, fadeInFadeOutState, m4383getString2EP1pXo), startRestartGroup, 54)));
                        i6++;
                        m4383getString2EP1pXo = m4383getString2EP1pXo;
                    }
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                fadeInFadeOutState.getHighSpeedVideoSizes = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1888182177);
                java.util.List<androidx.compose.material3.FadeInFadeOutAnimationItem<T>> list2 = fadeInFadeOutState.getHighSpeedVideoFpsRangesFor;
                int size3 = list2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    androidx.compose.material3.FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (androidx.compose.material3.FadeInFadeOutAnimationItem) list2.get(i7);
                    final androidx.compose.material3.SnackbarData snackbarData3 = (androidx.compose.material3.SnackbarData) fadeInFadeOutAnimationItem.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = fadeInFadeOutAnimationItem.getHighSpeedVideoFpsRangesFor;
                    startRestartGroup.startMovableGroup(1325010085, snackbarData3);
                    function32.invoke(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1893791890, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            androidx.compose.runtime.Composer composer3 = composer2;
                            int intValue = num.intValue();
                            if (composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1893791890, intValue, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:382)");
                                }
                                kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function3;
                                androidx.compose.material3.SnackbarData snackbarData4 = snackbarData3;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(snackbarData4);
                                function33.invoke(snackbarData4, composer3, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }, startRestartGroup, 54), startRestartGroup, 6);
                    startRestartGroup.endMovableGroup();
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.SnackbarHostKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.SnackbarHostKt.$r8$lambda$EEZfWqhUDN18hOrU8daP96NYvNU(androidx.compose.material3.SnackbarData.this, modifier3, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EEZfWqhUDN18hOrU8daP96NYvNU(androidx.compose.material3.SnackbarData snackbarData, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(snackbarData, modifier, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s8WPQoNpvpDsvoDPlf84xdjAi7E(androidx.compose.material3.SnackbarHostState snackbarHostState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SnackbarHost(snackbarHostState, modifier, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ androidx.compose.runtime.State access$animatedOpacity(androidx.compose.animation.core.AnimationSpec animationSpec, boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SnackbarHostKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        }
        kotlin.jvm.functions.Function0 function02 = function0;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1431889134, i, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:405)");
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.animation.core.AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue2;
        boolean changedInstance = composer.changedInstance(animatable);
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32;
        boolean changedInstance2 = composer.changedInstance(animationSpec);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(function02)) && (i & 384) != 256) {
            z2 = false;
        }
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changedInstance | z3 | changedInstance2 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1(animatable, z, animationSpec, function02, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, (i >> 3) & 14);
        androidx.compose.runtime.State asState = animatable.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return asState;
    }

    public static final /* synthetic */ androidx.compose.runtime.State access$animatedScale(androidx.compose.animation.core.AnimationSpec animationSpec, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1966809761, i, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:415)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.animation.core.AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue;
        boolean changedInstance = composer.changedInstance(animatable);
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32;
        boolean changedInstance2 = composer.changedInstance(animationSpec);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | z2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material3.SnackbarHostKt$animatedScale$1$1(animatable, z, animationSpec, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, (i >> 3) & 14);
        androidx.compose.runtime.State asState = animatable.asState();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return asState;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.SnackbarDuration.values().length];
            try {
                iArr[androidx.compose.material3.SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.SnackbarDuration.Long.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.SnackbarDuration.Short.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
