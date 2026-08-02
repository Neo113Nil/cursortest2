package com.paypal.oslo.feature.identity.accountswitch.data.repository;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u000bJ,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/data/repository/UserAccountSwitchRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/UserAccountSwitchRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccountSwitchResponse;", "getAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/DataResultError;", "", "unlinkAccount", "", "clientId", "targetPartyId", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/SwitchAccountResult;", "switchAccount", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Data;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Ior;", "getHighSpeedVideoSizes", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserAccountSwitchRepositoryImpl implements com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UserAccountSwitchRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAccounts(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError, com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse>> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$getAccounts$1 userAccountSwitchRepositoryImpl$getAccounts$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data data;
        com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles;
        com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data data2;
        if (continuation instanceof com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$getAccounts$1) {
            userAccountSwitchRepositoryImpl$getAccounts$1 = (com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$getAccounts$1) continuation;
            if ((userAccountSwitchRepositoryImpl$getAccounts$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                userAccountSwitchRepositoryImpl$getAccounts$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = userAccountSwitchRepositoryImpl$getAccounts$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userAccountSwitchRepositoryImpl$getAccounts$1.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles2 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery getLinkedProfilesQuery = new com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery(null, 1, null);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.get().query(getLinkedProfilesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("accessible_entities", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                    userAccountSwitchRepositoryImpl$getAccounts$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getLinkedProfilesQuery);
                    userAccountSwitchRepositoryImpl$getAccounts$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    userAccountSwitchRepositoryImpl$getAccounts$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    userAccountSwitchRepositoryImpl$getAccounts$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, userAccountSwitchRepositoryImpl$getAccounts$1);
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
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Fetch linked profiles failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Ior.Left(getHighSpeedVideoFpsRanges(callError));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    if (graphQLData != null && (data2 = (com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data) graphQLData.getData()) != null) {
                        linkedAuthenticationProfiles2 = data2.getLinkedAuthenticationProfiles();
                    }
                    if (linkedAuthenticationProfiles2 != null) {
                        return new arrow.core.Ior.Right(com.paypal.oslo.feature.identity.accountswitch.data.mapper.UserAccountSwitchMapperKt.toDomain(linkedAuthenticationProfiles2));
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "GraphQL response missing linked profiles data", null, null, null, 14, null);
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.AccountDataError.INSTANCE);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                if (graphQLData2 != null && (data = (com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.Data) graphQLData2.getData()) != null && (linkedAuthenticationProfiles = data.getLinkedAuthenticationProfiles()) != null) {
                    return new arrow.core.Ior.Both(getHighSpeedVideoFpsRanges(callError2), com.paypal.oslo.feature.identity.accountswitch.data.mapper.UserAccountSwitchMapperKt.toDomain(linkedAuthenticationProfiles));
                }
                return new arrow.core.Ior.Left(getHighSpeedVideoFpsRanges(callError2));
            }
        }
        userAccountSwitchRepositoryImpl$getAccounts$1 = new com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$getAccounts$1(this, continuation);
        java.lang.Object obj2 = userAccountSwitchRepositoryImpl$getAccounts$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userAccountSwitchRepositoryImpl$getAccounts$1.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.identity.graphql.GetLinkedProfilesQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles22 = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        if (!(p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (!(p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "GraphQL errors occurred", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isCritical", java.lang.String.valueOf(graphQL.isCritical())), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.String.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(graphQL.m11659getErrors1X0FAY()))), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()), "; ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl.$r8$lambda$K4SjM6_81FJB5dOQAHW9dfnsY3Y((com.paypal.oslo.core.network.graphql.error.GraphQLError) obj);
                }
            }, 30, null))), null, 4, null);
            return com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.GraphQLError.INSTANCE;
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
            pairArr[0] = kotlin.TuplesKt.to("code", java.lang.String.valueOf(httpError.getCode()));
            java.lang.String message = httpError.getMessage();
            pairArr[1] = kotlin.TuplesKt.to("message", message != null ? message : "");
            com.paypal.android.logger.Logger.w$default(logger, "HTTP error occurred", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.HttpError.INSTANCE;
        }
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.NoInternet.INSTANCE;
        }
        if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError.UnknownError unknownError = (com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error;
        java.lang.String message2 = unknownError.getCause().getMessage();
        return new com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.Unknown(message2 != null ? message2 : "", unknownError.getCause());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object unlinkAccount(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$unlinkAccount$1 userAccountSwitchRepositoryImpl$unlinkAccount$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation.Data data;
        com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation.RemoveAuthenticationProfileLink removeAuthenticationProfileLink;
        com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation.Data data2;
        if (continuation instanceof com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$unlinkAccount$1) {
            userAccountSwitchRepositoryImpl$unlinkAccount$1 = (com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$unlinkAccount$1) continuation;
            if ((userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation.RemoveAuthenticationProfileLink removeAuthenticationProfileLink2 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation unlinkLinkedAccountsMutation = new com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation();
                    com.apollographql.apollo.ApolloCall mutation = this.Camera2StreamConfigurationMap.get().mutation(unlinkLinkedAccountsMutation);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("unlink_account", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                    userAccountSwitchRepositoryImpl$unlinkAccount$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unlinkLinkedAccountsMutation);
                    userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutation);
                    userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(mutation, callConfig, userAccountSwitchRepositoryImpl$unlinkAccount$1);
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
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unlink account failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Ior.Left(getHighSpeedVideoFpsRanges(callError));
                }
                if (!(ior instanceof arrow.core.Ior.Right)) {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    if (graphQLData == null || (data = (com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation.Data) graphQLData.getData()) == null || (removeAuthenticationProfileLink = data.getRemoveAuthenticationProfileLink()) == null) {
                        return new arrow.core.Ior.Left(getHighSpeedVideoFpsRanges(callError2));
                    }
                    return removeAuthenticationProfileLink.getSuccess() ? new arrow.core.Ior.Both(getHighSpeedVideoFpsRanges(callError2), java.lang.Boolean.TRUE) : new arrow.core.Ior.Left(getHighSpeedVideoFpsRanges(callError2));
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                if (graphQLData2 != null && (data2 = (com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation.Data) graphQLData2.getData()) != null) {
                    removeAuthenticationProfileLink2 = data2.getRemoveAuthenticationProfileLink();
                }
                if (removeAuthenticationProfileLink2 == null) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "GraphQL response missing unlink data", null, null, null, 14, null);
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.AccountDataError.INSTANCE);
                }
                if (removeAuthenticationProfileLink2.getSuccess()) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Account unlinked successfully", null, null, 6, null);
                    return new arrow.core.Ior.Right(java.lang.Boolean.TRUE);
                }
                if (!removeAuthenticationProfileLink2.getSuccess()) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unlink operation failed with success=false", null, null, 6, null);
                    return new arrow.core.Ior.Left(new com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.Unknown("Failed to unlink account", new java.lang.RuntimeException("Unlink operation returned success=false")));
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unlink operation returned null success", null, null, 6, null);
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.Unknown("Unlink operation failed", new java.lang.RuntimeException("Unexpected unlink response state")));
            }
        }
        userAccountSwitchRepositoryImpl$unlinkAccount$1 = new com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$unlinkAccount$1(this, continuation);
        java.lang.Object obj2 = userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userAccountSwitchRepositoryImpl$unlinkAccount$1.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.identity.graphql.UnlinkLinkedAccountsMutation.RemoveAuthenticationProfileLink removeAuthenticationProfileLink22 = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object switchAccount(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError, ? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult>> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$switchAccount$1 userAccountSwitchRepositoryImpl$switchAccount$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$switchAccount$1) {
            userAccountSwitchRepositoryImpl$switchAccount$1 = (com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$switchAccount$1) continuation;
            if ((userAccountSwitchRepositoryImpl$switchAccount$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                userAccountSwitchRepositoryImpl$switchAccount$1.getInputFormats -= 2147483648;
                java.lang.Object obj = userAccountSwitchRepositoryImpl$switchAccount$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userAccountSwitchRepositoryImpl$switchAccount$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput = new com.paypal.oslo.api.graphql.schema.type.AuthenticateInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.SWITCH_ACCOUNT, str, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.TOKEN_EXCHANGE), new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.SWITCH_PROFILE, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.SwitchProfileChallengeInput(str2)), null, null, null, null, null, null, null, null, null, 32734, null), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("switch_account", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation(authenticateInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getSessionTransfer(), null, null, 6, null));
                    userAccountSwitchRepositoryImpl$switchAccount$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    userAccountSwitchRepositoryImpl$switchAccount$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    userAccountSwitchRepositoryImpl$switchAccount$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticateInput);
                    userAccountSwitchRepositoryImpl$switchAccount$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    userAccountSwitchRepositoryImpl$switchAccount$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    userAccountSwitchRepositoryImpl$switchAccount$1.getInputFormats = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, userAccountSwitchRepositoryImpl$switchAccount$1);
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
                    return arrow.core.IorKt.leftIor(getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.error.CallError) leftValue);
                    arrow.core.Ior<com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError, com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(graphQLData);
                    if (Camera2StreamConfigurationMap instanceof arrow.core.Ior.Left) {
                        return new arrow.core.Ior.Left(highSpeedVideoFpsRanges);
                    }
                    if (Camera2StreamConfigurationMap instanceof arrow.core.Ior.Right) {
                        return new arrow.core.Ior.Both(highSpeedVideoFpsRanges, (com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult) ((arrow.core.Ior.Right) Camera2StreamConfigurationMap).getValue());
                    }
                    if (Camera2StreamConfigurationMap instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) Camera2StreamConfigurationMap;
                        return new arrow.core.Ior.Both(highSpeedVideoFpsRanges, (com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult) both2.getRightValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        userAccountSwitchRepositoryImpl$switchAccount$1 = new com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$switchAccount$1(this, continuation);
        java.lang.Object obj2 = userAccountSwitchRepositoryImpl$switchAccount$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userAccountSwitchRepositoryImpl$switchAccount$1.getInputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Ior<com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError, com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult> Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data> p0) {
        com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data data;
        com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate = (p0 == null || (data = p0.getData()) == null) ? null : data.getAuthenticate();
        if (authenticate == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "GraphQL response missing authenticate data", null, null, null, 14, null);
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.AccountDataError.INSTANCE);
        }
        if (authenticate.getOnAuthenticationTokenResult() != null) {
            java.lang.String token = authenticate.getOnAuthenticationTokenResult().getToken();
            if (!kotlin.text.StringsKt.isBlank(token)) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Account switched successfully without step-up", null, null, 6, null);
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult.Success(token));
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Received empty token", null, null, null, 14, null);
            return new arrow.core.Ior.Left(com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.AccountDataError.INSTANCE);
        }
        if (authenticate.getOnAuthenticationChallengeResult() != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Step-up authentication required for account switch", null, null, 6, null);
            return new arrow.core.Ior.Right(new com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult.StepUpRequired(com.paypal.oslo.feature.identity.accountswitch.data.mapper.SwitchAccountChallengeMapperKt.toChallengeResult(authenticate.getOnAuthenticationChallengeResult())));
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unknown authenticate response type", null, null, null, 14, null);
        return new arrow.core.Ior.Left(com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.AccountDataError.INSTANCE);
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$K4SjM6_81FJB5dOQAHW9dfnsY3Y(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        return graphQLError.getMessage();
    }
}
