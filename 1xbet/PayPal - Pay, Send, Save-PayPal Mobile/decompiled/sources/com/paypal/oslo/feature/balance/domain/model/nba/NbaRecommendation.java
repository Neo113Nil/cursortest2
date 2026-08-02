package com.paypal.oslo.feature.balance.domain.model.nba;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0014\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJr\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0011R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b*\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b+\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b,\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\r\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "", "", "trackingId", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/balance/api/models/nba/NbaIcon;", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaIcon;", "icon", "destinationId", "url", "navigationType", "", "isAuthenticationRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/api/models/nba/NbaIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/api/models/nba/NbaIcon;", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/api/models/nba/NbaIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTrackingId", "getTitle", "getDescription", "Lcom/paypal/oslo/feature/balance/api/models/nba/NbaIcon;", "getIcon", "getDestinationId", "getUrl", "getNavigationType", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NbaRecommendation {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final java.lang.String destinationId;
    private final com.paypal.oslo.feature.balance.api.models.nba.NbaIcon icon;
    private final java.lang.Boolean isAuthenticationRequired;
    private final java.lang.String navigationType;
    private final java.lang.String title;
    private final java.lang.String trackingId;
    private final java.lang.String url;

    public NbaRecommendation(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.api.models.nba.NbaIcon nbaIcon, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.trackingId = str;
        this.title = str2;
        this.description = str3;
        this.icon = nbaIcon;
        this.destinationId = str4;
        this.url = str5;
        this.navigationType = str6;
        this.isAuthenticationRequired = bool;
    }

    public final java.lang.String getTrackingId() {
        return this.trackingId;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.balance.api.models.nba.NbaIcon getIcon() {
        return this.icon;
    }

    public final java.lang.String getDestinationId() {
        return this.destinationId;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getNavigationType() {
        return this.navigationType;
    }

    public final java.lang.Boolean isAuthenticationRequired() {
        return this.isAuthenticationRequired;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.trackingId;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.description;
        com.paypal.oslo.feature.balance.api.models.nba.NbaIcon nbaIcon = this.icon;
        java.lang.String str4 = this.destinationId;
        java.lang.String str5 = this.url;
        java.lang.String str6 = this.navigationType;
        java.lang.Boolean bool = this.isAuthenticationRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NbaRecommendation(trackingId=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", icon=");
        sb.append(nbaIcon);
        sb.append(", destinationId=");
        sb.append(str4);
        sb.append(", url=");
        sb.append(str5);
        sb.append(", navigationType=");
        sb.append(str6);
        sb.append(", isAuthenticationRequired=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.trackingId.hashCode();
        int hashCode2 = this.title.hashCode();
        java.lang.String str = this.description;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.balance.api.models.nba.NbaIcon nbaIcon = this.icon;
        int hashCode4 = nbaIcon == null ? 0 : nbaIcon.hashCode();
        java.lang.String str2 = this.destinationId;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.url;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.navigationType;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        java.lang.Boolean bool = this.isAuthenticationRequired;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation nbaRecommendation = (com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.trackingId, nbaRecommendation.trackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, nbaRecommendation.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, nbaRecommendation.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, nbaRecommendation.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationId, nbaRecommendation.destinationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, nbaRecommendation.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigationType, nbaRecommendation.navigationType) && kotlin.jvm.internal.Intrinsics.areEqual(this.isAuthenticationRequired, nbaRecommendation.isAuthenticationRequired);
    }

    public final com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation copy(java.lang.String trackingId, java.lang.String title, java.lang.String description, com.paypal.oslo.feature.balance.api.models.nba.NbaIcon icon, java.lang.String destinationId, java.lang.String url, java.lang.String navigationType, java.lang.Boolean isAuthenticationRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation(trackingId, title, description, icon, destinationId, url, navigationType, isAuthenticationRequired);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Boolean getIsAuthenticationRequired() {
        return this.isAuthenticationRequired;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getNavigationType() {
        return this.navigationType;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.balance.api.models.nba.NbaIcon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTrackingId() {
        return this.trackingId;
    }
}
