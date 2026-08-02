package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"TestTagLoyaltyManualEnterMerchantIcon", "", "TestTagLoyaltyManualEnterCardInput", "TestTagLoyaltyManualEnterSave", "LoyaltyManualConfirmScreen", "", "loyaltyCardData", "Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyCardData;", "viewModel", "Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyManualConfirmScreenViewModel;", "(Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyCardData;Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyManualConfirmScreenViewModel;Landroidx/compose/runtime/Composer;I)V", "LoyaltyManualEnterScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LoyaltyManualConfirmScreenKt {
    public static final java.lang.String TestTagLoyaltyManualEnterCardInput = "card_input";
    public static final java.lang.String TestTagLoyaltyManualEnterMerchantIcon = "merchant_icon";
    public static final java.lang.String TestTagLoyaltyManualEnterSave = "save";

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LoyaltyManualConfirmScreen(final com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData, final com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel loyaltyManualConfirmScreenViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyCardData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyManualConfirmScreenViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1561608010);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(loyaltyCardData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(loyaltyManualConfirmScreenViewModel) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1561608010, i3, -1, "com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreen (LoyaltyManualConfirmScreen.kt:60)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null)), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
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
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1709paddingqDBjuR0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.PaymentCardKt.PaymentCard(androidx.compose.ui.res.PainterResources_androidKt.painterResource(loyaltyCardData.getLogo(), startRestartGroup, 0), loyaltyCardData.getName(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null), com.paypal.pds.core.ConstantsKt.getSpacing48(), com.paypal.pds.core.ConstantsKt.getSpacing32()), TestTagLoyaltyManualEnterMerchantIcon), com.paypal.pds.components.PaymentCardMode.Display, com.paypal.pds.components.PaymentCardCornerRadius.Radius4, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 27648, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(loyaltyCardData.getName(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 4, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
            startRestartGroup.endNode();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(loyaltyCardData.getCardNumber(), null, 2, null);
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                composer3 = startRestartGroup;
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_card_number, composer3, 0);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 10, null), TestTagLoyaltyManualEnterCardInput);
            java.lang.Object rememberedValue2 = composer3.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt.$r8$lambda$2zuHEoP5xiTlEprpJwtQLEzIbPw(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.Composer composer4 = composer3;
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, testTag, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer4, 48, 0, 131056);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_save, composer4, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), "save");
            boolean z = (i3 & 14) == 4;
            boolean changedInstance = composer4.changedInstance(loyaltyManualConfirmScreenViewModel);
            java.lang.Object rememberedValue3 = composer4.rememberedValue();
            if ((changedInstance | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt.$r8$lambda$hD0Lnu5b5xMxywUYl6fXNszM8Bk(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData.this, loyaltyManualConfirmScreenViewModel, mutableState);
                    }
                };
                composer4.updateRememberedValue(rememberedValue3);
            }
            composer2 = composer4;
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource2, testTag2, null, null, primary, null, false, false, composer4, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt.m21371$r8$lambda$t2PxmgiNidNHVwRdw9A55IVCQ(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData.this, loyaltyManualConfirmScreenViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2zuHEoP5xiTlEprpJwtQLEzIbPw(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E_IwZWTd50WeElIBWfBBdXp04pg(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-86634690);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-86634690, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualEnterScreenPreview (LoyaltyManualConfirmScreen.kt:119)");
            }
            com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData = new com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData("Merchant Name", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_3, "1234 5678 9012||");
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
            LoyaltyManualConfirmScreen(loyaltyCardData, (com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenKt.$r8$lambda$E_IwZWTd50WeElIBWfBBdXp04pg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$hD0Lnu5b5xMxywUYl6fXNszM8Bk(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData, com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel loyaltyManualConfirmScreenViewModel, androidx.compose.runtime.MutableState mutableState) {
        loyaltyManualConfirmScreenViewModel.navigateToFinishScreen$wallet_prodRelease(new com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData(loyaltyCardData.getName(), loyaltyCardData.getLogo(), (java.lang.String) mutableState.getValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$t2PxmgiNidNHVwRdw9A-55-IVCQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21371$r8$lambda$t2PxmgiNidNHVwRdw9A55IVCQ(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyCardData loyaltyCardData, com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyManualConfirmScreenViewModel loyaltyManualConfirmScreenViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        LoyaltyManualConfirmScreen(loyaltyCardData, loyaltyManualConfirmScreenViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
