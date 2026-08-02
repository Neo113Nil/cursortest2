package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/zettle/sdk/commons/network/ResponseWrapper;", "Lcom/zettle/sdk/commons/network/NetworkClient$Response;", "Lcom/zettle/sdk/commons/network/ServiceUrl;", "url", "Lcom/izettle/android/net/Response;", "", "response", "<init>", "(Lcom/zettle/sdk/commons/network/ServiceUrl;Lcom/izettle/android/net/Response;)V", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "()Ljava/lang/String;", "errorBody", "", "", "headers", "()Ljava/util/Map;", "", "invalidateUrl", "()V", "", "getCode", "()I", "code", "", "isSuccessful", "()Z", "getHighSpeedVideoFpsRangesFor", "Lcom/izettle/android/net/Response;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/network/ServiceUrl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ResponseWrapper implements com.zettle.sdk.commons.network.NetworkClient.Response {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.network.ServiceUrl getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.izettle.android.net.Response<java.lang.String> getHighSpeedVideoFpsRanges;

    public ResponseWrapper(com.zettle.sdk.commons.network.ServiceUrl serviceUrl, com.izettle.android.net.Response<java.lang.String> response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        this.getHighSpeedVideoFpsRangesFor = serviceUrl;
        this.getHighSpeedVideoFpsRanges = response;
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Response
    /* renamed from: isSuccessful */
    public final boolean getIsSuccessful() {
        return this.getHighSpeedVideoFpsRanges.isSuccessful();
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Response
    public final int getCode() {
        return this.getHighSpeedVideoFpsRanges.getCode();
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Response
    public final java.lang.String body() {
        return this.getHighSpeedVideoFpsRanges.getBody();
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Response
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers() {
        return this.getHighSpeedVideoFpsRanges.getHeaders();
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Response
    public final java.lang.String errorBody() {
        return this.getHighSpeedVideoFpsRanges.getErrorBody();
    }

    @Override // com.zettle.sdk.commons.network.NetworkClient.Response
    public final void invalidateUrl() {
        com.zettle.sdk.commons.network.ServiceUrl serviceUrl = this.getHighSpeedVideoFpsRangesFor;
        if (serviceUrl != null) {
            serviceUrl.invalidate();
        }
    }
}
