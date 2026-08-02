package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"TotalSectionContainerTag", "", "TotalSectionTileTag", "TotalSectionFeesExplanationTextTag", "TotalSectionSpeedExplanationTextTag", "TotalSectionDisclaimerText", "TotalSectionExchangeRateTag", "TotalSectionUi", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TotalSectionUiAllFieldsPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TotalSectionUiKt {
    public static final java.lang.String TotalSectionContainerTag = "total_section_container";
    public static final java.lang.String TotalSectionDisclaimerText = "total_section_disclaimer_text";
    public static final java.lang.String TotalSectionExchangeRateTag = "total_section_exchange_rate_text";
    public static final java.lang.String TotalSectionFeesExplanationTextTag = "total_section_fees_explanation_text";
    public static final java.lang.String TotalSectionSpeedExplanationTextTag = "total_section_speed_explanation_text";
    public static final java.lang.String TotalSectionTileTag = "total_section_tile_tag";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TotalSectionUi(final com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        int i4;
        java.lang.String str;
        androidx.compose.runtime.Composer composer5;
        androidx.compose.runtime.Composer composer6;
        int i5;
        androidx.compose.runtime.Composer composer7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalSectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-210878998);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(totalSectionModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-210878998, i3, -1, "com.paypal.oslo.feature.wallet.common.ui.TotalSectionUi (TotalSectionUi.kt:66)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize16()), TotalSectionContainerTag);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (totalSectionModel.getTransferAmount() != null) {
                    startRestartGroup.startReplaceGroup(301115245);
                    columnScopeInstance = columnScopeInstance2;
                    modifier3 = modifier4;
                    composer3 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_total, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 1, null), TotalSectionTileTag), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
                    composer3.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(301115244);
                    startRestartGroup.endReplaceGroup();
                    columnScopeInstance = columnScopeInstance2;
                    modifier3 = modifier4;
                    composer3 = startRestartGroup;
                }
                com.paypal.oslo.feature.wallet.common.model.TotalSectionItem transferAmount = totalSectionModel.getTransferAmount();
                if (transferAmount != null) {
                    composer4 = composer3;
                    composer4.startReplaceGroup(301544967);
                    com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.TotalSectionRow(transferAmount, com.paypal.pds.core.Icon.Clock.INSTANCE, null, composer4, 48, 4);
                    composer4.endReplaceGroup();
                } else {
                    composer4 = composer3;
                    composer4.startReplaceGroup(301544966);
                    composer4.endReplaceGroup();
                }
                com.paypal.oslo.feature.wallet.common.model.TotalSectionItem exchangeRate = totalSectionModel.getExchangeRate();
                if (exchangeRate != null) {
                    composer4.startReplaceGroup(301680313);
                    i4 = 0;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer4, 0);
                    com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.TotalSectionRow(exchangeRate, com.paypal.pds.core.Icon.Clock.INSTANCE, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TotalSectionExchangeRateTag), composer4, 432, 0);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(301680312);
                    composer4.endReplaceGroup();
                    i4 = 0;
                }
                com.paypal.oslo.feature.wallet.common.model.TotalSectionItem transferFees = totalSectionModel.getTransferFees();
                if (transferFees != null) {
                    composer4.startReplaceGroup(302039665);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer4, i4);
                    com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.TotalSectionRow(transferFees, com.paypal.pds.core.Icon.Clock.INSTANCE, null, composer4, 48, 4);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(302039664);
                    composer4.endReplaceGroup();
                }
                com.paypal.oslo.feature.wallet.common.model.TotalSectionItem deliverySpeed = totalSectionModel.getDeliverySpeed();
                if (deliverySpeed != null) {
                    composer4.startReplaceGroup(302280783);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer4, i4);
                    com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.TotalSectionRow(deliverySpeed, com.paypal.pds.core.Icon.Clock.INSTANCE, null, composer4, 48, 4);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(302280782);
                    composer4.endReplaceGroup();
                }
                com.paypal.oslo.feature.wallet.common.model.TotalSectionItem totalToBank = totalSectionModel.getTotalToBank();
                if (totalToBank != null) {
                    composer4.startReplaceGroup(302520723);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer4, i4);
                    com.paypal.oslo.feature.wallet.common.ui.TotalSectionRowKt.TotalSectionRow(totalToBank, com.paypal.pds.core.Icon.Clock.INSTANCE, null, composer4, 48, 4);
                    composer4.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(302520722);
                    composer4.endReplaceGroup();
                }
                if (totalSectionModel.getExchangeRateExplanation() != null) {
                    composer4.startReplaceGroup(302784254);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer4, i4);
                    java.lang.String exchangeRateExplanation = totalSectionModel.getExchangeRateExplanation();
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                    com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                    str = TotalSectionFeesExplanationTextTag;
                    composer5 = composer4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(exchangeRateExplanation, androidx.compose.ui.platform.TestTagKt.testTag(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getStart()), TotalSectionFeesExplanationTextTag), contentMuted, null, null, null, false, 0, 0, null, bodyMedium, composer4, 384, 6, 1016);
                    composer5.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(302784253);
                    composer4.endReplaceGroup();
                    str = TotalSectionFeesExplanationTextTag;
                    composer5 = composer4;
                }
                if (totalSectionModel.getTransferFees() != null && totalSectionModel.getTransferFeesExplanation() != null) {
                    composer6 = composer5;
                    composer6.startReplaceGroup(303357506);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer6, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(totalSectionModel.getTransferFeesExplanation(), androidx.compose.ui.platform.TestTagKt.testTag(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getStart()), str), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer6, 384, 6, 1016);
                    composer5.endReplaceGroup();
                } else {
                    composer6 = composer5;
                    composer6.startReplaceGroup(303738062);
                    composer6.endReplaceGroup();
                }
                java.lang.String transferTimeExplanation = totalSectionModel.getTransferTimeExplanation();
                if (transferTimeExplanation != null) {
                    composer6.startReplaceGroup(303864511);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer6, 0);
                    i5 = 0;
                    composer7 = composer6;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(transferTimeExplanation, androidx.compose.ui.platform.TestTagKt.testTag(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getStart()), TotalSectionSpeedExplanationTextTag), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer6, 384, 6, 1016);
                    composer7.endReplaceGroup();
                } else {
                    composer6.startReplaceGroup(303864510);
                    composer6.endReplaceGroup();
                    composer7 = composer6;
                    i5 = 0;
                }
                java.lang.String disclaimerText = totalSectionModel.getDisclaimerText();
                if (disclaimerText != null) {
                    androidx.compose.runtime.Composer composer8 = composer7;
                    composer8.startReplaceGroup(304288374);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer8, i5);
                    composer2 = composer8;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(disclaimerText, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TotalSectionDisclaimerText), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer8, 432, 6, 1016);
                    composer2.endReplaceGroup();
                } else {
                    androidx.compose.runtime.Composer composer9 = composer7;
                    composer9.startReplaceGroup(304288373);
                    composer9.endReplaceGroup();
                    composer2 = composer9;
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.TotalSectionUiKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.common.ui.TotalSectionUiKt.$r8$lambda$RvNljM649nk7lT6jTp6prlhqPek(com.paypal.oslo.feature.wallet.common.model.TotalSectionModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pm7eNjKxlpaZmpQEbU4UO08SwNU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-611879373);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-611879373, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.common.ui.TotalSectionUiAllFieldsPreview (TotalSectionUi.kt:169)");
            }
            TotalSectionUi(new com.paypal.oslo.feature.wallet.common.model.TotalSectionModel(new com.paypal.oslo.feature.wallet.common.model.TotalSectionItem("Transfer Amount", "$50.00 USD", false, 4, null), new com.paypal.oslo.feature.wallet.common.model.TotalSectionItem("Speed", "in seconds", true), "$0.25 minimum, $25.00 maximum", null, new com.paypal.oslo.feature.wallet.common.model.TotalSectionItem("Delivery speed", "In minutes", false, 4, null), "Your funds will appear within 30 seconds", "Visa or Mastercard debit transfers to PayPal balance typically take seconds if there are sufficient funds.", null, null, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.TotalSectionUiKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.TotalSectionUiKt.$r8$lambda$Pm7eNjKxlpaZmpQEbU4UO08SwNU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RvNljM649nk7lT6jTp6prlhqPek(com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TotalSectionUi(totalSectionModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
