package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

/* compiled from: LegacyLoadUseCase.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CBO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0086B¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u0004\u0018\u00010-2\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0002J\u0014\u0010.\u001a\u0004\u0018\u00010/2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u00101\u001a\u00020#H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u001e2\u0006\u00101\u001a\u00020#H\u0002J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001eH\u0002J\u0010\u00105\u001a\u00020%2\u0006\u00106\u001a\u000207H\u0002J\u0018\u00108\u001a\u00020%2\u0006\u00104\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:H\u0002J,\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u0002072\u0006\u00104\u001a\u00020\u001eH\u0002J\u0012\u0010B\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "", "load", "Lcom/unity3d/ads/core/domain/Load;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "cleanUpWhenOpportunityExpires", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/Load;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;Lcom/unity3d/ads/core/log/Logger;)V", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", U3.w, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "startTime", "Lkotlin/time/TimeMark;", "placement", "", "opportunity", "Lcom/google/protobuf/ByteString;", "adMarkup", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "invoke", "", "context", "Landroid/content/Context;", "unityLoadListener", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/core/domain/InternalLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHeaderBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "getBannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getOpportunityId", "unityAdsLoadOptions", "getAdMarkup", "loadStart", "opportunityId", "loadSuccess", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "loadFailure", "loadResult", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "getTags", "", "reason", "reasonDebug", "getAdType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getTmpAdObject", "getAdInfoString", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LegacyLoadUseCase {
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private InternalLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private final Logger logger;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private TimeMark startTime;

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, Logger logger) {
        Intrinsics.checkNotNullParameter(load, "load");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        Intrinsics.checkNotNullParameter(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        Intrinsics.checkNotNullParameter(logger, "logger");
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

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, Continuation continuation, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e5 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:11:0x0037, B:12:0x00e1, B:14:0x00e5, B:15:0x00fe, B:17:0x0102, B:21:0x010c, B:23:0x0110, B:24:0x0116, B:25:0x011b), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0102 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:11:0x0037, B:12:0x00e1, B:14:0x00e5, B:15:0x00fe, B:17:0x0102, B:21:0x010c, B:23:0x0110, B:24:0x0116, B:25:0x011b), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:11:0x0037, B:12:0x00e1, B:14:0x00e5, B:15:0x00fe, B:17:0x0102, B:21:0x010c, B:23:0x0110, B:24:0x0116, B:25:0x011b), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, Continuation<? super Unit> continuation) {
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$1;
        int i;
        String str2;
        LoadResult.Failure failure;
        if (continuation instanceof LegacyLoadUseCase$invoke$1) {
            legacyLoadUseCase$invoke$1 = (LegacyLoadUseCase$invoke$1) continuation;
            if ((legacyLoadUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                legacyLoadUseCase$invoke$1.label -= Integer.MIN_VALUE;
                LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$12 = legacyLoadUseCase$invoke$1;
                Object obj = legacyLoadUseCase$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = legacyLoadUseCase$invoke$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String opportunityId = getOpportunityId(unityAdsLoadOptions);
                    if (opportunityId == null) {
                        opportunityId = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(opportunityId, "toString(...)");
                    }
                    String str3 = opportunityId;
                    this.logger.info("Load invoked for placement: " + str + " with instance id: " + str3);
                    long loadTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
                    AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize);
                    this.loadOptions = unityAdsLoadOptions;
                    String adMarkup = getAdMarkup(unityAdsLoadOptions);
                    this.adMarkup = adMarkup;
                    String str4 = adMarkup;
                    this.isHeaderBidding = !(str4 == null || StringsKt.isBlank(str4));
                    this.isBanner = unityBannerSize != null;
                    this.listener = internalLoadListener;
                    this.placement = str;
                    this.startTime = loadStart(str3);
                    try {
                        LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new LegacyLoadUseCase$invoke$loadResult$1(str3, this, context, str, bannerSize, unityAdsLoadOptions, null);
                        legacyLoadUseCase$invoke$12.L$0 = str3;
                        legacyLoadUseCase$invoke$12.label = 1;
                        obj = TimeoutKt.withTimeoutOrNull(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, legacyLoadUseCase$invoke$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str3;
                    } catch (Throwable th) {
                        th = th;
                        str2 = str3;
                        loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), null, 32, null));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) legacyLoadUseCase$invoke$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), null, 32, null));
                        return Unit.INSTANCE;
                    }
                }
                failure = (LoadResult) obj;
                if (failure == null) {
                    failure = new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT, null, "timeout", null, null, 52, null);
                }
                if (!(failure instanceof LoadResult.Success)) {
                    loadSuccess(((LoadResult.Success) failure).getAdObject());
                } else {
                    if (!(failure instanceof LoadResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    loadFailure(str2, (LoadResult.Failure) failure);
                }
                return Unit.INSTANCE;
            }
        }
        legacyLoadUseCase$invoke$1 = new LegacyLoadUseCase$invoke$1(this, continuation);
        LegacyLoadUseCase$invoke$1 legacyLoadUseCase$invoke$122 = legacyLoadUseCase$invoke$1;
        Object obj2 = legacyLoadUseCase$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = legacyLoadUseCase$invoke$122.label;
        if (i != 0) {
        }
        failure = (LoadResult) obj2;
        if (failure == null) {
        }
        if (!(failure instanceof LoadResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String adMarkup) {
        String str = adMarkup;
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(adMarkup, false, 1, null).toByteArray());
            } catch (Exception unused) {
                return null;
            }
        }
        return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (opt = data.opt("adMarkup")) == null) {
            return null;
        }
        return opt.toString();
    }

    private final TimeMark loadStart(String opportunityId) {
        long m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED, (Double) null, getTags$default(this, null, null, 3, null), (Map) null, getTmpAdObject(opportunityId), (Integer) null, (ByteString) null, 106, (Object) null);
        return TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto);
    }

    private final void loadSuccess(final AdObject adObject) {
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        adObject.getState().setValue(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME;
        TimeMark timeMark = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, timeMark != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags$default(this, null, null, 3, null), (Map) null, adObject, (Integer) null, (ByteString) null, 104, (Object) null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit loadSuccess$lambda$2;
                loadSuccess$lambda$2 = LegacyLoadUseCase.loadSuccess$lambda$2(LegacyLoadUseCase.this, adObject);
                return loadSuccess$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSuccess$lambda$2(LegacyLoadUseCase legacyLoadUseCase, AdObject adObject) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            internalLoadListener.onAdLoaded(adObject);
        }
        return Unit.INSTANCE;
    }

    private final void loadFailure(String opportunityId, final LoadResult.Failure loadResult) {
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(opportunityId) + ", error: " + loadResult.getError() + " :: " + loadResult.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME;
        TimeMark timeMark = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, timeMark != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags(loadResult.getReason(), loadResult.getReasonDebug()), (Map) null, getTmpAdObject(opportunityId), (Integer) null, loadResult.getErrorToken(), 40, (Object) null);
        this.safeCallbackInvoke.invoke(new Function0() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit loadFailure$lambda$3;
                loadFailure$lambda$3 = LegacyLoadUseCase.loadFailure$lambda$3(LegacyLoadUseCase.this, loadResult);
                return loadFailure$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadFailure$lambda$3(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            int number = failure.getError().getNumber();
            String message = failure.getMessage();
            if (message == null) {
                message = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
            }
            internalLoadListener.onAdLoadFail(new UnityAdsError(number, message));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final Map<String, String> getTags(String reason, String reasonDebug) {
        Pair[] pairArr = new Pair[3];
        UnityAdsLoadOptions unityAdsLoadOptions = null;
        pairArr[0] = TuplesKt.to("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        pairArr[1] = TuplesKt.to("operation", OperationType.LOAD.toString());
        UnityAdsLoadOptions unityAdsLoadOptions2 = this.loadOptions;
        if (unityAdsLoadOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        } else {
            unityAdsLoadOptions = unityAdsLoadOptions2;
        }
        pairArr[2] = TuplesKt.to("new_api", String.valueOf(unityAdsLoadOptions.loadConfiguration != null));
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        String str = reason;
        if (str != null && str.length() != 0) {
            mutableMapOf.put("reason", reason);
        }
        String str2 = reasonDebug;
        if (str2 != null && str2.length() != 0) {
            mutableMapOf.put("reason_debug", reasonDebug);
        }
        return mutableMapOf;
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdObject getTmpAdObject(String opportunityId) {
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.INSTANCE;
        UUID fromString = UUID.fromString(opportunityId);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        String str = this.placement;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            unityAdsLoadOptions = null;
        }
        return companion.getTmpAdObjectForEventSending(byteString, str, this.isHeaderBidding, unityAdsLoadOptions, getAdType());
    }

    private final String getAdInfoString(String opportunityId) {
        return "for placement " + this.placement + " with instance id " + opportunityId;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize bannerSize) {
        if (bannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.INSTANCE;
        AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        BannerSizeKt.Dsl _create = companion._create(newBuilder);
        _create.setWidth(bannerSize.getWidth());
        _create.setHeight(bannerSize.getHeight());
        return _create._build();
    }
}
