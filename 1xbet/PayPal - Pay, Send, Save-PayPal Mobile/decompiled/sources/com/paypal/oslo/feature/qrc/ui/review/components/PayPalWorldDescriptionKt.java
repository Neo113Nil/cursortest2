package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "uiModel", "", "PayPalWorldDescription", "(Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PayPalWorldDescriptionKt {
    public static final void PayPalWorldDescription(final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(856171954);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(paymentReviewUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(856171954, i2, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescription (PayPalWorldDescription.kt:33)");
            }
            if (paymentReviewUiModel.isPayPalWorld()) {
                startRestartGroup.startReplaceGroup(-1591965514);
                int i3 = com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_txt_ppw_conversion;
                com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionData = paymentReviewUiModel.getCurrencyConversionData();
                java.lang.String baseCurrencyCode = currencyConversionData != null ? currencyConversionData.getBaseCurrencyCode() : null;
                com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionData2 = paymentReviewUiModel.getCurrencyConversionData();
                java.lang.String targetCurrencyCode = currencyConversionData2 != null ? currencyConversionData2.getTargetCurrencyCode() : null;
                com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionData3 = paymentReviewUiModel.getCurrencyConversionData();
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, new java.lang.Object[]{com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.getFxRateConversionText(baseCurrencyCode, targetCurrencyCode, currencyConversionData3 != null ? currencyConversionData3.getExchangeRateValue() : null)}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.PPW_CONVERSION_TEXT), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1000);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1591227280);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionKt.$r8$lambda$faDTE6C9sG5TD0RLGqsmbmG23Is(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2h9w7BnruVvicCJeqRa5_jmN8Js(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1090432433);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1090432433, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionHiddenPreview (PayPalWorldDescription.kt:65)");
            }
            PayPalWorldDescription(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_ONLY_FI(), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionKt.$r8$lambda$2h9w7BnruVvicCJeqRa5_jmN8Js(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cjm0VOj4I7rw7ThLAIkc4x_HZtk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1621546528);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1621546528, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionShownPreview (PayPalWorldDescription.kt:57)");
            }
            PayPalWorldDescription(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_PPW(), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionKt.$r8$lambda$cjm0VOj4I7rw7ThLAIkc4x_HZtk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$faDTE6C9sG5TD0RLGqsmbmG23Is(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        PayPalWorldDescription(paymentReviewUiModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
