package com.paypal.oslo.feature.identity.logout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/logout/data/repository/LogoutRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/logout/domain/repository/LogoutRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "unbindDevice", "Lcom/paypal/oslo/feature/identity/logout/domain/model/LogoutResult;", "logout", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LogoutRepositoryImpl implements com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public LogoutRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: ApolloException -> 0x008f, TryCatch #0 {ApolloException -> 0x008f, blocks: (B:11:0x0029, B:12:0x0052, B:14:0x0059, B:16:0x0061, B:18:0x0069, B:21:0x006f, B:23:0x0075, B:25:0x007d, B:27:0x0085, B:28:0x0089, B:36:0x0038), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: ApolloException -> 0x008f, TryCatch #0 {ApolloException -> 0x008f, blocks: (B:11:0x0029, B:12:0x0052, B:14:0x0059, B:16:0x0061, B:18:0x0069, B:21:0x006f, B:23:0x0075, B:25:0x007d, B:27:0x0085, B:28:0x0089, B:36:0x0038), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object logout(boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult> continuation) {
        com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl$logout$1 logoutRepositoryImpl$logout$1;
        int i;
        java.lang.String message;
        com.apollographql.apollo.api.Error error;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl$logout$1) {
                logoutRepositoryImpl$logout$1 = (com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl$logout$1) continuation;
                if ((logoutRepositoryImpl$logout$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    logoutRepositoryImpl$logout$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = logoutRepositoryImpl$logout$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = logoutRepositoryImpl$logout$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall mutation = this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.identity.graphql.EndAuthenticationSessionMutation(z, "NA"));
                        logoutRepositoryImpl$logout$1.getHighSpeedVideoSizes = z;
                        logoutRepositoryImpl$logout$1.Camera2StreamConfigurationMap = 1;
                        obj = mutation.execute(logoutRepositoryImpl$logout$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = logoutRepositoryImpl$logout$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                    java.util.List<com.apollographql.apollo.api.Error> list = apolloResponse.errors;
                    message = (list != null || (error = (com.apollographql.apollo.api.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null) ? null : error.getMessage();
                    if (message == null) {
                        return new com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult(false, message);
                    }
                    com.paypal.oslo.feature.identity.graphql.EndAuthenticationSessionMutation.Data data = (com.paypal.oslo.feature.identity.graphql.EndAuthenticationSessionMutation.Data) apolloResponse.data;
                    com.paypal.oslo.feature.identity.graphql.EndAuthenticationSessionMutation.EndAuthenticationSession endAuthenticationSession = data != null ? data.getEndAuthenticationSession() : null;
                    return new com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult(endAuthenticationSession != null ? endAuthenticationSession.getSuccess() : false, endAuthenticationSession != null ? endAuthenticationSession.getMessage() : null);
                }
            }
            if (i != 0) {
            }
            com.apollographql.apollo.api.ApolloResponse apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) obj;
            java.util.List<com.apollographql.apollo.api.Error> list2 = apolloResponse2.errors;
            if (list2 != null) {
            }
            if (message == null) {
            }
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            java.lang.String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "Logout request failed: Apollo error";
            }
            return new com.paypal.oslo.feature.identity.logout.domain.model.LogoutResult(false, message2);
        }
        logoutRepositoryImpl$logout$1 = new com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl$logout$1(this, continuation);
        java.lang.Object obj2 = logoutRepositoryImpl$logout$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = logoutRepositoryImpl$logout$1.Camera2StreamConfigurationMap;
    }
}
