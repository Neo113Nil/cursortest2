package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u0006*\u00020\u00060\u0006*\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\f\u001a#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeScanAction;", "getSupportedActions", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeWalletOperation;", "getSupportedWalletOperations", "", "encodeToBase64", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "", "isRiskDecline", "(Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;)Z", "isInternalServerError", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "", "parseError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Ior;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UtilsKt {
    public static final java.util.List<com.paypal.oslo.feature.qrc.graphql.type.QRCodeScanAction> getSupportedActions() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.qrc.graphql.type.QRCodeScanAction[]{com.paypal.oslo.feature.qrc.graphql.type.QRCodeScanAction.PAYMENT, com.paypal.oslo.feature.qrc.graphql.type.QRCodeScanAction.PAYMENT_PULL, com.paypal.oslo.feature.qrc.graphql.type.QRCodeScanAction.PAYMENT_PUSH, com.paypal.oslo.feature.qrc.graphql.type.QRCodeScanAction.PAYMENT_RESULT});
    }

    public static final java.util.List<com.paypal.oslo.feature.qrc.graphql.type.QRCodeWalletOperation> getSupportedWalletOperations() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.qrc.graphql.type.QRCodeWalletOperation[]{com.paypal.oslo.feature.qrc.graphql.type.QRCodeWalletOperation.PAY_NOW, com.paypal.oslo.feature.qrc.graphql.type.QRCodeWalletOperation.LOYALTY_SIGNUP, com.paypal.oslo.feature.qrc.graphql.type.QRCodeWalletOperation.MERCHANT_SIGNUP, com.paypal.oslo.feature.qrc.graphql.type.QRCodeWalletOperation.PAYMENT_PROVISIONING});
    }

    public static final java.lang.String encodeToBase64(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return android.util.Base64.encodeToString(bytes, 2);
    }

    public static final boolean isRiskDecline(com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQL, "");
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY());
        if ((m9567boximpl instanceof java.util.Collection) && m9567boximpl.isEmpty()) {
            return false;
        }
        java.util.Iterator<E> it = m9567boximpl.iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getExtensions();
            if (extensions != null && (obj = extensions.get("details")) != null) {
                java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
                if (list != null) {
                    java.util.List list2 = list;
                    if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                        java.util.Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map) it2.next()).get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE), "RISK_DECLINE")) {
                                return true;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static final boolean isInternalServerError(com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQL, "");
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY());
        if ((m9567boximpl instanceof java.util.Collection) && m9567boximpl.isEmpty()) {
            return false;
        }
        java.util.Iterator<E> it = m9567boximpl.iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getExtensions();
            if (kotlin.jvm.internal.Intrinsics.areEqual(extensions != null ? extensions.get("name") : null, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR)) {
                return true;
            }
        }
        return false;
    }

    public static final arrow.core.Ior parseError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.NoInternet.INSTANCE);
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError(httpError.getCode(), httpError.getMessage(), httpError.getBody()));
            }
            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        if (isRiskDecline(graphQL)) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.RiskDecline.INSTANCE);
        }
        if (isInternalServerError(graphQL)) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.InternalServerError.INSTANCE);
        }
        return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError(0, ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY())).getMessage(), null));
    }
}
