package com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\n\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSourceImpl;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSource;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/mapper/PhoneConfirmationErrorMapper;", "errorMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/mapper/PhoneConfirmationErrorMapper;)V", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationOutput;", "requestConfirmationCode", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationOutput;", "confirmCode", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/OTPVerificationInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/mapper/PhoneConfirmationErrorMapper;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhoneConfirmationDataSourceImpl implements com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource {

    @java.lang.Deprecated
    public static final java.lang.String FLOW_SOURCE_CONFIRM = "phone_confirmation_confirm";

    @java.lang.Deprecated
    public static final java.lang.String FLOW_SOURCE_REQUEST = "phone_confirmation_request";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl.Companion Companion = new com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PhoneConfirmationDataSourceImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper phoneConfirmationErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationErrorMapper, "");
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighSpeedVideoSizes = phoneConfirmationErrorMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145 A[Catch: all -> 0x015e, RaiseCancellationException -> 0x0162, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0162, all -> 0x015e, blocks: (B:13:0x00dd, B:18:0x00e7, B:19:0x0105, B:21:0x010d, B:23:0x0115, B:26:0x0121, B:30:0x012f, B:31:0x013e, B:35:0x00f4, B:36:0x013f, B:37:0x0144, B:38:0x0145, B:49:0x00a5), top: B:48:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestConfirmationCode(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationInput phoneConfirmationInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput>> continuation) {
        com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$requestConfirmationCode$1 phoneConfirmationDataSourceImpl$requestConfirmationCode$1;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str;
        com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$requestConfirmationCode$1) {
                phoneConfirmationDataSourceImpl$requestConfirmationCode$1 = (com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$requestConfirmationCode$1) continuation;
                if ((phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    defaultRaise = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputFormats;
                    if (defaultRaise != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput requestPhoneConfirmationCodeInput = new com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput(new com.paypal.oslo.api.graphql.schema.type.PhoneInput(phoneConfirmationInput.getCountryCode(), phoneConfirmationInput.getPhoneNumber(), null, 4, null), phoneConfirmationInput.getDeviceId());
                        com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation requestPhoneConfirmationCodeMutation = new com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation(requestPhoneConfirmationCodeInput);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.apollographql.apollo.ApolloClient apolloClient2 = apolloClient;
                        com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation requestPhoneConfirmationCodeMutation2 = requestPhoneConfirmationCodeMutation;
                        str = "";
                        requestPhoneConfirmationCode = null;
                        try {
                            com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(FLOW_SOURCE_REQUEST, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), false ? 1 : 0, 2, false ? 1 : 0);
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneConfirmationInput);
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoSizesFor = defaultRaise;
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputMinFrameDuration = defaultRaise2;
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestPhoneConfirmationCodeInput);
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestPhoneConfirmationCodeMutation);
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoSizes = 0;
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoFpsRanges = 0;
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoFpsRangesFor = 0;
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.Camera2StreamConfigurationMap = 0;
                            phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputFormats = 1;
                            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient2, requestPhoneConfirmationCodeMutation2, callConfig, phoneConfirmationDataSourceImpl$requestConfirmationCode$1);
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
                        int i = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.Camera2StreamConfigurationMap;
                        int i2 = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoFpsRanges;
                        int i4 = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoSizes;
                        raise = (arrow.core.raise.Raise) phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputMinFrameDuration;
                        arrow.core.raise.DefaultRaise defaultRaise3 = (arrow.core.raise.DefaultRaise) phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = "";
                        requestPhoneConfirmationCode = null;
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
                    com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data) graphQLData.getData();
                    com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode2 = data != null ? data.getRequestPhoneConfirmationCode() : requestPhoneConfirmationCode;
                    if (requestPhoneConfirmationCode2 != null) {
                        java.lang.String maskedPhoneNumber = requestPhoneConfirmationCode2.getMaskedPhoneNumber();
                        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput phoneConfirmationOutput = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationOutput(maskedPhoneNumber == null ? str : maskedPhoneNumber);
                        defaultRaise.complete();
                        return new arrow.core.Either.Right(phoneConfirmationOutput);
                    }
                    raise.raise(new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown("No data returned from requestPhoneConfirmationCode mutation"));
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
        phoneConfirmationDataSourceImpl$requestConfirmationCode$1 = new com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$requestConfirmationCode$1(this, continuation);
        java.lang.Object obj2 = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        defaultRaise = phoneConfirmationDataSourceImpl$requestConfirmationCode$1.getOutputFormats;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5 A[Catch: all -> 0x01d6, RaiseCancellationException -> 0x01df, TryCatch #4 {RaiseCancellationException -> 0x01df, all -> 0x01d6, blocks: (B:11:0x0049, B:61:0x019e, B:62:0x01ac, B:64:0x01ad, B:65:0x01b4, B:66:0x01b5, B:67:0x01cd, B:71:0x005f), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [arrow.core.raise.DefaultRaise, java.lang.Object] */
    @Override // com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object confirmCode(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput oTPVerificationInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError, com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput>> continuation) {
        com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$confirmCode$1 phoneConfirmationDataSourceImpl$confirmCode$1;
        arrow.core.raise.DefaultRaise defaultRaise;
        boolean z;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$confirmCode$1) {
                phoneConfirmationDataSourceImpl$confirmCode$1 = (com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$confirmCode$1) continuation;
                if ((phoneConfirmationDataSourceImpl$confirmCode$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                    phoneConfirmationDataSourceImpl$confirmCode$1.getInputFormats -= 2147483648;
                    java.lang.Object obj = phoneConfirmationDataSourceImpl$confirmCode$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    defaultRaise = phoneConfirmationDataSourceImpl$confirmCode$1.getInputFormats;
                    int i = 2;
                    boolean z2 = false;
                    boolean z3 = false;
                    if (defaultRaise != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput confirmPhoneConfirmationCodeInput = new com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput(new com.paypal.oslo.api.graphql.schema.type.PhoneInput(oTPVerificationInput.getCountryCode(), oTPVerificationInput.getPhoneNumber(), null, 4, null), oTPVerificationInput.getDeviceId(), oTPVerificationInput.getConfirmationCode());
                        com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation confirmPhoneConfirmationCodeMutation = new com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation(confirmPhoneConfirmationCodeInput);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.apollographql.apollo.ApolloClient apolloClient2 = apolloClient;
                        com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation confirmPhoneConfirmationCodeMutation2 = confirmPhoneConfirmationCodeMutation;
                        try {
                            com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(FLOW_SOURCE_CONFIRM, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), z3 ? 1 : 0, i, z2 ? 1 : 0);
                            phoneConfirmationDataSourceImpl$confirmCode$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(oTPVerificationInput);
                            phoneConfirmationDataSourceImpl$confirmCode$1.getOutputFormats = defaultRaise;
                            phoneConfirmationDataSourceImpl$confirmCode$1.getHighSpeedVideoSizesFor = raise2;
                            phoneConfirmationDataSourceImpl$confirmCode$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmPhoneConfirmationCodeInput);
                            phoneConfirmationDataSourceImpl$confirmCode$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmPhoneConfirmationCodeMutation);
                            z = false;
                            phoneConfirmationDataSourceImpl$confirmCode$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            phoneConfirmationDataSourceImpl$confirmCode$1.Camera2StreamConfigurationMap = 0;
                            phoneConfirmationDataSourceImpl$confirmCode$1.getHighSpeedVideoFpsRanges = 0;
                            phoneConfirmationDataSourceImpl$confirmCode$1.getHighSpeedVideoSizes = 0;
                            phoneConfirmationDataSourceImpl$confirmCode$1.getInputFormats = 1;
                            java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient2, confirmPhoneConfirmationCodeMutation2, callConfig, phoneConfirmationDataSourceImpl$confirmCode$1);
                            if (execute == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            raise = raise2;
                            obj = execute;
                            defaultRaise2 = defaultRaise;
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
                        int i2 = phoneConfirmationDataSourceImpl$confirmCode$1.getHighSpeedVideoSizes;
                        int i3 = phoneConfirmationDataSourceImpl$confirmCode$1.getHighSpeedVideoFpsRanges;
                        int i4 = phoneConfirmationDataSourceImpl$confirmCode$1.Camera2StreamConfigurationMap;
                        int i5 = phoneConfirmationDataSourceImpl$confirmCode$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) phoneConfirmationDataSourceImpl$confirmCode$1.getHighSpeedVideoSizesFor;
                        arrow.core.raise.DefaultRaise defaultRaise3 = (arrow.core.raise.DefaultRaise) phoneConfirmationDataSourceImpl$confirmCode$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        z = false;
                        defaultRaise2 = defaultRaise3;
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighSpeedVideoSizes.mapCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                        com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data data = (com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data) graphQLData.getData();
                        if ((data != null ? data.getConfirmPhoneConfirmationCode() : null) == null) {
                            raise.raise(this.getHighSpeedVideoSizes.mapCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data data2 = (com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data) graphQLData.getData();
                    com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode = data2 != null ? data2.getConfirmPhoneConfirmationCode() : null;
                    if (confirmPhoneConfirmationCode != null) {
                        boolean z4 = confirmPhoneConfirmationCode.getConfirmationStatus() == com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.CONFIRMED ? true : z;
                        com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus confirmationStatus = confirmPhoneConfirmationCode.getConfirmationStatus();
                        int i6 = confirmationStatus == null ? -1 : com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl.WhenMappings.$EnumSwitchMapping$0[confirmationStatus.ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1) {
                                raise.raise(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            if (i6 == 2) {
                                raise.raise(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            if (i6 == 3) {
                                com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput oTPVerificationOutput = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationOutput(z4);
                                defaultRaise2.complete();
                                return new arrow.core.Either.Right(oTPVerificationOutput);
                            }
                            if (i6 != 4 && i6 != 5) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        }
                        raise.raise(new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown("Unknown verification status received"));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    raise.raise(new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown("No data returned from confirmPhoneConfirmationCode mutation"));
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
        phoneConfirmationDataSourceImpl$confirmCode$1 = new com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$confirmCode$1(this, continuation);
        java.lang.Object obj2 = phoneConfirmationDataSourceImpl$confirmCode$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        defaultRaise = phoneConfirmationDataSourceImpl$confirmCode$1.getInputFormats;
        int i7 = 2;
        boolean z22 = false;
        boolean z32 = false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/data/datasource/PhoneConfirmationDataSourceImpl$Companion;", "", "<init>", "()V", "", "FLOW_SOURCE_REQUEST", "Ljava/lang/String;", "FLOW_SOURCE_CONFIRM"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.UNCONFIRMED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus.CONFIRMED.ordinal()] = 3;
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
