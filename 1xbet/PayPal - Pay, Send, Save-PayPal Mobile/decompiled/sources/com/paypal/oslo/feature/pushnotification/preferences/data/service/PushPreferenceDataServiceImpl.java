package com.paypal.oslo.feature.pushnotification.preferences.data.service;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\t2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/data/service/PushPreferenceDataServiceImpl;", "Lcom/paypal/oslo/feature/pushnotification/preferences/data/service/PushPreferenceDataService;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferencesInput;", "Lcom/paypal/oslo/feature/pushnotification/graphql/type/PushNotificationPreferencesInput;", "preferenceListRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$PushNotificationPreference;", "getPreferences", "(Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferencesInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;", "Lcom/paypal/oslo/feature/pushnotification/graphql/type/UpdatePushNotificationPreferencesInput;", "preferenceUpdateRequest", "Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;", "setPreference", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePushNotificationPreferencesInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushPreferenceDataServiceImpl implements com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PushPreferenceDataServiceImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
        this.getHighSpeedVideoFpsRanges = "No preferences data received from GraphQL";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPreferences(com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferencesInput pushNotificationPreferencesInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference>>> continuation) {
        com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$getPreferences$1 pushPreferenceDataServiceImpl$getPreferences$1;
        int i;
        arrow.core.Ior ior;
        java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> pushNotificationPreferences;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$getPreferences$1) {
            pushPreferenceDataServiceImpl$getPreferences$1 = (com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$getPreferences$1) continuation;
            if ((pushPreferenceDataServiceImpl$getPreferences$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                pushPreferenceDataServiceImpl$getPreferences$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = pushPreferenceDataServiceImpl$getPreferences$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushPreferenceDataServiceImpl$getPreferences$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery(pushNotificationPreferencesInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    pushPreferenceDataServiceImpl$getPreferences$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pushNotificationPreferencesInput);
                    pushPreferenceDataServiceImpl$getPreferences$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, pushPreferenceDataServiceImpl$getPreferences$1, 2, null);
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
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data data = (com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    pushNotificationPreferences = data != null ? data.getPushNotificationPreferences() : null;
                    if (pushNotificationPreferences != null && !pushNotificationPreferences.isEmpty()) {
                        return arrow.core.EitherKt.right(pushNotificationPreferences);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError(this.getHighSpeedVideoFpsRanges, kotlin.collections.CollectionsKt.emptyList(), null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data data2 = (com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    pushNotificationPreferences = data2 != null ? data2.getPushNotificationPreferences() : null;
                    if (pushNotificationPreferences != null && !pushNotificationPreferences.isEmpty()) {
                        return arrow.core.EitherKt.right(pushNotificationPreferences);
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError(this.getHighSpeedVideoFpsRanges, kotlin.collections.CollectionsKt.emptyList(), null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        pushPreferenceDataServiceImpl$getPreferences$1 = new com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$getPreferences$1(this, continuation);
        java.lang.Object obj2 = pushPreferenceDataServiceImpl$getPreferences$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushPreferenceDataServiceImpl$getPreferences$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object setPreference(com.paypal.oslo.api.graphql.schema.type.UpdatePushNotificationPreferencesInput updatePushNotificationPreferencesInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences>> continuation) {
        com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$setPreference$1 pushPreferenceDataServiceImpl$setPreference$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$setPreference$1) {
            pushPreferenceDataServiceImpl$setPreference$1 = (com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$setPreference$1) continuation;
            if ((pushPreferenceDataServiceImpl$setPreference$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                pushPreferenceDataServiceImpl$setPreference$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = pushPreferenceDataServiceImpl$setPreference$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushPreferenceDataServiceImpl$setPreference$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation(updatePushNotificationPreferencesInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    pushPreferenceDataServiceImpl$setPreference$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePushNotificationPreferencesInput);
                    pushPreferenceDataServiceImpl$setPreference$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, pushPreferenceDataServiceImpl$setPreference$1, 2, null);
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
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data data = (com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return getHighResolutionOutputSizeshNQ4ISI(data != null ? data.getUpdatePushNotificationPreferences() : null);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data data2 = (com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return getHighResolutionOutputSizeshNQ4ISI(data2 != null ? data2.getUpdatePushNotificationPreferences() : null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        pushPreferenceDataServiceImpl$setPreference$1 = new com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$setPreference$1(this, continuation);
        java.lang.Object obj2 = pushPreferenceDataServiceImpl$setPreference$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushPreferenceDataServiceImpl$setPreference$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences p0) {
        arrow.core.Either<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences> right;
        return (p0 == null || (right = arrow.core.EitherKt.right(p0)) == null) ? arrow.core.EitherKt.left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError("No preferences data received from GraphQL", kotlin.collections.CollectionsKt.emptyList(), null, 4, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null)) : right;
    }
}
