package com.inmobi.media.ads.network.common.model;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/inmobi/media/ads/network/common/model/InlineParams;", "", "url", "", com.adjust.sdk.Constants.REFERRER, "listing", "overlay", "", "callerBundleId", "targetBundleId", "pingInWebView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getReferrer", "getListing", "getOverlay", "()Z", "getCallerBundleId", "setCallerBundleId", "(Ljava/lang/String;)V", "getTargetBundleId", "setTargetBundleId", "getPingInWebView", "setPingInWebView", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InlineParams {

    @com.inmobi.media.E8
    private java.lang.String callerBundleId;
    private final java.lang.String listing;
    private final boolean overlay;

    @com.inmobi.media.E8
    private boolean pingInWebView;
    private final java.lang.String referrer;

    @com.inmobi.media.E8
    private java.lang.String targetBundleId;
    private final java.lang.String url;

    public InlineParams() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public static /* synthetic */ com.inmobi.media.ads.network.common.model.InlineParams copy$default(com.inmobi.media.ads.network.common.model.InlineParams inlineParams, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = inlineParams.url;
        }
        if ((i & 2) != 0) {
            str2 = inlineParams.referrer;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = inlineParams.listing;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            z = inlineParams.overlay;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str4 = inlineParams.callerBundleId;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = inlineParams.targetBundleId;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            z2 = inlineParams.pingInWebView;
        }
        return inlineParams.copy(str, str6, str7, z3, str8, str9, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReferrer() {
        return this.referrer;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getListing() {
        return this.listing;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getOverlay() {
        return this.overlay;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCallerBundleId() {
        return this.callerBundleId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getTargetBundleId() {
        return this.targetBundleId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    public final com.inmobi.media.ads.network.common.model.InlineParams copy(java.lang.String url, java.lang.String referrer, java.lang.String listing, boolean overlay, java.lang.String callerBundleId, java.lang.String targetBundleId, boolean pingInWebView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new com.inmobi.media.ads.network.common.model.InlineParams(url, referrer, listing, overlay, callerBundleId, targetBundleId, pingInWebView);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.inmobi.media.ads.network.common.model.InlineParams)) {
            return false;
        }
        com.inmobi.media.ads.network.common.model.InlineParams inlineParams = (com.inmobi.media.ads.network.common.model.InlineParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, inlineParams.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.referrer, inlineParams.referrer) && kotlin.jvm.internal.Intrinsics.areEqual(this.listing, inlineParams.listing) && this.overlay == inlineParams.overlay && kotlin.jvm.internal.Intrinsics.areEqual(this.callerBundleId, inlineParams.callerBundleId) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetBundleId, inlineParams.targetBundleId) && this.pingInWebView == inlineParams.pingInWebView;
    }

    public final java.lang.String getCallerBundleId() {
        return this.callerBundleId;
    }

    public final java.lang.String getListing() {
        return this.listing;
    }

    public final boolean getOverlay() {
        return this.overlay;
    }

    public final boolean getPingInWebView() {
        return this.pingInWebView;
    }

    public final java.lang.String getReferrer() {
        return this.referrer;
    }

    public final java.lang.String getTargetBundleId() {
        return this.targetBundleId;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        java.lang.String str = this.referrer;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.listing;
        int m = (kotlin.UByte$$ExternalSyntheticBackport0.m(this.overlay) + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        java.lang.String str3 = this.callerBundleId;
        int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.targetBundleId;
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.pingInWebView) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final void setCallerBundleId(java.lang.String str) {
        this.callerBundleId = str;
    }

    public final void setPingInWebView(boolean z) {
        this.pingInWebView = z;
    }

    public final void setTargetBundleId(java.lang.String str) {
        this.targetBundleId = str;
    }

    public java.lang.String toString() {
        return "InlineParams(url=" + this.url + ", referrer=" + this.referrer + ", listing=" + this.listing + ", overlay=" + this.overlay + ", callerBundleId=" + this.callerBundleId + ", targetBundleId=" + this.targetBundleId + ", pingInWebView=" + this.pingInWebView + ")";
    }

    public InlineParams(java.lang.String url, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.referrer = str;
        this.listing = str2;
        this.overlay = z;
        this.callerBundleId = str3;
        this.targetBundleId = str4;
        this.pingInWebView = z2;
    }

    public /* synthetic */ InlineParams(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "https://play.google.com/d?" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null, (i & 64) != 0 ? false : z2);
    }
}
