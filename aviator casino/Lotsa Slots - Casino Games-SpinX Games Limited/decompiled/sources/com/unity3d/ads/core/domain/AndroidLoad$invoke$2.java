package com.unity3d.ads.core.domain;

/* compiled from: AndroidLoad.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {72, 76, 93, 97, 136}, m = "invokeSuspend", n = {"$this$withContext", "adType", "tmpAdObject", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv", "$this$withContext", "adType", "tmpAdObject", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes5.dex */
final class AndroidLoad$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult>, java.lang.Object> {
    final /* synthetic */ gatewayprotocol.v1.AdRequestOuterClass.BannerSize $bannerSize;
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
    final /* synthetic */ com.unity3d.ads.UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
    final /* synthetic */ java.lang.String $placement;
    int I$0;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidLoad$invoke$2(com.unity3d.ads.core.domain.AndroidLoad androidLoad, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, com.google.protobuf.ByteString byteString, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, android.content.Context context, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidLoad$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidLoad;
        this.$bannerSize = bannerSize;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$opportunityId = byteString;
        this.$placement = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.AndroidLoad$invoke$2 androidLoad$invoke$2 = new com.unity3d.ads.core.domain.AndroidLoad$invoke$2(this.this$0, this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, continuation);
        androidLoad$invoke$2.L$0 = obj;
        return androidLoad$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidLoad$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x03f8 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #8 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03f2, B:13:0x03f8, B:15:0x0406, B:18:0x041d, B:20:0x0426, B:24:0x042b, B:25:0x0430, B:34:0x02a9, B:37:0x02d7, B:39:0x0303, B:41:0x0321, B:43:0x038a, B:44:0x0396, B:46:0x03a3, B:47:0x03b4, B:49:0x03ba, B:52:0x03d4, B:59:0x029f, B:64:0x0062, B:66:0x0245, B:87:0x019c, B:90:0x01ca, B:94:0x0192, B:99:0x00a1, B:101:0x0131, B:117:0x00b2, B:119:0x00be, B:121:0x00d6, B:125:0x00df, B:126:0x00e4, B:128:0x0109, B:132:0x01fc, B:134:0x021f, B:135:0x0226, B:140:0x00e2), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0426 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #8 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03f2, B:13:0x03f8, B:15:0x0406, B:18:0x041d, B:20:0x0426, B:24:0x042b, B:25:0x0430, B:34:0x02a9, B:37:0x02d7, B:39:0x0303, B:41:0x0321, B:43:0x038a, B:44:0x0396, B:46:0x03a3, B:47:0x03b4, B:49:0x03ba, B:52:0x03d4, B:59:0x029f, B:64:0x0062, B:66:0x0245, B:87:0x019c, B:90:0x01ca, B:94:0x0192, B:99:0x00a1, B:101:0x0131, B:117:0x00b2, B:119:0x00be, B:121:0x00d6, B:125:0x00df, B:126:0x00e4, B:128:0x0109, B:132:0x01fc, B:134:0x021f, B:135:0x0226, B:140:0x00e2), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0303 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #8 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03f2, B:13:0x03f8, B:15:0x0406, B:18:0x041d, B:20:0x0426, B:24:0x042b, B:25:0x0430, B:34:0x02a9, B:37:0x02d7, B:39:0x0303, B:41:0x0321, B:43:0x038a, B:44:0x0396, B:46:0x03a3, B:47:0x03b4, B:49:0x03ba, B:52:0x03d4, B:59:0x029f, B:64:0x0062, B:66:0x0245, B:87:0x019c, B:90:0x01ca, B:94:0x0192, B:99:0x00a1, B:101:0x0131, B:117:0x00b2, B:119:0x00be, B:121:0x00d6, B:125:0x00df, B:126:0x00e4, B:128:0x0109, B:132:0x01fc, B:134:0x021f, B:135:0x0226, B:140:0x00e2), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0321 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #8 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:11:0x03f2, B:13:0x03f8, B:15:0x0406, B:18:0x041d, B:20:0x0426, B:24:0x042b, B:25:0x0430, B:34:0x02a9, B:37:0x02d7, B:39:0x0303, B:41:0x0321, B:43:0x038a, B:44:0x0396, B:46:0x03a3, B:47:0x03b4, B:49:0x03ba, B:52:0x03d4, B:59:0x029f, B:64:0x0062, B:66:0x0245, B:87:0x019c, B:90:0x01ca, B:94:0x0192, B:99:0x00a1, B:101:0x0131, B:117:0x00b2, B:119:0x00be, B:121:0x00d6, B:125:0x00df, B:126:0x00e4, B:128:0x0109, B:132:0x01fc, B:134:0x021f, B:135:0x0226, B:140:0x00e2), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.data.model.LoadResult.Failure handleGatewayException;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        com.unity3d.ads.core.data.model.AdObject tmpAdObject;
        java.lang.String str;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker;
        com.unity3d.ads.core.domain.GetAdPlayerConfigRequest getAdPlayerConfigRequest;
        java.lang.Object invoke;
        com.unity3d.ads.core.data.model.AdObject adObject;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
        int i;
        com.unity3d.ads.core.domain.GetAdRequest getAdRequest;
        java.lang.Object invoke2;
        com.unity3d.ads.core.data.model.AdObject adObject2;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        int i2;
        com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
        long m12261markNowz9LOYto;
        long j;
        java.lang.String str2;
        int i3;
        com.unity3d.ads.core.data.model.AdObject adObject3;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        long j2;
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
        java.lang.Object request$default;
        java.lang.Object m10798constructorimpl;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse response;
        com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy2;
        long m12261markNowz9LOYto2;
        long j3;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        com.unity3d.ads.core.data.model.AdObject adObject4;
        long j4;
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient2;
        java.lang.Object request$default2;
        java.lang.Object m10798constructorimpl2;
        com.unity3d.ads.core.domain.HandleGatewayAdResponse handleGatewayAdResponse;
        java.lang.Object invoke3;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent2;
        gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse;
        com.unity3d.ads.core.data.model.LoadResult loadResult;
        com.unity3d.ads.core.data.repository.AdRepository adRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                sessionRepository = this.this$0.sessionRepository;
                if (!sessionRepository.isSdkInitialized()) {
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, null, null, "not_initialized", null, false, 54, null);
                }
                boolean z = this.$bannerSize != null;
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = z ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
                boolean z2 = !this.$headerBiddingAdMarkup.getAdData().isEmpty();
                tmpAdObject = this.this$0.getTmpAdObject(this.$opportunityId, this.$placement, z2, diagnosticAdType5, this.$loadOptions);
                if (z2) {
                    str = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                    this.this$0.incrementLoadRequestAdmCount(z);
                    getAdPlayerConfigRequest = this.this$0.getAdPlayerConfigRequest;
                    java.lang.String str3 = this.$placement;
                    com.google.protobuf.ByteString byteString = this.$opportunityId;
                    com.google.protobuf.ByteString configurationToken = this.$headerBiddingAdMarkup.getConfigurationToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configurationToken, "headerBiddingAdMarkup.configurationToken");
                    gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat = this.$bannerSize != null ? gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null;
                    this.L$0 = coroutineScope;
                    this.L$1 = diagnosticAdType5;
                    this.L$2 = tmpAdObject;
                    this.I$0 = z2 ? 1 : 0;
                    this.label = 3;
                    invoke = getAdPlayerConfigRequest.invoke(str3, byteString, configurationToken, adFormat, this);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adObject = tmpAdObject;
                    diagnosticAdType = diagnosticAdType5;
                    i = z2 ? 1 : 0;
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) invoke;
                    getRequestPolicy2 = this.this$0.getRequestPolicy;
                    com.unity3d.ads.gatewayclient.RequestPolicy invoke4 = getRequestPolicy2.invoke();
                    com.unity3d.ads.core.domain.AndroidLoad androidLoad = this.this$0;
                    m12261markNowz9LOYto2 = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    gatewayClient2 = androidLoad.gatewayClient;
                    com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.LOAD_HEADER_BIDDING;
                    this.L$0 = diagnosticAdType;
                    this.L$1 = adObject;
                    this.L$2 = defaultConstructorMarker;
                    this.I$0 = i;
                    this.J$0 = m12261markNowz9LOYto2;
                    this.label = 4;
                    j3 = m12261markNowz9LOYto2;
                    diagnosticAdType4 = diagnosticAdType;
                    request$default2 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest, invoke4, operationType, this, 1, null);
                    if (request$default2 != coroutine_suspended) {
                    }
                } else {
                    this.this$0.incrementLoadRequestCount(z);
                    getAdRequest = this.this$0.getAdRequest;
                    this.L$0 = coroutineScope;
                    this.L$1 = diagnosticAdType5;
                    this.L$2 = tmpAdObject;
                    this.I$0 = z2 ? 1 : 0;
                    this.label = 1;
                    invoke2 = getAdRequest.invoke(this.$placement, this.$opportunityId, this.$bannerSize, this);
                    if (invoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adObject2 = tmpAdObject;
                    diagnosticAdType2 = diagnosticAdType5;
                    i2 = z2 ? 1 : 0;
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest2 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) invoke2;
                    getRequestPolicy = this.this$0.getRequestPolicy;
                    com.unity3d.ads.gatewayclient.RequestPolicy invoke5 = getRequestPolicy.invoke();
                    com.unity3d.ads.core.domain.AndroidLoad androidLoad2 = this.this$0;
                    m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    gatewayClient = androidLoad2.gatewayClient;
                    com.unity3d.ads.core.data.model.OperationType operationType2 = com.unity3d.ads.core.data.model.OperationType.LOAD;
                    this.L$0 = diagnosticAdType2;
                    this.L$1 = adObject2;
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.J$0 = m12261markNowz9LOYto;
                    this.label = 2;
                    j = m12261markNowz9LOYto;
                    str2 = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                    request$default = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest2, invoke5, operationType2, this, 1, null);
                    if (request$default != coroutine_suspended) {
                    }
                }
            } else if (i4 == 1) {
                int i5 = this.I$0;
                com.unity3d.ads.core.data.model.AdObject adObject5 = (com.unity3d.ads.core.data.model.AdObject) this.L$2;
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$1;
                kotlin.ResultKt.throwOnFailure(obj);
                i2 = i5;
                adObject2 = adObject5;
                diagnosticAdType2 = diagnosticAdType6;
                invoke2 = obj;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest22 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) invoke2;
                getRequestPolicy = this.this$0.getRequestPolicy;
                com.unity3d.ads.gatewayclient.RequestPolicy invoke52 = getRequestPolicy.invoke();
                com.unity3d.ads.core.domain.AndroidLoad androidLoad22 = this.this$0;
                m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                try {
                    kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                    gatewayClient = androidLoad22.gatewayClient;
                    com.unity3d.ads.core.data.model.OperationType operationType22 = com.unity3d.ads.core.data.model.OperationType.LOAD;
                    this.L$0 = diagnosticAdType2;
                    this.L$1 = adObject2;
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.J$0 = m12261markNowz9LOYto;
                    this.label = 2;
                    j = m12261markNowz9LOYto;
                    str2 = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                    try {
                        request$default = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest22, invoke52, operationType22, this, 1, null);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        i3 = i2;
                        adObject3 = adObject2;
                        diagnosticAdType3 = diagnosticAdType2;
                        j2 = j;
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        com.unity3d.ads.core.data.model.AdObject adObject6 = adObject3;
                        kotlin.time.TimedValue timedValue = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j2), defaultConstructorMarker);
                        com.unity3d.ads.core.domain.AndroidLoad androidLoad3 = this.this$0;
                        java.lang.Object value = ((kotlin.Result) timedValue.component1()).getValue();
                        long duration = timedValue.getDuration();
                        sendDiagnosticEvent = androidLoad3.sendDiagnosticEvent;
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value) ? str2 : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject6, null, 44, null);
                        java.lang.Object value2 = ((kotlin.Result) timedValue.getValue()).getValue();
                        kotlin.ResultKt.throwOnFailure(value2);
                        response = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value2).getPayload().getAdResponse();
                        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7 = diagnosticAdType3;
                        handleGatewayAdResponse = this.this$0.handleGatewayAdResponse;
                        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                        com.google.protobuf.ByteString byteString2 = this.$opportunityId;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response, "response");
                        android.content.Context context = this.$context;
                        java.lang.String str4 = this.$placement;
                        if (i3 == 0) {
                        }
                        this.L$0 = defaultConstructorMarker;
                        this.L$1 = defaultConstructorMarker;
                        this.L$2 = defaultConstructorMarker;
                        this.label = 5;
                        invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions, byteString2, response, context, str4, diagnosticAdType7, r31, this);
                        if (invoke3 == coroutine_suspended) {
                        }
                        loadResult = (com.unity3d.ads.core.data.model.LoadResult) invoke3;
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success) {
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    j = m12261markNowz9LOYto;
                    str2 = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                }
                if (request$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i2;
                adObject3 = adObject2;
                diagnosticAdType3 = diagnosticAdType2;
                j2 = j;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) request$default);
                com.unity3d.ads.core.data.model.AdObject adObject62 = adObject3;
                kotlin.time.TimedValue timedValue2 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j2), defaultConstructorMarker);
                com.unity3d.ads.core.domain.AndroidLoad androidLoad32 = this.this$0;
                java.lang.Object value3 = ((kotlin.Result) timedValue2.component1()).getValue();
                long duration2 = timedValue2.getDuration();
                sendDiagnosticEvent = androidLoad32.sendDiagnosticEvent;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value3) ? str2 : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration2, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject62, null, 44, null);
                java.lang.Object value22 = ((kotlin.Result) timedValue2.getValue()).getValue();
                kotlin.ResultKt.throwOnFailure(value22);
                response = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value22).getPayload().getAdResponse();
            } else if (i4 == 2) {
                j2 = this.J$0;
                i3 = this.I$0;
                adObject3 = (com.unity3d.ads.core.data.model.AdObject) this.L$1;
                diagnosticAdType3 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    request$default = obj;
                    str2 = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                    try {
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) request$default);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        kotlin.Result.Companion companion32 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        com.unity3d.ads.core.data.model.AdObject adObject622 = adObject3;
                        kotlin.time.TimedValue timedValue22 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j2), defaultConstructorMarker);
                        com.unity3d.ads.core.domain.AndroidLoad androidLoad322 = this.this$0;
                        java.lang.Object value32 = ((kotlin.Result) timedValue22.component1()).getValue();
                        long duration22 = timedValue22.getDuration();
                        sendDiagnosticEvent = androidLoad322.sendDiagnosticEvent;
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value32) ? str2 : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration22, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject622, null, 44, null);
                        java.lang.Object value222 = ((kotlin.Result) timedValue22.getValue()).getValue();
                        kotlin.ResultKt.throwOnFailure(value222);
                        response = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value222).getPayload().getAdResponse();
                        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType72 = diagnosticAdType3;
                        handleGatewayAdResponse = this.this$0.handleGatewayAdResponse;
                        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
                        com.google.protobuf.ByteString byteString22 = this.$opportunityId;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response, "response");
                        android.content.Context context2 = this.$context;
                        java.lang.String str42 = this.$placement;
                        if (i3 == 0) {
                        }
                        this.L$0 = defaultConstructorMarker;
                        this.L$1 = defaultConstructorMarker;
                        this.L$2 = defaultConstructorMarker;
                        this.label = 5;
                        invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions2, byteString22, response, context2, str42, diagnosticAdType72, r31, this);
                        if (invoke3 == coroutine_suspended) {
                        }
                        loadResult = (com.unity3d.ads.core.data.model.LoadResult) invoke3;
                        if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success) {
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str2 = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                    kotlin.Result.Companion companion322 = kotlin.Result.INSTANCE;
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                    com.unity3d.ads.core.data.model.AdObject adObject6222 = adObject3;
                    kotlin.time.TimedValue timedValue222 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j2), defaultConstructorMarker);
                    com.unity3d.ads.core.domain.AndroidLoad androidLoad3222 = this.this$0;
                    java.lang.Object value322 = ((kotlin.Result) timedValue222.component1()).getValue();
                    long duration222 = timedValue222.getDuration();
                    sendDiagnosticEvent = androidLoad3222.sendDiagnosticEvent;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value322) ? str2 : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration222, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject6222, null, 44, null);
                    java.lang.Object value2222 = ((kotlin.Result) timedValue222.getValue()).getValue();
                    kotlin.ResultKt.throwOnFailure(value2222);
                    response = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value2222).getPayload().getAdResponse();
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType722 = diagnosticAdType3;
                    handleGatewayAdResponse = this.this$0.handleGatewayAdResponse;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions22 = this.$loadOptions;
                    com.google.protobuf.ByteString byteString222 = this.$opportunityId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response, "response");
                    android.content.Context context22 = this.$context;
                    java.lang.String str422 = this.$placement;
                    if (i3 == 0) {
                    }
                    this.L$0 = defaultConstructorMarker;
                    this.L$1 = defaultConstructorMarker;
                    this.L$2 = defaultConstructorMarker;
                    this.label = 5;
                    invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions22, byteString222, response, context22, str422, diagnosticAdType722, r31, this);
                    if (invoke3 == coroutine_suspended) {
                    }
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) invoke3;
                    if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success) {
                    }
                }
                com.unity3d.ads.core.data.model.AdObject adObject62222 = adObject3;
                kotlin.time.TimedValue timedValue2222 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j2), defaultConstructorMarker);
                com.unity3d.ads.core.domain.AndroidLoad androidLoad32222 = this.this$0;
                java.lang.Object value3222 = ((kotlin.Result) timedValue2222.component1()).getValue();
                long duration2222 = timedValue2222.getDuration();
                sendDiagnosticEvent = androidLoad32222.sendDiagnosticEvent;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, kotlin.Result.m10805isSuccessimpl(value3222) ? str2 : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration2222, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject62222, null, 44, null);
                java.lang.Object value22222 = ((kotlin.Result) timedValue2222.getValue()).getValue();
                kotlin.ResultKt.throwOnFailure(value22222);
                response = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value22222).getPayload().getAdResponse();
            } else if (i4 == 3) {
                int i6 = this.I$0;
                com.unity3d.ads.core.data.model.AdObject adObject7 = (com.unity3d.ads.core.data.model.AdObject) this.L$2;
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$1;
                kotlin.ResultKt.throwOnFailure(obj);
                i = i6;
                adObject = adObject7;
                str = "native_load_config_success_time";
                invoke = obj;
                defaultConstructorMarker = null;
                diagnosticAdType = diagnosticAdType8;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest3 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) invoke;
                getRequestPolicy2 = this.this$0.getRequestPolicy;
                com.unity3d.ads.gatewayclient.RequestPolicy invoke42 = getRequestPolicy2.invoke();
                com.unity3d.ads.core.domain.AndroidLoad androidLoad4 = this.this$0;
                m12261markNowz9LOYto2 = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                try {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    gatewayClient2 = androidLoad4.gatewayClient;
                    com.unity3d.ads.core.data.model.OperationType operationType3 = com.unity3d.ads.core.data.model.OperationType.LOAD_HEADER_BIDDING;
                    this.L$0 = diagnosticAdType;
                    this.L$1 = adObject;
                    this.L$2 = defaultConstructorMarker;
                    this.I$0 = i;
                    this.J$0 = m12261markNowz9LOYto2;
                    this.label = 4;
                    j3 = m12261markNowz9LOYto2;
                    diagnosticAdType4 = diagnosticAdType;
                    try {
                        request$default2 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest3, invoke42, operationType3, this, 1, null);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        i3 = i;
                        adObject4 = adObject;
                        j4 = j3;
                        diagnosticAdType3 = diagnosticAdType4;
                        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                        m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        com.unity3d.ads.core.data.model.AdObject adObject8 = adObject4;
                        kotlin.time.TimedValue timedValue3 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl2), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j4), defaultConstructorMarker);
                        com.unity3d.ads.core.domain.AndroidLoad androidLoad5 = this.this$0;
                        java.lang.Object value4 = ((kotlin.Result) timedValue3.component1()).getValue();
                        long duration3 = timedValue3.getDuration();
                        sendDiagnosticEvent2 = androidLoad5.sendDiagnosticEvent;
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, kotlin.Result.m10805isSuccessimpl(value4) ? str : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration3, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject8, null, 44, null);
                        java.lang.Object value5 = ((kotlin.Result) timedValue3.getValue()).getValue();
                        kotlin.ResultKt.throwOnFailure(value5);
                        universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value5;
                        if (universalResponse.hasError()) {
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    j3 = m12261markNowz9LOYto2;
                    diagnosticAdType4 = diagnosticAdType;
                }
                if (request$default2 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i;
                adObject4 = adObject;
                j4 = j3;
                diagnosticAdType3 = diagnosticAdType4;
                m10798constructorimpl2 = kotlin.Result.m10798constructorimpl((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) request$default2);
                com.unity3d.ads.core.data.model.AdObject adObject82 = adObject4;
                kotlin.time.TimedValue timedValue32 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl2), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j4), defaultConstructorMarker);
                com.unity3d.ads.core.domain.AndroidLoad androidLoad52 = this.this$0;
                java.lang.Object value42 = ((kotlin.Result) timedValue32.component1()).getValue();
                long duration32 = timedValue32.getDuration();
                sendDiagnosticEvent2 = androidLoad52.sendDiagnosticEvent;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, kotlin.Result.m10805isSuccessimpl(value42) ? str : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration32, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject82, null, 44, null);
                java.lang.Object value52 = ((kotlin.Result) timedValue32.getValue()).getValue();
                kotlin.ResultKt.throwOnFailure(value52);
                universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value52;
                if (universalResponse.hasError()) {
                }
            } else {
                if (i4 != 4) {
                    if (i4 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    invoke3 = obj;
                    loadResult = (com.unity3d.ads.core.data.model.LoadResult) invoke3;
                    if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success) {
                        adRepository = this.this$0.adRepository;
                        com.unity3d.ads.core.data.model.AdObject ad = adRepository.getAd(this.$opportunityId);
                        return ad == null ? new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, false, 52, null) : new com.unity3d.ads.core.data.model.LoadResult.Success(ad);
                    }
                    if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                        return loadResult;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                j4 = this.J$0;
                i3 = this.I$0;
                adObject4 = (com.unity3d.ads.core.data.model.AdObject) this.L$1;
                diagnosticAdType3 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    request$default2 = obj;
                    str = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                    try {
                        m10798constructorimpl2 = kotlin.Result.m10798constructorimpl((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) request$default2);
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        kotlin.Result.Companion companion52 = kotlin.Result.INSTANCE;
                        m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        com.unity3d.ads.core.data.model.AdObject adObject822 = adObject4;
                        kotlin.time.TimedValue timedValue322 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl2), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j4), defaultConstructorMarker);
                        com.unity3d.ads.core.domain.AndroidLoad androidLoad522 = this.this$0;
                        java.lang.Object value422 = ((kotlin.Result) timedValue322.component1()).getValue();
                        long duration322 = timedValue322.getDuration();
                        sendDiagnosticEvent2 = androidLoad522.sendDiagnosticEvent;
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, kotlin.Result.m10805isSuccessimpl(value422) ? str : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration322, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject822, null, 44, null);
                        java.lang.Object value522 = ((kotlin.Result) timedValue322.getValue()).getValue();
                        kotlin.ResultKt.throwOnFailure(value522);
                        universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value522;
                        if (universalResponse.hasError()) {
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    str = "native_load_config_success_time";
                    defaultConstructorMarker = null;
                    kotlin.Result.Companion companion522 = kotlin.Result.INSTANCE;
                    m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                    com.unity3d.ads.core.data.model.AdObject adObject8222 = adObject4;
                    kotlin.time.TimedValue timedValue3222 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl2), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j4), defaultConstructorMarker);
                    com.unity3d.ads.core.domain.AndroidLoad androidLoad5222 = this.this$0;
                    java.lang.Object value4222 = ((kotlin.Result) timedValue3222.component1()).getValue();
                    long duration3222 = timedValue3222.getDuration();
                    sendDiagnosticEvent2 = androidLoad5222.sendDiagnosticEvent;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, kotlin.Result.m10805isSuccessimpl(value4222) ? str : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration3222, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject8222, null, 44, null);
                    java.lang.Object value5222 = ((kotlin.Result) timedValue3222.getValue()).getValue();
                    kotlin.ResultKt.throwOnFailure(value5222);
                    universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value5222;
                    if (universalResponse.hasError()) {
                    }
                }
                com.unity3d.ads.core.data.model.AdObject adObject82222 = adObject4;
                kotlin.time.TimedValue timedValue32222 = new kotlin.time.TimedValue(kotlin.Result.m10797boximpl(m10798constructorimpl2), kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j4), defaultConstructorMarker);
                com.unity3d.ads.core.domain.AndroidLoad androidLoad52222 = this.this$0;
                java.lang.Object value42222 = ((kotlin.Result) timedValue32222.component1()).getValue();
                long duration32222 = timedValue32222.getDuration();
                sendDiagnosticEvent2 = androidLoad52222.sendDiagnosticEvent;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, kotlin.Result.m10805isSuccessimpl(value42222) ? str : "native_load_config_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m12182toDoubleimpl(duration32222, kotlin.time.DurationUnit.MILLISECONDS)), null, null, adObject82222, null, 44, null);
                java.lang.Object value52222 = ((kotlin.Result) timedValue32222.getValue()).getValue();
                kotlin.ResultKt.throwOnFailure(value52222);
                universalResponse = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) value52222;
                if (universalResponse.hasError()) {
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                }
                gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup = this.$headerBiddingAdMarkup;
                gatewayprotocol.v1.AdResponseKt.Dsl.Companion companion6 = gatewayprotocol.v1.AdResponseKt.Dsl.INSTANCE;
                gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder newBuilder = gatewayprotocol.v1.AdResponseOuterClass.AdResponse.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                gatewayprotocol.v1.AdResponseKt.Dsl _create = companion6._create(newBuilder);
                com.google.protobuf.ByteString adData = headerBiddingAdMarkup.getAdData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData, "headerBiddingAdMarkup.adData");
                _create.setAdData(adData);
                _create.setAdDataVersion(headerBiddingAdMarkup.getAdDataVersion());
                com.google.protobuf.ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "response.trackingToken");
                _create.setTrackingToken(trackingToken);
                com.google.protobuf.ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(impressionConfiguration, "response.impressionConfiguration");
                _create.setImpressionConfiguration(impressionConfiguration);
                _create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                gatewayprotocol.v1.WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewConfiguration, "response.webviewConfiguration");
                _create.setWebviewConfiguration(webviewConfiguration);
                com.google.protobuf.ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "response.adDataRefreshToken");
                _create.setAdDataRefreshToken(adDataRefreshToken);
                if (adPlayerConfigResponse.hasError()) {
                    gatewayprotocol.v1.ErrorOuterClass.Error error = adPlayerConfigResponse.getError();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error, "response.error");
                    _create.setError(error);
                }
                com.google.protobuf.ByteString adData2 = adPlayerConfigResponse.getAdData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData2, "response.adData");
                if (com.google.protobuf.kotlin.ByteStringsKt.isNotEmpty(adData2)) {
                    com.google.protobuf.ByteString adData3 = adPlayerConfigResponse.getAdData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData3, "response.adData");
                    _create.setAdData(adData3);
                    _create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                }
                response = _create._build();
            }
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7222 = diagnosticAdType3;
            handleGatewayAdResponse = this.this$0.handleGatewayAdResponse;
            com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions222 = this.$loadOptions;
            com.google.protobuf.ByteString byteString2222 = this.$opportunityId;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(response, "response");
            android.content.Context context222 = this.$context;
            java.lang.String str4222 = this.$placement;
            boolean z3 = i3 == 0;
            this.L$0 = defaultConstructorMarker;
            this.L$1 = defaultConstructorMarker;
            this.L$2 = defaultConstructorMarker;
            this.label = 5;
            invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions222, byteString2222, response, context222, str4222, diagnosticAdType7222, z3, this);
            if (invoke3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            loadResult = (com.unity3d.ads.core.data.model.LoadResult) invoke3;
            if (loadResult instanceof com.unity3d.ads.core.data.model.LoadResult.Success) {
            }
        } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e) {
            handleGatewayException = this.this$0.handleGatewayException(e);
            return handleGatewayException;
        }
    }
}
