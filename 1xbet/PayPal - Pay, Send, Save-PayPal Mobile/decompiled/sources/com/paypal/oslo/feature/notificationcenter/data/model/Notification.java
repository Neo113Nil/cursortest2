package com.paypal.oslo.feature.notificationcenter.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0094\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b3\u0010\u0013R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b4\u0010\u0013R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b5\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b6\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b7\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/data/model/Notification;", "", "", "sectionTag", "campaignId", "notificationId", "instanceId", "name", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "iconType", "iconIdentifier", "deepLink", "status", "publishedTimeStamp", "trackingToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/data/model/Notification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSectionTag", "getCampaignId", "getNotificationId", "getInstanceId", "getName", "getTitle", "getDescription", "getIconType", "getIconIdentifier", "getDeepLink", "getStatus", "getPublishedTimeStamp", "getTrackingToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Notification {
    public static final int $stable = 0;
    private final java.lang.String campaignId;
    private final java.lang.String deepLink;
    private final java.lang.String description;
    private final java.lang.String iconIdentifier;
    private final java.lang.String iconType;
    private final java.lang.String instanceId;
    private final java.lang.String name;
    private final java.lang.String notificationId;
    private final java.lang.String publishedTimeStamp;
    private final java.lang.String sectionTag;
    private final java.lang.String status;
    private final java.lang.String title;
    private final java.lang.String trackingToken;

    public Notification(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "");
        this.sectionTag = str;
        this.campaignId = str2;
        this.notificationId = str3;
        this.instanceId = str4;
        this.name = str5;
        this.title = str6;
        this.description = str7;
        this.iconType = str8;
        this.iconIdentifier = str9;
        this.deepLink = str10;
        this.status = str11;
        this.publishedTimeStamp = str12;
        this.trackingToken = str13;
    }

    public /* synthetic */ Notification(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public final java.lang.String getSectionTag() {
        return this.sectionTag;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String getNotificationId() {
        return this.notificationId;
    }

    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getIconType() {
        return this.iconType;
    }

    public final java.lang.String getIconIdentifier() {
        return this.iconIdentifier;
    }

    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getPublishedTimeStamp() {
        return this.publishedTimeStamp;
    }

    public final java.lang.String getTrackingToken() {
        return this.trackingToken;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sectionTag;
        java.lang.String str2 = this.campaignId;
        java.lang.String str3 = this.notificationId;
        java.lang.String str4 = this.instanceId;
        java.lang.String str5 = this.name;
        java.lang.String str6 = this.title;
        java.lang.String str7 = this.description;
        java.lang.String str8 = this.iconType;
        java.lang.String str9 = this.iconIdentifier;
        java.lang.String str10 = this.deepLink;
        java.lang.String str11 = this.status;
        java.lang.String str12 = this.publishedTimeStamp;
        java.lang.String str13 = this.trackingToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Notification(sectionTag=");
        sb.append(str);
        sb.append(", campaignId=");
        sb.append(str2);
        sb.append(", notificationId=");
        sb.append(str3);
        sb.append(", instanceId=");
        sb.append(str4);
        sb.append(", name=");
        sb.append(str5);
        sb.append(", title=");
        sb.append(str6);
        sb.append(", description=");
        sb.append(str7);
        sb.append(", iconType=");
        sb.append(str8);
        sb.append(", iconIdentifier=");
        sb.append(str9);
        sb.append(", deepLink=");
        sb.append(str10);
        sb.append(", status=");
        sb.append(str11);
        sb.append(", publishedTimeStamp=");
        sb.append(str12);
        sb.append(", trackingToken=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sectionTag.hashCode();
        java.lang.String str = this.campaignId;
        return (((((((((((((((((((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.notificationId.hashCode()) * 31) + this.instanceId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconType.hashCode()) * 31) + this.iconIdentifier.hashCode()) * 31) + this.deepLink.hashCode()) * 31) + this.status.hashCode()) * 31) + this.publishedTimeStamp.hashCode()) * 31) + this.trackingToken.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.notificationcenter.data.model.Notification)) {
            return false;
        }
        com.paypal.oslo.feature.notificationcenter.data.model.Notification notification = (com.paypal.oslo.feature.notificationcenter.data.model.Notification) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sectionTag, notification.sectionTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, notification.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, notification.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instanceId, notification.instanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, notification.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, notification.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, notification.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconType, notification.iconType) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconIdentifier, notification.iconIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, notification.deepLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, notification.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.publishedTimeStamp, notification.publishedTimeStamp) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingToken, notification.trackingToken);
    }

    public final com.paypal.oslo.feature.notificationcenter.data.model.Notification copy(java.lang.String sectionTag, java.lang.String campaignId, java.lang.String notificationId, java.lang.String instanceId, java.lang.String name2, java.lang.String title, java.lang.String description, java.lang.String iconType, java.lang.String iconIdentifier, java.lang.String deepLink, java.lang.String status, java.lang.String publishedTimeStamp, java.lang.String trackingToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionTag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publishedTimeStamp, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingToken, "");
        return new com.paypal.oslo.feature.notificationcenter.data.model.Notification(sectionTag, campaignId, notificationId, instanceId, name2, title, description, iconType, iconIdentifier, deepLink, status, publishedTimeStamp, trackingToken);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getIconIdentifier() {
        return this.iconIdentifier;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getIconType() {
        return this.iconType;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNotificationId() {
        return this.notificationId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getPublishedTimeStamp() {
        return this.publishedTimeStamp;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSectionTag() {
        return this.sectionTag;
    }
}
