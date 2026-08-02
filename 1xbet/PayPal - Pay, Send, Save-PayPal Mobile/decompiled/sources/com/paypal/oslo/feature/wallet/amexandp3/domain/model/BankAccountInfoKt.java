package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankAccountInfoKt {
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType toDomain(com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        switch (com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfoKt.WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_CHECKING;
            case 2:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_SAVINGS;
            case 3:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
            case 4:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CUSTOM;
            case 5:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.NORMAL;
            case 6:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
            case 7:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN;
            case 8:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CUSTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
