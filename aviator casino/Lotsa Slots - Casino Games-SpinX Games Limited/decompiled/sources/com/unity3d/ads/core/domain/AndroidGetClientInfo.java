package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetClientInfo.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetClientInfo;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "fIdExistenceDataSource", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;Lcom/unity3d/ads/core/data/manager/OmidManager;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;)V", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetClientInfo implements com.unity3d.ads.core.domain.GetClientInfo {
    private final com.unity3d.ads.core.data.datasource.FIdExistenceDataSource fIdExistenceDataSource;
    private final com.unity3d.ads.core.data.repository.MediationRepository mediationRepository;
    private final com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager;
    private final com.unity3d.ads.core.data.manager.OmidManager omidManager;
    private final com.unity3d.ads.core.data.manager.ScarManager scarManager;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetClientInfo(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.MediationRepository mediationRepository, com.unity3d.ads.core.data.manager.OmidManager omidManager, com.unity3d.ads.core.data.manager.ScarManager scarManager, com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager, com.unity3d.ads.core.data.datasource.FIdExistenceDataSource fIdExistenceDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fIdExistenceDataSource, "fIdExistenceDataSource");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo> continuation) {
        com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1 androidGetClientInfo$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.domain.AndroidGetClientInfo androidGetClientInfo;
        gatewayprotocol.v1.ClientInfoKt.Dsl dsl;
        gatewayprotocol.v1.ClientInfoKt.Dsl dsl2;
        java.lang.String str;
        gatewayprotocol.v1.ClientInfoKt.Dsl dsl3;
        gatewayprotocol.v1.ClientInfoKt.Dsl dsl4;
        com.unity3d.ads.core.domain.AndroidGetClientInfo androidGetClientInfo2;
        java.lang.String str2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1) {
            androidGetClientInfo$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1) continuation;
            if ((androidGetClientInfo$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetClientInfo$invoke$1.label -= Integer.MIN_VALUE;
                obj = androidGetClientInfo$invoke$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetClientInfo$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.ClientInfoKt.Dsl.Companion companion = gatewayprotocol.v1.ClientInfoKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder newBuilder = gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    gatewayprotocol.v1.ClientInfoKt.Dsl _create = companion._create(newBuilder);
                    _create.setSdkVersion(41605);
                    _create.setSdkVersionName("4.16.5");
                    java.lang.String gameId = this.sessionRepository.getGameId();
                    if (gameId != null) {
                        _create.setGameId(gameId);
                    }
                    _create.setTest(this.sessionRepository.isTestModeEnabled());
                    _create.setPlatform(gatewayprotocol.v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                    _create.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
                    java.lang.String name = this.mediationRepository.getName();
                    if (name != null && _create.getMediationProvider() == gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM && (!kotlin.text.StringsKt.isBlank(name))) {
                        _create.setCustomMediationName(name);
                    }
                    java.lang.String version = this.mediationRepository.getVersion();
                    if (version != null) {
                        _create.setMediationVersion(version);
                    }
                    com.unity3d.ads.core.data.manager.ScarManager scarManager = this.scarManager;
                    androidGetClientInfo$invoke$1.L$0 = this;
                    androidGetClientInfo$invoke$1.L$1 = _create;
                    androidGetClientInfo$invoke$1.L$2 = _create;
                    androidGetClientInfo$invoke$1.label = 1;
                    java.lang.Object version2 = scarManager.getVersion(androidGetClientInfo$invoke$1);
                    if (version2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetClientInfo = this;
                    dsl = _create;
                    obj = version2;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dsl3 = (gatewayprotocol.v1.ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$2;
                        dsl4 = (gatewayprotocol.v1.ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$1;
                        androidGetClientInfo2 = (com.unity3d.ads.core.domain.AndroidGetClientInfo) androidGetClientInfo$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str2 = (java.lang.String) obj;
                        if (str2 != null) {
                            dsl3.setOfferwallVersion(str2);
                        }
                        dsl3.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
                        dsl3.setOmidPartnerVersion("1");
                        dsl3.setSdkDevelopmentPlatform(!com.unity3d.services.core.properties.MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
                        dsl3.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
                        return dsl4._build();
                    }
                    dsl2 = (gatewayprotocol.v1.ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$2;
                    dsl = (gatewayprotocol.v1.ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$1;
                    androidGetClientInfo = (com.unity3d.ads.core.domain.AndroidGetClientInfo) androidGetClientInfo$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    dsl2.setScarVersionName(str);
                }
                com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager = androidGetClientInfo.offerwallManager;
                androidGetClientInfo$invoke$1.L$0 = androidGetClientInfo;
                androidGetClientInfo$invoke$1.L$1 = dsl;
                androidGetClientInfo$invoke$1.L$2 = dsl2;
                androidGetClientInfo$invoke$1.label = 2;
                obj = offerwallManager.getVersion(androidGetClientInfo$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl3 = dsl2;
                dsl4 = dsl;
                androidGetClientInfo2 = androidGetClientInfo;
                str2 = (java.lang.String) obj;
                if (str2 != null) {
                }
                dsl3.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
                dsl3.setOmidPartnerVersion("1");
                dsl3.setSdkDevelopmentPlatform(!com.unity3d.services.core.properties.MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
                dsl3.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
                return dsl4._build();
            }
        }
        androidGetClientInfo$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1(this, continuation);
        obj = androidGetClientInfo$invoke$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetClientInfo$invoke$1.label;
        if (i != 0) {
        }
        str = (java.lang.String) obj;
        if (str != null) {
        }
        com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager2 = androidGetClientInfo.offerwallManager;
        androidGetClientInfo$invoke$1.L$0 = androidGetClientInfo;
        androidGetClientInfo$invoke$1.L$1 = dsl;
        androidGetClientInfo$invoke$1.L$2 = dsl2;
        androidGetClientInfo$invoke$1.label = 2;
        obj = offerwallManager2.getVersion(androidGetClientInfo$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
