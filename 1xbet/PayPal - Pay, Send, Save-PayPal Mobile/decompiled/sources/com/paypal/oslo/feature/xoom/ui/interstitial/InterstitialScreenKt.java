package com.paypal.oslo.feature.xoom.ui.interstitial;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001aA\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0000\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0017¨\u0006\u0019²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.SCREEN, "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialViewModel;Landroidx/compose/runtime/Composer;II)V", "InterstitialScreenContent", "uiState", "Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialUiState;", "onAgreeAndContinueClick", "Lkotlin/Function0;", "onLaunchBrowserClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/xoom/ui/interstitial/InterstitialUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "launchBrowser", "context", "Landroid/content/Context;", "url", "InterstitialScreenInitialPreview", "(Landroidx/compose/runtime/Composer;I)V", "InterstitialScreenSavingPreview", "xoom_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InterstitialScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InterstitialScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel interstitialViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel interstitialViewModel2;
        final com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel interstitialViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean changedInstance;
        boolean z;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        boolean z2;
        java.lang.Object rememberedValue4;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-668207176);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                interstitialViewModel2 = interstitialViewModel;
                if (startRestartGroup.changedInstance(interstitialViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                interstitialViewModel2 = interstitialViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            interstitialViewModel2 = interstitialViewModel;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                }
                i5 &= -113;
                interstitialViewModel3 = (com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-668207176, i5, -1, "com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreen (InterstitialScreen.kt:62)");
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(interstitialViewModel3);
                int i6 = i5 & 14;
                z = i6 != 4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$InterstitialScreen$1$1(interstitialViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(interstitialViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState interstitialUiState = (com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState) collectAsStateWithLifecycle.getValue();
                changedInstance2 = startRestartGroup.changedInstance(interstitialViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$InterstitialScreen$2$1(interstitialViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2);
                changedInstance3 = startRestartGroup.changedInstance(context);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.m21534$r8$lambda$6WcI0IH0vxswUkg8zfikXVVryM(context, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                InterstitialScreenContent(interstitialUiState, function0, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 0, 8);
                z2 = i6 != 4;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$UhEtIREdC_80nMubvocDBrZ8csI(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            interstitialViewModel3 = interstitialViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(interstitialViewModel3);
            int i62 = i5 & 14;
            if (i62 != 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$InterstitialScreen$1$1(interstitialViewModel3, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(interstitialViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            final android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState interstitialUiState2 = (com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState) collectAsStateWithLifecycle2.getValue();
            changedInstance2 = startRestartGroup.changedInstance(interstitialViewModel3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$InterstitialScreen$2$1(interstitialViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2);
            changedInstance3 = startRestartGroup.changedInstance(context2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.m21534$r8$lambda$6WcI0IH0vxswUkg8zfikXVVryM(context2, (java.lang.String) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            InterstitialScreenContent(interstitialUiState2, function02, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 0, 8);
            if (i62 != 4) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$UhEtIREdC_80nMubvocDBrZ8csI(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            interstitialViewModel3 = interstitialViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.m21537$r8$lambda$qSqTbebJwlDdELwXa0dC1ezTF4(com.paypal.oslo.core.navigation.AppNavigator.this, interstitialViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InterstitialScreenContent(final com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState interstitialUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(695399182);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(interstitialUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(695399182, i4, -1, "com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenContent (InterstitialScreen.kt:94)");
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null))), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (interstitialUiState instanceof com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.Saving) {
                    startRestartGroup.startReplaceGroup(662152443);
                    com.paypal.pds.components.LoaderKt.Loader(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), null, null, null, startRestartGroup, 0, 14);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(interstitialUiState instanceof com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.Initial)) {
                        startRestartGroup.startReplaceGroup(-1225565644);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(662355865);
                    androidx.compose.ui.Alignment.Horizontal start = androidx.compose.ui.Alignment.INSTANCE.getStart();
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "INTERSTITIAL_SCREEN");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), start, startRestartGroup, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.xoom.R.drawable.feature_xoom_logo, startRestartGroup, 0), "", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 12, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(110.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f)), "INTERSTITIAL_LOGO_IMAGE"), androidx.compose.ui.layout.ContentScale.INSTANCE.getFillWidth(), null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 3120, 112);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.xoom.R.string.feature_xoom_interstitial_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), "INTERSTITIAL_DESCRIPTION_LABEL"), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
                    startRestartGroup.endNode();
                    androidx.compose.ui.Modifier align = boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getBottomCenter());
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, align);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.xoom.R.string.feature_xoom_interstitial_agreement, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.xoom.R.string.feature_xoom_interstitial_agreement_link, startRestartGroup, 0), com.paypal.oslo.feature.xoom.ui.interstitial.Constants.XOOM_USER_AGREEMENT_URL)));
                    com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), "INTERSTITIAL_DISCLAIMER_LABEL");
                    boolean z = (i4 & 896) == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.m21536$r8$lambda$o3E9_1LAIcO5Qr8IU7yY5zx2gM(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag2, null, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodySmall, null, startRestartGroup, 0, 48, 5116);
                    boolean z2 = (i4 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$csRU9mNmSWOqNRUNNZK9MJTOv3I(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.xoom.R.string.feature_xoom_interstitial_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f), 1, null), "INTERSTITIAL_AGREE_AND_CONTINUE_BUTTON"), null, null, null, null, false, false, startRestartGroup, 384, 504);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$_9qY78Nz32Brcb4K4bSHN3YW4LY(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.this, function0, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void launchBrowser(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.xoom.LoggerKt.log, "Launched URL in browser", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, 4, null);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.xoom.LoggerKt.log, "Failed to open URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, e, 4, null);
        }
    }

    public static final void InterstitialScreenInitialPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-539507394);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-539507394, i, -1, "com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenInitialPreview (InterstitialScreen.kt:175)");
            }
            com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.Initial initial = com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.Initial.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$JsHx9fkOWRrwSNp1R9mwZoNVZcE((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            InterstitialScreenContent(initial, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 438, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$0tHDOE3fMZh9s7t1jcmNlG5hmUg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void InterstitialScreenSavingPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(599215484);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(599215484, i, -1, "com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenSavingPreview (InterstitialScreen.kt:185)");
            }
            com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.Saving saving = com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState.Saving.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$qhLVfSfkYWhoIAcVCvlWMsKUrJo((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            InterstitialScreenContent(saving, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, startRestartGroup, 438, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.m21535$r8$lambda$lpDHZjhBNkW1X2sYPs8CwpTIxE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0tHDOE3fMZh9s7t1jcmNlG5hmUg(int i, androidx.compose.runtime.Composer composer, int i2) {
        InterstitialScreenInitialPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6WcI0IH0vxswUkg8zfi-kXVVryM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21534$r8$lambda$6WcI0IH0vxswUkg8zfikXVVryM(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        launchBrowser(context, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JsHx9fkOWRrwSNp1R9mwZoNVZcE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UhEtIREdC_80nMubvocDBrZ8csI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialScreenKt.$r8$lambda$awvDz8wZ0H5jMETEIk9RC24aIhE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_9qY78Nz32Brcb4K4bSHN3YW4LY(com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialUiState interstitialUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InterstitialScreenContent(interstitialUiState, function0, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$awvDz8wZ0H5jMETEIk9RC24aIhE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.api.navigation.XoomNavKey.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$csRU9mNmSWOqNRUNNZK9MJTOv3I(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lpDHZjhBN-kW1X2sYPs8CwpTIxE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21535$r8$lambda$lpDHZjhBNkW1X2sYPs8CwpTIxE(int i, androidx.compose.runtime.Composer composer, int i2) {
        InterstitialScreenSavingPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o3E9_1LAIcO5Qr8IU7yY5z-x2gM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21536$r8$lambda$o3E9_1LAIcO5Qr8IU7yY5zx2gM(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qSqTbebJw-lDdELwXa0dC1ezTF4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21537$r8$lambda$qSqTbebJwlDdELwXa0dC1ezTF4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.xoom.ui.interstitial.InterstitialViewModel interstitialViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InterstitialScreen(appNavigator, interstitialViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qhLVfSfkYWhoIAcVCvlWMsKUrJo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
