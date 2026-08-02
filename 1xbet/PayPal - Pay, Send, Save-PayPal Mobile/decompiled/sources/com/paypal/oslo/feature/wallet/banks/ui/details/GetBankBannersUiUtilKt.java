package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetBankBannersUiUtilKt {
    public static final /* synthetic */ com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType access$toDomainBankAccountType(com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType) {
        switch (com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtilKt.WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()]) {
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
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CUSTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
