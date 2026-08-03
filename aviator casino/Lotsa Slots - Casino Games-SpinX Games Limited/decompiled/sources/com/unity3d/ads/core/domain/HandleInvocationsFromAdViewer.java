package com.unity3d.ads.core.domain;

/* compiled from: HandleInvocationsFromAdViewer.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002Jc\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/Invocation;", "onInvocations", "Lkotlinx/coroutines/flow/SharedFlow;", "adData", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "onSubscription", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/SharedFlow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandleInvocationsFromAdViewer implements com.unity3d.services.core.di.IServiceComponent {
    public static final java.lang.String KEY_ACTION = "action";
    public static final java.lang.String KEY_AD_DATA = "adData";
    public static final java.lang.String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final java.lang.String KEY_AD_STRING = "adString";
    public static final java.lang.String KEY_AD_TYPE = "type";
    public static final java.lang.String KEY_AD_UNIT_ID = "adUnitId";
    public static final java.lang.String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final java.lang.String KEY_DOWNLOAD_URL = "url";
    public static final java.lang.String KEY_EXTRAS = "extras";
    public static final java.lang.String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final java.lang.String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final java.lang.String KEY_LOAD_OPTIONS = "loadOptions";
    public static final java.lang.String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final java.lang.String KEY_OMID = "openMeasurement";
    public static final java.lang.String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final java.lang.String KEY_OMJS_SESSION = "sessionFilePath";
    public static final java.lang.String KEY_OM_PARTNER = "partnerName";
    public static final java.lang.String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final java.lang.String KEY_OM_VERSION = "version";
    public static final java.lang.String KEY_PACKAGE_NAME = "packageName";
    public static final java.lang.String KEY_PLACEMENT_ID = "placementId";
    public static final java.lang.String KEY_PLACEMENT_NAME = "placementName";
    public static final java.lang.String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final java.lang.String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final java.lang.String KEY_QUERY_ID = "queryId";
    public static final java.lang.String KEY_TRACKING_TOKEN = "trackingToken";
    public static final java.lang.String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final java.lang.String KEY_VIDEO_LENGTH = "videoLength";

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.Invocation> invoke(kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocations, java.lang.String adData, java.lang.String adDataRefreshToken, java.lang.String impressionConfig, final com.unity3d.ads.core.data.model.AdObject adObject, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onSubscription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvocations, "onInvocations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSubscription, "onSubscription");
        final java.lang.String m10321constructorimpl = com.unity3d.ads.core.data.model.AdData.m10321constructorimpl(adData);
        final java.lang.String m10335constructorimpl = com.unity3d.ads.core.data.model.ImpressionConfig.m10335constructorimpl(impressionConfig);
        final java.lang.String m10328constructorimpl = com.unity3d.ads.core.data.model.AdDataRefreshToken.m10328constructorimpl(adDataRefreshToken);
        return kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.onSubscription(onInvocations, new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1(onSubscription, null)), new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_AD_CONTEXT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.m10344getAdContextyLuu4LI((com.unity3d.ads.core.domain.AndroidGetAdPlayerContext) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.class)), m10321constructorimpl, m10335constructorimpl, m10328constructorimpl, (com.unity3d.ads.core.domain.om.IsOMActivated) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.IsOMActivated.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_CONNECTION_TYPE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_DEVICE_VOLUME, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_SCREEN_HEIGHT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_SCREEN_WIDTH, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OPEN_URL, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl(com.unity3d.ads.core.data.model.AdObject.this, (com.unity3d.ads.core.domain.HandleOpenUrl) this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleOpenUrl.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_ORIENTATION, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOrientation(com.unity3d.ads.core.data.model.AdObject.this);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendOperativeEvent((com.unity3d.ads.core.domain.events.GetOperativeEventApi) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetOperativeEventApi.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_WRITE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_READ, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_DELETE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_CLEAR, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_GET_KEYS, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_GET, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.STORAGE_SET, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_PRIVACY_FSM, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacyFsm((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_PRIVACY_FSM, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$18
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacyFsm((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_PRIVACY, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$19
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacy((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_PRIVACY, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$20
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacy((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_ALLOWED_PII, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$21
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_ALLOWED_PII, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$22
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.GET_SESSION_TOKEN, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$23
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown((com.unity3d.ads.core.data.repository.CampaignRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.REFRESH_AD_DATA, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$25
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.refreshAdData((com.unity3d.ads.core.domain.Refresh) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.Refresh.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateCampaignState((com.unity3d.ads.core.data.repository.CampaignRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$27
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken(com.unity3d.ads.core.data.model.AdObject.this);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$28
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((com.unity3d.ads.core.domain.SendPrivacyUpdateRequest) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$30
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.DOWNLOAD, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.download((com.unity3d.ads.core.domain.CacheFile) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CacheFile.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.IS_FILE_CACHED, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$32
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached((com.unity3d.ads.core.domain.GetIsFileCache) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetIsFileCache.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_START_SESSION, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omStartSession((com.unity3d.ads.core.domain.om.AndroidOmInteraction) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.AndroidOmInteraction.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_FINISH_SESSION, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$34
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omFinishSession((com.unity3d.ads.core.domain.om.OmFinishSession) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmFinishSession.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_IMPRESSION, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$35
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omImpression((com.unity3d.ads.core.domain.om.OmImpressionOccurred) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmImpressionOccurred.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.OM_GET_DATA, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$36
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omGetData((com.unity3d.ads.core.domain.om.GetOmData) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.GetOmData.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$37
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable((com.unity3d.ads.core.domain.attribution.AndroidAttribution) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.attribution.AndroidAttribution.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$38
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView((com.unity3d.ads.core.domain.attribution.AndroidAttribution) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.attribution.AndroidAttribution.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$39
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick((com.unity3d.ads.core.domain.attribution.AndroidAttribution) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.attribution.AndroidAttribution.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.LOAD_SCAR_AD, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$40
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadScarAd((com.unity3d.ads.core.domain.scar.LoadScarAd) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.LoadScarAd.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_SCAR_AD, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$42
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$43
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$44
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.LOAD_OFFERWALL_AD, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$45
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadOfferwallAd((com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd.class)), adObject);
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SHOW_OFFERWALL_AD, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd();
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$47
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.REQUEST_GET, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$48
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.request(com.unity3d.services.core.network.model.RequestType.GET, (com.unity3d.ads.core.domain.ExecuteAdViewerRequest) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ExecuteAdViewerRequest.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.REQUEST_POST, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$49
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.request(com.unity3d.services.core.network.model.RequestType.POST, (com.unity3d.ads.core.domain.ExecuteAdViewerRequest) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ExecuteAdViewerRequest.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.REQUEST_HEAD, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$50
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.request(com.unity3d.services.core.network.model.RequestType.HEAD, (com.unity3d.ads.core.domain.ExecuteAdViewerRequest) com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ExecuteAdViewerRequest.class)));
            }
        }), kotlin.TuplesKt.to(com.unity3d.ads.adplayer.ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$51
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.ads.adplayer.ExposedFunction invoke() {
                return com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOpportunityTTL(com.unity3d.ads.core.data.model.AdObject.this);
            }
        })), null));
    }
}
