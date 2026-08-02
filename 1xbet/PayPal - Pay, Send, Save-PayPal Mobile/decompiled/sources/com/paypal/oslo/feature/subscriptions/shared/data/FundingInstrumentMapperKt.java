package com.paypal.oslo.feature.subscriptions.shared.data;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "Lcom/paypal/oslo/feature/subscriptions/graphql/type/FundingInstrumentType;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;", "toSharedDomainType", "(Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentMapperKt {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType toSharedDomainType(com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        switch (com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_BALANCE;
            case 2:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.CREDIT_CARD;
            case 3:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.DEBIT_CARD;
            case 4:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.BANK_CHECKING;
            case 5:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.BANK_SAVINGS;
            case 6:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_CREDIT;
            case 7:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_DEBIT_CARD;
            case 8:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PREPAID_CARD;
            default:
                return com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.UNKNOWN;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_CHECKING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_SAVINGS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_CREDIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_DEBIT_CARD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PREPAID_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
