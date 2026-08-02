package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\fJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/DateTimeHandlerImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/DateTimeHandler;", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "dateTime", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "format", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimePart;", "formatToParts", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;", "formatRelative", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;)Larrow/core/Either;", "isoDuration", "formatISODuration", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;)Larrow/core/Either;", "", "isTeenValidation", "isValidAge", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Z)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeHandlerImpl implements com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler {
    @javax.inject.Inject
    public DateTimeHandlerImpl() {
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final java.lang.Object format(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String>> continuation) {
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final java.lang.Object formatToParts(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, ? extends java.util.List<com.paypal.oslo.core.i18n.domain.model.DateTimePart>>> continuation) {
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.METADATA_FETCH_FAILED);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> formatRelative(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.MISSING_TIMEZONE);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> formatISODuration(java.lang.String isoDuration, com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoDuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.Boolean> isValidAge(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, boolean isTeenValidation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.UNKNOWN_ERROR);
    }
}
