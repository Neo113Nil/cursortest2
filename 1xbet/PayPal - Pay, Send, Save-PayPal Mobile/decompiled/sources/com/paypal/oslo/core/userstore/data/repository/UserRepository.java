package com.paypal.oslo.core.userstore.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/userstore/data/repository/UserRepository;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/userstore/model/UserError;", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Data;", "getUserProfile", "(Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public UserRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getUserProfile(com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.core.userstore.model.UserError, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data>> continuation) {
        com.paypal.oslo.core.userstore.data.repository.UserRepository$getUserProfile$1 userRepository$getUserProfile$1;
        int i;
        com.apollographql.apollo.api.ApolloResponse apolloResponse;
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party;
        if (continuation instanceof com.paypal.oslo.core.userstore.data.repository.UserRepository$getUserProfile$1) {
            userRepository$getUserProfile$1 = (com.paypal.oslo.core.userstore.data.repository.UserRepository$getUserProfile$1) continuation;
            if ((userRepository$getUserProfile$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                userRepository$getUserProfile$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = userRepository$getUserProfile$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userRepository$getUserProfile$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Executing GetProfile GraphQL query", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fetch_policy", fetchPolicy.toString())), null, 4, null);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(new com.paypal.oslo.core.userstore.graphql.GetProfileQuery()), fetchPolicy);
                    userRepository$getUserProfile$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    userRepository$getUserProfile$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = apolloCall.execute(userRepository$getUserProfile$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                java.util.List<com.apollographql.apollo.api.Error> list = apolloResponse.errors;
                java.lang.String str = null;
                java.lang.String joinToString$default = list == null ? kotlin.collections.CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.userstore.data.repository.UserRepository$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.core.userstore.data.repository.UserRepository.m11696$r8$lambda$VlIXnoBVGPnNN_um6b9b5jYPnM((com.apollographql.apollo.api.Error) obj2);
                    }
                }, 30, null) : null;
                if (!apolloResponse.hasErrors() && apolloResponse.data != 0) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.userstore.LoggerKt.log, "GetProfile query completed with partial errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_messages", joinToString$default)), null, 4, null);
                    return new arrow.core.Ior.Both(new com.paypal.oslo.core.userstore.model.UserError("GraphQL errors: ".concat(java.lang.String.valueOf(joinToString$default))), apolloResponse.data);
                }
                if (!apolloResponse.hasErrors()) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.userstore.LoggerKt.log, "GetProfile query failed with errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_messages", joinToString$default)), null, null, 12, null);
                    return new arrow.core.Ior.Left(new com.paypal.oslo.core.userstore.model.UserError("GraphQL errors: ".concat(java.lang.String.valueOf(joinToString$default))));
                }
                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.userstore.LoggerKt.log;
                com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data data = (com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data) apolloResponse.data;
                if (data != null && (party = data.getParty()) != null) {
                    str = party.getId();
                }
                com.paypal.android.logger.Logger.d$default(logger, "GetProfile query successful", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_id", java.lang.String.valueOf(str))), 2, null);
                return new arrow.core.Ior.Right(apolloResponse.data);
            }
        }
        userRepository$getUserProfile$1 = new com.paypal.oslo.core.userstore.data.repository.UserRepository$getUserProfile$1(this, continuation);
        java.lang.Object obj2 = userRepository$getUserProfile$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userRepository$getUserProfile$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj2;
        java.util.List<com.apollographql.apollo.api.Error> list2 = apolloResponse.errors;
        java.lang.String str2 = null;
        if (list2 == null) {
        }
        if (!apolloResponse.hasErrors()) {
        }
        if (!apolloResponse.hasErrors()) {
        }
    }

    public static /* synthetic */ java.lang.Object getUserProfile$default(com.paypal.oslo.core.userstore.data.repository.UserRepository userRepository, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.CacheFirst;
        }
        return userRepository.getUserProfile(fetchPolicy, continuation);
    }

    /* renamed from: $r8$lambda$VlIXnoBVGPnNN_um6b9b5jYP-nM, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m11696$r8$lambda$VlIXnoBVGPnNN_um6b9b5jYPnM(com.apollographql.apollo.api.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getMessage();
    }
}
