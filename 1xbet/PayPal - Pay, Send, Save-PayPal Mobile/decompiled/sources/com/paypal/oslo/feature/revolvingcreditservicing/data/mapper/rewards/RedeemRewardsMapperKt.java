package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.rewards;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedeemRewardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/RedeemRevolvingCreditRewardInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedeemRewardRequest;)Lcom/paypal/oslo/api/graphql/schema/type/RedeemRevolvingCreditRewardInput;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$Data;", "request", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionResult;", "toRedemptionResult", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$Data;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedeemRewardRequest;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedeemRewardsMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput toGraphQLInput(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest redeemRewardRequest) {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionTarget revolvingCreditRewardRedemptionTarget;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardType revolvingCreditRewardType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemRewardRequest, "");
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier graphql = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(redeemRewardRequest.getCreditProductIdentifier());
        java.lang.String creditAccountId = redeemRewardRequest.getCreditAccountId();
        com.paypal.oslo.api.graphql.schema.type.MoneyInput moneyInput = new com.paypal.oslo.api.graphql.schema.type.MoneyInput(redeemRewardRequest.getAmount().getCurrencyCode(), com.paypal.oslo.feature.revolvingcreditservicing.utils.BigDecimalExtensionsKt.toMoneyString(redeemRewardRequest.getAmount().getValue()));
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.rewards.RedeemRewardsMapperKt.WhenMappings.$EnumSwitchMapping$0[redeemRewardRequest.getRedemptionTarget().ordinal()];
        if (i == 1) {
            revolvingCreditRewardRedemptionTarget = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionTarget.BALANCE;
        } else if (i == 2) {
            revolvingCreditRewardRedemptionTarget = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionTarget.POINTS;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            revolvingCreditRewardRedemptionTarget = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionTarget.UNKNOWN__;
        }
        int i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.rewards.RedeemRewardsMapperKt.WhenMappings.$EnumSwitchMapping$1[redeemRewardRequest.getRewardType().ordinal()];
        if (i2 == 1) {
            revolvingCreditRewardType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardType.CASHBACK;
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            revolvingCreditRewardType = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardType.POINTS;
        }
        return new com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput(graphql, creditAccountId, moneyInput, revolvingCreditRewardRedemptionTarget, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(redeemRewardRequest.getPromotionRedemptionId()), revolvingCreditRewardType);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult toRedemptionResult(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data data, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest redeemRewardRequest) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus redemptionStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemRewardRequest, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward = data.getRedeemRevolvingCreditReward();
        if (redeemRevolvingCreditReward == null) {
            return null;
        }
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.rewards.RedeemRewardsMapperKt.WhenMappings.$EnumSwitchMapping$2[redeemRevolvingCreditReward.getRedemptionStatus().ordinal()];
        if (i == 1) {
            redemptionStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus.PROCESSED;
        } else if (i == 2) {
            redemptionStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus.PENDING;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            redemptionStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus.FAILED;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult(redemptionStatus, redeemRewardRequest.getAmount());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_PLUS_POINTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.CASHBACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.POINTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus.PROCESSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus.PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
