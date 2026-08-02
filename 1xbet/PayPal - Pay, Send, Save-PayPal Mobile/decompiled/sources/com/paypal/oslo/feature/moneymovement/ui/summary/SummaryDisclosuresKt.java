package com.paypal.oslo.feature.moneymovement.ui.summary;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aB\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"ConversionMethodDisclosure", "", "method", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;", "onLinkClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/ConversionMethod;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisclosureRow", "disclosure", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosure;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "tag", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosure;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaypalLinkTermsUrl", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SummaryDisclosuresKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConversionMethodDisclosure(final com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.core.RichText richText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1132525972);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(conversionMethod) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1132525972, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.ConversionMethodDisclosure (SummaryDisclosures.kt:41)");
                }
                if (conversionMethod instanceof com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.PayPal) {
                    startRestartGroup.startReplaceGroup(-1730725790);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_conversion_disclaimer, new java.lang.Object[]{((com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.PayPal) conversionMethod).getExchangeRate()}, startRestartGroup, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_conversion_disclaimer_link, startRestartGroup, 0);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(stringResource);
                    sb.append(" ");
                    sb.append(stringResource2);
                    richText = com.paypal.pds.core.RichTextKt.toRichText(sb.toString(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_conversion_disclaimer_link, startRestartGroup, 0), "conversion-options")));
                    startRestartGroup.endReplaceGroup();
                } else if (conversionMethod instanceof com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.PayPalRateOnly) {
                    startRestartGroup.startReplaceGroup(-1730709322);
                    richText = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_conversion_disclaimer, new java.lang.Object[]{((com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.PayPalRateOnly) conversionMethod).getExchangeRate()}, startRestartGroup, 0), kotlin.collections.CollectionsKt.emptyList());
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(conversionMethod instanceof com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.Issuer)) {
                        startRestartGroup.startReplaceGroup(-1730726813);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1730700225);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_issuer_summary_conversion_disclaimer, startRestartGroup, 0);
                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_issuer_summary_conversion_disclaimer_link, startRestartGroup, 0);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(stringResource3);
                    sb2.append(" ");
                    sb2.append(stringResource4);
                    richText = com.paypal.pds.core.RichTextKt.toRichText(sb2.toString(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_issuer_summary_conversion_disclaimer_link, startRestartGroup, 0), "issuer-conversion")));
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt.$r8$lambda$yqjh2udFm33Vyttew23Prejviss(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, modifier3, contentMuted, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodySmall, null, startRestartGroup, ((i3 >> 3) & 112) | 384, 48, 5112);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt.$r8$lambda$2HxQYx2ZyUVjqyKW2193YvX3cBo(com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.this, function0, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisclosureRow(final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure summaryDisclosure, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summaryDisclosure, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(80663434);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(summaryDisclosure) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(80663434, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.DisclosureRow (SummaryDisclosures.kt:93)");
                }
                switch (com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt.WhenMappings.$EnumSwitchMapping$0[summaryDisclosure.getType().ordinal()]) {
                    case 1:
                        startRestartGroup.startReplaceGroup(-2136968328);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_FRAUDULENT_ACTIVITY_DISCLOSURES, startRestartGroup, 0), modifier3, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, ((i3 >> 3) & 112) | 384, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 2:
                        startRestartGroup.startReplaceGroup(-2136576736);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_FOREIGN_TAX_DISCLOSURES, startRestartGroup, 0), modifier3, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, ((i3 >> 3) & 112) | 384, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 3:
                        startRestartGroup.startReplaceGroup(-2136164157);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_payment_link_generic, startRestartGroup, 0), modifier3, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, ((i3 >> 3) & 112) | 384, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 4:
                        startRestartGroup.startReplaceGroup(-2135765590);
                        com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_payment_link_generic_with_term, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_payment_link_with_term_link, startRestartGroup, 0), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.UiConstants.PAYPAL_LINK_TERMS_TAG)));
                        com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                        com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                        z = (i3 & 112) == 32;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt.$r8$lambda$Rj84b0H1BdXMNDxqcBPwrK6FxGw(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, modifier3, contentMuted, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodySmall, null, startRestartGroup, ((i3 >> 3) & 112) | 384, 48, 5112);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 5:
                        startRestartGroup.startReplaceGroup(-2135111769);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_payment_link_ach, startRestartGroup, 0), modifier3, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, ((i3 >> 3) & 112) | 384, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 6:
                        startRestartGroup.startReplaceGroup(-2134739118);
                        com.paypal.pds.core.RichText richText2 = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_payment_link_with_term, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_payment_link_with_term_link, startRestartGroup, 0), com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.UiConstants.PAYPAL_LINK_TERMS_TAG)));
                        com.paypal.pds.core.Typography.BodySmall bodySmall2 = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                        com.paypal.pds.core.Color.ContentMuted contentMuted2 = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                        z = (i3 & 112) == 32;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt.$r8$lambda$LG6iYqJWJ2awm4JBDj8ctNDFJ9w(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText2, modifier3, contentMuted2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall2, null, startRestartGroup, ((i3 >> 3) & 112) | 384, 48, 5112);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 7:
                        startRestartGroup.startReplaceGroup(-2134074447);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_PRE_TRANSACTION_REMITTANCE_DISCLOSURES, startRestartGroup, 0), modifier3, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, ((i3 >> 3) & 112) | 384, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 8:
                        startRestartGroup.startReplaceGroup(-2133765842);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 9:
                        startRestartGroup.startReplaceGroup(-2133490376);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.moneymovement.R.string.feature_money_movement_exchange_rate_conversion_spread, startRestartGroup, 0), modifier3, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, ((i3 >> 3) & 112) | 384, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                        break;
                    case 10:
                        startRestartGroup.startReplaceGroup(-2133176160);
                        startRestartGroup.endReplaceGroup();
                        break;
                    default:
                        startRestartGroup.startReplaceGroup(208157358);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.summary.SummaryDisclosuresKt.m15697$r8$lambda$tyewkfuUQSn8wUGmvb4UjpIOfA(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure.this, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2HxQYx2ZyUVjqyKW2193YvX3cBo(com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ConversionMethodDisclosure(conversionMethod, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LG6iYqJWJ2awm4JBDj8ctNDFJ9w(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rj84b0H1BdXMNDxqcBPwrK6FxGw(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tyewkfuUQSn8wUGmvb4UjpIOf-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15697$r8$lambda$tyewkfuUQSn8wUGmvb4UjpIOfA(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure summaryDisclosure, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DisclosureRow(summaryDisclosure, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yqjh2udFm33Vyttew23Prejviss(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.REGULATORY_REVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.TAX_DISCLOSURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_GENERIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_GENERIC_WITH_TERM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_ACH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_WITH_TERM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.CANCELLATION_POLICY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.CONVERSION_SPREAD.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.CONVERSION_METHOD.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
