package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/network/http/error/NetworkError;", "", "message", "", "logErrors", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkErrorExtensionsKt {
    public static final void logErrors(com.paypal.oslo.core.network.http.error.NetworkError networkError, java.lang.String str) {
        java.util.Map mapOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        boolean z = networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError;
        if (z) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "http_error"), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, java.lang.Integer.valueOf(httpError.getCode())), kotlin.TuplesKt.to("error_message", httpError.getMessage()), kotlin.TuplesKt.to("correlation_id", httpError.getCorrelationId()));
        } else if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET), kotlin.TuplesKt.to("exception_message", ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause().getMessage()));
        } else {
            if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR), kotlin.TuplesKt.to("exception_message", ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause().getMessage()));
        }
        java.util.Map map = mapOf;
        if (z || (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.telemetry.LoggerKt.log, str, map, null, null, 12, null);
        } else {
            if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.telemetry.LoggerKt.log, str, map, null, 4, null);
        }
    }
}
