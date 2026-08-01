package com.unity3d.ads.core.data.model;

import android.app.Activity;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.protobuf.ByteString;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AdObject.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001hBÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0007HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u0010HÆ\u0003J\t\u0010Z\u001a\u00020\nHÆ\u0003J\t\u0010[\u001a\u00020\u0013HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015HÆ\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010!HÆ\u0003JÕ\u0001\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!HÆ\u0001J\u0013\u0010c\u001a\u00020\n2\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020fHÖ\u0001J\t\u0010g\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u00102R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010)\"\u0004\b6\u00102R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010-R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006i"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "adScope", "Lkotlinx/coroutines/CoroutineScope;", "opportunityId", "Lcom/google/protobuf/ByteString;", "placementId", "", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "isOfferwallAd", "", "offerwallPlacementName", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "playerServerId", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "ttl", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/time/Duration;", "state", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "loadConfiguration", "Lcom/unity3d/ads/LoadConfiguration;", "showConfiguration", "Lcom/unity3d/ads/ShowConfiguration;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "webViewLessLoadingRequiredData", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "getAdScope", "()Lkotlinx/coroutines/CoroutineScope;", "getOpportunityId", "()Lcom/google/protobuf/ByteString;", "getPlacementId", "()Ljava/lang/String;", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "()Z", "setOfferwallAd", "(Z)V", "getOfferwallPlacementName", "setOfferwallPlacementName", "(Ljava/lang/String;)V", "getAdPlayer", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "getPlayerServerId", "setPlayerServerId", "getLoadOptions", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getTtl", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setTtl", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getState", "setState", "getLoadConfiguration", "()Lcom/unity3d/ads/LoadConfiguration;", "setLoadConfiguration", "(Lcom/unity3d/ads/LoadConfiguration;)V", "getShowConfiguration", "()Lcom/unity3d/ads/ShowConfiguration;", "setShowConfiguration", "(Lcom/unity3d/ads/ShowConfiguration;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "setActivity", "(Ljava/lang/ref/WeakReference;)V", "getWebViewLessLoadingRequiredData", "()Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "setWebViewLessLoadingRequiredData", "(Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "WebViewLessLoadingRequiredData", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdObject {
    private WeakReference<Activity> activity;
    private final AdPlayer adPlayer;
    private final CoroutineScope adScope;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private LoadConfiguration loadConfiguration;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private ShowConfiguration showConfiguration;
    private MutableStateFlow<AdObjectState> state;
    private ByteString trackingToken;
    private MutableStateFlow<Duration> ttl;
    private WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;

    /* renamed from: component1, reason: from getter */
    public final CoroutineScope getAdScope() {
        return this.adScope;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    /* renamed from: component11, reason: from getter */
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final MutableStateFlow<Duration> component12() {
        return this.ttl;
    }

    public final MutableStateFlow<AdObjectState> component13() {
        return this.state;
    }

    /* renamed from: component14, reason: from getter */
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    /* renamed from: component15, reason: from getter */
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    public final WeakReference<Activity> component16() {
        return this.activity;
    }

    /* renamed from: component17, reason: from getter */
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    /* renamed from: component2, reason: from getter */
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component4, reason: from getter */
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    /* renamed from: component7, reason: from getter */
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    /* renamed from: component9, reason: from getter */
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final AdObject copy(CoroutineScope adScope, ByteString opportunityId, String placementId, ByteString trackingToken, boolean isOfferwallAd, String offerwallPlacementName, AdPlayer adPlayer, String playerServerId, UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, MutableStateFlow<Duration> ttl, MutableStateFlow<AdObjectState> state, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> activity, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        Intrinsics.checkNotNullParameter(adScope, "adScope");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        return new AdObject(adScope, opportunityId, placementId, trackingToken, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state, loadConfiguration, showConfiguration, activity, webViewLessLoadingRequiredData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) other;
        return Intrinsics.areEqual(this.adScope, adObject.adScope) && Intrinsics.areEqual(this.opportunityId, adObject.opportunityId) && Intrinsics.areEqual(this.placementId, adObject.placementId) && Intrinsics.areEqual(this.trackingToken, adObject.trackingToken) && this.isOfferwallAd == adObject.isOfferwallAd && Intrinsics.areEqual(this.offerwallPlacementName, adObject.offerwallPlacementName) && Intrinsics.areEqual(this.adPlayer, adObject.adPlayer) && Intrinsics.areEqual(this.playerServerId, adObject.playerServerId) && Intrinsics.areEqual(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && Intrinsics.areEqual(this.ttl, adObject.ttl) && Intrinsics.areEqual(this.state, adObject.state) && Intrinsics.areEqual(this.loadConfiguration, adObject.loadConfiguration) && Intrinsics.areEqual(this.showConfiguration, adObject.showConfiguration) && Intrinsics.areEqual(this.activity, adObject.activity) && Intrinsics.areEqual(this.webViewLessLoadingRequiredData, adObject.webViewLessLoadingRequiredData);
    }

    public int hashCode() {
        int hashCode = ((((((((this.adScope.hashCode() * 31) + this.opportunityId.hashCode()) * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31) + Boolean.hashCode(this.isOfferwallAd)) * 31;
        String str = this.offerwallPlacementName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int hashCode3 = (hashCode2 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str2 = this.playerServerId;
        int hashCode4 = (((((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.loadOptions.hashCode()) * 31) + Boolean.hashCode(this.isHeaderBidding)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode()) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int hashCode5 = (hashCode4 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int hashCode6 = (hashCode5 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        int hashCode7 = (hashCode6 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.webViewLessLoadingRequiredData;
        return hashCode7 + (webViewLessLoadingRequiredData != null ? webViewLessLoadingRequiredData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdObject(adScope=");
        sb.append(this.adScope).append(", opportunityId=").append(this.opportunityId).append(", placementId=").append(this.placementId).append(", trackingToken=").append(this.trackingToken).append(", isOfferwallAd=").append(this.isOfferwallAd).append(", offerwallPlacementName=").append(this.offerwallPlacementName).append(", adPlayer=").append(this.adPlayer).append(", playerServerId=").append(this.playerServerId).append(", loadOptions=").append(this.loadOptions).append(", isHeaderBidding=").append(this.isHeaderBidding).append(", adType=").append(this.adType).append(", ttl=");
        sb.append(this.ttl).append(", state=").append(this.state).append(", loadConfiguration=").append(this.loadConfiguration).append(", showConfiguration=").append(this.showConfiguration).append(", activity=").append(this.activity).append(", webViewLessLoadingRequiredData=").append(this.webViewLessLoadingRequiredData).append(')');
        return sb.toString();
    }

    public AdObject(CoroutineScope adScope, ByteString opportunityId, String placementId, ByteString trackingToken, boolean z, String str, AdPlayer adPlayer, String str2, UnityAdsLoadOptions loadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, MutableStateFlow<Duration> ttl, MutableStateFlow<AdObjectState> state, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        Intrinsics.checkNotNullParameter(adScope, "adScope");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        this.adScope = adScope;
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str;
        this.adPlayer = adPlayer;
        this.playerServerId = str2;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z2;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    public final CoroutineScope getAdScope() {
        return this.adScope;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final void setTrackingToken(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public /* synthetic */ AdObject(CoroutineScope coroutineScope, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, MutableStateFlow mutableStateFlow, MutableStateFlow mutableStateFlow2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, byteString, str, byteString2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : adPlayer, (i & 128) != 0 ? null : str3, unityAdsLoadOptions, z2, diagnosticAdType, (i & 2048) != 0 ? StateFlowKt.MutableStateFlow(null) : mutableStateFlow, (i & 4096) != 0 ? StateFlowKt.MutableStateFlow(AdObjectState.INIT) : mutableStateFlow2, (i & 8192) != 0 ? null : loadConfiguration, (i & 16384) != 0 ? null : showConfiguration, (32768 & i) != 0 ? null : weakReference, (i & 65536) != 0 ? null : webViewLessLoadingRequiredData);
    }

    public final MutableStateFlow<Duration> getTtl() {
        return this.ttl;
    }

    public final void setTtl(MutableStateFlow<Duration> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.ttl = mutableStateFlow;
    }

    public final MutableStateFlow<AdObjectState> getState() {
        return this.state;
    }

    public final void setState(MutableStateFlow<AdObjectState> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.state = mutableStateFlow;
    }

    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    public final void setLoadConfiguration(LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    public final void setShowConfiguration(ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final void setActivity(WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    public final void setWebViewLessLoadingRequiredData(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    /* compiled from: AdObject.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "", "webviewUrl", "", "adResponse", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adRefreshState", "Lcom/unity3d/ads/core/data/model/AdRefreshState;", "<init>", "(Ljava/lang/String;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "getWebviewUrl", "()Ljava/lang/String;", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "getAdRefreshState", "()Lcom/unity3d/ads/core/data/model/AdRefreshState;", "setAdRefreshState", "(Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WebViewLessLoadingRequiredData {
        private AdRefreshState adRefreshState;
        private AdResponseOuterClass.AdResponse adResponse;
        private final String webviewUrl;

        public static /* synthetic */ WebViewLessLoadingRequiredData copy$default(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webViewLessLoadingRequiredData.webviewUrl;
            }
            if ((i & 2) != 0) {
                adResponse = webViewLessLoadingRequiredData.adResponse;
            }
            if ((i & 4) != 0) {
                adRefreshState = webViewLessLoadingRequiredData.adRefreshState;
            }
            return webViewLessLoadingRequiredData.copy(str, adResponse, adRefreshState);
        }

        /* renamed from: component1, reason: from getter */
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        /* renamed from: component3, reason: from getter */
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        public final WebViewLessLoadingRequiredData copy(String webviewUrl, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            Intrinsics.checkNotNullParameter(webviewUrl, "webviewUrl");
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            return new WebViewLessLoadingRequiredData(webviewUrl, adResponse, adRefreshState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewLessLoadingRequiredData)) {
                return false;
            }
            WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = (WebViewLessLoadingRequiredData) other;
            return Intrinsics.areEqual(this.webviewUrl, webViewLessLoadingRequiredData.webviewUrl) && Intrinsics.areEqual(this.adResponse, webViewLessLoadingRequiredData.adResponse) && this.adRefreshState == webViewLessLoadingRequiredData.adRefreshState;
        }

        public int hashCode() {
            int hashCode = ((this.webviewUrl.hashCode() * 31) + this.adResponse.hashCode()) * 31;
            AdRefreshState adRefreshState = this.adRefreshState;
            return hashCode + (adRefreshState == null ? 0 : adRefreshState.hashCode());
        }

        public String toString() {
            return "WebViewLessLoadingRequiredData(webviewUrl=" + this.webviewUrl + ", adResponse=" + this.adResponse + ", adRefreshState=" + this.adRefreshState + ')';
        }

        public WebViewLessLoadingRequiredData(String webviewUrl, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            Intrinsics.checkNotNullParameter(webviewUrl, "webviewUrl");
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            this.webviewUrl = webviewUrl;
            this.adResponse = adResponse;
            this.adRefreshState = adRefreshState;
        }

        public /* synthetic */ WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, adResponse, (i & 4) != 0 ? null : adRefreshState);
        }

        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        public final void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
            Intrinsics.checkNotNullParameter(adResponse, "<set-?>");
            this.adResponse = adResponse;
        }

        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        public final void setAdRefreshState(AdRefreshState adRefreshState) {
            this.adRefreshState = adRefreshState;
        }
    }
}
