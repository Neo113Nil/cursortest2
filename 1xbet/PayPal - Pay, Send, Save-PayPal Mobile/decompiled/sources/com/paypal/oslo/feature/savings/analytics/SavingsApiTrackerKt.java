package com.paypal.oslo.feature.savings.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"T", "", "apiName", "apiType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "result", "", "trackApiResult", "(Ljava/lang/String;Ljava/lang/String;Larrow/core/Either;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "item", "trackLinkClick", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsApiTrackerKt {
    public static final void trackLinkClick(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.savings.LoggerKt.log.i("link_clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("item_name", item.getName())), kotlin.collections.MapsKt.emptyMap());
    }

    public static final <T> void trackApiResult(java.lang.String str, java.lang.String str2, arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends T> either) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        if (either instanceof arrow.core.Either.Right) {
            ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.savings.LoggerKt.log.i("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", "success")), kotlin.collections.MapsKt.emptyMap());
            return;
        }
        if (!(either instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
        if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
            pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_NETWORK, "network");
        } else if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
            java.lang.String errorCode = ((com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) savingsError).getErrorCode();
            if (errorCode == null) {
                errorCode = "graphql_error";
            }
            pair = kotlin.TuplesKt.to(errorCode, "server");
        } else {
            if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR, "unknown");
        }
        com.paypal.oslo.feature.savings.LoggerKt.log.w("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, (java.lang.String) pair.component1()), kotlin.TuplesKt.to("error_category", (java.lang.String) pair.component2())), kotlin.collections.MapsKt.emptyMap());
    }
}
