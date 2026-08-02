package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a£\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001d\u001a\b\u0010 \u001a\u00020!H\u0001¨\u0006\""}, d2 = {"AutoSaveFiSelectionHalfSheet", "", "controller", "Lcom/paypal/pds/components/BottomSheetController;", "fiList", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "onSelectFi", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "addCardFlowRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addBankFlowRequestId", "frequencyType", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "selectedFi", "onAddFiFlowStart", "showCreditCardToast", "", "toastMessage", "", "onToastDismiss", "AutoSaveFiSelectionHalfSheet-cjrXe90", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "navigateToAddBank", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigateToAddBank-hN0UB1M", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;)V", "navigateToAddCardFlow", "navigateToAddCardFlow-hN0UB1M", "createAddBankDestination", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveFiSelectionHalfSheetKt {
    /* renamed from: AutoSaveFiSelectionHalfSheet-cjrXe90, reason: not valid java name */
    public static final void m18997AutoSaveFiSelectionHalfSheetcjrXe90(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, final java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, kotlin.jvm.functions.Function0<kotlin.Unit> function02, boolean z, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2;
        final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final boolean z2;
        final java.lang.String str4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(922044948);
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 131072 : 65536;
        }
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(frequencyType == null ? -1 : frequencyType.ordinal()) ? 1048576 : 524288;
        }
        int i7 = i3 & 128;
        if (i7 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(moneyMovementFiDTO) ? 8388608 : 4194304;
        }
        int i8 = i3 & 256;
        if (i8 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(str3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2048;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function03) ? 32 : 16;
        }
        int i12 = i5;
        if (!startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i12 & 19) == 18) ? false : true, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            frequencyType2 = frequencyType;
            moneyMovementFiDTO2 = moneyMovementFiDTO;
            function04 = function02;
            z2 = z;
            str4 = str3;
            function05 = function03;
        } else {
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType3 = i6 != 0 ? com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.WEEKLY : frequencyType;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO3 = i7 != 0 ? null : moneyMovementFiDTO;
            if (i8 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function06 = (kotlin.jvm.functions.Function0) rememberedValue;
            } else {
                function06 = function02;
            }
            boolean z3 = i9 != 0 ? false : z;
            java.lang.String str5 = i10 != 0 ? null : str3;
            if (i11 != 0) {
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                function07 = (kotlin.jvm.functions.Function0) rememberedValue2;
            } else {
                function07 = function03;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(922044948, i4, i12, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheet (AutoSaveFiSelectionHalfSheet.kt:79)");
            }
            final com.paypal.oslo.core.navigation.AppNavigator appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_review_from_where, startRestartGroup, 0), false, null, 6, null);
            int i13 = i4;
            final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType4 = frequencyType3;
            final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO4 = moneyMovementFiDTO3;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function06;
            composer2 = startRestartGroup;
            final boolean z4 = z3;
            final java.lang.String str6 = str5;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function07;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, null, null, null, false, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-635678675, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.$r8$lambda$5Mvp1hufuwjxDYzJXphnKCMdcFw(com.paypal.pds.components.BottomSheetController.this, list, function1, frequencyType4, moneyMovementFiDTO4, function0, function08, appNavigator, str, str2, z4, str6, function09, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | (i13 & 14) | ((i13 >> 6) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            frequencyType2 = frequencyType3;
            moneyMovementFiDTO2 = moneyMovementFiDTO3;
            function04 = function06;
            z2 = z3;
            str4 = str5;
            function05 = function07;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.m18996$r8$lambda$vsi3VLpl2k8vuPAYCkOkOvmtTE(com.paypal.pds.components.BottomSheetController.this, list, function1, function0, str, str2, frequencyType2, moneyMovementFiDTO2, function04, z2, str4, function05, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination createAddBankDestination() {
        return new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(false, false, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5Mvp1hufuwjxDYzJXphnKCMdcFw(com.paypal.pds.components.BottomSheetController bottomSheetController, java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2, boolean z, java.lang.String str3, final kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-635678675, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheet.<anonymous> (AutoSaveFiSelectionHalfSheet.kt:89)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            composer.startMovableGroup(1200302791, java.lang.Boolean.valueOf(bottomSheetController.getVisible()));
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.m18995$r8$lambda$vkvybC9wKxQTfgTWsqoWz2SGEc((java.util.List) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE;
            boolean changed = composer.changed(function0);
            boolean changed2 = composer.changed(function02);
            boolean changed3 = composer.changed(appNavigator);
            boolean changed4 = composer.changed(str);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed | changed2 | changed3 | changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.$r8$lambda$VOeZ2nM_4vaW8DcjhDUHwTwxLyM(kotlin.jvm.functions.Function0.this, function02, appNavigator, str);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed5 = composer.changed(function0);
            boolean changed6 = composer.changed(function02);
            boolean changed7 = composer.changed(appNavigator);
            boolean changed8 = composer.changed(str2);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed5 | changed6 | changed7 | changed8) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.$r8$lambda$GNtDXnzxYmg6HM2aKIaM1EGLRgI(kotlin.jvm.functions.Function0.this, function02, appNavigator, str2);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionScreenKt.FiSelectionScreen(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionScreenDataModel(list, function12, moneyManagementFlowType, null, null, null, function1, frequencyType, moneyMovementFiDTO, null, function04, (kotlin.jvm.functions.Function0) rememberedValue3, 544, null), null, composer, 0, 2);
            composer.endMovableGroup();
            if (!z || str3 == null) {
                composer.startReplaceGroup(-1443356965);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1443850392);
                androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing56()));
                boolean changed9 = composer.changed(function03);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changed9 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.$r8$lambda$ddENlR4O8Xq01BGyZGFTLi7aUAE(kotlin.jvm.functions.Function0.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.ToastKt.Toast(str3, clip, null, (kotlin.jvm.functions.Function1) rememberedValue4, composer, 0, 4);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8c1cAAlJYpJkK0e1FgPMRkZBG7g(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(createAddBankDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GNtDXnzxYmg6HM2aKIaM1EGLRgI(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        function0.invoke();
        function02.invoke();
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.$r8$lambda$8c1cAAlJYpJkK0e1FgPMRkZBG7g((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VOeZ2nM_4vaW8DcjhDUHwTwxLyM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        function0.invoke();
        function02.invoke();
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.$r8$lambda$bRi0e2u0fyZQJhHpgd8IUkjZOic((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bRi0e2u0fyZQJhHpgd8IUkjZOic(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, 255, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, false, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.SCANNER, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ddENlR4O8Xq01BGyZGFTLi7aUAE(kotlin.jvm.functions.Function0 function0, boolean z) {
        if (!z) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vkvybC-9wKxQTfgTWsqoWz2SGEc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18995$r8$lambda$vkvybC9wKxQTfgTWsqoWz2SGEc(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vsi3VLpl2k8vuPAYCkO-kOvmtTE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18996$r8$lambda$vsi3VLpl2k8vuPAYCkOkOvmtTE(com.paypal.pds.components.BottomSheetController bottomSheetController, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, kotlin.jvm.functions.Function0 function02, boolean z, java.lang.String str3, kotlin.jvm.functions.Function0 function03, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m18997AutoSaveFiSelectionHalfSheetcjrXe90(bottomSheetController, list, function1, function0, str, str2, frequencyType, moneyMovementFiDTO, function02, z, str3, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
