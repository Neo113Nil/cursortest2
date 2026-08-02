package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"CardConnectScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/viewmodel/CardConnectViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/viewmodel/CardConnectViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CardConnectLoadingContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease", "uiState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardConnectScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2145910488);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(cardConnectViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2145910488, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreen (CardConnectScreen.kt:59)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(cardConnectViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                boolean changed = startRestartGroup.changed(cardConnectViewModel.getCardProduct().ordinal());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = com.paypal.oslo.feature.debitcard.shared.analytics.CardConnectAnalytics.INSTANCE.getUserIntent(cardConnectViewModel.getCardProduct());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext) rememberedValue;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(cardConnectViewModel);
                boolean changedInstance2 = startRestartGroup.changedInstance(context);
                boolean z = (i4 & 14) == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1(cardConnectViewModel, context, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState) collectAsStateWithLifecycle.getValue()).getClass());
                boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                boolean changedInstance3 = startRestartGroup.changedInstance(userIntentContext);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changed2 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$2$1(userIntentContext, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState cardConnectState = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState) collectAsStateWithLifecycle.getValue();
                if (cardConnectState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading) {
                    startRestartGroup.startReplaceGroup(1770750836);
                    getHighResolutionOutputSizeshNQ4ISI(modifier5, startRestartGroup, (i4 >> 6) & 14, 0);
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                } else if ((cardConnectState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated) || (cardConnectState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive)) {
                    modifier3 = modifier5;
                    startRestartGroup.startReplaceGroup(-635608180);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(cardConnectState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed)) {
                        startRestartGroup.startReplaceGroup(-635617105);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1771068028);
                    com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed sessionCreationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed) cardConnectState;
                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = sessionCreationFailed.getErrorType();
                    int retryCount = sessionCreationFailed.getRetryCount();
                    boolean changedInstance4 = startRestartGroup.changedInstance(cardConnectViewModel);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt.$r8$lambda$G6k6hID_HdxmSvEXcF3Bkb_JdiQ(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean changedInstance5 = startRestartGroup.changedInstance(cardConnectViewModel);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt.m14347$r8$lambda$NDZafzqPJxGpEY3jLvTjDp27hU(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    modifier3 = modifier5;
                    com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(errorType, function0, (kotlin.jvm.functions.Function0) rememberedValue5, userIntentContext, modifier5, true, java.lang.Integer.valueOf(retryCount), null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i4 << 6) & 57344), 128);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt.$r8$lambda$qry8sVNbcDaTkn47Mq7LZH1Nu8I(com.paypal.oslo.core.navigation.AppNavigator.this, cardConnectViewModel, modifier6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1451489973);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1451489973, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectLoadingContent (CardConnectScreen.kt:127)");
            }
            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt.m14348$r8$lambda$le4qtGoF3im37XEVkRcVft36RA(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G6k6hID_HdxmSvEXcF3Bkb_JdiQ(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel) {
        cardConnectViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.RetryClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NDZafzqPJxGpEY3jLv-TjDp27hU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14347$r8$lambda$NDZafzqPJxGpEY3jLvTjDp27hU(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel) {
        cardConnectViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.DismissClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$le4qtGoF3i-m37XEVkRcVft36RA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14348$r8$lambda$le4qtGoF3im37XEVkRcVft36RA(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qry8sVNbcDaTkn47Mq7LZH1Nu8I(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardConnectScreen(appNavigator, cardConnectViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState access$CardConnectScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState) state.getValue();
    }
}
