package com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"InstantVaultScreen", "", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "authenticationXOResponse", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/viewmodel/InstantVaultViewModel;", "sharedViewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardSharedViewModel;", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/viewmodel/InstantVaultViewModel;Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "ErrorContent", "(Landroidx/compose/runtime/Composer;I)V", "inappcheckout_prodRelease", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstantVaultScreenKt {
    public static final void InstantVaultScreen(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel2;
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel3;
        final com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel3;
        int i4;
        int i5;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        kotlin.Unit unit;
        androidx.compose.runtime.State state;
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel4;
        final com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(148044814);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(inAppCheckoutCoordinator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(authenticationXOResponse) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(checkoutLogger) : startRestartGroup.changedInstance(checkoutLogger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                instantVaultViewModel2 = instantVaultViewModel;
                if (startRestartGroup.changedInstance(instantVaultViewModel2)) {
                    i6 = 2048;
                    i3 |= i6;
                }
            } else {
                instantVaultViewModel2 = instantVaultViewModel;
            }
            i6 = 1024;
            i3 |= i6;
        } else {
            instantVaultViewModel2 = instantVaultViewModel;
        }
        if ((i & 24576) == 0) {
            cardSharedViewModel2 = cardSharedViewModel;
            i3 |= ((i2 & 16) == 0 && startRestartGroup.changedInstance(cardSharedViewModel2)) ? 16384 : 8192;
        } else {
            cardSharedViewModel2 = cardSharedViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    i4 = 0;
                    instantVaultViewModel4 = (com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                    i5 = i7 & (-7169);
                } else {
                    i4 = 0;
                    i5 = i7;
                    instantVaultViewModel4 = instantVaultViewModel2;
                }
                if ((i2 & 16) != 0) {
                    androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, i4);
                    if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    i7 = i5 & (-57345);
                    cardSharedViewModel2 = (com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                } else {
                    cardSharedViewModel2 = cardSharedViewModel;
                    i7 = i5;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i7 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i7 &= -57345;
                }
                instantVaultViewModel4 = instantVaultViewModel2;
                i4 = 0;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(148044814, i7, -1, "com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreen (InstantVaultScreen.kt:67)");
            }
            int i8 = i7;
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(instantVaultViewModel4.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            boolean changedInstance = startRestartGroup.changedInstance(instantVaultViewModel4);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$1$1(instantVaultViewModel4, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m15529invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m15529invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            boolean changedInstance2 = startRestartGroup.changedInstance(instantVaultViewModel4);
            int i9 = i8 & 14;
            boolean z = i9 == 4;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$2$1(instantVaultViewModel4, inAppCheckoutCoordinator, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$$inlined$NavResultEffect-rtGRyWw$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m15530invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m15530invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(instantVaultViewModel4);
            boolean z2 = i9 == 4;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            boolean z3 = (i8 & 896) == 256 || ((i8 & 512) != 0 && startRestartGroup.changedInstance(checkoutLogger));
            boolean changedInstance4 = startRestartGroup.changedInstance(cardSharedViewModel2);
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
            boolean changed3 = startRestartGroup.changed(collectAsStateWithLifecycle);
            boolean changedInstance5 = startRestartGroup.changedInstance(context);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (((changedInstance3 | z2 | changed | z3 | changedInstance4 | changed2 | changed3) || changedInstance5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                state = collectAsStateWithLifecycle;
                cardSharedViewModel4 = cardSharedViewModel2;
                instantVaultViewModel5 = instantVaultViewModel4;
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$3$1(instantVaultViewModel4, inAppCheckoutCoordinator, rememberNavResultRequestId, checkoutLogger, cardSharedViewModel2, rememberNavResultRequestId2, collectAsStateWithLifecycle, context, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                unit = unit2;
                state = collectAsStateWithLifecycle;
                cardSharedViewModel4 = cardSharedViewModel2;
                instantVaultViewModel5 = instantVaultViewModel4;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
            boolean changedInstance6 = startRestartGroup.changedInstance(instantVaultViewModel5);
            boolean changedInstance7 = startRestartGroup.changedInstance(authenticationXOResponse);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((changedInstance6 | changedInstance7) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$InstantVaultScreen$4$1(instantVaultViewModel5, authenticationXOResponse, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(authenticationXOResponse, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, (i8 >> 3) & 14);
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) state.getValue()).getInitializeCheckoutEntity();
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity checkoutContext = initializeCheckoutEntity != null ? initializeCheckoutEntity.getCheckoutContext() : null;
            if (checkoutContext == null) {
                startRestartGroup.startReplaceGroup(-524619338);
                Camera2StreamConfigurationMap(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-524526524);
                java.lang.String merchantNameOrDefault = com.paypal.oslo.feature.inappcheckout.UtilsKt.merchantNameOrDefault(checkoutContext.getMerchant(), startRestartGroup, 0);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.statusBarHeight(startRestartGroup, 0), 0.0f, 0.0f, 13, null);
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
                com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderKt.InAppCheckoutHeader(com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderLeftContent.None.INSTANCE, com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.PayPalLogo.INSTANCE, null, null, startRestartGroup, 54, 12);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_instant_vault_merchant_linking, new java.lang.Object[]{merchantNameOrDefault}, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, composer2, 0, 6, 1004);
                com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultCardKt.InstantVaultCard(checkoutContext.getMerchant(), composer2, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_continue, new java.lang.Object[0], composer2, 0);
                androidx.compose.ui.Modifier align = columnScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize20(), com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize20(), com.paypal.pds.core.ConstantsKt.getSize16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally());
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                boolean isButtonLoading = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) state.getValue()).isButtonLoading();
                java.lang.String selectedInstrumentId = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) state.getValue()).getSelectedInstrumentId();
                boolean z4 = (selectedInstrumentId == null || kotlin.text.StringsKt.isBlank(selectedInstrumentId) || ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) state.getValue()).isButtonLoading()) ? false : true;
                boolean changedInstance8 = composer2.changedInstance(instantVaultViewModel5);
                java.lang.Object rememberedValue7 = composer2.rememberedValue();
                if (changedInstance8 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt.$r8$lambda$8_mOmXRSYKwEb5nyK_ceOpTAnCc(com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue7);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue7, rememberStringValue, align, null, null, primary, large, z4, isButtonLoading, composer2, 1769472, 24);
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            instantVaultViewModel3 = instantVaultViewModel5;
            cardSharedViewModel3 = cardSharedViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            cardSharedViewModel3 = cardSharedViewModel;
            instantVaultViewModel3 = instantVaultViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt.$r8$lambda$fm8DPx7VVTwubSTGLlsWMq6QZcg(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, authenticationXOResponse, checkoutLogger, instantVaultViewModel3, cardSharedViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1522735808);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1522735808, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.ErrorContent (InstantVaultScreen.kt:199)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_something_went_wrong, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.align(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt.$r8$lambda$q7JIICOyYxkXNyxnX6R79XpEo7A(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8_mOmXRSYKwEb5nyK_ceOpTAnCc(com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel) {
        instantVaultViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAgreeAndContinue.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fm8DPx7VVTwubSTGLlsWMq6QZcg(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.ui.instantvault.viewmodel.InstantVaultViewModel instantVaultViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InstantVaultScreen(inAppCheckoutCoordinator, authenticationXOResponse, checkoutLogger, instantVaultViewModel, cardSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q7JIICOyYxkXNyxnX6R79XpEo7A(int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State access$InstantVaultScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State) state.getValue();
    }
}
