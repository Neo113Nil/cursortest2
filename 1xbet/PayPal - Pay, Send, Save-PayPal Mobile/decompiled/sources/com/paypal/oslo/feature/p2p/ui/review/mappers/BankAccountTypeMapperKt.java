package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "toWalletBankAccountType", "(Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;)Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BankAccountTypeMapperKt {
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType toWalletBankAccountType(com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType) {
        switch (bankAccountType == null ? -1 : com.paypal.oslo.feature.p2p.ui.review.mappers.BankAccountTypeMapperKt.WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()]) {
            case -1:
            case 7:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN;
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
            case 2:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
            case 3:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_CHECKING;
            case 4:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_SAVINGS;
            case 5:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CUSTOM;
            case 6:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.NORMAL;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.BUSINESS_CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.CUSTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.NORMAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
