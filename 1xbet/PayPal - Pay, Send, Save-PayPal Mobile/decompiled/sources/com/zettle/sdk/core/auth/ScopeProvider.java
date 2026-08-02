package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/auth/ScopeProvider;", "", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "", "invoke", "(Lcom/zettle/sdk/commons/network/Scope;)[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ScopeProvider {
    java.lang.String[] invoke(com.zettle.sdk.commons.network.Scope scope);
}
