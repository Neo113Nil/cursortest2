package com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ^\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\rR\u0011\u0010'\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;", "", "", "notificationId", "campaignId", "contentId", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "deepLink", "trackingToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/CriticalAlertData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId", "getCampaignId", "getContentId", "getTitle", "getBody", "getDeepLink", "getTrackingToken", "getAlertIdentifier", "alertIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CriticalAlertData {
    public static final int $stable = 0;
    private final java.lang.String body;
    private final java.lang.String campaignId;
    private final java.lang.String contentId;
    private final java.lang.String deepLink;
    private final java.lang.String notificationId;
    private final java.lang.String title;
    private final java.lang.String trackingToken;

    public CriticalAlertData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.notificationId = str;
        this.campaignId = str2;
        this.contentId = str3;
        this.title = str4;
        this.body = str5;
        this.deepLink = str6;
        this.trackingToken = str7;
    }

    public final java.lang.String getNotificationId() {
        return this.notificationId;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String getContentId() {
        return this.contentId;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    public final java.lang.String getTrackingToken() {
        return this.trackingToken;
    }

    public final java.lang.String getAlertIdentifier() {
        java.lang.String str = this.notificationId;
        if (str == null) {
            str = this.trackingToken;
        }
        return str == null ? "" : str;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.notificationId;
        java.lang.String str2 = this.campaignId;
        java.lang.String str3 = this.contentId;
        java.lang.String str4 = this.title;
        java.lang.String str5 = this.body;
        java.lang.String str6 = this.deepLink;
        java.lang.String str7 = this.trackingToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CriticalAlertData(notificationId=");
        sb.append(str);
        sb.append(", campaignId=");
        sb.append(str2);
        sb.append(", contentId=");
        sb.append(str3);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", body=");
        sb.append(str5);
        sb.append(", deepLink=");
        sb.append(str6);
        sb.append(", trackingToken=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.notificationId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.campaignId;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.contentId;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        int hashCode4 = this.title.hashCode();
        int hashCode5 = this.body.hashCode();
        int hashCode6 = this.deepLink.hashCode();
        java.lang.String str4 = this.trackingToken;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData)) {
            return false;
        }
        com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData = (com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, criticalAlertData.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, criticalAlertData.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentId, criticalAlertData.contentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, criticalAlertData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, criticalAlertData.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, criticalAlertData.deepLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingToken, criticalAlertData.trackingToken);
    }

    public final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData copy(java.lang.String notificationId, java.lang.String campaignId, java.lang.String contentId, java.lang.String title, java.lang.String body, java.lang.String deepLink, java.lang.String trackingToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData(notificationId, campaignId, contentId, title, body, deepLink, trackingToken);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContentId() {
        return this.contentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNotificationId() {
        return this.notificationId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData copy$default(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = criticalAlertData.notificationId;
        }
        if ((i & 2) != 0) {
            str2 = criticalAlertData.campaignId;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = criticalAlertData.contentId;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = criticalAlertData.title;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = criticalAlertData.body;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = criticalAlertData.deepLink;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = criticalAlertData.trackingToken;
        }
        return criticalAlertData.copy(str, str8, str9, str10, str11, str12, str7);
    }
}
