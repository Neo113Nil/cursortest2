package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/ValidatePhoneNumberUseCase;", "validatePhoneNumberUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/MaskPhoneNumberUseCase;", "maskPhoneNumberUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/ValidatePhoneNumberUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/MaskPhoneNumberUseCase;)V", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;", "config", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/ValidatePhoneNumberUseCase;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/MaskPhoneNumberUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatPhoneNumberUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FormatPhoneNumberUseCase(com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase validatePhoneNumberUseCase, com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase maskPhoneNumberUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validatePhoneNumberUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskPhoneNumberUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = validatePhoneNumberUseCase;
        this.getHighSpeedVideoFpsRanges = maskPhoneNumberUseCase;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> invoke(com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber, com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "FormatPhoneNumber UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, config.getStyle().name())), null, 4, null);
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError invoke = this.getHighSpeedVideoFpsRangesFor.invoke(phoneNumber);
        if (invoke != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "PhoneNumber Validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", invoke.name())), null, 4, null);
            return arrow.core.EitherKt.left(invoke);
        }
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber> phoneUtilNumber = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.toPhoneUtilNumber(phoneNumber);
        if (!(phoneUtilNumber instanceof arrow.core.Either.Right)) {
            if (phoneUtilNumber instanceof arrow.core.Either.Left) {
                return arrow.core.EitherKt.left((com.paypal.oslo.core.i18n.domain.model.PhoneNumberError) ((arrow.core.Either.Left) phoneUtilNumber).getValue());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = (com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) ((arrow.core.Either.Right) phoneUtilNumber).getValue();
        java.lang.String format = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance().format(phoneNumber2, com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.toPhoneUtilStyle(config.getStyle()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Formatting successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, config.getStyle().name())), null, 4, null);
        if (com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.needsMasking(config)) {
            return arrow.core.EitherKt.right(this.getHighSpeedVideoFpsRanges.invoke(phoneNumber2, format));
        }
        return arrow.core.EitherKt.right(format);
    }
}
