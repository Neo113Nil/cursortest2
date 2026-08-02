package com.paypal.oslo.feature.identity.unifiedalert.data.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000e\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/model/AuthenticationAlertsResponse;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "toDomain", "(Lcom/paypal/oslo/feature/identity/unifiedalert/data/model/AuthenticationAlertsResponse;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "", "", "acceptableClaims", "toUnifiedAlert", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertsError;", "toUnifiedAlertsError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertsError;", "", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertsError;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnifiedAlertsDataMapperKt {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_NAME, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DEVICE_LOCATION, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.ALERT_TIMESTAMP, "merchant_name", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.PURCHASE_AMOUNT, "crypto", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.CASH, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "user_profile", "message", "home", "phone_2", "email"});

    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert toDomain(com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse authenticationAlertsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationAlertsResponse, "");
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) authenticationAlertsResponse.getAlerts());
        if (str == null) {
            return null;
        }
        return toUnifiedAlert(str, authenticationAlertsResponse.getAcceptableClaims());
    }

    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError toUnifiedAlertsError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError alertError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                int code = httpError.getCode();
                java.lang.String message = httpError.getMessage();
                if (message == null) {
                    message = "Error";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
                sb.append(code);
                sb.append(": ");
                sb.append(message);
                alertError = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError(sb.toString());
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                alertError = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError("Network unavailable");
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.String message2 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
                if (message2 == null) {
                    message2 = "Unknown";
                }
                alertError = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError("Network error: ".concat(java.lang.String.valueOf(message2)));
            }
            return alertError;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError("Server error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage())));
    }

    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError toUnifiedAlertsError(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError(message);
    }

    public static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert toUnifiedAlert(java.lang.String str, java.util.List<java.lang.String> list) {
        java.lang.String str2;
        java.lang.Long longOrNull;
        java.lang.Long longOrNull2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.lang.String str3 : kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new char[]{kotlin.text.Typography.amp}, false, 0, 6, (java.lang.Object) null)) {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, '=', 0, false, 6, (java.lang.Object) null);
            if (indexOf$default >= 0) {
                java.lang.String substring = str3.substring(0, indexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                java.lang.String removePrefix = kotlin.text.StringsKt.removePrefix(substring, (java.lang.CharSequence) "data.");
                java.lang.String substring2 = str3.substring(indexOf$default + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                createMapBuilder.put(removePrefix, substring2);
            }
        }
        java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
        java.lang.String str4 = (java.lang.String) build.get("DI");
        if (str4 == null || (str2 = (java.lang.String) build.get(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY)) == null) {
            return null;
        }
        java.lang.String str5 = (java.lang.String) build.get("ID");
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = (java.lang.String) build.get("TI");
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = (java.lang.String) build.get("ES");
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.String str11 = (java.lang.String) build.get("title");
        java.lang.String str12 = (java.lang.String) build.get("EX");
        long longValue = (str12 == null || (longOrNull2 = kotlin.text.StringsKt.toLongOrNull(str12)) == null) ? 0L : longOrNull2.longValue();
        java.lang.String str13 = (java.lang.String) build.get("TR");
        long longValue2 = (str13 == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str13)) == null) ? 0L : longOrNull.longValue();
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(build.get("unified_alerts"), "true");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : build.entrySet()) {
            if (getHighSpeedVideoFpsRanges.contains((java.lang.String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert(str6, str8, str4, str10, str11, str2, linkedHashMap, longValue, longValue2, list, areEqual);
    }
}
