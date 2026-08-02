package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\u0006\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\u0006\u0010\n\u001a\u0013\u0010\u0006\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\u0006\u0010\r\u001a\u0013\u0010\u0006\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0006\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditAutopayInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditAutopayInput;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentInput;", "toGraphQL", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentInput;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentCardProductClass;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/CardProductType;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentCardProductClass;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/BankAccountType;)Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayResult;", "toUpdateAutopayResult", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpdateAutopayMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput toGraphQLInput(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest updateAutopayRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutopayRequest, "");
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier graphql = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(updateAutopayRequest.getCreditProductIdentifier());
        java.lang.String creditAccountId = updateAutopayRequest.getCreditAccountId();
        boolean enrolled = updateAutopayRequest.getEnrolled();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = updateAutopayRequest.getPaymentOption();
        java.util.ArrayList arrayList = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(paymentOption != null ? toGraphQL(paymentOption) : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount = updateAutopayRequest.getCustomAmount();
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(customAmount != null ? new com.paypal.oslo.api.graphql.schema.type.MoneyInput(customAmount.getCurrencyCode(), customAmount.getValue()) : null);
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments = updateAutopayRequest.getFundingInstruments();
        if (fundingInstruments != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = fundingInstruments;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toGraphQL((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) it.next()));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput(graphql, creditAccountId, enrolled, presentIfNotNull, companion3.presentIfNotNull(arrayList), presentIfNotNull2);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentInput toGraphQL(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
        com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
            return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentBalanceInput(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) fundingInstrument).getId(), com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType.BALANCE)), null, 5, null);
        }
        if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) {
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument;
            java.lang.String id = fundingInstrumentBank.getId();
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType revolvingCreditPaymentFinancialInstrumentType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType.BANK;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type = fundingInstrumentBank.getType();
            if (type == null || (bankAccountType = toGraphQL(type)) == null) {
                bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            java.lang.String lastNChars = fundingInstrumentBank.getLastNChars();
            return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentInput(null, null, companion.present(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentBankInput(id, revolvingCreditPaymentFinancialInstrumentType, bankAccountType2, lastNChars == null ? "" : lastNChars, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(fundingInstrumentBank.getName()))), 3, null);
        }
        if (!(fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument;
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardInput(fundingInstrumentCard.getId(), com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFinancialInstrumentType.CARD, fundingInstrumentCard.getLastNChars(), toGraphQL(fundingInstrumentCard.getProductClass()), null, 16, null)), null, null, 6, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass toGraphQL(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProductType, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.UpdateAutopayMapperKt.WhenMappings.$EnumSwitchMapping$0[cardProductType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.CREDIT;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.DEBIT;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.PREPAID;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.UNKNOWN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountType toGraphQL(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType bankAccountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.UpdateAutopayMapperKt.WhenMappings.$EnumSwitchMapping$1[bankAccountType.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.BankAccountType.CUSTOM;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.BankAccountType.NORMAL;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS;
            case 7:
                return com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType toGraphQL(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOption, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.UpdateAutopayMapperKt.WhenMappings.$EnumSwitchMapping$2[paymentOption.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.MINIMUM_PAYMENT_DUE;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.STATEMENT_BALANCE;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.CUSTOM_AMOUNT;
        }
        if (i == 4 || i == 5) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType.UNKNOWN__;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult toUpdateAutopayResult(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay = data.getUpdateRevolvingCreditAutopay();
        if (updateRevolvingCreditAutopay == null) {
            return null;
        }
        java.lang.Boolean enrolled = updateRevolvingCreditAutopay.getEnrolled();
        boolean booleanValue = enrolled != null ? enrolled.booleanValue() : false;
        java.lang.Boolean effectiveInCurrentBillingCycle = updateRevolvingCreditAutopay.getEffectiveInCurrentBillingCycle();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult(booleanValue, effectiveInCurrentBillingCycle != null ? effectiveInCurrentBillingCycle.booleanValue() : true);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.PREPAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.BUSINESS_CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CUSTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.SAVINGS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.values().length];
            try {
                iArr3[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CURRENT_BALANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
