package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/TrackPushNotificationClickUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationTrackingRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationTrackingRepository;)V", "", "trackingToken", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationTrackingRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrackPushNotificationClickUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TrackPushNotificationClickUseCase(com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository notificationTrackingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationTrackingRepository, "");
        this.getHighSpeedVideoFpsRangesFor = notificationTrackingRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase$invoke$1 trackPushNotificationClickUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase$invoke$1) {
            trackPushNotificationClickUseCase$invoke$1 = (com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase$invoke$1) continuation;
            if ((trackPushNotificationClickUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                trackPushNotificationClickUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = trackPushNotificationClickUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = trackPushNotificationClickUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.text.StringsKt.isBlank(str)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Tracking token is blank, skipping click tracking", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository notificationTrackingRepository = this.getHighSpeedVideoFpsRangesFor;
                    java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf(str);
                    trackPushNotificationClickUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    trackPushNotificationClickUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = notificationTrackingRepository.trackClicked(listOf, trackPushNotificationClickUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Push notification click tracking failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString())), null, 4, null);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Push notification click tracking succeeded", null, null, 6, null);
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Push notification click tracking partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.network.graphql.error.CallError) leftValue).toString())), null, 4, null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        trackPushNotificationClickUseCase$invoke$1 = new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = trackPushNotificationClickUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = trackPushNotificationClickUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
