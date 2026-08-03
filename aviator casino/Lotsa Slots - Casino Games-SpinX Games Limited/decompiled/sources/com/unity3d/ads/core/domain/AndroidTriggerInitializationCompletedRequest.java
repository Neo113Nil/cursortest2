package com.unity3d.ads.core.domain;

/* compiled from: AndroidTriggerInitializationCompletedRequest.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "getInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidTriggerInitializationCompletedRequest implements com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest {
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(com.unity3d.ads.core.domain.GetInitializationCompletedRequest getInitializationCompletedRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|(4:(1:(7:10|11|12|13|14|15|(5:17|18|19|20|21)(2:28|29))(2:35|36))(3:37|38|39)|34|25|26)(4:59|60|61|(1:63)(1:64))|40|41|42|43|44|45|(1:47)(4:48|14|15|(0)(0))))|68|6|(0)(0)|40|41|42|43|44|45|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0143, code lost:
    
        r4 = r20;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        r20 = r5;
        r21 = r6;
        r8 = 1;
        r16 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca A[Catch: Exception -> 0x0135, TRY_LEAVE, TryCatch #5 {Exception -> 0x0135, blocks: (B:15:0x00c2, B:17:0x00ca), top: B:14:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        long m12261markNowz9LOYto;
        int i2;
        char c;
        long j;
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest;
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest2;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1) {
            androidTriggerInitializationCompletedRequest$invoke$1 = (com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1) continuation;
            if ((androidTriggerInitializationCompletedRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidTriggerInitializationCompletedRequest$invoke$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$12 = androidTriggerInitializationCompletedRequest$invoke$1;
                obj = androidTriggerInitializationCompletedRequest$invoke$12.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidTriggerInitializationCompletedRequest$invoke$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_completed_event_request_started", null, null, null, null, null, 62, null);
                    try {
                        com.unity3d.ads.core.domain.GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                        androidTriggerInitializationCompletedRequest$invoke$12.L$0 = this;
                        androidTriggerInitializationCompletedRequest$invoke$12.J$0 = m12261markNowz9LOYto;
                        androidTriggerInitializationCompletedRequest$invoke$12.label = 1;
                        obj = getInitializationCompletedRequest.invoke(androidTriggerInitializationCompletedRequest$invoke$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidTriggerInitializationCompletedRequest2 = this;
                    } catch (java.lang.Exception e) {
                        e = e;
                        i2 = 1;
                        c = 2;
                        j = m12261markNowz9LOYto;
                        androidTriggerInitializationCompletedRequest = this;
                    }
                } else {
                    if (i == 1) {
                        m12261markNowz9LOYto = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                        androidTriggerInitializationCompletedRequest2 = (com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest) androidTriggerInitializationCompletedRequest$invoke$12.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            j = m12261markNowz9LOYto;
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                        androidTriggerInitializationCompletedRequest = (com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest) androidTriggerInitializationCompletedRequest$invoke$12.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            c = 2;
                            try {
                                universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj;
                                if (!universalResponse.hasError()) {
                                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                                    java.lang.Double boxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                                    pairArr[0] = kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED.toString());
                                    i2 = 1;
                                    try {
                                        pairArr[1] = kotlin.TuplesKt.to("reason", "gateway");
                                        pairArr[c] = kotlin.TuplesKt.to("reason_debug", universalResponse.getError().getErrorText());
                                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialization_completed_event_request_failure_time", boxDouble, kotlin.collections.MapsKt.mapOf(pairArr), null, null, null, 56, null);
                                        return kotlin.Unit.INSTANCE;
                                    } catch (java.lang.Exception e3) {
                                        e = e3;
                                    }
                                } else {
                                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j))), null, null, null, null, 60, null);
                                    return kotlin.Unit.INSTANCE;
                                }
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                i2 = 1;
                            }
                        } catch (java.lang.Exception e5) {
                            e = e5;
                        }
                    }
                    i2 = 1;
                    c = 2;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent2 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                    java.lang.Double boxDouble2 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                    kotlin.Pair pair = kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED.toString());
                    kotlin.Pair pair2 = kotlin.TuplesKt.to("reason", "uncaught_exception");
                    kotlin.Pair pair3 = kotlin.TuplesKt.to("reason_debug", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, i2, null));
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                    pairArr2[0] = pair;
                    pairArr2[i2] = pair2;
                    pairArr2[c] = pair3;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_initialization_completed_event_request_failure_time", boxDouble2, kotlin.collections.MapsKt.mapOf(pairArr2), null, null, null, 56, null);
                    return kotlin.Unit.INSTANCE;
                }
                long j2 = m12261markNowz9LOYto;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
                com.unity3d.ads.gatewayclient.RequestPolicy invoke = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
                com.unity3d.ads.gatewayclient.GatewayClient gatewayClient = androidTriggerInitializationCompletedRequest2.gatewayClient;
                com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED;
                androidTriggerInitializationCompletedRequest$invoke$12.L$0 = androidTriggerInitializationCompletedRequest2;
                androidTriggerInitializationCompletedRequest$invoke$12.J$0 = j2;
                androidTriggerInitializationCompletedRequest$invoke$12.label = 2;
                com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                long j3 = j2;
                c = 2;
                obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, androidTriggerInitializationCompletedRequest$invoke$12, 1, null);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                j = j3;
                universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj;
                if (!universalResponse.hasError()) {
                }
            }
        }
        androidTriggerInitializationCompletedRequest$invoke$1 = new com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1(this, continuation);
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$122 = androidTriggerInitializationCompletedRequest$invoke$1;
        obj = androidTriggerInitializationCompletedRequest$invoke$122.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidTriggerInitializationCompletedRequest$invoke$122.label;
        if (i != 0) {
        }
        long j22 = m12261markNowz9LOYto;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest2 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
        com.unity3d.ads.gatewayclient.RequestPolicy invoke2 = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient2 = androidTriggerInitializationCompletedRequest2.gatewayClient;
        com.unity3d.ads.core.data.model.OperationType operationType2 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED;
        androidTriggerInitializationCompletedRequest$invoke$122.L$0 = androidTriggerInitializationCompletedRequest2;
        androidTriggerInitializationCompletedRequest$invoke$122.J$0 = j22;
        androidTriggerInitializationCompletedRequest$invoke$122.label = 2;
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest32 = androidTriggerInitializationCompletedRequest2;
        long j32 = j22;
        c = 2;
        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, invoke2, operationType2, androidTriggerInitializationCompletedRequest$invoke$122, 1, null);
        if (obj != coroutine_suspended) {
        }
    }
}
