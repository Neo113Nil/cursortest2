package com.paypal.oslo.feature.bankingbundle.data.provider;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleEligibilityProviderImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct access$toApiProduct(com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct bundleProduct) {
        int i = com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImplKt.WhenMappings.$EnumSwitchMapping$1[bundleProduct.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.CONSUMER_VIRTUAL_BANK_ACCOUNT;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.CONSUMER_DEBIT_CARD;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.PAYPAL_CASH_PLUS;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus access$toApiStatus(com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus) {
        int i = com.paypal.oslo.feature.bankingbundle.data.provider.BankingBundleEligibilityProviderImplKt.WhenMappings.$EnumSwitchMapping$0[eligibilityStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.INELIGIBLE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE_WITH_CONDITION;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.BUNDLE_PROVISIONED;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.INELIGIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.BUNDLE_PROVISIONED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.values().length];
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.CONSUMER_VIRTUAL_BANK_ACCOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.CONSUMER_DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.PAYPAL_CASH_PLUS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
