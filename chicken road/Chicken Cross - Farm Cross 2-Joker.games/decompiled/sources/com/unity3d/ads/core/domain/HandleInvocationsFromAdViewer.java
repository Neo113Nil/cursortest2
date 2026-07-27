package com.unity3d.ads.core.domain;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.network.model.RequestType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: HandleInvocationsFromAdViewer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086\u0002¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "<init>", "()V", "invoke", "", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "adData", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final String KEY_ACTION = "action";
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_REFRESH_INVALIDATION_REASON = "invalidationReason";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final Map<String, Function0<ExposedFunction>> invoke(String adData, String adDataRefreshToken, String impressionConfig, final AdObject adObject) {
        Intrinsics.checkNotNullParameter(adData, "adData");
        Intrinsics.checkNotNullParameter(adDataRefreshToken, "adDataRefreshToken");
        Intrinsics.checkNotNullParameter(impressionConfig, "impressionConfig");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        final String m7597constructorimpl = AdData.m7597constructorimpl(adData);
        final String m7618constructorimpl = ImpressionConfig.m7618constructorimpl(impressionConfig);
        final String m7604constructorimpl = AdDataRefreshToken.m7604constructorimpl(adDataRefreshToken);
        return MapsKt.mapOf(TuplesKt.to(ExposedFunctionLocation.GET_AD_CONTEXT, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$0;
                invoke$lambda$0 = HandleInvocationsFromAdViewer.invoke$lambda$0(HandleInvocationsFromAdViewer.this, m7597constructorimpl, m7618constructorimpl, m7604constructorimpl, adObject);
                return invoke$lambda$0;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_CONNECTION_TYPE, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$1;
                invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$1;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_DEVICE_VOLUME, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$2;
                invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$2;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$3;
                invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$3;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$4;
                invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$4;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_SCREEN_WIDTH, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$5;
                invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$5;
            }
        }), TuplesKt.to(ExposedFunctionLocation.OPEN_URL, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$6;
                invoke$lambda$6 = HandleInvocationsFromAdViewer.invoke$lambda$6(AdObject.this, this);
                return invoke$lambda$6;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_ORIENTATION, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction orientation;
                orientation = CommonAdViewerExposedFunctionsKt.setOrientation(AdObject.this);
                return orientation;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$8;
                invoke$lambda$8 = HandleInvocationsFromAdViewer.invoke$lambda$8(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$8;
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_WRITE, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction writeStorage;
                writeStorage = CommonAdViewerExposedFunctionsKt.writeStorage();
                return writeStorage;
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_READ, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction readStorage;
                readStorage = CommonAdViewerExposedFunctionsKt.readStorage();
                return readStorage;
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_DELETE, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction deleteStorage;
                deleteStorage = CommonAdViewerExposedFunctionsKt.deleteStorage();
                return deleteStorage;
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_CLEAR, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction clearStorage;
                clearStorage = CommonAdViewerExposedFunctionsKt.clearStorage();
                return clearStorage;
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_GET_KEYS, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction keysStorage;
                keysStorage = CommonAdViewerExposedFunctionsKt.getKeysStorage();
                return keysStorage;
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_GET, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction storage;
                storage = CommonAdViewerExposedFunctionsKt.getStorage();
                return storage;
            }
        }), TuplesKt.to(ExposedFunctionLocation.STORAGE_SET, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction storage;
                storage = CommonAdViewerExposedFunctionsKt.setStorage();
                return storage;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_PRIVACY_FSM, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$16;
                invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$16;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_PRIVACY_FSM, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$17;
                invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$17;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_PRIVACY, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$18;
                invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$18;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_PRIVACY, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$19;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_ALLOWED_PII, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$20;
                invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$20;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_ALLOWED_PII, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$21;
                invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$21;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_SESSION_TOKEN, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$22;
                invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$22;
            }
        }), TuplesKt.to(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$23;
                invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$23;
            }
        }), TuplesKt.to(ExposedFunctionLocation.REFRESH_AD_DATA, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$24;
                invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$24;
            }
        }), TuplesKt.to(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$25;
                invoke$lambda$25 = HandleInvocationsFromAdViewer.invoke$lambda$25(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$25;
            }
        }), TuplesKt.to(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction updateTrackingToken;
                updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken(AdObject.this);
                return updateTrackingToken;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$27;
                invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$27;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$28;
                invoke$lambda$28 = HandleInvocationsFromAdViewer.invoke$lambda$28(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$28;
            }
        }), TuplesKt.to(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$29;
                invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$29;
            }
        }), TuplesKt.to(ExposedFunctionLocation.DOWNLOAD, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$30;
                invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$30;
            }
        }), TuplesKt.to(ExposedFunctionLocation.DOWNLOAD_WITH_PROGRESS, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$31;
                invoke$lambda$31 = HandleInvocationsFromAdViewer.invoke$lambda$31(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$31;
            }
        }), TuplesKt.to(ExposedFunctionLocation.IS_FILE_CACHED, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$32;
                invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$32;
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_START_SESSION, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$33;
                invoke$lambda$33 = HandleInvocationsFromAdViewer.invoke$lambda$33(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$33;
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_FINISH_SESSION, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$34;
                invoke$lambda$34 = HandleInvocationsFromAdViewer.invoke$lambda$34(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$34;
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_IMPRESSION, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$35;
                invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$35;
            }
        }), TuplesKt.to(ExposedFunctionLocation.OM_GET_DATA, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$36;
                invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$36;
            }
        }), TuplesKt.to(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$37;
                invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$37;
            }
        }), TuplesKt.to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$38;
                invoke$lambda$38 = HandleInvocationsFromAdViewer.invoke$lambda$38(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$38;
            }
        }), TuplesKt.to(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$39;
                invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$39;
            }
        }), TuplesKt.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$40;
                invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$40;
            }
        }), TuplesKt.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$41;
                invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$41;
            }
        }), TuplesKt.to(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$42;
                invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$42;
            }
        }), TuplesKt.to(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$43;
                invoke$lambda$43 = HandleInvocationsFromAdViewer.invoke$lambda$43(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$43;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction showOfferwallAd;
                showOfferwallAd = CommonAdViewerExposedFunctionsKt.showOfferwallAd();
                return showOfferwallAd;
            }
        }), TuplesKt.to(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$45;
                invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$45;
            }
        }), TuplesKt.to(ExposedFunctionLocation.REQUEST_GET, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$46;
                invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$46;
            }
        }), TuplesKt.to(ExposedFunctionLocation.REQUEST_POST, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$47;
                invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$47;
            }
        }), TuplesKt.to(ExposedFunctionLocation.REQUEST_HEAD, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$48;
                invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(HandleInvocationsFromAdViewer.this);
                return invoke$lambda$48;
            }
        }), TuplesKt.to(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction opportunityTTL;
                opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL(AdObject.this);
                return opportunityTTL;
            }
        }), TuplesKt.to(ExposedFunctionLocation.GET_EXTRA, new Function0() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$50;
                invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(HandleInvocationsFromAdViewer.this, adObject);
                return invoke$lambda$50;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$0(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = handleInvocationsFromAdViewer;
        return CommonAdViewerExposedFunctionsKt.m7653getAdContextyLuu4LI((AndroidGetAdPlayerContext) handleInvocationsFromAdViewer2.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidGetAdPlayerContext.class)), str, str2, str3, (IsOMActivated) handleInvocationsFromAdViewer2.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(IsOMActivated.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$2(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$3(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$4(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$5(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$6(AdObject adObject, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(HandleOpenUrl.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$8(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$16(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$17(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$18(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$19(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$20(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$21(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$22(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$23(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(CampaignRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$24(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(Refresh.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$25(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(CampaignRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$27(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$28(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$29(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$30(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = handleInvocationsFromAdViewer;
        return CommonAdViewerExposedFunctionsKt.download((CacheFile) handleInvocationsFromAdViewer2.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(CacheFile.class)), adObject, (SessionRepository) handleInvocationsFromAdViewer2.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$31(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.downloadWithProgress((CacheFile) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(CacheFile.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$32(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetIsFileCache.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$33(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidOmInteraction.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$34(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(OmFinishSession.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$35(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(OmImpressionOccurred.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$36(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetOmData.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$37(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidAttribution.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$38(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidAttribution.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$39(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(AndroidAttribution.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$40(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$41(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$42(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$43(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(LoadOfferwallAd.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$45(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(GetIsOfferwallAdReady.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$46(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$47(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$48(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$50(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.getExtra((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(SessionRepository.class)), adObject);
    }
}
