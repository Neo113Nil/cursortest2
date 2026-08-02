package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\b\u001a\u00020\u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "toBNPLErrors", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "toGraphQLExtensions", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BNPLErrorMapperKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError toBNPLErrors(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection(((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause());
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError(httpError.getCode(), httpError.getMessage(), httpError.getBody());
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()));
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        if (extensions == null) {
            extensions = kotlin.collections.MapsKt.emptyMap();
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions = toGraphQLExtensions(extensions);
        java.lang.String message = graphQLError.getMessage();
        java.util.List<java.lang.Object> path = graphQLError.getPath();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken = null;
        if (path != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : path) {
                java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail(message, arrayList, graphQLExtensions);
        java.lang.String name2 = graphQLExtensions.getName();
        switch (name2.hashCode()) {
            case -1680486749:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_ISSUER_DIGITIZATION_DATA_NOT_FOUND)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound(graphQLErrorDetail);
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown2;
                break;
            case -1535166265:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_DOWNPAYMENT_AUTHORIZATION_ERROR)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError(graphQLErrorDetail, graphQLExtensions.getFieldValue("reason"));
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown22 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown22;
                break;
            case -1523449763:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_FEATURE_NOT_AVAILABLE)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable(graphQLErrorDetail);
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown222;
                break;
            case -1265356739:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_DEVICE_TOKEN_PENDING_ACTIVE)) {
                    java.lang.String fieldValue = graphQLExtensions.getFieldValue("walletType");
                    java.lang.String fieldValue2 = graphQLExtensions.getFieldValue("deviceType");
                    if (fieldValue != null && fieldValue2 != null) {
                        provisionedToken = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken(graphQLExtensions.getFieldValue("referenceId"), com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.WalletProviderType.INSTANCE.from(fieldValue), com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.INSTANCE.from(fieldValue2));
                    }
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive(graphQLErrorDetail, provisionedToken);
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown2222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown2222;
                break;
            case -1212285620:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_INVALID_VIRTUAL_CARD)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard(graphQLErrorDetail);
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown22222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown22222;
                break;
            case -85557233:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_REPAYMENT_AUTHENTICATION_FAILURE)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure(graphQLErrorDetail);
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown222222;
                break;
            case 84497451:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_FETCH_VCC_FAILED)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed(graphQLErrorDetail, graphQLExtensions.getFieldValue("creditAccountId"));
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown2222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown2222222;
                break;
            case 220582451:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_INVALID_NATIONAL_IDENTIFICATION)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification(graphQLErrorDetail, graphQLExtensions.getFieldValue("reason"));
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown22222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown22222222;
                break;
            case 821693371:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_ADDRESS_NORMALIZATION_ERROR)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError(graphQLErrorDetail, new com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address(graphQLExtensions.getFieldValue("line1"), graphQLExtensions.getFieldValue("line2"), graphQLExtensions.getFieldValue(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity), graphQLExtensions.getFieldValue("state"), graphQLExtensions.getFieldValue(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE), graphQLExtensions.getFieldValue(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY)));
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown222222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown222222222;
                break;
            case 1201071735:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_INVALID_AGE)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge(graphQLErrorDetail, graphQLExtensions.getFieldValue("reason"));
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown2222222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown2222222222;
                break;
            case 1380369728:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_INVALID_DATE_OF_BIRTH)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth(graphQLErrorDetail, graphQLExtensions.getFieldValue("reason"));
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown22222222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown22222222222;
                break;
            case 1442968770:
                if (name2.equals(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ERROR_NAME_INVALID_PHONE_NUMBER)) {
                    unknown = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber(graphQLErrorDetail);
                    break;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown222222222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown222222222222;
                break;
            default:
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown2222222222222 = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(graphQLErrorDetail);
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "GraphQL error name: ".concat(java.lang.String.valueOf(graphQLExtensions.getName())));
                unknown = unknown2222222222222;
                break;
        }
        return unknown;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions toGraphQLExtensions(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("name");
        java.util.ArrayList arrayList = null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "UNKNOWN";
        }
        java.lang.Object obj2 = map.get("service");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map.get("details");
        java.util.List list = obj3 instanceof java.util.List ? (java.util.List) obj3 : null;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list) {
                java.util.Map map2 = obj4 instanceof java.util.Map ? (java.util.Map) obj4 : null;
                if (map2 != null) {
                    java.lang.Object obj5 = map2.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                    java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                    java.lang.Object obj6 = map2.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                    java.lang.String str4 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                    java.lang.Object obj7 = map2.get("field");
                    java.lang.String str5 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                    java.lang.Object obj8 = map2.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                    errorDetail = new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail(str3, str4, str5, obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null);
                } else {
                    errorDetail = null;
                }
                if (errorDetail != null) {
                    arrayList2.add(errorDetail);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions(str, str2, arrayList);
    }
}
