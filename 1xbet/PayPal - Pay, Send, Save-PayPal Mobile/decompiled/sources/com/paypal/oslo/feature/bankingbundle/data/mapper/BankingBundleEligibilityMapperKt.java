package com.paypal.oslo.feature.bankingbundle.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;", "Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "toDomain", "(Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;)Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleEligibilityMapperKt {
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility toDomain(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data data) {
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus eligibilityStatus;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason;
        com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct bundleProduct;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility = data.getBalanceBundleEligibility();
        if (balanceBundleEligibility == null) {
            return new com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility(com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.INELIGIBLE, null, kotlin.collections.CollectionsKt.emptyList(), null, 8, null);
        }
        int i = com.paypal.oslo.feature.bankingbundle.data.mapper.BankingBundleEligibilityMapperKt.WhenMappings.$EnumSwitchMapping$0[balanceBundleEligibility.getStatus().ordinal()];
        if (i == 1) {
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE;
        } else if (i == 2) {
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.INELIGIBLE;
        } else if (i == 3) {
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.ELIGIBLE_WITH_CONDITION;
        } else if (i == 4) {
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.BUNDLE_PROVISIONED;
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            eligibilityStatus = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityStatus.INELIGIBLE;
        }
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason reason = balanceBundleEligibility.getReason();
        java.util.ArrayList arrayList = null;
        if (reason != null) {
            switch (com.paypal.oslo.feature.bankingbundle.data.mapper.BankingBundleEligibilityMapperKt.WhenMappings.$EnumSwitchMapping$1[reason.ordinal()]) {
                case 1:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.IDENTITY_VERIFICATION_FAILED;
                    break;
                case 2:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.IDENTITY_VERIFICATION_REQUIRED;
                    break;
                case 3:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL;
                    break;
                case 4:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.USER_DOCUMENT_VALIDATION_FAILED;
                    break;
                case 5:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.BALANCE_DENIED;
                    break;
                case 6:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.BANK_ACCOUNT_OR_DEBIT_INELIGIBLE;
                    break;
                case 7:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.INVALID_USER_ACCOUNT_TYPE;
                    break;
                case 8:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.USER_ACCOUNT_CLOSED;
                    break;
                case 9:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.USER_ACCOUNT_LOCKED;
                    break;
                case 10:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.USER_ACCOUNT_RESTRICTED;
                    break;
                case 11:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.UNSUPPORTED_COUNTRY;
                    break;
                case 12:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.INVALID_ADDRESS;
                    break;
                case 13:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.MANUAL_REVIEW;
                    break;
                case 14:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.OTHER;
                    break;
                case 15:
                    eligibilityReason = com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.OTHER;
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            eligibilityReason = null;
        }
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> products = balanceBundleEligibility.getProducts();
        if (products != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = products.iterator();
            while (it.hasNext()) {
                int i2 = com.paypal.oslo.feature.bankingbundle.data.mapper.BankingBundleEligibilityMapperKt.WhenMappings.$EnumSwitchMapping$2[((com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName) it.next()).ordinal()];
                if (i2 == 1) {
                    bundleProduct = com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.CONSUMER_VIRTUAL_BANK_ACCOUNT;
                } else if (i2 == 2) {
                    bundleProduct = com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.CONSUMER_DEBIT_CARD;
                } else if (i2 == 3) {
                    bundleProduct = com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.PAYPAL_CASH_PLUS;
                } else {
                    if (i2 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    bundleProduct = null;
                }
                if (bundleProduct != null) {
                    arrayList2.add(bundleProduct);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount = data.getBalances().getTotalAvailableAmount();
        return new com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility(eligibilityStatus, eligibilityReason, arrayList, new com.paypal.oslo.feature.bankingbundle.domain.model.Balance(totalAvailableAmount.getCurrencyCode().toString(), totalAvailableAmount.getValue()));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus.INELIGIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus.BUNDLE_PROVISIONED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.IDENTITY_VERIFICATION_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.IDENTITY_VERIFICATION_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_DOCUMENT_VALIDATION_FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.BALANCE_DENIED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.BANK_ACCOUNT_OR_DEBIT_INELIGIBLE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.INVALID_USER_ACCOUNT_TYPE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_ACCOUNT_CLOSED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_ACCOUNT_LOCKED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_ACCOUNT_RESTRICTED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.UNSUPPORTED_COUNTRY.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.INVALID_ADDRESS.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.MANUAL_REVIEW.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.OTHER.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.UNKNOWN__.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName.CONSUMER_VIRTUAL_BANK_ACCOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName.CONSUMER_DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName.PAYPAL_CASH_PLUS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
