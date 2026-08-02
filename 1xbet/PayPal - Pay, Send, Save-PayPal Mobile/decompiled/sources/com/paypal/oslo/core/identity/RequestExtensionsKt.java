package com.paypal.oslo.core.identity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/Request;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType;", "extractTokenType", "(Lokhttp3/Request;)Lcom/paypal/oslo/core/identity/domain/model/TokenType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestExtensionsKt {
    public static final com.paypal.oslo.core.identity.domain.model.TokenType extractTokenType(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.paypal.oslo.core.identity.ClientAuthTag clientAuthTag = (com.paypal.oslo.core.identity.ClientAuthTag) request.tag(com.paypal.oslo.core.identity.ClientAuthTag.class);
        if (clientAuthTag != null) {
            return new com.paypal.oslo.core.identity.domain.model.TokenType.ClientAccessTokenType(clientAuthTag.getAuthenticationFlowInfo());
        }
        com.paypal.oslo.core.identity.UserAuthTag userAuthTag = (com.paypal.oslo.core.identity.UserAuthTag) request.tag(com.paypal.oslo.core.identity.UserAuthTag.class);
        if (userAuthTag != null) {
            return new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(userAuthTag.getAuthenticationContext());
        }
        java.lang.String encodedPath = request.url().encodedPath();
        if (encodedPath.length() <= 0 || kotlin.jvm.internal.Intrinsics.areEqual(encodedPath, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
            encodedPath = null;
        }
        if (encodedPath == null) {
            encodedPath = "http_client";
        }
        return new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(encodedPath, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
    }
}
