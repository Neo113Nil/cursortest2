package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentityTokenProviderImplKt {
    public static final /* synthetic */ com.paypal.oslo.core.identity.domain.model.TokenError access$toTokenError(com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError clientTokenError) {
        if (!(clientTokenError instanceof com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api) && !(clientTokenError instanceof com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.CacheNotAvailable)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE;
    }
}
