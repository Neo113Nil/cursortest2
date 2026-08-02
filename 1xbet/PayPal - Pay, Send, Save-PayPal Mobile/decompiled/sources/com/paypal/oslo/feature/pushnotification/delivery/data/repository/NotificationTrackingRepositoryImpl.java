package com.paypal.oslo.feature.pushnotification.delivery.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\rJ6\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/repository/NotificationTrackingRepositoryImpl;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationTrackingRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "", "trackingTokens", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "trackClicked", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackImpressed", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "Lcom/paypal/oslo/feature/pushnotification/graphql/type/NotificationStatus;", "p1", "getHighSpeedVideoSizes", "(Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationTrackingRepositoryImpl implements com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public NotificationTrackingRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    @Override // com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository
    public final java.lang.Object trackClicked(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, kotlin.Unit>> continuation) {
        return getHighSpeedVideoSizes(list, com.paypal.oslo.api.graphql.schema.type.NotificationStatus.CLICKED, continuation);
    }

    @Override // com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationTrackingRepository
    public final java.lang.Object trackImpressed(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, kotlin.Unit>> continuation) {
        return getHighSpeedVideoSizes(list, com.paypal.oslo.api.graphql.schema.type.NotificationStatus.IMPRESSED, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.List<java.lang.String> list, com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl$track$1 notificationTrackingRepositoryImpl$track$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl$track$1) {
            notificationTrackingRepositoryImpl$track$1 = (com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl$track$1) continuation;
            if ((notificationTrackingRepositoryImpl$track$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                notificationTrackingRepositoryImpl$track$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl$track$1 notificationTrackingRepositoryImpl$track$12 = notificationTrackingRepositoryImpl$track$1;
                java.lang.Object obj = notificationTrackingRepositoryImpl$track$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationTrackingRepositoryImpl$track$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput updateNotificationsTrackingStatusInput = new com.paypal.oslo.api.graphql.schema.type.UpdateNotificationsTrackingStatusInput(com.paypal.oslo.api.graphql.schema.type.NotificationChannel.PUSH, null, com.apollographql.apollo.api.Optional.INSTANCE.present(list), notificationStatus, 2, null);
                    com.paypal.oslo.feature.pushnotification.graphql.UpdateNotificationsTrackingStatusMutation updateNotificationsTrackingStatusMutation = new com.paypal.oslo.feature.pushnotification.graphql.UpdateNotificationsTrackingStatusMutation(updateNotificationsTrackingStatusInput);
                    notificationTrackingRepositoryImpl$track$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    notificationTrackingRepositoryImpl$track$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(notificationStatus);
                    notificationTrackingRepositoryImpl$track$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateNotificationsTrackingStatusInput);
                    notificationTrackingRepositoryImpl$track$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateNotificationsTrackingStatusMutation);
                    notificationTrackingRepositoryImpl$track$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, updateNotificationsTrackingStatusMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, notificationTrackingRepositoryImpl$track$12, 2, (java.lang.Object) null);
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
                    return new arrow.core.Ior.Left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(kotlin.Unit.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return new arrow.core.Ior.Both((com.paypal.oslo.core.network.graphql.error.CallError) leftValue, kotlin.Unit.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        notificationTrackingRepositoryImpl$track$1 = new com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl$track$1(this, continuation);
        com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl$track$1 notificationTrackingRepositoryImpl$track$122 = notificationTrackingRepositoryImpl$track$1;
        java.lang.Object obj2 = notificationTrackingRepositoryImpl$track$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationTrackingRepositoryImpl$track$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
