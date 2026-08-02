package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentUiModelMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty empty;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        java.lang.Integer stringId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        java.lang.String id = fundingInstrument.getId();
        boolean z = fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank;
        if (z) {
            java.lang.String name2 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument).getName();
            if (name2 != null) {
                plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name2);
            } else {
                empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                plainString = empty;
            }
        } else {
            if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
                empty = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_confirmation_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                if (!(fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.String name3 = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument).getName();
                if (name3 != null) {
                    plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name3);
                } else {
                    empty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                }
            }
            plainString = empty;
        }
        if (z) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument;
            java.lang.String lastNChars = fundingInstrumentBank.getLastNChars();
            if (lastNChars != null) {
                int i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type = fundingInstrumentBank.getType();
                if (type == null || (stringId = type.getStringId()) == null || (uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(stringId.intValue())) == null) {
                    uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
                }
                stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i, new java.lang.Object[]{uiString2, lastNChars}, null, false, 12, null);
            } else {
                stringResWithParameter = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
            }
        } else if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount balance = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) fundingInstrument).getBalance();
            if (balance != null) {
                stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available, new java.lang.Object[]{balance.getValue()}, null, false, 12, null);
            } else {
                stringResWithParameter = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
            }
        } else {
            if (!(fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            int i2 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_last_four_account;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument;
            java.lang.Integer stringId2 = fundingInstrumentCard.getProductClass().getStringId();
            if (stringId2 == null || (uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(stringId2.intValue())) == null) {
                uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE;
            }
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i2, new java.lang.Object[]{uiString, fundingInstrumentCard.getLastNChars()}, null, false, 12, null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel(id, plainString, stringResWithParameter, fundingInstrument.getIcon(), null, null, null, null, false, null, null, null, null, 8176, null);
    }
}
