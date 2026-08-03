package com.unity3d.ads.core.data.model;

/* compiled from: AdObject.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¶\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0012HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\u0015HÆ\u0003J\u0014\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017HÆ\u0003ø\u0001\u0000J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÆ\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017HÆ\u0001ø\u0001\u0000J\u0013\u0010O\u001a\u00020\b2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010 \"\u0004\b#\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010'\"\u0004\b0\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010+\"\u0004\b:\u0010;R%\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0086\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00106\"\u0004\b=\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "placementId", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "isScarAd", "", "scarQueryId", "scarAdUnitId", "scarAdString", "isOfferwallAd", "offerwallPlacementName", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "playerServerId", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "ttl", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/time/Duration;", "state", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "(Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getAdPlayer", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "()Z", "setOfferwallAd", "(Z)V", "setScarAd", "getLoadOptions", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "getOfferwallPlacementName", "()Ljava/lang/String;", "setOfferwallPlacementName", "(Ljava/lang/String;)V", "getOpportunityId", "()Lcom/google/protobuf/ByteString;", "getPlacementId", "getPlayerServerId", "setPlayerServerId", "getScarAdString", "setScarAdString", "getScarAdUnitId", "setScarAdUnitId", "getScarQueryId", "setScarQueryId", "getState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "getTtl", "setTtl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdObject {
    private final com.unity3d.ads.adplayer.AdPlayer adPlayer;
    private final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private final com.unity3d.ads.UnityAdsLoadOptions loadOptions;
    private java.lang.String offerwallPlacementName;
    private final com.google.protobuf.ByteString opportunityId;
    private final java.lang.String placementId;
    private java.lang.String playerServerId;
    private java.lang.String scarAdString;
    private java.lang.String scarAdUnitId;
    private java.lang.String scarQueryId;
    private kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.AdObjectState> state;
    private com.google.protobuf.ByteString trackingToken;
    private kotlinx.coroutines.flow.MutableStateFlow<kotlin.time.Duration> ttl;

    /* renamed from: component1, reason: from getter */
    public final com.google.protobuf.ByteString getOpportunityId() {
        return this.opportunityId;
    }

    /* renamed from: component10, reason: from getter */
    public final com.unity3d.ads.adplayer.AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getPlayerServerId() {
        return this.playerServerId;
    }

    /* renamed from: component12, reason: from getter */
    public final com.unity3d.ads.UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    /* renamed from: component14, reason: from getter */
    public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<kotlin.time.Duration> component15() {
        return this.ttl;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.AdObjectState> component16() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component3, reason: from getter */
    public final com.google.protobuf.ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsScarAd() {
        return this.isScarAd;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getScarQueryId() {
        return this.scarQueryId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getScarAdString() {
        return this.scarAdString;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final com.unity3d.ads.core.data.model.AdObject copy(com.google.protobuf.ByteString opportunityId, java.lang.String placementId, com.google.protobuf.ByteString trackingToken, boolean isScarAd, java.lang.String scarQueryId, java.lang.String scarAdUnitId, java.lang.String scarAdString, boolean isOfferwallAd, java.lang.String offerwallPlacementName, com.unity3d.ads.adplayer.AdPlayer adPlayer, java.lang.String playerServerId, com.unity3d.ads.UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType, kotlinx.coroutines.flow.MutableStateFlow<kotlin.time.Duration> ttl, kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.AdObjectState> state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ttl, "ttl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        return new com.unity3d.ads.core.data.model.AdObject(opportunityId, placementId, trackingToken, isScarAd, scarQueryId, scarAdUnitId, scarAdString, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.core.data.model.AdObject)) {
            return false;
        }
        com.unity3d.ads.core.data.model.AdObject adObject = (com.unity3d.ads.core.data.model.AdObject) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.opportunityId, adObject.opportunityId) && kotlin.jvm.internal.Intrinsics.areEqual(this.placementId, adObject.placementId) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && kotlin.jvm.internal.Intrinsics.areEqual(this.scarQueryId, adObject.scarQueryId) && kotlin.jvm.internal.Intrinsics.areEqual(this.scarAdUnitId, adObject.scarAdUnitId) && kotlin.jvm.internal.Intrinsics.areEqual(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && kotlin.jvm.internal.Intrinsics.areEqual(this.offerwallPlacementName, adObject.offerwallPlacementName) && kotlin.jvm.internal.Intrinsics.areEqual(this.adPlayer, adObject.adPlayer) && kotlin.jvm.internal.Intrinsics.areEqual(this.playerServerId, adObject.playerServerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && kotlin.jvm.internal.Intrinsics.areEqual(this.ttl, adObject.ttl) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, adObject.state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z = this.isScarAd;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        java.lang.String str = this.scarQueryId;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.scarAdUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.scarAdString;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z2 = this.isOfferwallAd;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode4 + i3) * 31;
        java.lang.String str4 = this.offerwallPlacementName;
        int hashCode5 = (i4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.unity3d.ads.adplayer.AdPlayer adPlayer = this.adPlayer;
        int hashCode6 = (hashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        java.lang.String str5 = this.playerServerId;
        int hashCode7 = (((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z3 = this.isHeaderBidding;
        return ((((((hashCode7 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode();
    }

    public java.lang.String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public AdObject(com.google.protobuf.ByteString opportunityId, java.lang.String placementId, com.google.protobuf.ByteString trackingToken, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, java.lang.String str4, com.unity3d.ads.adplayer.AdPlayer adPlayer, java.lang.String str5, com.unity3d.ads.UnityAdsLoadOptions loadOptions, boolean z3, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType adType, kotlinx.coroutines.flow.MutableStateFlow<kotlin.time.Duration> ttl, kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.AdObjectState> state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ttl, "ttl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z2;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z3;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
    }

    public final com.google.protobuf.ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final java.lang.String getPlacementId() {
        return this.placementId;
    }

    public final com.google.protobuf.ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final void setTrackingToken(com.google.protobuf.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setScarAd(boolean z) {
        this.isScarAd = z;
    }

    public final java.lang.String getScarQueryId() {
        return this.scarQueryId;
    }

    public final void setScarQueryId(java.lang.String str) {
        this.scarQueryId = str;
    }

    public final java.lang.String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final void setScarAdUnitId(java.lang.String str) {
        this.scarAdUnitId = str;
    }

    public final java.lang.String getScarAdString() {
        return this.scarAdString;
    }

    public final void setScarAdString(java.lang.String str) {
        this.scarAdString = str;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final java.lang.String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final void setOfferwallPlacementName(java.lang.String str) {
        this.offerwallPlacementName = str;
    }

    public final com.unity3d.ads.adplayer.AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final java.lang.String getPlayerServerId() {
        return this.playerServerId;
    }

    public final void setPlayerServerId(java.lang.String str) {
        this.playerServerId = str;
    }

    public final com.unity3d.ads.UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public /* synthetic */ AdObject(com.google.protobuf.ByteString byteString, java.lang.String str, com.google.protobuf.ByteString byteString2, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, java.lang.String str5, com.unity3d.ads.adplayer.AdPlayer adPlayer, java.lang.String str6, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, boolean z3, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow, kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteString, str, byteString2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : adPlayer, (i & 1024) != 0 ? null : str6, unityAdsLoadOptions, z3, diagnosticAdType, (i & 16384) != 0 ? kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null) : mutableStateFlow, (i & 32768) != 0 ? kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.unity3d.ads.core.data.model.AdObjectState.INIT) : mutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<kotlin.time.Duration> getTtl() {
        return this.ttl;
    }

    public final void setTtl(kotlinx.coroutines.flow.MutableStateFlow<kotlin.time.Duration> mutableStateFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.ttl = mutableStateFlow;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.AdObjectState> getState() {
        return this.state;
    }

    public final void setState(kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.AdObjectState> mutableStateFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.state = mutableStateFlow;
    }
}
