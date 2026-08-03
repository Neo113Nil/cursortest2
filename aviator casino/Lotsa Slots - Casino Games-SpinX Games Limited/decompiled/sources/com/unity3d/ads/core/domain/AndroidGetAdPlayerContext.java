package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetAdPlayerContext.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetAdPlayerContext {
    public static final java.lang.String KEY_GAME_ID = "gameId";
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetAdPlayerContext(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation) {
        com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 androidGetAdPlayerContext$invoke$1;
        int i;
        com.unity3d.ads.core.domain.AndroidGetAdPlayerContext androidGetAdPlayerContext;
        java.lang.String gameId;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1) {
            androidGetAdPlayerContext$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1) continuation;
            if ((androidGetAdPlayerContext$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetAdPlayerContext$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidGetAdPlayerContext$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetAdPlayerContext$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdPlayerContext$invoke$1.L$0 = this;
                    androidGetAdPlayerContext$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetAdPlayerContext$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetAdPlayerContext = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidGetAdPlayerContext = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext) androidGetAdPlayerContext$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj;
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = androidGetAdPlayerContext.deviceInfoRepository.getDynamicDeviceInfo();
                gameId = androidGetAdPlayerContext.sessionRepository.getGameId();
                if (gameId == null) {
                    gameId = "";
                }
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bundleId", staticDeviceInfo.getBundleId()), kotlin.TuplesKt.to("bundleVersion", staticDeviceInfo.getBundleVersion()), kotlin.TuplesKt.to("webviewHash", "unknown"), kotlin.TuplesKt.to("sdkVersion", kotlin.coroutines.jvm.internal.Boxing.boxInt(com.unity3d.services.core.properties.SdkProperties.getVersionCode())), kotlin.TuplesKt.to("sdkVersionName", com.unity3d.services.core.properties.SdkProperties.getVersionName()), kotlin.TuplesKt.to("osVersion", staticDeviceInfo.getOsVersion()), kotlin.TuplesKt.to("systemLanguage", java.util.Locale.getDefault().toString()), kotlin.TuplesKt.to("deviceModel", staticDeviceInfo.getDeviceModel()), kotlin.TuplesKt.to("limitAdTracking", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(dynamicDeviceInfo.getLimitedTracking())), kotlin.TuplesKt.to("maxVolume", kotlin.coroutines.jvm.internal.Boxing.boxDouble(dynamicDeviceInfo.getAndroid().getMaxVolume())), kotlin.TuplesKt.to(KEY_GAME_ID, gameId));
            }
        }
        androidGetAdPlayerContext$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1(this, continuation);
        java.lang.Object obj2 = androidGetAdPlayerContext$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetAdPlayerContext$invoke$1.label;
        if (i != 0) {
        }
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2;
        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = androidGetAdPlayerContext.deviceInfoRepository.getDynamicDeviceInfo();
        gameId = androidGetAdPlayerContext.sessionRepository.getGameId();
        if (gameId == null) {
        }
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bundleId", staticDeviceInfo2.getBundleId()), kotlin.TuplesKt.to("bundleVersion", staticDeviceInfo2.getBundleVersion()), kotlin.TuplesKt.to("webviewHash", "unknown"), kotlin.TuplesKt.to("sdkVersion", kotlin.coroutines.jvm.internal.Boxing.boxInt(com.unity3d.services.core.properties.SdkProperties.getVersionCode())), kotlin.TuplesKt.to("sdkVersionName", com.unity3d.services.core.properties.SdkProperties.getVersionName()), kotlin.TuplesKt.to("osVersion", staticDeviceInfo2.getOsVersion()), kotlin.TuplesKt.to("systemLanguage", java.util.Locale.getDefault().toString()), kotlin.TuplesKt.to("deviceModel", staticDeviceInfo2.getDeviceModel()), kotlin.TuplesKt.to("limitAdTracking", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(dynamicDeviceInfo2.getLimitedTracking())), kotlin.TuplesKt.to("maxVolume", kotlin.coroutines.jvm.internal.Boxing.boxDouble(dynamicDeviceInfo2.getAndroid().getMaxVolume())), kotlin.TuplesKt.to(KEY_GAME_ID, gameId));
    }
}
