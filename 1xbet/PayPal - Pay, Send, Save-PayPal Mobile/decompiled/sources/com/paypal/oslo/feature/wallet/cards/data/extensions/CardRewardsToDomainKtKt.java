package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\f\u0010\u0010\u001a\u0013\u0010\f\u001a\u00020\u0012*\u00020\u0011H\u0000¢\u0006\u0004\b\f\u0010\u0013\u001a\u0013\u0010\f\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\f\u0010\u0016\u001a\u0013\u0010\f\u001a\u00020\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\f\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;", "toCardRewardRoundingMode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;", "toCardRewardState", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;", "toCardRewardStateReason", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardBalance;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Balance;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardBalance;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Denomination;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStatus;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Status;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStatus;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$InstitutionImage;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$InstitutionImage;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardRewardsQuery$Issuer;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;", "toCardRewardsError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardsError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardRewardsToDomainKtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode toCardRewardRoundingMode(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode) obj).name(), str)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode) obj;
        return cardRewardRoundingMode == null ? com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode.UNKNOWN : cardRewardRoundingMode;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState toCardRewardState(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState) obj).name(), str)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState) obj;
        return cardRewardState == null ? com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState.UNKNOWN : cardRewardState;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason toCardRewardStateReason(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason) obj).name(), str)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason) obj;
        return cardRewardStateReason == null ? com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason.UNKNOWN : cardRewardStateReason;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance toDomain(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Balance balance) {
        java.lang.String name2;
        java.lang.String name3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination = balance.getDenomination();
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode = null;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination domain = denomination != null ? toDomain(denomination) : null;
        java.lang.Double conversionFactor = balance.getConversionFactor();
        java.lang.Object targetCurrencyCode = balance.getTargetCurrencyCode();
        java.lang.String obj = targetCurrencyCode != null ? targetCurrencyCode.toString() : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.TargetCurrencyBalance targetCurrencyBalance = balance.getTargetCurrencyBalance();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = targetCurrencyBalance != null ? new com.paypal.oslo.feature.wallet.common.domain.model.Money(targetCurrencyBalance.getCurrencyCode().toString(), targetCurrencyBalance.getValue()) : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MinimumTargetCurrencyRewardsSpend minimumTargetCurrencyRewardsSpend = balance.getMinimumTargetCurrencyRewardsSpend();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = minimumTargetCurrencyRewardsSpend != null ? new com.paypal.oslo.feature.wallet.common.domain.model.Money(minimumTargetCurrencyRewardsSpend.getCurrencyCode().toString(), minimumTargetCurrencyRewardsSpend.getValue()) : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.MaximumTargetCurrencyRewardsSpend maximumTargetCurrencyRewardsSpend = balance.getMaximumTargetCurrencyRewardsSpend();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = maximumTargetCurrencyRewardsSpend != null ? new com.paypal.oslo.feature.wallet.common.domain.model.Money(maximumTargetCurrencyRewardsSpend.getCurrencyCode().toString(), maximumTargetCurrencyRewardsSpend.getValue()) : null;
        java.lang.Integer targetCurrencyDecimalPrecision = balance.getTargetCurrencyDecimalPrecision();
        java.lang.Integer programCurrencyDecimalPrecision = balance.getProgramCurrencyDecimalPrecision();
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode targetCurrencyRoundingMode = balance.getTargetCurrencyRoundingMode();
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode2 = (targetCurrencyRoundingMode == null || (name3 = targetCurrencyRoundingMode.name()) == null) ? null : toCardRewardRoundingMode(name3);
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode programCurrencyRoundingMode = balance.getProgramCurrencyRoundingMode();
        if (programCurrencyRoundingMode != null && (name2 = programCurrencyRoundingMode.name()) != null) {
            cardRewardRoundingMode = toCardRewardRoundingMode(name2);
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardBalance(domain, conversionFactor, obj, money, money2, money3, targetCurrencyDecimalPrecision, programCurrencyDecimalPrecision, cardRewardRoundingMode2, cardRewardRoundingMode, balance.getMonetary());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination toDomain(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Denomination denomination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(denomination, "");
        java.lang.String str = denomination.get__typename();
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "Money")) {
            com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnMoney onMoney = denomination.getOnMoney();
            return onMoney != null ? new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money(onMoney.getCurrencyCode().toString(), onMoney.getValue()) : null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "CardRewardPoints")) {
            return null;
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.OnCardRewardPoints onCardRewardPoints = denomination.getOnCardRewardPoints();
        return onCardRewardPoints != null ? new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points(onCardRewardPoints.getValue(), onCardRewardPoints.getProgramCode(), onCardRewardPoints.getProgramDescription()) : null;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus toDomain(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Status status) {
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState = toCardRewardState(status.getState().name());
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason reason = status.getReason();
        return new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus(cardRewardState, (reason == null || (name2 = reason.name()) == null) ? null : toCardRewardStateReason(name2));
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage toDomain(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.InstitutionImage institutionImage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImage, "");
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment = institutionImage.getWalletInstitutionImageFragment();
        java.lang.Object url = walletInstitutionImageFragment.getUrl();
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage(url != null ? url.toString() : null, walletInstitutionImageFragment.getMimeType(), walletInstitutionImageFragment.getWidth(), walletInstitutionImageFragment.getHeight(), walletInstitutionImageFragment.getCategory().name());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer toDomain(com.paypal.oslo.feature.wallet.graphql.GetWalletCardRewardsQuery.Issuer issuer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuer, "");
        return com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(issuer.getWalletCardIssuerFragment());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError toCardRewardsError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("code") : null;
        return kotlin.jvm.internal.Intrinsics.areEqual(obj instanceof java.lang.String ? (java.lang.String) obj : null, "INVALID_CARD_ID") ? com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.InvalidCardId.INSTANCE : new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardsError.Server(graphQL.m11659getErrors1X0FAY(), ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getMessage(), null);
    }
}
