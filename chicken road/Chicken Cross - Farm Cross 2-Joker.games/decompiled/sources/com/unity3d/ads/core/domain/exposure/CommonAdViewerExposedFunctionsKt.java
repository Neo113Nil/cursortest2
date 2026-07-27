package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\b\u0010\u001e\u001a\u00020\u0001H\u0000\u001a\b\u0010\u001f\u001a\u00020\u0001H\u0000\u001a\b\u0010 \u001a\u00020\u0001H\u0000\u001a\b\u0010!\u001a\u00020\u0001H\u0000\u001a\b\u0010\"\u001a\u00020\u0001H\u0000\u001a\b\u0010#\u001a\u00020\u0001H\u0000\u001a\b\u0010$\u001a\u00020\u0001H\u0000\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0010\u0010(\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0010\u0010)\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0010\u0010*\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0010\u0010+\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0010\u0010,\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0010\u0010-\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0018\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u0002032\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u00104\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u00105\u001a\u00020\u00012\u0006\u00105\u001a\u000206H\u0000\u001a\u0018\u00107\u001a\u00020\u00012\u0006\u00107\u001a\u0002082\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u00109\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a \u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0018\u0010=\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020@H\u0000\u001a\u0018\u0010A\u001a\u00020\u00012\u0006\u0010A\u001a\u00020B2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010C\u001a\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020G2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020JH\u0000\u001a\u0010\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020MH\u0000\u001a\u0018\u0010N\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010O\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010P\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0010\u0010Q\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0010\u0010R\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0018\u0010S\u001a\u00020\u00012\u0006\u0010S\u001a\u00020T2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\b\u0010U\u001a\u00020\u0001H\u0000\u001a\u0010\u0010V\u001a\u00020\u00012\u0006\u0010W\u001a\u00020XH\u0000\u001a\u0018\u0010Y\u001a\u00020\u00012\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0000\u001a\u0010\u0010^\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010_\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0018\u0010`\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020\rH\u0000¨\u0006a"}, d2 = {"getAdContext", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "getAndroidAdPlayerContext", "Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "adData", "Lcom/unity3d/ads/core/data/model/AdData;", HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "Lcom/unity3d/ads/core/data/model/ImpressionConfig;", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lcom/unity3d/ads/core/data/model/AdDataRefreshToken;", "isOMActivated", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "getAdContext-yLuu4LI", "(Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/domain/om/IsOMActivated;Lcom/unity3d/ads/core/data/model/AdObject;)Lcom/unity3d/ads/adplayer/ExposedFunction;", "getConnectionType", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getDeviceVolume", "getDeviceMaxVolume", "getScreenHeight", "getScreenWidth", "openUrl", "handleOpenUrl", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "setOrientation", "sendOperativeEvent", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "writeStorage", "readStorage", "deleteStorage", "clearStorage", "getKeysStorage", "getStorage", "setStorage", "getPrivacyFsm", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "setPrivacyFsm", "getPrivacy", "setPrivacy", "getAllowedPii", "setAllowedPii", "getSessionToken", "markCampaignStateShown", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "refreshAdData", ToolBar.REFRESH, "Lcom/unity3d/ads/core/domain/Refresh;", "updateTrackingToken", "sendPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "incrementBannerImpressionCount", "download", "cacheFile", "Lcom/unity3d/ads/core/domain/CacheFile;", "downloadWithProgress", "isFileCached", "getIfFileCache", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "omStartSession", "Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "omFinishSession", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omImpression", "omImpressionOccurred", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "omGetData", "getOmData", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "isAttributionAvailable", "androidAttribution", "Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "attributionRegisterView", "attributionRegisterClick", "hbTokenIncrementWins", "hbTokenIncrementStarts", "hbTokenReset", "loadOfferwallAd", "Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "showOfferwallAd", "isOfferwallAdReady", "getIsOfferwallAdReady", "Lcom/unity3d/ads/core/domain/offerwall/GetIsOfferwallAdReady;", "request", "type", "Lcom/unity3d/services/core/network/model/RequestType;", "executeAdViewerRequest", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "setOpportunityTTL", "updateCampaignState", "getExtra", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt {
    /* renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m7653getAdContextyLuu4LI(AndroidGetAdPlayerContext getAndroidAdPlayerContext, String adData, String impressionConfig, String adDataRefreshToken, IsOMActivated isOMActivated, AdObject adObject) {
        Intrinsics.checkNotNullParameter(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        Intrinsics.checkNotNullParameter(adData, "adData");
        Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        Intrinsics.checkNotNullParameter(isOMActivated, "isOMActivated");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getConnectionType$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return DeviceInfoRepository.this.getDynamicDeviceInfo().getConnectionType();
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceVolume$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return Boxing.boxDouble(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return Boxing.boxDouble(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return Boxing.boxInt(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return Boxing.boxInt(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction openUrl(final AdObject adObject, final HandleOpenUrl handleOpenUrl) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object orNull = ArraysKt.getOrNull(objArr, 1);
                JSONObject jSONObject = orNull instanceof JSONObject ? (JSONObject) orNull : null;
                String optString = jSONObject != null ? jSONObject.optString("packageName") : null;
                String optString2 = jSONObject != null ? jSONObject.optString("action", "android.intent.action.VIEW") : null;
                JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("extras") : null;
                return HandleOpenUrl.this.invoke(adObject, str, optString, optString2, optJSONObject != null ? JSONObjectExtensionsKt.toBuiltInMap(optJSONObject) : null, jSONObject != null ? jSONObject.optBoolean(HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT) : false, continuation);
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$setOrientation$1(adObject);
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$writeStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$readStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$deleteStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$clearStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getKeysStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setStorage$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return orThrow;
            }
        };
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAllowedPii$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return Base64.encodeToString(DeviceInfoRepository.this.getAllowedPii().getValue().toByteArray(), 2);
            }
        };
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                AllowedPiiOuterClass.AllowedPii value;
                final AllowedPiiKt.Dsl _create;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                MutableStateFlow<AllowedPiiOuterClass.AllowedPii> allowedPii = DeviceInfoRepository.this.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.INSTANCE;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = value.toBuilder();
                    Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
                    _create = companion._create(builder);
                    Object opt = jSONObject.opt("idfa");
                    Boolean bool = opt instanceof Boolean ? (Boolean) opt : null;
                    if (bool != null) {
                        new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                            }
                        }.set(Boxing.boxBoolean(bool.booleanValue()));
                    }
                    Object opt2 = jSONObject.opt("idfv");
                    Boolean bool2 = opt2 instanceof Boolean ? (Boolean) opt2 : null;
                    if (bool2 != null) {
                        new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                            }
                        }.set(Boxing.boxBoolean(bool2.booleanValue()));
                    }
                    Object opt3 = jSONObject.opt("appset_id");
                    Boolean bool3 = opt3 instanceof Boolean ? (Boolean) opt3 : null;
                    if (bool3 != null) {
                        new MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj2).booleanValue());
                            }
                        }.set(Boxing.boxBoolean(bool3.booleanValue()));
                    }
                } while (!allowedPii.compareAndSet(value, _create._build()));
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getSessionToken$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return ProtobufExtensionsKt.toBase64$default(SessionRepository.this.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                CampaignRepository.this.setShowTimestamp(adObject.getOpportunityId());
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$refreshAdData$1(refresh, adObject);
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateTrackingToken$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String optString = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                String str = optString;
                if (str != null && str.length() != 0) {
                    AdObject.this.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null));
                }
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        Intrinsics.checkNotNullParameter(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                String obj;
                Object obj2 = objArr[0];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = objArr[1];
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj3;
                Map createMapBuilder = MapsKt.createMapBuilder();
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    createMapBuilder.put(next, jSONObject.getString(next));
                }
                Map build = MapsKt.build(createMapBuilder);
                Object orNull = ArraysKt.getOrNull(objArr, 2);
                SendDiagnosticEvent.DefaultImpls.invoke$default(SendDiagnosticEvent.this, str, (orNull == null || (obj = orNull.toString()) == null) ? null : Boxing.boxDouble(Double.parseDouble(obj)), build, (Map) null, adObject, (Integer) null, (ByteString) null, 104, (Object) null);
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                SessionRepository.this.incrementBannerImpressionCount();
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject, SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$download$1(sessionRepository, cacheFile, adObject);
    }

    public static final ExposedFunction downloadWithProgress(final CacheFile cacheFile, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("url");
                JSONArray jSONArray = (JSONArray) ArraysKt.getOrNull(objArr, 2);
                int optInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                Object orNull = ArraysKt.getOrNull(objArr, 1);
                Number number = orNull instanceof Number ? (Number) orNull : null;
                if (number == null) {
                    throw new IllegalStateException("intervalMs is required".toString());
                }
                int intValue = number.intValue();
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                return TuplesKt.to(MapsKt.mapOf(TuplesKt.to("url", string), TuplesKt.to("downloadId", uuid)), FlowKt.channelFlow(new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(CacheFile.this, string, adObject, jSONArray, optInt, intValue, uuid, null)));
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIfFileCache) {
        Intrinsics.checkNotNullParameter(getIfFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isFileCached$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return GetIsFileCache.this.invoke((String) obj, continuation);
            }
        };
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction omStartSession, AdObject adObject) {
        Intrinsics.checkNotNullParameter(omStartSession, "omStartSession");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omStartSession$1(omStartSession, adObject);
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        Intrinsics.checkNotNullParameter(omFinishSession, "omFinishSession");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omFinishSession$1(omFinishSession, adObject);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        Intrinsics.checkNotNullParameter(omImpressionOccurred, "omImpressionOccurred");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omImpression$1(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        Intrinsics.checkNotNullParameter(getOmData, "getOmData");
        return new CommonAdViewerExposedFunctionsKt$omGetData$1(getOmData);
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isAttributionAvailable$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                return AndroidAttribution.this.isAvailable(continuation);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterView$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, continuation);
            }
        };
    }

    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(androidAttribution, "androidAttribution");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterClick$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, continuation);
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementWins$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                if (AdObject.this.getWebViewLessLoadingRequiredData() == null) {
                    sessionRepository.incrementTokenWinsCount();
                }
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementStarts$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                SessionRepository.this.incrementTokenStartsCount();
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenReset$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                SessionRepository.this.resetTokenCounters();
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        Intrinsics.checkNotNullParameter(loadOfferwallAd, "loadOfferwallAd");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showOfferwallAd$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        Intrinsics.checkNotNullParameter(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isOfferwallAdReady$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String optString = ((JSONObject) obj).optString("placementName");
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = GetIsOfferwallAdReady.this;
                Intrinsics.checkNotNull(optString);
                return getIsOfferwallAdReady2.invoke(optString, continuation);
            }
        };
    }

    public static final ExposedFunction request(RequestType type, ExecuteAdViewerRequest executeAdViewerRequest) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(executeAdViewerRequest, "executeAdViewerRequest");
        return new CommonAdViewerExposedFunctionsKt$request$1(executeAdViewerRequest, type);
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOpportunityTTL$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                MutableStateFlow<Duration> ttl = AdObject.this.getTtl();
                Duration.Companion companion = Duration.INSTANCE;
                ttl.setValue(Duration.m9424boximpl(DurationKt.toDuration(intValue, DurationUnit.SECONDS)));
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateCampaignState$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
            
                if (r0 != null) goto L25;
             */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke2(Object[] objArr, Continuation<? super Unit> continuation) {
                CampaignStateOuterClass.Campaign _build;
                Object firstOrNull = ArraysKt.firstOrNull(objArr);
                JSONObject jSONObject = firstOrNull instanceof JSONObject ? (JSONObject) firstOrNull : null;
                if (jSONObject == null) {
                    throw new IllegalArgumentException("Update campaign state requires a JSONObject".toString());
                }
                String optString = jSONObject.optString("data");
                String str = optString;
                if (str == null || StringsKt.isBlank(str)) {
                    throw new IllegalArgumentException("Update campaign state requires a data string".toString());
                }
                int optInt = jSONObject.optInt("dataVersion");
                if (optInt == 0) {
                    throw new IllegalArgumentException("Update campaign state requires a dataVersion integer".toString());
                }
                ByteString opportunityId = AdObject.this.getOpportunityId();
                String placementId = AdObject.this.getPlacementId();
                ByteString fromBase64$default = ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null);
                if (fromBase64$default.isEmpty()) {
                    throw new IllegalArgumentException("Update campaign state requires a non-empty data byte string".toString());
                }
                CampaignStateOuterClass.Campaign campaign = campaignRepository.getCampaign(opportunityId);
                if (campaign != null) {
                    CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
                    CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
                    Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
                    CampaignKt.Dsl _create = companion._create(builder);
                    _create.setData(fromBase64$default);
                    _create.setDataVersion(optInt);
                    _build = _create._build();
                }
                CampaignKt.Dsl.Companion companion2 = CampaignKt.Dsl.INSTANCE;
                CampaignStateOuterClass.Campaign.Builder newBuilder = CampaignStateOuterClass.Campaign.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                CampaignKt.Dsl _create2 = companion2._create(newBuilder);
                _create2.setData(fromBase64$default);
                _create2.setDataVersion(optInt);
                _create2.setPlacementId(placementId);
                _create2.setImpressionOpportunityId(opportunityId);
                _build = _create2._build();
                campaignRepository.setCampaign(opportunityId, _build);
                return Unit.INSTANCE;
            }
        };
    }

    public static final ExposedFunction getExtra(final SessionRepository sessionRepository, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getExtra$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
                return invoke2(objArr, (Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
                InitializationConfigurationInternal initializationConfiguration;
                Map<String, String> extras;
                LoadConfiguration loadConfiguration;
                Map<String, String> extras2;
                ShowConfiguration showConfiguration;
                Map<String, String> extras3;
                Object obj = objArr[0];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj2;
                int hashCode = str.hashCode();
                if (hashCode == 3237136) {
                    if (!str.equals("init") || (initializationConfiguration = SessionRepository.this.getInitializationConfiguration()) == null || (extras = initializationConfiguration.getExtras()) == null) {
                        return null;
                    }
                    return extras.get(str2);
                }
                if (hashCode == 3327206) {
                    if (!str.equals("load") || (loadConfiguration = adObject.getLoadConfiguration()) == null || (extras2 = loadConfiguration.getExtras()) == null) {
                        return null;
                    }
                    return extras2.get(str2);
                }
                if (hashCode == 3529469 && str.equals("show") && (showConfiguration = adObject.getShowConfiguration()) != null && (extras3 = showConfiguration.getExtras()) != null) {
                    return extras3.get(str2);
                }
                return null;
            }
        };
    }
}
