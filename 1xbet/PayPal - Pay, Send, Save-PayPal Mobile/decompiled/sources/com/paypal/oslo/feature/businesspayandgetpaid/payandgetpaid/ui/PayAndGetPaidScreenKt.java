package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"PayAndGetPaidScreen", "", "accountSetupRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "onNavigateToDestination", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "onNavigateToAccountSetup", "", "viewModel", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidViewModel;", "PayAndGetPaidScreen-5lSOO6k", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidViewModel;Landroidx/compose/runtime/Composer;II)V", "PayAndGetPaidContent", "uiState", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidUiState;", "requestTypes", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/RequestType;", "onRequestTypeClick", "onTryAgainClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidUiState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "business-pay-and-get-paid_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayAndGetPaidScreenKt {
    /* renamed from: PayAndGetPaidScreen-5lSOO6k, reason: not valid java name */
    public static final void m13158PayAndGetPaidScreen5lSOO6k(final java.lang.String str, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-480182246);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                payAndGetPaidViewModel2 = payAndGetPaidViewModel;
                if (startRestartGroup.changedInstance(payAndGetPaidViewModel2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                payAndGetPaidViewModel2 = payAndGetPaidViewModel;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            payAndGetPaidViewModel2 = payAndGetPaidViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else if ((i2 & 8) != 0) {
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
                i3 &= -7169;
                payAndGetPaidViewModel2 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-480182246, i3, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreen (PayAndGetPaidScreen.kt:54)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(payAndGetPaidViewModel2.getUiState$business_pay_and_get_paid_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            boolean changedInstance = startRestartGroup.changedInstance(payAndGetPaidViewModel2);
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$1$1(payAndGetPaidViewModel2, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen5lSOO6k$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen-5lSOO6k$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m13159invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13159invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            int i6 = i3;
            final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel3 = payAndGetPaidViewModel2;
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i3 & 14) | 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(payAndGetPaidViewModel3);
            boolean z2 = i5 == 32;
            boolean z3 = (i6 & 896) == 256;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1(payAndGetPaidViewModel3, function1, function12, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType[]{new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_tap_to_pay, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_request_type_tap_to_pay_description, startRestartGroup, 0), com.paypal.pds.core.Icon.Contactless.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTapToPayDestination.INSTANCE), new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_request_type_transfer_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_request_type_transfer_description, startRestartGroup, 0), com.paypal.pds.core.Icon.Wallet.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination.INSTANCE), new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_request_type_invoice_description, startRestartGroup, 0), com.paypal.pds.core.Icon.Receipt.INSTANCE, new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination((com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null))});
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState payAndGetPaidUiState = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance3 = startRestartGroup.changedInstance(payAndGetPaidViewModel3);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.$r8$lambda$dLMuBioTzTeyS4o2dBeCviPJ1o8(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel.this, (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changedInstance4 = startRestartGroup.changedInstance(payAndGetPaidViewModel3);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.m13157$r8$lambda$oNdSBRFmixY6NBnA_JejJi0His(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            payAndGetPaidViewModel2 = payAndGetPaidViewModel3;
            PayAndGetPaidContent(payAndGetPaidUiState, listOf, function13, function0, composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel4 = payAndGetPaidViewModel2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.$r8$lambda$RHEq4Pb5lcrjshR4OmR4q5rhbx8(str, function1, function12, payAndGetPaidViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PayAndGetPaidContent(final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState payAndGetPaidUiState, final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payAndGetPaidUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1601629347);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(payAndGetPaidUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1601629347, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidContent (PayAndGetPaidScreen.kt:114)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing48(), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSize24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_request_type_title, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (payAndGetPaidUiState instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.Error) {
                startRestartGroup.startReplaceGroup(-1549182973);
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.ErrorDialogKt.ErrorDialog(function0, null, null, "We are unable to load your information.", startRestartGroup, ((i2 >> 9) & 14) | 3072, 6);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-1548958564);
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(null, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(907363421, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.m13156$r8$lambda$DZLVLc8NshGnTTP3bc2eP024tk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.this, list, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 503);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.$r8$lambda$AcocgSR53afPx1wVV4Km4xqm83I(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.this, list, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$41CUeS4_OYGKXgzrDo0HjU6WZb4(boolean z, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType requestType) {
        if (!z) {
            function1.invoke(requestType);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AcocgSR53afPx1wVV4Km4xqm83I(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState payAndGetPaidUiState, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PayAndGetPaidContent(payAndGetPaidUiState, list, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DZLVLc8NshGnTTP3bc2e-P024tk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13156$r8$lambda$DZLVLc8NshGnTTP3bc2eP024tk(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState payAndGetPaidUiState, final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(907363421, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidContent.<anonymous>.<anonymous> (PayAndGetPaidScreen.kt:134)");
            }
            final boolean z = payAndGetPaidUiState instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidUiState.Loading;
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1301709355);
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType requestType = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType) obj;
                final int i3 = i2;
                com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(80749596, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.$r8$lambda$TsieRSIDp5z8zRS_6KNKXe7Nxpc(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType.this, i3, list, z, function1, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, composer, 54), composer, 3126, 0);
                i2++;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FHGiCWWbKqy47uvglCh_N5h2Nm4(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType requestType, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1051203025, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PayAndGetPaidScreen.kt:148)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(requestType.getIcon()), null, null, com.paypal.pds.components.AvatarEmphasis.High.INSTANCE, null, null, composer, 3072, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RHEq4Pb5lcrjshR4OmR4q5rhbx8(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m13158PayAndGetPaidScreen5lSOO6k(str, function1, function12, payAndGetPaidViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TsieRSIDp5z8zRS_6KNKXe7Nxpc(final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType requestType, int i, java.util.List list, final boolean z, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(80749596, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PayAndGetPaidScreen.kt:142)");
            }
            java.lang.String title = requestType.getTitle();
            java.lang.String description = requestType.getDescription();
            boolean z2 = i != kotlin.collections.CollectionsKt.getLastIndex(list);
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1051203025, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.$r8$lambda$FHGiCWWbKqy47uvglCh_N5h2Nm4(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            boolean changed = composer.changed(z);
            boolean changed2 = composer.changed(function1);
            boolean changedInstance = composer.changedInstance(requestType);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt.$r8$lambda$41CUeS4_OYGKXgzrDo0HjU6WZb4(z, function1, requestType);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(title, null, description, null, null, true, z2, null, rememberComposableLambda, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, false, composer, 100859904, 0, 515738);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dLMuBioTzTeyS4o2dBeCviPJ1o8(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.RequestType requestType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "");
        payAndGetPaidViewModel.onRequestTypeClick$business_pay_and_get_paid_prodRelease(requestType.getDestination(), requestType.getTitle());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oNdSBRFmixY6N-BnA_JejJi0His, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13157$r8$lambda$oNdSBRFmixY6NBnA_JejJi0His(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel) {
        payAndGetPaidViewModel.getPayGetPaidVerificationStatus$business_pay_and_get_paid_prodRelease();
        return kotlin.Unit.INSTANCE;
    }
}
