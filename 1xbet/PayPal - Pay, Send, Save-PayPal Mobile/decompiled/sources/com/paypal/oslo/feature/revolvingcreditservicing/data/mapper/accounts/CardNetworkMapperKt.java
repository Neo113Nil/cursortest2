package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/IssuanceCardNetwork;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/IssuanceCardNetwork;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CardNetwork;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardNetworkMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork toDomain(com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuanceCardNetwork, "");
        if (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.CardNetworkMapperKt.WhenMappings.$EnumSwitchMapping$0[issuanceCardNetwork.ordinal()] == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork.MASTERCARD;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
