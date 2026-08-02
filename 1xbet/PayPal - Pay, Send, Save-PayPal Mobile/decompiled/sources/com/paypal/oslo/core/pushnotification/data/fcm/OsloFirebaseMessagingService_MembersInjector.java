package com.paypal.oslo.core.pushnotification.data.fcm;

/* loaded from: classes10.dex */
public final class OsloFirebaseMessagingService_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.core.pushnotification.data.fcm.OsloFirebaseMessagingService> {
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher> getHighSpeedVideoFpsRangesFor;

    private OsloFirebaseMessagingService_MembersInjector(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.core.pushnotification.data.fcm.OsloFirebaseMessagingService osloFirebaseMessagingService) {
        injectPushNotificationEventDispatcher(osloFirebaseMessagingService, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.core.pushnotification.data.fcm.OsloFirebaseMessagingService> create(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher> provider) {
        return new com.paypal.oslo.core.pushnotification.data.fcm.OsloFirebaseMessagingService_MembersInjector(provider);
    }

    public static void injectPushNotificationEventDispatcher(com.paypal.oslo.core.pushnotification.data.fcm.OsloFirebaseMessagingService osloFirebaseMessagingService, com.paypal.oslo.core.pushnotification.data.fcm.PushNotificationEventDispatcher pushNotificationEventDispatcher) {
        osloFirebaseMessagingService.pushNotificationEventDispatcher = pushNotificationEventDispatcher;
    }
}
