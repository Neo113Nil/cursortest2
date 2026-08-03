package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetSafeguardedInitializationPolicy.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSafeguardedInitializationPolicy;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "()V", "invoke", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "requestPolicy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetSafeguardedInitializationPolicy implements com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    public gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy invoke(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = requestPolicy.getRetryPolicy();
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = requestPolicy.getTimeoutPolicy();
        gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy build = gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicy.newBuilder(requestPolicy).setRetryPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder(retryPolicy).setMaxDuration(java.lang.Math.max(5000, retryPolicy.getMaxDuration())).setRetryWaitBase(java.lang.Math.max(0, retryPolicy.getRetryWaitBase())).setRetryMaxInterval(java.lang.Math.max(0, retryPolicy.getRetryMaxInterval())).setRetryScalingFactor(java.lang.Math.max(0.1f, retryPolicy.getRetryScalingFactor())).setRetryJitterPct(java.lang.Math.min(100.0f, java.lang.Math.max(0.0f, retryPolicy.getRetryJitterPct())))).setTimeoutPolicy(gatewayprotocol.v1.NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder(timeoutPolicy).setConnectTimeoutMs(java.lang.Math.max(1000, timeoutPolicy.getConnectTimeoutMs())).setReadTimeoutMs(java.lang.Math.max(1000, timeoutPolicy.getReadTimeoutMs())).setWriteTimeoutMs(java.lang.Math.max(1000, timeoutPolicy.getWriteTimeoutMs())).setOverallTimeoutMs(java.lang.Math.max(1000, timeoutPolicy.getOverallTimeoutMs()))).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "newBuilder(requestPolicy…  )\n            ).build()");
        return build;
    }
}
