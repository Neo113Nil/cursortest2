package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetUniversalRequestSharedData.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestSharedData;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "developerConsentRepository", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetUniversalRequestSharedData implements com.unity3d.ads.core.domain.GetUniversalRequestSharedData {
    private final com.unity3d.ads.core.data.repository.DeveloperConsentRepository developerConsentRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken;
    private final com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(com.unity3d.ads.core.domain.GetSharedDataTimestamps getSharedDataTimestamps, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken, com.unity3d.ads.core.data.repository.DeveloperConsentRepository developerConsentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData> continuation) {
        com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 androidGetUniversalRequestSharedData$invoke$1;
        int i;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl _create;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl2;
        gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl dsl3;
        com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1) {
            androidGetUniversalRequestSharedData$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1) continuation;
            if ((androidGetUniversalRequestSharedData$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetUniversalRequestSharedData$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidGetUniversalRequestSharedData$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetUniversalRequestSharedData$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                    gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    _create = companion._create(newBuilder);
                    com.google.protobuf.ByteString sessionToken = this.sessionRepository.getSessionToken();
                    if (!sessionToken.isEmpty()) {
                        _create.setSessionToken(sessionToken);
                        androidGetUniversalRequestSharedData = this;
                        dsl3 = _create;
                        _create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
                        _create.setSdkStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()));
                        _create.setAppStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()));
                        _create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
                        _create.setPii(androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData());
                        return dsl3._build();
                    }
                    com.unity3d.ads.core.domain.GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                    androidGetUniversalRequestSharedData$invoke$1.L$0 = this;
                    androidGetUniversalRequestSharedData$invoke$1.L$1 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.L$2 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.L$3 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.label = 1;
                    java.lang.Object invoke = getLimitedSessionToken.invoke(androidGetUniversalRequestSharedData$invoke$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                    dsl3 = dsl2;
                    obj = invoke;
                    androidGetUniversalRequestSharedData = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$3;
                    dsl2 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$2;
                    dsl3 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$1;
                    androidGetUniversalRequestSharedData = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData) androidGetUniversalRequestSharedData$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                dsl.setLimitedSessionToken((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) obj);
                _create = dsl2;
                _create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
                _create.setSdkStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()));
                _create.setAppStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()));
                _create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
                _create.setPii(androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData());
                return dsl3._build();
            }
        }
        androidGetUniversalRequestSharedData$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1(this, continuation);
        java.lang.Object obj2 = androidGetUniversalRequestSharedData$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetUniversalRequestSharedData$invoke$1.label;
        if (i != 0) {
        }
        dsl.setLimitedSessionToken((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) obj2);
        _create = dsl2;
        _create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
        _create.setSdkStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()));
        _create.setAppStartTime(com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()));
        _create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
        _create.setPii(androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData());
        return dsl3._build();
    }
}
