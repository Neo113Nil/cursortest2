package com.paypal.oslo.feature.identity.clienttoken.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/data/model/ClientAccessTokenResponse;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientAccessToken;", "toDomain", "(Lcom/paypal/oslo/feature/identity/clienttoken/data/model/ClientAccessTokenResponse;)Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientAccessToken;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientTokenMapperKt {
    public static final com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken toDomain(com.paypal.oslo.feature.identity.clienttoken.data.model.ClientAccessTokenResponse clientAccessTokenResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientAccessTokenResponse, "");
        return new com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken(clientAccessTokenResponse.getTokenType(), clientAccessTokenResponse.getAccessToken(), null, clientAccessTokenResponse.getExpiresIn(), 4, null);
    }
}
