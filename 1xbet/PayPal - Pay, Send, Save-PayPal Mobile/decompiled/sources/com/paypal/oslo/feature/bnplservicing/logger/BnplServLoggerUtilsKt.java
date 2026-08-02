package com.paypal.oslo.feature.bnplservicing.logger;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\r\u001a#\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/android/logger/Logger;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "", "operationName", "", "logBnplServDownstreamError", "(Lcom/paypal/android/logger/Logger;Lcom/paypal/oslo/core/network/graphql/error/CallError;Ljava/lang/String;)V", "p0", "p1", "", "p2", "Camera2StreamConfigurationMap", "(Lcom/paypal/android/logger/Logger;Ljava/lang/String;Ljava/lang/String;Z)V", "name", "reducerEvent", "isUnexpected", "logBnplServReducerEvent", "Lcom/paypal/oslo/feature/bnplservicing/logger/ScreenEventAttributes;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "logBnplServScreenEvent", "(Lcom/paypal/android/logger/Logger;Lcom/paypal/oslo/feature/bnplservicing/logger/ScreenEventAttributes;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "context", "logBnplServException", "(Lcom/paypal/android/logger/Logger;Ljava/lang/Exception;Ljava/lang/String;)V", "variable", "logUnknownMapping", "(Lcom/paypal/android/logger/Logger;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServLoggerUtilsKt {
    public static final void logBnplServDownstreamError(com.paypal.android.logger.Logger logger, com.paypal.oslo.core.network.graphql.error.CallError callError, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL ? (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError : null;
        java.lang.String str2 = "Unknown";
        if (graphQL == null) {
            if ((callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network ? (com.paypal.oslo.core.network.graphql.error.CallError.Network) callError : null) != null) {
                com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                    if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                        str2 = "HttpError";
                    } else {
                        if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        str2 = "NoConnection";
                    }
                }
                Camera2StreamConfigurationMap(logger, str2, str, true);
                return;
            }
            return;
        }
        java.util.Iterator<E> it = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()).iterator();
        while (it.hasNext()) {
            java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getExtensions();
            java.lang.Object obj = extensions != null ? extensions.get("name") : null;
            java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str3 == null) {
                str3 = "Unknown";
            }
            Camera2StreamConfigurationMap(logger, str3, str, false);
        }
    }

    private static final void Camera2StreamConfigurationMap(com.paypal.android.logger.Logger logger, java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String concat = "BnplServ | Network | Downstream | ".concat(java.lang.String.valueOf(str));
        java.lang.String concat2 = "BnplServ | Network | ".concat(java.lang.String.valueOf(str));
        if (z) {
            com.paypal.android.logger.Logger.e$default(logger, concat2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downstream_error_name", str), kotlin.TuplesKt.to("operation_name", str2)), null, null, 12, null);
        } else {
            com.paypal.android.logger.Logger.w$default(logger, concat, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downstream_error_name", str), kotlin.TuplesKt.to("operation_name", str2)), null, 4, null);
        }
    }

    public static /* synthetic */ void logBnplServReducerEvent$default(com.paypal.android.logger.Logger logger, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        logBnplServReducerEvent(logger, str, str2, z);
    }

    public static final void logBnplServReducerEvent(com.paypal.android.logger.Logger logger, java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServ | ");
            sb.append(str);
            sb.append(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR);
            sb.append(str2);
            com.paypal.android.logger.Logger.e$default(logger, sb.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reducer_event_name", str2)), null, null, 12, null);
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("BnplServ | ");
        sb2.append(str);
        sb2.append(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR);
        sb2.append(str2);
        com.paypal.android.logger.Logger.i$default(logger, sb2.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reducer_event_name", str2)), null, 4, null);
    }

    public static final void logBnplServScreenEvent(com.paypal.android.logger.Logger logger, com.paypal.oslo.feature.bnplservicing.logger.ScreenEventAttributes screenEventAttributes, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenEventAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (screenEventAttributes.getCreditProductIdentifier().length() > 0) {
            linkedHashMap.put("credit_product_identifier", screenEventAttributes.getCreditProductIdentifier());
        }
        if (screenEventAttributes.getPaylaterSource().length() > 0) {
            linkedHashMap.put("paylater_source", screenEventAttributes.getPaylaterSource());
        }
        com.paypal.android.logger.Logger.i$default(logger, "BnplServ | Screen | ".concat(java.lang.String.valueOf(str)), linkedHashMap, null, 4, null);
    }

    public static /* synthetic */ void logBnplServException$default(com.paypal.android.logger.Logger logger, java.lang.Exception exc, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        logBnplServException(logger, exc, str);
    }

    public static final void logBnplServException(com.paypal.android.logger.Logger logger, java.lang.Exception exc, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(exc.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "Unknown";
        }
        java.lang.String message = exc.getMessage();
        java.lang.String str2 = message != null ? message : "";
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("exception_type", simpleName));
        if (!kotlin.text.StringsKt.isBlank(str2)) {
            mutableMapOf.put("exception_message", str2);
        }
        if (!kotlin.text.StringsKt.isBlank(str)) {
            mutableMapOf.put("context", str);
        }
        com.paypal.android.logger.Logger.e$default(logger, "BnplServ | Exception | ".concat(java.lang.String.valueOf(simpleName)), mutableMapOf, null, exc, 4, null);
    }

    public static final void logUnknownMapping(com.paypal.android.logger.Logger logger, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.Logger.e$default(logger, "BnplServ | Variable | Unknown", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("variable", str)), null, null, 12, null);
    }
}
