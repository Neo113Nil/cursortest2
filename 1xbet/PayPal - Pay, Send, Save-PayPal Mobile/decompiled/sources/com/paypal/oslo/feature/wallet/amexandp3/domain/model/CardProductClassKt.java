package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardProductClass;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardProductClass;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardProductClassKt {
    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass toDomain(com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass) {
        switch (cardProductClass == null ? -1 : com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClassKt.WhenMappings.$EnumSwitchMapping$0[cardProductClass.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.CREDIT;
            case 2:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.DEBIT;
            case 3:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.GIFT;
            case 4:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.MIXED;
            case 5:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.PAYPAL_PREPAID;
            case 6:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.PREPAID;
            case 7:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.TOKENIZED;
            case 8:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.VAULTED;
            default:
                return com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardProductClass.UNKNOWN;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CardProductClass.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.GIFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.MIXED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.PAYPAL_PREPAID.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.PREPAID.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.TOKENIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardProductClass.VAULTED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
