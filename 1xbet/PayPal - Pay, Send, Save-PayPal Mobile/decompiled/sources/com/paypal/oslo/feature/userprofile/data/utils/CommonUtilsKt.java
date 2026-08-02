package com.paypal.oslo.feature.userprofile.data.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "authState", "", "source", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "createCallConfig", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/CallConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonUtilsKt {
    public static final com.paypal.oslo.core.network.graphql.CallConfig createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(authenticationState, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(str, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
    }
}
