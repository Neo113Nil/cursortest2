package com.inmobi.adquality.models;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/inmobi/adquality/models/AdQualityResult;", "", "imageLocation", "", "sdkModelResult", "beaconUrl", "extras", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageLocation", "()Ljava/lang/String;", "setImageLocation", "(Ljava/lang/String;)V", "getSdkModelResult", "setSdkModelResult", "getBeaconUrl", "getExtras", "setExtras", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdQualityResult {
    private final java.lang.String beaconUrl;
    private java.lang.String extras;
    private java.lang.String imageLocation;
    private java.lang.String sdkModelResult;

    public AdQualityResult(java.lang.String imageLocation, java.lang.String str, java.lang.String beaconUrl, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ com.inmobi.adquality.models.AdQualityResult copy$default(com.inmobi.adquality.models.AdQualityResult adQualityResult, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getImageLocation() {
        return this.imageLocation;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSdkModelResult() {
        return this.sdkModelResult;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBeaconUrl() {
        return this.beaconUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExtras() {
        return this.extras;
    }

    public final com.inmobi.adquality.models.AdQualityResult copy(java.lang.String imageLocation, java.lang.String sdkModelResult, java.lang.String beaconUrl, java.lang.String extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        return new com.inmobi.adquality.models.AdQualityResult(imageLocation, sdkModelResult, beaconUrl, extras);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.inmobi.adquality.models.AdQualityResult)) {
            return false;
        }
        com.inmobi.adquality.models.AdQualityResult adQualityResult = (com.inmobi.adquality.models.AdQualityResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.imageLocation, adQualityResult.imageLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkModelResult, adQualityResult.sdkModelResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.beaconUrl, adQualityResult.beaconUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, adQualityResult.extras);
    }

    public final java.lang.String getBeaconUrl() {
        return this.beaconUrl;
    }

    public final java.lang.String getExtras() {
        return this.extras;
    }

    public final java.lang.String getImageLocation() {
        return this.imageLocation;
    }

    public final java.lang.String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int hashCode = this.imageLocation.hashCode() * 31;
        java.lang.String str = this.sdkModelResult;
        int hashCode2 = (this.beaconUrl.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        java.lang.String str2 = this.extras;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(java.lang.String str) {
        this.extras = str;
    }

    public final void setImageLocation(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(java.lang.String str) {
        this.sdkModelResult = str;
    }

    public java.lang.String toString() {
        return "AdQualityResult(imageLocation=" + this.imageLocation + ", sdkModelResult=" + this.sdkModelResult + ", beaconUrl=" + this.beaconUrl + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ AdQualityResult(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
