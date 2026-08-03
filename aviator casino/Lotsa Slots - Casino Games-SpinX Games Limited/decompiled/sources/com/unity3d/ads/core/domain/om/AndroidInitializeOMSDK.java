package com.unity3d.ads.core.domain.om;

/* compiled from: AndroidInitializeOMSDK.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidInitializeOMSDK;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "context", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "omRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidInitializeOMSDK implements com.unity3d.ads.core.domain.om.InitializeOMSDK {
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.repository.OpenMeasurementRepository omRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidInitializeOMSDK(android.content.Context context, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.OpenMeasurementRepository omRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 androidInitializeOMSDK$invoke$1;
        int i;
        com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK androidInitializeOMSDK;
        long j;
        com.unity3d.ads.core.data.model.OMResult oMResult;
        if (continuation instanceof com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1) {
            androidInitializeOMSDK$invoke$1 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1) continuation;
            if ((androidInitializeOMSDK$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidInitializeOMSDK$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidInitializeOMSDK$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidInitializeOMSDK$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.sessionRepository.isOmEnabled()) {
                        long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", null, null, null, null, null, 62, null);
                        com.unity3d.ads.core.data.repository.OpenMeasurementRepository openMeasurementRepository = this.omRepository;
                        android.content.Context context = this.context;
                        androidInitializeOMSDK$invoke$1.L$0 = this;
                        androidInitializeOMSDK$invoke$1.J$0 = m12261markNowz9LOYto;
                        androidInitializeOMSDK$invoke$1.label = 1;
                        obj = openMeasurementRepository.activateOM(context, androidInitializeOMSDK$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidInitializeOMSDK = this;
                        j = m12261markNowz9LOYto;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = androidInitializeOMSDK$invoke$1.J$0;
                androidInitializeOMSDK = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK) androidInitializeOMSDK$invoke$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                oMResult = (com.unity3d.ads.core.data.model.OMResult) obj;
                if (!(oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success)) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidInitializeOMSDK.sendDiagnosticEvent, "om_activate_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j))), null, null, null, null, 60, null);
                } else if (oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Failure) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidInitializeOMSDK.sendDiagnosticEvent;
                    java.lang.Double boxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    com.unity3d.ads.core.data.model.OMResult.Failure failure = (com.unity3d.ads.core.data.model.OMResult.Failure) oMResult;
                    createMapBuilder.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        createMapBuilder.put("reason_debug", failure.getReasonDebug());
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_activate_failure_time", boxDouble, kotlin.collections.MapsKt.build(createMapBuilder), null, null, null, 56, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidInitializeOMSDK$invoke$1 = new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1(this, continuation);
        java.lang.Object obj2 = androidInitializeOMSDK$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidInitializeOMSDK$invoke$1.label;
        if (i != 0) {
        }
        oMResult = (com.unity3d.ads.core.data.model.OMResult) obj2;
        if (!(oMResult instanceof com.unity3d.ads.core.data.model.OMResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
