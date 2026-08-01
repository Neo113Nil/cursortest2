package com.inmobi.media.core.config.models;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.compose.material.MenuKt;
import androidx.media3.common.MimeTypes;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.adjust.sdk.Constants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.inmobi.ads.core.BannerDetachConfig;
import com.inmobi.media.A;
import com.inmobi.media.AbstractC3727g4;
import com.inmobi.media.AbstractC3787i7;
import com.inmobi.media.Hj;
import com.inmobi.media.P0;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.C4561o2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u0000 ·\u00012\u00020\u0001:J¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\tJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010)R\"\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010)R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010)R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010=R\"\u0010>\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001f\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010=R\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010&R\"\u0010B\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010&\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010)R$\u0010F\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010&\u001a\u0004\bG\u0010\tR\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010s\u001a\u00020r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010z\u001a\u00020y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R0\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¥\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010!R,\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018F@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u001d\u0010®\u0001\u001a\u00030\u00ad\u00018\u0006¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001d\u0010³\u0001\u001a\u00030²\u00018\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001¨\u0006Ý\u0001"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig;", "Lcom/inmobi/media/core/config/models/Config;", "<init>", "()V", "", "getType", "()Ljava/lang/String;", "", "isValid", "()Z", "", "getMaxPoolSize", "()I", "adType", "Lcom/inmobi/media/core/config/models/AdConfig$CacheConfig;", "getCacheConfig", "(Ljava/lang/String;)Lcom/inmobi/media/core/config/models/AdConfig$CacheConfig;", "Lcom/inmobi/media/core/config/models/AdConfig$ImaiConfig;", "getImaiConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$ImaiConfig;", "Lcom/inmobi/media/core/config/models/AdConfig$MraidConfig;", "getMraidConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$MraidConfig;", "isCCTEnabled", "Lcom/inmobi/media/core/config/models/AdConfig$Mraid3Config;", "getMraid3Config", "()Lcom/inmobi/media/core/config/models/AdConfig$Mraid3Config;", "Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config;", "getPingsV2Config", "()Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config;", "maxPoolSize", "I", "url", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "applyGzipReq", "Z", "getApplyGzipReq", "setApplyGzipReq", "(Z)V", "skipNetCheckHB", "getSkipNetCheckHB", "setSkipNetCheckHB", "enableCookiesOnInAppBrowser", "getEnableCookiesOnInAppBrowser", "setEnableCookiesOnInAppBrowser", "skipNetworkValidationFeatureEnabled", "getSkipNetworkValidationFeatureEnabled", "setSkipNetworkValidationFeatureEnabled", "Lcom/inmobi/media/core/config/models/AdConfig$CustomNetworkValidation;", "customNwValidation", "Lcom/inmobi/media/core/config/models/AdConfig$CustomNetworkValidation;", "getCustomNwValidation", "()Lcom/inmobi/media/core/config/models/AdConfig$CustomNetworkValidation;", "setCustomNwValidation", "(Lcom/inmobi/media/core/config/models/AdConfig$CustomNetworkValidation;)V", "minimumRefreshInterval", "getMinimumRefreshInterval", "setMinimumRefreshInterval", "(I)V", "defaultRefreshInterval", "getDefaultRefreshInterval", "setDefaultRefreshInterval", "cctEnabled", "partialTabsEnabled", "getPartialTabsEnabled", "setPartialTabsEnabled", "value", "watermarkEnabled", "getWatermarkEnabled", "", "cache", "Ljava/util/Map;", "imai", "Lcom/inmobi/media/core/config/models/AdConfig$ImaiConfig;", "Lcom/inmobi/media/core/config/models/AdConfig$RenderingConfig;", "rendering", "Lcom/inmobi/media/core/config/models/AdConfig$RenderingConfig;", "getRendering", "()Lcom/inmobi/media/core/config/models/AdConfig$RenderingConfig;", "setRendering", "(Lcom/inmobi/media/core/config/models/AdConfig$RenderingConfig;)V", CampaignEx.JSON_KEY_MRAID, "Lcom/inmobi/media/core/config/models/AdConfig$MraidConfig;", "Lcom/inmobi/media/core/config/models/AdConfig$ViewabilityConfig;", "viewability", "Lcom/inmobi/media/core/config/models/AdConfig$ViewabilityConfig;", "getViewability", "()Lcom/inmobi/media/core/config/models/AdConfig$ViewabilityConfig;", "setViewability", "(Lcom/inmobi/media/core/config/models/AdConfig$ViewabilityConfig;)V", "Lcom/inmobi/media/core/config/models/AdConfig$ContextualDataConfig;", "contextualData", "Lcom/inmobi/media/core/config/models/AdConfig$ContextualDataConfig;", "getContextualData", "()Lcom/inmobi/media/core/config/models/AdConfig$ContextualDataConfig;", "setContextualData", "(Lcom/inmobi/media/core/config/models/AdConfig$ContextualDataConfig;)V", "Lcom/inmobi/media/core/config/models/AdConfig$AdQualityConfig;", "adQuality", "Lcom/inmobi/media/core/config/models/AdConfig$AdQualityConfig;", "getAdQuality", "()Lcom/inmobi/media/core/config/models/AdConfig$AdQualityConfig;", "setAdQuality", "(Lcom/inmobi/media/core/config/models/AdConfig$AdQualityConfig;)V", "Lcom/inmobi/media/core/config/models/AdConfig$AdReportConfig;", "adReport", "Lcom/inmobi/media/core/config/models/AdConfig$AdReportConfig;", "getAdReport", "()Lcom/inmobi/media/core/config/models/AdConfig$AdReportConfig;", "setAdReport", "(Lcom/inmobi/media/core/config/models/AdConfig$AdReportConfig;)V", "Lcom/inmobi/media/core/config/models/AdConfig$AudioConfig;", "audio", "Lcom/inmobi/media/core/config/models/AdConfig$AudioConfig;", "getAudio", "()Lcom/inmobi/media/core/config/models/AdConfig$AudioConfig;", "setAudio", "(Lcom/inmobi/media/core/config/models/AdConfig$AudioConfig;)V", "Lcom/inmobi/media/core/config/models/AdConfig$WebAssetCacheConfig;", "webAssetCache", "Lcom/inmobi/media/core/config/models/AdConfig$WebAssetCacheConfig;", "getWebAssetCache", "()Lcom/inmobi/media/core/config/models/AdConfig$WebAssetCacheConfig;", "setWebAssetCache", "(Lcom/inmobi/media/core/config/models/AdConfig$WebAssetCacheConfig;)V", "mraid3", "Lcom/inmobi/media/core/config/models/AdConfig$Mraid3Config;", "Lcom/inmobi/media/core/config/models/AdConfig$NativeConfig;", "native", "Lcom/inmobi/media/core/config/models/AdConfig$NativeConfig;", "getNative", "()Lcom/inmobi/media/core/config/models/AdConfig$NativeConfig;", "pingV2", "Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config;", "", "disableAppendingKeysForBeacons", "Ljava/util/List;", "getDisableAppendingKeysForBeacons", "()Ljava/util/List;", "setDisableAppendingKeysForBeacons", "(Ljava/util/List;)V", "Lcom/inmobi/media/core/config/models/AdConfig$VastVideoConfig;", "vastVideo", "Lcom/inmobi/media/core/config/models/AdConfig$VastVideoConfig;", "getVastVideo", "()Lcom/inmobi/media/core/config/models/AdConfig$VastVideoConfig;", "setVastVideo", "(Lcom/inmobi/media/core/config/models/AdConfig$VastVideoConfig;)V", "Lcom/inmobi/media/core/config/models/AdConfig$HybridNativeConfig;", "hybridNative", "Lcom/inmobi/media/core/config/models/AdConfig$HybridNativeConfig;", "getHybridNative", "()Lcom/inmobi/media/core/config/models/AdConfig$HybridNativeConfig;", "setHybridNative", "(Lcom/inmobi/media/core/config/models/AdConfig$HybridNativeConfig;)V", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations;", "timeouts", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations;", "getTimeouts", "()Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations;", "setTimeouts", "(Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations;)V", "deprecate", "Lcom/inmobi/media/P0;", "adReqDeprecateChecker", "Lcom/inmobi/media/P0;", "getAdReqDeprecateChecker", "()Lcom/inmobi/media/P0;", "setAdReqDeprecateChecker", "(Lcom/inmobi/media/P0;)V", "Lcom/inmobi/media/core/config/models/AdConfig$InlineInstaller;", "inlineInstaller", "Lcom/inmobi/media/core/config/models/AdConfig$InlineInstaller;", "getInlineInstaller", "()Lcom/inmobi/media/core/config/models/AdConfig$InlineInstaller;", "Lcom/inmobi/media/core/config/models/AdConfig$CustomBrowserConfig;", "customBrowser", "Lcom/inmobi/media/core/config/models/AdConfig$CustomBrowserConfig;", "getCustomBrowser", "()Lcom/inmobi/media/core/config/models/AdConfig$CustomBrowserConfig;", k.M, "com/inmobi/media/A", "CacheConfig", "BitRateConfig", "CustomNetworkValidation", "PingsV2Config", "ImaiConfig", "Mraid3Config", "RenderingConfig", "AudioConfig", "MraidConfig", "OmidConfig", "VideoViewabilityConfig", "CompanionViewabilityConfig", "AudioViewabilityConfig", "WebViewabilityConfig", "BannerImpressionTypeConfig", "InterstitialImpressionTypeConfig", "NativeConfig", "AdChoiceConfig", "NativeAssetConfig", "VideoPlayerConfig", "InteractionConfig", "VideoPlayerProgressConfig", "VideoPlayerAudioConfig", "VideoPlayerViewabilityConfig", "NativeViewabilityConfig", "ContextualDataConfig", "AdQualityConfig", "AdReportConfig", "ViewabilityConfig", "VastVideoConfig", "WebAssetCacheConfig", "HybridNativeConfig", "VideoCacheConfig", "InlineInstaller", "CustomBrowserConfig", "FormatCustomBrowserConfig", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdConfig extends Config {
    public static final long DEFAULT_AD_LOAD_RETRY_INTERVAL = 1000;
    public static final boolean DEFAULT_AD_QUALITY_KILL_SWITCH = true;
    public static final int DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE = 153600;
    public static final int DEFAULT_AD_QUALITY_MAX_RETRIES = 3;
    public static final int DEFAULT_AD_QUALITY_RESIZE_PERCENTAGE = 100;
    public static final long DEFAULT_AD_QUALITY_RETRY_INTERVAL = 5000;
    public static final boolean DEFAULT_AD_REPORT_KILL_SWITCH = true;
    public static final int DEFAULT_AD_REPORT_LIST_SIZE = 10;
    public static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    public static final long DEFAULT_AUDIO_PROCESSING_INTERVAL = 500;
    public static final boolean DEFAULT_BLOCK_BEACON_EXPIRY = false;
    public static final boolean DEFAULT_BLOCK_CALLBACK_EXPIRY = false;
    public static final boolean DEFAULT_CCT_ENABLED = false;
    public static final boolean DEFAULT_CLICK_DEDUP_ENABLED = false;
    public static final int DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME = 86400;
    public static final int DEFAULT_CONTEXTUAL_DATA_MAX_RECORDS = 1;
    public static final long DEFAULT_EXPOSURE_PROCESSING_INTERVAL = 500;
    public static final int DEFAULT_MAX_POOL_SIZE = 10;
    public static final int DEFAULT_MINIMUM_AUDIO_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MIN_VOLUME_AUDIO_REQUEST = 30;
    public static final int DEFAULT_NATIVE_ICON_MIN_DIM = 34;
    public static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
    public static final int DEFAULT_PING_V2_CALL_TIMEOUT = 60;
    public static final int DEFAULT_PING_V2_CONNECT_TIMEOUT = 30;
    public static final boolean DEFAULT_PING_V2_ENABLE = false;
    public static final int DEFAULT_PING_V2_EXPIRY_HIGH = 172800;
    public static final int DEFAULT_PING_V2_EXPIRY_NORMAL = 86400;
    public static final int DEFAULT_PING_V2_HIGH_MAX_BATCH_SIZE = 64;
    public static final int DEFAULT_PING_V2_INTERVAL_HIGH = 5;
    public static final int DEFAULT_PING_V2_INTERVAL_NORMAL = 5;
    public static final int DEFAULT_PING_V2_MAX_ENTRIES = 1000;
    public static final int DEFAULT_PING_V2_NORMAL_MAX_BATCH_SIZE = 50;
    public static final int DEFAULT_PING_V2_READ_TIMEOUT = 30;
    public static final double DEFAULT_PING_V2_RETRY_HIGH_FACTOR = 1.0d;
    public static final int DEFAULT_PING_V2_RETRY_HIGH_MAX_RETRIES = 5;
    public static final long DEFAULT_PING_V2_RETRY_HIGH_RETRY_INTERVAL = 2;
    public static final double DEFAULT_PING_V2_RETRY_NORMAL_FACTOR = 1.0d;
    public static final int DEFAULT_PING_V2_RETRY_NORMAL_MAX_RETRIES = 3;
    public static final long DEFAULT_PING_V2_RETRY_NORMAL_RETRY_INTERVAL = 5;
    public static final int DEFAULT_REFRESH_INTERVAL = 60;
    public static final long DEFAULT_SCROLL_THROTTLE_INTERVAL = 500;
    public static final int DEFAULT_TOUCH_RESET_TIME = 4;
    public static final int DEFAULT_UPPER_BOUND_FOR_ACTIVITY_CONTEXT = 10;
    public static final boolean DEFAULT_WATERMARK_KILL_SWITCH = true;
    private static final long DEFAULT_WINDOW_POLLING_INTERVAL = 500;
    public static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
    public static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
    public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
    private static final String TAG = "AdConfig";
    private AdQualityConfig adQuality;
    private AdReportConfig adReport;
    private P0 adReqDeprecateChecker;
    private boolean applyGzipReq;
    private AudioConfig audio;
    private Map<String, CacheConfig> cache;
    private boolean cctEnabled;
    private ContextualDataConfig contextualData;
    private final CustomBrowserConfig customBrowser;
    private String deprecate;
    private boolean enableCookiesOnInAppBrowser;
    private ImaiConfig imai;
    private final InlineInstaller inlineInstaller;
    private MraidConfig mraid;
    private boolean partialTabsEnabled;
    private RenderingConfig rendering;
    private boolean skipNetCheckHB;
    private boolean skipNetworkValidationFeatureEnabled;
    private TimeoutConfigurations timeouts;
    private VastVideoConfig vastVideo;
    private ViewabilityConfig viewability;
    private WebAssetCacheConfig webAssetCache;
    public static final A Companion = new A();
    private static final List<String> DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS = CollectionsKt.emptyList();
    private int maxPoolSize = 10;
    private String url = DEFAULT_AD_SERVER_URL;
    private CustomNetworkValidation customNwValidation = new CustomNetworkValidation();
    private int minimumRefreshInterval = 20;
    private int defaultRefreshInterval = 60;
    private boolean watermarkEnabled = true;
    private Mraid3Config mraid3 = new Mraid3Config();
    private final NativeConfig native = new NativeConfig();
    private PingsV2Config pingV2 = new PingsV2Config();
    private List<String> disableAppendingKeysForBeacons = CollectionsKt.emptyList();
    private HybridNativeConfig hybridNative = new HybridNativeConfig();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$AdChoiceConfig;", "", "<init>", "()V", "width", "", "getWidth", "()I", "height", "getHeight", "url", "", "getUrl", "()Ljava/lang/String;", "link", "getLink", "openMode", "getOpenMode", C4561o2.t, "getLoadTimeout", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdChoiceConfig {
        private final int height;
        private final int width;
        private final String url = "https://supply.inmobicdn.net/lagom-icons/AdChoices-11.png";
        private final String link = "https://www.inmobi.com";
        private final String openMode = "DEFAULT";
        private final int loadTimeout = 5000;

        public final int getHeight() {
            return this.height;
        }

        public final String getLink() {
            return this.link;
        }

        public final int getLoadTimeout() {
            return this.loadTimeout;
        }

        public final String getOpenMode() {
            return this.openMode;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\tH\u0007R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$AdQualityConfig;", "", "<init>", "()V", "value", "", "enabled", "getEnabled", "()Z", "", "maxRetries", "getMaxRetries", "()I", "", "retryInterval", "getRetryInterval", "()J", "maxImageSize", "getMaxImageSize", "resizedPercentage", "getResizedPercentage", "isValid", "setEnableAdQuality", "", com.ironsource.mediationsdk.metadata.a.k, "setMaxImageSize", ContentDisposition.Parameters.Size, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdQualityConfig {
        private boolean enabled = true;
        private int maxRetries = 3;
        private long retryInterval = 5000;
        private int maxImageSize = AdConfig.DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE;
        private final int resizedPercentage = 100;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getResizedPercentage() {
            return this.resizedPercentage;
        }

        public final long getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isValid() {
            return this.maxRetries >= 0 && this.retryInterval >= 0 && this.maxImageSize >= 1 && this.resizedPercentage <= 100;
        }

        public final void setEnableAdQuality(boolean enable) {
            this.enabled = enable;
        }

        public final void setMaxImageSize(int size) {
            this.maxImageSize = size;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$AdReportConfig;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "cridls", "", "getCridls", "()I", "setCridls", "(I)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdReportConfig {
        private boolean enabled = true;
        private int cridls = 10;

        public final int getCridls() {
            return this.cridls;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setCridls(int i) {
            this.cridls = i;
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0005R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$AudioConfig;", "", "<init>", "()V", "value", "", "isAudioEnabled", "()Z", "setAudioEnabled", "(Z)V", "", "minDeviceVolume", "getMinDeviceVolume", "()I", "setMinDeviceVolume", "(I)V", "minRefreshInterval", "getMinRefreshInterval", "setMinRefreshInterval", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AudioConfig {
        private boolean isAudioEnabled = true;
        private int minDeviceVolume = 30;
        private int minRefreshInterval = 20;

        public final int getMinDeviceVolume() {
            return this.minDeviceVolume;
        }

        public final int getMinRefreshInterval() {
            return this.minRefreshInterval;
        }

        /* renamed from: isAudioEnabled, reason: from getter */
        public final boolean getIsAudioEnabled() {
            return this.isAudioEnabled;
        }

        public final boolean isValid() {
            return this.minDeviceVolume > 0 && this.minRefreshInterval > 0;
        }

        public final void setAudioEnabled(boolean z) {
            this.isAudioEnabled = z;
        }

        public final void setMinDeviceVolume(int i) {
            this.minDeviceVolume = i;
        }

        public final void setMinRefreshInterval(int i) {
            this.minRefreshInterval = i;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$AudioViewabilityConfig;", "", "<init>", "()V", "impressionType", "", "getImpressionType", "()B", "setImpressionType", "(B)V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "impressionMinTimeViewed", "getImpressionMinTimeViewed", "setImpressionMinTimeViewed", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AudioViewabilityConfig {
        private byte impressionType = 1;
        private int impressionMinPercentageViewed = 90;
        private int impressionMinTimeViewed = 2000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionMinPercentageViewed(int i) {
            this.impressionMinPercentageViewed = i;
        }

        public final void setImpressionMinTimeViewed(int i) {
            this.impressionMinTimeViewed = i;
        }

        public final void setImpressionType(byte b) {
            this.impressionType = b;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$BannerImpressionTypeConfig;", "", "<init>", "()V", "impressionType", "", "getImpressionType", "()B", "setImpressionType", "(B)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerImpressionTypeConfig {
        private byte impressionType;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b) {
            this.impressionType = b;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$BitRateConfig;", "", "<init>", "()V", "bitrate_mandatory", "", "getBitrate_mandatory", "()Z", "headerTimeout", "", "getHeaderTimeout", "()J", "fetchFromHead", "getFetchFromHead", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BitRateConfig {
        private final boolean bitrate_mandatory;
        private final boolean fetchFromHead;
        private final long headerTimeout = 2000;

        public final boolean getBitrate_mandatory() {
            return this.bitrate_mandatory;
        }

        public final boolean getFetchFromHead() {
            return this.fetchFromHead;
        }

        public final long getHeaderTimeout() {
            return this.headerTimeout;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$CacheConfig;", "", "<init>", "()V", "timeToLive", "", "getTimeToLive", "()J", "setTimeToLive", "(J)V", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CacheConfig {
        private long timeToLive = 3300;

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            return this.timeToLive >= 0;
        }

        public final void setTimeToLive(long j) {
            this.timeToLive = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$CompanionViewabilityConfig;", "", "<init>", "()V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "visibilityPollIntervalMillis", "getVisibilityPollIntervalMillis", "setVisibilityPollIntervalMillis", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompanionViewabilityConfig {
        private int impressionMinPercentageViewed = 10;
        private int visibilityPollIntervalMillis = 500;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getVisibilityPollIntervalMillis() {
            return this.visibilityPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i) {
            this.impressionMinPercentageViewed = i;
        }

        public final void setVisibilityPollIntervalMillis(int i) {
            this.visibilityPollIntervalMillis = i;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$ContextualDataConfig;", "", "<init>", "()V", "value", "", "maxAdRecords", "getMaxAdRecords", "()I", "", "", "skipFields", "getSkipFields", "()Ljava/util/List;", "expiryTime", "getExpiryTime", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContextualDataConfig {
        private int expiryTime;
        private int maxAdRecords = 1;
        private List<String> skipFields;

        public ContextualDataConfig() {
            AdConfig.Companion.getClass();
            this.skipFields = AdConfig.DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
            this.expiryTime = 86400;
        }

        public final int getExpiryTime() {
            return this.expiryTime;
        }

        public final int getMaxAdRecords() {
            return this.maxAdRecords;
        }

        public final List<String> getSkipFields() {
            return this.skipFields;
        }

        public final boolean isValid() {
            return this.maxAdRecords >= 0 && this.expiryTime >= 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$CustomBrowserConfig;", "", "<init>", "()V", "int", "Lcom/inmobi/media/core/config/models/AdConfig$FormatCustomBrowserConfig;", "getInt", "()Lcom/inmobi/media/core/config/models/AdConfig$FormatCustomBrowserConfig;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomBrowserConfig {
        private final FormatCustomBrowserConfig int = new FormatCustomBrowserConfig();

        public final FormatCustomBrowserConfig getInt() {
            return this.int;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$CustomNetworkValidation;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "urlDomain", "", "getUrlDomain", "()Ljava/lang/String;", "setUrlDomain", "(Ljava/lang/String;)V", "refreshDebounceTime", "", "getRefreshDebounceTime", "()J", "setRefreshDebounceTime", "(J)V", "validatedExpiry", "getValidatedExpiry", "setValidatedExpiry", "nonValidatedExpiry", "getNonValidatedExpiry", "setNonValidatedExpiry", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomNetworkValidation {
        private boolean enabled;
        private String urlDomain = "supply.inmobicdn.net";
        private long refreshDebounceTime = 1000;
        private long validatedExpiry = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        private long nonValidatedExpiry = 30000;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getNonValidatedExpiry() {
            return this.nonValidatedExpiry;
        }

        public final long getRefreshDebounceTime() {
            return this.refreshDebounceTime;
        }

        public final String getUrlDomain() {
            return this.urlDomain;
        }

        public final long getValidatedExpiry() {
            return this.validatedExpiry;
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }

        public final void setNonValidatedExpiry(long j) {
            this.nonValidatedExpiry = j;
        }

        public final void setRefreshDebounceTime(long j) {
            this.refreshDebounceTime = j;
        }

        public final void setUrlDomain(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.urlDomain = str;
        }

        public final void setValidatedExpiry(long j) {
            this.validatedExpiry = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$FormatCustomBrowserConfig;", "", "<init>", "()V", "loaderTimeout", "", "getLoaderTimeout", "()J", "setLoaderTimeout", "(J)V", "loadCompletionDeBounce", "getLoadCompletionDeBounce", "setLoadCompletionDeBounce", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FormatCustomBrowserConfig {
        private long loaderTimeout = 2000;
        private long loadCompletionDeBounce = 500;

        public final long getLoadCompletionDeBounce() {
            return this.loadCompletionDeBounce;
        }

        public final long getLoaderTimeout() {
            return this.loaderTimeout;
        }

        public final void setLoadCompletionDeBounce(long j) {
            this.loadCompletionDeBounce = j;
        }

        public final void setLoaderTimeout(long j) {
            this.loaderTimeout = j;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$HybridNativeConfig;", "", "<init>", "()V", "isEnabled", "", "()Z", "minProgressInterval", "", "getMinProgressInterval", "()J", "maxSupportedPlayerVersion", "", "getMaxSupportedPlayerVersion", "()Ljava/lang/String;", "videoCache", "Lcom/inmobi/media/core/config/models/AdConfig$VideoCacheConfig;", "getVideoCache", "()Lcom/inmobi/media/core/config/models/AdConfig$VideoCacheConfig;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HybridNativeConfig {
        private final String maxSupportedPlayerVersion;
        private final boolean isEnabled = true;
        private final long minProgressInterval = 500;
        private final VideoCacheConfig videoCache = new VideoCacheConfig();

        public final String getMaxSupportedPlayerVersion() {
            return this.maxSupportedPlayerVersion;
        }

        public final long getMinProgressInterval() {
            return this.minProgressInterval;
        }

        public final VideoCacheConfig getVideoCache() {
            return this.videoCache;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$ImaiConfig;", "", "<init>", "()V", "maxRetries", "", "pingInterval", "pingTimeout", "maxDbEvents", "maxEventBatch", "pingCacheExpiry", "", "getMaxRetries", "getPingInterval", "getPingTimeout", "getMaxDbEvents", "getMaxEventBatch", "getPingCacheExpiry", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImaiConfig {
        private int maxRetries = 3;
        private int pingInterval = 60;
        private int pingTimeout = MenuKt.InTransitionDuration;
        private int maxDbEvents = 500;
        private int maxEventBatch = 10;
        private long pingCacheExpiry = 10800;

        public final int getMaxDbEvents() {
            return this.maxDbEvents;
        }

        public final int getMaxEventBatch() {
            return this.maxEventBatch;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final long getPingCacheExpiry() {
            return this.pingCacheExpiry;
        }

        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final int getPingTimeout() {
            return this.pingTimeout;
        }

        public final boolean isValid() {
            return getMaxDbEvents() >= 0 && getMaxEventBatch() >= 0 && getMaxRetries() >= 0 && getPingInterval() >= 0 && getPingTimeout() > 0 && getPingCacheExpiry() > 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$InlineInstaller;", "", "<init>", "()V", "", "getEffectivePingMode", "()I", "", "isClickPingEnabled", "Z", "()Z", "shouldPingInWebView", "getShouldPingInWebView", k.M, "com/inmobi/media/core/config/models/a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineInstaller {
        public static final a Companion = new a();
        public static final int PING_MODE_DISABLED = 0;
        public static final int PING_MODE_IN_WEBVIEW = 2;
        public static final int PING_MODE_REGULAR = 1;
        private final boolean isClickPingEnabled = true;
        private final boolean shouldPingInWebView = true;

        public final int getEffectivePingMode() {
            if (this.isClickPingEnabled) {
                return this.shouldPingInWebView ? 2 : 1;
            }
            return 0;
        }

        public final boolean getShouldPingInWebView() {
            return this.shouldPingInWebView;
        }

        /* renamed from: isClickPingEnabled, reason: from getter */
        public final boolean getIsClickPingEnabled() {
            return this.isClickPingEnabled;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$InteractionConfig;", "", "<init>", "()V", "clickDedupingEnabled", "", "getClickDedupingEnabled", "()Z", "blockBeaconsOnExpiry", "getBlockBeaconsOnExpiry", "blockCallbackOnExpiry", "getBlockCallbackOnExpiry", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InteractionConfig {
        private final boolean blockBeaconsOnExpiry;
        private final boolean blockCallbackOnExpiry;
        private final boolean clickDedupingEnabled;

        public final boolean getBlockBeaconsOnExpiry() {
            return this.blockBeaconsOnExpiry;
        }

        public final boolean getBlockCallbackOnExpiry() {
            return this.blockCallbackOnExpiry;
        }

        public final boolean getClickDedupingEnabled() {
            return this.clickDedupingEnabled;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$InterstitialImpressionTypeConfig;", "", "<init>", "()V", "value", "", "impressionType", "getImpressionType", "()B", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InterstitialImpressionTypeConfig {
        private byte impressionType = 1;

        public final byte getImpressionType() {
            return this.impressionType;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$Mraid3Config;", "", "<init>", "()V", "bannerEnabled", "", "getBannerEnabled", "()Z", "setBannerEnabled", "(Z)V", "interstitialEnabled", "getInterstitialEnabled", "setInterstitialEnabled", "exposureChangeInterval", "", "getExposureChangeInterval", "()J", "setExposureChangeInterval", "(J)V", "muteChangeInterval", "getMuteChangeInterval", "setMuteChangeInterval", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mraid3Config {
        private boolean bannerEnabled = true;
        private boolean interstitialEnabled = true;
        private long exposureChangeInterval = 500;
        private long muteChangeInterval = 500;

        public final boolean getBannerEnabled() {
            return this.bannerEnabled;
        }

        public final long getExposureChangeInterval() {
            return this.exposureChangeInterval;
        }

        public final boolean getInterstitialEnabled() {
            return this.interstitialEnabled;
        }

        public final long getMuteChangeInterval() {
            return this.muteChangeInterval;
        }

        public final void setBannerEnabled(boolean z) {
            this.bannerEnabled = z;
        }

        public final void setExposureChangeInterval(long j) {
            this.exposureChangeInterval = j;
        }

        public final void setInterstitialEnabled(boolean z) {
            this.interstitialEnabled = z;
        }

        public final void setMuteChangeInterval(long j) {
            this.muteChangeInterval = j;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$MraidConfig;", "", "<init>", "()V", "expiry", "", "maxRetries", "", "retryInterval", "url", "", "getExpiry", "getMaxRetries", "getRetryInterval", "getUrl", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MraidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String url = "https://supply.inmobicdn.net/sdk/sdk/1121/android/mraid.js";

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return getExpiry() >= 0 && getRetryInterval() >= 0 && getMaxRetries() >= 0 && !AbstractC3787i7.a(this.url);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$NativeAssetConfig;", "", "<init>", "()V", "maxImageSize", "", "getMaxImageSize", "()I", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NativeAssetConfig {
        private final int maxImageSize = 10;

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$NativeConfig;", "", "<init>", "()V", "adChoiceConfig", "Lcom/inmobi/media/core/config/models/AdConfig$AdChoiceConfig;", "getAdChoiceConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$AdChoiceConfig;", "videoPlayerConfig", "Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerConfig;", "getVideoPlayerConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerConfig;", "viewabilityConfig", "Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig;", "getViewabilityConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig;", "assetConfig", "Lcom/inmobi/media/core/config/models/AdConfig$NativeAssetConfig;", "getAssetConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$NativeAssetConfig;", "interaction", "Lcom/inmobi/media/core/config/models/AdConfig$InteractionConfig;", "getInteraction", "()Lcom/inmobi/media/core/config/models/AdConfig$InteractionConfig;", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NativeConfig {
        private final AdChoiceConfig adChoiceConfig = new AdChoiceConfig();
        private final VideoPlayerConfig videoPlayerConfig = new VideoPlayerConfig();
        private final NativeViewabilityConfig viewabilityConfig = new NativeViewabilityConfig();
        private final NativeAssetConfig assetConfig = new NativeAssetConfig();
        private final InteractionConfig interaction = new InteractionConfig();

        public final AdChoiceConfig getAdChoiceConfig() {
            return this.adChoiceConfig;
        }

        public final NativeAssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        public final InteractionConfig getInteraction() {
            return this.interaction;
        }

        public final VideoPlayerConfig getVideoPlayerConfig() {
            return this.videoPlayerConfig;
        }

        public final NativeViewabilityConfig getViewabilityConfig() {
            return this.viewabilityConfig;
        }

        public final boolean isValid() {
            return this.viewabilityConfig.isValid() && this.videoPlayerConfig.isValid();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001c\u001a\u00020\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006!"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig;", "", "<init>", "()V", HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$ImpressionConfig;", "getImpressionConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$ImpressionConfig;", "setImpressionConfig", "(Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$ImpressionConfig;)V", "mrc50Config", "Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$MRC50Config;", "getMrc50Config", "()Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$MRC50Config;", "setMrc50Config", "(Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$MRC50Config;)V", "parentMinDimension", "Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$DimensionConfig;", "getParentMinDimension", "()Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$DimensionConfig;", "setParentMinDimension", "(Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$DimensionConfig;)V", "iconMinDimension", "getIconMinDimension", "setIconMinDimension", "mediaMinDimension", "getMediaMinDimension", "setMediaMinDimension", "isValid", "", "ImpressionConfig", "MRC50Config", "DimensionConfig", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NativeViewabilityConfig {
        private ImpressionConfig impressionConfig = new ImpressionConfig();
        private MRC50Config mrc50Config = new MRC50Config();
        private DimensionConfig parentMinDimension = new DimensionConfig();
        private DimensionConfig iconMinDimension = new DimensionConfig();
        private DimensionConfig mediaMinDimension = new DimensionConfig();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$DimensionConfig;", "", "<init>", "()V", "dimensions", "", "", "getDimensions", "()Ljava/util/List;", "setDimensions", "(Ljava/util/List;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DimensionConfig {
            private List<Integer> dimensions;

            public DimensionConfig() {
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList.add(34);
                }
                this.dimensions = arrayList;
            }

            public final List<Integer> getDimensions() {
                return this.dimensions;
            }

            public final void setDimensions(List<Integer> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.dimensions = list;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$ImpressionConfig;", "", "<init>", "()V", "impressionType", "", "getImpressionType", "()B", "setImpressionType", "(B)V", "minPercentageViewed", "", "getMinPercentageViewed", "()I", "setMinPercentageViewed", "(I)V", "minTimeViewed", "getMinTimeViewed", "setMinTimeViewed", "videoMinTimeViewed", "getVideoMinTimeViewed", "setVideoMinTimeViewed", "pollInterval", "getPollInterval", "setPollInterval", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ImpressionConfig {
            private byte impressionType = 1;
            private int minPercentageViewed = 1;
            private int minTimeViewed = 1000;
            private int videoMinTimeViewed = 2000;
            private int pollInterval = 500;

            public final byte getImpressionType() {
                return this.impressionType;
            }

            public final int getMinPercentageViewed() {
                return this.minPercentageViewed;
            }

            public final int getMinTimeViewed() {
                return this.minTimeViewed;
            }

            public final int getPollInterval() {
                return this.pollInterval;
            }

            public final int getVideoMinTimeViewed() {
                return this.videoMinTimeViewed;
            }

            public final void setImpressionType(byte b) {
                this.impressionType = b;
            }

            public final void setMinPercentageViewed(int i) {
                this.minPercentageViewed = i;
            }

            public final void setMinTimeViewed(int i) {
                this.minTimeViewed = i;
            }

            public final void setPollInterval(int i) {
                this.pollInterval = i;
            }

            public final void setVideoMinTimeViewed(int i) {
                this.videoMinTimeViewed = i;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$NativeViewabilityConfig$MRC50Config;", "", "<init>", "()V", "minTimeViewed", "", "getMinTimeViewed", "()I", "setMinTimeViewed", "(I)V", "videoMinTimeViewed", "getVideoMinTimeViewed", "setVideoMinTimeViewed", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MRC50Config {
            private int minTimeViewed = 1000;
            private int videoMinTimeViewed = 2000;

            public final int getMinTimeViewed() {
                return this.minTimeViewed;
            }

            public final int getVideoMinTimeViewed() {
                return this.videoMinTimeViewed;
            }

            public final void setMinTimeViewed(int i) {
                this.minTimeViewed = i;
            }

            public final void setVideoMinTimeViewed(int i) {
                this.videoMinTimeViewed = i;
            }
        }

        public final DimensionConfig getIconMinDimension() {
            return this.iconMinDimension;
        }

        public final ImpressionConfig getImpressionConfig() {
            return this.impressionConfig;
        }

        public final DimensionConfig getMediaMinDimension() {
            return this.mediaMinDimension;
        }

        public final MRC50Config getMrc50Config() {
            return this.mrc50Config;
        }

        public final DimensionConfig getParentMinDimension() {
            return this.parentMinDimension;
        }

        public final boolean isValid() {
            return this.mediaMinDimension.getDimensions().size() == 2 && this.iconMinDimension.getDimensions().size() == 2 && this.parentMinDimension.getDimensions().size() == 2;
        }

        public final void setIconMinDimension(DimensionConfig dimensionConfig) {
            Intrinsics.checkNotNullParameter(dimensionConfig, "<set-?>");
            this.iconMinDimension = dimensionConfig;
        }

        public final void setImpressionConfig(ImpressionConfig impressionConfig) {
            Intrinsics.checkNotNullParameter(impressionConfig, "<set-?>");
            this.impressionConfig = impressionConfig;
        }

        public final void setMediaMinDimension(DimensionConfig dimensionConfig) {
            Intrinsics.checkNotNullParameter(dimensionConfig, "<set-?>");
            this.mediaMinDimension = dimensionConfig;
        }

        public final void setMrc50Config(MRC50Config mRC50Config) {
            Intrinsics.checkNotNullParameter(mRC50Config, "<set-?>");
            this.mrc50Config = mRC50Config;
        }

        public final void setParentMinDimension(DimensionConfig dimensionConfig) {
            Intrinsics.checkNotNullParameter(dimensionConfig, "<set-?>");
            this.parentMinDimension = dimensionConfig;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$OmidConfig;", "", "<init>", "()V", "expiry", "", "maxRetries", "", "retryInterval", "partnerKey", "", "url", "omidEnabled", "", "getOmidEnabled", "()Z", "setOmidEnabled", "(Z)V", "webViewRetainTime", "getPartnerKey", "getExpiry", "getMaxRetries", "getRetryInterval", "getUrl", "isOmidEnabled", "getWebViewRetainTime", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OmidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String partnerKey = "Inmobi";
        private String url = "https://supply.inmobicdn.net/javascript/1.5.7/omsdk-service.js";
        private boolean omidEnabled = true;
        private long webViewRetainTime = 1000;

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final boolean getOmidEnabled() {
            return this.omidEnabled;
        }

        public final String getPartnerKey() {
            return this.partnerKey;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final long getWebViewRetainTime() {
            return this.webViewRetainTime;
        }

        public final boolean isOmidEnabled() {
            return this.omidEnabled;
        }

        public final boolean isValid() {
            return getMaxRetries() >= 0 && getRetryInterval() >= 0 && AbstractC3727g4.a(StringsKt.trim((CharSequence) this.url).toString()) && !TextUtils.isEmpty(getPartnerKey());
        }

        public final void setOmidEnabled(boolean z) {
            this.omidEnabled = z;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\"#$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "maxEntries", "", "getMaxEntries", "()I", "maxBatchSize", "Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingBatchSizeConfig;", "getMaxBatchSize", "()Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingBatchSizeConfig;", "readTimeout", "getReadTimeout", "connectTimeout", "getConnectTimeout", "callTimeout", "getCallTimeout", "expiry", "Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingExpiryConfig;", "getExpiry", "()Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingExpiryConfig;", "retryConfig", "Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingRetryConfig;", "getRetryConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingRetryConfig;", "interval", "Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingIntervalConfig;", "getInterval", "()Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingIntervalConfig;", "PingExpiryConfig", "PingBatchSizeConfig", "PingRetryConfig", "PingIntervalConfig", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PingsV2Config {
        private final boolean enabled;
        private final int maxEntries = 1000;
        private final PingBatchSizeConfig maxBatchSize = new PingBatchSizeConfig();
        private final int readTimeout = 30;
        private final int connectTimeout = 30;
        private final int callTimeout = 60;
        private final PingExpiryConfig expiry = new PingExpiryConfig();
        private final PingRetryConfig retryConfig = new PingRetryConfig();
        private final PingIntervalConfig interval = new PingIntervalConfig();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingBatchSizeConfig;", "", "<init>", "()V", Constants.NORMAL, "", "getNormal", "()I", Constants.HIGH, "getHigh", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PingBatchSizeConfig {
            private final int normal = 50;
            private final int high = 64;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingExpiryConfig;", "", "<init>", "()V", Constants.NORMAL, "", "getNormal", "()I", Constants.HIGH, "getHigh", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PingExpiryConfig {
            private final int normal = 86400;
            private final int high = AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingIntervalConfig;", "", "<init>", "()V", Constants.NORMAL, "", "getNormal", "()I", "setNormal", "(I)V", Constants.HIGH, "getHigh", "setHigh", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PingIntervalConfig {
            private int normal = 5;
            private int high = 5;

            public final int getHigh() {
                return this.high;
            }

            public final int getNormal() {
                return this.normal;
            }

            public final void setHigh(int i) {
                this.high = i;
            }

            public final void setNormal(int i) {
                this.normal = i;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingRetryConfig;", "", "<init>", "()V", Constants.NORMAL, "Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;", "getNormal", "()Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;", "setNormal", "(Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;)V", Constants.HIGH, "getHigh", "setHigh", "PriorityRetryConfig", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PingRetryConfig {
            private PriorityRetryConfig normal = new PriorityRetryConfig(3, 5, 1.0d);
            private PriorityRetryConfig high = new PriorityRetryConfig(5, 2, 1.0d);

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$PingsV2Config$PingRetryConfig$PriorityRetryConfig;", "", "maxRetries", "", "retryInterval", "", "factor", "", "<init>", "(IJD)V", "getMaxRetries", "()I", "setMaxRetries", "(I)V", "getRetryInterval", "()J", "setRetryInterval", "(J)V", "getFactor", "()D", "setFactor", "(D)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PriorityRetryConfig {
                private double factor;
                private int maxRetries;
                private long retryInterval;

                public PriorityRetryConfig(int i, long j, double d) {
                    this.maxRetries = i;
                    this.retryInterval = j;
                    this.factor = d;
                }

                public final double getFactor() {
                    return this.factor;
                }

                public final int getMaxRetries() {
                    return this.maxRetries;
                }

                public final long getRetryInterval() {
                    return this.retryInterval;
                }

                public final void setFactor(double d) {
                    this.factor = d;
                }

                public final void setMaxRetries(int i) {
                    this.maxRetries = i;
                }

                public final void setRetryInterval(long j) {
                    this.retryInterval = j;
                }
            }

            public final PriorityRetryConfig getHigh() {
                return this.high;
            }

            public final PriorityRetryConfig getNormal() {
                return this.normal;
            }

            public final void setHigh(PriorityRetryConfig priorityRetryConfig) {
                Intrinsics.checkNotNullParameter(priorityRetryConfig, "<set-?>");
                this.high = priorityRetryConfig;
            }

            public final void setNormal(PriorityRetryConfig priorityRetryConfig) {
                Intrinsics.checkNotNullParameter(priorityRetryConfig, "<set-?>");
                this.normal = priorityRetryConfig;
            }
        }

        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final PingExpiryConfig getExpiry() {
            return this.expiry;
        }

        public final PingIntervalConfig getInterval() {
            return this.interval;
        }

        public final PingBatchSizeConfig getMaxBatchSize() {
            return this.maxBatchSize;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getReadTimeout() {
            return this.readTimeout;
        }

        public final PingRetryConfig getRetryConfig() {
            return this.retryConfig;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010)\u001a\u00020\u0012J\u0006\u0010*\u001a\u00020\u0012J\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020\u0012J\u0006\u0010/\u001a\u00020\u0012J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001201J\u0006\u00102\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000eR\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000eR\u001e\u0010%\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000eR\u001e\u0010'\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000e¨\u00063"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$RenderingConfig;", "", "<init>", "()V", "webviewBackground", "", "autoRedirectionEnforcement", "", "userTouchResetTime", "", "shouldRenderPopup", "value", "enablePubMuteControl", "getEnablePubMuteControl", "()Z", "enableDomStorage", "getEnableDomStorage", "bannerNetworkLoadsLimit", "", "audioNetworkLoadsLimit", "otherNetworkLoadsLimit", "gestures", "", "scrollThrottleInterval", "getScrollThrottleInterval", "()J", "setScrollThrottleInterval", "(J)V", "enableImmersive", "getEnableImmersive", "enableActivityContextOnBannerAttach", "getEnableActivityContextOnBannerAttach", "upperBoundForActivityContext", "getUpperBoundForActivityContext", "()I", "useDispatchTouchEvent", "getUseDispatchTouchEvent", "disableShowCustomView", "getDisableShowCustomView", "enableHtmlUrlPrefetch", "getEnableHtmlUrlPrefetch", "parseColor", "getWebviewBackgroundColor", "getAutoRedirectionEnforcement", "getUserTouchResetTime", "getBannerNetworkLoadsLimit", "getAudioNetworkLoadsLimit", "getOtherNetworkLoadsLimit", "getSupportedGestures", "", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderingConfig {
        private boolean enableActivityContextOnBannerAttach;
        private boolean enableDomStorage;
        private boolean enableHtmlUrlPrefetch;
        private boolean enableImmersive;
        private boolean enablePubMuteControl;
        private boolean shouldRenderPopup;
        private boolean useDispatchTouchEvent;
        private String webviewBackground = "#00000000";
        private boolean autoRedirectionEnforcement = true;
        private long userTouchResetTime = 4;
        private int bannerNetworkLoadsLimit = 50;
        private int audioNetworkLoadsLimit = 50;
        private int otherNetworkLoadsLimit = -1;
        private List<Integer> gestures = CollectionsKt.mutableListOf(0, 1, 2, 3, 4, 5);
        private long scrollThrottleInterval = 500;
        private int upperBoundForActivityContext = 10;
        private boolean disableShowCustomView = true;

        public final int getAudioNetworkLoadsLimit() {
            return this.audioNetworkLoadsLimit;
        }

        public final boolean getAutoRedirectionEnforcement() {
            return this.autoRedirectionEnforcement;
        }

        public final int getBannerNetworkLoadsLimit() {
            return this.bannerNetworkLoadsLimit;
        }

        public final boolean getDisableShowCustomView() {
            return this.disableShowCustomView;
        }

        public final boolean getEnableActivityContextOnBannerAttach() {
            return this.enableActivityContextOnBannerAttach;
        }

        public final boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public final boolean getEnableHtmlUrlPrefetch() {
            return this.enableHtmlUrlPrefetch;
        }

        public final boolean getEnableImmersive() {
            return this.enableImmersive;
        }

        public final boolean getEnablePubMuteControl() {
            return this.enablePubMuteControl;
        }

        public final int getOtherNetworkLoadsLimit() {
            return this.otherNetworkLoadsLimit;
        }

        public final long getScrollThrottleInterval() {
            return this.scrollThrottleInterval;
        }

        public final List<Integer> getSupportedGestures() {
            return this.gestures;
        }

        public final int getUpperBoundForActivityContext() {
            return this.upperBoundForActivityContext;
        }

        public final boolean getUseDispatchTouchEvent() {
            return this.useDispatchTouchEvent;
        }

        public final long getUserTouchResetTime() {
            return this.userTouchResetTime * 1000;
        }

        public final int getWebviewBackgroundColor() {
            try {
                return parseColor();
            } catch (IllegalArgumentException unused) {
                String unused2 = AdConfig.TAG;
                return Color.parseColor("#00000000");
            }
        }

        public final boolean isValid() {
            if (StringsKt.trim((CharSequence) this.webviewBackground).toString().length() != 0 && getUserTouchResetTime() >= 0 && !getSupportedGestures().isEmpty()) {
                try {
                    parseColor();
                    return true;
                } catch (IllegalArgumentException unused) {
                    String unused2 = AdConfig.TAG;
                }
            }
            return false;
        }

        public final int parseColor() throws IllegalArgumentException {
            return Color.parseColor(this.webviewBackground);
        }

        public final void setScrollThrottleInterval(long j) {
            this.scrollThrottleInterval = j;
        }

        /* renamed from: shouldRenderPopup, reason: from getter */
        public final boolean getShouldRenderPopup() {
            return this.shouldRenderPopup;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$VastVideoConfig;", "", "<init>", "()V", "maxWrapperLimit", "", "getMaxWrapperLimit", "()I", "optimalVastVideoSize", "", "getOptimalVastVideoSize", "()J", "vastMaxAssetSize", "getVastMaxAssetSize", "bitRate", "Lcom/inmobi/media/core/config/models/AdConfig$BitRateConfig;", "getBitRate", "()Lcom/inmobi/media/core/config/models/AdConfig$BitRateConfig;", "allowedContentType", "", "", "getAllowedContentType", "()Ljava/util/List;", "allowedCompanionType", "getAllowedCompanionType", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VastVideoConfig {
        private final int maxWrapperLimit = 5;
        private final long optimalVastVideoSize = 3145728;
        private final long vastMaxAssetSize = 31457280;
        private final BitRateConfig bitRate = new BitRateConfig();
        private final List<String> allowedContentType = CollectionsKt.mutableListOf("video/mp4", "video/3gp", "video/3gpp", "video/webm");
        private final List<String> allowedCompanionType = CollectionsKt.mutableListOf("image/jpeg", "image/jpg", MimeTypes.IMAGE_PNG);

        public final List<String> getAllowedCompanionType() {
            return this.allowedCompanionType;
        }

        public final List<String> getAllowedContentType() {
            return this.allowedContentType;
        }

        public final BitRateConfig getBitRate() {
            return this.bitRate;
        }

        public final int getMaxWrapperLimit() {
            return this.maxWrapperLimit;
        }

        public final long getOptimalVastVideoSize() {
            return this.optimalVastVideoSize;
        }

        public final long getVastMaxAssetSize() {
            return this.vastMaxAssetSize;
        }

        public final boolean isValid() {
            long j = this.optimalVastVideoSize;
            if (j > 31457280 || j <= 0 || this.maxWrapperLimit < 0) {
                return false;
            }
            long j2 = this.vastMaxAssetSize;
            return j2 > 0 && j2 <= 31457280;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$VideoCacheConfig;", "", "<init>", "()V", "isEnabled", "", "()Z", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "", "getMaxSize", "()J", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoCacheConfig {
        private final boolean isEnabled = true;
        private final long maxSize = 100;

        public final long getMaxSize() {
            return this.maxSize;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerAudioConfig;", "", "<init>", "()V", "startMuted", "", "getStartMuted", "()Z", "muteIconWidth", "", "getMuteIconWidth", "()I", "muteIconHeight", "getMuteIconHeight", "muteIconMargin", "", "getMuteIconMargin", "()Ljava/util/List;", "muteIconPosition", "getMuteIconPosition", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlayerAudioConfig {
        private final List<Integer> muteIconMargin;
        private final int muteIconPosition;
        private final boolean startMuted = true;
        private final int muteIconWidth = 25;
        private final int muteIconHeight = 25;

        public VideoPlayerAudioConfig() {
            ArrayList arrayList = new ArrayList(4);
            for (int i = 0; i < 4; i++) {
                arrayList.add(10);
            }
            this.muteIconMargin = arrayList;
        }

        public final int getMuteIconHeight() {
            return this.muteIconHeight;
        }

        public final List<Integer> getMuteIconMargin() {
            return this.muteIconMargin;
        }

        public final int getMuteIconPosition() {
            return this.muteIconPosition;
        }

        public final int getMuteIconWidth() {
            return this.muteIconWidth;
        }

        public final boolean getStartMuted() {
            return this.startMuted;
        }

        public final boolean isValid() {
            return this.muteIconMargin.size() == 4;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerConfig;", "", "<init>", "()V", "loopVideoOnComplete", "", "getLoopVideoOnComplete", "()Z", "progressConfig", "Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerProgressConfig;", "getProgressConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerProgressConfig;", "audioConfig", "Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerAudioConfig;", "getAudioConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerAudioConfig;", "viewability", "Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerViewabilityConfig;", "getViewability", "()Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerViewabilityConfig;", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlayerConfig {
        private final boolean loopVideoOnComplete;
        private final VideoPlayerProgressConfig progressConfig = new VideoPlayerProgressConfig();
        private final VideoPlayerAudioConfig audioConfig = new VideoPlayerAudioConfig();
        private final VideoPlayerViewabilityConfig viewability = new VideoPlayerViewabilityConfig();

        public final VideoPlayerAudioConfig getAudioConfig() {
            return this.audioConfig;
        }

        public final boolean getLoopVideoOnComplete() {
            return this.loopVideoOnComplete;
        }

        public final VideoPlayerProgressConfig getProgressConfig() {
            return this.progressConfig;
        }

        public final VideoPlayerViewabilityConfig getViewability() {
            return this.viewability;
        }

        public final boolean isValid() {
            return this.progressConfig.isValid() && this.audioConfig.isValid() && this.viewability.isValid();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerProgressConfig;", "", "<init>", "()V", "showProgress", "", "getShowProgress", "()Z", "foregroundColor", "", "", "getForegroundColor", "()Ljava/util/List;", "backgroundColor", "getBackgroundColor", "height", "getHeight", "()I", "progressPolling", "", "getProgressPolling", "()J", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlayerProgressConfig {
        private final List<Integer> backgroundColor;
        private final List<Integer> foregroundColor;
        private final int height;
        private final long progressPolling;
        private final boolean showProgress;

        public VideoPlayerProgressConfig() {
            ArrayList arrayList = new ArrayList(4);
            for (int i = 0; i < 4; i++) {
                arrayList.add(255);
            }
            this.foregroundColor = arrayList;
            ArrayList arrayList2 = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList2.add(0);
            }
            this.backgroundColor = arrayList2;
            this.height = 4;
            this.progressPolling = 100L;
        }

        public final List<Integer> getBackgroundColor() {
            return this.backgroundColor;
        }

        public final List<Integer> getForegroundColor() {
            return this.foregroundColor;
        }

        public final int getHeight() {
            return this.height;
        }

        public final long getProgressPolling() {
            return this.progressPolling;
        }

        public final boolean getShowProgress() {
            return this.showProgress;
        }

        public final boolean isValid() {
            return this.foregroundColor.size() == 4 && this.backgroundColor.size() == 4;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$VideoPlayerViewabilityConfig;", "", "<init>", "()V", "minPercentageVisible", "", "getMinPercentageVisible", "()I", "pollingInterval", "getPollingInterval", "minDimensions", "", "getMinDimensions", "()Ljava/util/List;", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlayerViewabilityConfig {
        private final List<Integer> minDimensions;
        private final int minPercentageVisible = 50;
        private final int pollingInterval = 200;

        public VideoPlayerViewabilityConfig() {
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < 2; i++) {
                arrayList.add(50);
            }
            this.minDimensions = arrayList;
        }

        public final List<Integer> getMinDimensions() {
            return this.minDimensions;
        }

        public final int getMinPercentageVisible() {
            return this.minPercentageVisible;
        }

        public final int getPollingInterval() {
            return this.pollingInterval;
        }

        public final boolean isValid() {
            return this.minDimensions.size() == 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$VideoViewabilityConfig;", "", "<init>", "()V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "impressionMinTimeViewed", "getImpressionMinTimeViewed", "setImpressionMinTimeViewed", "videoMinPercentagePlay", "getVideoMinPercentagePlay", "setVideoMinPercentagePlay", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 2000;
        private int videoMinPercentagePlay = 50;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getVideoMinPercentagePlay() {
            return this.videoMinPercentagePlay;
        }

        public final void setImpressionMinPercentageViewed(int i) {
            this.impressionMinPercentageViewed = i;
        }

        public final void setImpressionMinTimeViewed(int i) {
            this.impressionMinTimeViewed = i;
        }

        public final void setVideoMinPercentagePlay(int i) {
            this.videoMinPercentagePlay = i;
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\nJ\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0'H\u0000¢\u0006\u0002\b(J\u0006\u0010)\u001a\u00020\nJ\u0006\u0010*\u001a\u00020\nJ\u0006\u0010+\u001a\u00020\nJ\u0006\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\nJ\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020/J\u0006\u00101\u001a\u00020/J\u0006\u00102\u001a\u00020\nJ\u0006\u00103\u001a\u00020\nJ\u0006\u00104\u001a\u000205R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$ViewabilityConfig;", "", "<init>", "()V", "value", "", "windowPollingInterval", "getWindowPollingInterval", "()J", "visibilityThrottleMillis", "", "impressionPollIntervalMillis", "video", "Lcom/inmobi/media/core/config/models/AdConfig$VideoViewabilityConfig;", "audio", "Lcom/inmobi/media/core/config/models/AdConfig$AudioViewabilityConfig;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, "Lcom/inmobi/media/core/config/models/AdConfig$WebViewabilityConfig;", "omidConfig", "Lcom/inmobi/media/core/config/models/AdConfig$OmidConfig;", "getOmidConfig", "()Lcom/inmobi/media/core/config/models/AdConfig$OmidConfig;", "setOmidConfig", "(Lcom/inmobi/media/core/config/models/AdConfig$OmidConfig;)V", "bannerDetachConfig", "", "Lcom/inmobi/ads/core/BannerDetachConfig;", "banner", "Lcom/inmobi/media/core/config/models/AdConfig$BannerImpressionTypeConfig;", "int", "Lcom/inmobi/media/core/config/models/AdConfig$InterstitialImpressionTypeConfig;", "companion", "Lcom/inmobi/media/core/config/models/AdConfig$CompanionViewabilityConfig;", "getVideoImpressionMinPercentageViewed", "getVideoImpressionMinTimeViewed", "getVideoMinPercentagePlay", "getVisibilityThrottleMillis", "getImpressionPollIntervalMillis", "getBannerDetachConfig", "", "getBannerDetachConfig$media_release", "getWebImpressionMinPercentageViewed", "getWebImpressionMinTimeViewed", "getWebVisibilityThrottleMillis", "getAudioImpressionMinPercentageViewed", "getAudioImpressionMinTimeViewed", "getBannerImpressionType", "", "getAudioImpressionType", "getInterstitialImpressionType", "getCompanionVisibilityMinPercentageViewed", "getCompanionVisibilityThrottleMillis", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewabilityConfig {
        private BannerImpressionTypeConfig banner;
        private List<BannerDetachConfig> bannerDetachConfig;
        private CompanionViewabilityConfig companion;
        private InterstitialImpressionTypeConfig int;
        private long windowPollingInterval = 500;
        private int visibilityThrottleMillis = 100;
        private int impressionPollIntervalMillis = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        private VideoViewabilityConfig video = new VideoViewabilityConfig();
        private AudioViewabilityConfig audio = new AudioViewabilityConfig();
        private WebViewabilityConfig web = new WebViewabilityConfig();
        private OmidConfig omidConfig = new OmidConfig();

        public ViewabilityConfig() {
            BannerDetachConfig bannerDetachConfig = new BannerDetachConfig(BuildConfig.FLAVOR, null, null, null, 14, null);
            BannerDetachConfig bannerDetachConfig2 = new BannerDetachConfig("direct", null, null, null, 14, null);
            Boolean bool = Boolean.TRUE;
            this.bannerDetachConfig = CollectionsKt.mutableListOf(bannerDetachConfig, bannerDetachConfig2, new BannerDetachConfig("c_admob", bool, null, null, 12, null), new BannerDetachConfig("c_google", bool, null, null, 12, null));
            this.banner = new BannerImpressionTypeConfig();
            this.int = new InterstitialImpressionTypeConfig();
            this.companion = new CompanionViewabilityConfig();
        }

        public final int getAudioImpressionMinPercentageViewed() {
            return this.audio.getImpressionMinPercentageViewed();
        }

        public final int getAudioImpressionMinTimeViewed() {
            return this.audio.getImpressionMinTimeViewed();
        }

        public final byte getAudioImpressionType() {
            return this.audio.getImpressionType();
        }

        public final List<BannerDetachConfig> getBannerDetachConfig$media_release() {
            return this.bannerDetachConfig;
        }

        public final byte getBannerImpressionType() {
            return this.banner.getImpressionType();
        }

        public final int getCompanionVisibilityMinPercentageViewed() {
            return this.companion.getImpressionMinPercentageViewed();
        }

        public final int getCompanionVisibilityThrottleMillis() {
            return this.companion.getVisibilityPollIntervalMillis();
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final byte getInterstitialImpressionType() {
            return this.int.getImpressionType();
        }

        public final OmidConfig getOmidConfig() {
            return this.omidConfig;
        }

        public final int getVideoImpressionMinPercentageViewed() {
            return this.video.getImpressionMinPercentageViewed();
        }

        public final int getVideoImpressionMinTimeViewed() {
            return this.video.getImpressionMinTimeViewed();
        }

        public final int getVideoMinPercentagePlay() {
            return this.video.getVideoMinPercentagePlay();
        }

        public final int getVisibilityThrottleMillis() {
            return this.visibilityThrottleMillis;
        }

        public final int getWebImpressionMinPercentageViewed() {
            return this.web.getImpressionMinPercentageViewed();
        }

        public final int getWebImpressionMinTimeViewed() {
            return this.web.getImpressionMinTimeViewed();
        }

        public final int getWebVisibilityThrottleMillis() {
            return this.web.getImpressionPollIntervalMillis();
        }

        public final long getWindowPollingInterval() {
            return this.windowPollingInterval;
        }

        public final boolean isValid() {
            return getVideoImpressionMinPercentageViewed() > 0 && getVideoImpressionMinPercentageViewed() <= 100 && getWebImpressionMinPercentageViewed() > 0 && getWebImpressionMinPercentageViewed() <= 100 && getWebVisibilityThrottleMillis() > 0 && getWebImpressionMinTimeViewed() >= 0 && getVideoImpressionMinTimeViewed() >= 0 && getCompanionVisibilityMinPercentageViewed() >= 0 && getVideoMinPercentagePlay() > 0 && getVideoMinPercentagePlay() <= 100 && getVisibilityThrottleMillis() >= 50 && getImpressionPollIntervalMillis() >= 50 && getCompanionVisibilityThrottleMillis() >= 50 && this.omidConfig.isValid();
        }

        public final void setOmidConfig(OmidConfig omidConfig) {
            Intrinsics.checkNotNullParameter(omidConfig, "<set-?>");
            this.omidConfig = omidConfig;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$WebAssetCacheConfig;", "", "", "cacheSize", "timeout", "maxRetries", "minAvailableDiskSpace", "cacheSizeToDiskSpaceMaxPercent", "<init>", "(IIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Lcom/inmobi/media/core/config/models/AdConfig$WebAssetCacheConfig;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCacheSize", "getTimeout", "getMaxRetries", "getMinAvailableDiskSpace", "getCacheSizeToDiskSpaceMaxPercent", k.M, "com/inmobi/media/core/config/models/b", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WebAssetCacheConfig {
        public static final b Companion = new b();
        private static final int DEFAULT_CACHE_SIZE_MB = 15;
        private static final int DEFAULT_CACHE_SIZE_TO_DISK_SPACE_PERCENT = 10;
        private static final int DEFAULT_MAX_RETRIES = 1;
        private static final int DEFAULT_MIN_AVAILABLE_DISK_SPACE = 50;
        private static final int DEFAULT_TIMEOUT_MS = 5000;
        private final int cacheSize;
        private final int cacheSizeToDiskSpaceMaxPercent;
        private final int maxRetries;
        private final int minAvailableDiskSpace;
        private final int timeout;

        public WebAssetCacheConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ WebAssetCacheConfig copy$default(WebAssetCacheConfig webAssetCacheConfig, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = webAssetCacheConfig.cacheSize;
            }
            if ((i6 & 2) != 0) {
                i2 = webAssetCacheConfig.timeout;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = webAssetCacheConfig.maxRetries;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = webAssetCacheConfig.minAvailableDiskSpace;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
            }
            return webAssetCacheConfig.copy(i, i7, i8, i9, i5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCacheSize() {
            return this.cacheSize;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxRetries() {
            return this.maxRetries;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final WebAssetCacheConfig copy(int cacheSize, int timeout, int maxRetries, int minAvailableDiskSpace, int cacheSizeToDiskSpaceMaxPercent) {
            return new WebAssetCacheConfig(cacheSize, timeout, maxRetries, minAvailableDiskSpace, cacheSizeToDiskSpaceMaxPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebAssetCacheConfig)) {
                return false;
            }
            WebAssetCacheConfig webAssetCacheConfig = (WebAssetCacheConfig) other;
            return this.cacheSize == webAssetCacheConfig.cacheSize && this.timeout == webAssetCacheConfig.timeout && this.maxRetries == webAssetCacheConfig.maxRetries && this.minAvailableDiskSpace == webAssetCacheConfig.minAvailableDiskSpace && this.cacheSizeToDiskSpaceMaxPercent == webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getCacheSize() {
            return this.cacheSize;
        }

        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            return Integer.hashCode(this.cacheSizeToDiskSpaceMaxPercent) + Hj.a(this.minAvailableDiskSpace, Hj.a(this.maxRetries, Hj.a(this.timeout, Integer.hashCode(this.cacheSize) * 31, 31), 31), 31);
        }

        public String toString() {
            return "WebAssetCacheConfig(cacheSize=" + this.cacheSize + ", timeout=" + this.timeout + ", maxRetries=" + this.maxRetries + ", minAvailableDiskSpace=" + this.minAvailableDiskSpace + ", cacheSizeToDiskSpaceMaxPercent=" + this.cacheSizeToDiskSpaceMaxPercent + ")";
        }

        public WebAssetCacheConfig(int i, int i2, int i3, int i4, int i5) {
            this.cacheSize = i;
            this.timeout = i2;
            this.maxRetries = i3;
            this.minAvailableDiskSpace = i4;
            this.cacheSizeToDiskSpaceMaxPercent = i5;
        }

        public /* synthetic */ WebAssetCacheConfig(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 15 : i, (i6 & 2) != 0 ? 5000 : i2, (i6 & 4) != 0 ? 1 : i3, (i6 & 8) != 0 ? 50 : i4, (i6 & 16) != 0 ? 10 : i5);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/AdConfig$WebViewabilityConfig;", "", "<init>", "()V", "impressionMinPercentageViewed", "", "getImpressionMinPercentageViewed", "()I", "setImpressionMinPercentageViewed", "(I)V", "impressionMinTimeViewed", "getImpressionMinTimeViewed", "setImpressionMinTimeViewed", "impressionPollIntervalMillis", "getImpressionPollIntervalMillis", "setImpressionPollIntervalMillis", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int impressionPollIntervalMillis = 1000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i) {
            this.impressionMinPercentageViewed = i;
        }

        public final void setImpressionMinTimeViewed(int i) {
            this.impressionMinTimeViewed = i;
        }

        public final void setImpressionPollIntervalMillis(int i) {
            this.impressionPollIntervalMillis = i;
        }
    }

    public AdConfig() {
        TimeoutConfigurations.Companion.getClass();
        TimeoutConfigurations timeoutConfigurations = new TimeoutConfigurations();
        timeoutConfigurations.d0();
        this.timeouts = timeoutConfigurations;
        this.inlineInstaller = new InlineInstaller();
        this.customBrowser = new CustomBrowserConfig();
        this.imai = new ImaiConfig();
        this.rendering = new RenderingConfig();
        this.mraid = new MraidConfig();
        this.viewability = new ViewabilityConfig();
        this.vastVideo = new VastVideoConfig();
        this.contextualData = new ContextualDataConfig();
        this.adQuality = new AdQualityConfig();
        this.adReport = new AdReportConfig();
        this.audio = new AudioConfig();
        this.webAssetCache = new WebAssetCacheConfig(0, 0, 0, 0, 0, 31, null);
        this.cache = MapsKt.mutableMapOf(TuplesKt.to("base", new CacheConfig()), TuplesKt.to("banner", new CacheConfig()), TuplesKt.to("audio", new CacheConfig()), TuplesKt.to("int", new CacheConfig()), TuplesKt.to("native", new CacheConfig()));
    }

    public final AdQualityConfig getAdQuality() {
        return this.adQuality;
    }

    public final AdReportConfig getAdReport() {
        return this.adReport;
    }

    public final P0 getAdReqDeprecateChecker() {
        if (this.adReqDeprecateChecker == null) {
            String str = this.deprecate;
            P0 p0 = null;
            if (str != null) {
                if (!AbstractC3727g4.a(str)) {
                    str = null;
                }
                if (str != null) {
                    p0 = new P0(str);
                }
            }
            this.adReqDeprecateChecker = p0;
        }
        return this.adReqDeprecateChecker;
    }

    public final boolean getApplyGzipReq() {
        return this.applyGzipReq;
    }

    public final AudioConfig getAudio() {
        return this.audio;
    }

    public final CacheConfig getCacheConfig(String adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        CacheConfig cacheConfig = this.cache.get(adType);
        if (cacheConfig != null) {
            return cacheConfig;
        }
        CacheConfig cacheConfig2 = this.cache.get("base");
        return cacheConfig2 == null ? new CacheConfig() : cacheConfig2;
    }

    public final ContextualDataConfig getContextualData() {
        return this.contextualData;
    }

    public final CustomBrowserConfig getCustomBrowser() {
        return this.customBrowser;
    }

    public final CustomNetworkValidation getCustomNwValidation() {
        return this.customNwValidation;
    }

    public final int getDefaultRefreshInterval() {
        return this.defaultRefreshInterval;
    }

    public final List<String> getDisableAppendingKeysForBeacons() {
        return this.disableAppendingKeysForBeacons;
    }

    public final boolean getEnableCookiesOnInAppBrowser() {
        return this.enableCookiesOnInAppBrowser;
    }

    public final HybridNativeConfig getHybridNative() {
        return this.hybridNative;
    }

    /* renamed from: getImaiConfig, reason: from getter */
    public final ImaiConfig getImai() {
        return this.imai;
    }

    public final InlineInstaller getInlineInstaller() {
        return this.inlineInstaller;
    }

    public final int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public final int getMinimumRefreshInterval() {
        return this.minimumRefreshInterval;
    }

    /* renamed from: getMraid3Config, reason: from getter */
    public final Mraid3Config getMraid3() {
        return this.mraid3;
    }

    /* renamed from: getMraidConfig, reason: from getter */
    public final MraidConfig getMraid() {
        return this.mraid;
    }

    public final NativeConfig getNative() {
        return this.native;
    }

    public final boolean getPartialTabsEnabled() {
        return this.partialTabsEnabled;
    }

    /* renamed from: getPingsV2Config, reason: from getter */
    public final PingsV2Config getPingV2() {
        return this.pingV2;
    }

    public final RenderingConfig getRendering() {
        return this.rendering;
    }

    public final boolean getSkipNetCheckHB() {
        return this.skipNetCheckHB;
    }

    public final boolean getSkipNetworkValidationFeatureEnabled() {
        return this.skipNetworkValidationFeatureEnabled;
    }

    public final TimeoutConfigurations getTimeouts() {
        return this.timeouts;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    public final String getUrl() {
        return this.url;
    }

    public final VastVideoConfig getVastVideo() {
        return this.vastVideo;
    }

    public final ViewabilityConfig getViewability() {
        return this.viewability;
    }

    public final boolean getWatermarkEnabled() {
        return this.watermarkEnabled;
    }

    public final WebAssetCacheConfig getWebAssetCache() {
        return this.webAssetCache;
    }

    /* renamed from: isCCTEnabled, reason: from getter */
    public final boolean getCctEnabled() {
        return this.cctEnabled;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        int i;
        int i2;
        if (this.maxPoolSize > 0 && !AbstractC3787i7.a(this.url) && (i = this.minimumRefreshInterval) >= 0 && (i2 = this.defaultRefreshInterval) >= 0 && i <= i2) {
            Iterator<Map.Entry<String, CacheConfig>> it = this.cache.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().isValid()) {
                    return false;
                }
            }
            this.timeouts.d0();
            if (this.contextualData.isValid() && this.adQuality.isValid() && this.imai.isValid() && this.mraid.isValid() && this.timeouts.c0() && this.rendering.isValid() && this.vastVideo.isValid() && this.viewability.isValid() && this.audio.isValid() && this.native.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final void setAdQuality(AdQualityConfig adQualityConfig) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "<set-?>");
        this.adQuality = adQualityConfig;
    }

    public final void setAdReport(AdReportConfig adReportConfig) {
        Intrinsics.checkNotNullParameter(adReportConfig, "<set-?>");
        this.adReport = adReportConfig;
    }

    public final void setAdReqDeprecateChecker(P0 p0) {
        this.adReqDeprecateChecker = p0;
    }

    public final void setApplyGzipReq(boolean z) {
        this.applyGzipReq = z;
    }

    public final void setAudio(AudioConfig audioConfig) {
        Intrinsics.checkNotNullParameter(audioConfig, "<set-?>");
        this.audio = audioConfig;
    }

    public final void setContextualData(ContextualDataConfig contextualDataConfig) {
        Intrinsics.checkNotNullParameter(contextualDataConfig, "<set-?>");
        this.contextualData = contextualDataConfig;
    }

    public final void setCustomNwValidation(CustomNetworkValidation customNetworkValidation) {
        this.customNwValidation = customNetworkValidation;
    }

    public final void setDefaultRefreshInterval(int i) {
        this.defaultRefreshInterval = i;
    }

    public final void setDisableAppendingKeysForBeacons(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.disableAppendingKeysForBeacons = list;
    }

    public final void setEnableCookiesOnInAppBrowser(boolean z) {
        this.enableCookiesOnInAppBrowser = z;
    }

    public final void setHybridNative(HybridNativeConfig hybridNativeConfig) {
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "<set-?>");
        this.hybridNative = hybridNativeConfig;
    }

    public final void setMinimumRefreshInterval(int i) {
        this.minimumRefreshInterval = i;
    }

    public final void setPartialTabsEnabled(boolean z) {
        this.partialTabsEnabled = z;
    }

    public final void setRendering(RenderingConfig renderingConfig) {
        Intrinsics.checkNotNullParameter(renderingConfig, "<set-?>");
        this.rendering = renderingConfig;
    }

    public final void setSkipNetCheckHB(boolean z) {
        this.skipNetCheckHB = z;
    }

    public final void setSkipNetworkValidationFeatureEnabled(boolean z) {
        this.skipNetworkValidationFeatureEnabled = z;
    }

    public final void setTimeouts(TimeoutConfigurations timeoutConfigurations) {
        Intrinsics.checkNotNullParameter(timeoutConfigurations, "<set-?>");
        this.timeouts = timeoutConfigurations;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setVastVideo(VastVideoConfig vastVideoConfig) {
        Intrinsics.checkNotNullParameter(vastVideoConfig, "<set-?>");
        this.vastVideo = vastVideoConfig;
    }

    public final void setViewability(ViewabilityConfig viewabilityConfig) {
        Intrinsics.checkNotNullParameter(viewabilityConfig, "<set-?>");
        this.viewability = viewabilityConfig;
    }

    public final void setWebAssetCache(WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "<set-?>");
        this.webAssetCache = webAssetCacheConfig;
    }
}
