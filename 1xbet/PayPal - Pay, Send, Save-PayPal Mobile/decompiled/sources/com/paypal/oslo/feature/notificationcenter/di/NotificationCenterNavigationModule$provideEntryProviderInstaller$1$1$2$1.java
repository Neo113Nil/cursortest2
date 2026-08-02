package com.paypal.oslo.feature.notificationcenter.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class NotificationCenterNavigationModule$provideEntryProviderInstaller$1$1$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.notificationcenter.domain.model.Notification, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification) {
        com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification2 = notification;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification2, "");
        ((com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler) this.receiver).handleDeepLink$notification_center_prodRelease(notification2);
        return kotlin.Unit.INSTANCE;
    }

    NotificationCenterNavigationModule$provideEntryProviderInstaller$1$1$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler.class, "handleDeepLink", "handleDeepLink$notification_center_prodRelease(Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;)V", 0);
    }
}
