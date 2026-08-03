package com.unity3d.ads.core.domain.offerwall;

/* compiled from: OfferwallEventData.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "", "offerwallEvent", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "placementName", "", "errorMessage", "errorCode", "", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "()Ljava/lang/String;", "getOfferwallEvent", "()Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "getPlacementName", "component1", "component2", "component3", "component4", "copy", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OfferwallEventData {
    private final java.lang.Integer errorCode;
    private final java.lang.String errorMessage;
    private final com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent;
    private final java.lang.String placementName;

    public static /* synthetic */ com.unity3d.ads.core.domain.offerwall.OfferwallEventData copy$default(com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData, com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            offerwallEvent = offerwallEventData.offerwallEvent;
        }
        if ((i & 2) != 0) {
            str = offerwallEventData.placementName;
        }
        if ((i & 4) != 0) {
            str2 = offerwallEventData.errorMessage;
        }
        if ((i & 8) != 0) {
            num = offerwallEventData.errorCode;
        }
        return offerwallEventData.copy(offerwallEvent, str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final com.unity3d.services.ads.offerwall.OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlacementName() {
        return this.placementName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getErrorCode() {
        return this.errorCode;
    }

    public final com.unity3d.ads.core.domain.offerwall.OfferwallEventData copy(com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent, java.lang.String placementName, java.lang.String errorMessage, java.lang.Integer errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerwallEvent, "offerwallEvent");
        return new com.unity3d.ads.core.domain.offerwall.OfferwallEventData(offerwallEvent, placementName, errorMessage, errorCode);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.core.domain.offerwall.OfferwallEventData)) {
            return false;
        }
        com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) other;
        return this.offerwallEvent == offerwallEventData.offerwallEvent && kotlin.jvm.internal.Intrinsics.areEqual(this.placementName, offerwallEventData.placementName) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, offerwallEventData.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, offerwallEventData.errorCode);
    }

    public int hashCode() {
        int hashCode = this.offerwallEvent.hashCode() * 31;
        java.lang.String str = this.placementName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.errorCode;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OfferwallEventData(offerwallEvent=" + this.offerwallEvent + ", placementName=" + this.placementName + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public OfferwallEventData(com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerwallEvent, "offerwallEvent");
        this.offerwallEvent = offerwallEvent;
        this.placementName = str;
        this.errorMessage = str2;
        this.errorCode = num;
    }

    public /* synthetic */ OfferwallEventData(com.unity3d.services.ads.offerwall.OfferwallEvent offerwallEvent, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(offerwallEvent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }

    public final com.unity3d.services.ads.offerwall.OfferwallEvent getOfferwallEvent() {
        return this.offerwallEvent;
    }

    public final java.lang.String getPlacementName() {
        return this.placementName;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.Integer getErrorCode() {
        return this.errorCode;
    }
}
