package com.unity3d.ads.core.domain.events;

/* compiled from: UniversalRequestEventSender.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "handleGatewayEventResponse", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "universalRequestTtlValidator", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "(Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;)V", "invoke", "", "universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniversalRequestEventSender {
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.events.HandleGatewayEventResponse handleGatewayEventResponse;
    private final com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator universalRequestTtlValidator;

    public UniversalRequestEventSender(com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse handleGatewayEventResponse, com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator universalRequestTtlValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleGatewayEventResponse, "handleGatewayEventResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalRequestTtlValidator, "universalRequestTtlValidator");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 universalRequestEventSender$invoke$1;
        int i;
        com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender;
        java.lang.Object m10798constructorimpl;
        if (continuation instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1) {
            universalRequestEventSender$invoke$1 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1) continuation;
            if ((universalRequestEventSender$invoke$1.label & Integer.MIN_VALUE) != 0) {
                universalRequestEventSender$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = universalRequestEventSender$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = universalRequestEventSender$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender2 = this;
                        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient = this.gatewayClient;
                        com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT;
                        universalRequestEventSender$invoke$1.L$0 = this;
                        universalRequestEventSender$invoke$1.label = 1;
                        obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, universalRequestEventSender$invoke$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        universalRequestEventSender = this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        universalRequestEventSender = this;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        if (!(kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) instanceof com.unity3d.ads.core.data.model.exception.GatewayException)) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    universalRequestEventSender = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) universalRequestEventSender$invoke$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        if (!(kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) instanceof com.unity3d.ads.core.data.model.exception.GatewayException)) {
                        }
                    }
                }
                m10798constructorimpl = kotlin.Result.m10798constructorimpl((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj);
                if (!(kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) instanceof com.unity3d.ads.core.data.model.exception.GatewayException)) {
                    return kotlin.Unit.INSTANCE;
                }
                com.unity3d.ads.core.domain.events.HandleGatewayEventResponse handleGatewayEventResponse = universalRequestEventSender.handleGatewayEventResponse;
                kotlin.ResultKt.throwOnFailure(m10798constructorimpl);
                universalRequestEventSender$invoke$1.L$0 = null;
                universalRequestEventSender$invoke$1.label = 2;
                if (handleGatewayEventResponse.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) m10798constructorimpl, universalRequestEventSender$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        universalRequestEventSender$invoke$1 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1(this, continuation);
        java.lang.Object obj2 = universalRequestEventSender$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = universalRequestEventSender$invoke$1.label;
        if (i != 0) {
        }
        m10798constructorimpl = kotlin.Result.m10798constructorimpl((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj2);
        if (!(kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) instanceof com.unity3d.ads.core.data.model.exception.GatewayException)) {
        }
    }
}
