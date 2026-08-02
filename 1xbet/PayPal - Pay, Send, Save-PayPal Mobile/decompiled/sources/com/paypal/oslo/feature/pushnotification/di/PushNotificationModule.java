package com.paypal.oslo.feature.pushnotification.di;

@kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 82\u00020\u0001:\u00018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020&H'¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010\u0003\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010\u0003\u001a\u00020.H'¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u0010\u0003\u001a\u000201H'¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002022\u0006\u0010\u0003\u001a\u000205H'¢\u0006\u0004\b6\u00107À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/di/PushNotificationModule;", "", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/handler/CommsPushNotificationHandler;", "impl", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "bindCommsPushNotificationHandler", "(Lcom/paypal/oslo/feature/pushnotification/shared/domain/handler/CommsPushNotificationHandler;)Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "Lcom/paypal/oslo/feature/pushnotification/delivery/framework/CommsMessageDeliveryListenerImpl;", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsMessageDeliveryListener;", "bindCommsMessageDeliveryListener", "(Lcom/paypal/oslo/feature/pushnotification/delivery/framework/CommsMessageDeliveryListenerImpl;)Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsMessageDeliveryListener;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/CommsTokenRefreshListenerImpl;", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsTokenRefreshListener;", "bindCommsTokenRefreshListener", "(Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/CommsTokenRefreshListenerImpl;)Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsTokenRefreshListener;", "", "", "Lcom/paypal/oslo/feature/pushnotification/api/silentpush/SilentPushHandler;", "bindSilentPushHandlers", "()Ljava/util/Map;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/eligibility/CommsV1EligibilityChecker;", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/eligibility/CommsNotificationEligibilityChecker;", "bindCommsV1EligibilityChecker", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/eligibility/CommsV1EligibilityChecker;)Lcom/paypal/oslo/feature/pushnotification/shared/domain/eligibility/CommsNotificationEligibilityChecker;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/eligibility/CommsSilentPushEligibilityChecker;", "bindCommsSilentPushEligibilityChecker", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/eligibility/CommsSilentPushEligibilityChecker;)Lcom/paypal/oslo/feature/pushnotification/shared/domain/eligibility/CommsNotificationEligibilityChecker;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/eligibility/CommsOsloPushNotificationEligibilityChecker;", "bindCommsOsloPushNotificationEligibilityChecker", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/eligibility/CommsOsloPushNotificationEligibilityChecker;)Lcom/paypal/oslo/feature/pushnotification/shared/domain/eligibility/CommsNotificationEligibilityChecker;", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/adapter/CommsPushNotificationClickHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClickHandler;", "bindCommsPushNotificationClickHandler", "(Lcom/paypal/oslo/feature/pushnotification/delivery/data/adapter/CommsPushNotificationClickHandler;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClickHandler;", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/repository/NotificationActionRepositoryImpl;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationActionRepository;", "bindNotificationActionRepository", "(Lcom/paypal/oslo/feature/pushnotification/delivery/data/repository/NotificationActionRepositoryImpl;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationActionRepository;", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/repository/NotificationTrackingRepositoryImpl;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationTrackingRepository;", "bindNotificationTrackingRepository", "(Lcom/paypal/oslo/feature/pushnotification/delivery/data/repository/NotificationTrackingRepositoryImpl;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationTrackingRepository;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/DefaultCommsPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/PushNotificationPayloadValidator;", "bindDefaultCommsPayloadValidator", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/DefaultCommsPayloadValidator;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/PushNotificationPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/OsloPushPayloadValidator;", "bindOsloPushPayloadValidator", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/OsloPushPayloadValidator;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/PushNotificationPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CommsV1PushPayloadMapper;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/mapper/PushNotificationDataMapper;", "bindCommsV1NotificationMapper", "(Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CommsV1PushPayloadMapper;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/mapper/PushNotificationDataMapper;", "Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/OsloPushPayloadMapper;", "bindOsloPushPayloadMapper", "(Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/OsloPushPayloadMapper;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/mapper/PushNotificationDataMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface PushNotificationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pushnotification.di.PushNotificationModule.Companion INSTANCE = com.paypal.oslo.feature.pushnotification.di.PushNotificationModule.Companion.getHighSpeedVideoFpsRanges;

    @dagger.Binds
    com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener bindCommsMessageDeliveryListener(com.paypal.oslo.feature.pushnotification.delivery.framework.CommsMessageDeliveryListenerImpl impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker bindCommsOsloPushNotificationEligibilityChecker(com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler bindCommsPushNotificationClickHandler(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler bindCommsPushNotificationHandler(com.paypal.oslo.feature.pushnotification.shared.domain.handler.CommsPushNotificationHandler impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker bindCommsSilentPushEligibilityChecker(com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker impl);

    @dagger.Binds
    com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener bindCommsTokenRefreshListener(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.CommsTokenRefreshListenerImpl impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker bindCommsV1EligibilityChecker(com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper bindCommsV1NotificationMapper(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?> bindDefaultCommsPayloadValidator(com.paypal.oslo.feature.pushnotification.delivery.domain.validator.DefaultCommsPayloadValidator impl);

    @dagger.Binds
    com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository bindNotificationActionRepository(com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository bindNotificationTrackingRepository(com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper bindOsloPushPayloadMapper(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?> bindOsloPushPayloadValidator(com.paypal.oslo.feature.pushnotification.delivery.domain.validator.OsloPushPayloadValidator impl);

    @dagger.multibindings.Multibinds
    java.util.Map<java.lang.String, com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler> bindSilentPushHandlers();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/di/PushNotificationModule$Companion;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "provideCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.pushnotification.di.PushNotificationModule.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.pushnotification.di.PushNotificationModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final kotlinx.coroutines.CoroutineScope provideCoroutineScope() {
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getIO()));
        }
    }
}
