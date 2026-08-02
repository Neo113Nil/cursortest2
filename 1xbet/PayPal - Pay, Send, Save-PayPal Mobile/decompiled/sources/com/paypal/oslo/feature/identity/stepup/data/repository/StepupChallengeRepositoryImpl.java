package com.paypal.oslo.feature.identity.stepup.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/data/repository/StepupChallengeRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/stepup/domain/repository/StepupChallengeRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeMapper;", "challengeMapper", "Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeErrorMapper;", "errorMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeMapper;Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeErrorMapper;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/TransactionChallengeContext;", "transactionContext", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupChallengeError;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "fetchStepupChallenges", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/TransactionChallengeContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeMapper;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeErrorMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepupChallengeRepositoryImpl implements com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository {

    @java.lang.Deprecated
    public static final java.lang.String FLOW_SOURCE_FETCH_CHALLENGES = "stepup_fetch_challenges";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeErrorMapper getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public StepupChallengeRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeMapper stepupChallengeMapper, com.paypal.oslo.feature.identity.stepup.data.mapper.StepupChallengeErrorMapper stepupChallengeErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupChallengeMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupChallengeErrorMapper, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighSpeedVideoFpsRangesFor = stepupChallengeMapper;
        this.getHighSpeedVideoSizes = stepupChallengeErrorMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192 A[Catch: all -> 0x01b3, RaiseCancellationException -> 0x01bc, TryCatch #3 {RaiseCancellationException -> 0x01bc, all -> 0x01b3, blocks: (B:11:0x0047, B:25:0x0141, B:27:0x0150, B:30:0x015b, B:31:0x016a, B:32:0x016b, B:33:0x0177, B:43:0x0178, B:44:0x0189, B:48:0x018a, B:49:0x0191, B:50:0x0192, B:51:0x01aa, B:55:0x005d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.paypal.oslo.feature.identity.stepup.domain.repository.StepupChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchStepupChallenges(com.paypal.oslo.feature.identity.shared.domain.model.challenge.TransactionChallengeContext transactionChallengeContext, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError, ? extends java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge>>> continuation) {
        com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl$fetchStepupChallenges$1 stepupChallengeRepositoryImpl$fetchStepupChallenges$1;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl$fetchStepupChallenges$1) {
                stepupChallengeRepositoryImpl$fetchStepupChallenges$1 = (com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl$fetchStepupChallenges$1) continuation;
                if ((stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    defaultRaise = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getInputSizeshNQ4ISI;
                    boolean z = false;
                    boolean z2 = false;
                    if (defaultRaise != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput stepUpIdentityChallengesInput = new com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(transactionChallengeContext.getStepUpContextId()), com.apollographql.apollo.api.Optional.INSTANCE.present(transactionChallengeContext.getFlowName()), com.apollographql.apollo.api.Optional.INSTANCE.present(transactionChallengeContext.getFlowContext()), null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(transactionChallengeContext.getFlowContextId()), com.apollographql.apollo.api.Optional.Absent.INSTANCE, 8, null);
                        com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery stepUpIdentityChallengesQuery = new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery(stepUpIdentityChallengesInput);
                        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.apollographql.apollo.ApolloClient apolloClient2 = apolloClient;
                        com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery stepUpIdentityChallengesQuery2 = stepUpIdentityChallengesQuery;
                        try {
                            com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(FLOW_SOURCE_FETCH_CHALLENGES, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), z2 ? 1 : 0, 2, z ? 1 : 0);
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionChallengeContext);
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getOutputFormats = defaultRaise;
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getInputFormats = defaultRaise2;
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepUpIdentityChallengesInput);
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(stepUpIdentityChallengesQuery);
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighSpeedVideoFpsRanges = 0;
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.Camera2StreamConfigurationMap = 0;
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighSpeedVideoSizes = 0;
                            stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getInputSizeshNQ4ISI = 1;
                            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient2, stepUpIdentityChallengesQuery2, callConfig, stepupChallengeRepositoryImpl$fetchStepupChallenges$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = defaultRaise2;
                            defaultRaise = defaultRaise;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } else {
                        if (defaultRaise != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighSpeedVideoSizes;
                        int i2 = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.Camera2StreamConfigurationMap;
                        int i4 = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getHighSpeedVideoFpsRanges;
                        raise = (arrow.core.raise.Raise) stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getInputFormats;
                        arrow.core.raise.DefaultRaise defaultRaise3 = (arrow.core.raise.DefaultRaise) stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = defaultRaise3;
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoSizes.mapCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    } else {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                    }
                    com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data data = (com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data) graphQLData.getData();
                    java.util.List<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> stepUpIdentityChallenges = data != null ? data.getStepUpIdentityChallenges() : null;
                    if (stepUpIdentityChallenges != null) {
                        if (!stepUpIdentityChallenges.isEmpty()) {
                            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> mapToChallenges = this.getHighSpeedVideoFpsRangesFor.mapToChallenges(stepUpIdentityChallenges);
                            if (mapToChallenges.isEmpty()) {
                                raise.raise(new com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.Unknown("All challenges were unsupported or invalid"));
                                throw new kotlin.KotlinNothingValueException();
                            }
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(mapToChallenges);
                        }
                        raise.raise(com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.NoChallengesReturned.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    raise.raise(new com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.Unknown("No data returned from stepUpIdentityChallenges query"));
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            if (defaultRaise != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        stepupChallengeRepositoryImpl$fetchStepupChallenges$1 = new com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl$fetchStepupChallenges$1(this, continuation);
        java.lang.Object obj2 = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        defaultRaise = stepupChallengeRepositoryImpl$fetchStepupChallenges$1.getInputSizeshNQ4ISI;
        boolean z3 = false;
        boolean z22 = false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/data/repository/StepupChallengeRepositoryImpl$Companion;", "", "<init>", "()V", "", "FLOW_SOURCE_FETCH_CHALLENGES", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
