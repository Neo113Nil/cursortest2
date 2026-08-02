package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J¬\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010'R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010)R\u001a\u0010\u0012\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bI\u0010)R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010,R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\bO\u00100"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;", "", "", "id", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;", "channel", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "smallIcon", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationProgress;", "progress", "", "autoCancel", "ongoing", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;", "priority", "", "metadata", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "customViews", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;Ljava/util/List;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationProgress;ZZLcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;Ljava/util/Map;Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", "component7", "()Ljava/util/List;", "component8", "()Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationProgress;", "component9", "()Z", "component10", "component11", "()Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;", "component12", "()Ljava/util/Map;", "component13", "()Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;Ljava/util/List;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationProgress;ZZLcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;Ljava/util/Map;Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;", "getChannel", "getTitle", "getBody", "getSmallIcon", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", "getStyle", "Ljava/util/List;", "getActions", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationProgress;", "getProgress", "Z", "getAutoCancel", "getOngoing", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;", "getPriority", "Ljava/util/Map;", "getMetadata", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews;", "getCustomViews"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NotificationData {
    private final java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> actions;
    private final boolean autoCancel;
    private final java.lang.String body;
    private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel channel;
    private final com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews customViews;
    private final java.lang.String id;
    private final java.util.Map<java.lang.String, java.lang.String> metadata;
    private final boolean ongoing;
    private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority priority;
    private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress progress;
    private final java.lang.String smallIcon;
    private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle style;
    private final java.lang.String title;

    public NotificationData(java.lang.String str, com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel notificationChannel, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle notificationStyle, java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> list, com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress notificationProgress, boolean z, boolean z2, com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority, java.util.Map<java.lang.String, java.lang.String> map, com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews customNotificationViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPriority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.id = str;
        this.channel = notificationChannel;
        this.title = str2;
        this.body = str3;
        this.smallIcon = str4;
        this.style = notificationStyle;
        this.actions = list;
        this.progress = notificationProgress;
        this.autoCancel = z;
        this.ongoing = z2;
        this.priority = notificationPriority;
        this.metadata = map;
        this.customViews = customNotificationViews;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel getChannel() {
        return this.channel;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getBody() {
        return this.body;
    }

    public final java.lang.String getSmallIcon() {
        return this.smallIcon;
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle getStyle() {
        return this.style;
    }

    public /* synthetic */ NotificationData(java.lang.String str, com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel notificationChannel, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle notificationStyle, java.util.List list, com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress notificationProgress, boolean z, boolean z2, com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority, java.util.Map map, com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews customNotificationViews, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, notificationChannel, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : notificationStyle, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : notificationProgress, (i & 256) != 0 ? true : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.DEFAULT : notificationPriority, (i & 2048) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 4096) != 0 ? null : customNotificationViews);
    }

    public final java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> getActions() {
        return this.actions;
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress getProgress() {
        return this.progress;
    }

    public final boolean getAutoCancel() {
        return this.autoCancel;
    }

    public final boolean getOngoing() {
        return this.ongoing;
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority getPriority() {
        return this.priority;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return this.metadata;
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews getCustomViews() {
        return this.customViews;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel notificationChannel = this.channel;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.body;
        java.lang.String str4 = this.smallIcon;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle notificationStyle = this.style;
        java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> list = this.actions;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress notificationProgress = this.progress;
        boolean z = this.autoCancel;
        boolean z2 = this.ongoing;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority = this.priority;
        java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
        com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews customNotificationViews = this.customViews;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationData(id=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(notificationChannel);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", body=");
        sb.append(str3);
        sb.append(", smallIcon=");
        sb.append(str4);
        sb.append(", style=");
        sb.append(notificationStyle);
        sb.append(", actions=");
        sb.append(list);
        sb.append(", progress=");
        sb.append(notificationProgress);
        sb.append(", autoCancel=");
        sb.append(z);
        sb.append(", ongoing=");
        sb.append(z2);
        sb.append(", priority=");
        sb.append(notificationPriority);
        sb.append(", metadata=");
        sb.append(map);
        sb.append(", customViews=");
        sb.append(customNotificationViews);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.channel.hashCode();
        int hashCode3 = this.title.hashCode();
        int hashCode4 = this.body.hashCode();
        java.lang.String str = this.smallIcon;
        int hashCode5 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle notificationStyle = this.style;
        int hashCode6 = notificationStyle == null ? 0 : notificationStyle.hashCode();
        int hashCode7 = this.actions.hashCode();
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress notificationProgress = this.progress;
        int hashCode8 = notificationProgress == null ? 0 : notificationProgress.hashCode();
        int hashCode9 = java.lang.Boolean.hashCode(this.autoCancel);
        int hashCode10 = java.lang.Boolean.hashCode(this.ongoing);
        int hashCode11 = this.priority.hashCode();
        int hashCode12 = this.metadata.hashCode();
        com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews customNotificationViews = this.customViews;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (customNotificationViews != null ? customNotificationViews.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationData)) {
            return false;
        }
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationData notificationData = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, notificationData.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.channel, notificationData.channel) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, notificationData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, notificationData.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.smallIcon, notificationData.smallIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.style, notificationData.style) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, notificationData.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.progress, notificationData.progress) && this.autoCancel == notificationData.autoCancel && this.ongoing == notificationData.ongoing && this.priority == notificationData.priority && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, notificationData.metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.customViews, notificationData.customViews);
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationData copy(java.lang.String id, com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel channel, java.lang.String title, java.lang.String body, java.lang.String smallIcon, com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle style, java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> actions, com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress progress, boolean autoCancel, boolean ongoing, com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority priority, java.util.Map<java.lang.String, java.lang.String> metadata, com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews customViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData(id, channel, title, body, smallIcon, style, actions, progress, autoCancel, ongoing, priority, metadata, customViews);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAutoCancel() {
        return this.autoCancel;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationProgress getProgress() {
        return this.progress;
    }

    public final java.util.List<com.paypal.oslo.core.pushnotification.domain.notification.NotificationAction> component7() {
        return this.actions;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle getStyle() {
        return this.style;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSmallIcon() {
        return this.smallIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel getChannel() {
        return this.channel;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews getCustomViews() {
        return this.customViews;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component12() {
        return this.metadata;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority getPriority() {
        return this.priority;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getOngoing() {
        return this.ongoing;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
