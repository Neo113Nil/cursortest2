package com.onesignal.notifications;

import b2.AbstractC0279e;
import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.notifications.internal.INotificationActivityOpener;
import com.onesignal.notifications.internal.NotificationsManager;
import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import com.onesignal.notifications.internal.backend.impl.NotificationBackendService;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.badges.impl.BadgeCountUpdater;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.onesignal.notifications.internal.channels.INotificationChannelManager;
import com.onesignal.notifications.internal.channels.impl.NotificationChannelManager;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.data.impl.NotificationQueryHelper;
import com.onesignal.notifications.internal.data.impl.NotificationRepository;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer;
import com.onesignal.notifications.internal.generation.INotificationGenerationProcessor;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import com.onesignal.notifications.internal.limiting.impl.NotificationLimitManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS;
import com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor;
import com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessorHMS;
import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController;
import com.onesignal.notifications.internal.pushtoken.IPushTokenManager;
import com.onesignal.notifications.internal.pushtoken.PushTokenManager;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptProcessor;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.notifications.internal.registration.impl.GooglePlayServicesUpgradePrompt;
import com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreProcessor;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager;
import kotlin.jvm.internal.i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationsModule implements IModule {
    @Override // com.onesignal.common.modules.IModule
    public void register(ServiceBuilder builder) {
        i.e(builder, "builder");
        builder.register(NotificationBackendService.class).provides(INotificationBackendService.class);
        builder.register(NotificationRestoreWorkManager.class).provides(INotificationRestoreWorkManager.class);
        builder.register(NotificationQueryHelper.class).provides(INotificationQueryHelper.class);
        AbstractC0279e.n(builder, BadgeCountUpdater.class, IBadgeCountUpdater.class, NotificationRepository.class, INotificationRepository.class);
        AbstractC0279e.n(builder, NotificationGenerationWorkManager.class, INotificationGenerationWorkManager.class, NotificationBundleProcessor.class, INotificationBundleProcessor.class);
        AbstractC0279e.n(builder, NotificationChannelManager.class, INotificationChannelManager.class, NotificationLimitManager.class, INotificationLimitManager.class);
        AbstractC0279e.n(builder, NotificationDisplayer.class, INotificationDisplayer.class, SummaryNotificationDisplayer.class, ISummaryNotificationDisplayer.class);
        AbstractC0279e.n(builder, NotificationDisplayBuilder.class, INotificationDisplayBuilder.class, NotificationGenerationProcessor.class, INotificationGenerationProcessor.class);
        AbstractC0279e.n(builder, NotificationRestoreProcessor.class, INotificationRestoreProcessor.class, NotificationSummaryManager.class, INotificationSummaryManager.class);
        AbstractC0279e.n(builder, NotificationOpenedProcessor.class, INotificationOpenedProcessor.class, NotificationOpenedProcessorHMS.class, INotificationOpenedProcessorHMS.class);
        builder.register(NotificationPermissionController.class).provides(INotificationPermissionController.class);
        builder.register(NotificationLifecycleService.class).provides(INotificationLifecycleService.class).provides(INotificationActivityOpener.class);
        builder.register((InterfaceC1441l) NotificationsModule$register$1.INSTANCE).provides(IAnalyticsTracker.class);
        builder.register((InterfaceC1441l) NotificationsModule$register$2.INSTANCE).provides(IPushRegistrator.class).provides(IPushRegistratorCallback.class);
        builder.register(GooglePlayServicesUpgradePrompt.class).provides(GooglePlayServicesUpgradePrompt.class);
        builder.register(PushTokenManager.class).provides(IPushTokenManager.class);
        AbstractC0279e.n(builder, ReceiveReceiptWorkManager.class, IReceiveReceiptWorkManager.class, ReceiveReceiptProcessor.class, IReceiveReceiptProcessor.class);
        AbstractC0279e.n(builder, DeviceRegistrationListener.class, IStartableService.class, NotificationsManager.class, INotificationsManager.class);
    }
}
