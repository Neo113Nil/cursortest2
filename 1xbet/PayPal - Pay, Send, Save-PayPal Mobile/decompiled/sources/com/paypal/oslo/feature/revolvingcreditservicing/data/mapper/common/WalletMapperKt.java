package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "toStarPayWalletOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$RevolvingCreditPushProvisioning;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$RevolvingCreditPushProvisioning;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "p0", "Lkotlin/Triple;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;)Lkotlin/Triple;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalletMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview toStarPayWalletOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning) {
        if (revolvingCreditPushProvisioning == null) {
            return null;
        }
        return getHighSpeedVideoSizes(revolvingCreditPushProvisioning.getStarPayWalletProvisioningFragment());
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview toStarPayWalletOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning) {
        if (revolvingCreditPushProvisioning == null) {
            return null;
        }
        return getHighSpeedVideoSizes(revolvingCreditPushProvisioning.getStarPayWalletProvisioningFragment());
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment) {
        kotlin.Triple<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken>> highSpeedVideoSizes = getHighSpeedVideoSizes(starPayWalletProvisioningFragment.getPrimaryDeviceEligibility());
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview(java.lang.Boolean.valueOf(!starPayWalletProvisioningFragment.getComponent().isHidden()), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking(java.lang.String.valueOf(starPayWalletProvisioningFragment.getComponent().getPersonalizationTrackingId()), null), highSpeedVideoSizes.component1(), highSpeedVideoSizes.component2(), highSpeedVideoSizes.component3());
    }

    private static final kotlin.Triple<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken>> getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason2;
        java.util.ArrayList arrayList = null;
        if (primaryDeviceEligibility.getOnRevolvingCreditPushProvisioningEligible() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible = primaryDeviceEligibility.getOnRevolvingCreditPushProvisioningEligible();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.ELIGIBLE;
            if (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.WalletMapperKt.WhenMappings.$EnumSwitchMapping$0[onRevolvingCreditPushProvisioningEligible.getEligibleReason().ordinal()] == 1) {
                externalWalletEligibilityReason2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_NOT_IN_WALLET;
            } else {
                externalWalletEligibilityReason2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN;
            }
            return new kotlin.Triple<>(externalWalletEligibilityStatus, externalWalletEligibilityReason2, null);
        }
        if (primaryDeviceEligibility.getOnRevolvingCreditPushProvisioningIneligible() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible = primaryDeviceEligibility.getOnRevolvingCreditPushProvisioningIneligible();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.INELIGIBLE;
            int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.WalletMapperKt.WhenMappings.$EnumSwitchMapping$1[onRevolvingCreditPushProvisioningIneligible.getIneligibleReason().ordinal()];
            if (i == 1) {
                externalWalletEligibilityReason = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_IN_WALLET;
            } else if (i == 2) {
                externalWalletEligibilityReason = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.CARD_PENDING_ACTIVATION;
            } else {
                externalWalletEligibilityReason = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN;
            }
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> provisionedTokens = onRevolvingCreditPushProvisioningIneligible.getProvisionedTokens();
            if (provisionedTokens != null) {
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> list = provisionedTokens;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken provisionedToken : list) {
                    java.lang.String valueOf = java.lang.String.valueOf(provisionedToken.getId());
                    java.lang.Object fundingPrimaryAccountNumberReferenceId = provisionedToken.getFundingPrimaryAccountNumberReferenceId();
                    java.lang.String obj = fundingPrimaryAccountNumberReferenceId != null ? fundingPrimaryAccountNumberReferenceId.toString() : null;
                    java.lang.String fundingPrimaryAccountNumberLastDigits = provisionedToken.getFundingPrimaryAccountNumberLastDigits();
                    int i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.WalletMapperKt.WhenMappings.$EnumSwitchMapping$2[provisionedToken.getState().ordinal()];
                    if (i2 == 1) {
                        externalWalletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.ACTIVATED;
                    } else if (i2 == 2) {
                        externalWalletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.ACTIVATING;
                    } else if (i2 == 3) {
                        externalWalletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.PENDING_ACTIVATION;
                    } else if (i2 == 4) {
                        externalWalletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.DEACTIVATED;
                    } else if (i2 == 5) {
                        externalWalletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.SUSPENDED;
                    } else {
                        externalWalletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.UNKNOWN;
                    }
                    arrayList2.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken(valueOf, obj, fundingPrimaryAccountNumberLastDigits, externalWalletTokenState, provisionedToken.isCompanionToken(), java.lang.Boolean.valueOf(provisionedToken.isDefaultToken()), provisionedToken.getIssuerName()));
                }
                arrayList = arrayList2;
            }
            return new kotlin.Triple<>(externalWalletEligibilityStatus2, externalWalletEligibilityReason, arrayList);
        }
        return new kotlin.Triple<>(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.UNKNOWN, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.UNKNOWN, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason.CARD_NOT_IN_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason.CARD_IN_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason.CARD_PENDING_ACTIVATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.ACTIVATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.ACTIVATING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.PENDING_ACTIVATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.DEACTIVATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.SUSPENDED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
