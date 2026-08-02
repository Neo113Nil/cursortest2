package com.paypal.oslo.feature.notificationcenter.badge.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/badge/di/NotificationBadgeModule;", "", "Lcom/paypal/oslo/feature/notificationcenter/badge/data/repository/NotificationBadgeRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/notificationcenter/badge/domain/repository/NotificationBadgeRepository;", "bindNotificationBadgeRepository", "(Lcom/paypal/oslo/feature/notificationcenter/badge/data/repository/NotificationBadgeRepositoryImpl;)Lcom/paypal/oslo/feature/notificationcenter/badge/domain/repository/NotificationBadgeRepository;", "Lcom/paypal/oslo/feature/notificationcenter/badge/data/NotificationBadgeManagerImpl;", "Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;", "bindNotificationBadgeManager", "(Lcom/paypal/oslo/feature/notificationcenter/badge/data/NotificationBadgeManagerImpl;)Lcom/paypal/oslo/feature/notificationcenter/badge/api/NotificationBadgeManager;", "Lcom/paypal/oslo/feature/notificationcenter/badge/NotificationBadgeProvider;", "Lcom/paypal/oslo/core/navigation/ui/NavigationBadgeProvider;", "bindNavigationBadgeProvider", "(Lcom/paypal/oslo/feature/notificationcenter/badge/NotificationBadgeProvider;)Lcom/paypal/oslo/core/navigation/ui/NavigationBadgeProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface NotificationBadgeModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule.Companion INSTANCE = com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule.Companion.getHighSpeedVideoSizes;

    @dagger.Binds
    com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider bindNavigationBadgeProvider(com.paypal.oslo.feature.notificationcenter.badge.NotificationBadgeProvider impl);

    @dagger.Binds
    com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager bindNotificationBadgeManager(com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeRepository bindNotificationBadgeRepository(com.paypal.oslo.feature.notificationcenter.badge.data.repository.NotificationBadgeRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/badge/di/NotificationBadgeModule$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle;", "provideProcessLifecycle", "()Landroidx/lifecycle/Lifecycle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        public final androidx.view.Lifecycle provideProcessLifecycle() {
            return androidx.view.ProcessLifecycleOwner.INSTANCE.get().getLifecycle();
        }
    }
}
