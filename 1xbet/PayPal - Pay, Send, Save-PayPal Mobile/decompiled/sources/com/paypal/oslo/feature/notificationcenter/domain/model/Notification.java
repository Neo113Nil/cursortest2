package com.paypal.oslo.feature.notificationcenter.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0017J¤\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b=\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b>\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010$R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bC\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "", "", "id", "sectionTag", "campaignId", "notificationId", "instanceId", "name", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;", "iconType", "iconIdentifier", "deepLink", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "status", "", "createdTime", "trackingToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;", "component10", "component11", "component12", "()Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "component13", "()J", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;JLjava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getSectionTag", "getCampaignId", "getNotificationId", "getInstanceId", "getName", "getTitle", "getDescription", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;", "getIconType", "getIconIdentifier", "getDeepLink", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "getStatus", "J", "getCreatedTime", "getTrackingToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Notification {
    public static final int $stable = 0;
    private final java.lang.String campaignId;
    private final long createdTime;
    private final java.lang.String deepLink;
    private final java.lang.String description;
    private final java.lang.String iconIdentifier;
    private final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType iconType;
    private final java.lang.String id;
    private final java.lang.String instanceId;
    private final java.lang.String name;
    private final java.lang.String notificationId;
    private final java.lang.String sectionTag;
    private final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status;
    private final java.lang.String title;
    private final java.lang.String trackingToken;

    public Notification(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType, java.lang.String str9, java.lang.String str10, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, long j, java.lang.String str11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationIconType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationStatus, "");
        this.id = str;
        this.sectionTag = str2;
        this.campaignId = str3;
        this.notificationId = str4;
        this.instanceId = str5;
        this.name = str6;
        this.title = str7;
        this.description = str8;
        this.iconType = notificationIconType;
        this.iconIdentifier = str9;
        this.deepLink = str10;
        this.status = notificationStatus;
        this.createdTime = j;
        this.trackingToken = str11;
    }

    public /* synthetic */ Notification(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType, java.lang.String str9, java.lang.String str10, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, long j, java.lang.String str11, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? null : str3, str4, str5, str6, str7, str8, notificationIconType, str9, str10, notificationStatus, j, str11);
    }

    public final java.lang.String getId() {
        return this.id;
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

    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType getIconType() {
        return this.iconType;
    }

    public final java.lang.String getIconIdentifier() {
        return this.iconIdentifier;
    }

    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus getStatus() {
        return this.status;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final java.lang.String getTrackingToken() {
        return this.trackingToken;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.sectionTag;
        java.lang.String str3 = this.campaignId;
        java.lang.String str4 = this.notificationId;
        java.lang.String str5 = this.instanceId;
        java.lang.String str6 = this.name;
        java.lang.String str7 = this.title;
        java.lang.String str8 = this.description;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType = this.iconType;
        java.lang.String str9 = this.iconIdentifier;
        java.lang.String str10 = this.deepLink;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus = this.status;
        long j = this.createdTime;
        java.lang.String str11 = this.trackingToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Notification(id=");
        sb.append(str);
        sb.append(", sectionTag=");
        sb.append(str2);
        sb.append(", campaignId=");
        sb.append(str3);
        sb.append(", notificationId=");
        sb.append(str4);
        sb.append(", instanceId=");
        sb.append(str5);
        sb.append(", name=");
        sb.append(str6);
        sb.append(", title=");
        sb.append(str7);
        sb.append(", description=");
        sb.append(str8);
        sb.append(", iconType=");
        sb.append(notificationIconType);
        sb.append(", iconIdentifier=");
        sb.append(str9);
        sb.append(", deepLink=");
        sb.append(str10);
        sb.append(", status=");
        sb.append(notificationStatus);
        sb.append(", createdTime=");
        sb.append(j);
        sb.append(", trackingToken=");
        sb.append(str11);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.sectionTag.hashCode();
        java.lang.String str = this.campaignId;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.notificationId;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        int hashCode5 = this.instanceId.hashCode();
        int hashCode6 = this.name.hashCode();
        int hashCode7 = this.title.hashCode();
        int hashCode8 = this.description.hashCode();
        int hashCode9 = this.iconType.hashCode();
        java.lang.String str3 = this.iconIdentifier;
        int hashCode10 = str3 == null ? 0 : str3.hashCode();
        int hashCode11 = this.deepLink.hashCode();
        int hashCode12 = this.status.hashCode();
        int hashCode13 = java.lang.Long.hashCode(this.createdTime);
        java.lang.String str4 = this.trackingToken;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.notificationcenter.domain.model.Notification)) {
            return false;
        }
        com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification = (com.paypal.oslo.feature.notificationcenter.domain.model.Notification) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, notification.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.sectionTag, notification.sectionTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, notification.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, notification.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instanceId, notification.instanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, notification.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, notification.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, notification.description) && this.iconType == notification.iconType && kotlin.jvm.internal.Intrinsics.areEqual(this.iconIdentifier, notification.iconIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, notification.deepLink) && this.status == notification.status && this.createdTime == notification.createdTime && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingToken, notification.trackingToken);
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.Notification copy(java.lang.String id, java.lang.String sectionTag, java.lang.String campaignId, java.lang.String notificationId, java.lang.String instanceId, java.lang.String name2, java.lang.String title, java.lang.String description, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType iconType, java.lang.String iconIdentifier, java.lang.String deepLink, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status, long createdTime, java.lang.String trackingToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionTag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.notificationcenter.domain.model.Notification(id, sectionTag, campaignId, notificationId, instanceId, name2, title, description, iconType, iconIdentifier, deepLink, status, createdTime, trackingToken);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType getIconType() {
        return this.iconType;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getInstanceId() {
        return this.instanceId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getNotificationId() {
        return this.notificationId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSectionTag() {
        return this.sectionTag;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component13, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus getStatus() {
        return this.status;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getIconIdentifier() {
        return this.iconIdentifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
