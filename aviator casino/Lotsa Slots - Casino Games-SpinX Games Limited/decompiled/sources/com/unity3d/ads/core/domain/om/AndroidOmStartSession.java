package com.unity3d.ads.core.domain.om;

/* compiled from: AndroidOmStartSession.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmStartSession;", "Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "options", "Lorg/json/JSONObject;", "(Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidOmStartSession extends com.unity3d.ads.core.domain.om.AndroidOmInteraction {
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmStartSession(com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject adObject, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1 androidOmStartSession$invoke$1;
        int i;
        com.unity3d.ads.core.domain.om.AndroidOmStartSession androidOmStartSession;
        com.unity3d.ads.core.data.model.OMResult oMResult;
        if (continuation instanceof com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1) {
            androidOmStartSession$invoke$1 = (com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1) continuation;
            if ((androidOmStartSession$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidOmStartSession$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidOmStartSession$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidOmStartSession$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
                    com.google.protobuf.ByteString opportunityId = adObject.getOpportunityId();
                    android.webkit.WebView webview = getWebview(adObject);
                    com.unity3d.ads.core.data.model.OmidOptions oMidOptions = getOMidOptions(jSONObject);
                    androidOmStartSession$invoke$1.L$0 = this;
                    androidOmStartSession$invoke$1.L$1 = adObject;
                    androidOmStartSession$invoke$1.label = 1;
                    obj = openMeasurementRepository.startSession(opportunityId, webview, oMidOptions, androidOmStartSession$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidOmStartSession = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adObject = (com.unity3d.ads.core.data.model.AdObject) androidOmStartSession$invoke$1.L$1;
                    androidOmStartSession = (com.unity3d.ads.core.domain.om.AndroidOmStartSession) androidOmStartSession$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.unity3d.ads.core.data.model.AdObject adObject2 = adObject;
                oMResult = (com.unity3d.ads.core.data.model.OMResult) obj;
                if (!(oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success)) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidOmStartSession.sendDiagnosticEvent, "om_session_start_success", null, null, null, adObject2, null, 46, null);
                } else if (oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Failure) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidOmStartSession.sendDiagnosticEvent;
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    com.unity3d.ads.core.data.model.OMResult.Failure failure = (com.unity3d.ads.core.data.model.OMResult.Failure) oMResult;
                    createMapBuilder.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        createMapBuilder.put("reason_debug", failure.getReasonDebug());
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_session_start_failure", null, kotlin.collections.MapsKt.build(createMapBuilder), null, adObject2, null, 42, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidOmStartSession$invoke$1 = new com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1(this, continuation);
        java.lang.Object obj2 = androidOmStartSession$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidOmStartSession$invoke$1.label;
        if (i != 0) {
        }
        com.unity3d.ads.core.data.model.AdObject adObject22 = adObject;
        oMResult = (com.unity3d.ads.core.data.model.OMResult) obj2;
        if (!(oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
