package com.paypal.oslo.feature.balance.analytics;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\t\u001a\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0011\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"T", "", "apiName", "apiType", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "result", "", "trackCallResult", "(Ljava/lang/String;Ljava/lang/String;Larrow/core/Ior;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "trackAutoReloadResult", "(Ljava/lang/String;Ljava/lang/String;Larrow/core/Either;)V", "trackAutoReloadIorResult", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Pair;", "p2", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;)V", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;)Lkotlin/Pair;", "Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "Lkotlin/ranges/IntRange;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceApiTrackerKt {
    private static final kotlin.ranges.IntRange Camera2StreamConfigurationMap = new kotlin.ranges.IntRange(400, 499);

    private static final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
        com.paypal.oslo.feature.balance.LoggerKt.log.i("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", "success")), kotlin.collections.MapsKt.emptyMap());
    }

    private static final void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, kotlin.Pair<java.lang.String, java.lang.String> pair) {
        com.paypal.oslo.feature.balance.LoggerKt.log.w("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, pair.component1()), kotlin.TuplesKt.to("error_category", pair.component2())), kotlin.collections.MapsKt.emptyMap());
    }

    private static final kotlin.Pair<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.balance.domain.error.AutoReloadError autoReloadError) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE)) {
            return kotlin.TuplesKt.to(com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_NETWORK, "network");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Business.INSTANCE)) {
            return kotlin.TuplesKt.to("business_error", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.ERROR_CATEGORY_BUSINESS_LOGIC);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Nsf.INSTANCE)) {
            return kotlin.TuplesKt.to("nsf", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.ERROR_CATEGORY_BUSINESS_LOGIC);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.FiDeclined.INSTANCE)) {
            return kotlin.TuplesKt.to("fi_declined", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.ERROR_CATEGORY_BUSINESS_LOGIC);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE)) {
            return kotlin.TuplesKt.to("generic_auto_reload_error", "server");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.FundsError.INSTANCE)) {
            return kotlin.TuplesKt.to("funds_error", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.ERROR_CATEGORY_BUSINESS_LOGIC);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericError.INSTANCE)) {
            return kotlin.TuplesKt.to(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.GENERIC_ERROR, "server");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE)) {
            return kotlin.TuplesKt.to("generic_api_error", "server");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.RiskDeclined.INSTANCE)) {
            return kotlin.TuplesKt.to("risk_declined", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.ERROR_CATEGORY_BUSINESS_LOGIC);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <T> void trackCallResult(java.lang.String str, java.lang.String str2, arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends T> ior) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (!(ior instanceof arrow.core.Ior.Left)) {
            if (ior instanceof arrow.core.Ior.Right) {
                ((arrow.core.Ior.Right) ior).getValue();
                getHighResolutionOutputSizeshNQ4ISI(str, str2);
                return;
            } else {
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    both.getRightValue();
                    getHighResolutionOutputSizeshNQ4ISI(str, str2);
                    return;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
        java.lang.String str3 = "server";
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET, "network");
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                int code = httpError.getCode();
                kotlin.ranges.IntRange intRange = Camera2StreamConfigurationMap;
                int first = intRange.getFirst();
                int last = intRange.getLast();
                int code2 = httpError.getCode();
                if (first <= code2 && code2 <= last) {
                    str3 = "client";
                }
                pair = kotlin.TuplesKt.to(java.lang.String.valueOf(code), str3);
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR, "network");
            }
        } else {
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            pair = kotlin.TuplesKt.to("graphql_error", "server");
        }
        getHighSpeedVideoFpsRangesFor(str, str2, pair);
    }

    public static final <T> void trackAutoReloadResult(java.lang.String str, java.lang.String str2, arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, ? extends T> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        if (either instanceof arrow.core.Either.Right) {
            ((arrow.core.Either.Right) either).getValue();
            getHighResolutionOutputSizeshNQ4ISI(str, str2);
        } else {
            if (either instanceof arrow.core.Either.Left) {
                getHighSpeedVideoFpsRangesFor(str, str2, getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue()));
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final <T> void trackAutoReloadIorResult(java.lang.String str, java.lang.String str2, arrow.core.Ior<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, ? extends T> ior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (ior instanceof arrow.core.Ior.Left) {
            getHighSpeedVideoFpsRangesFor(str, str2, getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Ior.Left) ior).getValue()));
            return;
        }
        if (ior instanceof arrow.core.Ior.Right) {
            ((arrow.core.Ior.Right) ior).getValue();
            getHighResolutionOutputSizeshNQ4ISI(str, str2);
        } else {
            if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                both.getRightValue();
                getHighResolutionOutputSizeshNQ4ISI(str, str2);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
