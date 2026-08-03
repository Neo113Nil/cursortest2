package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidOpenMeasurementRepository.kt */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\u0019\u0010'\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010*\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0016J!\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0006\u0010,\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J+\u00100\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidOpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/manager/OmidManager;)V", "_isOMActive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "activeSessions", "", "", "Lcom/iab/omid/library/unity3d/adsession/AdSession;", "finishedSessions", "", "value", "isOMActive", "()Z", "setOMActive", "(Z)V", "omData", "Lcom/unity3d/ads/core/data/model/OMData;", "getOmData", "()Lcom/unity3d/ads/core/data/model/OMData;", "partner", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "kotlin.jvm.PlatformType", "activateOM", "Lcom/unity3d/ads/core/data/model/OMResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSession", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "adSession", "buildOmData", "finishSession", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSession", "hasSessionFinished", "impressionOccurred", "signalLoaded", "(Lcom/google/protobuf/ByteString;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeSession", "sessionFinished", "startSession", "webView", "Landroid/webkit/WebView;", "options", "Lcom/unity3d/ads/core/data/model/OmidOptions;", "(Lcom/google/protobuf/ByteString;Landroid/webkit/WebView;Lcom/unity3d/ads/core/data/model/OmidOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidOpenMeasurementRepository implements com.unity3d.ads.core.data.repository.OpenMeasurementRepository {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isOMActive;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession>> activeSessions;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.String>> finishedSessions;
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher;
    private final com.unity3d.ads.core.data.manager.OmidManager omidManager;
    private final com.iab.omid.library.unity3d.adsession.Partner partner;

    public AndroidOpenMeasurementRepository(kotlinx.coroutines.CoroutineDispatcher mainDispatcher, com.unity3d.ads.core.data.manager.OmidManager omidManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        this.partner = com.iab.omid.library.unity3d.adsession.Partner.createPartner(com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.16.5");
        this.activeSessions = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.MapsKt.emptyMap());
        this.finishedSessions = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.SetsKt.emptySet());
        this._isOMActive = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public com.unity3d.ads.core.data.model.OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        java.lang.Boolean value;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this._isOMActive;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object activateOM(android.content.Context context, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2(this, context, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object startSession(com.google.protobuf.ByteString byteString, android.webkit.WebView webView, com.unity3d.ads.core.data.model.OmidOptions omidOptions, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2(this, byteString, omidOptions, webView, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object finishSession(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2(this, byteString, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public java.lang.Object impressionOccurred(com.google.protobuf.ByteString byteString, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.mainDispatcher, new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2(this, byteString, z, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(com.google.protobuf.ByteString opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.finishedSessions.getValue().contains(opportunityId.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(com.google.protobuf.ByteString opportunityId, com.iab.omid.library.unity3d.adsession.AdSession adSession) {
        java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession> value;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.plus(value, kotlin.TuplesKt.to(opportunityId.toStringUtf8(), adSession))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(com.google.protobuf.ByteString opportunityId) {
        java.util.Set<java.lang.String> value;
        java.lang.String stringUtf8;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<java.lang.String>> mutableStateFlow = this.finishedSessions;
        do {
            value = mutableStateFlow.getValue();
            stringUtf8 = opportunityId.toStringUtf8();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.SetsKt.plus(value, stringUtf8)));
        removeSession(opportunityId);
    }

    private final void removeSession(com.google.protobuf.ByteString opportunityId) {
        java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession> value;
        java.lang.String stringUtf8;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, com.iab.omid.library.unity3d.adsession.AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
            stringUtf8 = opportunityId.toStringUtf8();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.MapsKt.minus(value, stringUtf8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.iab.omid.library.unity3d.adsession.AdSession getSession(com.google.protobuf.ByteString opportunityId) {
        return this.activeSessions.getValue().get(opportunityId.toStringUtf8());
    }

    private final com.unity3d.ads.core.data.model.OMData buildOmData() {
        return new com.unity3d.ads.core.data.model.OMData(this.omidManager.getVersion(), com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }
}
