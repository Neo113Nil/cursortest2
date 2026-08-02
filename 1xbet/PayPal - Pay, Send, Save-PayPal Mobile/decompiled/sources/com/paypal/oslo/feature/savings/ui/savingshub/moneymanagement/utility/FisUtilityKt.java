package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.utility;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "financialInstrument", "", "getFiSubText", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FisUtilityKt {
    public static final java.lang.String getFiSubText(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        java.lang.String last4Digits;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyMovementFiDTO, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(253524447, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.utility.getFiSubText (FisUtility.kt:22)");
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto = moneyMovementFiDTO.getSource().getFiDto();
        int i2 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.utility.FisUtilityKt.WhenMappings.$EnumSwitchMapping$0[moneyMovementFiDTO.getSource().getInstrumentType().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                composer.startReplaceGroup(-1176128607);
                int i3 = com.paypal.oslo.feature.savings.R.string.feature_savings_fi_selection_debit_masked;
                last4Digits = fiDto != null ? fiDto.getLast4Digits() : null;
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, new java.lang.Object[]{last4Digits != null ? last4Digits : ""}, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (i2 != 3) {
                    composer.startReplaceGroup(-1176136786);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-2100059471);
                java.lang.String acctType = fiDto != null ? fiDto.getAcctType() : null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(acctType, "SAVINGS")) {
                    composer.startReplaceGroup(-1176120971);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_fi_selection_savings_bank_masked, new java.lang.Object[]{fiDto.getLast4Digits()}, composer, 0);
                    composer.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(acctType, com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING)) {
                    composer.startReplaceGroup(-1176114922);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_fi_selection_checking_bank_masked, new java.lang.Object[]{fiDto.getLast4Digits()}, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1176109288);
                    int i4 = com.paypal.oslo.feature.savings.R.string.feature_savings_fi_selection_bank_masked;
                    last4Digits = fiDto != null ? fiDto.getLast4Digits() : null;
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, new java.lang.Object[]{last4Digits != null ? last4Digits : ""}, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
        } else {
            composer.startReplaceGroup(-1176134752);
            int i5 = com.paypal.oslo.feature.savings.R.string.feature_savings_fi_selection_available_balance;
            java.lang.String availableBalance = moneyMovementFiDTO.getSource().getAvailableBalance();
            if (availableBalance == null) {
                availableBalance = "$0.00";
            }
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i5, new java.lang.Object[]{availableBalance}, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.BANK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
