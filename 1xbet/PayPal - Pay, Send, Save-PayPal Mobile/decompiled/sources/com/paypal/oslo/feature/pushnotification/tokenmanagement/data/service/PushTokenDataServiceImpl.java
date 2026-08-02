package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/service/PushTokenDataServiceImpl;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/service/PushTokenDataService;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "deviceId", "cloudIdentity", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/model/SubscribeResponse;", "subscribePushToken", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushToken", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/model/UnsubscribeResponse;", "unSubscribePushToken", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushTokenDataServiceImpl implements com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PushTokenDataServiceImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object subscribePushToken(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$subscribePushToken$1 pushTokenDataServiceImpl$subscribePushToken$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications;
        com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications2;
        com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications3;
        com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.SubscribeToPushNotifications subscribeToPushNotifications4;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$subscribePushToken$1) {
            pushTokenDataServiceImpl$subscribePushToken$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$subscribePushToken$1) continuation;
            if ((pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoSizes;
                java.lang.String str4 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.mutation(new com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation(new com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput(str2, str, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str3), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))))), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    pushTokenDataServiceImpl$subscribePushToken$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    pushTokenDataServiceImpl$subscribePushToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoFpsRangesFor = z;
                    pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, pushTokenDataServiceImpl$subscribePushToken$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data data = (com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data) graphQLData.getData();
                    com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus status = (data == null || (subscribeToPushNotifications4 = data.getSubscribeToPushNotifications()) == null) ? null : subscribeToPushNotifications4.getStatus();
                    com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data data2 = (com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data) graphQLData.getData();
                    if (data2 != null && (subscribeToPushNotifications3 = data2.getSubscribeToPushNotifications()) != null) {
                        str4 = subscribeToPushNotifications3.getCloudId();
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse(status, str4));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data data3 = (com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data) graphQLData2.getData();
                    com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus status2 = (data3 == null || (subscribeToPushNotifications2 = data3.getSubscribeToPushNotifications()) == null) ? null : subscribeToPushNotifications2.getStatus();
                    com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data data4 = (com.paypal.oslo.feature.pushnotification.graphql.SubscribePushNotificationMutation.Data) graphQLData2.getData();
                    if (data4 != null && (subscribeToPushNotifications = data4.getSubscribeToPushNotifications()) != null) {
                        str4 = subscribeToPushNotifications.getCloudId();
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse(status2, str4));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        pushTokenDataServiceImpl$subscribePushToken$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$subscribePushToken$1(this, continuation);
        java.lang.Object obj2 = pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenDataServiceImpl$subscribePushToken$1.getHighSpeedVideoSizes;
        java.lang.String str42 = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object unSubscribePushToken(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.UnsubscribeResponse>> continuation) {
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$unSubscribePushToken$1 pushTokenDataServiceImpl$unSubscribePushToken$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications;
        com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.UnsubscribeFromPushNotifications unsubscribeFromPushNotifications2;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$unSubscribePushToken$1) {
            pushTokenDataServiceImpl$unSubscribePushToken$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$unSubscribePushToken$1) continuation;
            if ((pushTokenDataServiceImpl$unSubscribePushToken$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                pushTokenDataServiceImpl$unSubscribePushToken$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = pushTokenDataServiceImpl$unSubscribePushToken$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenDataServiceImpl$unSubscribePushToken$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.mutation(new com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation(new com.paypal.oslo.api.graphql.schema.type.UnsubscribeFromPushNotificationsInput(str, str2))), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    pushTokenDataServiceImpl$unSubscribePushToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    pushTokenDataServiceImpl$unSubscribePushToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    pushTokenDataServiceImpl$unSubscribePushToken$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, pushTokenDataServiceImpl$unSubscribePushToken$1, 2, null);
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
                    return arrow.core.EitherKt.left((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                boolean z = false;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data data = (com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data != null && (unsubscribeFromPushNotifications2 = data.getUnsubscribeFromPushNotifications()) != null) {
                        z = unsubscribeFromPushNotifications2.getSuccess();
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.UnsubscribeResponse(z));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data data2 = (com.paypal.oslo.feature.pushnotification.graphql.UnsubscribePushNotificationMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 != null && (unsubscribeFromPushNotifications = data2.getUnsubscribeFromPushNotifications()) != null) {
                        z = unsubscribeFromPushNotifications.getSuccess();
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.UnsubscribeResponse(z));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        pushTokenDataServiceImpl$unSubscribePushToken$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$unSubscribePushToken$1(this, continuation);
        java.lang.Object obj2 = pushTokenDataServiceImpl$unSubscribePushToken$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenDataServiceImpl$unSubscribePushToken$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
