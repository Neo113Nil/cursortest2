package com.paypal.oslo.feature.p2p.ui.payrequest.composables;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aM\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0012\u001aS\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u001a\u001a'\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u001d0\u001c2\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"PayRequestScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "successScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/viewmodel/PayRequestViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;Lcom/paypal/oslo/feature/p2p/ui/payrequest/viewmodel/PayRequestViewModel;Landroidx/compose/runtime/Composer;I)V", "PayRequestContent", "state", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/state/PayRequestState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "onLinkClick", "Lkotlin/Function2;", "", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/state/PayRequestState;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PayRequestSuccessContent", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;", "isPaymentInProgress", "", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "buildDisclaimerText", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "buildDisclaimerLinks", "", "Lkotlin/Pair;", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PayRequestScreenKt {
    public static final void PayRequestScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel payRequestViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payRequestViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1896930052);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(successScreenComponents) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(payRequestViewModel) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1896930052, i2, -1, "com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreen (PayRequestScreen.kt:73)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(payRequestViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(payRequestViewModel);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$PayRequestScreen$1$1(payRequestViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_scam_alert_learn_more_link, startRestartGroup, 0);
            com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState payRequestState = (com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance2 = startRestartGroup.changedInstance(payRequestViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$PayRequestScreen$2$1(payRequestViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2);
            boolean z2 = i3 == 4;
            boolean changed = startRestartGroup.changed(stringResource);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changed | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$8PfMbiLv4K16Pjb7SLv1FgYoNuQ(com.paypal.oslo.core.navigation.AppNavigator.this, stringResource, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            composer2 = startRestartGroup;
            PayRequestContent(payRequestState, successScreenComponents, function1, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, i2 & 112, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$GjgFMwSyR59ZR4Eby3PFM0RuT1Q(com.paypal.oslo.core.navigation.AppNavigator.this, successScreenComponents, payRequestViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PayRequestContent(final com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState payRequestState, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payRequestState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(883669463);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(payRequestState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(successScreenComponents) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$hOgAdOj_ywYnW_lYj57BpJ5AF0c((java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(883669463, i3, -1, "com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestContent (PayRequestScreen.kt:127)");
            }
            if (payRequestState instanceof com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Loading) {
                startRestartGroup.startReplaceGroup(1542686921);
                androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, statusBarsPadding);
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
                com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "PayRequestLoadingSpinner"), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else if (payRequestState instanceof com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success) {
                startRestartGroup.startReplaceGroup(1543107064);
                com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success success = (com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success) payRequestState;
                com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData data = success.getData();
                boolean isPaymentInProgress = success.isPaymentInProgress();
                int i5 = i3 << 3;
                getHighSpeedVideoFpsRangesFor(data, successScreenComponents, isPaymentInProgress, function1, function2, startRestartGroup, (i3 & 112) | (i5 & 7168) | (i5 & 57344));
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(payRequestState instanceof com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Error)) {
                    startRestartGroup.startReplaceGroup(-1197163013);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1543443941);
                boolean z = (i3 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$JH4zSoMhpXEeUJuCoR1FjS5ePYk(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorScreenKt.NetworkErrorScreen((kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 0, 2);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22 = function2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$0XTj8me6hSfdDjswPP0RpuXVv_g(com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.this, successScreenComponents, function1, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData payRequestData, final com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-162351269);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(payRequestData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(successScreenComponents) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-162351269, i2, -1, "com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestSuccessContent (PayRequestScreen.kt:168)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary(), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, !kotlin.text.StringsKt.isBlank(payRequestData.getReason()), com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.TO, !kotlin.text.StringsKt.isBlank(payRequestData.getReason()) ? com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.FOR : null, null, false, false, 163, null), true, false, payRequestData.getReasonImageUrl() != null, true, false, 72, null);
            com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData = new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_next_button, startRestartGroup, 0), false, null, false, null, false, z, false, false, null, null, null, null, null, 16318, null);
            com.paypal.oslo.feature.moneymovement.api.domain.Intent intent = com.paypal.oslo.feature.moneymovement.api.domain.Intent.SEND;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(payRequestData.getAmount().getCurrency(), payRequestData.getAmount().getAmount());
            java.lang.String profilePhotoUrl = payRequestData.getProfilePhotoUrl();
            java.lang.String requesterName = payRequestData.getRequesterName();
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) payRequestData.getRequesterName(), new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : split$default) {
                if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$cfHtHtEASuhFeXFGFczLzX_5dPw((java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData headerData = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(intent, fiat, new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(profilePhotoUrl, requesterName, kotlin.collections.CollectionsKt.joinToString$default(arrayList2, r19, null, null, 0, null, (kotlin.jvm.functions.Function1) rememberedValue, 30, null)), !kotlin.text.StringsKt.isBlank(payRequestData.getReason()) ? new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Note(null, payRequestData.getReason()) : null, null, null, null, 112, null);
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat2 = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(payRequestData.getAmount().getCurrency(), payRequestData.getAmount().getAmount());
            int i3 = i2 & 14;
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(payRequestData, startRestartGroup, i3);
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(payRequestData, startRestartGroup, i3);
            java.lang.String reasonImageUrl = payRequestData.getReasonImageUrl();
            com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData(actionButtonGroupData, headerData, null, Camera2StreamConfigurationMap, highSpeedVideoFpsRanges, null, reasonImageUrl == null ? "" : reasonImageUrl, fiat2, 36, null);
            com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion companion = com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.INSTANCE;
            int i4 = i2 & 7168;
            boolean z2 = i4 == 2048;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$H7s85AbA5ojk4aZcj0uZFs9updI(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion companion2 = com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.INSTANCE;
            boolean z3 = i4 == 2048;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$p2o9tfNOWPng9O1_04fkQ3vsQTE(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents.ComposeDefaultImpls.Content$default(mMPSuccessScreenConfig, mMPSuccessScreenData, companion.invoke(function0, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks.Companion.invoke$default(companion2, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, null, null, null, 62, null), function2), null, successScreenComponents, startRestartGroup, (i2 << 9) & 57344, 8);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.m17294$r8$lambda$85XeQkQgVhJ54W_iRqMlK8ozgg(com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData.this, successScreenComponents, z, function1, function2, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData payRequestData, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        java.lang.String str2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1450651009, i, -1, "com.paypal.oslo.feature.p2p.ui.payrequest.composables.buildDisclaimerText (PayRequestScreen.kt:228)");
        }
        java.lang.String str3 = "";
        if (kotlin.text.StringsKt.isBlank(payRequestData.getUserEmail())) {
            str = "";
        } else {
            java.lang.String userEmail = payRequestData.getUserEmail();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("You'll pay using ");
            sb.append(userEmail);
            sb.append(".");
            str = sb.toString();
        }
        if (!kotlin.text.StringsKt.isBlank(payRequestData.getExpiryDate())) {
            composer.startReplaceGroup(383556110);
            str3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_claim_preview_disclaimer_expiry_description, new java.lang.Object[]{payRequestData.getExpiryDate()}, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(383703887);
            composer.endReplaceGroup();
        }
        if (!kotlin.text.StringsKt.isBlank(payRequestData.getScamUrl())) {
            composer.startReplaceGroup(383895839);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_scam_alert_learn_more_link, composer, 0);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("If you don't recognize it, just close or ignore it. ");
            sb2.append(stringResource);
            sb2.append(".");
            str2 = sb2.toString();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(383996806);
            composer.endReplaceGroup();
            str2 = "If you don't recognize it, just close or ignore it.";
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{str, str3, str2});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return joinToString$default;
    }

    private static final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData payRequestData, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-545533666);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-545533666, i, -1, "com.paypal.oslo.feature.p2p.ui.payrequest.composables.buildDisclaimerLinks (PayRequestScreen.kt:256)");
        }
        if (!kotlin.text.StringsKt.isBlank(payRequestData.getScamUrl())) {
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listOf = kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_scam_alert_learn_more_link, composer, 0), payRequestData.getScamUrl()));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return listOf;
        }
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> emptyList = kotlin.collections.CollectionsKt.emptyList();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return emptyList;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0XTj8me6hSfdDjswPP0RpuXVv_g(com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState payRequestState, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayRequestContent(payRequestState, successScreenComponents, function1, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$85-XeQkQgVhJ54W_iRqMlK8ozgg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17294$r8$lambda$85XeQkQgVhJ54W_iRqMlK8ozgg(com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData payRequestData, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(payRequestData, successScreenComponents, z, function1, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8PfMbiLv4K16Pjb7SLv1FgYoNuQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, java.lang.String str2, final java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.payrequest.composables.PayRequestScreenKt.$r8$lambda$NLGZ7_E3J2FySv82UuVU8aqJpBg(str3, str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GjgFMwSyR59ZR4Eby3PFM0RuT1Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.p2p.ui.payrequest.viewmodel.PayRequestViewModel payRequestViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        PayRequestScreen(appNavigator, successScreenComponents, payRequestViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H7s85AbA5ojk4aZcj0uZFs9updI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.CloseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JH4zSoMhpXEeUJuCoR1FjS5ePYk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.CloseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NLGZ7_E3J2FySv82UuVU8aqJpBg(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.p2p.navigation.PayRequestWebViewDestination(str, str2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$cfHtHtEASuhFeXFGFczLzX_5dPw(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String valueOf = java.lang.String.valueOf(kotlin.text.StringsKt.first(str));
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
        java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hOgAdOj_ywYnW_lYj57BpJ5AF0c(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p2o9tfNOWPng9O1_04fkQ3vsQTE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PrimaryCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
