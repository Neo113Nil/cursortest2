package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetSharedDataTimestamps.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSharedDataTimestamps;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "()V", "invoke", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetSharedDataTimestamps implements com.unity3d.ads.core.domain.GetSharedDataTimestamps {
    @Override // com.unity3d.ads.core.domain.GetSharedDataTimestamps
    public gatewayprotocol.v1.TimestampsOuterClass.Timestamps invoke() {
        gatewayprotocol.v1.TimestampsKt.Dsl.Companion companion = gatewayprotocol.v1.TimestampsKt.Dsl.INSTANCE;
        gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder newBuilder = gatewayprotocol.v1.TimestampsOuterClass.Timestamps.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.TimestampsKt.Dsl _create = companion._create(newBuilder);
        _create.setTimestamp(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(java.lang.System.currentTimeMillis()));
        _create.setSessionTimestamp(android.os.SystemClock.elapsedRealtime() - com.unity3d.services.core.properties.SdkProperties.getInitializationTime());
        return _create._build();
    }
}
