package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/analytics/CallbackWrapper;", "", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/zettle/sdk/commons/network/NetworkClient$Callback;)V", "", "e", "", "onFailure", "(Ljava/lang/Throwable;)V", "Lcom/izettle/android/net/Response;", "", "response", "onResponse", "(Lcom/izettle/android/net/Response;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/commons/network/NetworkClient$Callback;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CallbackWrapper {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.network.NetworkClient.Callback Camera2StreamConfigurationMap;

    public CallbackWrapper(com.zettle.sdk.commons.network.NetworkClient.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.Camera2StreamConfigurationMap = callback;
    }

    public final void onFailure(java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        if (e instanceof java.io.IOException) {
            this.Camera2StreamConfigurationMap.onFailure((java.io.IOException) e);
            return;
        }
        throw e;
    }

    public final void onResponse(com.izettle.android.net.Response<java.lang.String> response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        this.Camera2StreamConfigurationMap.onResponse(new com.zettle.sdk.commons.network.ResponseWrapper(null, response));
    }
}
