package com.paypal.oslo.feature.merchantbanking.ui.terms;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"AccountRoutingTermsScreen", "", "viewModel", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "(Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "AccountRoutingTermsScreenContent", "onCancelClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "merchant-banking_prodRelease", "uiState", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState;", "isPrimaryButtonLoading", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountRoutingTermsScreenKt {
    public static final void AccountRoutingTermsScreen(final com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountRoutingTermsViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1666349824);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(accountRoutingTermsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1666349824, i2, -1, "com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreen (AccountRoutingTermsScreen.kt:59)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(accountRoutingTermsViewModel.getUiState(), null, startRestartGroup, 0, 1);
            com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState accountRoutingTermsUiState = (com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState) collectAsState.getValue();
            if (!(accountRoutingTermsUiState instanceof com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.Initial)) {
                if (accountRoutingTermsUiState instanceof com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError) {
                    startRestartGroup.startReplaceGroup(993112674);
                    startRestartGroup.startMovableGroup(-660606773, (com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState) collectAsState.getValue());
                    com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState accountRoutingTermsUiState2 = (com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState) collectAsState.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(accountRoutingTermsUiState2, "");
                    final com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError enrollmentError = (com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError) accountRoutingTermsUiState2;
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorType = enrollmentError.getErrorType();
                    boolean changed = startRestartGroup.changed(enrollmentError);
                    boolean changedInstance = startRestartGroup.changedInstance(accountRoutingTermsViewModel);
                    boolean changedInstance2 = startRestartGroup.changedInstance(context);
                    z = (i2 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.$r8$lambda$F2MAVWgtx1Mr2qImkxoZBBbpzI8(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError.this, accountRoutingTermsViewModel, context, appNavigator);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt.ErrorScreen(errorType, (kotlin.jvm.functions.Function0) rememberedValue, "account_routing_terms", startRestartGroup, 384, 0);
                    startRestartGroup.endMovableGroup();
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(accountRoutingTermsUiState instanceof com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess)) {
                        startRestartGroup.startReplaceGroup(-660612809);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(996763699);
                    com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState accountRoutingTermsUiState3 = (com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState) collectAsState.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(accountRoutingTermsUiState3, "");
                    com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess enrollmentSuccess = (com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess) accountRoutingTermsUiState3;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    z = (i2 & 112) == 32;
                    boolean changed2 = startRestartGroup.changed(enrollmentSuccess);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changed2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$AccountRoutingTermsScreen$3$1(appNavigator, enrollmentSuccess, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                }
            } else {
                startRestartGroup.startReplaceGroup(-660612914);
                z = (i2 & 112) == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.m15599$r8$lambda$mnQ7wnmtf7UOvj8RTyeLsp9uU(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Camera2StreamConfigurationMap(accountRoutingTermsViewModel, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, i2 & 14);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.m15600$r8$lambda$rpC1BUrzRqXppALU6jOb31vtvY(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-51611571);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(accountRoutingTermsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-51611571, i3, -1, "com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenContent (AccountRoutingTermsScreen.kt:108)");
            }
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_terms_title, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_terms_description, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_terms_message, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_terms_link_url, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_terms_link_text, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = com.paypal.pds.core.RichTextKt.toRichText(stringResource, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource3, stringResource2)));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) rememberedValue2;
            androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null);
            com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(context);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.m15597$r8$lambda$Q0UWLZq6UFUFcJH2NAmZLA3HFE(context, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, wrapContentSize$default, null, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue3, bodySmall, null, composer2, 54, 48, 5116);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.TermsScreen.INSTANCE.getCONTINUE_BUTTON());
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_terms_button_continue, composer2, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            boolean changedInstance2 = composer2.changedInstance(accountRoutingTermsViewModel);
            java.lang.Object rememberedValue4 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.$r8$lambda$s4HN2XfbHozsxi1pJXWKzcOsynk(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel.this, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, stringResource4, item, null, null, primary, null, false, booleanValue, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            androidx.compose.ui.Modifier item2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.TermsScreen.INSTANCE.getCANCEL_BUTTON());
            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_terms_button_cancel, composer2, 0);
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            boolean z = (i3 & 112) == 32;
            java.lang.Object rememberedValue5 = composer2.rememberedValue();
            if (z || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.$r8$lambda$qTCIfvaEeZWQKhG1JpknF25OgA8(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue5);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue5, stringResource5, item2, null, null, tertiary, null, false, false, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.$r8$lambda$7_ZFtFIKuMwfFuM1JETbUGC4Abo(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7_ZFtFIKuMwfFuM1JETbUGC4Abo(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(accountRoutingTermsViewModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B1HGo0MG6afokJV5O49XD0TK4ig(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F2MAVWgtx1Mr2qImkxoZBBbpzI8(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError enrollmentError, com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        int i = com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.WhenMappings.$EnumSwitchMapping$0[enrollmentError.getErrorType().ordinal()];
        if (i == 1 || i == 2) {
            accountRoutingTermsViewModel.enrollForAccountRoutingNumbers();
        } else if (i == 3) {
            com.paypal.oslo.feature.merchantbanking.ui.terms.SupportExtensionsKt.openPayPalSupport(context);
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.$r8$lambda$B1HGo0MG6afokJV5O49XD0TK4ig((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Q0UWLZq6UFUFcJH2NAmZLA3H-FE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15597$r8$lambda$Q0UWLZq6UFUFcJH2NAmZLA3HFE(android.content.Context context, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str2)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VmHUwVCs9EU-KzTwbWaHYHlgiSY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15598$r8$lambda$VmHUwVCs9EUKzTwbWaHYHlgiSY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mnQ-7wnmtf7U-Ovj8RTyeLsp9uU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15599$r8$lambda$mnQ7wnmtf7UOvj8RTyeLsp9uU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsScreenKt.m15598$r8$lambda$VmHUwVCs9EUKzTwbWaHYHlgiSY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qTCIfvaEeZWQKhG1JpknF25OgA8(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rpC1BUrzRqXppALU6jOb31vtv-Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15600$r8$lambda$rpC1BUrzRqXppALU6jOb31vtvY(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        AccountRoutingTermsScreen(accountRoutingTermsViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s4HN2XfbHozsxi1pJXWKzcOsynk(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        accountRoutingTermsViewModel.enrollForAccountRoutingNumbers();
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
