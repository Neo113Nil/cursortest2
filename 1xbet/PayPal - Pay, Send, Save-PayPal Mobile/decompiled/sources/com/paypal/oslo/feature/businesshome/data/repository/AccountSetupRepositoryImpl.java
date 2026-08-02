package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0012J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/repository/AccountSetupRepositoryImpl;", "Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;", "type", "", "completeStep", "(Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupError;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "getAccountSetupStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPayGetPaidVerificationComplete", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "setPayGetPaidVerificationComplete", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAccountSetupComplete", "setAccountSetupComplete", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "", "", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountSetupRepositoryImpl implements com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AccountSetupRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
        this.getHighSpeedVideoFpsRanges = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object completeStep(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAccountSetupStatus(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError, com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus>> continuation) {
        com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl$getAccountSetupStatus$1 accountSetupRepositoryImpl$getAccountSetupStatus$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus domain;
        arrow.core.Either right;
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility2;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus domain2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl$getAccountSetupStatus$1) {
            accountSetupRepositoryImpl$getAccountSetupStatus$1 = (com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl$getAccountSetupStatus$1) continuation;
            if ((accountSetupRepositoryImpl$getAccountSetupStatus$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                accountSetupRepositoryImpl$getAccountSetupStatus$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = accountSetupRepositoryImpl$getAccountSetupStatus$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountSetupRepositoryImpl$getAccountSetupStatus$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.get().query(new com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    accountSetupRepositoryImpl$getAccountSetupStatus$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, accountSetupRepositoryImpl$getAccountSetupStatus$1, 2, null);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImplKt.access$toAccountSetupError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data data = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return (data == null || (merchantEligibility2 = data.getMerchantEligibility()) == null || (domain2 = com.paypal.oslo.feature.businesshome.data.mapper.AccountSetupMapperKt.toDomain(merchantEligibility2)) == null || (right2 = arrow.core.EitherKt.right(domain2)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError.UnexpectedResponseError.INSTANCE) : right2;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data data2 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return (data2 == null || (merchantEligibility = data2.getMerchantEligibility()) == null || (domain = com.paypal.oslo.feature.businesshome.data.mapper.AccountSetupMapperKt.toDomain(merchantEligibility)) == null || (right = arrow.core.EitherKt.right(domain)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError.UnexpectedResponseError.INSTANCE) : right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountSetupRepositoryImpl$getAccountSetupStatus$1 = new com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl$getAccountSetupStatus$1(this, continuation);
        java.lang.Object obj2 = accountSetupRepositoryImpl$getAccountSetupStatus$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountSetupRepositoryImpl$getAccountSetupStatus$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object isPayGetPaidVerificationComplete(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String id;
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoFpsRanges.getUserState().getValue();
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded == null || (user = profileLoaded.getUser()) == null || (id = user.getId()) == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        java.lang.Boolean bool = this.getHighResolutionOutputSizeshNQ4ISI.get(id);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object setPayGetPaidVerificationComplete(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String id;
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoFpsRanges.getUserState().getValue();
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded == null || (user = profileLoaded.getUser()) == null || (id = user.getId()) == null) {
            return kotlin.Unit.INSTANCE;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(id, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object isAccountSetupComplete(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String id;
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoFpsRanges.getUserState().getValue();
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded == null || (user = profileLoaded.getUser()) == null || (id = user.getId()) == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        java.lang.Boolean bool = this.Camera2StreamConfigurationMap.get(id);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository
    public final java.lang.Object setAccountSetupComplete(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String id;
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoFpsRanges.getUserState().getValue();
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded == null || (user = profileLoaded.getUser()) == null || (id = user.getId()) == null) {
            return kotlin.Unit.INSTANCE;
        }
        this.Camera2StreamConfigurationMap.put(id, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
        return kotlin.Unit.INSTANCE;
    }
}
