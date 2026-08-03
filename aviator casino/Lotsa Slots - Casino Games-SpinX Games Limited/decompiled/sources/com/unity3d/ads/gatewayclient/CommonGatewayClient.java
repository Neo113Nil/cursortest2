package com.unity3d.ads.gatewayclient;

/* compiled from: CommonGatewayClient.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J)\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%J1\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0002J\"\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J1\u0010\u0014\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J(\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0002J(\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0002J \u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/unity3d/ads/gatewayclient/CommonGatewayClient;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "handleGatewayUniversalResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "buildHttpRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "gatewayUrl", "", "headers", "", "", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "request", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "calculateDelayTime", "", "currentDelay", "retryCount", "", "calculateExponentialBackoff", "calculateJitter", "retryWaitBase", "retryJitterPct", "", "executeRequest", "Lcom/unity3d/services/core/network/model/HttpResponse;", "httpRequest", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Lcom/unity3d/services/core/network/model/HttpRequest;ILcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeWithRetry", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "url", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGatewayUrl", "getHeaders", "getUniversalResponse", com.ironsource.Ve.n, "sendNetworkErrorDiagnosticEvent", "", "e", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "startTime", "Lkotlin/time/TimeMark;", "sendNetworkSuccessDiagnosticEvent", "httpResponse", "shouldRetry", "", "responseCode", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "maxDuration", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonGatewayClient implements com.unity3d.ads.gatewayclient.GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    public static final java.lang.String HEADER_PROTOBUF = "application/x-protobuf";
    public static final java.lang.String HEADER_RETRY_AFTER = "Retry-After";
    public static final java.lang.String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final com.unity3d.ads.core.domain.HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    private final boolean shouldRetry(int responseCode, long duration, int maxDuration) {
        return 400 <= responseCode && responseCode < 600 && duration < ((long) maxDuration);
    }

    public CommonGatewayClient(com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider, com.unity3d.ads.core.domain.HandleGatewayUniversalResponse handleGatewayUniversalResponse, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object request(java.lang.String str, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> continuation) {
        com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 commonGatewayClient$request$1;
        int i;
        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy2;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (continuation instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1) {
            commonGatewayClient$request$1 = (com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1) continuation;
            if ((commonGatewayClient$request$1.label & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$request$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonGatewayClient$request$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGatewayClient$request$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                    long duration = kotlin.time.DurationKt.toDuration(requestPolicy.getMaxDuration(), kotlin.time.DurationUnit.MILLISECONDS);
                    com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2 commonGatewayClient$request$2 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2(this, str, universalRequest, requestPolicy, operationType, null);
                    commonGatewayClient$request$1.L$0 = requestPolicy;
                    commonGatewayClient$request$1.label = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(duration, commonGatewayClient$request$2, commonGatewayClient$request$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    requestPolicy2 = requestPolicy;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    requestPolicy2 = (com.unity3d.ads.gatewayclient.RequestPolicy) commonGatewayClient$request$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj;
                if (universalResponse == null) {
                    return universalResponse;
                }
                throw new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
            }
        }
        commonGatewayClient$request$1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1(this, continuation);
        java.lang.Object obj2 = commonGatewayClient$request$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGatewayClient$request$1.label;
        if (i != 0) {
        }
        universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj2;
        if (universalResponse == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0183 -> B:12:0x018a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeWithRetry(java.lang.String str, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> continuation) {
        com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$1;
        com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient;
        int i;
        com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient2;
        long retryWaitBase;
        int i2;
        com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$12;
        long j;
        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy2;
        com.unity3d.ads.core.data.model.OperationType operationType2;
        java.lang.String str2;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest2;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest3;
        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy3;
        java.lang.String str3;
        com.unity3d.ads.core.data.model.OperationType operationType3;
        long j2;
        com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient3;
        int i3;
        com.unity3d.services.core.network.model.HttpResponse httpResponse;
        java.lang.Object obj;
        java.lang.Long l;
        java.util.List<java.lang.String> list;
        java.lang.String str4;
        java.lang.Long longOrNull;
        java.lang.Object executeRequest;
        if (continuation instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1) {
            commonGatewayClient$executeWithRetry$1 = (com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1) continuation;
            if ((commonGatewayClient$executeWithRetry$1.label & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$executeWithRetry$1.label -= Integer.MIN_VALUE;
                commonGatewayClient = this;
                java.lang.Object obj2 = commonGatewayClient$executeWithRetry$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGatewayClient$executeWithRetry$1.label;
                int i4 = 2;
                int i5 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.String gatewayUrl = getGatewayUrl(str);
                    long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    commonGatewayClient2 = commonGatewayClient;
                    retryWaitBase = requestPolicy.getRetryWaitBase();
                    i2 = 0;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    j = m12261markNowz9LOYto;
                    requestPolicy2 = requestPolicy;
                    operationType2 = operationType;
                    str2 = gatewayUrl;
                    universalRequest2 = universalRequest;
                    com.unity3d.services.core.network.model.HttpRequest buildHttpRequest = commonGatewayClient2.buildHttpRequest(str2, commonGatewayClient2.getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = commonGatewayClient2;
                    commonGatewayClient$executeWithRetry$12.L$1 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$2 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$3 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$4 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i5;
                    executeRequest = commonGatewayClient2.executeRequest(buildHttpRequest, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest == coroutine_suspended) {
                    }
                } else if (i == 1) {
                    long j3 = commonGatewayClient$executeWithRetry$1.J$1;
                    j2 = commonGatewayClient$executeWithRetry$1.J$0;
                    int i6 = commonGatewayClient$executeWithRetry$1.I$0;
                    java.lang.String str5 = (java.lang.String) commonGatewayClient$executeWithRetry$1.L$4;
                    com.unity3d.ads.core.data.model.OperationType operationType4 = (com.unity3d.ads.core.data.model.OperationType) commonGatewayClient$executeWithRetry$1.L$3;
                    com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy4 = (com.unity3d.ads.gatewayclient.RequestPolicy) commonGatewayClient$executeWithRetry$1.L$2;
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest4 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$1;
                    com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient4 = (com.unity3d.ads.gatewayclient.CommonGatewayClient) commonGatewayClient$executeWithRetry$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    i3 = i6;
                    operationType3 = operationType4;
                    commonGatewayClient3 = commonGatewayClient4;
                    universalRequest3 = universalRequest4;
                    requestPolicy3 = requestPolicy4;
                    str3 = str5;
                    retryWaitBase = j3;
                    httpResponse = (com.unity3d.services.core.network.model.HttpResponse) obj2;
                    if (com.unity3d.services.core.network.model.HttpResponseKt.isSuccessful(httpResponse)) {
                    }
                } else {
                    if (i == 2) {
                        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) commonGatewayClient$executeWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return universalResponse;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = commonGatewayClient$executeWithRetry$1.J$1;
                    long j5 = commonGatewayClient$executeWithRetry$1.J$0;
                    i3 = commonGatewayClient$executeWithRetry$1.I$0;
                    java.lang.String str6 = (java.lang.String) commonGatewayClient$executeWithRetry$1.L$4;
                    com.unity3d.ads.core.data.model.OperationType operationType5 = (com.unity3d.ads.core.data.model.OperationType) commonGatewayClient$executeWithRetry$1.L$3;
                    com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy5 = (com.unity3d.ads.gatewayclient.RequestPolicy) commonGatewayClient$executeWithRetry$1.L$2;
                    universalRequest3 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$1;
                    com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient5 = (com.unity3d.ads.gatewayclient.CommonGatewayClient) commonGatewayClient$executeWithRetry$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.Object obj3 = coroutine_suspended;
                    long j6 = j5;
                    operationType3 = operationType5;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    requestPolicy2 = requestPolicy5;
                    commonGatewayClient2 = commonGatewayClient5;
                    str2 = str6;
                    retryWaitBase = j4;
                    i2 = i3 + 1;
                    operationType2 = operationType3;
                    universalRequest2 = universalRequest3;
                    i4 = 2;
                    j = j6;
                    coroutine_suspended = obj3;
                    i5 = 1;
                    com.unity3d.services.core.network.model.HttpRequest buildHttpRequest2 = commonGatewayClient2.buildHttpRequest(str2, commonGatewayClient2.getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = commonGatewayClient2;
                    commonGatewayClient$executeWithRetry$12.L$1 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$2 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$3 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$4 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i5;
                    executeRequest = commonGatewayClient2.executeRequest(buildHttpRequest2, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    universalRequest3 = universalRequest2;
                    obj2 = executeRequest;
                    com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient6 = commonGatewayClient2;
                    requestPolicy3 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$1 = commonGatewayClient$executeWithRetry$12;
                    j2 = j;
                    operationType3 = operationType2;
                    i3 = i2;
                    str3 = str2;
                    commonGatewayClient3 = commonGatewayClient6;
                    httpResponse = (com.unity3d.services.core.network.model.HttpResponse) obj2;
                    if (com.unity3d.services.core.network.model.HttpResponseKt.isSuccessful(httpResponse)) {
                        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse2 = commonGatewayClient3.getUniversalResponse(httpResponse, operationType3);
                        com.unity3d.ads.core.domain.HandleGatewayUniversalResponse handleGatewayUniversalResponse = commonGatewayClient3.handleGatewayUniversalResponse;
                        commonGatewayClient$executeWithRetry$1.L$0 = universalResponse2;
                        commonGatewayClient$executeWithRetry$1.L$1 = null;
                        commonGatewayClient$executeWithRetry$1.L$2 = null;
                        commonGatewayClient$executeWithRetry$1.L$3 = null;
                        commonGatewayClient$executeWithRetry$1.L$4 = null;
                        commonGatewayClient$executeWithRetry$1.label = i4;
                        return handleGatewayUniversalResponse.invoke(universalResponse2, commonGatewayClient$executeWithRetry$1) == coroutine_suspended ? coroutine_suspended : universalResponse2;
                    }
                    if (httpResponse.getStatusCode() != 429 || (list = httpResponse.getHeaders().get("Retry-After")) == null || (str4 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str4)) == null) {
                        obj = coroutine_suspended;
                        l = null;
                    } else {
                        obj = coroutine_suspended;
                        l = kotlin.coroutines.jvm.internal.Boxing.boxLong(longOrNull.longValue() * 1000);
                    }
                    long longValue = l != null ? l.longValue() : commonGatewayClient3.calculateDelayTime(retryWaitBase, requestPolicy3, i3);
                    long elapsedMillis = (long) com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                    if (!commonGatewayClient3.shouldRetry(httpResponse.getStatusCode(), elapsedMillis + longValue, requestPolicy3.getMaxDuration())) {
                        throw new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException("Gateway request failed after " + i3 + " retries  currentDuration: " + elapsedMillis + "ms maxDuration: " + requestPolicy3.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
                    }
                    commonGatewayClient$executeWithRetry$1.L$0 = commonGatewayClient3;
                    commonGatewayClient$executeWithRetry$1.L$1 = universalRequest3;
                    commonGatewayClient$executeWithRetry$1.L$2 = requestPolicy3;
                    commonGatewayClient$executeWithRetry$1.L$3 = operationType3;
                    commonGatewayClient$executeWithRetry$1.L$4 = str3;
                    commonGatewayClient$executeWithRetry$1.I$0 = i3;
                    commonGatewayClient$executeWithRetry$1.J$0 = j2;
                    commonGatewayClient$executeWithRetry$1.J$1 = longValue;
                    commonGatewayClient$executeWithRetry$1.label = 3;
                    obj3 = obj;
                    if (kotlinx.coroutines.DelayKt.delay(longValue, commonGatewayClient$executeWithRetry$1) == obj3) {
                        return obj3;
                    }
                    retryWaitBase = longValue;
                    j6 = j2;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    requestPolicy2 = requestPolicy3;
                    commonGatewayClient2 = commonGatewayClient3;
                    str2 = str3;
                    i2 = i3 + 1;
                    operationType2 = operationType3;
                    universalRequest2 = universalRequest3;
                    i4 = 2;
                    j = j6;
                    coroutine_suspended = obj3;
                    i5 = 1;
                    com.unity3d.services.core.network.model.HttpRequest buildHttpRequest22 = commonGatewayClient2.buildHttpRequest(str2, commonGatewayClient2.getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = commonGatewayClient2;
                    commonGatewayClient$executeWithRetry$12.L$1 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$2 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$3 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$4 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i5;
                    executeRequest = commonGatewayClient2.executeRequest(buildHttpRequest22, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest == coroutine_suspended) {
                    }
                }
            }
        }
        commonGatewayClient = this;
        commonGatewayClient$executeWithRetry$1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1(commonGatewayClient, continuation);
        java.lang.Object obj22 = commonGatewayClient$executeWithRetry$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGatewayClient$executeWithRetry$1.label;
        int i42 = 2;
        int i52 = 1;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeRequest(com.unity3d.services.core.network.model.HttpRequest httpRequest, int i, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i2;
        long m12261markNowz9LOYto;
        int i3;
        com.unity3d.ads.core.data.model.OperationType operationType2;
        com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient;
        com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient2;
        com.unity3d.services.core.network.model.HttpRequest httpRequest2;
        long j;
        long j2;
        com.unity3d.ads.core.data.model.OperationType operationType3;
        int i4;
        try {
            if (continuation instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1) {
                commonGatewayClient$executeRequest$1 = (com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1) continuation;
                if ((commonGatewayClient$executeRequest$1.label & Integer.MIN_VALUE) != 0) {
                    commonGatewayClient$executeRequest$1.label -= Integer.MIN_VALUE;
                    com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$12 = commonGatewayClient$executeRequest$1;
                    obj = commonGatewayClient$executeRequest$12.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = commonGatewayClient$executeRequest$12.label;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                        try {
                            com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider = this.httpClientProvider;
                            commonGatewayClient$executeRequest$12.L$0 = this;
                            commonGatewayClient$executeRequest$12.L$1 = httpRequest;
                            operationType2 = operationType;
                            try {
                                commonGatewayClient$executeRequest$12.L$2 = operationType2;
                                i3 = i;
                                try {
                                    commonGatewayClient$executeRequest$12.I$0 = i3;
                                    commonGatewayClient$executeRequest$12.J$0 = m12261markNowz9LOYto;
                                    commonGatewayClient$executeRequest$12.label = 1;
                                    obj = httpClientProvider.invoke(commonGatewayClient$executeRequest$12);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    commonGatewayClient2 = this;
                                    httpRequest2 = httpRequest;
                                    j = m12261markNowz9LOYto;
                                } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e) {
                                    e = e;
                                    commonGatewayClient = this;
                                    j2 = m12261markNowz9LOYto;
                                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                                    return com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(e);
                                } catch (kotlinx.coroutines.TimeoutCancellationException e2) {
                                    e = e2;
                                    commonGatewayClient = this;
                                    j2 = m12261markNowz9LOYto;
                                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                                    throw e;
                                }
                            } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e3) {
                                e = e3;
                                i3 = i;
                            } catch (kotlinx.coroutines.TimeoutCancellationException e4) {
                                e = e4;
                                i3 = i;
                            }
                        } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e5) {
                            e = e5;
                            i3 = i;
                            operationType2 = operationType;
                        } catch (kotlinx.coroutines.TimeoutCancellationException e6) {
                            e = e6;
                            i3 = i;
                            operationType2 = operationType;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j2 = commonGatewayClient$executeRequest$12.J$0;
                            i4 = commonGatewayClient$executeRequest$12.I$0;
                            operationType3 = (com.unity3d.ads.core.data.model.OperationType) commonGatewayClient$executeRequest$12.L$1;
                            commonGatewayClient = (com.unity3d.ads.gatewayclient.CommonGatewayClient) commonGatewayClient$executeRequest$12.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                com.unity3d.services.core.network.model.HttpResponse httpResponse = (com.unity3d.services.core.network.model.HttpResponse) obj;
                                commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse, i4, operationType3, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                                return httpResponse;
                            } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e7) {
                                e = e7;
                                i3 = i4;
                                operationType2 = operationType3;
                                commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                                return com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(e);
                            } catch (kotlinx.coroutines.TimeoutCancellationException e8) {
                                e = e8;
                                i3 = i4;
                                operationType2 = operationType3;
                                commonGatewayClient.sendNetworkErrorDiagnosticEvent(new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                                throw e;
                            }
                        }
                        m12261markNowz9LOYto = commonGatewayClient$executeRequest$12.J$0;
                        int i5 = commonGatewayClient$executeRequest$12.I$0;
                        com.unity3d.ads.core.data.model.OperationType operationType4 = (com.unity3d.ads.core.data.model.OperationType) commonGatewayClient$executeRequest$12.L$2;
                        com.unity3d.services.core.network.model.HttpRequest httpRequest3 = (com.unity3d.services.core.network.model.HttpRequest) commonGatewayClient$executeRequest$12.L$1;
                        com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient3 = (com.unity3d.ads.gatewayclient.CommonGatewayClient) commonGatewayClient$executeRequest$12.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            j = m12261markNowz9LOYto;
                            commonGatewayClient2 = commonGatewayClient3;
                            i3 = i5;
                            operationType2 = operationType4;
                            httpRequest2 = httpRequest3;
                        } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e9) {
                            e = e9;
                            operationType2 = operationType4;
                            commonGatewayClient = commonGatewayClient3;
                            i3 = i5;
                            j2 = m12261markNowz9LOYto;
                            commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                            return com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(e);
                        } catch (kotlinx.coroutines.TimeoutCancellationException e10) {
                            e = e10;
                            operationType2 = operationType4;
                            commonGatewayClient = commonGatewayClient3;
                            i3 = i5;
                            j2 = m12261markNowz9LOYto;
                            commonGatewayClient.sendNetworkErrorDiagnosticEvent(new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                            throw e;
                        }
                    }
                    commonGatewayClient$executeRequest$12.L$0 = commonGatewayClient2;
                    commonGatewayClient$executeRequest$12.L$1 = operationType2;
                    commonGatewayClient$executeRequest$12.L$2 = null;
                    commonGatewayClient$executeRequest$12.I$0 = i3;
                    commonGatewayClient$executeRequest$12.J$0 = j;
                    commonGatewayClient$executeRequest$12.label = 2;
                    obj = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default((com.unity3d.services.core.network.core.HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    operationType3 = operationType2;
                    i4 = i3;
                    j2 = j;
                    commonGatewayClient = commonGatewayClient2;
                    com.unity3d.services.core.network.model.HttpResponse httpResponse2 = (com.unity3d.services.core.network.model.HttpResponse) obj;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse2, i4, operationType3, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
                    return httpResponse2;
                }
            }
            commonGatewayClient$executeRequest$12.L$0 = commonGatewayClient2;
            commonGatewayClient$executeRequest$12.L$1 = operationType2;
            commonGatewayClient$executeRequest$12.L$2 = null;
            commonGatewayClient$executeRequest$12.I$0 = i3;
            commonGatewayClient$executeRequest$12.J$0 = j;
            commonGatewayClient$executeRequest$12.label = 2;
            obj = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default((com.unity3d.services.core.network.core.HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
            if (obj != coroutine_suspended) {
            }
        } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e11) {
            e = e11;
            j2 = j;
            commonGatewayClient = commonGatewayClient2;
            commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
            return com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(e);
        } catch (kotlinx.coroutines.TimeoutCancellationException e12) {
            e = e12;
            j2 = j;
            commonGatewayClient = commonGatewayClient2;
            commonGatewayClient.sendNetworkErrorDiagnosticEvent(new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2));
            throw e;
        }
        commonGatewayClient$executeRequest$1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1(this, continuation);
        com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$122 = commonGatewayClient$executeRequest$1;
        obj = commonGatewayClient$executeRequest$122.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonGatewayClient$executeRequest$122.label;
        if (i2 != 0) {
        }
    }

    private final com.unity3d.services.core.network.model.HttpRequest buildHttpRequest(java.lang.String gatewayUrl, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest request) {
        return new com.unity3d.services.core.network.model.HttpRequest(gatewayUrl, null, com.unity3d.services.core.network.model.RequestType.POST, request.toByteArray(), headers, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders(int retryCount) {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("Content-Type", kotlin.collections.CollectionsKt.listOf(HEADER_PROTOBUF));
        if (retryCount > 0) {
            createMapBuilder.put(HEADER_RETRY_ATTEMPT, kotlin.collections.CollectionsKt.listOf(java.lang.String.valueOf(retryCount)));
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    private final java.lang.String getGatewayUrl(java.lang.String url) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(url, com.unity3d.services.UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? url : this.sessionRepository.getGatewayUrl();
    }

    private final void sendNetworkErrorDiagnosticEvent(com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e, int retryCount, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.time.TimeMark startTime) {
        if (operationType == com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT) {
            return;
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("operation", operationType.toString()), kotlin.TuplesKt.to("retries", java.lang.String.valueOf(retryCount)), kotlin.TuplesKt.to("protocol", java.lang.String.valueOf(e.getProtocol())), kotlin.TuplesKt.to("network_client", java.lang.String.valueOf(e.getClient())), kotlin.TuplesKt.to("reason_code", java.lang.String.valueOf(e.getCode())), kotlin.TuplesKt.to("reason_debug", e.getMessage())), null, null, null, 56, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(com.unity3d.services.core.network.model.HttpResponse httpResponse, int retryCount, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.time.TimeMark startTime) {
        if (operationType == com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT) {
            return;
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("operation", operationType.toString()), kotlin.TuplesKt.to("retries", java.lang.String.valueOf(retryCount)), kotlin.TuplesKt.to("protocol", httpResponse.getProtocol()), kotlin.TuplesKt.to("network_client", httpResponse.getClient()), kotlin.TuplesKt.to("reason_code", java.lang.String.valueOf(httpResponse.getStatusCode()))), null, null, null, 56, null);
    }

    private final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse getUniversalResponse(com.unity3d.services.core.network.model.HttpResponse response, com.unity3d.ads.core.data.model.OperationType operationType) {
        try {
            java.lang.Object body = response.getBody();
            if (body instanceof byte[]) {
                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(responseBody)");
                return parseFrom;
            }
            if (body instanceof java.lang.String) {
                byte[] bytes = ((java.lang.String) body).getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse parseFrom2 = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseFrom2, "parseFrom(\n             ….UTF_8)\n                )");
                return parseFrom2;
            }
            throw new com.google.protobuf.InvalidProtocolBufferException("Could not parse response from gateway service");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            com.unity3d.services.core.log.DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e.getLocalizedMessage());
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("operation", operationType.toString()), kotlin.TuplesKt.to("reason", "protobuf_parsing"), kotlin.TuplesKt.to("reason_debug", response.getBody().toString())), null, null, null, 58, null);
            gatewayprotocol.v1.UniversalResponseKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalResponseKt.Dsl.INSTANCE;
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder newBuilder = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
            gatewayprotocol.v1.UniversalResponseKt.Dsl _create = companion._create(newBuilder);
            gatewayprotocol.v1.ErrorKt.Dsl.Companion companion2 = gatewayprotocol.v1.ErrorKt.Dsl.INSTANCE;
            gatewayprotocol.v1.ErrorOuterClass.Error.Builder newBuilder2 = gatewayprotocol.v1.ErrorOuterClass.Error.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
            gatewayprotocol.v1.ErrorKt.Dsl _create2 = companion2._create(newBuilder2);
            _create2.setErrorText("ERROR: Could not parse response from gateway service");
            _create.setError(_create2._build());
            return _create._build();
        }
    }

    private final long calculateDelayTime(long currentDelay, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, int retryCount) {
        return java.lang.Math.min(calculateExponentialBackoff(currentDelay, requestPolicy, retryCount) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long currentDelay, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, int retryCount) {
        return retryCount == 0 ? currentDelay : (long) (currentDelay * requestPolicy.getRetryScalingFactor());
    }

    private final long calculateJitter(int retryWaitBase, float retryJitterPct) {
        if (retryJitterPct == 0.0f) {
            return 0L;
        }
        long j = (long) (retryWaitBase * retryJitterPct);
        return kotlin.random.Random.INSTANCE.nextLong(-j, j);
    }
}
