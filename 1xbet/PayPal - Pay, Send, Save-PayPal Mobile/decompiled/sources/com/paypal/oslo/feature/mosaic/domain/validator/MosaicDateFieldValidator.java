package com.paypal.oslo.feature.mosaic.domain.validator;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/MosaicDateFieldValidator;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "text", "dateFormat", "", "isRequired", "", "minAge", "maxAge", "Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult;", "validateDateOfBirth", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZII)Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldValidationResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicDateFieldValidator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.mosaic.domain.validator.MosaicDateFieldValidator INSTANCE = new com.paypal.oslo.feature.mosaic.domain.validator.MosaicDateFieldValidator();

    private MosaicDateFieldValidator() {
    }

    public final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult validateDateOfBirth(android.content.Context context, java.lang.String text, java.lang.String dateFormat, boolean isRequired, int minAge, int maxAge) {
        com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded maxAgeExceeded;
        com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Valid valid;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
        if (isRequired && text.length() == 0) {
            return new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.EmptyField.INSTANCE.message(context));
        }
        if (!isRequired && text.length() == 0) {
            return com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Valid.INSTANCE;
        }
        java.time.LocalDate parseDate = com.paypal.oslo.feature.mosaic.domain.util.DateUtil.INSTANCE.parseDate(text, dateFormat);
        if (parseDate == null) {
            return new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.InvalidFormat.INSTANCE.message(context));
        }
        if (parseDate.compareTo((java.time.chrono.ChronoLocalDate) java.time.LocalDate.now()) > 0) {
            return new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.FutureDate.INSTANCE.message(context));
        }
        java.lang.Integer calculateAge = com.paypal.oslo.feature.mosaic.domain.util.DateUtil.INSTANCE.calculateAge(parseDate);
        if (calculateAge != null) {
            int intValue = calculateAge.intValue();
            if (intValue < minAge) {
                maxAgeExceeded = new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MinAgeNotMet(minAge);
            } else {
                maxAgeExceeded = intValue > maxAge ? new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.MaxAgeExceeded(maxAge) : null;
            }
            if (maxAgeExceeded != null) {
                valid = new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid(maxAgeExceeded.message(context));
            } else {
                valid = com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Valid.INSTANCE;
            }
            if (valid != null) {
                return valid;
            }
        }
        return new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldValidationResult.Invalid(com.paypal.oslo.feature.mosaic.domain.validator.DateFieldError.InvalidFormat.INSTANCE.message(context));
    }
}
