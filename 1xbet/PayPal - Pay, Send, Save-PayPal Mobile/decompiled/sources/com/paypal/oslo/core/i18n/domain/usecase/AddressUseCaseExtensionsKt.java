package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Larrow/core/Either;", "", "", "useCaseName", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "mapAddressError", "(Larrow/core/Either;Ljava/lang/String;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddressUseCaseExtensionsKt {
    public static final <T> arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, T> mapAddressError(arrow.core.Either<? extends java.lang.Object, ? extends T> either, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (either instanceof arrow.core.Either.Left) {
            java.lang.Object value = ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Received error while executing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", value.toString()), kotlin.TuplesKt.to("useCaseName", str)), null, null, 12, null);
            return new arrow.core.Either.Left(value instanceof com.paypal.oslo.core.i18n.domain.model.AddressFormattingError ? (com.paypal.oslo.core.i18n.domain.model.AddressFormattingError) value : new com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError("Failed to fetch metadata: ".concat(java.lang.String.valueOf(value))));
        }
        if (either instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
