package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.makepayment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentInput;", "toGraphQl", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentDataMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentInput toGraphQl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Absent absent2;
        com.apollographql.apollo.api.Optional.Absent absent3;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass revolvingCreditPaymentFundingInstrumentCardProductClass;
        com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentBalanceInput(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) fundingInstrument).getId(), com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType.BALANCE));
        } else {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) {
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument;
            java.lang.String id = fundingInstrumentBank.getId();
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType revolvingCreditPaymentFinancialInstrumentType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType.BANK;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type = fundingInstrumentBank.getType();
            switch (type == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.makepayment.FundingInstrumentDataMapperKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case -1:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__;
                    break;
                case 0:
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
                case 1:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING;
                    break;
                case 2:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS;
                    break;
                case 3:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING;
                    break;
                case 4:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.CUSTOM;
                    break;
                case 5:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.NORMAL;
                    break;
                case 6:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS;
                    break;
                case 7:
                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN;
                    break;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            java.lang.String lastNChars = fundingInstrumentBank.getLastNChars();
            absent2 = companion.present(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentBankInput(id, revolvingCreditPaymentFinancialInstrumentType, bankAccountType2, lastNChars == null ? "" : lastNChars, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(fundingInstrumentBank.getName())));
        } else {
            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) {
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument;
            java.lang.String id2 = fundingInstrumentCard.getId();
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType revolvingCreditPaymentFinancialInstrumentType2 = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType.CARD;
            java.lang.String lastNChars2 = fundingInstrumentCard.getLastNChars();
            int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.makepayment.FundingInstrumentDataMapperKt.WhenMappings.$EnumSwitchMapping$1[fundingInstrumentCard.getProductClass().ordinal()];
            if (i == 1) {
                revolvingCreditPaymentFundingInstrumentCardProductClass = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.CREDIT;
            } else if (i == 2) {
                revolvingCreditPaymentFundingInstrumentCardProductClass = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.DEBIT;
            } else if (i == 3) {
                revolvingCreditPaymentFundingInstrumentCardProductClass = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.PREPAID;
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                revolvingCreditPaymentFundingInstrumentCardProductClass = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.UNKNOWN;
            }
            absent3 = companion2.present(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardInput(id2, revolvingCreditPaymentFinancialInstrumentType2, lastNChars2, revolvingCreditPaymentFundingInstrumentCardProductClass, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(fundingInstrumentCard.getName())));
        } else {
            absent3 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentInput(absent3, absent, absent2);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.BUSINESS_CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CUSTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.SAVINGS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.PREPAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
