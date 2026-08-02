package com.paypal.oslo.feature.notificationcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/usecase/GetNotificationsUseCase;", "", "Lcom/paypal/oslo/feature/notificationcenter/domain/repository/NotificationRepository;", "notificationRepository", "<init>", "(Lcom/paypal/oslo/feature/notificationcenter/domain/repository/NotificationRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationError;", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationData;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/notificationcenter/domain/repository/NotificationRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetNotificationsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetNotificationsUseCase(com.paypal.oslo.feature.notificationcenter.domain.repository.NotificationRepository notificationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationRepository, "");
        this.Camera2StreamConfigurationMap = notificationRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.notificationcenter.domain.model.NotificationError, com.paypal.oslo.feature.notificationcenter.domain.model.NotificationData>> continuation) {
        return this.Camera2StreamConfigurationMap.getNotifications(continuation);
    }
}
