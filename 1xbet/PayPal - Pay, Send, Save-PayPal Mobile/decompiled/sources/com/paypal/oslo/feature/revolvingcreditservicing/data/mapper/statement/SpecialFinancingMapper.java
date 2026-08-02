package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/SpecialFinancingMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PromotionalActivity;", "promotionalActivities", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancing;", "toSpecialFinancing", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancing;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SpecialFinancingMapper() {
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancing toSpecialFinancing(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity> promotionalActivities) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> types;
        com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType creditOfferConstructType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType2;
        java.lang.Object id;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionalActivities, "");
        if (promotionalActivities.isEmpty()) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity> list = promotionalActivities;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity promotionalActivity : list) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OriginalTransactionAmount originalTransactionAmount = promotionalActivity.getOriginalTransactionAmount();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (originalTransactionAmount == null || (revolvingCreditMoneyFragment2 = originalTransactionAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2);
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RemainingBalance remainingBalance = promotionalActivity.getRemainingBalance();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = (remainingBalance == null || (revolvingCreditMoneyFragment = remainingBalance.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1 offerConstruct = promotionalActivity.getOfferConstruct();
            java.lang.String obj = (offerConstruct == null || (id = offerConstruct.getId()) == null) ? null : id.toString();
            java.lang.String str = obj == null ? "" : obj;
            java.lang.String description = promotionalActivity.getDescription();
            java.lang.String str2 = description == null ? "" : description;
            java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(promotionalActivity.getExpirationTime());
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus.ACTIVE;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1 offerConstruct2 = promotionalActivity.getOfferConstruct();
            if (offerConstruct2 == null || (types = offerConstruct2.getTypes()) == null || (creditOfferConstructType = (com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) types)) == null) {
                specialFinancingOfferType = null;
            } else {
                int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement.SpecialFinancingMapper.WhenMappings.$EnumSwitchMapping$0[creditOfferConstructType.ordinal()];
                if (i == 1) {
                    specialFinancingOfferType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType.NO_INTEREST;
                } else if (i == 2) {
                    specialFinancingOfferType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType.REDUCED_APR;
                } else {
                    if (i != 3 && i != 4 && i != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    specialFinancingOfferType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType.UNKNOWN;
                }
                specialFinancingOfferType = specialFinancingOfferType2;
            }
            arrayList.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity(str, str2, currencyAmount, currencyAmount2, anyToInstantOrNull, specialFinancingStatus, specialFinancingOfferType));
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancing(arrayList);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType.NO_INTEREST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType.PROMOTIONAL_APR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType.INSTALLMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType.DYNAMIC_RATE_INSTALLMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
