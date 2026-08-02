package com.paypal.oslo.feature.debitcard.shared.ui.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"AddressContent", "", "state", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "onAddressSelect", "Lkotlin/Function1;", "", "onAddNewAddressClick", "Lkotlin/Function0;", "onErrorActionClick", "onErrorDismissClick", "isFullScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "showAddNewAddressButton", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressContentKt {
    public static final void AddressContent(final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final boolean z, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final boolean z3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.Modifier modifier4;
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(648422295);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(addressSelectionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        int i7 = i2 & 256;
        if (i7 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            z3 = z2;
            modifier3 = modifier2;
        } else {
            androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            boolean z4 = i7 != 0 ? true : z2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(648422295, i3, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContent (AddressContent.kt:63)");
            }
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(addressSelectionState.getClass());
            boolean z5 = (i3 & 14) == 4;
            boolean z6 = (i3 & 112) == 32;
            com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContentKt$AddressContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z5 | z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContentKt$AddressContent$1$1(addressSelectionState, debitCardProductName, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            if ((addressSelectionState instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial) || (addressSelectionState instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading)) {
                modifier4 = companion;
                i4 = i3;
                i5 = 0;
                startRestartGroup.startReplaceGroup(2074318334);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress("shimmer1", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"••• •••••••• ••••", "•••••••, •• •••••"}), null, 10, null));
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit unit;
                            ((java.lang.Integer) obj).intValue();
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                composer3 = startRestartGroup;
                com.paypal.oslo.feature.debitcard.shared.ui.components.AddressSelectionListKt.AddressSelectionList(listOf, null, (kotlin.jvm.functions.Function1) rememberedValue2, z, z ? columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false) : androidx.compose.ui.Modifier.INSTANCE, true, startRestartGroup, ((i4 >> 9) & 7168) | 197046, 0);
                composer3.endReplaceGroup();
            } else {
                if (addressSelectionState instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success) {
                    startRestartGroup.startReplaceGroup(2075081926);
                    com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success success = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success) addressSelectionState;
                    if (!success.getAddresses().isEmpty()) {
                        startRestartGroup.startReplaceGroup(2075131464);
                        i4 = i3;
                        modifier4 = companion;
                        i5 = 0;
                        com.paypal.oslo.feature.debitcard.shared.ui.components.AddressSelectionListKt.AddressSelectionList(success.getAddresses(), success.getSelectedIndex(), function1, z, columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false), false, startRestartGroup, (i3 & 896) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 >> 9) & 7168), 0);
                        startRestartGroup.endReplaceGroup();
                        composer4 = startRestartGroup;
                    } else {
                        modifier4 = companion;
                        i4 = i3;
                        i5 = 0;
                        composer4 = startRestartGroup;
                        composer4.startReplaceGroup(2075543733);
                        composer4.endReplaceGroup();
                    }
                    composer4.endReplaceGroup();
                } else {
                    modifier4 = companion;
                    i4 = i3;
                    composer4 = startRestartGroup;
                    i5 = 0;
                    if (addressSelectionState instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving) {
                        composer4.startReplaceGroup(2075622101);
                        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving saving = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving) addressSelectionState;
                        if (!saving.getAddresses().isEmpty()) {
                            composer4.startReplaceGroup(2075671639);
                            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses = saving.getAddresses();
                            int selectedIndex = saving.getSelectedIndex();
                            java.lang.Object rememberedValue3 = composer4.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit unit;
                                        ((java.lang.Integer) obj).intValue();
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                composer4.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.debitcard.shared.ui.components.AddressSelectionListKt.AddressSelectionList(addresses, java.lang.Integer.valueOf(selectedIndex), (kotlin.jvm.functions.Function1) rememberedValue3, z, columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false), false, composer4, ((i4 >> 9) & 7168) | 196992, 0);
                            composer4.endReplaceGroup();
                            composer4 = composer4;
                        } else {
                            composer4.startReplaceGroup(2076100245);
                            composer4.endReplaceGroup();
                        }
                        composer4.endReplaceGroup();
                    } else {
                        if (!(addressSelectionState instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error)) {
                            composer4.startReplaceGroup(1590932626);
                            composer4.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer4.startReplaceGroup(2076183232);
                        if (z) {
                            composer4.startReplaceGroup(2076230166);
                            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error error = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) addressSelectionState;
                            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(error.getErrorType(), function02, function03, com.paypal.oslo.feature.debitcard.shared.analytics.EditBillingAddressAnalytics.INSTANCE.getUserIntent(debitCardProductName), null, false, java.lang.Integer.valueOf(error.getRetryCount()), null, composer4, ((i4 >> 9) & 1008) | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9), 176);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(2076598911);
                            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error error2 = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) addressSelectionState;
                            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorBottomSheetKt.DebitErrorBottomSheet(error2.getErrorType(), function02, null, java.lang.Integer.valueOf(error2.getRetryCount()), composer4, (i4 >> 9) & 112, 4);
                            composer4.endReplaceGroup();
                        }
                        composer4.endReplaceGroup();
                    }
                }
                composer3 = composer4;
            }
            if (z4) {
                composer3.startReplaceGroup(2076925062);
                composer2 = composer3;
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_billing_address_add_a_new_address, composer3, i5), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.EditBillingAddressAnalytics.INSTANCE.getBILLING_ADDRESS_ADD_ADDRESS()), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, composer2, ((i4 >> 9) & 14) | 1769472, 408);
                composer2.endReplaceGroup();
            } else {
                composer2 = composer3;
                composer2.startReplaceGroup(2077349173);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            z3 = z4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.AddressContentKt.m14598$r8$lambda$kav89XBb4fd6QmEdKXj2S3dNKk(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.this, debitCardProductName, function1, function0, function02, function03, z, modifier3, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$kav89XBb4fd6QmE-dKXj2S3dNKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14598$r8$lambda$kav89XBb4fd6QmEdKXj2S3dNKk(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState addressSelectionState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, boolean z, androidx.compose.ui.Modifier modifier, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressContent(addressSelectionState, debitCardProductName, function1, function0, function02, function03, z, modifier, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
