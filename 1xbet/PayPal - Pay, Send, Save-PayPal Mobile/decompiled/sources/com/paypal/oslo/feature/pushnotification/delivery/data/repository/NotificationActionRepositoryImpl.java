package com.paypal.oslo.feature.pushnotification.delivery.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/repository/NotificationActionRepositoryImpl;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/repository/NotificationActionRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "code", "accountId", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "processAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationActionRepositoryImpl implements com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public NotificationActionRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.pushnotification.delivery.domain.repository.NotificationActionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processAction(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl$processAction$1 notificationActionRepositoryImpl$processAction$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation.ProcessPushNotificationAction processPushNotificationAction;
        com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation.ProcessPushNotificationAction processPushNotificationAction2;
        java.lang.String str4 = str2;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl$processAction$1) {
            notificationActionRepositoryImpl$processAction$1 = (com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl$processAction$1) continuation;
            if ((notificationActionRepositoryImpl$processAction$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                notificationActionRepositoryImpl$processAction$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl$processAction$1 notificationActionRepositoryImpl$processAction$12 = notificationActionRepositoryImpl$processAction$1;
                java.lang.Object obj = notificationActionRepositoryImpl$processAction$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationActionRepositoryImpl$processAction$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput processPushNotificationActionInput = new com.paypal.oslo.api.graphql.schema.type.ProcessPushNotificationActionInput(str, str4, str3);
                    com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation processPushNotificationActionMutation = new com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation(processPushNotificationActionInput);
                    notificationActionRepositoryImpl$processAction$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    notificationActionRepositoryImpl$processAction$12.getHighSpeedVideoFpsRangesFor = str4;
                    notificationActionRepositoryImpl$processAction$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    notificationActionRepositoryImpl$processAction$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(processPushNotificationActionInput);
                    notificationActionRepositoryImpl$processAction$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(processPushNotificationActionMutation);
                    notificationActionRepositoryImpl$processAction$12.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.Camera2StreamConfigurationMap, processPushNotificationActionMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, notificationActionRepositoryImpl$processAction$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (java.lang.String) notificationActionRepositoryImpl$processAction$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "ProcessPushNotificationAction mutation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", str4), kotlin.TuplesKt.to("error", callError.toString())), null, null, 12, null);
                    return new arrow.core.Ior.Left(callError);
                }
                java.lang.String str5 = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("action", str4);
                    com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation.Data data = (com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation.Data) graphQLData.getData();
                    if (data != null && (processPushNotificationAction2 = data.getProcessPushNotificationAction()) != null) {
                        str5 = processPushNotificationAction2.getAction();
                    }
                    pairArr[1] = kotlin.TuplesKt.to("responseAction", str5 != null ? str5 : "");
                    com.paypal.android.logger.Logger.d$default(logger, "ProcessPushNotificationAction mutation succeeded", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    return new arrow.core.Ior.Right(kotlin.Unit.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                    pairArr2[0] = kotlin.TuplesKt.to("action", str4);
                    pairArr2[1] = kotlin.TuplesKt.to("error", callError2.toString());
                    com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation.Data data2 = (com.paypal.oslo.feature.pushnotification.graphql.ProcessPushNotificationActionMutation.Data) graphQLData2.getData();
                    if (data2 != null && (processPushNotificationAction = data2.getProcessPushNotificationAction()) != null) {
                        str5 = processPushNotificationAction.getAction();
                    }
                    pairArr2[2] = kotlin.TuplesKt.to("responseAction", str5 != null ? str5 : "");
                    com.paypal.android.logger.Logger.w$default(logger2, "ProcessPushNotificationAction mutation partial success", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                    return new arrow.core.Ior.Both(callError2, kotlin.Unit.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        notificationActionRepositoryImpl$processAction$1 = new com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl$processAction$1(this, continuation);
        com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationActionRepositoryImpl$processAction$1 notificationActionRepositoryImpl$processAction$122 = notificationActionRepositoryImpl$processAction$1;
        java.lang.Object obj2 = notificationActionRepositoryImpl$processAction$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationActionRepositoryImpl$processAction$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
