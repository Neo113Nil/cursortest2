package com.unity3d.ads.core.domain;

/* compiled from: LegacyShowUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J5\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190'2\u0006\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0019H\u0002J-\u0010/\u001a\u00020\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"H\u0086Bø\u0001\u0000¢\u0006\u0002\u00100J)\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105J \u00106\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J@\u00107\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00108\u001a\u0002092\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0019H\u0002Jh\u0010<\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0?\u0012\u0006\u0012\u0004\u0018\u00010\u00010=2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0002\u0010@J\u0010\u0010A\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0019H\u0002J \u0010B\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "", com.ironsource.C3232q2.v, "Lcom/unity3d/ads/core/domain/Show;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/domain/Show;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "hasStarted", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "placement", "", "timeoutCancellationRequested", "unityAdsShowOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "bannerLeftApplication", "", "startTime", "Lkotlin/time/TimeMark;", "listeners", "Lcom/unity3d/ads/core/data/model/Listeners;", "cancelTimeout", "getAdInfoString", "getOpportunityId", "getTags", "", "diagnosticReason", "code", "", "debugMessage", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/Map;", "getTmpAdObject", "opportunityId", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOperativeError", "operativeEvent", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "operativeMessage", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showClicked", "showCompleted", "status", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "reason", "reasonDebug", "showError", "Lkotlin/Function6;", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/time/TimeMark;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;)Lkotlin/jvm/functions/Function6;", "showStart", "showStarted", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LegacyShowUseCase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.core.domain.LegacyShowUseCase.Companion INSTANCE = new com.unity3d.ads.core.domain.LegacyShowUseCase.Companion(null);
    public static final java.lang.String KEY_OBJECT_ID = "objectId";
    public static final java.lang.String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final java.lang.String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final java.lang.String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final java.lang.String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final java.lang.String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final java.lang.String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final java.lang.String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final java.lang.String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final java.lang.String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private com.unity3d.ads.core.data.model.AdObject adObject;
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
    private final com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> hasStarted;
    private final com.unity3d.ads.core.log.Logger logger;
    private java.lang.String placement;
    private final com.unity3d.ads.core.domain.SafeCallbackInvoke safeCallbackInvoke;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.domain.Show show;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> timeoutCancellationRequested;
    private com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions;

    public LegacyShowUseCase(com.unity3d.ads.core.domain.Show show, com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, com.unity3d.ads.core.domain.GetInitializationState getInitializationState, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.SafeCallbackInvoke safeCallbackInvoke, com.unity3d.ads.core.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(show, "show");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.hasStarted = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.timeoutCancellationRequested = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners listeners, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$1;
        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$12;
        java.lang.Object m10798constructorimpl;
        com.unity3d.ads.core.data.model.Listeners listeners2;
        java.lang.String str2;
        int i;
        kotlinx.coroutines.CoroutineScope scope;
        com.google.protobuf.ByteString byteString;
        com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase;
        org.json.JSONObject data;
        java.lang.Object opt;
        java.util.UUID uuid;
        if (continuation instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1) {
            legacyShowUseCase$invoke$1 = (com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1) continuation;
            if ((legacyShowUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$1.label -= Integer.MIN_VALUE;
                legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
                java.lang.Object obj = legacyShowUseCase$invoke$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (legacyShowUseCase$invoke$12.label) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                        this.placement = str;
                        this.unityAdsShowOptions = unityAdsShowOptions;
                        this.logger.debug("Show for placement " + str + " called");
                        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                        kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase2 = this;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(unityAdsShowOptions != null ? getOpportunityId(unityAdsShowOptions) : null);
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
                            booleanRef.element = true;
                            m10798constructorimpl = java.util.UUID.randomUUID().toString();
                        }
                        java.lang.String str3 = (java.lang.String) m10798constructorimpl;
                        if (str3 == null) {
                            if (str != null) {
                                com.google.protobuf.ByteString pollOpportunityIdForPlacement = this.adRepository.pollOpportunityIdForPlacement(str);
                                str3 = (pollOpportunityIdForPlacement == null || (uuid = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(pollOpportunityIdForPlacement)) == null) ? null : uuid.toString();
                                if (str3 == null) {
                                    booleanRef2.element = true;
                                    str3 = java.util.UUID.randomUUID().toString();
                                }
                            } else {
                                str3 = java.util.UUID.randomUUID().toString();
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "if (placement != null) {….toString()\n            }");
                        }
                        showStart(str3);
                        kotlin.time.TimeSource.Monotonic.ValueTimeMark m12262boximpl = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(m12261markNowz9LOYto);
                        if (str == null) {
                            str2 = "";
                            listeners2 = listeners;
                        } else {
                            listeners2 = listeners;
                            str2 = str;
                        }
                        kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> showError = showError(m12262boximpl, str2, str3, listeners2);
                        if (com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null) != com.unity3d.ads.core.data.model.InitializationState.INITIALIZED) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                            legacyShowUseCase$invoke$12.label = 1;
                            if (showError.invoke("not_initialized", unityAdsShowError, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (str == null) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError2 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            legacyShowUseCase$invoke$12.label = 2;
                            if (showError.invoke("placement_null", unityAdsShowError2, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (booleanRef.element) {
                            java.lang.String obj2 = (unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null || (opt = data.opt("objectId")) == null) ? null : opt.toString();
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError3 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            legacyShowUseCase$invoke$12.label = 3;
                            if (showError.invoke("no_opportunity_id", unityAdsShowError3, MESSAGE_OPPORTUNITY_ID, null, obj2, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (booleanRef2.element) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError4 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            java.lang.String format = java.lang.String.format(MESSAGE_PLACEMENT_NOT_LOADED, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                            legacyShowUseCase$invoke$12.label = 4;
                            if (showError.invoke("placement_not_loaded", unityAdsShowError4, format, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        java.util.UUID fromString = java.util.UUID.fromString(str3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
                        com.google.protobuf.ByteString byteString2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString);
                        com.unity3d.ads.core.data.model.AdObject ad = this.adRepository.getAd(byteString2);
                        this.adObject = ad;
                        if (ad == null) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError5 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            java.lang.String str4 = MESSAGE_NO_AD_OBJECT + str3;
                            legacyShowUseCase$invoke$12.label = 5;
                            if (showError.invoke("ad_object_not_found", unityAdsShowError5, str4, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (ad.getState().getValue() == com.unity3d.ads.core.data.model.AdObjectState.EXPIRED) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError6 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            legacyShowUseCase$invoke$12.L$0 = this;
                            legacyShowUseCase$invoke$12.L$1 = byteString2;
                            legacyShowUseCase$invoke$12.label = 6;
                            if (showError.invoke("ad_object_expired", unityAdsShowError6, MESSAGE_AD_OBJECT_EXPIRED, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteString = byteString2;
                            legacyShowUseCase = this;
                            legacyShowUseCase.adRepository.removeAd(byteString);
                            return kotlin.Unit.INSTANCE;
                        }
                        com.unity3d.ads.adplayer.AdPlayer adPlayer = ad.getAdPlayer();
                        if (adPlayer != null && (scope = adPlayer.getScope()) != null && !kotlinx.coroutines.CoroutineScopeKt.isActive(scope)) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            legacyShowUseCase$invoke$12.label = 7;
                            if (showError.invoke("ad_player_scope_not_active", unityAdsShowError7, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        boolean z = ad.getAdPlayer() instanceof com.unity3d.ads.adplayer.EmbeddableAdPlayer;
                        if (!z && isFullscreenAdShowing) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError8 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING;
                            legacyShowUseCase$invoke$12.label = 8;
                            if (showError.invoke("already_showing", unityAdsShowError8, MESSAGE_ALREADY_SHOWING, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !kotlin.jvm.internal.Intrinsics.areEqual(ad.getPlacementId(), str)) {
                            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError9 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                            legacyShowUseCase$invoke$12.label = 9;
                            if (showError.invoke("placement_validation", unityAdsShowError9, MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        long showTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                        if (!z) {
                            isFullscreenAdShowing = true;
                        }
                        kotlinx.coroutines.flow.Flow m12340catch = kotlinx.coroutines.flow.FlowKt.m12340catch(com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter$default(this.show.invoke(ad, unityAdsShowOptions), showTimeoutMs, false, new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2(this, z, ad, true, showError, str, null), 2, null), new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3(showError, z, null));
                        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4 legacyShowUseCase$invoke$4 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4(this, m12261markNowz9LOYto, str, listeners, ad, showError);
                        legacyShowUseCase$invoke$12.I$0 = z ? 1 : 0;
                        legacyShowUseCase$invoke$12.label = 10;
                        if (m12340catch.collect(legacyShowUseCase$invoke$4, legacyShowUseCase$invoke$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = z ? 1 : 0;
                        if (i == 0) {
                            isFullscreenAdShowing = false;
                        }
                        return kotlin.Unit.INSTANCE;
                    case 1:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 2:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 3:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 4:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 5:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 6:
                        byteString = (com.google.protobuf.ByteString) legacyShowUseCase$invoke$12.L$1;
                        legacyShowUseCase = (com.unity3d.ads.core.domain.LegacyShowUseCase) legacyShowUseCase$invoke$12.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        legacyShowUseCase.adRepository.removeAd(byteString);
                        return kotlin.Unit.INSTANCE;
                    case 7:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 8:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 9:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 10:
                        i = legacyShowUseCase$invoke$12.I$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (i == 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        legacyShowUseCase$invoke$1 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1(this, continuation);
        legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
        java.lang.Object obj3 = legacyShowUseCase$invoke$12.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (legacyShowUseCase$invoke$12.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(kotlin.time.TimeMark startTime, final java.lang.String placement, final com.unity3d.ads.core.data.model.Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$bannerLeftApplication$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.unity3d.ads.core.data.model.Listeners.this.onLeftApplication(placement);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(kotlin.time.TimeMark startTime) {
        this.timeoutCancellationRequested.setValue(true);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(kotlin.time.TimeMark startTime, final java.lang.String placement, final com.unity3d.ads.core.data.model.Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        this.hasStarted.setValue(true);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.unity3d.ads.core.data.model.Listeners.this.onStart(placement);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(kotlin.time.TimeMark startTime, final java.lang.String placement, final com.unity3d.ads.core.data.model.Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.unity3d.ads.core.data.model.Listeners.this.onClick(placement);
            }
        });
    }

    private final java.lang.String getOpportunityId(com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions) throws java.lang.IllegalArgumentException {
        java.lang.Object opt;
        java.lang.String obj;
        org.json.JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null || (obj = opt.toString()) == null) {
            return null;
        }
        return java.util.UUID.fromString(obj).toString();
    }

    private final void showStart(java.lang.String opportunityId) {
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(opportunityId), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(kotlin.time.TimeMark startTime, final java.lang.String placement, final com.unity3d.ads.adplayer.model.ShowStatus status, final com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String reason, java.lang.String reasonDebug) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        if (reason != null) {
        }
        if (reasonDebug != null) {
            createMapBuilder.put("reason_debug", reasonDebug);
        }
        java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), build, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
                com.unity3d.ads.core.data.model.Listeners listeners2 = com.unity3d.ads.core.data.model.Listeners.this;
                java.lang.String str = placement;
                com.unity3d.ads.adplayer.model.ShowStatus showStatus = status;
                sessionRepository = this.sessionRepository;
                gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
                listeners2.onComplete(str, com.unity3d.ads.core.extensions.ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
            }
        });
    }

    private final kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> showError(kotlin.time.TimeMark startTime, java.lang.String placement, java.lang.String opportunityId, com.unity3d.ads.core.data.model.Listeners listeners) {
        return new com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1(this, opportunityId, startTime, listeners, placement, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map<java.lang.String, java.lang.String> getTags(java.lang.String diagnosticReason, java.lang.Integer code, java.lang.String debugMessage) {
        java.util.Map<java.lang.String, java.lang.String> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.SHOW.toString()), kotlin.TuplesKt.to("reason", diagnosticReason));
        if (code != null) {
            mutableMapOf.put("reason_code", java.lang.String.valueOf(code.intValue()));
        }
        if (debugMessage != null) {
            mutableMapOf.put("reason_debug", debugMessage);
        }
        return mutableMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.unity3d.ads.core.data.model.AdObject getTmpAdObject(java.lang.String opportunityId) {
        java.util.UUID fromString = java.util.UUID.fromString(opportunityId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
        com.google.protobuf.ByteString byteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString);
        com.unity3d.ads.core.data.model.AdObject ad = this.adRepository.getAd(byteString);
        if (ad != null) {
            return ad;
        }
        java.lang.String str = this.placement;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new com.unity3d.ads.core.data.model.AdObject(byteString, str2, EMPTY, false, null, null, null, false, null, null, null, new com.unity3d.ads.UnityAdsLoadOptions(), false, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getAdInfoString() {
        com.google.protobuf.ByteString opportunityId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("for placement ");
        com.unity3d.ads.core.data.model.AdObject adObject = this.adObject;
        java.util.UUID uuid = null;
        sb.append(adObject != null ? adObject.getPlacementId() : null);
        sb.append(" with instance id ");
        com.unity3d.ads.core.data.model.AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb.append(uuid);
        return sb.toString();
    }

    /* compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase$Companion;", "", "()V", "KEY_OBJECT_ID", "", "MESSAGE_AD_OBJECT_EXPIRED", "MESSAGE_AD_PLAYER_UNAVAILABLE", "MESSAGE_ALREADY_SHOWING", "MESSAGE_NO_AD_OBJECT", "MESSAGE_OPPORTUNITY_ID", "MESSAGE_OPT_TIMEOUT", "MESSAGE_PLACEMENT_NOT_LOADED", "MESSAGE_TIMEOUT", "MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING", "isFullscreenAdShowing", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object sendOperativeError(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, java.lang.String str, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
        com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        com.google.protobuf.ByteString byteString = _build.toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "errorData.toByteString()");
        java.lang.Object invoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }
}
