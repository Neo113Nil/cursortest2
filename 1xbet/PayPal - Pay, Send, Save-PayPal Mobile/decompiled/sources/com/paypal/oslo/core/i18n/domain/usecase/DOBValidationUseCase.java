package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/DOBValidationUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "dateTime", "", "isTeenValidation", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/DOBError;", "", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Z)Larrow/core/Either;", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DOBValidationUseCase {
    private final int getHighSpeedVideoSizes = 18;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap = 129;

    @javax.inject.Inject
    public DOBValidationUseCase() {
    }

    public static /* synthetic */ arrow.core.Either invoke$default(com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase dOBValidationUseCase, com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dOBValidationUseCase.invoke(dateTime, z);
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.DOBError, kotlin.Unit> invoke(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, boolean isTeenValidation) {
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.DOBError, kotlin.Unit> left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Validating date of birth", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isTeenValidation", java.lang.Boolean.valueOf(isTeenValidation)), kotlin.TuplesKt.to("timezone", dateTime.getTimeZone())), null, 4, null);
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.DOBError, kotlin.Unit> either = null;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.DOBError, kotlin.Unit> left2 = isTeenValidation ? arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.DOBError.TeenAccountNotSupported("Teen account validation is not supported")) : null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.icu.util.TimeZone.getTimeZone(dateTime.getTimeZone()).getID(), "Etc/Unknown")) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Invalid timezone ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("timezone", dateTime.getTimeZone())), null, 4, null);
            either = arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.DOBError.InvalidTimeZone("Timezone passed is not valid ".concat(java.lang.String.valueOf(dateTime.getTimeZone()))));
        }
        if (left2 != null) {
            return left2;
        }
        if (either != null) {
            return either;
        }
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.DOBError, java.lang.Integer> calculateAge = com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.calculateAge(dateTime);
        if (!(calculateAge instanceof arrow.core.Either.Right)) {
            if (calculateAge instanceof arrow.core.Either.Left) {
                com.paypal.oslo.core.i18n.domain.error.DOBError dOBError = (com.paypal.oslo.core.i18n.domain.error.DOBError) ((arrow.core.Either.Left) calculateAge).getValue();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(dOBError.getClass()).getSimpleName();
                com.paypal.android.logger.Logger.w$default(logger, "Age is not valid", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", simpleName != null ? simpleName : "")), null, 4, null);
                return arrow.core.EitherKt.left(dOBError);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        int intValue = ((java.lang.Number) ((arrow.core.Either.Right) calculateAge).getValue()).intValue();
        if (intValue < this.getHighSpeedVideoSizes) {
            left = arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.DOBError.AdultUnderAge(java.lang.String.valueOf(intValue)));
        } else {
            left = intValue > this.Camera2StreamConfigurationMap ? arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.DOBError.AdultOverAge(java.lang.String.valueOf(intValue))) : arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        }
        if (left.isRight()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "DOB validation completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("age", java.lang.Integer.valueOf(intValue))), null, 4, null);
        }
        return left;
    }
}
