package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakePaymentValidator;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "uiModel", "revalidateIfNeeded", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "validateForm", "validateAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakePaymentValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MakePaymentValidator() {
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel revalidateIfNeeded(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel uiModel) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
        if (uiModel.getFormAlertMessage() == null) {
            return uiModel;
        }
        copy = r1.copy((r42 & 1) != 0 ? r1.content : null, (r42 & 2) != 0 ? r1.planStatus : null, (r42 & 4) != 0 ? r1.creditProductIdentifier : null, (r42 & 8) != 0 ? r1.creditAccountId : null, (r42 & 16) != 0 ? r1.currentDueAmount : null, (r42 & 32) != 0 ? r1.isAutopayEnabled : false, (r42 & 64) != 0 ? r1.paymentOptions : null, (r42 & 128) != 0 ? r1.customAmountOption : null, (r42 & 256) != 0 ? r1.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? r1.defaultFundingInstrument : null, (r42 & 1024) != 0 ? r1.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? r1.termsAndConditions : null, (r42 & 4096) != 0 ? r1.currencyCode : null, (r42 & 8192) != 0 ? r1.selectedAmount : null, (r42 & 16384) != 0 ? r1.selectedFundingInstrument : null, (r42 & 32768) != 0 ? r1.processingMakeAPayment : false, (r42 & 65536) != 0 ? r1.formAlertMessage : null, (r42 & 131072) != 0 ? r1.customAmountAlertMessage : null, (r42 & 262144) != 0 ? r1.isCustomAmountInError : false, (r42 & 524288) != 0 ? r1.selectedIndex : null, (r42 & 1048576) != 0 ? r1.fundingInstruments : null, (r42 & 2097152) != 0 ? r1.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? r1.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? validateForm(uiModel).locale : null);
        return copy;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel validateForm(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel uiModel) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy;
        java.lang.String value;
        java.lang.Double doubleOrNull;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy2;
        java.lang.String value2;
        java.lang.Double doubleOrNull2;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy3;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money rawAmount = uiModel.getRawAmount();
        if (rawAmount == null || rawAmount.getValue().length() <= 0) {
            rawAmount = null;
        }
        if (rawAmount != null) {
            if (uiModel.getCurrentFundingInstrument() != null) {
                com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument currentFundingInstrument = uiModel.getCurrentFundingInstrument();
                if (currentFundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) {
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount = ((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) currentFundingInstrument).getAmount();
                    double doubleValue = (amount == null || (value2 = amount.getValue()) == null || (doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(value2)) == null) ? 0.0d : doubleOrNull2.doubleValue();
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money rawAmount2 = uiModel.getRawAmount();
                    if (rawAmount2 != null && (value = rawAmount2.getValue()) != null && (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value)) != null && doubleOrNull.doubleValue() > doubleValue) {
                        copy2 = uiModel.copy((r42 & 1) != 0 ? uiModel.content : null, (r42 & 2) != 0 ? uiModel.planStatus : null, (r42 & 4) != 0 ? uiModel.creditProductIdentifier : null, (r42 & 8) != 0 ? uiModel.creditAccountId : null, (r42 & 16) != 0 ? uiModel.currentDueAmount : null, (r42 & 32) != 0 ? uiModel.isAutopayEnabled : false, (r42 & 64) != 0 ? uiModel.paymentOptions : null, (r42 & 128) != 0 ? uiModel.customAmountOption : null, (r42 & 256) != 0 ? uiModel.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? uiModel.defaultFundingInstrument : null, (r42 & 1024) != 0 ? uiModel.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? uiModel.termsAndConditions : null, (r42 & 4096) != 0 ? uiModel.currencyCode : null, (r42 & 8192) != 0 ? uiModel.selectedAmount : null, (r42 & 16384) != 0 ? uiModel.selectedFundingInstrument : null, (r42 & 32768) != 0 ? uiModel.processingMakeAPayment : false, (r42 & 65536) != 0 ? uiModel.formAlertMessage : uiModel.getContent().getValidationContent().getInsufficientBalance(), (r42 & 131072) != 0 ? uiModel.customAmountAlertMessage : null, (r42 & 262144) != 0 ? uiModel.isCustomAmountInError : false, (r42 & 524288) != 0 ? uiModel.selectedIndex : null, (r42 & 1048576) != 0 ? uiModel.fundingInstruments : null, (r42 & 2097152) != 0 ? uiModel.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? uiModel.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? uiModel.locale : null);
                        return copy2;
                    }
                }
                copy = uiModel.copy((r42 & 1) != 0 ? uiModel.content : null, (r42 & 2) != 0 ? uiModel.planStatus : null, (r42 & 4) != 0 ? uiModel.creditProductIdentifier : null, (r42 & 8) != 0 ? uiModel.creditAccountId : null, (r42 & 16) != 0 ? uiModel.currentDueAmount : null, (r42 & 32) != 0 ? uiModel.isAutopayEnabled : false, (r42 & 64) != 0 ? uiModel.paymentOptions : null, (r42 & 128) != 0 ? uiModel.customAmountOption : null, (r42 & 256) != 0 ? uiModel.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? uiModel.defaultFundingInstrument : null, (r42 & 1024) != 0 ? uiModel.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? uiModel.termsAndConditions : null, (r42 & 4096) != 0 ? uiModel.currencyCode : null, (r42 & 8192) != 0 ? uiModel.selectedAmount : null, (r42 & 16384) != 0 ? uiModel.selectedFundingInstrument : null, (r42 & 32768) != 0 ? uiModel.processingMakeAPayment : true, (r42 & 65536) != 0 ? uiModel.formAlertMessage : null, (r42 & 131072) != 0 ? uiModel.customAmountAlertMessage : null, (r42 & 262144) != 0 ? uiModel.isCustomAmountInError : false, (r42 & 524288) != 0 ? uiModel.selectedIndex : null, (r42 & 1048576) != 0 ? uiModel.fundingInstruments : null, (r42 & 2097152) != 0 ? uiModel.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? uiModel.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? uiModel.locale : null);
                return copy;
            }
            copy3 = uiModel.copy((r42 & 1) != 0 ? uiModel.content : null, (r42 & 2) != 0 ? uiModel.planStatus : null, (r42 & 4) != 0 ? uiModel.creditProductIdentifier : null, (r42 & 8) != 0 ? uiModel.creditAccountId : null, (r42 & 16) != 0 ? uiModel.currentDueAmount : null, (r42 & 32) != 0 ? uiModel.isAutopayEnabled : false, (r42 & 64) != 0 ? uiModel.paymentOptions : null, (r42 & 128) != 0 ? uiModel.customAmountOption : null, (r42 & 256) != 0 ? uiModel.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? uiModel.defaultFundingInstrument : null, (r42 & 1024) != 0 ? uiModel.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? uiModel.termsAndConditions : null, (r42 & 4096) != 0 ? uiModel.currencyCode : null, (r42 & 8192) != 0 ? uiModel.selectedAmount : null, (r42 & 16384) != 0 ? uiModel.selectedFundingInstrument : null, (r42 & 32768) != 0 ? uiModel.processingMakeAPayment : false, (r42 & 65536) != 0 ? uiModel.formAlertMessage : uiModel.getContent().getValidationContent().getMissingFundingInstrument(), (r42 & 131072) != 0 ? uiModel.customAmountAlertMessage : null, (r42 & 262144) != 0 ? uiModel.isCustomAmountInError : false, (r42 & 524288) != 0 ? uiModel.selectedIndex : null, (r42 & 1048576) != 0 ? uiModel.fundingInstruments : null, (r42 & 2097152) != 0 ? uiModel.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? uiModel.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? uiModel.locale : null);
            return copy3;
        }
        copy4 = uiModel.copy((r42 & 1) != 0 ? uiModel.content : null, (r42 & 2) != 0 ? uiModel.planStatus : null, (r42 & 4) != 0 ? uiModel.creditProductIdentifier : null, (r42 & 8) != 0 ? uiModel.creditAccountId : null, (r42 & 16) != 0 ? uiModel.currentDueAmount : null, (r42 & 32) != 0 ? uiModel.isAutopayEnabled : false, (r42 & 64) != 0 ? uiModel.paymentOptions : null, (r42 & 128) != 0 ? uiModel.customAmountOption : null, (r42 & 256) != 0 ? uiModel.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? uiModel.defaultFundingInstrument : null, (r42 & 1024) != 0 ? uiModel.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? uiModel.termsAndConditions : null, (r42 & 4096) != 0 ? uiModel.currencyCode : null, (r42 & 8192) != 0 ? uiModel.selectedAmount : null, (r42 & 16384) != 0 ? uiModel.selectedFundingInstrument : null, (r42 & 32768) != 0 ? uiModel.processingMakeAPayment : false, (r42 & 65536) != 0 ? uiModel.formAlertMessage : uiModel.getContent().getValidationContent().getMissingAmount(), (r42 & 131072) != 0 ? uiModel.customAmountAlertMessage : null, (r42 & 262144) != 0 ? uiModel.isCustomAmountInError : false, (r42 & 524288) != 0 ? uiModel.selectedIndex : null, (r42 & 1048576) != 0 ? uiModel.fundingInstruments : null, (r42 & 2097152) != 0 ? uiModel.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? uiModel.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? uiModel.locale : null);
        return copy4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel validateAmount(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel uiModel) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy;
        java.lang.String value;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel;
        kotlin.Pair pair;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy2;
        java.lang.String value2;
        java.lang.String value3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money rawAmount = uiModel.getRawAmount();
        if (rawAmount != null && (value = rawAmount.getValue()) != null) {
            if (value.length() <= 0) {
                value = null;
            }
            if (value != null) {
                double parseDouble = java.lang.Double.parseDouble(value);
                com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument currentFundingInstrument = uiModel.getCurrentFundingInstrument();
                if (currentFundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) {
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount = ((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) currentFundingInstrument).getAmount();
                    if (parseDouble > ((amount == null || (value3 = amount.getValue()) == null) ? 0.0d : java.lang.Double.parseDouble(value3))) {
                        makeAPaymentUiModel = uiModel.copy((r42 & 1) != 0 ? uiModel.content : null, (r42 & 2) != 0 ? uiModel.planStatus : null, (r42 & 4) != 0 ? uiModel.creditProductIdentifier : null, (r42 & 8) != 0 ? uiModel.creditAccountId : null, (r42 & 16) != 0 ? uiModel.currentDueAmount : null, (r42 & 32) != 0 ? uiModel.isAutopayEnabled : false, (r42 & 64) != 0 ? uiModel.paymentOptions : null, (r42 & 128) != 0 ? uiModel.customAmountOption : null, (r42 & 256) != 0 ? uiModel.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? uiModel.defaultFundingInstrument : null, (r42 & 1024) != 0 ? uiModel.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? uiModel.termsAndConditions : null, (r42 & 4096) != 0 ? uiModel.currencyCode : null, (r42 & 8192) != 0 ? uiModel.selectedAmount : null, (r42 & 16384) != 0 ? uiModel.selectedFundingInstrument : null, (r42 & 32768) != 0 ? uiModel.processingMakeAPayment : false, (r42 & 65536) != 0 ? uiModel.formAlertMessage : null, (r42 & 131072) != 0 ? uiModel.customAmountAlertMessage : null, (r42 & 262144) != 0 ? uiModel.isCustomAmountInError : false, (r42 & 524288) != 0 ? uiModel.selectedIndex : null, (r42 & 1048576) != 0 ? uiModel.fundingInstruments : null, (r42 & 2097152) != 0 ? uiModel.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? uiModel.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? uiModel.locale : null);
                        if (makeAPaymentUiModel == null) {
                            return makeAPaymentUiModel;
                        }
                        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption = uiModel.getCustomAmountOption();
                        if (customAmountOption == null) {
                            return uiModel;
                        }
                        java.lang.Double nextPaymentAmount = uiModel.getNextPaymentAmount();
                        double parseDouble2 = java.lang.Double.parseDouble(customAmountOption.getMinAmount().getValue());
                        double parseDouble3 = java.lang.Double.parseDouble(customAmountOption.getMaxAmount().getValue());
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money currentDueAmount = uiModel.getCurrentDueAmount();
                        java.lang.Double valueOf = (currentDueAmount == null || (value2 = currentDueAmount.getValue()) == null) ? null : java.lang.Double.valueOf(java.lang.Double.parseDouble(value2));
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent validationContent = uiModel.getContent().getValidationContent();
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        if (parseDouble < parseDouble2) {
                            pair = kotlin.TuplesKt.to(validationContent.getAmountBelowMinimum(), bool);
                        } else if (parseDouble > parseDouble3) {
                            pair = kotlin.TuplesKt.to(validationContent.getAmountAboveMaximum(), bool);
                        } else if (parseDouble == parseDouble3) {
                            pair = kotlin.TuplesKt.to(validationContent.getAmountEqualsMaximum(), java.lang.Boolean.FALSE);
                        } else if (nextPaymentAmount != null && parseDouble < nextPaymentAmount.doubleValue()) {
                            pair = kotlin.TuplesKt.to(validationContent.getAmountBelowInfo(), java.lang.Boolean.FALSE);
                        } else if (nextPaymentAmount != null && parseDouble > nextPaymentAmount.doubleValue() && parseDouble < parseDouble3) {
                            pair = kotlin.TuplesKt.to(validationContent.getAmountExceedsInfo(), java.lang.Boolean.FALSE);
                        } else if (valueOf != null && parseDouble > valueOf.doubleValue()) {
                            pair = kotlin.TuplesKt.to(validationContent.getAmountExceedsInfo(), java.lang.Boolean.FALSE);
                        } else if (valueOf != null && parseDouble < valueOf.doubleValue()) {
                            pair = kotlin.TuplesKt.to(validationContent.getAmountBelowInfo(), java.lang.Boolean.FALSE);
                        } else {
                            pair = kotlin.TuplesKt.to(null, java.lang.Boolean.FALSE);
                        }
                        copy2 = uiModel.copy((r42 & 1) != 0 ? uiModel.content : null, (r42 & 2) != 0 ? uiModel.planStatus : null, (r42 & 4) != 0 ? uiModel.creditProductIdentifier : null, (r42 & 8) != 0 ? uiModel.creditAccountId : null, (r42 & 16) != 0 ? uiModel.currentDueAmount : null, (r42 & 32) != 0 ? uiModel.isAutopayEnabled : false, (r42 & 64) != 0 ? uiModel.paymentOptions : null, (r42 & 128) != 0 ? uiModel.customAmountOption : null, (r42 & 256) != 0 ? uiModel.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? uiModel.defaultFundingInstrument : null, (r42 & 1024) != 0 ? uiModel.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? uiModel.termsAndConditions : null, (r42 & 4096) != 0 ? uiModel.currencyCode : null, (r42 & 8192) != 0 ? uiModel.selectedAmount : null, (r42 & 16384) != 0 ? uiModel.selectedFundingInstrument : null, (r42 & 32768) != 0 ? uiModel.processingMakeAPayment : false, (r42 & 65536) != 0 ? uiModel.formAlertMessage : null, (r42 & 131072) != 0 ? uiModel.customAmountAlertMessage : (com.paypal.oslo.core.commonui.utils.RefText) pair.component1(), (r42 & 262144) != 0 ? uiModel.isCustomAmountInError : ((java.lang.Boolean) pair.component2()).booleanValue(), (r42 & 524288) != 0 ? uiModel.selectedIndex : null, (r42 & 1048576) != 0 ? uiModel.fundingInstruments : null, (r42 & 2097152) != 0 ? uiModel.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? uiModel.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? uiModel.locale : null);
                        return copy2;
                    }
                }
                makeAPaymentUiModel = null;
                if (makeAPaymentUiModel == null) {
                }
            }
        }
        copy = uiModel.copy((r42 & 1) != 0 ? uiModel.content : null, (r42 & 2) != 0 ? uiModel.planStatus : null, (r42 & 4) != 0 ? uiModel.creditProductIdentifier : null, (r42 & 8) != 0 ? uiModel.creditAccountId : null, (r42 & 16) != 0 ? uiModel.currentDueAmount : null, (r42 & 32) != 0 ? uiModel.isAutopayEnabled : false, (r42 & 64) != 0 ? uiModel.paymentOptions : null, (r42 & 128) != 0 ? uiModel.customAmountOption : null, (r42 & 256) != 0 ? uiModel.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? uiModel.defaultFundingInstrument : null, (r42 & 1024) != 0 ? uiModel.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? uiModel.termsAndConditions : null, (r42 & 4096) != 0 ? uiModel.currencyCode : null, (r42 & 8192) != 0 ? uiModel.selectedAmount : null, (r42 & 16384) != 0 ? uiModel.selectedFundingInstrument : null, (r42 & 32768) != 0 ? uiModel.processingMakeAPayment : false, (r42 & 65536) != 0 ? uiModel.formAlertMessage : null, (r42 & 131072) != 0 ? uiModel.customAmountAlertMessage : null, (r42 & 262144) != 0 ? uiModel.isCustomAmountInError : false, (r42 & 524288) != 0 ? uiModel.selectedIndex : null, (r42 & 1048576) != 0 ? uiModel.fundingInstruments : null, (r42 & 2097152) != 0 ? uiModel.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? uiModel.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? uiModel.locale : null);
        return copy;
    }
}
