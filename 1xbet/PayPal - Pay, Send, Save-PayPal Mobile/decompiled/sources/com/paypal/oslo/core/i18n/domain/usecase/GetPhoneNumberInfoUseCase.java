package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/GetPhoneNumberInfoUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/ValidatePhoneNumberUseCase;", "validatePhoneNumberUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/ValidatePhoneNumberUseCase;)V", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "phoneNumber", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberInfo;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/usecase/ValidatePhoneNumberUseCase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetPhoneNumberInfoUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetPhoneNumberInfoUseCase(com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase validatePhoneNumberUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validatePhoneNumberUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = validatePhoneNumberUseCase;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo> invoke(com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError invoke = this.getHighSpeedVideoFpsRangesFor.invoke(phoneNumber);
        if (invoke != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "GetPhoneNumberInfo - Validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("validationError", invoke.name())), null, 4, null);
            return arrow.core.EitherKt.left(invoke);
        }
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber> phoneUtilNumber = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.toPhoneUtilNumber(phoneNumber);
        if (phoneUtilNumber instanceof arrow.core.Either.Right) {
            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = (com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) ((arrow.core.Either.Right) phoneUtilNumber).getValue();
            com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance();
            java.lang.String regionCodeForNumber = phoneNumberUtil.getRegionCodeForNumber(phoneNumber2);
            if (regionCodeForNumber != null) {
                com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType numberType = phoneNumberUtil.getNumberType(phoneNumber2);
                kotlin.jvm.internal.Intrinsics.checkNotNull(numberType);
                com.paypal.oslo.core.i18n.domain.model.Type convertPhoneUtilTypeToI18nType = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.convertPhoneUtilTypeToI18nType(numberType);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Phone number info retrieved successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", regionCodeForNumber), kotlin.TuplesKt.to("phoneType", convertPhoneUtilTypeToI18nType.name())), null, 4, null);
                arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo> right = arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(regionCodeForNumber), convertPhoneUtilTypeToI18nType, null));
                if (right != null) {
                    return right;
                }
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Invalid country code detected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", java.lang.Integer.valueOf(phoneNumber.getCountryCode()))), null, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_COUNTRY_CODE);
        }
        if (phoneUtilNumber instanceof arrow.core.Either.Left) {
            return arrow.core.EitherKt.left((com.paypal.oslo.core.i18n.domain.model.PhoneNumberError) ((arrow.core.Either.Left) phoneUtilNumber).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
