package com.paypal.oslo.feature.identity.passwordrecovery.data.repository;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BO\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012(\u0010\u000e\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tj\u0007`\f¢\u0006\u0002\b\r¢\u0006\u0002\b\r0\b¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R6\u0010#\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tj\u0007`\f¢\u0006\u0002\b\r¢\u0006\u0002\b\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/data/repository/PasswordRecoveryRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/repository/PasswordRecoveryRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "config", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "Lkotlin/jvm/JvmSuppressWildcards;", "inputBuilders", "<init>", "(Ldagger/Lazy;Ljavax/inject/Provider;Ljava/util/Set;)V", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/InitiatePasswordRecoveryInput;", "initiatePasswordRecoveryInput", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/InitiatePasswordRecoveryOutput;", "initiatePasswordRecovery", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/InitiatePasswordRecoveryInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordInput;", "createPasswordInput", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "createPassword", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljavax/inject/Provider;", "Ljava/util/Set;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasswordRecoveryRepositoryImpl implements com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PasswordRecoveryRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, java.util.Set<kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initiatePasswordRecovery(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput initiatePasswordRecoveryInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError, com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryOutput>> continuation) {
        com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$initiatePasswordRecovery$1 passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildAuthInput;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$initiatePasswordRecovery$1) {
            passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1 = (com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$initiatePasswordRecovery$1) continuation;
            if ((passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig = this.getHighSpeedVideoFpsRanges.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authenticationConfig, "");
                    buildAuthInput = com.paypal.oslo.feature.identity.login.data.InputBuildersKt.buildAuthInput(initiatePasswordRecoveryInput, authenticationConfig, this.Camera2StreamConfigurationMap, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null, (r13 & 32) != 0 ? null : null);
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(buildAuthInput);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("password_recovery_flow", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, 0 == true ? 1 : 0);
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.getHighResolutionOutputSizeshNQ4ISI.get().mutation(loginUserMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getPasswordRecovery(), null, null, 6, null));
                    passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiatePasswordRecoveryInput);
                    passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildAuthInput);
                    passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginUserMutation);
                    passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.data.mapper.PasswordRecoveryErrorMapperKt.toPasswordRecoveryError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return com.paypal.oslo.feature.identity.passwordrecovery.data.mapper.PasswordRecoveryResponseMapperKt.toInitiatePasswordRecoveryOutput((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return com.paypal.oslo.feature.identity.passwordrecovery.data.mapper.PasswordRecoveryResponseMapperKt.toInitiatePasswordRecoveryOutput((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1 = new com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$initiatePasswordRecovery$1(this, continuation);
        java.lang.Object obj2 = passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passwordRecoveryRepositoryImpl$initiatePasswordRecovery$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createPassword(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordInput createPasswordInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError, com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput>> continuation) {
        com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$createPassword$1 passwordRecoveryRepositoryImpl$createPassword$1;
        int i;
        com.apollographql.apollo.ApolloCall mutation;
        com.paypal.oslo.core.network.graphql.AuthType.Client client;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$createPassword$1) {
            passwordRecoveryRepositoryImpl$createPassword$1 = (com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$createPassword$1) continuation;
            if ((passwordRecoveryRepositoryImpl$createPassword$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                passwordRecoveryRepositoryImpl$createPassword$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = passwordRecoveryRepositoryImpl$createPassword$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passwordRecoveryRepositoryImpl$createPassword$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig = this.getHighSpeedVideoFpsRanges.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authenticationConfig, "");
                    com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildCreatePasswordAuthInput = com.paypal.oslo.feature.identity.passwordrecovery.data.PasswordRecoveryInputBuildersKt.buildCreatePasswordAuthInput(createPasswordInput, authenticationConfig);
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(buildCreatePasswordAuthInput);
                    java.lang.String partialToken = createPasswordInput.getPartialToken();
                    if (partialToken == null || (mutation = this.getHighResolutionOutputSizeshNQ4ISI.get().mutation(loginUserMutation).addHttpHeader("Authorization", "Bearer ".concat(java.lang.String.valueOf(partialToken)))) == null) {
                        mutation = this.getHighResolutionOutputSizeshNQ4ISI.get().mutation(loginUserMutation);
                    }
                    java.lang.Object[] objArr = 0;
                    java.lang.Object[] objArr2 = 0;
                    com.apollographql.apollo.ApolloCall addExecutionContext = mutation.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getPasswordRecovery(), null, null, 6, null));
                    int i2 = 2;
                    if (createPasswordInput.getPartialToken() != null) {
                        client = com.paypal.oslo.core.network.graphql.AuthType.None.INSTANCE;
                    } else {
                        client = new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("password_recovery_flow", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    }
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(client, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
                    passwordRecoveryRepositoryImpl$createPassword$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createPasswordInput);
                    passwordRecoveryRepositoryImpl$createPassword$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildCreatePasswordAuthInput);
                    passwordRecoveryRepositoryImpl$createPassword$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginUserMutation);
                    passwordRecoveryRepositoryImpl$createPassword$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    passwordRecoveryRepositoryImpl$createPassword$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    passwordRecoveryRepositoryImpl$createPassword$1.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, passwordRecoveryRepositoryImpl$createPassword$1);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.data.mapper.PasswordRecoveryErrorMapperKt.toPasswordRecoveryError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return com.paypal.oslo.feature.identity.passwordrecovery.data.mapper.PasswordRecoveryResponseMapperKt.toCreatePasswordOutput((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return com.paypal.oslo.feature.identity.passwordrecovery.data.mapper.PasswordRecoveryResponseMapperKt.toCreatePasswordOutput((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        passwordRecoveryRepositoryImpl$createPassword$1 = new com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$createPassword$1(this, continuation);
        java.lang.Object obj2 = passwordRecoveryRepositoryImpl$createPassword$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passwordRecoveryRepositoryImpl$createPassword$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
