package com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002"}, d2 = {"", "FeeDisclaimerText", "(Landroidx/compose/runtime/Composer;I)V", "AccountDisclaimerText"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BalanceTermsDisclaimerKt {
    public static final void FeeDisclaimerText(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1054602381);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1054602381, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.FeeDisclaimerText (BalanceTermsDisclaimer.kt:33)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_fee_disclaimer, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermsDisclaimerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermsDisclaimerKt.$r8$lambda$SsMu1T7S7ghjDZmQbzCiD0Rm49o(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AccountDisclaimerText(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-830714068);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-830714068, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.AccountDisclaimerText (BalanceTermsDisclaimer.kt:44)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_legal_disclaimer_link_program_banks, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_legal_disclaimer_link_program_bank, startRestartGroup, 0);
            final java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_no_overdraft, startRestartGroup, 0);
            com.paypal.pds.core.RichText rememberRichTextWithLinks = com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.rememberRichTextWithLinks(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_account_disclaimer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(stringResource, com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlProgramBanks), kotlin.TuplesKt.to(stringResource2, com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlProgramBanks)}), new java.lang.Object[]{stringResource, stringResource2}, startRestartGroup, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
            com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
            boolean changed = startRestartGroup.changed(stringResource3);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermsDisclaimerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermsDisclaimerKt.$r8$lambda$bMZHFhMRZUo84hsKZe8vAm2268c(stringResource3, (com.paypal.pds.core.Builder) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue), m1708paddingVpY3zN4$default, null, null, null, null, false, 0, 0, null, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, null, startRestartGroup, 0, 48, 6140);
            com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.RichTextLabel(rememberRichTextWithLinks, com.paypal.pds.core.Typography.BodySmall.INSTANCE, null, composer2, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermsDisclaimerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.balanceterms.ui.BalanceTermsDisclaimerKt.$r8$lambda$o9UnLLqVYfoA_r5WdR26Wpa54t4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SsMu1T7S7ghjDZmQbzCiD0Rm49o(int i, androidx.compose.runtime.Composer composer, int i2) {
        FeeDisclaimerText(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bMZHFhMRZUo84hsKZe8vAm2268c(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, true, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o9UnLLqVYfoA_r5WdR26Wpa54t4(int i, androidx.compose.runtime.Composer composer, int i2) {
        AccountDisclaimerText(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
