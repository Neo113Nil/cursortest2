package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/EConsentRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/EConsentRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OPERATION_NAME, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EConsentRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public EConsentRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
        this.getHighSpeedVideoFpsRanges = callErrorMapper;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository
    public final java.lang.Object approveElectronicConsent(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2(this, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021f A[Catch: all -> 0x004e, RaiseCancellationException -> 0x0051, TryCatch #3 {RaiseCancellationException -> 0x0051, all -> 0x004e, blocks: (B:11:0x0049, B:12:0x00c2, B:17:0x00cc, B:18:0x00ea, B:20:0x00f2, B:22:0x00f8, B:24:0x00fe, B:26:0x010a, B:28:0x0110, B:29:0x01ef, B:32:0x0127, B:33:0x0152, B:35:0x015a, B:37:0x0160, B:38:0x0176, B:41:0x0184, B:44:0x01ba, B:46:0x01cf, B:47:0x0200, B:48:0x0218, B:51:0x00d9, B:52:0x0219, B:53:0x021e, B:54:0x021f, B:55:0x0237), top: B:10:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveEConsent$1 eConsentRepositoryImpl$approveEConsent$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.External external;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.ApproveElectronicConsent approveElectronicConsent;
        arrow.core.Either left;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveEConsent$1) {
            eConsentRepositoryImpl$approveEConsent$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveEConsent$1) continuation;
            if ((eConsentRepositoryImpl$approveEConsent$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                eConsentRepositoryImpl$approveEConsent$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = eConsentRepositoryImpl$approveEConsent$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eConsentRepositoryImpl$approveEConsent$1.getInputSizeshNQ4ISI;
                int i2 = 2;
                java.util.Map map = null;
                java.lang.Object[] objArr = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        if (!kotlin.text.StringsKt.isBlank(str)) {
                            com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation approveElectronicConsentMutation = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation(str);
                            com.apollographql.apollo.ApolloCall addNativeCheckoutHeaders = com.paypal.oslo.feature.inappcheckout.data.utils.ApolloClientExtensionsKt.addNativeCheckoutHeaders(this.getHighSpeedVideoSizes.mutation(approveElectronicConsentMutation));
                            com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("approve_electronic_consent", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), map, i2, objArr == true ? 1 : 0);
                            eConsentRepositoryImpl$approveEConsent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            eConsentRepositoryImpl$approveEConsent$1.getInputFormats = defaultRaise;
                            eConsentRepositoryImpl$approveEConsent$1.getOutputFormats = defaultRaise3;
                            eConsentRepositoryImpl$approveEConsent$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(approveElectronicConsentMutation);
                            eConsentRepositoryImpl$approveEConsent$1.getHighSpeedVideoFpsRanges = 0;
                            eConsentRepositoryImpl$approveEConsent$1.Camera2StreamConfigurationMap = 0;
                            eConsentRepositoryImpl$approveEConsent$1.getHighSpeedVideoFpsRangesFor = 0;
                            eConsentRepositoryImpl$approveEConsent$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            eConsentRepositoryImpl$approveEConsent$1.getInputSizeshNQ4ISI = 1;
                            java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addNativeCheckoutHeaders, callConfig, eConsentRepositoryImpl$approveEConsent$1);
                            if (execute == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise2 = defaultRaise;
                            obj = execute;
                            raise = defaultRaise3;
                        } else {
                            defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_TOKEN", "Token cannot be blank", false, null, null, 16, null));
                            throw new kotlin.KotlinNothingValueException();
                        }
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
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = eConsentRepositoryImpl$approveEConsent$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = eConsentRepositoryImpl$approveEConsent$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = eConsentRepositoryImpl$approveEConsent$1.Camera2StreamConfigurationMap;
                    int i6 = eConsentRepositoryImpl$approveEConsent$1.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) eConsentRepositoryImpl$approveEConsent$1.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) eConsentRepositoryImpl$approveEConsent$1.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    raise.raise(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue(), "approving electronic consent"));
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
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data data = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.Data) graphQLData.getData();
                if (data == null || (external = data.getExternal()) == null || (approveElectronicConsent = external.getApproveElectronicConsent()) == null) {
                    raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_DATA", "No data in approve electronic consent response", false, null, null, 16, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String str3 = approveElectronicConsent.get__typename();
                if (kotlin.jvm.internal.Intrinsics.areEqual(str3, "externalElectronicConsentContingencyResolutionSuccessResponse")) {
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionSuccessResponse onExternalElectronicConsentContingencyResolutionSuccessResponse = approveElectronicConsent.getOnExternalElectronicConsentContingencyResolutionSuccessResponse();
                    if (onExternalElectronicConsentContingencyResolutionSuccessResponse == null) {
                        left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_SUCCESS_RESPONSE", "Success response is null", false, null, null, 16, null));
                    } else {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Successfully approved electronic consent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", java.lang.Boolean.valueOf(onExternalElectronicConsentContingencyResolutionSuccessResponse.getStatus()))), null, 4, null);
                        left = arrow.core.EitherKt.right(new com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse(onExternalElectronicConsentContingencyResolutionSuccessResponse.getStatus(), null));
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(str3, "externalElectronicConsentContingencyResolutionErrorResponse")) {
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OnExternalElectronicConsentContingencyResolutionErrorResponse onExternalElectronicConsentContingencyResolutionErrorResponse = approveElectronicConsent.getOnExternalElectronicConsentContingencyResolutionErrorResponse();
                    if (onExternalElectronicConsentContingencyResolutionErrorResponse == null) {
                        left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_ERROR_RESPONSE", "Error response is null", false, null, null, 16, null));
                    } else {
                        java.util.List<java.lang.String> errors = onExternalElectronicConsentContingencyResolutionErrorResponse.getErrors();
                        java.lang.String str4 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) errors);
                        if (str4 == null) {
                            str4 = "UNKNOWN_ERROR";
                        }
                        java.lang.String str5 = str4;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Electronic consent approval returned error response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_name", str5), kotlin.TuplesKt.to("error_count", java.lang.Integer.valueOf(errors.size()))), null, 4, null);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str5, "UNKNOWN")) {
                            str2 = "Unable to approve electronic consent. The token may be invalid or expired. Please restart the checkout flow.";
                        } else {
                            str2 = "Failed to approve electronic consent";
                        }
                        left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str5, str2, kotlin.jvm.internal.Intrinsics.areEqual(str5, "UNKNOWN"), null, null, 16, null));
                    }
                } else {
                    left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_RESPONSE_TYPE", "Unknown response type: ".concat(java.lang.String.valueOf(approveElectronicConsent.get__typename())), false, null, null, 16, null));
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse eConsentXOResponse = (com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse) raise.bind(left);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(eConsentXOResponse);
            }
        }
        eConsentRepositoryImpl$approveEConsent$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveEConsent$1(this, continuation);
        java.lang.Object obj2 = eConsentRepositoryImpl$approveEConsent$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eConsentRepositoryImpl$approveEConsent$1.getInputSizeshNQ4ISI;
        int i22 = 2;
        java.util.Map map2 = null;
        java.lang.Object[] objArr2 = 0;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
