package com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "", "getSubtitle", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;)Ljava/lang/String;", "subtitle"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentKt {
    public static final java.lang.String getSubtitle(com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument) {
        java.lang.String str;
        java.lang.String str2;
        str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        if (fundingInstrument instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard) fundingInstrument;
            java.lang.String lastNChars = fundingInstrumentCard.getLastNChars();
            if (lastNChars == null) {
                lastNChars = "";
            }
            int i = com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentCard.getCardType().ordinal()];
            if (i == 1) {
                str = "Credit";
            } else if (i == 2) {
                str = "Debit";
            } else if (i == 3) {
                str = "Prepaid";
            } else if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ••");
            sb.append(lastNChars);
            return kotlin.text.StringsKt.trim(sb.toString()).toString();
        }
        if (!(fundingInstrument instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank) fundingInstrument;
        java.lang.String lastNChars2 = fundingInstrumentBank.getLastNChars();
        str = lastNChars2 != null ? lastNChars2 : "";
        switch (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentKt.WhenMappings.$EnumSwitchMapping$1[fundingInstrumentBank.getBankType().ordinal()]) {
            case 1:
                str2 = "Business Checking";
                break;
            case 2:
                str2 = "Business Savings";
                break;
            case 3:
                str2 = "Checking";
                break;
            case 4:
                str2 = com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS;
                break;
            case 5:
            case 6:
            case 7:
                str2 = "Bank";
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append(" ••");
        sb2.append(str);
        return kotlin.text.StringsKt.trim(sb2.toString()).toString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.PREPAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.BUSINESS_CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.SAVINGS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CUSTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.NORMAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.UNKNOWN__.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
