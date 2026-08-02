package com.paypal.oslo.feature.notificationcenter.data.mapper;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/data/mapper/NotificationMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;", "responseData", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationError;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationData;", "processNotificationCenterResponse$notification_center_prodRelease", "(Lcom/paypal/oslo/feature/notificationcenter/graphql/GetNotificationCenterNotificationsQuery$Data;)Larrow/core/Either;", "p0", "", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;)J", "Lcom/paypal/oslo/feature/notificationcenter/graphql/UpdateNotificationsTrackingStatusMutation$Data;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/UpdateNotificationsTrackingStatus;", "processUpdateNotificationsTrackingStatusResponse", "(Lcom/paypal/oslo/feature/notificationcenter/graphql/UpdateNotificationsTrackingStatusMutation$Data;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/UpdateNotificationsTrackingStatus;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationMapper {
    public static final int $stable = 0;
    private static final java.util.Comparator<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper.Companion Companion = new com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper.Companion(null);

    @javax.inject.Inject
    public NotificationMapper() {
    }

    private static long Camera2StreamConfigurationMap(java.lang.Object p0) {
        try {
            return java.time.Instant.parse(java.lang.String.valueOf(p0)).toEpochMilli();
        } catch (java.lang.Exception unused) {
            return -1L;
        }
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus processUpdateNotificationsTrackingStatusResponse(com.paypal.oslo.feature.notificationcenter.graphql.UpdateNotificationsTrackingStatusMutation.Data responseData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseData, "");
        return new com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.INSTANCE.fromString(responseData.getUpdateNotificationsTrackingStatus().getStatus().getRawValue()), responseData.getUpdateNotificationsTrackingStatus().getSuccess());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/data/mapper/NotificationMapper$Companion;", "", "<init>", "()V", "Ljava/util/Comparator;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "Lkotlin/getOutputStallDuration;", "Camera2StreamConfigurationMap", "Ljava/util/Comparator;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final java.util.Comparator comparator = new java.util.Comparator() { // from class: com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.paypal.oslo.feature.notificationcenter.domain.model.Notification) t).getCreatedTime() == -1), java.lang.Boolean.valueOf(((com.paypal.oslo.feature.notificationcenter.domain.model.Notification) t2).getCreatedTime() == -1));
            }
        };
        Camera2StreamConfigurationMap = new java.util.Comparator() { // from class: com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper$special$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((com.paypal.oslo.feature.notificationcenter.domain.model.Notification) t2).getCreatedTime()), java.lang.Long.valueOf(((com.paypal.oslo.feature.notificationcenter.domain.model.Notification) t).getCreatedTime()));
            }
        };
    }

    public final arrow.core.Either<com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData> processNotificationCenterResponse$notification_center_prodRelease(com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Data responseData) {
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseData, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            try {
                java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section> sections = responseData.getNotifications().getSections();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sections, 10));
                for (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Section section : sections) {
                    arrayList.add(new com.paypal.oslo.feature.notificationcenter.domain.model.Section(section.getTag(), section.getTitle()));
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.List<com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification> notifications = responseData.getNotifications().getNotifications();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(notifications, 10));
                for (com.paypal.oslo.feature.notificationcenter.graphql.GetNotificationCenterNotificationsQuery.Notification notification : notifications) {
                    java.lang.String campaignId = notification.getCampaignId();
                    if (campaignId == null) {
                        campaignId = "";
                    }
                    java.lang.String notificationId = notification.getNotificationId();
                    if (notificationId == null) {
                        notificationId = "";
                    }
                    java.lang.String contentId = notification.getContentId();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("campaignId_");
                    sb.append(campaignId);
                    sb.append("_notificationId_");
                    sb.append(notificationId);
                    sb.append("_contentId_");
                    sb.append(contentId);
                    java.lang.String obj = sb.toString();
                    java.lang.String sectionTag = notification.getSectionTag();
                    java.lang.String campaignId2 = notification.getCampaignId();
                    java.lang.String notificationId2 = notification.getNotificationId();
                    java.lang.String contentId2 = notification.getContentId();
                    java.lang.String name2 = notification.getName();
                    java.lang.String title = notification.getTitle();
                    java.lang.String body = notification.getBody();
                    com.paypal.oslo.api.graphql.schema.type.NotificationIconType iconType = notification.getIconType();
                    if (iconType == null || (notificationIconType = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.INSTANCE.fromString(iconType.name())) == null) {
                        notificationIconType = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.UNKNOWN;
                    }
                    arrayList3.add(new com.paypal.oslo.feature.notificationcenter.domain.model.Notification(obj, sectionTag, campaignId2, notificationId2, contentId2, name2, title, body, notificationIconType, notification.getIconIdentifier(), notification.getDeepLink().toString(), com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.INSTANCE.fromString(notification.getStatus().name()), Camera2StreamConfigurationMap(notification.getCreatedTime()), notification.getTrackingToken()));
                }
                com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData notificationData = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData(arrayList2, kotlin.collections.CollectionsKt.sortedWith(arrayList3, Camera2StreamConfigurationMap));
                defaultRaise.complete();
                return new arrow.core.Either.Right(notificationData);
            } catch (java.lang.Exception e) {
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("Error processing GraphQL response: ");
                sb2.append(message);
                defaultRaise2.raise(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError.ParsingError(sb2.toString()));
                throw new kotlin.KotlinNothingValueException();
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
