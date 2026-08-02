package com.paypal.oslo.feature.wallet.fifo.common.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "selectedFi", "", "amount", "Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;", "getTotalSectionModel", "(Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TotalSectionUtilsKt {
    public static final com.paypal.oslo.feature.wallet.common.model.TotalSectionModel getTotalSectionModel(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str2;
        java.lang.String obj;
        java.lang.String stringResource;
        java.lang.String value;
        java.lang.String stringResource2;
        java.lang.String str3 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1208237739, i, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.getTotalSectionModel (TotalSectionUtils.kt:37)");
        }
        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_amount, composer, 0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" USD");
        com.paypal.oslo.feature.wallet.common.model.TotalSectionItem totalSectionItem = new com.paypal.oslo.feature.wallet.common.model.TotalSectionItem(stringResource3, sb.toString(), false, 4, null);
        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_estimated_delivery, composer, 0);
        int i2 = i & 14;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2044942728, i2, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.getEstimatedDeliveryText (TotalSectionUtils.kt:127)");
        }
        java.lang.Double d = null;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = fundingInstrumentUiModel != null ? fundingInstrumentUiModel.getTransferSpeed() : null;
        int i3 = transferSpeed == null ? -1 : com.paypal.oslo.feature.wallet.fifo.common.ui.TotalSectionUtilsKt.WhenMappings.$EnumSwitchMapping$1[transferSpeed.ordinal()];
        if (i3 != -1) {
            if (i3 == 1) {
                composer.startReplaceGroup(-1905054878);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_speed_instant, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    composer.startReplaceGroup(-1905056867);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1905051901);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_speed_standard, composer, 0);
                composer.endReplaceGroup();
            }
            str2 = stringResource2;
        } else {
            composer.startReplaceGroup(1073006838);
            composer.endReplaceGroup();
            str2 = "";
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        com.paypal.oslo.feature.wallet.common.model.TotalSectionItem totalSectionItem2 = new com.paypal.oslo.feature.wallet.common.model.TotalSectionItem(stringResource4, str2, false, 4, null);
        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_fee, composer, 0);
        com.paypal.oslo.feature.wallet.common.domain.model.Money fee = fundingInstrumentUiModel != null ? fundingInstrumentUiModel.getFee() : null;
        composer.startReplaceGroup(-1294309823);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1294309823, 0, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.getFeeValue (TotalSectionUtils.kt:66)");
        }
        if (fee == null) {
            composer.startReplaceGroup(1432497895);
            obj = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_no_fee, composer, 0);
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.startReplaceGroup(1708777378);
            composer.endReplaceGroup();
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(fee.getValue());
            if (doubleOrNull == null || !kotlin.jvm.internal.Intrinsics.areEqual(doubleOrNull, 0.0d)) {
                composer.startReplaceGroup(1432734735);
                composer.endReplaceGroup();
                java.lang.String currencyCode = fee.getCurrencyCode();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(doubleOrNull);
                sb2.append(" ");
                sb2.append(currencyCode);
                obj = sb2.toString();
            } else {
                composer.startReplaceGroup(1432662846);
                obj = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_no_fee, composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        composer.endReplaceGroup();
        com.paypal.oslo.feature.wallet.common.model.TotalSectionItem totalSectionItem3 = new com.paypal.oslo.feature.wallet.common.model.TotalSectionItem(stringResource5, obj, false);
        int i4 = i & 126;
        composer.startReplaceGroup(-138254952);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-138254952, i4, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.getDisclaimerText (TotalSectionUtils.kt:90)");
        }
        if (fundingInstrumentUiModel != null) {
            int i5 = com.paypal.oslo.feature.wallet.fifo.common.ui.TotalSectionUtilsKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentUiModel.getType().ordinal()];
            if (i5 == 1) {
                composer.startReplaceGroup(280983749);
                str3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_money_one_time_instant_disclaimer, composer, 0);
                composer.endReplaceGroup();
            } else if (i5 != 2) {
                composer.startReplaceGroup(121668358);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(120704818);
                com.paypal.oslo.feature.wallet.common.domain.model.Money maxLimit = fundingInstrumentUiModel.getMaxLimit();
                if (maxLimit != null && (value = maxLimit.getValue()) != null) {
                    d = kotlin.text.StringsKt.toDoubleOrNull(value);
                }
                java.lang.Double doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(str);
                boolean z = (d == null || doubleOrNull2 == null || doubleOrNull2.doubleValue() > d.doubleValue()) ? false : true;
                if (d == null || d.doubleValue() <= 0.0d || z) {
                    composer.startReplaceGroup(121317626);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(z ? com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_money_one_time_standard_disclaimer : com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_money_one_time_standard_disclaimer, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(121010075);
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_money_iach_disclaimer_above_threshold_amount, composer, 0);
                    java.lang.String currencyCode2 = fundingInstrumentUiModel.getMaxLimit().getCurrencyCode();
                    java.lang.String value2 = fundingInstrumentUiModel.getMaxLimit().getValue();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(currencyCode2);
                    sb3.append(value2);
                    stringResource = java.lang.String.format(stringResource6, java.util.Arrays.copyOf(new java.lang.Object[]{sb3.toString(), ""}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringResource, "");
                    composer.endReplaceGroup();
                }
                str3 = stringResource;
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel = new com.paypal.oslo.feature.wallet.common.model.TotalSectionModel(totalSectionItem, totalSectionItem3, null, null, totalSectionItem2, null, str3, null, null, 428, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return totalSectionModel;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
