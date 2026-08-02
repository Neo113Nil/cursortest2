package com.paypal.oslo.feature.identity.emailconfirmation.data.repository;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/data/repository/EmailConfirmationRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/repository/EmailConfirmationRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/request/EmailConfirmationRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationResult;", "confirmEmail", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/request/EmailConfirmationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/graphql/ConfirmAuthEmailMutation$Data;", "p0", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/identity/graphql/ConfirmAuthEmailMutation$Data;Ljava/lang/String;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationRepositoryImpl implements com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository {

    @java.lang.Deprecated
    public static final java.lang.String EMAIL_CONFIRMATION_FAILED_MESSAGE = "Email confirmation failed with status: %s";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public EmailConfirmationRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/data/repository/EmailConfirmationRepositoryImpl$Companion;", "", "<init>", "()V", "", "EMAIL_CONFIRMATION_FAILED_MESSAGE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object confirmEmail(com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest emailConfirmationRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError, ? extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult>> continuation) {
        com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl$confirmEmail$1 emailConfirmationRepositoryImpl$confirmEmail$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Either<com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError, com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult> highSpeedVideoFpsRangesFor;
        if (continuation instanceof com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl$confirmEmail$1) {
            emailConfirmationRepositoryImpl$confirmEmail$1 = (com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl$confirmEmail$1) continuation;
            if ((emailConfirmationRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                emailConfirmationRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = emailConfirmationRepositoryImpl$confirmEmail$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailConfirmationRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ConfirmEmailInput confirmEmailInput = new com.paypal.oslo.api.graphql.schema.type.ConfirmEmailInput(emailConfirmationRequest.getEncryptedEmail(), emailConfirmationRequest.getConfirmationCode());
                    com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation confirmAuthEmailMutation = new com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation(confirmEmailInput);
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.getHighSpeedVideoSizes.get().mutation(confirmAuthEmailMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getEmailConfirmation(), null, null, 6, null));
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    emailConfirmationRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRanges = emailConfirmationRequest;
                    emailConfirmationRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmEmailInput);
                    emailConfirmationRepositoryImpl$confirmEmail$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmAuthEmailMutation);
                    emailConfirmationRepositoryImpl$confirmEmail$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addExecutionContext);
                    emailConfirmationRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, emailConfirmationRepositoryImpl$confirmEmail$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    emailConfirmationRequest = (com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest) emailConfirmationRepositoryImpl$confirmEmail$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData(), emailConfirmationRequest.getEncryptedEmail());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation.Data data = (com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation.Data) graphQLData.getData();
                    return (data == null || data.getConfirmEmail() == null || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation.Data) graphQLData.getData(), emailConfirmationRequest.getEncryptedEmail())) == null) ? arrow.core.EitherKt.left(getHighSpeedVideoFpsRangesFor(callError)) : highSpeedVideoFpsRangesFor;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        emailConfirmationRepositoryImpl$confirmEmail$1 = new com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl$confirmEmail$1(this, continuation);
        java.lang.Object obj2 = emailConfirmationRepositoryImpl$confirmEmail$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailConfirmationRepositoryImpl$confirmEmail$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError, com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation.Data p0, java.lang.String p1) {
        com.paypal.oslo.feature.identity.graphql.ConfirmAuthEmailMutation.ConfirmEmail confirmEmail;
        if (p0 == null || (confirmEmail = p0.getConfirmEmail()) == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown(new java.lang.IllegalStateException("No data in response")));
        }
        int i = com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[confirmEmail.getStatus().ordinal()];
        if (i == 1) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success(p1));
        }
        if (i != 2 && i != 3 && i != 4 && i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String format = java.lang.String.format(EMAIL_CONFIRMATION_FAILED_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{confirmEmail.getStatus()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed(format));
    }

    private static com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        if (p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api(new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError(httpError.getCode(), httpError.getBody()));
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError.INSTANCE);
            }
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause());
        }
        if (!(p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api(new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError(new java.lang.IllegalStateException(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0).m11659getErrors1X0FAY()))).getMessage())));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.CONFIRMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.UNCONFIRMED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
