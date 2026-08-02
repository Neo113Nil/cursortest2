package com.paypal.oslo.core.pushnotification.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/di/PushNotificationPermissionModule;", "", "Lcom/paypal/oslo/core/pushnotification/data/PushNotificationPermissionManagerImpl;", "impl", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionManager;", "bindPushNotificationPermissionManager", "(Lcom/paypal/oslo/core/pushnotification/data/PushNotificationPermissionManagerImpl;)Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionManager;", "Lcom/paypal/oslo/core/pushnotification/data/PushNotificationPermissionEventBusImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEventBus;", "bindPushNotificationPermissionEventBus", "(Lcom/paypal/oslo/core/pushnotification/data/PushNotificationPermissionEventBusImpl;)Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionEventBus;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface PushNotificationPermissionModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule.Companion INSTANCE = com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule.Companion.getHighSpeedVideoSizes;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionEventBus bindPushNotificationPermissionEventBus(com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionEventBusImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager bindPushNotificationPermissionManager(com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/di/PushNotificationPermissionModule$Companion;", "", "<init>", "()V", "", "provideSdkVersion", "()I", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "provideAppStorage", "(Landroid/content/Context;)Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule.Companion getHighSpeedVideoSizes = new com.paypal.oslo.core.pushnotification.di.PushNotificationPermissionModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Named("sdkVersion")
        public final int provideSdkVersion() {
            return android.os.Build.VERSION.SDK_INT;
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.paypal.oslo.core.persistence.appstorage.AppStorage(com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider.DEEPLINK_SOURCE_VALUE, context);
        }
    }
}
