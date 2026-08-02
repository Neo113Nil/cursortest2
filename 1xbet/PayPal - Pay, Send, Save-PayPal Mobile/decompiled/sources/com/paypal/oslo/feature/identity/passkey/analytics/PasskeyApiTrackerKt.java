package com.paypal.oslo.feature.identity.passkey.analytics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a7\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"T", "", "apiName", "apiType", "Larrow/core/Either;", "result", "", "logPasskeyCallResult", "(Ljava/lang/String;Ljava/lang/String;Larrow/core/Either;)V", "", "toTrackingCode", "(Ljava/lang/Object;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyApiTrackerKt {
    public static final java.lang.String toTrackingCode(java.lang.Object obj) {
        java.lang.String str;
        if (obj == null) {
            return com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR;
        }
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
        if (simpleName != null) {
            str = simpleName.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = null;
        }
        return str != null ? str : com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR;
    }

    public static final <T> void logPasskeyCallResult(java.lang.String str, java.lang.String str2, arrow.core.Either<?, ? extends T> either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        if (!(either instanceof arrow.core.Either.Right)) {
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.identity.LoggerKt.log.w("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE), kotlin.TuplesKt.to("error", toTrackingCode(((arrow.core.Either.Left) either).getValue()))), kotlin.collections.MapsKt.emptyMap());
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        ((arrow.core.Either.Right) either).getValue();
        com.paypal.oslo.feature.identity.LoggerKt.log.i("api_call_result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("api_name", str), kotlin.TuplesKt.to("api_type", str2), kotlin.TuplesKt.to("api_result", "success")), kotlin.collections.MapsKt.emptyMap());
    }
}
