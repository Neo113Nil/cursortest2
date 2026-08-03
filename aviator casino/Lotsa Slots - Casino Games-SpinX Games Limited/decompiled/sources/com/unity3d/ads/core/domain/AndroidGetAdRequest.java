package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetAdRequest.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "webViewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "tcfRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;Lcom/unity3d/ads/core/data/repository/TcfRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "impressionOpportunity", "Lcom/google/protobuf/ByteString;", "size", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGetAdRequest implements com.unity3d.ads.core.domain.GetAdRequest {
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.repository.TcfRepository tcfRepository;
    private final com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webViewConfigurationDataSource;

    public AndroidGetAdRequest(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webViewConfigurationDataSource, com.unity3d.ads.core.data.repository.TcfRepository tcfRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewConfigurationDataSource, "webViewConfigurationDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webViewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014f A[PHI: r1
      0x014f: PHI (r1v26 java.lang.Object) = (r1v23 java.lang.Object), (r1v1 java.lang.Object) binds: [B:24:0x014c, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(java.lang.String str, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1 androidGetAdRequest$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        gatewayprotocol.v1.AdRequestKt.Dsl _create;
        com.google.protobuf.ByteString byteString2;
        gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize2;
        com.unity3d.ads.core.domain.AndroidGetAdRequest androidGetAdRequest;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl;
        java.lang.String str2;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl2;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl3;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl4;
        gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize3;
        gatewayprotocol.v1.AdRequestKt.Dsl dsl5;
        com.unity3d.ads.core.domain.AndroidGetAdRequest androidGetAdRequest2;
        java.lang.String tcfString;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1) {
            androidGetAdRequest$invoke$1 = (com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1) continuation;
            if ((androidGetAdRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetAdRequest$invoke$1.label -= Integer.MIN_VALUE;
                obj = androidGetAdRequest$invoke$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetAdRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.AdRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdRequestKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.AdRequestOuterClass.AdRequest.Builder newBuilder = gatewayprotocol.v1.AdRequestOuterClass.AdRequest.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    _create = companion._create(newBuilder);
                    _create.setSessionCounters(this.sessionRepository.getSessionCounters());
                    com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdRequest$invoke$1.L$0 = this;
                    androidGetAdRequest$invoke$1.L$1 = str;
                    byteString2 = byteString;
                    androidGetAdRequest$invoke$1.L$2 = byteString2;
                    bannerSize2 = bannerSize;
                    androidGetAdRequest$invoke$1.L$3 = bannerSize2;
                    androidGetAdRequest$invoke$1.L$4 = _create;
                    androidGetAdRequest$invoke$1.L$5 = _create;
                    androidGetAdRequest$invoke$1.L$6 = _create;
                    androidGetAdRequest$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetAdRequest$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidGetAdRequest = this;
                    dsl = _create;
                    str2 = str;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dsl3 = (gatewayprotocol.v1.AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                        dsl4 = (gatewayprotocol.v1.AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$3;
                        dsl5 = (gatewayprotocol.v1.AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$2;
                        bannerSize3 = (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$1;
                        androidGetAdRequest2 = (com.unity3d.ads.core.domain.AndroidGetAdRequest) androidGetAdRequest$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        dsl3.setWebviewVersion(((com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore) obj).getVersion());
                        dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
                        if (bannerSize3 != null) {
                            dsl4.setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
                        } else {
                            dsl4.setAdRequestType(gatewayprotocol.v1.AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                            dsl4.setBannerSize(bannerSize3);
                        }
                        tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
                        if (tcfString != null) {
                            dsl4.setTcf(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(tcfString));
                        }
                        gatewayprotocol.v1.AdRequestOuterClass.AdRequest _build = dsl5._build();
                        gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
                        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                        _create2.setAdRequest(_build);
                        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdRequest2.getUniversalRequestForPayLoad;
                        androidGetAdRequest$invoke$1.L$0 = null;
                        androidGetAdRequest$invoke$1.L$1 = null;
                        androidGetAdRequest$invoke$1.L$2 = null;
                        androidGetAdRequest$invoke$1.L$3 = null;
                        androidGetAdRequest$invoke$1.L$4 = null;
                        androidGetAdRequest$invoke$1.label = 3;
                        obj = getUniversalRequestForPayLoad.invoke(_build2, androidGetAdRequest$invoke$1);
                        return obj != coroutine_suspended ? coroutine_suspended : obj;
                    }
                    _create = (gatewayprotocol.v1.AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$6;
                    dsl2 = (gatewayprotocol.v1.AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$5;
                    gatewayprotocol.v1.AdRequestKt.Dsl dsl6 = (gatewayprotocol.v1.AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                    bannerSize2 = (gatewayprotocol.v1.AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$3;
                    com.google.protobuf.ByteString byteString3 = (com.google.protobuf.ByteString) androidGetAdRequest$invoke$1.L$2;
                    str2 = (java.lang.String) androidGetAdRequest$invoke$1.L$1;
                    androidGetAdRequest = (com.unity3d.ads.core.domain.AndroidGetAdRequest) androidGetAdRequest$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dsl = dsl6;
                    byteString2 = byteString3;
                }
                _create.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl2.setDynamicDeviceInfo(androidGetAdRequest.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setImpressionOpportunityId(byteString2);
                dsl2.setPlacementId(str2);
                dsl2.setRequestImpressionConfiguration(true);
                com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource = androidGetAdRequest.webViewConfigurationDataSource;
                androidGetAdRequest$invoke$1.L$0 = androidGetAdRequest;
                androidGetAdRequest$invoke$1.L$1 = bannerSize2;
                androidGetAdRequest$invoke$1.L$2 = dsl;
                androidGetAdRequest$invoke$1.L$3 = dsl2;
                androidGetAdRequest$invoke$1.L$4 = dsl2;
                androidGetAdRequest$invoke$1.L$5 = null;
                androidGetAdRequest$invoke$1.L$6 = null;
                androidGetAdRequest$invoke$1.label = 2;
                obj = webviewConfigurationDataSource.get(androidGetAdRequest$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl3 = dsl2;
                dsl4 = dsl3;
                bannerSize3 = bannerSize2;
                dsl5 = dsl;
                androidGetAdRequest2 = androidGetAdRequest;
                dsl3.setWebviewVersion(((com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore) obj).getVersion());
                dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
                if (bannerSize3 != null) {
                }
                tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
                if (tcfString != null) {
                }
                gatewayprotocol.v1.AdRequestOuterClass.AdRequest _build3 = dsl5._build();
                gatewayprotocol.v1.UniversalRequestKt universalRequestKt2 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder()");
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
                _create22.setAdRequest(_build3);
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetAdRequest2.getUniversalRequestForPayLoad;
                androidGetAdRequest$invoke$1.L$0 = null;
                androidGetAdRequest$invoke$1.L$1 = null;
                androidGetAdRequest$invoke$1.L$2 = null;
                androidGetAdRequest$invoke$1.L$3 = null;
                androidGetAdRequest$invoke$1.L$4 = null;
                androidGetAdRequest$invoke$1.label = 3;
                obj = getUniversalRequestForPayLoad2.invoke(_build22, androidGetAdRequest$invoke$1);
                if (obj != coroutine_suspended) {
                }
            }
        }
        androidGetAdRequest$invoke$1 = new com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1(this, continuation);
        obj = androidGetAdRequest$invoke$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetAdRequest$invoke$1.label;
        if (i != 0) {
        }
        _create.setStaticDeviceInfo((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl2.setDynamicDeviceInfo(androidGetAdRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString2);
        dsl2.setPlacementId(str2);
        dsl2.setRequestImpressionConfiguration(true);
        com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource webviewConfigurationDataSource2 = androidGetAdRequest.webViewConfigurationDataSource;
        androidGetAdRequest$invoke$1.L$0 = androidGetAdRequest;
        androidGetAdRequest$invoke$1.L$1 = bannerSize2;
        androidGetAdRequest$invoke$1.L$2 = dsl;
        androidGetAdRequest$invoke$1.L$3 = dsl2;
        androidGetAdRequest$invoke$1.L$4 = dsl2;
        androidGetAdRequest$invoke$1.L$5 = null;
        androidGetAdRequest$invoke$1.L$6 = null;
        androidGetAdRequest$invoke$1.label = 2;
        obj = webviewConfigurationDataSource2.get(androidGetAdRequest$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
