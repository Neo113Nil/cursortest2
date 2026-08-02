package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/AddCardScreenState$FormReady;", "state", "Lcom/paypal/pds/components/BottomSheetController;", "billingAddressSheetController", "cardBrandSheetController", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "", "onAddressSelect", "Lkotlin/Function0;", "onAddNewAddressClick", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "onCardBrandSelect", "onResetCardBrandGuidance", "AddCardScreenModals", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/AddCardScreenState$FormReady;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardScreenModalsKt {
    public static final void AddCardScreenModals(final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady, final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.pds.components.BottomSheetController bottomSheetController2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.Composer composer3;
        boolean z;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-102285367);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(formReady) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(bottomSheetController2) : startRestartGroup.changedInstance(bottomSheetController2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-102285367, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModals (AddCardScreenModals.kt:38)");
            }
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_billing_address_title, startRestartGroup, 0), false, null, 6, null), null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1970751344, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt.$r8$lambda$GMTfQzsVRmaaA8c_f2XCt2LwCfQ(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.this, function1, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | ((i3 >> 3) & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X);
            int i4 = i3 & 3670016;
            boolean z2 = i4 == 1048576;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                function03 = function02;
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt.$r8$lambda$Gpo2r5HSDuCn6ZqrnJRMuuILJ74(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                function03 = function02;
                composer3 = startRestartGroup;
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue;
            if (formReady.getFormState().getCardBrandField().getShowSelectionGuidance()) {
                composer3.startReplaceGroup(-2050406571);
                composer3.endReplaceGroup();
                str = null;
                z = false;
            } else {
                composer3.startReplaceGroup(-2050362985);
                z = false;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_change_network_title, composer3, 0);
                composer3.endReplaceGroup();
                str = stringResource;
            }
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(str, false, null, 6, null);
            if (i4 == 1048576) {
                z = true;
            }
            java.lang.Object rememberedValue2 = composer3.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt.m21043$r8$lambda$gnJP3REgaKgGEOHf9UakwSVS80(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            composer2 = composer3;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController2, function04, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(929672121, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt.$r8$lambda$iokkKBGEklUEU8aMLgQKPkaZJS8(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.this, function12, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer3, 54), composer3, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | ((i3 >> 6) & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 440);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModalsKt.m21042$r8$lambda$Ab51prpLJWhJfJ5UjIlkB01Els(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.this, bottomSheetController, bottomSheetController2, function1, function0, function12, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$Ab51prpLJWhJfJ5UjIlkB01E-ls, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21042$r8$lambda$Ab51prpLJWhJfJ5UjIlkB01Els(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        AddCardScreenModals(formReady, bottomSheetController, bottomSheetController2, function1, function0, function12, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GMTfQzsVRmaaA8c_f2XCt2LwCfQ(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1970751344, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModals.<anonymous> (AddCardScreenModals.kt:45)");
            }
            com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt.SelectBillingAddress(formReady.getBillingAddresses(), formReady.getFormState().getAddress(), function1, function0, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Gpo2r5HSDuCn6ZqrnJRMuuILJ74(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gnJP3REgaKgGEOHf9Uak-wSVS80, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21043$r8$lambda$gnJP3REgaKgGEOHf9UakwSVS80(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iokkKBGEklUEU8aMLgQKPkaZJS8(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(929672121, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenModals.<anonymous> (AddCardScreenModals.kt:67)");
            }
            com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.SelectCardBrand(formReady.getCardBrandDefinitionList(), formReady.getFormState().getCardBrandField().getValue(), function1, formReady.getFormState().getCardBrandField().getShowSelectionGuidance(), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
