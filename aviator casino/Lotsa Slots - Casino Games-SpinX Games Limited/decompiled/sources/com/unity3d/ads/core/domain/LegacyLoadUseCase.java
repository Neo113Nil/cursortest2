package com.unity3d.ads.core.domain;

/* compiled from: LegacyLoadUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CBM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0012\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010&\u001a\u00020\u001dH\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0014\u0010-\u001a\u0004\u0018\u00010.2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010\u00162\u0006\u0010&\u001a\u00020\u001dH\u0002J,\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u00104\u001a\u0002052\u0006\u0010$\u001a\u00020\u00162\b\b\u0002\u00106\u001a\u00020\u0018H\u0002JA\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010;\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010<J\u0018\u0010=\u001a\u0002082\u0006\u0010$\u001a\u00020\u00162\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0016H\u0002J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u000205H\u0002R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "", "load", "Lcom/unity3d/ads/core/domain/Load;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "cleanUpWhenOpportunityExpires", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/domain/Load;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;Lcom/unity3d/ads/core/log/Logger;)V", "adMarkup", "", com.ironsource.X3.w, "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsLoadListener;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "opportunity", "Lcom/google/protobuf/ByteString;", "placement", "startTime", "Lkotlin/time/TimeMark;", "getAdInfoString", "opportunityId", "getAdMarkup", "unityAdsLoadOptions", "getAdType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getBannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", "getHeaderBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "getOpportunityId", "getTags", "", "reason", "reasonDebug", "getTmpAdObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "isScarAd", "invoke", "", "context", "Landroid/content/Context;", "unityLoadListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/IUnityAdsLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFailure", "loadResult", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "loadStart", "loadSuccess", "adObject", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LegacyLoadUseCase {
    public static final java.lang.String KEY_AD_MARKUP = "adMarkup";
    public static final java.lang.String KEY_OBJECT_ID = "objectId";
    private java.lang.String adMarkup;
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization;
    private final com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private com.unity3d.ads.IUnityAdsLoadListener listener;
    private final com.unity3d.ads.core.domain.Load load;
    private com.unity3d.ads.UnityAdsLoadOptions loadOptions;
    private final com.unity3d.ads.core.log.Logger logger;
    private com.google.protobuf.ByteString opportunity;
    private java.lang.String placement;
    private final com.unity3d.ads.core.domain.SafeCallbackInvoke safeCallbackInvoke;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private kotlin.time.TimeMark startTime;

    public LegacyLoadUseCase(com.unity3d.ads.core.domain.Load load, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.GetInitializationState getInitializationState, com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.domain.SafeCallbackInvoke safeCallbackInvoke, com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, com.unity3d.ads.core.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(load, "load");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
        this.logger = logger;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, android.content.Context context, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:11:0x0041, B:12:0x00f0, B:14:0x00f4, B:15:0x0116, B:17:0x011a, B:21:0x0124, B:23:0x0128), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011a A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:11:0x0041, B:12:0x00f0, B:14:0x00f4, B:15:0x0116, B:17:0x011a, B:21:0x0124, B:23:0x0128), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:11:0x0041, B:12:0x00f0, B:14:0x00f4, B:15:0x0116, B:17:0x011a, B:21:0x0124, B:23:0x0128), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(android.content.Context context, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$1;
        int i;
        com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase;
        java.lang.String str2;
        com.unity3d.ads.core.data.model.LoadResult.Failure failure;
        java.lang.String str3 = str;
        if (continuation instanceof com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1) {
            legacyLoadUseCase$invoke$1 = (com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1) continuation;
            if ((legacyLoadUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                legacyLoadUseCase$invoke$1.label -= Integer.MIN_VALUE;
                com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$12 = legacyLoadUseCase$invoke$1;
                java.lang.Object obj = legacyLoadUseCase$invoke$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = legacyLoadUseCase$invoke$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String opportunityId = getOpportunityId(unityAdsLoadOptions);
                    if (opportunityId == null) {
                        opportunityId = java.util.UUID.randomUUID().toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(opportunityId, "randomUUID().toString()");
                    }
                    java.lang.String str4 = opportunityId;
                    this.logger.info("Load invoked for placement: " + str3 + " with instance id: " + str4);
                    long loadTimeoutMs = (long) this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
                    gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize);
                    this.loadOptions = unityAdsLoadOptions;
                    java.lang.String adMarkup = getAdMarkup(unityAdsLoadOptions);
                    this.adMarkup = adMarkup;
                    java.lang.String str5 = adMarkup;
                    this.isHeaderBidding = !(str5 == null || kotlin.text.StringsKt.isBlank(str5));
                    this.isBanner = unityBannerSize != null;
                    this.listener = iUnityAdsLoadListener;
                    this.placement = str3;
                    this.startTime = loadStart(str4);
                    try {
                        com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1(str, str4, this, context, bannerSize, unityAdsLoadOptions, null);
                        legacyLoadUseCase$invoke$12.L$0 = this;
                        legacyLoadUseCase$invoke$12.L$1 = str3;
                        legacyLoadUseCase$invoke$12.L$2 = str4;
                        legacyLoadUseCase$invoke$12.label = 1;
                        obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, legacyLoadUseCase$invoke$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        legacyLoadUseCase = this;
                        str2 = str4;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        legacyLoadUseCase = this;
                        str2 = str4;
                        legacyLoadUseCase.loadFailure(str2, new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), false, 32, null));
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) legacyLoadUseCase$invoke$12.L$2;
                    str3 = (java.lang.String) legacyLoadUseCase$invoke$12.L$1;
                    legacyLoadUseCase = (com.unity3d.ads.core.domain.LegacyLoadUseCase) legacyLoadUseCase$invoke$12.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        legacyLoadUseCase.loadFailure(str2, new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), false, 32, null));
                        return kotlin.Unit.INSTANCE;
                    }
                }
                failure = (com.unity3d.ads.core.data.model.LoadResult) obj;
                if (failure == null) {
                    failure = new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT, com.unity3d.ads.core.data.model.LoadResult.MSG_TIMEOUT + str3, null, "timeout", null, false, 52, null);
                }
                if (!(failure instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
                    legacyLoadUseCase.loadSuccess(((com.unity3d.ads.core.data.model.LoadResult.Success) failure).getAdObject());
                } else if (failure instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                    legacyLoadUseCase.loadFailure(str2, (com.unity3d.ads.core.data.model.LoadResult.Failure) failure);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        legacyLoadUseCase$invoke$1 = new com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1(this, continuation);
        com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$122 = legacyLoadUseCase$invoke$1;
        java.lang.Object obj2 = legacyLoadUseCase$invoke$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = legacyLoadUseCase$invoke$122.label;
        if (i != 0) {
        }
        failure = (com.unity3d.ads.core.data.model.LoadResult) obj2;
        if (failure == null) {
        }
        if (!(failure instanceof com.unity3d.ads.core.data.model.LoadResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(java.lang.String adMarkup) {
        java.lang.String str = adMarkup;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            try {
                return gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(adMarkup, false, 1, null).toByteArray());
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
    }

    private final java.lang.String getOpportunityId(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        java.lang.Object opt;
        org.json.JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final java.lang.String getAdMarkup(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        java.lang.Object opt;
        org.json.JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("adMarkup")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final kotlin.time.TimeMark loadStart(java.lang.String opportunityId) {
        long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, opportunityId, false, 2, null), null, 42, null);
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(m12261markNowz9LOYto);
    }

    private final void loadSuccess(com.unity3d.ads.core.data.model.AdObject adObject) {
        this.logger.info("Successfully loaded ad " + getAdInfoString(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        adObject.getState().setValue(com.unity3d.ads.core.data.model.AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        kotlin.time.TimeMark timeMark = this.startTime;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", timeMark != null ? java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags$default(this, null, null, 3, null), null, adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$1
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
                com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener;
                java.lang.String str;
                iUnityAdsLoadListener = com.unity3d.ads.core.domain.LegacyLoadUseCase.this.listener;
                if (iUnityAdsLoadListener != null) {
                    str = com.unity3d.ads.core.domain.LegacyLoadUseCase.this.placement;
                    iUnityAdsLoadListener.onUnityAdsAdLoaded(str);
                }
            }
        });
    }

    private final void loadFailure(java.lang.String opportunityId, final com.unity3d.ads.core.data.model.LoadResult.Failure loadResult) {
        com.unity3d.ads.core.log.Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(opportunityId) + ", error: " + loadResult.getError() + " :: " + loadResult.getMessage(), null, 2, null);
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        kotlin.time.TimeMark timeMark = this.startTime;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", timeMark != null ? java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags(loadResult.getReason(), loadResult.getReasonDebug()), null, getTmpAdObject(opportunityId, loadResult.isScarAd()), null, 40, null);
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$1
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
                com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener;
                java.lang.String str;
                iUnityAdsLoadListener = com.unity3d.ads.core.domain.LegacyLoadUseCase.this.listener;
                if (iUnityAdsLoadListener != null) {
                    str = com.unity3d.ads.core.domain.LegacyLoadUseCase.this.placement;
                    iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, loadResult.getError(), loadResult.getMessage());
                }
            }
        });
    }

    static /* synthetic */ java.util.Map getTags$default(com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final java.util.Map<java.lang.String, java.lang.String> getTags(java.lang.String reason, java.lang.String reasonDebug) {
        java.util.Map<java.lang.String, java.lang.String> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("state", com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.LOAD.toString()));
        java.lang.String str = reason;
        if (str != null && str.length() != 0) {
            mutableMapOf.put("reason", reason);
        }
        java.lang.String str2 = reasonDebug;
        if (str2 != null && str2.length() != 0) {
            mutableMapOf.put("reason_debug", reasonDebug);
        }
        return mutableMapOf;
    }

    private final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    static /* synthetic */ com.unity3d.ads.core.data.model.AdObject getTmpAdObject$default(com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return legacyLoadUseCase.getTmpAdObject(str, z);
    }

    private final com.unity3d.ads.core.data.model.AdObject getTmpAdObject(java.lang.String opportunityId, boolean isScarAd) {
        java.util.UUID fromString = java.util.UUID.fromString(opportunityId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(opportunityId)");
        com.google.protobuf.ByteString byteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString);
        java.lang.String str = this.placement;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            unityAdsLoadOptions = null;
        }
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
        boolean z = this.isHeaderBidding;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new com.unity3d.ads.core.data.model.AdObject(byteString, str2, EMPTY, isScarAd, null, null, null, false, null, null, null, unityAdsLoadOptions2, z, adType, null, null, 50672, null);
    }

    private final java.lang.String getAdInfoString(java.lang.String opportunityId) {
        return "for placement " + this.placement + " with instance id " + opportunityId;
    }

    private final gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSize(com.unity3d.services.banners.UnityBannerSize bannerSize) {
        if (bannerSize == null) {
            return null;
        }
        gatewayprotocol.v1.BannerSizeKt.Dsl.Companion companion = gatewayprotocol.v1.BannerSizeKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder newBuilder = gatewayprotocol.v1.AdRequestOuterClass.BannerSize.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.BannerSizeKt.Dsl _create = companion._create(newBuilder);
        _create.setWidth(bannerSize.getWidth());
        _create.setHeight(bannerSize.getHeight());
        return _create._build();
    }
}
