package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/GetRegionCodeForCallingCodeUseCase;", "", "<init>", "()V", "", "callingCode", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "invoke", "(I)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetRegionCodeForCallingCodeUseCase {
    @javax.inject.Inject
    public GetRegionCodeForCallingCodeUseCase() {
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.CountryCode> invoke(int callingCode) {
        java.lang.String regionCodeForCountryCode = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance().getRegionCodeForCountryCode(callingCode);
        if (kotlin.jvm.internal.Intrinsics.areEqual(regionCodeForCountryCode, "ZZ")) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Region Code Lookup Failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callingCode", java.lang.Integer.valueOf(callingCode))), null, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_COUNTRY_CODE);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(regionCodeForCountryCode);
        return arrow.core.EitherKt.right(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(regionCodeForCountryCode)));
    }
}
