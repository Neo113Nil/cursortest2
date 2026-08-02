package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/online/model/OnlinePaymentScreenState;", "screenState", "Lkotlin/Function0;", "", "onBalanceSelect", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "onPaymentMethodSelect", "onAddFiClick", "PaymentMethodsCard", "(Lcom/paypal/oslo/feature/wallet/preferred/ui/online/model/OnlinePaymentScreenState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentMethodsCardKt {
    public static final void PaymentMethodsCard(final com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState onlinePaymentScreenState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlinePaymentScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(933750373);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(onlinePaymentScreenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(933750373, i2, -1, "com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCard (PaymentMethodsCard.kt:46)");
            }
            com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt.$r8$lambda$kTUHrgKMKN54wavgA16vsu4uyP4((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt.TestTagOnlinePaymentScreenPaymentCard);
            if (onlinePaymentScreenState.getBannerState() instanceof com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible) {
                startRestartGroup.startReplaceGroup(-1145340529);
                companion = com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderRoleBaseNegative.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 390, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1145104371);
                startRestartGroup.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(testTag.then(companion), null, null, outlined, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1759452993, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt.$r8$lambda$t3BEy4uPeCHc4gM2t7ae4YWmJS4(com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState.this, function0, function02, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 502);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt.$r8$lambda$qlAStkDbbFmLfD1CtKr5qTA1_Jc(com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState.this, function0, function1, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ePFM81K0ZMa7reXUMW9lOYpL1dk(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel) {
        function1.invoke(paymentMethodUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kTUHrgKMKN54wavgA16vsu4uyP4(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qlAStkDbbFmLfD1CtKr5qTA1_Jc(com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState onlinePaymentScreenState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        PaymentMethodsCard(onlinePaymentScreenState, function0, function1, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t3BEy4uPeCHc4gM2t7ae4YWmJS4(com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState onlinePaymentScreenState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1759452993, i, -1, "com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCard.<anonymous> (PaymentMethodsCard.kt:64)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            if (onlinePaymentScreenState.getShowBalance()) {
                composer.startReplaceGroup(972395058);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_paypal_balance, composer, 0);
                java.lang.String balance = onlinePaymentScreenState.getPaypalBalance().getBalance();
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_online_balance_description, composer, 0);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(balance);
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                sb.append(stringResource2);
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(stringResource, null, sb.toString(), null, null, false, onlinePaymentScreenState.getPreferredPaymentMethods().isEmpty(), null, com.paypal.oslo.feature.wallet.preferred.ui.online.ComposableSingletons$PaymentMethodsCardKt.INSTANCE.getLambda$740251075$wallet_prodRelease(), null, null, null, false, function0, null, null, null, com.paypal.pds.components.ListAlignment.Top, kotlin.jvm.internal.Intrinsics.areEqual(onlinePaymentScreenState.getSelectedPaymentMethodId(), onlinePaymentScreenState.getPaypalBalance().getId()), composer, 100663296, 12582912, 122554);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(973491993);
                composer.endReplaceGroup();
            }
            composer2.startReplaceGroup(1693972940);
            int i2 = 0;
            for (java.lang.Object obj : onlinePaymentScreenState.getPreferredPaymentMethods()) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel = (com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) obj;
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(paymentMethodUiModel.getId(), onlinePaymentScreenState.getSelectedPaymentMethodId());
                boolean z = i2 == kotlin.collections.CollectionsKt.getLastIndex(onlinePaymentScreenState.getPreferredPaymentMethods());
                boolean changed = composer2.changed(function1);
                boolean changedInstance = composer2.changedInstance(paymentMethodUiModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodsCardKt.$r8$lambda$ePFM81K0ZMa7reXUMW9lOYpL1dk(kotlin.jvm.functions.Function1.this, paymentMethodUiModel);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodListItemKt.PaymentMethodListItem(paymentMethodUiModel, areEqual, z, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                i2++;
            }
            composer.endReplaceGroup();
            com.paypal.oslo.feature.wallet.preferred.ui.common.AddPaymentMethodItemKt.AddPaymentMethodItem(function02, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt.TestTagOnlinePaymentScreenAddFi), composer2, 48, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
