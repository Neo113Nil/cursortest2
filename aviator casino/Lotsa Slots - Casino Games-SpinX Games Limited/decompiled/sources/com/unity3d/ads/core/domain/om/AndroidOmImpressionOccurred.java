package com.unity3d.ads.core.domain.om;

/* compiled from: AndroidOmImpressionOccurred.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmImpressionOccurred;", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "signalLoaded", "", "(Lcom/unity3d/ads/core/data/model/AdObject;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidOmImpressionOccurred implements com.unity3d.ads.core.domain.om.OmImpressionOccurred {
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmImpressionOccurred(com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject adObject, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1 androidOmImpressionOccurred$invoke$1;
        int i;
        com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred androidOmImpressionOccurred;
        com.unity3d.ads.core.data.model.OMResult oMResult;
        if (continuation instanceof com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1) {
            androidOmImpressionOccurred$invoke$1 = (com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1) continuation;
            if ((androidOmImpressionOccurred$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidOmImpressionOccurred$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidOmImpressionOccurred$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidOmImpressionOccurred$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
                    com.google.protobuf.ByteString opportunityId = adObject.getOpportunityId();
                    androidOmImpressionOccurred$invoke$1.L$0 = this;
                    androidOmImpressionOccurred$invoke$1.L$1 = adObject;
                    androidOmImpressionOccurred$invoke$1.label = 1;
                    obj = openMeasurementRepository.impressionOccurred(opportunityId, z, androidOmImpressionOccurred$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidOmImpressionOccurred = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adObject = (com.unity3d.ads.core.data.model.AdObject) androidOmImpressionOccurred$invoke$1.L$1;
                    androidOmImpressionOccurred = (com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred) androidOmImpressionOccurred$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.unity3d.ads.core.data.model.AdObject adObject2 = adObject;
                oMResult = (com.unity3d.ads.core.data.model.OMResult) obj;
                if (!(oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success)) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidOmImpressionOccurred.sendDiagnosticEvent, "om_impression_occurred_success", null, null, null, adObject2, null, 46, null);
                } else if (oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Failure) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidOmImpressionOccurred.sendDiagnosticEvent;
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    com.unity3d.ads.core.data.model.OMResult.Failure failure = (com.unity3d.ads.core.data.model.OMResult.Failure) oMResult;
                    createMapBuilder.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        createMapBuilder.put("reason_debug", failure.getReasonDebug());
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_impression_occurred_failure", null, kotlin.collections.MapsKt.build(createMapBuilder), null, adObject2, null, 42, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidOmImpressionOccurred$invoke$1 = new com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1(this, continuation);
        java.lang.Object obj2 = androidOmImpressionOccurred$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidOmImpressionOccurred$invoke$1.label;
        if (i != 0) {
        }
        com.unity3d.ads.core.data.model.AdObject adObject22 = adObject;
        oMResult = (com.unity3d.ads.core.data.model.OMResult) obj2;
        if (!(oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
