package com.paypal.oslo.feature.bankingbundle.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/data/repository/BankingBundleRepositoryImpl;", "Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "getBalanceBundleEligibility", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Ljava/lang/String;)Larrow/core/Either;", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankingBundleRepositoryImpl implements com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public BankingBundleRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0132, code lost:
    
        if (r3 < 600) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBalanceBundleEligibility(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError, com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility>> continuation) {
        com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl$getBalanceBundleEligibility$1 bankingBundleRepositoryImpl$getBalanceBundleEligibility$1;
        int i;
        java.lang.String str2;
        arrow.core.Ior ior;
        java.lang.String str3;
        if (continuation instanceof com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl$getBalanceBundleEligibility$1) {
            bankingBundleRepositoryImpl$getBalanceBundleEligibility$1 = (com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl$getBalanceBundleEligibility$1) continuation;
            if ((bankingBundleRepositoryImpl$getBalanceBundleEligibility$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                bankingBundleRepositoryImpl$getBalanceBundleEligibility$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl$getBalanceBundleEligibility$1 bankingBundleRepositoryImpl$getBalanceBundleEligibility$12 = bankingBundleRepositoryImpl$getBalanceBundleEligibility$1;
                java.lang.Object obj = bankingBundleRepositoryImpl$getBalanceBundleEligibility$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bankingBundleRepositoryImpl$getBalanceBundleEligibility$12.Camera2StreamConfigurationMap;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery getBalanceBundleEligibilityQuery = new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery();
                    bankingBundleRepositoryImpl$getBalanceBundleEligibility$12.getHighSpeedVideoFpsRanges = str;
                    bankingBundleRepositoryImpl$getBalanceBundleEligibility$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBalanceBundleEligibilityQuery);
                    bankingBundleRepositoryImpl$getBalanceBundleEligibility$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, getBalanceBundleEligibilityQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, bankingBundleRepositoryImpl$getBalanceBundleEligibility$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) bankingBundleRepositoryImpl$getBalanceBundleEligibility$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (ior instanceof arrow.core.Ior.Left) {
                    if (!(ior instanceof arrow.core.Ior.Right)) {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "API call partially succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.GET_BALANCES_AND_BUNDLE_ELIGIBILITY), kotlin.TuplesKt.to("api_type", "query"), kotlin.TuplesKt.to("api_result", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_PARTIAL_SUCCESS), kotlin.TuplesKt.to("api_error_code", Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) leftValue).getCode()), kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, str2)), null, 4, null);
                        return getHighSpeedVideoFpsRanges(graphQLData, str2);
                    }
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "API call succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.GET_BALANCES_AND_BUNDLE_ELIGIBILITY), kotlin.TuplesKt.to("api_type", "query"), kotlin.TuplesKt.to("api_result", "success")), null, 4, null);
                    return getHighSpeedVideoFpsRanges(graphQLData2, str2);
                }
                com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                boolean z2 = callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network;
                if (z2) {
                    com.paypal.oslo.core.network.graphql.error.CallError.Network network = (com.paypal.oslo.core.network.graphql.error.CallError.Network) callError;
                    com.paypal.oslo.core.network.http.error.NetworkError error = network.getError();
                    if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet)) {
                        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                            com.paypal.oslo.core.network.http.error.NetworkError error2 = network.getError();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(error2, "");
                            int code = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error2).getCode();
                            if (400 <= code && code < 500) {
                                str3 = "client";
                            } else if (500 <= code && code < 600) {
                                str3 = "server";
                            }
                        } else if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    str3 = "network";
                } else {
                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str3 = com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.ERROR_CATEGORY_BUSINESS_LOGIC;
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "API call failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.GET_BALANCES_AND_BUNDLE_ELIGIBILITY), kotlin.TuplesKt.to("api_type", "query"), kotlin.TuplesKt.to("api_result", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE), kotlin.TuplesKt.to("api_error_code", Camera2StreamConfigurationMap(callError).getCode()), kotlin.TuplesKt.to("api_error_category", str3), kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, str2)), null, 4, null);
                com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(callError);
                if (z2) {
                    com.paypal.oslo.core.network.http.error.NetworkError error3 = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                    if (error3 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                        int code2 = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error3).getCode();
                        if (code2 != 429) {
                            if (500 <= code2) {
                            }
                        }
                    }
                    z = false;
                } else {
                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.NonEmptyList<com.paypal.oslo.core.network.graphql.error.GraphQLError> m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY());
                    if (!(m9567boximpl instanceof java.util.Collection) || !m9567boximpl.isEmpty()) {
                        for (com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError : m9567boximpl) {
                            java.lang.String errorCode = graphQLError.getErrorCode();
                            if (errorCode == null) {
                                java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
                                errorCode = null;
                                java.lang.Object obj2 = extensions != null ? extensions.get("name") : null;
                                if (obj2 instanceof java.lang.String) {
                                    errorCode = obj2;
                                }
                            }
                            if (kotlin.collections.CollectionsKt.contains(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SERVICE_UNAVAILABLE}), errorCode)) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network(callError, Camera2StreamConfigurationMap, z));
            }
        }
        bankingBundleRepositoryImpl$getBalanceBundleEligibility$1 = new com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl$getBalanceBundleEligibility$1(this, continuation);
        com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl$getBalanceBundleEligibility$1 bankingBundleRepositoryImpl$getBalanceBundleEligibility$122 = bankingBundleRepositoryImpl$getBalanceBundleEligibility$1;
        java.lang.Object obj3 = bankingBundleRepositoryImpl$getBalanceBundleEligibility$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bankingBundleRepositoryImpl$getBalanceBundleEligibility$122.Camera2StreamConfigurationMap;
        boolean z3 = true;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj3;
        if (ior instanceof arrow.core.Ior.Left) {
        }
    }

    private static com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return new com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET, com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR);
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return new com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail("http_".concat(java.lang.String.valueOf(httpError.getCode())), "HTTP error ".concat(java.lang.String.valueOf(httpError.getCode())));
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                return new com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail("unknown", com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY());
        java.lang.String errorCode = graphQLError.getErrorCode();
        if (errorCode == null) {
            java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
            errorCode = null;
            java.lang.Object obj = extensions != null ? extensions.get("name") : null;
            if (obj instanceof java.lang.String) {
                errorCode = obj;
            }
        }
        if (errorCode == null) {
            errorCode = "graphql_error";
        }
        return new com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail(errorCode, "GraphQL error");
    }

    private static arrow.core.Either<com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError, com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility> getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data> p0, java.lang.String p1) {
        com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data data = p0.getData();
        if ((data != null ? data.getBalanceBundleEligibility() : null) != null) {
            return arrow.core.EitherKt.right(com.paypal.oslo.feature.bankingbundle.data.mapper.BankingBundleEligibilityMapperKt.toDomain(data));
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "GetBalanceBundleEligibility returned null data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, p1)), null, 4, null);
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.NullResponse.INSTANCE);
    }
}
