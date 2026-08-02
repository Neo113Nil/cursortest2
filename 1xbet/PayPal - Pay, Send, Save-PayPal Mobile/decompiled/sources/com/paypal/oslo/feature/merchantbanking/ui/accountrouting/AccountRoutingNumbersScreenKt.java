package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\n\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002"}, d2 = {"AccountRoutingNumbersScreen", "", "destination", "Lcom/paypal/oslo/feature/merchantbanking/api/navigation/AccountRoutingNumbersDestination;", "viewModel", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/merchantbanking/api/navigation/AccountRoutingNumbersDestination;Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "AccountRoutingNumbersScreenContent", "uiState", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Success;", "showAccountCreationToast", "", "(Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState$Success;ZLandroidx/compose/runtime/Composer;I)V", "AccountRoutingNumbersScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "merchant-banking_prodRelease", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "toastMessage", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountRoutingNumbersScreenKt {
    public static final void AccountRoutingNumbersScreen(final com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination accountRoutingNumbersDestination, final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String routingNumber;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountRoutingNumbersDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountRoutingNumberViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-65996235);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(accountRoutingNumbersDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(accountRoutingNumberViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-65996235, i2, -1, "com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreen (AccountRoutingNumbersScreen.kt:67)");
            }
            java.lang.String accountNumber = accountRoutingNumbersDestination.getAccountNumber();
            boolean z = (accountNumber == null || accountNumber.length() == 0 || (routingNumber = accountRoutingNumbersDestination.getRoutingNumber()) == null || routingNumber.length() == 0) ? false : true;
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            if (z) {
                startRestartGroup.startReplaceGroup(1001539604);
                java.lang.String accountNumber2 = accountRoutingNumbersDestination.getAccountNumber();
                if (accountNumber2 == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                java.lang.String routingNumber2 = accountRoutingNumbersDestination.getRoutingNumber();
                if (routingNumber2 != null) {
                    getHighSpeedVideoSizes(new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success(accountNumber2, routingNumber2, accountRoutingNumbersDestination.getShowAccountCreationToast()), accountRoutingNumbersDestination.getShowAccountCreationToast(), startRestartGroup, 0);
                } else {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                startRestartGroup.startReplaceGroup(1002014989);
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(accountRoutingNumberViewModel.getUiState(), null, startRestartGroup, 0, 1);
                com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState accountRoutingNumberUiState = (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState) collectAsState.getValue();
                if (accountRoutingNumberUiState instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error) {
                    startRestartGroup.startReplaceGroup(998167021);
                    startRestartGroup.startMovableGroup(1002159000, (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState) collectAsState.getValue());
                    com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState accountRoutingNumberUiState2 = (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState) collectAsState.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(accountRoutingNumberUiState2, "");
                    final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error error = (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error) accountRoutingNumberUiState2;
                    com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorType = error.getErrorType();
                    boolean changed = startRestartGroup.changed(error);
                    boolean changedInstance = startRestartGroup.changedInstance(accountRoutingNumberViewModel);
                    boolean changedInstance2 = startRestartGroup.changedInstance(context);
                    boolean z2 = (i2 & 896) == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changedInstance | changedInstance2 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.$r8$lambda$F6ubIKMrrDsg8M2g2nR7wYOZ9sQ(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error.this, accountRoutingNumberViewModel, context, appNavigator);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt.ErrorScreen(errorType, (kotlin.jvm.functions.Function0) rememberedValue, "account_routing_numbers", startRestartGroup, 384, 0);
                    startRestartGroup.endMovableGroup();
                    startRestartGroup.endReplaceGroup();
                } else if (!(accountRoutingNumberUiState instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(accountRoutingNumberUiState, com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.NavigateToTerms.INSTANCE)) {
                        if (accountRoutingNumberUiState instanceof com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Loading) {
                            startRestartGroup.startReplaceGroup(1002198212);
                            com.paypal.oslo.feature.merchantbanking.ui.loading.LoadingScreenKt.LoadingScreen(startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1002199385);
                            startRestartGroup.endReplaceGroup();
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(1003189672);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.$r8$lambda$aenOnAUmljD7gFDEoosVbSWvgjo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        appNavigator.navigate((kotlin.jvm.functions.Function1) rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(1002183904);
                    com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState accountRoutingNumberUiState3 = (com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState) collectAsState.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(accountRoutingNumberUiState3, "");
                    getHighSpeedVideoSizes((com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success) accountRoutingNumberUiState3, accountRoutingNumbersDestination.getShowAccountCreationToast(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.$r8$lambda$juXKkQPzrZQB31opmERCNwnIETQ(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination.this, accountRoutingNumberViewModel, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success success, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(850345290);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(850345290, i2, -1, "com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenContent (AccountRoutingNumbersScreen.kt:124)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$AccountRoutingNumbersScreenContent$1$1(null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_provisioned_toast, startRestartGroup, 0);
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_copied_clipboard_toast, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                if (!z) {
                    stringResource = null;
                }
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(stringResource, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_title, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 390, 0), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_account_number_title, startRestartGroup, 0);
            java.lang.String formatWithSpacesInPlace = com.paypal.oslo.feature.merchantbanking.domain.ExtensionsKt.formatWithSpacesInPlace(success.getAccountNumber(), com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex.ACCOUNT_NUMBER.getValue());
            boolean changed = startRestartGroup.changed(stringResource2);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.$r8$lambda$g49CmE24IXf0xDmAJxSzWOMXNLQ(stringResource2, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingCopyKt.AccountRoutingCopy(stringResource3, formatWithSpacesInPlace, null, true, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 3072, 4);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_routing_number_title, startRestartGroup, 0);
            java.lang.String formatWithSpacesInPlace2 = com.paypal.oslo.feature.merchantbanking.domain.ExtensionsKt.formatWithSpacesInPlace(success.getRoutingNumber(), com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SpaceIndex.ROUTING_NUMBER.getValue());
            boolean changed2 = startRestartGroup.changed(stringResource2);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.m15587$r8$lambda$bvZBRmjZUy3G4h6MOceZG2DdnM(stringResource2, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingCopyKt.AccountRoutingCopy(stringResource4, formatWithSpacesInPlace2, null, false, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0, 12);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_account_type_description, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            startRestartGroup.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_title, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_servicing_instructions_description, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.merchantbanking.ui.components.AccountRoutingAccordionKt.AccountRoutingAccordion(composer2, 0);
            composer2.endNode();
            java.lang.String str = (java.lang.String) mutableState.getValue();
            if (str == null) {
                composer2.startReplaceGroup(384298406);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(384298407);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null);
                java.lang.Object rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.$r8$lambda$W5EKUPAgzOaZBCRFiQifptAp9Vo(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.pds.components.ToastKt.Toast(str, m1710paddingqDBjuR0$default, null, (kotlin.jvm.functions.Function1) rememberedValue5, composer2, 3072, 4);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.$r8$lambda$r7UyT2MNhY97lB8C7pjTU__CoqU(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success.this, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F6ubIKMrrDsg8M2g2nR7wYOZ9sQ(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error error, com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        int i = com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.WhenMappings.$EnumSwitchMapping$0[error.getErrorType().ordinal()];
        if (i == 1 || i == 2) {
            accountRoutingNumberViewModel.loadAccountRoutingNumbers();
        } else if (i == 3) {
            com.paypal.oslo.feature.merchantbanking.ui.accountrouting.SupportExtensionsKt.openPayPalSupport(context);
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.$r8$lambda$qAqSxF1SU9UiwGLTrfheehUkmAM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W5EKUPAgzOaZBCRFiQifptAp9Vo(androidx.compose.runtime.MutableState mutableState, boolean z) {
        if (!z) {
            mutableState.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aenOnAUmljD7gFDEoosVbSWvgjo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingTermsDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bvZBRmjZUy3G4h6MOceZG2Ddn-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15587$r8$lambda$bvZBRmjZUy3G4h6MOceZG2DdnM(java.lang.String str, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g49CmE24IXf0xDmAJxSzWOMXNLQ(java.lang.String str, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$juXKkQPzrZQB31opmERCNwnIETQ(com.paypal.oslo.feature.merchantbanking.api.navigation.AccountRoutingNumbersDestination accountRoutingNumbersDestination, com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        AccountRoutingNumbersScreen(accountRoutingNumbersDestination, accountRoutingNumberViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qAqSxF1SU9UiwGLTrfheehUkmAM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r7UyT2MNhY97lB8C7pjTU__CoqU(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success success, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(success, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rezqBF-c2cXlx-2mRCf44DI0-kI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15588$r8$lambda$rezqBFc2cXlx2mRCf44DI0kI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2139477372);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2139477372, updateChangedFlags, -1, "com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenPreview (AccountRoutingNumbersScreen.kt:224)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            getHighSpeedVideoSizes(new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Success("1234567890", "987654321", false), false, startRestartGroup, 48);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumbersScreenKt.m15588$r8$lambda$rezqBFc2cXlx2mRCf44DI0kI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.values().length];
            try {
                iArr[com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.GENERIC_500.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.NO_NETWORK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.RISK_DECLINED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
