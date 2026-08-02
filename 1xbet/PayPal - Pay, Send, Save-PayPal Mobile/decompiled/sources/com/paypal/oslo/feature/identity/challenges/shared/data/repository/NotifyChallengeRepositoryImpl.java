package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BW\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012(\u0010\u000e\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tj\u0007`\f¢\u0006\u0002\b\r¢\u0006\u0002\b\r0\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R6\u0010#\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tj\u0007`\f¢\u0006\u0002\b\r¢\u0006\u0002\b\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010&R\u0014\u0010 \u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/data/repository/NotifyChallengeRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/NotifyChallengeRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "config", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "Lkotlin/jvm/JvmSuppressWildcards;", "inputBuilders", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "<init>", "(Ldagger/Lazy;Ljavax/inject/Provider;Ljava/util/Set;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;)V", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyChallengeInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "notifyChallengeWithTransactional", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyChallengeInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyChallengeWithAuthenticate", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Data;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljavax/inject/Provider;", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotifyChallengeRepositoryImpl implements com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public NotifyChallengeRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        this.getHighSpeedVideoFpsRanges = lazy;
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = set;
        this.getHighSpeedVideoSizes = identityTokenStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object notifyChallengeWithTransactional(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput notifyChallengeInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult>> continuation) {
        com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1 notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1;
        int i;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput loginRequest;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput graphQLInput;
        com.apollographql.apollo.ApolloCall addExecutionContext;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput notifyChallengeInput2;
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation deliverStepUpIdentityChallengeMutation;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1) {
            notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1 = (com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1) continuation;
            if ((notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    loginRequest = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.NotifyChallengeMappersKt.toLoginRequest(notifyChallengeInput);
                    graphQLInput = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.NotifyChallengeMappersKt.toGraphQLInput(loginRequest);
                    com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation deliverStepUpIdentityChallengeMutation2 = new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation(graphQLInput);
                    addExecutionContext = this.getHighSpeedVideoFpsRanges.get().mutation(deliverStepUpIdentityChallengeMutation2).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getStepupNotificationDeliver(), null, null, 6, null));
                    java.lang.String partialToken = notifyChallengeInput.getPartialToken();
                    com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.getHighSpeedVideoSizes;
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(notifyChallengeInput);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deliverStepUpIdentityChallengeMutation2);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighResolutionOutputSizeshNQ4ISI = addExecutionContext;
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizesFor = 1;
                    java.lang.Object applyStepupAuthHeader = com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt.applyStepupAuthHeader(addExecutionContext, partialToken, identityTokenStorage, "No token available during notify challenge", notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1);
                    if (applyStepupAuthHeader != coroutine_suspended) {
                        notifyChallengeInput2 = notifyChallengeInput;
                        deliverStepUpIdentityChallengeMutation = deliverStepUpIdentityChallengeMutation2;
                        obj = applyStepupAuthHeader;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Ior ior = (arrow.core.Ior) obj;
                    if (ior instanceof arrow.core.Ior.Left) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.AuthenticationError(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString()));
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.NotifyChallengeMappersKt.mapDeliverResponseToDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()));
                    }
                    if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.NotifyChallengeMappersKt.mapDeliverResponseToDomain((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                addExecutionContext = (com.apollographql.apollo.ApolloCall) notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighResolutionOutputSizeshNQ4ISI;
                deliverStepUpIdentityChallengeMutation = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation) notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoFpsRangesFor;
                graphQLInput = (com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput) notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.Camera2StreamConfigurationMap;
                loginRequest = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput) notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoFpsRanges;
                notifyChallengeInput2 = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput) notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return arrow.core.EitherKt.left((com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.AuthenticationError) ((arrow.core.Either.Left) either).getValue());
                }
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = (com.paypal.oslo.core.network.graphql.CallConfig) ((arrow.core.Either.Right) either).getValue();
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(notifyChallengeInput2);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deliverStepUpIdentityChallengeMutation);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizesFor = 2;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1 = new com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1(this, continuation);
        java.lang.Object obj2 = notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notifyChallengeRepositoryImpl$notifyChallengeWithTransactional$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object notifyChallengeWithAuthenticate(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput notifyChallengeInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult>> continuation) {
        com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1 notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildAuthInput;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1) {
            notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1 = (com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1) continuation;
            if ((notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput loginRequest = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.NotifyChallengeMappersKt.toLoginRequest(notifyChallengeInput);
                    com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig = this.Camera2StreamConfigurationMap.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authenticationConfig, "");
                    buildAuthInput = com.paypal.oslo.feature.identity.login.data.InputBuildersKt.buildAuthInput(loginRequest, authenticationConfig, this.getHighSpeedVideoFpsRangesFor, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null, (r13 & 32) != 0 ? null : null);
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(buildAuthInput);
                    com.apollographql.apollo.ApolloCall addHttpHeader = this.getHighSpeedVideoFpsRanges.get().mutation(loginUserMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getStepupNotificationLogin(), null, null, 6, null)).addHttpHeader("Authorization", "Bearer ".concat(java.lang.String.valueOf(notifyChallengeInput.getPartialToken())));
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(com.paypal.oslo.core.network.graphql.AuthType.None.INSTANCE, null, 2, null);
                    notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(notifyChallengeInput);
                    notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest);
                    notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildAuthInput);
                    notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginUserMutation);
                    notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addHttpHeader);
                    notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getOutputFormats = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addHttpHeader, callConfig, notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1);
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
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.AuthenticationError(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1 = new com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1(this, continuation);
        java.lang.Object obj2 = notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1.getOutputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> p0) {
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult domain;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data data = p0.getData();
        return (data == null || (authenticate = data.getAuthenticate()) == null || (onAuthenticationChallengeResult = authenticate.getOnAuthenticationChallengeResult()) == null || (domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.NotifyChallengeMappersKt.toDomain(onAuthenticationChallengeResult)) == null) ? new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult(null, null, null, null, null, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.DEFAULT, null, 95, null) : domain;
    }
}
