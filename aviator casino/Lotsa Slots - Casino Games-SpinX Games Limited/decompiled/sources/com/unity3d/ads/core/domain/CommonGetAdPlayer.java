package com.unity3d.ads.core.domain;

/* compiled from: CommonGetAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0096\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetAdPlayer;", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "orientationRepository", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "context", "Landroid/content/Context;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "invoke", "Lcom/unity3d/ads/adplayer/AdPlayer;", "webviewBridge", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webviewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "opportunityId", "Lcom/google/protobuf/ByteString;", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonGetAdPlayer implements com.unity3d.ads.core.domain.GetAdPlayer {
    private final kotlinx.coroutines.CoroutineScope adPlayerScope;
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final android.content.Context context;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource;
    private final com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager;
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final com.unity3d.ads.core.data.repository.OrientationRepository orientationRepository;
    private final com.unity3d.ads.core.data.manager.ScarManager scarManager;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public CommonGetAdPlayer(com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, kotlinx.coroutines.CoroutineScope adPlayerScope, com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository, com.unity3d.ads.core.data.manager.ScarManager scarManager, com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager, com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource, com.unity3d.ads.core.data.repository.OrientationRepository orientationRepository, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationRepository, "orientationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = defaultDispatcher;
        this.adPlayerScope = adPlayerScope;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public com.unity3d.ads.adplayer.AdPlayer invoke(com.unity3d.ads.adplayer.WebViewBridge webviewBridge, com.unity3d.ads.adplayer.AndroidWebViewContainer webviewContainer, com.google.protobuf.ByteString opportunityId, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewBridge, "webviewBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewContainer, "webviewContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer = new com.unity3d.ads.adplayer.WebViewAdPlayer(webviewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, webviewContainer, kotlinx.coroutines.CoroutineScopeKt.plus(this.adPlayerScope, new com.unity3d.ads.core.data.model.CoroutineOpportunity(opportunityId)));
        if (adType == gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN) {
            java.lang.String uuid = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(opportunityId).toString();
            com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.sessionRepository;
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            com.unity3d.ads.core.data.manager.ScarManager scarManager = this.scarManager;
            com.unity3d.ads.core.data.manager.OfferwallManager offerwallManager = this.offerwallManager;
            com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            com.unity3d.ads.core.data.repository.AdRepository adRepository = this.adRepository;
            com.unity3d.ads.core.data.repository.OrientationRepository orientationRepository = this.orientationRepository;
            android.content.Context context = this.context;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString()");
            return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, uuid, webviewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository, scarManager, offerwallManager, sendDiagnosticEvent, adRepository, orientationRepository, context);
        }
        java.lang.String uuid2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(opportunityId).toString();
        com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        com.unity3d.ads.core.data.manager.ScarManager scarManager2 = this.scarManager;
        com.unity3d.ads.core.data.datasource.LifecycleDataSource lifecycleDataSource = this.lifecycleDataSource;
        android.content.Context context2 = this.context;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid2, "toString()");
        return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, uuid2, webviewContainer, openMeasurementRepository2, scarManager2, lifecycleDataSource, context2);
    }
}
