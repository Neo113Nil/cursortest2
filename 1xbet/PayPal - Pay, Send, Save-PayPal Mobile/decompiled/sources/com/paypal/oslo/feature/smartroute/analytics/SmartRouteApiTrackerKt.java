package com.paypal.oslo.feature.smartroute.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a_\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b*\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b*\u00020\u0010H\u0000¢\u0006\u0004\b\u000e\u0010\u0011"}, d2 = {"E", "T", "", "apiName", "apiType", "Larrow/core/Either;", "result", "Lkotlin/Function1;", "Lkotlin/Pair;", "toErrorAttributes", "", "trackApiResult", "(Ljava/lang/String;Ljava/lang/String;Larrow/core/Either;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "toTrackingAttributes", "(Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;)Lkotlin/Pair;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadError;", "(Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadError;)Lkotlin/Pair;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SmartRouteApiTrackerKt {
    public static final kotlin.Pair<java.lang.String, java.lang.String> toTrackingAttributes(com.paypal.oslo.feature.smartroute.domain.error.DistributionError distributionError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionError, "");
        if (distributionError instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError) {
            return kotlin.TuplesKt.to("load_error", "network");
        }
        if (distributionError instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError) {
            return kotlin.TuplesKt.to("save_error", "network");
        }
        if (distributionError instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError) {
            return kotlin.TuplesKt.to("validation_error", "client");
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> toTrackingAttributes(com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadError, "");
        if (autoReloadError instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.FetchError) {
            return kotlin.TuplesKt.to("fetch_error", "network");
        }
        if (autoReloadError instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.SetupError) {
            return kotlin.TuplesKt.to("setup_error", "network");
        }
        if (autoReloadError instanceof com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.DeactivateError) {
            return kotlin.TuplesKt.to("deactivate_error", "network");
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final <E, T> void trackApiResult(java.lang.String str, java.lang.String str2, arrow.core.Either<? extends E, ? extends T> either, kotlin.jvm.functions.Function1<? super E, kotlin.Pair<java.lang.String, java.lang.String>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (either instanceof arrow.core.Either.Right) {
            ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.smartroute.LoggerKt.log.i("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", "success")), kotlin.collections.MapsKt.emptyMap());
        } else {
            if (either instanceof arrow.core.Either.Left) {
                kotlin.Pair<java.lang.String, java.lang.String> invoke = function1.invoke((java.lang.Object) ((arrow.core.Either.Left) either).getValue());
                com.paypal.oslo.feature.smartroute.LoggerKt.log.w("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, invoke.component1()), kotlin.TuplesKt.to("error_category", invoke.component2())), kotlin.collections.MapsKt.emptyMap());
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
