package com.paypal.oslo.feature.oneonboarding.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardJourneyContextInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardJourneyContextInput;", "toJourneyContextInput", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardJourneyContextInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardJourneyContextInputExtensionsKt {
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput toJourneyContextInput(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) {
            journeyContext = ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) intentId).getJourneyContext();
        } else if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro) {
            journeyContext = ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro) intentId).getJourneyContext();
        } else if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle) {
            journeyContext = ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle) intentId).getJourneyContext();
        } else if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) {
            journeyContext = ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings) intentId).getJourneyContext();
        } else if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds) {
            journeyContext = ((com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds) intentId).getJourneyContext();
        } else {
            if (!(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) && !(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            journeyContext = null;
        }
        if (journeyContext == null) {
            return null;
        }
        return new com.paypal.oslo.api.graphql.schema.type.OnboardJourneyContextInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(journeyContext.getFlowType()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(journeyContext.getSource()));
    }
}
