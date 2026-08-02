package com.paypal.oslo.feature.identity.connect.inboundconnect.utils;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/InboundConnectDestination;", "", "fullDeeplink", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "toInboundConnectRequest", "(Lcom/paypal/oslo/feature/identity/api/navigation/InboundConnectDestination;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;", "", "toMap", "(Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;)Ljava/util/Map;", "request", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;", "buildWebSessionTransferContext", "(Lcom/paypal/oslo/feature/identity/connect/inboundconnect/domain/model/InboundConnectRequest;)Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InboundConnectMapperExtensionsKt {
    public static final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest toInboundConnectRequest(com.paypal.oslo.feature.identity.api.navigation.InboundConnectDestination inboundConnectDestination, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectDestination, "");
        java.lang.String clientId = inboundConnectDestination.getClientId();
        java.lang.String str2 = clientId == null ? "" : clientId;
        java.lang.String scope = inboundConnectDestination.getScope();
        java.lang.String str3 = scope == null ? "" : scope;
        java.lang.String redirectUri = inboundConnectDestination.getRedirectUri();
        java.lang.String str4 = redirectUri == null ? "" : redirectUri;
        java.lang.String state = inboundConnectDestination.getState();
        java.lang.String str5 = state == null ? "" : state;
        java.lang.String metadataId = inboundConnectDestination.getMetadataId();
        java.lang.String str6 = metadataId == null ? "" : metadataId;
        java.lang.String codeChallengeMethod = inboundConnectDestination.getCodeChallengeMethod();
        java.lang.String str7 = codeChallengeMethod == null ? "" : codeChallengeMethod;
        java.lang.String codeChallenge = inboundConnectDestination.getCodeChallenge();
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest(str2, str3, str4, str5, str6, str7, codeChallenge == null ? "" : codeChallenge, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.CONNECT_SINGLE_SIGN_ON.toString(), str == null ? "" : str);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> toMap(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectRequest, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY, inboundConnectRequest.getClientId());
        createMapBuilder.put(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, inboundConnectRequest.getScope());
        createMapBuilder.put("redirect_uri", inboundConnectRequest.getRedirectUri());
        createMapBuilder.put("state", inboundConnectRequest.getState());
        createMapBuilder.put(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.METADATA_ID_KEY, inboundConnectRequest.getMetadataId());
        createMapBuilder.put(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CODE_CHALLENGE_METHOD_KEY, inboundConnectRequest.getCodeChallengeMethod());
        createMapBuilder.put(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CODE_CHALLENGE_KEY, inboundConnectRequest.getCodeChallenge());
        createMapBuilder.put("intent", inboundConnectRequest.getIntent());
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public static final com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext buildWebSessionTransferContext(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.model.InboundConnectRequest inboundConnectRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboundConnectRequest, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tenant", "PAYPAL"), kotlin.TuplesKt.to("source", "inbound_connect"));
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("redirectUri", inboundConnectRequest.getRedirectUri()), kotlin.TuplesKt.to("fullDeeplink", inboundConnectRequest.getFullDeeplink()));
        return new com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext(com.paypal.oslo.core.identity.domain.model.Tenant.PAYPAL, new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("inbound_connect", toMap(inboundConnectRequest))), inboundConnectRequest.getFullDeeplink(), com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.CONNECT_SINGLE_SIGN_ON);
    }
}
