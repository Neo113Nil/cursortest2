package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "TermsAgreementText", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TermsAgreementTextKt {
    public static final void TermsAgreementText(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-178194389);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-178194389, i, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.TermsAgreementText (TermsAgreementText.kt:37)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_link_account_tc, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_link_cardholder_agreement, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_link_privacy_notice, startRestartGroup, 0);
            com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.RichTextLabel(com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.rememberRichTextWithLinks(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_balance_terms_agreement, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(stringResource, com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlPaypalBalanceTerms), kotlin.TuplesKt.to(stringResource2, com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlPaypalDebitMasterCard), kotlin.TuplesKt.to(stringResource3, com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.UrlBancorpPrivacy)}), new java.lang.Object[]{stringResource, stringResource2, stringResource3}, startRestartGroup, 0), com.paypal.pds.core.Typography.BodySmall.INSTANCE, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.TermsAgreementTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.TermsAgreementTextKt.$r8$lambda$4_kXO4IkRjHHwyNVdBS7Ln4YCLQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4_kXO4IkRjHHwyNVdBS7Ln4YCLQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        TermsAgreementText(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
