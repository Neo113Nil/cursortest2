package com.paypal.oslo.feature.notificationcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/UpdateNotificationsTrackingStatusUseCase;", "", "Lcom/paypal/oslo/feature/notificationcenter/domain/repository/NotificationRepository;", "notificationRepository", "<init>", "(Lcom/paypal/oslo/feature/notificationcenter/domain/repository/NotificationRepository;)V", "", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "notifications", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "status", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationError;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/UpdateNotificationsTrackingStatus;", "invoke", "(Ljava/util/List;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/notificationcenter/domain/repository/NotificationRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateNotificationsTrackingStatusUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UpdateNotificationsTrackingStatusUseCase(com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository notificationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationRepository, "");
        this.getHighSpeedVideoFpsRangesFor = notificationRepository;
    }

    public final java.lang.Object invoke(java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError, com.paypal.oslo.feature.notificationcenter.domain.model.UpdateNotificationsTrackingStatus>> continuation) {
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.notificationcenter.domain.model.Notification> list2 = list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            java.lang.String trackingToken = ((com.paypal.oslo.feature.notificationcenter.domain.model.Notification) it.next()).getTrackingToken();
            if (trackingToken != null) {
                arrayList2.add(trackingToken);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification : list2) {
                java.lang.String notificationId = notification.getNotificationId();
                java.lang.String instanceId = notification.getInstanceId();
                java.lang.String campaignId = notification.getCampaignId();
                if (campaignId == null) {
                    campaignId = "";
                }
                arrayList4.add(new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput(notificationId, instanceId, campaignId));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return this.getHighSpeedVideoFpsRangesFor.updateNotificationsTrackingStatus(arrayList3, arrayList, notificationStatus.getValue(), continuation);
    }
}
