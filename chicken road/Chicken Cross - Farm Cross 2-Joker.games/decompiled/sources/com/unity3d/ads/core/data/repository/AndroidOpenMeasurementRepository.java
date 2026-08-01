package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AndroidOpenMeasurementRepository.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J(\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u00100\u001a\u0002012\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u00020\u000fH\u0002J\u0010\u00103\u001a\u0002012\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u00104\u001a\u0002012\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u00105\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020$H\u0002J\b\u00106\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00067"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidOpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/manager/OmidManager;)V", "partner", "Lcom/iab/omid/library/unity3d/adsession/Partner;", "kotlin.jvm.PlatformType", "activeSessions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/iab/omid/library/unity3d/adsession/AdSession;", "finishedSessions", "", "_isOMActive", "", "omData", "Lcom/unity3d/ads/core/data/model/OMData;", "getOmData", "()Lcom/unity3d/ads/core/data/model/OMData;", "value", "isOMActive", "()Z", "setOMActive", "(Z)V", "activateOM", "Lcom/unity3d/ads/core/data/model/OMResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSession", "opportunityId", "Lcom/google/protobuf/ByteString;", "webView", "Landroid/webkit/WebView;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/unity3d/ads/core/data/model/OmidOptions;", "(Lcom/google/protobuf/ByteString;Landroid/webkit/WebView;Lcom/unity3d/ads/core/data/model/OmidOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishSession", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "impressionOccurred", "signalLoaded", "(Lcom/google/protobuf/ByteString;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasSessionFinished", "addSession", "", "adSession", "sessionFinished", "removeSession", "getSession", "buildOmData", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final MutableStateFlow<Boolean> _isOMActive;
    private final MutableStateFlow<Map<String, AdSession>> activeSessions;
    private final MutableStateFlow<Set<String>> finishedSessions;
    private final CoroutineDispatcher mainDispatcher;
    private final OmidManager omidManager;
    private final Partner partner;

    public AndroidOpenMeasurementRepository(CoroutineDispatcher mainDispatcher, OmidManager omidManager) {
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        this.partner = Partner.createPartner(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.19.0");
        this.activeSessions = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.finishedSessions = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._isOMActive = StateFlowKt.MutableStateFlow(false);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this._isOMActive;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, Continuation<? super OMResult> continuation) {
        return BuildersKt.withContext(this.mainDispatcher, new AndroidOpenMeasurementRepository$activateOM$2(this, context, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, Continuation<? super OMResult> continuation) {
        return BuildersKt.withContext(this.mainDispatcher, new AndroidOpenMeasurementRepository$startSession$2(this, byteString, omidOptions, webView, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, Continuation<? super OMResult> continuation) {
        return BuildersKt.withContext(this.mainDispatcher, new AndroidOpenMeasurementRepository$finishSession$2(this, byteString, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z, Continuation<? super OMResult> continuation) {
        return BuildersKt.withContext(this.mainDispatcher, new AndroidOpenMeasurementRepository$impressionOccurred$2(this, byteString, z, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString opportunityId) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.finishedSessions.getValue().contains(opportunityId.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString opportunityId, AdSession adSession) {
        Map<String, AdSession> value;
        MutableStateFlow<Map<String, AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MapsKt.plus(value, TuplesKt.to(opportunityId.toStringUtf8(), adSession))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString opportunityId) {
        Set<String> value;
        MutableStateFlow<Set<String>> mutableStateFlow = this.finishedSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SetsKt.plus(value, opportunityId.toStringUtf8())));
        removeSession(opportunityId);
    }

    private final void removeSession(ByteString opportunityId) {
        Map<String, AdSession> value;
        MutableStateFlow<Map<String, AdSession>> mutableStateFlow = this.activeSessions;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MapsKt.minus(value, opportunityId.toStringUtf8())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSession getSession(ByteString opportunityId) {
        return this.activeSessions.getValue().get(opportunityId.toStringUtf8());
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }
}
