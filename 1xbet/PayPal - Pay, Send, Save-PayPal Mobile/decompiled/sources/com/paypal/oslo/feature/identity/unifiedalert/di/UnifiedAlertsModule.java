package com.paypal.oslo.feature.identity.unifiedalert.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/di/UnifiedAlertsModule;", "", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/repository/UnifiedAlertsRemoteRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/UnifiedAlertsRepository;", "bindUnifiedAlertsRepository", "(Lcom/paypal/oslo/feature/identity/unifiedalert/data/repository/UnifiedAlertsRemoteRepositoryImpl;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/UnifiedAlertsRepository;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/repository/HandledAlertsRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/HandledAlertsRepository;", "bindHandledAlertsRepository", "(Lcom/paypal/oslo/feature/identity/unifiedalert/data/repository/HandledAlertsRepositoryImpl;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/HandledAlertsRepository;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertDeduplicationManagerImpl;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/AlertDeduplicationManager;", "bindAlertDeduplicationManager", "(Lcom/paypal/oslo/feature/identity/unifiedalert/data/AlertDeduplicationManagerImpl;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/AlertDeduplicationManager;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/rendering/UnifiedAlertsCustomViewRenderer;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomViewRenderer;", "bindUnifiedAlertsCustomViewRenderer", "(Lcom/paypal/oslo/feature/identity/unifiedalert/data/rendering/UnifiedAlertsCustomViewRenderer;)Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomViewRenderer;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface UnifiedAlertsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule.Companion INSTANCE = com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule.Companion.getHighSpeedVideoSizes;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager bindAlertDeduplicationManager(com.paypal.oslo.feature.identity.unifiedalert.data.AlertDeduplicationManagerImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.unifiedalert.domain.repository.HandledAlertsRepository bindHandledAlertsRepository(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer bindUnifiedAlertsCustomViewRenderer(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository bindUnifiedAlertsRepository(com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/di/UnifiedAlertsModule$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle;", "provideProcessLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        public final androidx.view.Lifecycle provideProcessLifecycle() {
            return androidx.view.ProcessLifecycleOwner.INSTANCE.get().getLifecycle();
        }

        @dagger.Provides
        public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
            return kotlinx.coroutines.Dispatchers.getIO();
        }
    }
}
