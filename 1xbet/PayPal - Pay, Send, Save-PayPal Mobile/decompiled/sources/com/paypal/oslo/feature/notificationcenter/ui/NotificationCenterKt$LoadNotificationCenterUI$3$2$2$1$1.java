package com.paypal.oslo.feature.notificationcenter.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class NotificationCenterKt$LoadNotificationCenterUI$3$2$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<com.paypal.oslo.feature.notificationcenter.domain.model.Notification, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationStatus, "");
        ((com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel) this.receiver).updateNotificationsStatus(notification, notificationStatus, function0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
        getHighResolutionOutputSizeshNQ4ISI(notification, notificationStatus, function0);
        return kotlin.Unit.INSTANCE;
    }

    NotificationCenterKt$LoadNotificationCenterUI$3$2$2$1$1(java.lang.Object obj) {
        super(3, obj, com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel.class, "updateNotificationsStatus", "updateNotificationsStatus(Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;Lkotlin/jvm/functions/Function0;)V", 0);
    }
}
