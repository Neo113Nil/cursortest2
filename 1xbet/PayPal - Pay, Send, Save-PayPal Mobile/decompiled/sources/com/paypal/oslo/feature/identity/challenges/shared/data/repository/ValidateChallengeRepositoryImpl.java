package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/data/repository/ValidateChallengeRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/repository/ValidateChallengeRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;)V", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "validateChallenge", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ValidateChallengeRepositoryImpl implements com.paypal.oslo.feature.identity.challenges.shared.domain.repository.ValidateChallengeRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage Camera2StreamConfigurationMap;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ValidateChallengeRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        this.getHighSpeedVideoSizes = lazy;
        this.Camera2StreamConfigurationMap = identityTokenStorage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.identity.challenges.shared.domain.repository.ValidateChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object validateChallenge(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult>> continuation) {
        com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl$validateChallenge$1 validateChallengeRepositoryImpl$validateChallenge$1;
        int i;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput loginRequest;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput graphQLInput;
        com.apollographql.apollo.ApolloCall addExecutionContext;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput2;
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation validateStepUpIdentityChallengeMutation;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl$validateChallenge$1) {
            validateChallengeRepositoryImpl$validateChallenge$1 = (com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl$validateChallenge$1) continuation;
            if ((validateChallengeRepositoryImpl$validateChallenge$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                validateChallengeRepositoryImpl$validateChallenge$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = validateChallengeRepositoryImpl$validateChallenge$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    loginRequest = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ValidateChallengeMappersKt.toLoginRequest(validateChallengeInput);
                    graphQLInput = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ValidateChallengeMappersKt.toGraphQLInput(loginRequest);
                    com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation validateStepUpIdentityChallengeMutation2 = new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation(graphQLInput);
                    addExecutionContext = this.getHighSpeedVideoSizes.get().mutation(validateStepUpIdentityChallengeMutation2).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getStepupValidationChallenge(), null, null, 6, null));
                    java.lang.String partialToken = validateChallengeInput.getPartialToken();
                    com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.Camera2StreamConfigurationMap;
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput);
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest);
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                    validateChallengeRepositoryImpl$validateChallenge$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateStepUpIdentityChallengeMutation2);
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoFpsRanges = addExecutionContext;
                    validateChallengeRepositoryImpl$validateChallenge$1.getInputSizeshNQ4ISI = 1;
                    java.lang.Object applyStepupAuthHeader = com.paypal.oslo.feature.identity.challenges.shared.data.repository.TokenAuthResolverKt.applyStepupAuthHeader(addExecutionContext, partialToken, identityTokenStorage, "No token available during validate challenge", validateChallengeRepositoryImpl$validateChallenge$1);
                    if (applyStepupAuthHeader != coroutine_suspended) {
                        validateChallengeInput2 = validateChallengeInput;
                        validateStepUpIdentityChallengeMutation = validateStepUpIdentityChallengeMutation2;
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
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ValidateChallengeMappersKt.mapValidateResponseToDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()));
                    }
                    if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ValidateChallengeMappersKt.mapValidateResponseToDomain((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                addExecutionContext = (com.apollographql.apollo.ApolloCall) validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoFpsRanges;
                validateStepUpIdentityChallengeMutation = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation) validateChallengeRepositoryImpl$validateChallenge$1.Camera2StreamConfigurationMap;
                graphQLInput = (com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput) validateChallengeRepositoryImpl$validateChallenge$1.getHighResolutionOutputSizeshNQ4ISI;
                loginRequest = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput) validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoSizes;
                validateChallengeInput2 = (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput) validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return arrow.core.EitherKt.left((com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.AuthenticationError) ((arrow.core.Either.Left) either).getValue());
                }
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = (com.paypal.oslo.core.network.graphql.CallConfig) ((arrow.core.Either.Right) either).getValue();
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput2);
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest);
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                    validateChallengeRepositoryImpl$validateChallenge$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateStepUpIdentityChallengeMutation);
                    validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    validateChallengeRepositoryImpl$validateChallenge$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    validateChallengeRepositoryImpl$validateChallenge$1.getInputSizeshNQ4ISI = 2;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, validateChallengeRepositoryImpl$validateChallenge$1);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        validateChallengeRepositoryImpl$validateChallenge$1 = new com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl$validateChallenge$1(this, continuation);
        java.lang.Object obj2 = validateChallengeRepositoryImpl$validateChallenge$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validateChallengeRepositoryImpl$validateChallenge$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }
}
