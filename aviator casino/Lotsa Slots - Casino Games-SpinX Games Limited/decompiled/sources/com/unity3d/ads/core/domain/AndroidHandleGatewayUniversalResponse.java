package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleGatewayUniversalResponse.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "appSetIdDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;)V", "invoke", "", com.ironsource.Ve.n, "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidHandleGatewayUniversalResponse implements com.unity3d.ads.core.domain.HandleGatewayUniversalResponse {
    private final com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource appSetIdDataSource;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidHandleGatewayUniversalResponse(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource appSetIdDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSetIdDataSource, "appSetIdDataSource");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.appSetIdDataSource = appSetIdDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1 androidHandleGatewayUniversalResponse$invoke$1;
        int i;
        gatewayprotocol.v1.MutableDataOuterClass.MutableData mutableData;
        gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii value;
        gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii;
        com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1) {
            androidHandleGatewayUniversalResponse$invoke$1 = (com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1) continuation;
            if ((androidHandleGatewayUniversalResponse$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayUniversalResponse$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidHandleGatewayUniversalResponse$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayUniversalResponse$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (universalResponse.hasError()) {
                        java.lang.String errorText = universalResponse.getError().getErrorText();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorText, "response.error.errorText");
                        throw new com.unity3d.ads.core.data.model.exception.GatewayException(errorText, new java.lang.IllegalStateException(universalResponse.getError().getErrorText()), "gateway_universal", universalResponse.getError().getErrorText());
                    }
                    if (universalResponse.hasMutableData()) {
                        mutableData = universalResponse.getMutableData();
                        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> allowedPii2 = this.deviceInfoRepository.getAllowedPii();
                        do {
                            value = allowedPii2.getValue();
                            allowedPii = mutableData.getAllowedPii();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedPii, "mutableData.allowedPii");
                        } while (!allowedPii2.compareAndSet(value, allowedPii));
                        if (mutableData.getAllowedPii().getAppsetId()) {
                            this.appSetIdDataSource.invoke();
                        }
                        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.sessionRepository;
                        com.google.protobuf.ByteString currentState = mutableData.getCurrentState();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentState, "mutableData.currentState");
                        sessionRepository.setGatewayState(currentState);
                        if (mutableData.hasSessionToken()) {
                            com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = this.sessionRepository;
                            com.google.protobuf.ByteString sessionToken = mutableData.getSessionToken();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionToken, "mutableData.sessionToken");
                            sessionRepository2.setSessionToken(sessionToken);
                        }
                        if (mutableData.hasPrivacy()) {
                            com.unity3d.ads.core.data.repository.SessionRepository sessionRepository3 = this.sessionRepository;
                            com.google.protobuf.ByteString privacy = mutableData.getPrivacy();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacy, "mutableData.privacy");
                            androidHandleGatewayUniversalResponse$invoke$1.L$0 = this;
                            androidHandleGatewayUniversalResponse$invoke$1.L$1 = mutableData;
                            androidHandleGatewayUniversalResponse$invoke$1.label = 1;
                            if (sessionRepository3.setPrivacy(privacy, androidHandleGatewayUniversalResponse$invoke$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        androidHandleGatewayUniversalResponse = this;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    mutableData = (gatewayprotocol.v1.MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$1;
                    androidHandleGatewayUniversalResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (mutableData.hasPrivacyFsm()) {
                        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository4 = androidHandleGatewayUniversalResponse.sessionRepository;
                        com.google.protobuf.ByteString privacyFsm = mutableData.getPrivacyFsm();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyFsm, "mutableData.privacyFsm");
                        androidHandleGatewayUniversalResponse$invoke$1.L$0 = null;
                        androidHandleGatewayUniversalResponse$invoke$1.L$1 = null;
                        androidHandleGatewayUniversalResponse$invoke$1.label = 3;
                        if (sessionRepository4.setPrivacyFsm(privacyFsm, androidHandleGatewayUniversalResponse$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                mutableData = (gatewayprotocol.v1.MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$1;
                androidHandleGatewayUniversalResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (mutableData.hasSessionCounters()) {
                    com.unity3d.ads.core.data.repository.SessionRepository sessionRepository5 = androidHandleGatewayUniversalResponse.sessionRepository;
                    gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters sessionCounters = mutableData.getSessionCounters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionCounters, "mutableData.sessionCounters");
                    sessionRepository5.setSessionCounters(sessionCounters);
                }
                if (mutableData.hasCache()) {
                    com.unity3d.ads.core.data.repository.SessionRepository sessionRepository6 = androidHandleGatewayUniversalResponse.sessionRepository;
                    com.google.protobuf.ByteString cache = mutableData.getCache();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cache, "mutableData.cache");
                    androidHandleGatewayUniversalResponse$invoke$1.L$0 = androidHandleGatewayUniversalResponse;
                    androidHandleGatewayUniversalResponse$invoke$1.L$1 = mutableData;
                    androidHandleGatewayUniversalResponse$invoke$1.label = 2;
                    if (sessionRepository6.setGatewayCache(cache, androidHandleGatewayUniversalResponse$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (mutableData.hasPrivacyFsm()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidHandleGatewayUniversalResponse$invoke$1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1(this, continuation);
        java.lang.Object obj2 = androidHandleGatewayUniversalResponse$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayUniversalResponse$invoke$1.label;
        if (i != 0) {
        }
        if (mutableData.hasSessionCounters()) {
        }
        if (mutableData.hasCache()) {
        }
        if (mutableData.hasPrivacyFsm()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
