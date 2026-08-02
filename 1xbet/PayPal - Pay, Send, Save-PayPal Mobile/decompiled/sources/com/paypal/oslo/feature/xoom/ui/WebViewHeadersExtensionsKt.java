package com.paypal.oslo.feature.xoom.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ay\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "", "", "context", "Lcom/paypal/android/logger/Logger;", "logger", "Lkotlin/Function1;", "onSuccess", "onError", "handleWebViewHeaders", "(Larrow/core/Either;Ljava/lang/String;Lcom/paypal/android/logger/Logger;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "title", "transformXoomTitle", "(Ljava/lang/String;)Ljava/lang/String;", "WebViewHeadersErrorMessage", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WebViewHeadersExtensionsKt {
    public static final java.lang.String WebViewHeadersErrorMessage = "Failed to create webview headers";

    public static final java.lang.String transformXoomTitle(java.lang.String str) {
        java.lang.String substringBefore$default;
        if (str == null || (substringBefore$default = kotlin.text.StringsKt.substringBefore$default(str, com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER, (java.lang.String) null, 2, (java.lang.Object) null)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.trim(substringBefore$default).toString();
    }

    public static final <T> T handleWebViewHeaders(arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, ? extends java.util.Map<java.lang.String, java.lang.String>> either, java.lang.String str, com.paypal.android.logger.Logger logger, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, ? extends T> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, ? extends T> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        if (either instanceof arrow.core.Either.Right) {
            return function1.invoke(((arrow.core.Either.Right) either).getValue());
        }
        if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(webSessionTransferError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", str), kotlin.TuplesKt.to("errorType", simpleName));
            if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.UserCancelled) {
                com.paypal.android.logger.Logger.d$default(logger, WebViewHeadersErrorMessage, mapOf, null, 4, null);
            } else {
                if (!(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(logger, WebViewHeadersErrorMessage, mapOf, null, 4, null);
            }
            return function12.invoke(webSessionTransferError);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
