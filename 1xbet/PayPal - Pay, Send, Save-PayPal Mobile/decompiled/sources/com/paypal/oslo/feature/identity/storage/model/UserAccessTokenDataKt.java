package com.paypal.oslo.feature.identity.storage.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "", "currentElapsedRealtime", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "toUserAccessTokenData", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;J)Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAccessTokenDataKt {
    public static final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData toUserAccessTokenData(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessToken, "");
        return new com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData(userAccessToken.getTokenValue(), userAccessToken.getAuthenticationTier(), (userAccessToken.getExpirationInSeconds() * 1000) + j, userAccessToken.getPayerId());
    }
}
