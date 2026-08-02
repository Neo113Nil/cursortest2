package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/autodetect/model/AutodetectCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/AutodetectCardInput;", "toGraphQL", "(Lcom/paypal/oslo/feature/wallet/cards/domain/autodetect/model/AutodetectCardRequest;)Lcom/paypal/oslo/api/graphql/schema/type/AutodetectCardInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutodetectCardToDataKtKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput toGraphQL(com.paypal.oslo.feature.wallet.cards.domain.autodetect.model.AutodetectCardRequest autodetectCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autodetectCardRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.AutodetectCardInput(autodetectCardRequest.getCardNumber(), autodetectCardRequest.getUserCountryCode());
    }
}
