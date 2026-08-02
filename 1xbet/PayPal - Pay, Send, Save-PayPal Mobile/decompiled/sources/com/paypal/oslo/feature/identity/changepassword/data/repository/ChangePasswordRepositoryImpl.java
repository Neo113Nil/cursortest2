package com.paypal.oslo.feature.identity.changepassword.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/changepassword/data/repository/ChangePasswordRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/changepassword/domain/repository/ChangePasswordRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "currentPassword", androidx.autofill.HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "confirmNewPassword", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/changepassword/domain/model/ChangePasswordError;", "", "changePassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$Data;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$Data;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/changepassword/domain/model/ChangePasswordError;", "Ldagger/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangePasswordRepositoryImpl implements com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ChangePasswordRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object changePassword(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl$changePassword$1 changePasswordRepositoryImpl$changePassword$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Either<com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError, kotlin.Unit> highResolutionOutputSizeshNQ4ISI;
        if (continuation instanceof com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl$changePassword$1) {
            changePasswordRepositoryImpl$changePassword$1 = (com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl$changePassword$1) continuation;
            if ((changePasswordRepositoryImpl$changePassword$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                changePasswordRepositoryImpl$changePassword$1.getInputFormats -= 2147483648;
                com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl$changePassword$1 changePasswordRepositoryImpl$changePassword$12 = changePasswordRepositoryImpl$changePassword$1;
                java.lang.Object obj = changePasswordRepositoryImpl$changePassword$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = changePasswordRepositoryImpl$changePassword$12.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput changePasswordInput = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput(str, str2, str3);
                    com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation changeIdentityPasswordMutation = new com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation(changePasswordInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    changePasswordRepositoryImpl$changePassword$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    changePasswordRepositoryImpl$changePassword$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    changePasswordRepositoryImpl$changePassword$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    changePasswordRepositoryImpl$changePassword$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(changePasswordInput);
                    changePasswordRepositoryImpl$changePassword$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(changeIdentityPasswordMutation);
                    changePasswordRepositoryImpl$changePassword$12.getInputFormats = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, changeIdentityPasswordMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, changePasswordRepositoryImpl$changePassword$12, 2, (java.lang.Object) null);
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
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data data = (com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data) graphQLData.getData();
                    return (data == null || data.getChangePassword() == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data) graphQLData.getData())) == null) ? arrow.core.EitherKt.left(getHighSpeedVideoFpsRangesFor(callError)) : highResolutionOutputSizeshNQ4ISI;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        changePasswordRepositoryImpl$changePassword$1 = new com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl$changePassword$1(this, continuation);
        com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl$changePassword$1 changePasswordRepositoryImpl$changePassword$122 = changePasswordRepositoryImpl$changePassword$1;
        java.lang.Object obj2 = changePasswordRepositoryImpl$changePassword$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = changePasswordRepositoryImpl$changePassword$122.getInputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data p0) {
        com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword changePassword;
        if (p0 == null || (changePassword = p0.getChangePassword()) == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Unknown(new java.lang.IllegalStateException("No data in response")));
        }
        switch (com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[changePassword.getStatus().ordinal()]) {
            case 1:
                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
            case 2:
                return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.InvalidCurrentPassword.INSTANCE);
            case 3:
                return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.SamePassword.INSTANCE);
            case 4:
                return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.PasswordMismatch.INSTANCE);
            case 5:
            case 6:
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Unknown(null));
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        if (p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return new com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Api(new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError(httpError.getCode(), httpError.getBody()));
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return new com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError.INSTANCE);
            }
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Unknown(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause());
        }
        if (!(p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Api(new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError(new java.lang.IllegalStateException(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0).m11659getErrors1X0FAY()))).getMessage())));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.INVALID_CURRENT_PASSWORD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.CURRENT_NEW_PASSWORD_SAME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.NEW_CONFIRM_PASSWORD_DIFFERENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.UNKNOWN__.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
