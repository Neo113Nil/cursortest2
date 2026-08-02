package com.paypal.oslo.feature.settings.closeaccount.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a0\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/data/repository/CloseAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountEligibilityResult;", "checkCloseAccountEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "reason", "", "skipNotification", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountResult;", "closeAccount", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;", "activityLog", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "createAccountActivityLog", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserProfile;", "getUserProfileForCloseAccount", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountRepositoryImpl implements com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository {

    @java.lang.Deprecated
    public static final java.lang.String UNKNOWN_ERROR = "Unknown error";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CloseAccountRepositoryImpl(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iSettingsApolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = iSettingsApolloClient;
        this.getHighSpeedVideoSizes = userStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkCloseAccountEligibility(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult>> continuation) {
        com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$checkCloseAccountEligibility$1 closeAccountRepositoryImpl$checkCloseAccountEligibility$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$checkCloseAccountEligibility$1) {
                closeAccountRepositoryImpl$checkCloseAccountEligibility$1 = (com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$checkCloseAccountEligibility$1) continuation;
                if ((closeAccountRepositoryImpl$checkCloseAccountEligibility$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    closeAccountRepositoryImpl$checkCloseAccountEligibility$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = closeAccountRepositoryImpl$checkCloseAccountEligibility$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = closeAccountRepositoryImpl$checkCloseAccountEligibility$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput closeAccountEligibilityInput = new com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput(com.apollographql.apollo.api.Optional.Absent.INSTANCE);
                        com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient = this.getHighSpeedVideoFpsRanges;
                        closeAccountRepositoryImpl$checkCloseAccountEligibility$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountEligibilityInput);
                        closeAccountRepositoryImpl$checkCloseAccountEligibility$1.Camera2StreamConfigurationMap = 1;
                        obj = iSettingsApolloClient.checkCloseAccountEligibility(closeAccountEligibilityInput, closeAccountRepositoryImpl$checkCloseAccountEligibility$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CloseAccountEligibilityMapperKt.toCloseAccountEligibilityIor((arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data>>) obj);
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CloseAccountEligibilityMapperKt.toCloseAccountEligibilityIor((arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data>>) obj);
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.android.logger.categories.Data.SyncError.INSTANCE, "Failed to check close account eligibility", null, null, e, 12, null);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError(message, kotlin.collections.CollectionsKt.emptyList(), null, 4, null));
        }
        closeAccountRepositoryImpl$checkCloseAccountEligibility$1 = new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$checkCloseAccountEligibility$1(this, continuation);
        java.lang.Object obj2 = closeAccountRepositoryImpl$checkCloseAccountEligibility$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = closeAccountRepositoryImpl$checkCloseAccountEligibility$1.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object closeAccount(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountResult>> continuation) {
        com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$closeAccount$1 closeAccountRepositoryImpl$closeAccount$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$closeAccount$1) {
                closeAccountRepositoryImpl$closeAccount$1 = (com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$closeAccount$1) continuation;
                if ((closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient = this.getHighSpeedVideoFpsRanges;
                        closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        closeAccountRepositoryImpl$closeAccount$1.getHighResolutionOutputSizeshNQ4ISI = z;
                        closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoFpsRanges = 1;
                        obj = iSettingsApolloClient.closeAccount(str, z, closeAccountRepositoryImpl$closeAccount$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = closeAccountRepositoryImpl$closeAccount$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CloseAccountMapperKt.toCloseAccountIor((com.apollographql.apollo.api.ApolloResponse) obj);
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CloseAccountMapperKt.toCloseAccountIor((com.apollographql.apollo.api.ApolloResponse) obj);
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.android.logger.categories.Data.SyncError.INSTANCE, "Failed to close account", null, null, e, 12, null);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError(message, kotlin.collections.CollectionsKt.emptyList(), null, 4, null));
        }
        closeAccountRepositoryImpl$closeAccount$1 = new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$closeAccount$1(this, continuation);
        java.lang.Object obj2 = closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = closeAccountRepositoryImpl$closeAccount$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createAccountActivityLog(com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog accountActivityLog, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog>> continuation) {
        com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$createAccountActivityLog$1 closeAccountRepositoryImpl$createAccountActivityLog$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$createAccountActivityLog$1) {
                closeAccountRepositoryImpl$createAccountActivityLog$1 = (com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$createAccountActivityLog$1) continuation;
                if ((closeAccountRepositoryImpl$createAccountActivityLog$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    closeAccountRepositoryImpl$createAccountActivityLog$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = closeAccountRepositoryImpl$createAccountActivityLog$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = closeAccountRepositoryImpl$createAccountActivityLog$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput graphQLInput = com.paypal.oslo.feature.settings.closeaccount.data.mapper.AccountActivityLogInputMapperKt.toGraphQLInput(accountActivityLog);
                        com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient = this.getHighSpeedVideoFpsRanges;
                        closeAccountRepositoryImpl$createAccountActivityLog$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountActivityLog);
                        closeAccountRepositoryImpl$createAccountActivityLog$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                        closeAccountRepositoryImpl$createAccountActivityLog$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = iSettingsApolloClient.createAccountActivityLog(graphQLInput, closeAccountRepositoryImpl$createAccountActivityLog$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CreateAccountActivityLogMapperKt.toCreateAccountActivityLogIor((com.apollographql.apollo.api.ApolloResponse) obj);
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CreateAccountActivityLogMapperKt.toCreateAccountActivityLogIor((com.apollographql.apollo.api.ApolloResponse) obj);
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.android.logger.categories.Data.SyncError.INSTANCE, "Failed to create account activity log", null, null, e, 12, null);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = UNKNOWN_ERROR;
            }
            return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError(message, kotlin.collections.CollectionsKt.emptyList(), null, 4, null));
        }
        closeAccountRepositoryImpl$createAccountActivityLog$1 = new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$createAccountActivityLog$1(this, continuation);
        java.lang.Object obj2 = closeAccountRepositoryImpl$createAccountActivityLog$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = closeAccountRepositoryImpl$createAccountActivityLog$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile>> getUserProfileForCloseAccount() {
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = this.getHighSpeedVideoSizes.getUserState();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError, ? extends com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile>>() { // from class: com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                arrow.core.Either either = null;
                                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                    com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState;
                                    java.lang.String accountType = profileLoaded.getUser().getAccountType();
                                    com.paypal.oslo.core.userstore.model.ProfileEmail primaryEmailAddress = profileLoaded.getUser().getPrimaryEmailAddress();
                                    either = arrow.core.EitherKt.right(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile(accountType, primaryEmailAddress != null ? primaryEmailAddress.getEmailAddress() : null, profileLoaded.getUser().getCountry()));
                                } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError) {
                                    com.paypal.oslo.core.userstore.model.UserState.ProfileError profileError = (com.paypal.oslo.core.userstore.model.UserState.ProfileError) userState;
                                    com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.android.logger.categories.Data.SyncError.INSTANCE, "Failed to load user profile for close account", null, null, profileError.getCause(), 12, null);
                                    either = arrow.core.EitherKt.left(new com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError(profileError.getCause()));
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.Camera2StreamConfigurationMap = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(either, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1$2", f = "CloseAccountRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoSizes = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError, ? extends com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl$getUserProfileForCloseAccount$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/data/repository/CloseAccountRepositoryImpl$Companion;", "", "<init>", "()V", "", "UNKNOWN_ERROR", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
