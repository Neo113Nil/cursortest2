package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CardDefinitionsInput;", "toGraphQL", "(Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsRequest;)Lcom/paypal/oslo/api/graphql/schema/type/CardDefinitionsInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDefinitionsToDataKtKt {
    public static final com.paypal.oslo.api.graphql.schema.type.CardDefinitionsInput toGraphQL(com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsRequest cardDefinitionsRequest) {
        com.paypal.oslo.api.graphql.schema.type.CardOperationName cardOperationName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinitionsRequest, "");
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(cardDefinitionsRequest.getUserCountryCode());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        int i = com.paypal.oslo.feature.wallet.cards.data.extensions.CardDefinitionsToDataKtKt.WhenMappings.$EnumSwitchMapping$0[cardDefinitionsRequest.getOperationName().ordinal()];
        if (i == 1) {
            cardOperationName = com.paypal.oslo.api.graphql.schema.type.CardOperationName.ADD;
        } else if (i == 2) {
            cardOperationName = com.paypal.oslo.api.graphql.schema.type.CardOperationName.UPDATE;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cardOperationName = com.paypal.oslo.api.graphql.schema.type.CardOperationName.UNKNOWN__;
        }
        return new com.paypal.oslo.api.graphql.schema.type.CardDefinitionsInput(present, null, null, null, null, null, null, null, companion.present(cardOperationName), null, 766, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.UPDATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
