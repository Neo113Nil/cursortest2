package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ3\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%JI\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0096Bø\u0001\u0000¢\u0006\u0002\u00102R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "getAdPlayer", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/domain/GetAdPlayer;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;)V", "cleanup", "", "t", "", "opportunityId", "Lcom/google/protobuf/ByteString;", com.ironsource.Ve.n, "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "context", "Landroid/content/Context;", "placementId", "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidHandleGatewayAdResponse implements com.unity3d.ads.core.domain.HandleGatewayAdResponse {
    private final com.unity3d.ads.adplayer.AdPlayerScope adPlayerScope;
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final com.unity3d.ads.core.domain.CacheWebViewAssets cacheWebViewAssets;
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetAdPlayer getAdPlayer;
    private final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi;
    private final com.unity3d.ads.core.domain.GetWebViewBridgeUseCase getWebViewBridge;
    private final com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHandleGatewayAdResponse(com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, com.unity3d.ads.core.domain.GetWebViewBridgeUseCase getWebViewBridge, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration, com.unity3d.ads.adplayer.AdPlayerScope adPlayerScope, com.unity3d.ads.core.domain.GetAdPlayer getAdPlayer, com.unity3d.ads.core.domain.CacheWebViewAssets cacheWebViewAssets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWebViewBridge, "getWebViewBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdPlayer, "getAdPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0266 A[Catch: CancellationException -> 0x05a4, TRY_ENTER, TRY_LEAVE, TryCatch #15 {CancellationException -> 0x05a4, blocks: (B:115:0x032d, B:127:0x023e, B:129:0x0266), top: B:126:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0524 A[Catch: CancellationException -> 0x0574, TRY_ENTER, TRY_LEAVE, TryCatch #23 {CancellationException -> 0x0574, blocks: (B:40:0x04a1, B:42:0x0524), top: B:39:0x04a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse, android.content.Context context, java.lang.String str, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation) {
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$1;
        com.google.protobuf.ByteString byteString2;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse2;
        java.lang.Object obj;
        java.util.concurrent.CancellationException cancellationException;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.google.protobuf.ByteString byteString3;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse3;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        boolean z2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.String str2;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse2;
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions2;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration;
        com.unity3d.ads.core.domain.CacheWebViewAssets cacheWebViewAssets;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        java.lang.String str3;
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions3;
        com.unity3d.ads.core.data.model.AdObject adObject;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration2;
        long m12261markNowz9LOYto;
        java.lang.String str4;
        java.lang.Throwable th;
        java.lang.String str5;
        java.lang.String base64ImpressionConfiguration;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        java.lang.String str6;
        com.google.protobuf.ByteString byteString4;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        java.lang.String str7;
        java.lang.Object m10798constructorimpl;
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions4;
        com.unity3d.ads.core.data.model.AdObject copy;
        java.lang.Object obj2;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse5;
        java.lang.String str8;
        long j;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse3;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse4;
        com.unity3d.ads.adplayer.model.LoadEvent loadEvent;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse5;
        com.unity3d.ads.core.data.model.AdObject adObject2;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        com.unity3d.ads.adplayer.model.LoadEvent loadEvent2;
        org.json.JSONObject data;
        kotlinx.coroutines.NonCancellable nonCancellable;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5 androidHandleGatewayAdResponse$invoke$5;
        java.lang.Throwable cause;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1) {
            androidHandleGatewayAdResponse$invoke$1 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1) continuation;
            if ((androidHandleGatewayAdResponse$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj3 = androidHandleGatewayAdResponse$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (androidHandleGatewayAdResponse$invoke$1.label) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = new kotlin.jvm.internal.Ref.ObjectRef();
                        try {
                            try {
                                if (adResponse.hasError()) {
                                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, null, "gateway", adResponse.getError().getErrorText(), false, 36, null);
                                }
                                if (adResponse.getAdData().isEmpty()) {
                                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL, com.unity3d.ads.core.data.model.LoadResult.MSG_NO_FILL, null, "no_fill", null, false, 52, null);
                                }
                                com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration = this.getLatestWebViewConfiguration;
                                java.lang.String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(adResponse.getWebviewConfiguration().getVersion());
                                java.util.List<java.lang.String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                                java.lang.String type = adResponse.getWebviewConfiguration().getType();
                                androidHandleGatewayAdResponse$invoke$1.L$0 = this;
                                androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions;
                                byteString2 = byteString;
                                try {
                                    androidHandleGatewayAdResponse$invoke$1.L$2 = byteString2;
                                    adResponse2 = adResponse;
                                    try {
                                        androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse2;
                                        androidHandleGatewayAdResponse$invoke$1.L$4 = str;
                                        androidHandleGatewayAdResponse$invoke$1.L$5 = diagnosticAdType;
                                        androidHandleGatewayAdResponse$invoke$1.L$6 = objectRef5;
                                        androidHandleGatewayAdResponse$invoke$1.Z$0 = z;
                                        androidHandleGatewayAdResponse$invoke$1.label = 1;
                                        java.lang.Object invoke = getLatestWebViewConfiguration.invoke(entryPoint, boxInt, additionalFilesList, type, androidHandleGatewayAdResponse$invoke$1);
                                        if (invoke == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        diagnosticAdType2 = diagnosticAdType;
                                        z2 = z;
                                        objectRef2 = objectRef5;
                                        byteString3 = byteString2;
                                        adResponse3 = adResponse2;
                                        str2 = str;
                                        androidHandleGatewayAdResponse2 = this;
                                        unityAdsLoadOptions2 = unityAdsLoadOptions;
                                        obj3 = invoke;
                                        try {
                                            webViewConfiguration = (com.unity3d.ads.core.data.model.WebViewConfiguration) obj3;
                                            com.google.protobuf.ByteString trackingToken = adResponse3.getTrackingToken();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "trackingToken");
                                            com.unity3d.ads.core.data.model.AdObject adObject3 = new com.unity3d.ads.core.data.model.AdObject(byteString3, str2, trackingToken, false, null, null, null, false, null, null, null, unityAdsLoadOptions2, z2, diagnosticAdType2, null, null, 51192, null);
                                            cacheWebViewAssets = androidHandleGatewayAdResponse2.cacheWebViewAssets;
                                            androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse2;
                                            androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions2;
                                            androidHandleGatewayAdResponse$invoke$1.L$2 = byteString3;
                                            androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse3;
                                            androidHandleGatewayAdResponse$invoke$1.L$4 = str2;
                                            androidHandleGatewayAdResponse$invoke$1.L$5 = diagnosticAdType2;
                                            androidHandleGatewayAdResponse$invoke$1.L$6 = objectRef2;
                                            androidHandleGatewayAdResponse$invoke$1.L$7 = webViewConfiguration;
                                            androidHandleGatewayAdResponse$invoke$1.L$8 = adObject3;
                                            androidHandleGatewayAdResponse$invoke$1.label = 2;
                                            if (cacheWebViewAssets.invoke(webViewConfiguration, androidHandleGatewayAdResponse$invoke$1) != coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            diagnosticAdType3 = diagnosticAdType2;
                                            str3 = str2;
                                            unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                            adObject = adObject3;
                                            objectRef = objectRef2;
                                            webViewConfiguration2 = webViewConfiguration;
                                            try {
                                                if (webViewConfiguration2.getEntryPoint().length() != 0) {
                                                    try {
                                                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, false, 52, null);
                                                    } catch (java.util.concurrent.CancellationException e) {
                                                        cancellationException = e;
                                                        obj = coroutine_suspended;
                                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                        nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                        androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                        if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                        }
                                                        cause = cancellationException.getCause();
                                                        if (cause != null) {
                                                        }
                                                    }
                                                } else {
                                                    java.lang.String it = com.unity3d.services.core.properties.SdkProperties.getConfigUrl();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                                                    try {
                                                        if (!kotlin.text.StringsKt.endsWith$default(it, ".html", false, 2, (java.lang.Object) null)) {
                                                            it = null;
                                                        }
                                                        if (it == null) {
                                                            try {
                                                                it = webViewConfiguration2.getEntryPoint();
                                                            } catch (java.util.concurrent.CancellationException e2) {
                                                                cancellationException = e2;
                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                                obj = coroutine_suspended;
                                                                nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                }
                                                                cause = cancellationException.getCause();
                                                                if (cause != null) {
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            java.net.URI uri = new java.net.URI(it);
                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder("?platform=android&mode=ad-viewer&webviewType=");
                                                            sb.append(webViewConfiguration2.getType());
                                                            sb.append(kotlin.text.Typography.amp);
                                                            java.lang.String query = uri.getQuery();
                                                            if (query == null) {
                                                                query = "";
                                                            }
                                                            sb.append(query);
                                                            java.lang.String str9 = kotlin.text.StringsKt.substringBeforeLast$default(it, "?", (java.lang.String) null, 2, (java.lang.Object) null) + sb.toString();
                                                            java.lang.String encodeToString = android.util.Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                                                            m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                                                            try {
                                                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                                                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse7 = androidHandleGatewayAdResponse2;
                                                                com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                                                                com.unity3d.ads.adplayer.AdPlayerScope adPlayerScope = androidHandleGatewayAdResponse2.adPlayerScope;
                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse2;
                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions3;
                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = byteString3;
                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse3;
                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = str3;
                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = diagnosticAdType3;
                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = objectRef;
                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = adObject;
                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = str9;
                                                                str4 = encodeToString;
                                                                try {
                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = str4;
                                                                    androidHandleGatewayAdResponse$invoke$1.J$0 = m12261markNowz9LOYto;
                                                                    androidHandleGatewayAdResponse$invoke$1.label = 3;
                                                                    obj3 = androidGetWebViewContainerUseCase.invoke(adPlayerScope, androidHandleGatewayAdResponse$invoke$1);
                                                                    coroutine_suspended = coroutine_suspended;
                                                                } catch (java.lang.Throwable th2) {
                                                                    th = th2;
                                                                    coroutine_suspended = coroutine_suspended;
                                                                    java.lang.String str10 = str4;
                                                                    th = th;
                                                                    str5 = str9;
                                                                    base64ImpressionConfiguration = str10;
                                                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                                                    str7 = str5;
                                                                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                                    com.unity3d.ads.core.data.model.AdObject adObject4 = adObject;
                                                                    java.lang.String str11 = str3;
                                                                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                                    try {
                                                                        kotlin.time.TimedValue timedValue = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(m12261markNowz9LOYto), null);
                                                                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, !kotlin.Result.m10805isSuccessimpl(((kotlin.Result) timedValue.component1()).getValue()) ? "native_webview_success_time" : "native_webview_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(timedValue.getDuration(), kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject4, null, 44, null);
                                                                        java.lang.Object value = ((kotlin.Result) timedValue.getValue()).getValue();
                                                                        kotlin.ResultKt.throwOnFailure(value);
                                                                        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) value;
                                                                        com.unity3d.ads.adplayer.WebViewBridge invoke2 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                        objectRef.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke2, androidWebViewContainer, byteString3, diagnosticAdType3);
                                                                        copy = adObject4.copy((r34 & 1) != 0 ? adObject4.opportunityId : null, (r34 & 2) != 0 ? adObject4.placementId : null, (r34 & 4) != 0 ? adObject4.trackingToken : null, (r34 & 8) != 0 ? adObject4.isScarAd : false, (r34 & 16) != 0 ? adObject4.scarQueryId : null, (r34 & 32) != 0 ? adObject4.scarAdUnitId : null, (r34 & 64) != 0 ? adObject4.scarAdString : null, (r34 & 128) != 0 ? adObject4.isOfferwallAd : false, (r34 & 256) != 0 ? adObject4.offerwallPlacementName : null, (r34 & 512) != 0 ? adObject4.adPlayer : (com.unity3d.ads.adplayer.AdPlayer) objectRef.element, (r34 & 1024) != 0 ? adObject4.playerServerId : null, (r34 & 2048) != 0 ? adObject4.loadOptions : null, (r34 & 4096) != 0 ? adObject4.isHeaderBidding : false, (r34 & 8192) != 0 ? adObject4.adType : null, (r34 & 16384) != 0 ? adObject4.ttl : null, (r34 & 32768) != 0 ? adObject4.state : null);
                                                                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                                                                        long m12261markNowz9LOYto2 = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                                                                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, copy, null, 46, null);
                                                                        com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                                        kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation = invoke2.getOnInvocation();
                                                                        obj2 = coroutine_suspended;
                                                                        try {
                                                                            com.google.protobuf.ByteString adData = adResponse3.getAdData();
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData, "response.adData");
                                                                            java.lang.String base64$default = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                                            com.google.protobuf.ByteString adDataRefreshToken = adResponse3.getAdDataRefreshToken();
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "response.adDataRefreshToken");
                                                                            adResponse5 = adResponse3;
                                                                        } catch (java.util.concurrent.CancellationException e3) {
                                                                            e = e3;
                                                                        }
                                                                    } catch (java.util.concurrent.CancellationException e4) {
                                                                        e = e4;
                                                                        obj = coroutine_suspended;
                                                                    }
                                                                    try {
                                                                        java.lang.String base64$default2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null);
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                                                                        kotlinx.coroutines.flow.FlowKt.launchIn(handleInvocationsFromAdViewer.invoke(onInvocation, base64$default, base64$default2, base64ImpressionConfiguration, copy, new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3(androidHandleGatewayAdResponse, androidWebViewContainer, str7, adObject4, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                                                                        kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent = ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getOnLoadEvent();
                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions4;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = byteString3;
                                                                        adResponse3 = adResponse5;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse3;
                                                                        str8 = str11;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = str8;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = copy;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                        j = m12261markNowz9LOYto2;
                                                                        androidHandleGatewayAdResponse$invoke$1.J$0 = j;
                                                                        androidHandleGatewayAdResponse$invoke$1.label = 4;
                                                                        obj3 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent, androidHandleGatewayAdResponse$invoke$1);
                                                                        obj = obj2;
                                                                        if (obj3 == obj) {
                                                                        }
                                                                        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                        androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                                                                        try {
                                                                            loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) obj3;
                                                                            if (loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) {
                                                                            }
                                                                        } catch (java.util.concurrent.CancellationException e5) {
                                                                            e = e5;
                                                                            androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse3;
                                                                        }
                                                                    } catch (java.util.concurrent.CancellationException e6) {
                                                                        e = e6;
                                                                        adResponse3 = adResponse5;
                                                                        obj = obj2;
                                                                        cancellationException = e;
                                                                        nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                        androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                        if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                        }
                                                                        cause = cancellationException.getCause();
                                                                        if (cause != null) {
                                                                        }
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th3) {
                                                                th = th3;
                                                                str4 = encodeToString;
                                                            }
                                                            if (obj3 == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            adResponse4 = adResponse3;
                                                            objectRef3 = objectRef;
                                                            str6 = str9;
                                                            base64ImpressionConfiguration = str4;
                                                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                            byteString4 = byteString3;
                                                            diagnosticAdType4 = diagnosticAdType3;
                                                            m10798constructorimpl = kotlin.Result.m10798constructorimpl((com.unity3d.ads.adplayer.AndroidWebViewContainer) obj3);
                                                            str7 = str6;
                                                            objectRef = objectRef3;
                                                            diagnosticAdType3 = diagnosticAdType4;
                                                            byteString3 = byteString4;
                                                            adResponse3 = adResponse4;
                                                            com.unity3d.ads.core.data.model.AdObject adObject42 = adObject;
                                                            java.lang.String str112 = str3;
                                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                            kotlin.time.TimedValue timedValue2 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(m12261markNowz9LOYto), null);
                                                            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, !kotlin.Result.m10805isSuccessimpl(((kotlin.Result) timedValue2.component1()).getValue()) ? "native_webview_success_time" : "native_webview_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(timedValue2.getDuration(), kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject42, null, 44, null);
                                                            java.lang.Object value2 = ((kotlin.Result) timedValue2.getValue()).getValue();
                                                            kotlin.ResultKt.throwOnFailure(value2);
                                                            com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer2 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) value2;
                                                            com.unity3d.ads.adplayer.WebViewBridge invoke22 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer2, androidHandleGatewayAdResponse.adPlayerScope);
                                                            objectRef.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke22, androidWebViewContainer2, byteString3, diagnosticAdType3);
                                                            copy = adObject42.copy((r34 & 1) != 0 ? adObject42.opportunityId : null, (r34 & 2) != 0 ? adObject42.placementId : null, (r34 & 4) != 0 ? adObject42.trackingToken : null, (r34 & 8) != 0 ? adObject42.isScarAd : false, (r34 & 16) != 0 ? adObject42.scarQueryId : null, (r34 & 32) != 0 ? adObject42.scarAdUnitId : null, (r34 & 64) != 0 ? adObject42.scarAdString : null, (r34 & 128) != 0 ? adObject42.isOfferwallAd : false, (r34 & 256) != 0 ? adObject42.offerwallPlacementName : null, (r34 & 512) != 0 ? adObject42.adPlayer : (com.unity3d.ads.adplayer.AdPlayer) objectRef.element, (r34 & 1024) != 0 ? adObject42.playerServerId : null, (r34 & 2048) != 0 ? adObject42.loadOptions : null, (r34 & 4096) != 0 ? adObject42.isHeaderBidding : false, (r34 & 8192) != 0 ? adObject42.adType : null, (r34 & 16384) != 0 ? adObject42.ttl : null, (r34 & 32768) != 0 ? adObject42.state : null);
                                                            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                                                            long m12261markNowz9LOYto22 = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                                                            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, copy, null, 46, null);
                                                            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                            kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation2 = invoke22.getOnInvocation();
                                                            obj2 = coroutine_suspended;
                                                            com.google.protobuf.ByteString adData2 = adResponse3.getAdData();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData2, "response.adData");
                                                            java.lang.String base64$default3 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                                                            com.google.protobuf.ByteString adDataRefreshToken2 = adResponse3.getAdDataRefreshToken();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "response.adDataRefreshToken");
                                                            adResponse5 = adResponse3;
                                                            java.lang.String base64$default22 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null);
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                                                            kotlinx.coroutines.flow.FlowKt.launchIn(handleInvocationsFromAdViewer2.invoke(onInvocation2, base64$default3, base64$default22, base64ImpressionConfiguration, copy, new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3(androidHandleGatewayAdResponse, androidWebViewContainer2, str7, adObject42, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                                                            kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent2 = ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getOnLoadEvent();
                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse;
                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions4;
                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = byteString3;
                                                            adResponse3 = adResponse5;
                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse3;
                                                            str8 = str112;
                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = str8;
                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef;
                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = copy;
                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                            j = m12261markNowz9LOYto22;
                                                            androidHandleGatewayAdResponse$invoke$1.J$0 = j;
                                                            androidHandleGatewayAdResponse$invoke$1.label = 4;
                                                            obj3 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent2, androidHandleGatewayAdResponse$invoke$1);
                                                            obj = obj2;
                                                            if (obj3 == obj) {
                                                                return obj;
                                                            }
                                                            com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions52 = unityAdsLoadOptions4;
                                                            androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                                                            loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) obj3;
                                                            if (loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) {
                                                                try {
                                                                    androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse3;
                                                                    try {
                                                                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse3.sendDiagnosticEvent, "native_create_ad_object_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j))), null, null, copy, null, 44, null);
                                                                        kotlinx.coroutines.NonCancellable nonCancellable2 = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4 androidHandleGatewayAdResponse$invoke$4 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4(androidHandleGatewayAdResponse5, loadEvent, byteString3, adResponse3, objectRef, null);
                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse5;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString3;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse3;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = objectRef;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = copy;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = loadEvent;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.label = 5;
                                                                        if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable2, androidHandleGatewayAdResponse$invoke$4, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                            return obj;
                                                                        }
                                                                        adObject2 = copy;
                                                                        androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse5;
                                                                        objectRef4 = objectRef;
                                                                        loadEvent2 = loadEvent;
                                                                        try {
                                                                            return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), adObject2.isScarAd(), 4, null);
                                                                        } catch (java.util.concurrent.CancellationException e7) {
                                                                            cancellationException = e7;
                                                                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse6;
                                                                            objectRef = objectRef4;
                                                                            nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                            androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                            if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                            }
                                                                            cause = cancellationException.getCause();
                                                                            if (cause != null) {
                                                                            }
                                                                        }
                                                                    } catch (java.util.concurrent.CancellationException e8) {
                                                                        e = e8;
                                                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse5;
                                                                        cancellationException = e;
                                                                        nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                        androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                        if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                        }
                                                                        cause = cancellationException.getCause();
                                                                        if (cause != null) {
                                                                        }
                                                                    }
                                                                } catch (java.util.concurrent.CancellationException e9) {
                                                                    e = e9;
                                                                    androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse3;
                                                                }
                                                            } else {
                                                                com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidHandleGatewayAdResponse3.sendDiagnosticEvent;
                                                                java.lang.Double boxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                                                                androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse3;
                                                                try {
                                                                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_create_ad_object_success_time", boxDouble, null, null, copy, null, 44, null);
                                                                    androidHandleGatewayAdResponse4.campaignRepository.setLoadTimestamp(byteString3);
                                                                    androidHandleGatewayAdResponse4.adRepository.addAd(byteString3, copy);
                                                                    java.lang.String objectId = unityAdsLoadOptions52.getObjectId();
                                                                    if ((objectId == null || kotlin.text.StringsKt.isBlank(objectId)) && (data = unityAdsLoadOptions52.getData()) != null && !data.has("adMarkup")) {
                                                                        androidHandleGatewayAdResponse4.adRepository.enqueueOpportunityForPlacement(str8, byteString3);
                                                                    }
                                                                    return new com.unity3d.ads.core.data.model.LoadResult.Success(copy);
                                                                } catch (java.util.concurrent.CancellationException e10) {
                                                                    e = e10;
                                                                    cancellationException = e;
                                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                                                                    nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                    androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                    androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                    }
                                                                    cause = cancellationException.getCause();
                                                                    if (cause != null) {
                                                                    }
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable unused) {
                                                            obj = coroutine_suspended;
                                                            try {
                                                                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, null, "invalid_url", it, false, 36, null);
                                                            } catch (java.util.concurrent.CancellationException e11) {
                                                                e = e11;
                                                                cancellationException = e;
                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                                nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                }
                                                                cause = cancellationException.getCause();
                                                                if (cause != null) {
                                                                }
                                                            }
                                                        }
                                                    } catch (java.util.concurrent.CancellationException e12) {
                                                        e = e12;
                                                        obj = coroutine_suspended;
                                                    }
                                                }
                                            } catch (java.util.concurrent.CancellationException e13) {
                                                e = e13;
                                                obj = coroutine_suspended;
                                            }
                                        } catch (java.util.concurrent.CancellationException e14) {
                                            obj = coroutine_suspended;
                                            cancellationException = e14;
                                            objectRef = objectRef2;
                                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                            nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                            androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                            androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                                            if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                            }
                                            cause = cancellationException.getCause();
                                            if (cause != null) {
                                            }
                                        }
                                    } catch (java.util.concurrent.CancellationException e15) {
                                        e = e15;
                                        obj = coroutine_suspended;
                                        cancellationException = e;
                                        objectRef = objectRef5;
                                        byteString3 = byteString2;
                                        adResponse3 = adResponse2;
                                        androidHandleGatewayAdResponse = this;
                                        nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                        androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                        androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                        if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                        }
                                        cause = cancellationException.getCause();
                                        if (cause != null) {
                                        }
                                    }
                                } catch (java.util.concurrent.CancellationException e16) {
                                    e = e16;
                                    adResponse2 = adResponse;
                                    obj = coroutine_suspended;
                                    cancellationException = e;
                                    objectRef = objectRef5;
                                    byteString3 = byteString2;
                                    adResponse3 = adResponse2;
                                    androidHandleGatewayAdResponse = this;
                                    nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                    androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                    androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                    androidHandleGatewayAdResponse$invoke$1.label = 6;
                                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                    }
                                    cause = cancellationException.getCause();
                                    if (cause != null) {
                                    }
                                }
                            } catch (java.util.concurrent.CancellationException e17) {
                                byteString3 = byteString;
                                adResponse3 = adResponse;
                                cancellationException = e17;
                                obj = coroutine_suspended;
                                objectRef = objectRef5;
                                androidHandleGatewayAdResponse = this;
                                nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                                androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                androidHandleGatewayAdResponse$invoke$1.label = 6;
                                if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                    return obj;
                                }
                                cause = cancellationException.getCause();
                                if (cause != null) {
                                }
                            }
                        } catch (java.util.concurrent.CancellationException e18) {
                            e = e18;
                            byteString2 = byteString;
                        }
                        break;
                    case 1:
                        boolean z3 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$6;
                        diagnosticAdType2 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$5;
                        str2 = (java.lang.String) androidHandleGatewayAdResponse$invoke$1.L$4;
                        adResponse3 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$3;
                        byteString3 = (com.google.protobuf.ByteString) androidHandleGatewayAdResponse$invoke$1.L$2;
                        unityAdsLoadOptions2 = (com.unity3d.ads.UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$1;
                        androidHandleGatewayAdResponse2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            z2 = z3;
                            webViewConfiguration = (com.unity3d.ads.core.data.model.WebViewConfiguration) obj3;
                            com.google.protobuf.ByteString trackingToken2 = adResponse3.getTrackingToken();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken2, "trackingToken");
                            com.unity3d.ads.core.data.model.AdObject adObject32 = new com.unity3d.ads.core.data.model.AdObject(byteString3, str2, trackingToken2, false, null, null, null, false, null, null, null, unityAdsLoadOptions2, z2, diagnosticAdType2, null, null, 51192, null);
                            cacheWebViewAssets = androidHandleGatewayAdResponse2.cacheWebViewAssets;
                            androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse2;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions2;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = byteString3;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse3;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = str2;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = diagnosticAdType2;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = objectRef2;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = webViewConfiguration;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = adObject32;
                            androidHandleGatewayAdResponse$invoke$1.label = 2;
                            if (cacheWebViewAssets.invoke(webViewConfiguration, androidHandleGatewayAdResponse$invoke$1) != coroutine_suspended) {
                            }
                        } catch (java.util.concurrent.CancellationException e19) {
                            cancellationException = e19;
                            objectRef = objectRef2;
                            obj = coroutine_suspended;
                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                            nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                            if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                            }
                            cause = cancellationException.getCause();
                            if (cause != null) {
                            }
                        }
                        break;
                    case 2:
                        com.unity3d.ads.core.data.model.AdObject adObject5 = (com.unity3d.ads.core.data.model.AdObject) androidHandleGatewayAdResponse$invoke$1.L$8;
                        webViewConfiguration2 = (com.unity3d.ads.core.data.model.WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$7;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$6;
                        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$5;
                        java.lang.String str12 = (java.lang.String) androidHandleGatewayAdResponse$invoke$1.L$4;
                        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse6 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$3;
                        com.google.protobuf.ByteString byteString5 = (com.google.protobuf.ByteString) androidHandleGatewayAdResponse$invoke$1.L$2;
                        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions6 = (com.unity3d.ads.UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$1;
                        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse8 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            diagnosticAdType3 = diagnosticAdType5;
                            str3 = str12;
                            adResponse3 = adResponse6;
                            byteString3 = byteString5;
                            adObject = adObject5;
                            unityAdsLoadOptions3 = unityAdsLoadOptions6;
                            androidHandleGatewayAdResponse2 = androidHandleGatewayAdResponse8;
                            if (webViewConfiguration2.getEntryPoint().length() != 0) {
                            }
                        } catch (java.util.concurrent.CancellationException e20) {
                            cancellationException = e20;
                            adResponse3 = adResponse6;
                            obj = coroutine_suspended;
                            byteString3 = byteString5;
                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse8;
                            nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                            if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                            }
                            cause = cancellationException.getCause();
                            if (cause != null) {
                            }
                        }
                        break;
                    case 3:
                        m12261markNowz9LOYto = androidHandleGatewayAdResponse$invoke$1.J$0;
                        base64ImpressionConfiguration = (java.lang.String) androidHandleGatewayAdResponse$invoke$1.L$9;
                        str6 = (java.lang.String) androidHandleGatewayAdResponse$invoke$1.L$8;
                        adObject = (com.unity3d.ads.core.data.model.AdObject) androidHandleGatewayAdResponse$invoke$1.L$7;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$6;
                        diagnosticAdType4 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$5;
                        str3 = (java.lang.String) androidHandleGatewayAdResponse$invoke$1.L$4;
                        adResponse4 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$3;
                        byteString4 = (com.google.protobuf.ByteString) androidHandleGatewayAdResponse$invoke$1.L$2;
                        unityAdsLoadOptions3 = (com.unity3d.ads.UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$1;
                        androidHandleGatewayAdResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl((com.unity3d.ads.adplayer.AndroidWebViewContainer) obj3);
                            str7 = str6;
                            objectRef = objectRef3;
                            diagnosticAdType3 = diagnosticAdType4;
                            byteString3 = byteString4;
                            adResponse3 = adResponse4;
                        } catch (java.lang.Throwable th4) {
                            diagnosticAdType3 = diagnosticAdType4;
                            byteString3 = byteString4;
                            androidHandleGatewayAdResponse2 = androidHandleGatewayAdResponse;
                            th = th4;
                            str5 = str6;
                            objectRef = objectRef3;
                            adResponse3 = adResponse4;
                            kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                            str7 = str5;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                            com.unity3d.ads.core.data.model.AdObject adObject422 = adObject;
                            java.lang.String str1122 = str3;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            kotlin.time.TimedValue timedValue22 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(m12261markNowz9LOYto), null);
                            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, !kotlin.Result.m10805isSuccessimpl(((kotlin.Result) timedValue22.component1()).getValue()) ? "native_webview_success_time" : "native_webview_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(timedValue22.getDuration(), kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject422, null, 44, null);
                            java.lang.Object value22 = ((kotlin.Result) timedValue22.getValue()).getValue();
                            kotlin.ResultKt.throwOnFailure(value22);
                            com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer22 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) value22;
                            com.unity3d.ads.adplayer.WebViewBridge invoke222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer22, androidHandleGatewayAdResponse.adPlayerScope);
                            objectRef.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke222, androidWebViewContainer22, byteString3, diagnosticAdType3);
                            copy = adObject422.copy((r34 & 1) != 0 ? adObject422.opportunityId : null, (r34 & 2) != 0 ? adObject422.placementId : null, (r34 & 4) != 0 ? adObject422.trackingToken : null, (r34 & 8) != 0 ? adObject422.isScarAd : false, (r34 & 16) != 0 ? adObject422.scarQueryId : null, (r34 & 32) != 0 ? adObject422.scarAdUnitId : null, (r34 & 64) != 0 ? adObject422.scarAdString : null, (r34 & 128) != 0 ? adObject422.isOfferwallAd : false, (r34 & 256) != 0 ? adObject422.offerwallPlacementName : null, (r34 & 512) != 0 ? adObject422.adPlayer : (com.unity3d.ads.adplayer.AdPlayer) objectRef.element, (r34 & 1024) != 0 ? adObject422.playerServerId : null, (r34 & 2048) != 0 ? adObject422.loadOptions : null, (r34 & 4096) != 0 ? adObject422.isHeaderBidding : false, (r34 & 8192) != 0 ? adObject422.adType : null, (r34 & 16384) != 0 ? adObject422.ttl : null, (r34 & 32768) != 0 ? adObject422.state : null);
                            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                            long m12261markNowz9LOYto222 = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, copy, null, 46, null);
                            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer handleInvocationsFromAdViewer22 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                            kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation22 = invoke222.getOnInvocation();
                            obj2 = coroutine_suspended;
                            com.google.protobuf.ByteString adData22 = adResponse3.getAdData();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData22, "response.adData");
                            java.lang.String base64$default32 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData22, false, 1, null);
                            com.google.protobuf.ByteString adDataRefreshToken22 = adResponse3.getAdDataRefreshToken();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken22, "response.adDataRefreshToken");
                            adResponse5 = adResponse3;
                            java.lang.String base64$default222 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken22, false, 1, null);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                            kotlinx.coroutines.flow.FlowKt.launchIn(handleInvocationsFromAdViewer22.invoke(onInvocation22, base64$default32, base64$default222, base64ImpressionConfiguration, copy, new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3(androidHandleGatewayAdResponse, androidWebViewContainer22, str7, adObject422, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                            kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent22 = ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getOnLoadEvent();
                            androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions4;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = byteString3;
                            adResponse3 = adResponse5;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse3;
                            str8 = str1122;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = str8;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = copy;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            j = m12261markNowz9LOYto222;
                            androidHandleGatewayAdResponse$invoke$1.J$0 = j;
                            androidHandleGatewayAdResponse$invoke$1.label = 4;
                            obj3 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent22, androidHandleGatewayAdResponse$invoke$1);
                            obj = obj2;
                            if (obj3 == obj) {
                            }
                            com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions522 = unityAdsLoadOptions4;
                            androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                            loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) obj3;
                            if (loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) {
                            }
                        }
                        com.unity3d.ads.core.data.model.AdObject adObject4222 = adObject;
                        java.lang.String str11222 = str3;
                        unityAdsLoadOptions4 = unityAdsLoadOptions3;
                        kotlin.time.TimedValue timedValue222 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(m12261markNowz9LOYto), null);
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, !kotlin.Result.m10805isSuccessimpl(((kotlin.Result) timedValue222.component1()).getValue()) ? "native_webview_success_time" : "native_webview_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(timedValue222.getDuration(), kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject4222, null, 44, null);
                        java.lang.Object value222 = ((kotlin.Result) timedValue222.getValue()).getValue();
                        kotlin.ResultKt.throwOnFailure(value222);
                        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer222 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) value222;
                        com.unity3d.ads.adplayer.WebViewBridge invoke2222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer222, androidHandleGatewayAdResponse.adPlayerScope);
                        objectRef.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke2222, androidWebViewContainer222, byteString3, diagnosticAdType3);
                        copy = adObject4222.copy((r34 & 1) != 0 ? adObject4222.opportunityId : null, (r34 & 2) != 0 ? adObject4222.placementId : null, (r34 & 4) != 0 ? adObject4222.trackingToken : null, (r34 & 8) != 0 ? adObject4222.isScarAd : false, (r34 & 16) != 0 ? adObject4222.scarQueryId : null, (r34 & 32) != 0 ? adObject4222.scarAdUnitId : null, (r34 & 64) != 0 ? adObject4222.scarAdString : null, (r34 & 128) != 0 ? adObject4222.isOfferwallAd : false, (r34 & 256) != 0 ? adObject4222.offerwallPlacementName : null, (r34 & 512) != 0 ? adObject4222.adPlayer : (com.unity3d.ads.adplayer.AdPlayer) objectRef.element, (r34 & 1024) != 0 ? adObject4222.playerServerId : null, (r34 & 2048) != 0 ? adObject4222.loadOptions : null, (r34 & 4096) != 0 ? adObject4222.isHeaderBidding : false, (r34 & 8192) != 0 ? adObject4222.adType : null, (r34 & 16384) != 0 ? adObject4222.ttl : null, (r34 & 32768) != 0 ? adObject4222.state : null);
                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                        long m12261markNowz9LOYto2222 = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, copy, null, 46, null);
                        com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer handleInvocationsFromAdViewer222 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                        kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation222 = invoke2222.getOnInvocation();
                        obj2 = coroutine_suspended;
                        com.google.protobuf.ByteString adData222 = adResponse3.getAdData();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData222, "response.adData");
                        java.lang.String base64$default322 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData222, false, 1, null);
                        com.google.protobuf.ByteString adDataRefreshToken222 = adResponse3.getAdDataRefreshToken();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken222, "response.adDataRefreshToken");
                        adResponse5 = adResponse3;
                        java.lang.String base64$default2222 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken222, false, 1, null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                        kotlinx.coroutines.flow.FlowKt.launchIn(handleInvocationsFromAdViewer222.invoke(onInvocation222, base64$default322, base64$default2222, base64ImpressionConfiguration, copy, new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3(androidHandleGatewayAdResponse, androidWebViewContainer222, str7, adObject4222, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getScope());
                        kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent222 = ((com.unity3d.ads.adplayer.AdPlayer) objectRef.element).getOnLoadEvent();
                        androidHandleGatewayAdResponse$invoke$1.L$0 = androidHandleGatewayAdResponse;
                        androidHandleGatewayAdResponse$invoke$1.L$1 = unityAdsLoadOptions4;
                        androidHandleGatewayAdResponse$invoke$1.L$2 = byteString3;
                        adResponse3 = adResponse5;
                        androidHandleGatewayAdResponse$invoke$1.L$3 = adResponse3;
                        str8 = str11222;
                        androidHandleGatewayAdResponse$invoke$1.L$4 = str8;
                        androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef;
                        androidHandleGatewayAdResponse$invoke$1.L$6 = copy;
                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                        j = m12261markNowz9LOYto2222;
                        androidHandleGatewayAdResponse$invoke$1.J$0 = j;
                        androidHandleGatewayAdResponse$invoke$1.label = 4;
                        obj3 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent222, androidHandleGatewayAdResponse$invoke$1);
                        obj = obj2;
                        if (obj3 == obj) {
                        }
                        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions5222 = unityAdsLoadOptions4;
                        androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                        loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) obj3;
                        if (loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) {
                        }
                        break;
                    case 4:
                        j = androidHandleGatewayAdResponse$invoke$1.J$0;
                        com.unity3d.ads.core.data.model.AdObject adObject6 = (com.unity3d.ads.core.data.model.AdObject) androidHandleGatewayAdResponse$invoke$1.L$6;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        java.lang.String str13 = (java.lang.String) androidHandleGatewayAdResponse$invoke$1.L$4;
                        adResponse3 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$3;
                        byteString3 = (com.google.protobuf.ByteString) androidHandleGatewayAdResponse$invoke$1.L$2;
                        unityAdsLoadOptions4 = (com.unity3d.ads.UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$1;
                        androidHandleGatewayAdResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            copy = adObject6;
                            str8 = str13;
                            obj = coroutine_suspended;
                            com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions52222 = unityAdsLoadOptions4;
                            androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse;
                            loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) obj3;
                            if (loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) {
                            }
                        } catch (java.util.concurrent.CancellationException e21) {
                            cancellationException = e21;
                            obj = coroutine_suspended;
                            nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                            if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                            }
                            cause = cancellationException.getCause();
                            if (cause != null) {
                            }
                        }
                        break;
                    case 5:
                        loadEvent2 = (com.unity3d.ads.adplayer.model.LoadEvent) androidHandleGatewayAdResponse$invoke$1.L$5;
                        adObject2 = (com.unity3d.ads.core.data.model.AdObject) androidHandleGatewayAdResponse$invoke$1.L$4;
                        objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$3;
                        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse7 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        com.google.protobuf.ByteString byteString6 = (com.google.protobuf.ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse9 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            byteString3 = byteString6;
                            androidHandleGatewayAdResponse6 = androidHandleGatewayAdResponse9;
                            obj = coroutine_suspended;
                            adResponse3 = adResponse7;
                            return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), adObject2.isScarAd(), 4, null);
                        } catch (java.util.concurrent.CancellationException e22) {
                            cancellationException = e22;
                            byteString3 = byteString6;
                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse9;
                            obj = coroutine_suspended;
                            adResponse3 = adResponse7;
                            objectRef = objectRef4;
                            nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException, byteString3, adResponse3, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                            if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) == obj) {
                            }
                            cause = cancellationException.getCause();
                            if (cause != null) {
                            }
                        }
                        break;
                    case 6:
                        cancellationException = (java.util.concurrent.CancellationException) androidHandleGatewayAdResponse$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        cause = cancellationException.getCause();
                        if (cause != null) {
                            throw cancellationException;
                        }
                        throw cause;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidHandleGatewayAdResponse$invoke$1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1(this, continuation);
        java.lang.Object obj32 = androidHandleGatewayAdResponse$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (androidHandleGatewayAdResponse$invoke$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cleanup(java.lang.Throwable th, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse, com.unity3d.ads.adplayer.AdPlayer adPlayer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$1;
        int i;
        java.lang.String message;
        com.unity3d.ads.adplayer.AdPlayer adPlayer2;
        java.lang.Object invoke;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1) {
            androidHandleGatewayAdResponse$cleanup$1 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1) continuation;
            if ((androidHandleGatewayAdResponse$cleanup$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$cleanup$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidHandleGatewayAdResponse$cleanup$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayAdResponse$cleanup$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                    gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
                    _create.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
                    java.lang.Throwable cause = th.getCause();
                    if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
                        message = "";
                    }
                    _create.setMessage(message);
                    gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
                    com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
                    gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
                    com.google.protobuf.ByteString trackingToken = adResponse.getTrackingToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "response.trackingToken");
                    com.google.protobuf.ByteString byteString2 = _build.toByteString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString2, "operativeEventErrorData.toByteString()");
                    adPlayer2 = adPlayer;
                    androidHandleGatewayAdResponse$cleanup$1.L$0 = adPlayer2;
                    androidHandleGatewayAdResponse$cleanup$1.label = 1;
                    invoke = getOperativeEventApi.invoke(operativeEventType, byteString, trackingToken, byteString2, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, androidHandleGatewayAdResponse$cleanup$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.unity3d.ads.adplayer.AdPlayer adPlayer3 = (com.unity3d.ads.adplayer.AdPlayer) androidHandleGatewayAdResponse$cleanup$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    adPlayer2 = adPlayer3;
                }
                if (adPlayer2 != null) {
                    return kotlin.Unit.INSTANCE;
                }
                androidHandleGatewayAdResponse$cleanup$1.L$0 = null;
                androidHandleGatewayAdResponse$cleanup$1.label = 2;
                if (adPlayer2.destroy(androidHandleGatewayAdResponse$cleanup$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidHandleGatewayAdResponse$cleanup$1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1(this, continuation);
        java.lang.Object obj2 = androidHandleGatewayAdResponse$cleanup$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayAdResponse$cleanup$1.label;
        if (i != 0) {
        }
        if (adPlayer2 != null) {
        }
    }
}
