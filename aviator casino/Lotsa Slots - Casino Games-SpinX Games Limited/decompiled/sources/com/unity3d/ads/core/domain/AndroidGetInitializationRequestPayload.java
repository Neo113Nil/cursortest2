package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetInitializationRequestPayload.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "mediationInitBlobMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetInitializationRequestPayload implements com.unity3d.ads.core.domain.GetInitializationRequestPayload {
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetClientInfo getClientInfo;
    private final com.unity3d.ads.core.data.repository.LegacyUserConsentRepository legacyUserConsentRepository;
    private final com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(com.unity3d.ads.core.domain.GetClientInfo getClientInfo, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.LegacyUserConsentRepository legacyUserConsentRepository, com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader mediationInitBlobMetadataReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyUserConsentRepository, "legacyUserConsentRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0315, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x035e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f2  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1 androidGetInitializationRequestPayload$invoke$1;
        gatewayprotocol.v1.InitializationRequestKt.Dsl _create;
        boolean z;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl2;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl3;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl4;
        java.lang.String analyticsUserId;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl _create2;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl dsl5;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl dsl6;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl7;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl dsl8;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl9;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl10;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3;
        com.google.protobuf.ByteString byteString;
        java.lang.String str;
        java.lang.String str2;
        com.google.protobuf.ByteString byteString2;
        com.google.protobuf.ByteString byteString3;
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.String legacyFlowUserConsent;
        java.lang.String unityInstallationId;
        java.lang.String unityMegaSessionId;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl11;
        gatewayprotocol.v1.InitializationRequestKt.Dsl dsl12;
        java.lang.String str4;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1) {
            androidGetInitializationRequestPayload$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1) continuation;
            if ((androidGetInitializationRequestPayload$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequestPayload$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj2 = androidGetInitializationRequestPayload$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (androidGetInitializationRequestPayload$invoke$1.label) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj2);
                        gatewayprotocol.v1.InitializationRequestKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationRequestKt.Dsl.INSTANCE;
                        gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.newBuilder();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                        _create = companion._create(newBuilder);
                        com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
                        if (storage.readStorage()) {
                            java.lang.Object obj3 = storage.get("configuration.hasInitialized");
                            java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
                            if (bool != null && bool.booleanValue()) {
                                z = true;
                                _create.setIsFirstInit(!z);
                                com.unity3d.ads.core.domain.GetClientInfo getClientInfo = this.getClientInfo;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = this;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = _create;
                                androidGetInitializationRequestPayload$invoke$1.label = 1;
                                obj2 = getClientInfo.invoke(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                androidGetInitializationRequestPayload = this;
                                dsl = _create;
                                dsl2 = dsl;
                                _create.setClientInfo((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) obj2);
                                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = androidGetInitializationRequestPayload.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl2;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.label = 2;
                                obj2 = deviceInfoRepository.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl3 = dsl;
                                dsl4 = dsl2;
                                dsl3.setIdfi((java.lang.String) obj2);
                                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                                if (analyticsUserId != null) {
                                    dsl.setAnalyticsUserId(analyticsUserId);
                                }
                                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                                gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.Companion companion2 = gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.INSTANCE;
                                gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder2 = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
                                _create2 = companion2._create(newBuilder2);
                                _create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                                _create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                                _create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                                _create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository2 = androidGetInitializationRequestPayload.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl4;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = _create2;
                                androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                                androidGetInitializationRequestPayload$invoke$1.L$6 = _create2;
                                androidGetInitializationRequestPayload$invoke$1.label = 3;
                                obj2 = deviceInfoRepository2.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl5 = _create2;
                                dsl6 = dsl5;
                                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                                dsl7 = dsl;
                                _create2.setTotalDiskSpace(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2).getTotalDiskSpace());
                                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository3 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl4;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl7;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = dsl6;
                                androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$5 = dsl5;
                                androidGetInitializationRequestPayload$invoke$1.L$6 = dsl5;
                                androidGetInitializationRequestPayload$invoke$1.label = 4;
                                obj2 = deviceInfoRepository3.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl8 = dsl5;
                                dsl8.setTotalRamMemory(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2).getTotalRamMemory());
                                dsl5.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                                java.lang.String networkOperator = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperator, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                                dsl5.setNetworkOperator(networkOperator);
                                dsl5.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                                dsl5.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                                dsl5.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                                java.lang.String language = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "deviceInfoRepository.dynamicDeviceInfo.language");
                                dsl5.setLanguage(language);
                                dsl5.setLocalList(kotlin.collections.CollectionsKt.joinToString$default(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                                dsl5.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                                dsl.setDeviceInfo(dsl6._build());
                                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository4 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl4;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl7;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                                androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                                androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                                androidGetInitializationRequestPayload$invoke$1.L$6 = null;
                                androidGetInitializationRequestPayload$invoke$1.label = 5;
                                obj2 = deviceInfoRepository4.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl9 = dsl7;
                                dsl10 = dsl4;
                                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                                byteString = (com.google.protobuf.ByteString) obj2;
                                if (byteString != null) {
                                    dsl9.setAuid(byteString);
                                }
                                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository5 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.label = 6;
                                obj2 = deviceInfoRepository5.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str = (java.lang.String) obj2;
                                str2 = str;
                                if (str2 != null && str2.length() != 0) {
                                    dsl9.setAuidString(str);
                                }
                                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = androidGetInitializationRequestPayload3.sessionRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.label = 7;
                                obj2 = sessionRepository.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteString2 = (com.google.protobuf.ByteString) obj2;
                                if (!byteString2.isEmpty()) {
                                    dsl9.setPrivacy(byteString2);
                                }
                                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = androidGetInitializationRequestPayload3.sessionRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.label = 8;
                                obj2 = sessionRepository2.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteString3 = (com.google.protobuf.ByteString) obj2;
                                if (!byteString3.isEmpty()) {
                                    dsl9.setCache(byteString3);
                                }
                                com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader mediationInitBlobMetadataReader = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                                obj = mediationInitBlobMetadataReader.getJsonStorage().get(mediationInitBlobMetadataReader.getKey());
                                if (obj != null) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
                                    if (!(obj instanceof java.lang.String)) {
                                        obj = null;
                                        break;
                                    }
                                }
                                obj = null;
                                str3 = (java.lang.String) obj;
                                if (str3 != null) {
                                    dsl9.setUadsInitBlob(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(str3));
                                }
                                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                if (legacyFlowUserConsent != null) {
                                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                }
                                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                                if (unityInstallationId != null) {
                                    dsl9.setUnityInstallationId(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                }
                                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                                if (unityMegaSessionId != null) {
                                    dsl9.setUnityMegaSessionId(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                }
                                com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository6 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                                androidGetInitializationRequestPayload$invoke$1.label = 9;
                                obj2 = deviceInfoRepository6.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl11 = dsl9;
                                dsl12 = dsl10;
                                java.lang.String str5 = (java.lang.String) obj2;
                                str4 = (java.lang.String) ((str5 != null || str5.length() == 0) ^ true ? obj2 : null);
                                if (str4 != null) {
                                    dsl11.setUnityBuildGuid(str4);
                                }
                                return dsl12._build();
                            }
                        }
                        z = false;
                        _create.setIsFirstInit(!z);
                        com.unity3d.ads.core.domain.GetClientInfo getClientInfo2 = this.getClientInfo;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = this;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = _create;
                        androidGetInitializationRequestPayload$invoke$1.label = 1;
                        obj2 = getClientInfo2.invoke(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 != coroutine_suspended) {
                        }
                        break;
                    case 1:
                        _create = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl2 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        _create.setClientInfo((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo) obj2);
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository7 = androidGetInitializationRequestPayload.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.label = 2;
                        obj2 = deviceInfoRepository7.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        dsl3 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl2 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        dsl4 = dsl2;
                        dsl3.setIdfi((java.lang.String) obj2);
                        analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                        if (analyticsUserId != null) {
                        }
                        dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.Companion companion22 = gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.INSTANCE;
                        gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder22 = gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder()");
                        _create2 = companion22._create(newBuilder22);
                        _create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                        _create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                        _create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                        _create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository22 = androidGetInitializationRequestPayload.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$6 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.label = 3;
                        obj2 = deviceInfoRepository22.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        _create2 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$6;
                        dsl5 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl6 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl7 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl4 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload2 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        _create2.setTotalDiskSpace(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2).getTotalDiskSpace());
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository32 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl7;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl6;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = dsl5;
                        androidGetInitializationRequestPayload$invoke$1.L$6 = dsl5;
                        androidGetInitializationRequestPayload$invoke$1.label = 4;
                        obj2 = deviceInfoRepository32.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 != coroutine_suspended) {
                        }
                        break;
                    case 4:
                        dsl8 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$6;
                        dsl5 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl6 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl7 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl4 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload2 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        dsl8.setTotalRamMemory(((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2).getTotalRamMemory());
                        dsl5.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                        java.lang.String networkOperator2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkOperator2, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                        dsl5.setNetworkOperator(networkOperator2);
                        dsl5.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                        dsl5.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                        dsl5.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                        java.lang.String language2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language2, "deviceInfoRepository.dynamicDeviceInfo.language");
                        dsl5.setLanguage(language2);
                        dsl5.setLocalList(kotlin.collections.CollectionsKt.joinToString$default(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                        dsl5.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                        dsl.setDeviceInfo(dsl6._build());
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository42 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl7;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$6 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 5;
                        obj2 = deviceInfoRepository42.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 != coroutine_suspended) {
                        }
                        break;
                    case 5:
                        dsl9 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl10 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        byteString = (com.google.protobuf.ByteString) obj2;
                        if (byteString != null) {
                        }
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository52 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 6;
                        obj2 = deviceInfoRepository52.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        str = (java.lang.String) obj2;
                        str2 = str;
                        if (str2 != null) {
                            dsl9.setAuidString(str);
                            break;
                        }
                        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository3 = androidGetInitializationRequestPayload3.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 7;
                        obj2 = sessionRepository3.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        byteString2 = (com.google.protobuf.ByteString) obj2;
                        if (!byteString2.isEmpty()) {
                        }
                        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository22 = androidGetInitializationRequestPayload3.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj2 = sessionRepository22.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        byteString3 = (com.google.protobuf.ByteString) obj2;
                        if (!byteString3.isEmpty()) {
                        }
                        com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader mediationInitBlobMetadataReader2 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                        obj = mediationInitBlobMetadataReader2.getJsonStorage().get(mediationInitBlobMetadataReader2.getKey());
                        if (obj != null) {
                        }
                        obj = null;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                        }
                        legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository62 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj2 = deviceInfoRepository62.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        break;
                    case 6:
                        dsl9 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl10 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        str = (java.lang.String) obj2;
                        str2 = str;
                        if (str2 != null) {
                        }
                        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository32 = androidGetInitializationRequestPayload3.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 7;
                        obj2 = sessionRepository32.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        byteString2 = (com.google.protobuf.ByteString) obj2;
                        if (!byteString2.isEmpty()) {
                        }
                        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository222 = androidGetInitializationRequestPayload3.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj2 = sessionRepository222.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        byteString3 = (com.google.protobuf.ByteString) obj2;
                        if (!byteString3.isEmpty()) {
                        }
                        com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader mediationInitBlobMetadataReader22 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                        obj = mediationInitBlobMetadataReader22.getJsonStorage().get(mediationInitBlobMetadataReader22.getKey());
                        if (obj != null) {
                        }
                        obj = null;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                        }
                        legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository622 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj2 = deviceInfoRepository622.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        break;
                    case 7:
                        dsl9 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl10 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        byteString2 = (com.google.protobuf.ByteString) obj2;
                        if (!byteString2.isEmpty()) {
                        }
                        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2222 = androidGetInitializationRequestPayload3.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj2 = sessionRepository2222.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        byteString3 = (com.google.protobuf.ByteString) obj2;
                        if (!byteString3.isEmpty()) {
                        }
                        com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader mediationInitBlobMetadataReader222 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                        obj = mediationInitBlobMetadataReader222.getJsonStorage().get(mediationInitBlobMetadataReader222.getKey());
                        if (obj != null) {
                        }
                        obj = null;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                        }
                        legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository6222 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj2 = deviceInfoRepository6222.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        break;
                    case 8:
                        dsl9 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl10 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        byteString3 = (com.google.protobuf.ByteString) obj2;
                        if (!byteString3.isEmpty()) {
                        }
                        com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader mediationInitBlobMetadataReader2222 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                        obj = mediationInitBlobMetadataReader2222.getJsonStorage().get(mediationInitBlobMetadataReader2222.getKey());
                        if (obj != null) {
                        }
                        obj = null;
                        str3 = (java.lang.String) obj;
                        if (str3 != null) {
                        }
                        legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository62222 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj2 = deviceInfoRepository62222.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj2 == coroutine_suspended) {
                        }
                        break;
                    case 9:
                        dsl11 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl12 = (gatewayprotocol.v1.InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        java.lang.String str52 = (java.lang.String) obj2;
                        if (str52 != null) {
                            break;
                        }
                        str4 = (java.lang.String) ((str52 != null || str52.length() == 0) ^ true ? obj2 : null);
                        if (str4 != null) {
                        }
                        return dsl12._build();
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidGetInitializationRequestPayload$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1(this, continuation);
        java.lang.Object obj22 = androidGetInitializationRequestPayload$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (androidGetInitializationRequestPayload$invoke$1.label) {
        }
    }
}
