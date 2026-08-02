package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "paymentMethod", "", "isSelected", "showBottomDivider", "Lkotlin/Function0;", "", "onClick", "PaymentMethodListItem", "(Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentMethodListItemKt {
    public static final void PaymentMethodListItem(final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel, final boolean z, final boolean z2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String value;
        java.lang.String str;
        com.paypal.pds.components.ListAlignment listAlignment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-657739664);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(paymentMethodUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-657739664, i3, -1, "com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodListItem (PaymentMethodListItem.kt:43)");
            }
            final java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(paymentMethodUiModel.getName(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            com.paypal.oslo.core.commonui.utils.RefText secondaryText = paymentMethodUiModel.getSecondaryText();
            if (secondaryText == null) {
                startRestartGroup.startReplaceGroup(-1081273686);
                startRestartGroup.endReplaceGroup();
                value = null;
            } else {
                startRestartGroup.startReplaceGroup(-727616457);
                value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(secondaryText, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                startRestartGroup.endReplaceGroup();
            }
            if (paymentMethodUiModel.getFundingType() == com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BALANCE) {
                startRestartGroup.startReplaceGroup(-1081158396);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_online_balance_description, startRestartGroup, 0);
                if (value != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(value);
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                    sb.append(stringResource);
                    stringResource = sb.toString();
                }
                startRestartGroup.endReplaceGroup();
                str = stringResource;
            } else {
                if (value != null && paymentMethodUiModel.getLastNChars() != null) {
                    startRestartGroup.startReplaceGroup(-1080851434);
                    startRestartGroup.endReplaceGroup();
                    java.lang.String lastNChars = paymentMethodUiModel.getLastNChars();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(value);
                    sb2.append(" •••");
                    sb2.append(lastNChars);
                    value = sb2.toString();
                } else {
                    startRestartGroup.startReplaceGroup(-727599421);
                    startRestartGroup.endReplaceGroup();
                }
                str = value;
            }
            if (paymentMethodUiModel.getFundingType() == com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BALANCE) {
                listAlignment = com.paypal.pds.components.ListAlignment.Top;
            } else {
                listAlignment = com.paypal.pds.components.ListAlignment.Center;
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(value2, null, str, null, null, false, z2, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-382931483, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodListItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodListItemKt.m21486$r8$lambda$twODIRbxnXEU67qxDfvNN89mlY(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel.this, value2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, null, null, false, function0, null, null, null, listAlignment, z, composer2, ((i3 << 12) & 3670016) | 100663296, (i3 & 7168) | ((i3 << 21) & 234881024), 122554);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodListItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodListItemKt.m21485$r8$lambda$D9kT2u3KaKfQiMuQ2zDU0Pa4TM(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel.this, z, z2, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$D9kT2u3KaKfQiMuQ2z-DU0Pa4TM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21485$r8$lambda$D9kT2u3KaKfQiMuQ2zDU0Pa4TM(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PaymentMethodListItem(paymentMethodUiModel, z, z2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$twODIRbxnX-EU67qxDfvNN89mlY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21486$r8$lambda$twODIRbxnXEU67qxDfvNN89mlY(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-382931483, i, -1, "com.paypal.oslo.feature.wallet.preferred.ui.online.PaymentMethodListItem.<anonymous> (PaymentMethodListItem.kt:71)");
            }
            if (paymentMethodUiModel.getFundingType() == com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BALANCE) {
                composer.startReplaceGroup(-478560213);
                androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1740size3ABfNKs);
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
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, null, composer, 3126, 20);
                composer.endNode();
                composer.endReplaceGroup();
            } else if (paymentMethodUiModel.getFundingType() == com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.CARD && paymentMethodUiModel.getThumbnail() != null) {
                composer.startReplaceGroup(-478027354);
                com.paypal.oslo.feature.wallet.common.ui.CardImageKt.CardImage(paymentMethodUiModel.getThumbnail(), str, (androidx.compose.ui.Modifier) null, composer, 0, 4);
                composer.endReplaceGroup();
            } else if (paymentMethodUiModel.getThumbnail() != null) {
                composer.startReplaceGroup(-477784593);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(paymentMethodUiModel.getThumbnail(), null, null, null, null, composer, 0, 30), null, 2, null), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 50);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-477272752);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Bank.INSTANCE), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 50);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
