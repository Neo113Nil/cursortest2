package com.paypal.oslo.feature.identity.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/identity/config/AuthConfig;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "toAuthenticationConfig", "(Lcom/paypal/oslo/core/identity/config/AuthConfig;)Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthenticationConfigMapperKt {
    public static final com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig toAuthenticationConfig(com.paypal.oslo.core.identity.config.AuthConfig authConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig(authConfig.getFirstPartyClientId(), authConfig.getProxyClientId());
    }
}
