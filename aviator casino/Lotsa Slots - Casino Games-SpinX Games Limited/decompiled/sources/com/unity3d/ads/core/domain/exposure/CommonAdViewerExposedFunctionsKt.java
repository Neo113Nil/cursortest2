package com.unity3d.ads.core.domain.exposure;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010\u0007\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001aH\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u000b\u0010\u001f\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010$\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010%\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010&\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u000b\u0010'\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u0013\u0010(\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010)\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010*\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000\u001a\u0013\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0000ø\u0001\u0000\u001a\u0013\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u000202H\u0000ø\u0001\u0000\u001a\u001b\u00103\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u00105\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010:\u001a\u00020\u00012\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020>H\u0000ø\u0001\u0000\u001a\u001b\u0010?\u001a\u00020\u00012\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010B\u001a\u00020\u00012\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010D\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0000ø\u0001\u0000\u001a\u000b\u0010G\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020J2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0000ø\u0001\u0000\u001a\u001b\u0010P\u001a\u00020\u00012\u0006\u0010P\u001a\u00020Q2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u001b\u0010R\u001a\u00020\u00012\u0006\u0010S\u001a\u00020T2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010U\u001a\u00020\u00012\u0006\u0010U\u001a\u00020VH\u0000ø\u0001\u0000\u001a\u0013\u0010W\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000\u001a\u0013\u0010X\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010Y\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010Z\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u0013\u0010[\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0000ø\u0001\u0000\u001a\u000b\u0010\\\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010]\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u000b\u0010^\u001a\u00020\u0001H\u0000ø\u0001\u0000\u001a\u001b\u0010_\u001a\u00020\u00012\u0006\u00108\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u0013\u0010`\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000\u001a\u000b\u0010a\u001a\u00020\u0001H\u0000ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"attributionRegisterClick", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "androidAttribution", "Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "attributionRegisterView", "clearStorage", "deleteStorage", com.vungle.ads.internal.presenter.NativeAdPresenter.DOWNLOAD, "cacheFile", "Lcom/unity3d/ads/core/domain/CacheFile;", "getAdContext", "getAndroidAdPlayerContext", "Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "adData", "Lcom/unity3d/ads/core/data/model/AdData;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "Lcom/unity3d/ads/core/data/model/ImpressionConfig;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lcom/unity3d/ads/core/data/model/AdDataRefreshToken;", "isOMActivated", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "getAdContext-yLuu4LI", "(Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/domain/om/IsOMActivated;Lcom/unity3d/ads/core/data/model/AdObject;)Lcom/unity3d/ads/adplayer/ExposedFunction;", "getAllowedPii", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getConnectionType", "getDeviceMaxVolume", "getDeviceVolume", "getKeysStorage", "getPrivacy", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getPrivacyFsm", "getScreenHeight", "getScreenWidth", "getSessionToken", "getStorage", "hbTokenIncrementStarts", "hbTokenIncrementWins", "hbTokenReset", "incrementBannerImpressionCount", "isAttributionAvailable", "isFileCached", "getIfFileCache", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "isOfferwallAdReady", "getIsOfferwallAdReady", "Lcom/unity3d/ads/core/domain/offerwall/GetIsOfferwallAdReady;", "loadOfferwallAd", "Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "loadScarAd", "Lcom/unity3d/ads/core/domain/scar/LoadScarAd;", "markCampaignStateShown", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omGetData", "getOmData", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "omImpression", "omImpressionOccurred", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "omStartSession", "Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "openUrl", "handleOpenUrl", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "readStorage", "refreshAdData", "refresh", "Lcom/unity3d/ads/core/domain/Refresh;", "request", "type", "Lcom/unity3d/services/core/network/model/RequestType;", "executeAdViewerRequest", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendOperativeEvent", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "sendPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "setAllowedPii", "setOpportunityTTL", "setOrientation", "setPrivacy", "setPrivacyFsm", "setStorage", "showOfferwallAd", "showScarAd", "updateCampaignState", "updateTrackingToken", "writeStorage", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonAdViewerExposedFunctionsKt {
    /* renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final com.unity3d.ads.adplayer.ExposedFunction m10344getAdContextyLuu4LI(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext getAndroidAdPlayerContext, java.lang.String adData, java.lang.String impressionConfig, java.lang.String adDataRefreshToken, com.unity3d.ads.core.domain.om.IsOMActivated isOMActivated, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isOMActivated, "isOMActivated");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getConnectionType(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getConnectionType$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType connectionType = com.unity3d.ads.core.data.repository.DeviceInfoRepository.this.getDynamicDeviceInfo().getConnectionType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getDeviceVolume(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceVolume$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.data.repository.DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getDeviceMaxVolume(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.data.repository.DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getScreenHeight(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(com.unity3d.ads.core.data.repository.DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getScreenWidth(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(com.unity3d.ads.core.data.repository.DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction openUrl(final com.unity3d.ads.core.data.model.AdObject adObject, final com.unity3d.ads.core.domain.HandleOpenUrl handleOpenUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleOpenUrl, "handleOpenUrl");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj;
                java.lang.Object orNull = kotlin.collections.ArraysKt.getOrNull(objArr, 1);
                org.json.JSONObject jSONObject = orNull instanceof org.json.JSONObject ? (org.json.JSONObject) orNull : null;
                java.lang.String optString = jSONObject != null ? jSONObject.optString("packageName") : null;
                java.lang.String optString2 = jSONObject != null ? jSONObject.optString("action", "android.intent.action.VIEW") : null;
                org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("extras") : null;
                return com.unity3d.ads.core.domain.HandleOpenUrl.this.invoke(adObject, str, optString, optString2, optJSONObject != null ? com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(optJSONObject) : null, jSONObject != null ? jSONObject.optBoolean(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT) : false, continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setOrientation(com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1(adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction sendOperativeEvent(com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(getOperativeEventApi, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction writeStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$writeStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.write((java.lang.String) obj, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction readStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$readStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.read((java.lang.String) obj, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction deleteStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$deleteStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.delete((java.lang.String) obj, (java.lang.String) obj2, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction clearStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$clearStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.clear((java.lang.String) obj, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getKeysStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getKeysStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = objArr[2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                com.unity3d.services.core.api.Storage.getKeys((java.lang.String) obj, (java.lang.String) obj2, (java.lang.Boolean) obj3, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.get((java.lang.String) obj, (java.lang.String) obj2, new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setStorage() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj2 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                com.unity3d.services.core.api.Storage.set((java.lang.String) obj, (java.lang.String) obj2, objArr[2], new com.unity3d.ads.core.utils.ContinuationFromCallback(safeContinuation));
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getPrivacyFsm(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(sessionRepository);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setPrivacyFsm(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(sessionRepository);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getPrivacy(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1(sessionRepository);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setPrivacy(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1(sessionRepository);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getAllowedPii(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAllowedPii$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(com.unity3d.ads.core.data.repository.DeviceInfoRepository.this.getAllowedPii().getValue().toByteArray(), 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return encodeToString;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setAllowedPii(final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii value;
                final gatewayprotocol.v1.AllowedPiiKt.Dsl _create;
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii> allowedPii = com.unity3d.ads.core.data.repository.DeviceInfoRepository.this.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    gatewayprotocol.v1.AllowedPiiKt.Dsl.Companion companion = gatewayprotocol.v1.AllowedPiiKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder builder = value.toBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
                    _create = companion._create(builder);
                    java.lang.Object opt = jSONObject.opt("idfa");
                    java.lang.Boolean bool = opt instanceof java.lang.Boolean ? (java.lang.Boolean) opt : null;
                    if (bool != null) {
                        new kotlin.jvm.internal.MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public java.lang.Object get() {
                                return java.lang.Boolean.valueOf(((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(java.lang.Object obj2) {
                                ((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).setIdfa(((java.lang.Boolean) obj2).booleanValue());
                            }
                        }.set(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool.booleanValue()));
                    }
                    java.lang.Object opt2 = jSONObject.opt("idfv");
                    java.lang.Boolean bool2 = opt2 instanceof java.lang.Boolean ? (java.lang.Boolean) opt2 : null;
                    if (bool2 != null) {
                        new kotlin.jvm.internal.MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public java.lang.Object get() {
                                return java.lang.Boolean.valueOf(((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(java.lang.Object obj2) {
                                ((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).setIdfv(((java.lang.Boolean) obj2).booleanValue());
                            }
                        }.set(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool2.booleanValue()));
                    }
                    java.lang.Object opt3 = jSONObject.opt("appset_id");
                    java.lang.Boolean bool3 = opt3 instanceof java.lang.Boolean ? (java.lang.Boolean) opt3 : null;
                    if (bool3 != null) {
                        new kotlin.jvm.internal.MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public java.lang.Object get() {
                                return java.lang.Boolean.valueOf(((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(java.lang.Object obj2) {
                                ((gatewayprotocol.v1.AllowedPiiKt.Dsl) this.receiver).setAppsetId(((java.lang.Boolean) obj2).booleanValue());
                            }
                        }.set(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool3.booleanValue()));
                    }
                } while (!allowedPii.compareAndSet(value, _create._build()));
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction getSessionToken(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getSessionToken$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(com.unity3d.ads.core.data.repository.SessionRepository.this.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction markCampaignStateShown(final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.unity3d.ads.core.data.repository.CampaignRepository.this.setShowTimestamp(adObject.getOpportunityId());
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction refreshAdData(com.unity3d.ads.core.domain.Refresh refresh, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refresh, "refresh");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1(refresh, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction updateTrackingToken(final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateTrackingToken$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                java.lang.String token = ((org.json.JSONObject) obj).optString(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                java.lang.String str = token;
                if (str != null && str.length() != 0) {
                    com.unity3d.ads.core.data.model.AdObject adObject2 = com.unity3d.ads.core.data.model.AdObject.this;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token, "token");
                    adObject2.setTrackingToken(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction sendPrivacyUpdateRequest(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(sendPrivacyUpdateRequest);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction sendDiagnosticEvent(final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.String obj;
                java.lang.Object obj2 = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj2;
                java.lang.Object obj3 = objArr[1];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj3;
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "tags.keys()");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    createMapBuilder.put(next, jSONObject.getString(next));
                }
                java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                java.lang.Object orNull = kotlin.collections.ArraysKt.getOrNull(objArr, 2);
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent.this, str, (orNull == null || (obj = orNull.toString()) == null) ? null : kotlin.coroutines.jvm.internal.Boxing.boxDouble(java.lang.Double.parseDouble(obj)), build, null, adObject, null, 40, null);
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction incrementBannerImpressionCount(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.unity3d.ads.core.data.repository.SessionRepository.this.incrementBannerImpressionCount();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction download(com.unity3d.ads.core.domain.CacheFile cacheFile, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1(cacheFile, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction isFileCached(final com.unity3d.ads.core.domain.GetIsFileCache getIfFileCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getIfFileCache, "getIfFileCache");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isFileCached$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return com.unity3d.ads.core.domain.GetIsFileCache.this.invoke((java.lang.String) obj, continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction omStartSession(com.unity3d.ads.core.domain.om.AndroidOmInteraction omStartSession, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omStartSession, "omStartSession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1(omStartSession, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction omFinishSession(com.unity3d.ads.core.domain.om.OmFinishSession omFinishSession, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omFinishSession, "omFinishSession");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1(omFinishSession, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction omImpression(com.unity3d.ads.core.domain.om.OmImpressionOccurred omImpressionOccurred, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omImpressionOccurred, "omImpressionOccurred");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1(omImpressionOccurred, adObject);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction omGetData(com.unity3d.ads.core.domain.om.GetOmData getOmData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOmData, "getOmData");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1(getOmData);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction isAttributionAvailable(final com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isAttributionAvailable$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return com.unity3d.ads.core.domain.attribution.AndroidAttribution.this.isAvailable(continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction attributionRegisterView(final com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterView$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution2 = com.unity3d.ads.core.domain.attribution.AndroidAttribution.this;
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((java.lang.String) obj, adObject, continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction attributionRegisterClick(final com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterClick$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                com.unity3d.ads.core.domain.attribution.AndroidAttribution androidAttribution2 = com.unity3d.ads.core.domain.attribution.AndroidAttribution.this;
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((java.lang.String) obj, adObject, continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction loadScarAd(com.unity3d.ads.core.domain.scar.LoadScarAd loadScarAd, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadScarAd, "loadScarAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1(adObject, loadScarAd);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction showScarAd() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showScarAd$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction hbTokenIncrementWins(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementWins$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.unity3d.ads.core.data.repository.SessionRepository.this.incrementTokenWinsCount();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction hbTokenIncrementStarts(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementStarts$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.unity3d.ads.core.data.repository.SessionRepository.this.incrementTokenStartsCount();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction hbTokenReset(final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenReset$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.unity3d.ads.core.data.repository.SessionRepository.this.resetTokenCounters();
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction loadOfferwallAd(com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd loadOfferwallAd, com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadOfferwallAd, "loadOfferwallAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1(adObject, loadOfferwallAd);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction showOfferwallAd() {
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showOfferwallAd$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction isOfferwallAdReady(final com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady getIsOfferwallAdReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isOfferwallAdReady$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<java.lang.Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                java.lang.String placementName = ((org.json.JSONObject) obj).optString("placementName");
                com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady getIsOfferwallAdReady2 = com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(placementName, "placementName");
                return getIsOfferwallAdReady2.invoke(placementName, continuation);
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction request(com.unity3d.services.core.network.model.RequestType type, com.unity3d.ads.core.domain.ExecuteAdViewerRequest executeAdViewerRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeAdViewerRequest, "executeAdViewerRequest");
        return new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1(executeAdViewerRequest, type);
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction setOpportunityTTL(final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOpportunityTTL$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object obj = objArr[0];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) obj).intValue();
                kotlinx.coroutines.flow.MutableStateFlow<kotlin.time.Duration> ttl = com.unity3d.ads.core.data.model.AdObject.this.getTtl();
                kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                ttl.setValue(kotlin.time.Duration.m12144boximpl(kotlin.time.DurationKt.toDuration(intValue, kotlin.time.DurationUnit.SECONDS)));
                return kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final com.unity3d.ads.adplayer.ExposedFunction updateCampaignState(final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, final com.unity3d.ads.core.data.model.AdObject adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new com.unity3d.ads.adplayer.ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateCampaignState$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
                return invoke2(objArr, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
            
                if (r0 != null) goto L26;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invoke2(java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                gatewayprotocol.v1.CampaignStateOuterClass.Campaign _build;
                java.lang.Object firstOrNull = kotlin.collections.ArraysKt.firstOrNull(objArr);
                org.json.JSONObject jSONObject = firstOrNull instanceof org.json.JSONObject ? (org.json.JSONObject) firstOrNull : null;
                if (jSONObject == null) {
                    throw new java.lang.IllegalArgumentException("Update campaign state requires a JSONObject".toString());
                }
                java.lang.String data = jSONObject.optString("data");
                java.lang.String str = data;
                if (!(!(str == null || kotlin.text.StringsKt.isBlank(str)))) {
                    throw new java.lang.IllegalArgumentException("Update campaign state requires a data string".toString());
                }
                int optInt = jSONObject.optInt("dataVersion");
                if (optInt == 0) {
                    throw new java.lang.IllegalArgumentException("Update campaign state requires a dataVersion integer".toString());
                }
                com.google.protobuf.ByteString opportunityId = com.unity3d.ads.core.data.model.AdObject.this.getOpportunityId();
                java.lang.String placementId = com.unity3d.ads.core.data.model.AdObject.this.getPlacementId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
                com.google.protobuf.ByteString fromBase64$default = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(data, false, 1, null);
                if (!(!fromBase64$default.isEmpty())) {
                    throw new java.lang.IllegalArgumentException("Update campaign state requires a non-empty data byte string".toString());
                }
                gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign = campaignRepository.getCampaign(opportunityId);
                if (campaign != null) {
                    gatewayprotocol.v1.CampaignKt.Dsl.Companion companion = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
                    gatewayprotocol.v1.CampaignKt.Dsl _create = companion._create(builder);
                    _create.setData(fromBase64$default);
                    _create.setDataVersion(optInt);
                    _build = _create._build();
                }
                gatewayprotocol.v1.CampaignKt.Dsl.Companion companion2 = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
                gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder newBuilder = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                gatewayprotocol.v1.CampaignKt.Dsl _create2 = companion2._create(newBuilder);
                _create2.setData(fromBase64$default);
                _create2.setDataVersion(optInt);
                _create2.setPlacementId(placementId);
                _create2.setImpressionOpportunityId(opportunityId);
                _build = _create2._build();
                campaignRepository.setCampaign(opportunityId, _build);
                return kotlin.Unit.INSTANCE;
            }
        };
    }
}
