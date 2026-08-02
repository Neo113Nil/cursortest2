package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/payments/MakePaymentResponseMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MakePaymentResponseMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MakePaymentResponseMapper() {
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        java.lang.Object url;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment2;
        java.lang.Object url2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType bankAccountType;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment3;
        java.lang.Object url3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType bankAccountType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment = data.getMakeRevolvingCreditPayment();
        if (makeRevolvingCreditPayment == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(makeRevolvingCreditPayment.getAmount().getRevolvingCreditMoneyFragment().getCurrencyCode().toString(), makeRevolvingCreditPayment.getAmount().getRevolvingCreditMoneyFragment().getValue());
        java.lang.Object date = makeRevolvingCreditPayment.getDate();
        java.lang.String str = date instanceof java.lang.String ? (java.lang.String) date : null;
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper.WhenMappings.$EnumSwitchMapping$0[makeRevolvingCreditPayment.getType().ordinal()];
        if (i == 1) {
            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME;
        } else if (i == 2) {
            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED;
        } else if (i == 3) {
            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.AUTOPAY;
        } else {
            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.UNKNOWN;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument> fundingInstruments = makeRevolvingCreditPayment.getFundingInstruments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = fundingInstruments.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment = ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument) it.next()).getRevolvingCreditPaymentFundingInstrumentsFragment();
            if (revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBank() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBank();
                java.lang.String id = onRevolvingCreditPaymentFundingInstrumentBank.getId();
                com.paypal.oslo.api.graphql.schema.type.BankAccountType type = onRevolvingCreditPaymentFundingInstrumentBank.getType();
                if (type != null) {
                    switch (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper.WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
                        case 1:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.BUSINESS_SAVINGS;
                            break;
                        case 2:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.BUSINESS_CHECKING;
                            break;
                        case 3:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING;
                            break;
                        case 4:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.SAVINGS;
                            break;
                        case 5:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.NORMAL;
                            break;
                        case 6:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CUSTOM;
                            break;
                        case 7:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.UNKNOWN;
                            break;
                        case 8:
                            bankAccountType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.UNKNOWN;
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                    bankAccountType = bankAccountType2;
                } else {
                    bankAccountType = null;
                }
                java.lang.Object bankLastNChars = onRevolvingCreditPaymentFundingInstrumentBank.getBankLastNChars();
                java.lang.String obj = bankLastNChars != null ? bankLastNChars.toString() : null;
                java.lang.String name2 = onRevolvingCreditPaymentFundingInstrumentBank.getName();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Art1 art = onRevolvingCreditPaymentFundingInstrumentBank.getArt();
                fundingInstrumentCard = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank(id, (art == null || (revolvingCreditImageFragment3 = art.getRevolvingCreditImageFragment()) == null || (url3 = revolvingCreditImageFragment3.getUrl()) == null) ? null : url3.toString(), name2, bankAccountType, obj);
            } else if (revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBalance();
                java.lang.String id2 = onRevolvingCreditPaymentFundingInstrumentBalance.getId();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Art art2 = onRevolvingCreditPaymentFundingInstrumentBalance.getArt();
                java.lang.String obj2 = (art2 == null || (revolvingCreditImageFragment2 = art2.getRevolvingCreditImageFragment()) == null || (url2 = revolvingCreditImageFragment2.getUrl()) == null) ? null : url2.toString();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Amount amount = onRevolvingCreditPaymentFundingInstrumentBalance.getAmount();
                fundingInstrumentCard = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance(id2, obj2, (amount == null || (revolvingCreditMoneyFragment = amount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment));
            } else if (revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentCard() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentCard();
                java.lang.String id3 = onRevolvingCreditPaymentFundingInstrumentCard.getId();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Art2 art3 = onRevolvingCreditPaymentFundingInstrumentCard.getArt();
                java.lang.String obj3 = (art3 == null || (revolvingCreditImageFragment = art3.getRevolvingCreditImageFragment()) == null || (url = revolvingCreditImageFragment.getUrl()) == null) ? null : url.toString();
                java.lang.String name3 = onRevolvingCreditPaymentFundingInstrumentCard.getName();
                java.lang.String obj4 = onRevolvingCreditPaymentFundingInstrumentCard.getCardLastNChars().toString();
                int i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper.WhenMappings.$EnumSwitchMapping$2[onRevolvingCreditPaymentFundingInstrumentCard.getProductClass().ordinal()];
                if (i2 == 1) {
                    cardProductType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.CREDIT;
                } else if (i2 == 2) {
                    cardProductType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.DEBIT;
                } else if (i2 == 3) {
                    cardProductType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.PREPAID;
                } else if (i2 == 4) {
                    cardProductType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN;
                } else {
                    if (i2 != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    cardProductType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN;
                }
                fundingInstrumentCard = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard(id3, obj3, name3, obj4, cardProductType);
            } else {
                fundingInstrumentCard = null;
            }
            if (fundingInstrumentCard != null) {
                arrayList.add(fundingInstrumentCard);
            }
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse(currencyAmount, str, revolvingCreditPaymentType, arrayList);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.REAL_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.SCHEDULED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.AUTOPAY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CUSTOM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.PREPAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
