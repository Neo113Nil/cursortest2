package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetLimitedSessionToken.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetLimitedSessionToken implements com.unity3d.ads.core.domain.GetLimitedSessionToken {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.repository.MediationRepository mediationRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetLimitedSessionToken(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.MediationRepository mediationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken> continuation) {
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1 androidGetLimitedSessionToken$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl _create;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl2;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl3;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl4;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl5;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken2;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl6;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl7;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl8;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken3;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl9;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl10;
        gatewayprotocol.v1.LimitedSessionTokenKt.Dsl dsl11;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken androidGetLimitedSessionToken4;
        java.lang.String gameId;
        java.lang.String name;
        java.lang.String version;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1) {
            androidGetLimitedSessionToken$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1) continuation;
            if ((androidGetLimitedSessionToken$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetLimitedSessionToken$invoke$1.label -= Integer.MIN_VALUE;
                obj = androidGetLimitedSessionToken$invoke$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetLimitedSessionToken$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.LimitedSessionTokenKt.Dsl.Companion companion = gatewayprotocol.v1.LimitedSessionTokenKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder newBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    _create = companion._create(newBuilder);
                    _create.setSessionId(this.sessionRepository.getSessionId());
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = this;
                    androidGetLimitedSessionToken$invoke$1.L$1 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$2 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$3 = _create;
                    androidGetLimitedSessionToken$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetLimitedSessionToken = this;
                    dsl = _create;
                    dsl2 = dsl;
                } else if (i == 1) {
                    _create = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$3;
                    dsl = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                    dsl2 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                    androidGetLimitedSessionToken = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) androidGetLimitedSessionToken$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dsl9 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$3;
                            dsl10 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                            dsl11 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                            androidGetLimitedSessionToken4 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) androidGetLimitedSessionToken$invoke$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            dsl9.setIdfi((java.lang.String) obj);
                            dsl10.setSdkVersion(41605);
                            dsl10.setSdkVersionName("4.16.5");
                            gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
                            if (gameId != null) {
                                dsl10.setGameId(gameId);
                            }
                            dsl10.setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                            dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
                            name = androidGetLimitedSessionToken4.mediationRepository.getName();
                            if (name != null && dsl10.getMediationProvider() == gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                                dsl10.setCustomMediationName(name);
                            }
                            version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
                            if (version != null) {
                                dsl10.setMediationVersion(version);
                            }
                            return dsl11._build();
                        }
                        dsl6 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$3;
                        dsl7 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                        dsl8 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                        androidGetLimitedSessionToken3 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) androidGetLimitedSessionToken$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String osVersion = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(osVersion, "deviceInfoRepository.staticDeviceInfo().osVersion");
                        dsl6.setOsVersion(osVersion);
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository2 = androidGetLimitedSessionToken3.deviceInfoRepository;
                        androidGetLimitedSessionToken$invoke$1.L$0 = androidGetLimitedSessionToken3;
                        androidGetLimitedSessionToken$invoke$1.L$1 = dsl8;
                        androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                        androidGetLimitedSessionToken$invoke$1.L$3 = dsl7;
                        androidGetLimitedSessionToken$invoke$1.label = 4;
                        obj = deviceInfoRepository2.getIdfi(androidGetLimitedSessionToken$invoke$1);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dsl9 = dsl7;
                        dsl10 = dsl9;
                        dsl11 = dsl8;
                        androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
                        dsl9.setIdfi((java.lang.String) obj);
                        dsl10.setSdkVersion(41605);
                        dsl10.setSdkVersionName("4.16.5");
                        gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
                        if (gameId != null) {
                        }
                        dsl10.setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                        dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
                        name = androidGetLimitedSessionToken4.mediationRepository.getName();
                        if (name != null) {
                            dsl10.setCustomMediationName(name);
                        }
                        version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
                        if (version != null) {
                        }
                        return dsl11._build();
                    }
                    dsl3 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$3;
                    dsl4 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                    dsl5 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                    androidGetLimitedSessionToken2 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken) androidGetLimitedSessionToken$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String deviceModel = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceModel, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
                    dsl3.setDeviceModel(deviceModel);
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository3 = androidGetLimitedSessionToken2.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = androidGetLimitedSessionToken2;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl5;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.L$3 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.label = 3;
                    obj = deviceInfoRepository3.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl6 = dsl4;
                    dsl7 = dsl6;
                    dsl8 = dsl5;
                    androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                    java.lang.String osVersion2 = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(osVersion2, "deviceInfoRepository.staticDeviceInfo().osVersion");
                    dsl6.setOsVersion(osVersion2);
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository22 = androidGetLimitedSessionToken3.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = androidGetLimitedSessionToken3;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl8;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.L$3 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.label = 4;
                    obj = deviceInfoRepository22.getIdfi(androidGetLimitedSessionToken$invoke$1);
                    if (obj != coroutine_suspended) {
                    }
                }
                java.lang.String deviceMake = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceMake, "deviceInfoRepository.staticDeviceInfo().deviceMake");
                _create.setDeviceMake(deviceMake);
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository4 = androidGetLimitedSessionToken.deviceInfoRepository;
                androidGetLimitedSessionToken$invoke$1.L$0 = androidGetLimitedSessionToken;
                androidGetLimitedSessionToken$invoke$1.L$1 = dsl2;
                androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
                androidGetLimitedSessionToken$invoke$1.L$3 = dsl;
                androidGetLimitedSessionToken$invoke$1.label = 2;
                obj = deviceInfoRepository4.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl3 = dsl;
                dsl4 = dsl3;
                dsl5 = dsl2;
                androidGetLimitedSessionToken2 = androidGetLimitedSessionToken;
                java.lang.String deviceModel2 = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceModel2, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
                dsl3.setDeviceModel(deviceModel2);
                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository32 = androidGetLimitedSessionToken2.deviceInfoRepository;
                androidGetLimitedSessionToken$invoke$1.L$0 = androidGetLimitedSessionToken2;
                androidGetLimitedSessionToken$invoke$1.L$1 = dsl5;
                androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                androidGetLimitedSessionToken$invoke$1.L$3 = dsl4;
                androidGetLimitedSessionToken$invoke$1.label = 3;
                obj = deviceInfoRepository32.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                if (obj != coroutine_suspended) {
                }
            }
        }
        androidGetLimitedSessionToken$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1(this, continuation);
        obj = androidGetLimitedSessionToken$invoke$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetLimitedSessionToken$invoke$1.label;
        if (i != 0) {
        }
        java.lang.String deviceMake2 = ((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceMake2, "deviceInfoRepository.staticDeviceInfo().deviceMake");
        _create.setDeviceMake(deviceMake2);
        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository42 = androidGetLimitedSessionToken.deviceInfoRepository;
        androidGetLimitedSessionToken$invoke$1.L$0 = androidGetLimitedSessionToken;
        androidGetLimitedSessionToken$invoke$1.L$1 = dsl2;
        androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
        androidGetLimitedSessionToken$invoke$1.L$3 = dsl;
        androidGetLimitedSessionToken$invoke$1.label = 2;
        obj = deviceInfoRepository42.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
