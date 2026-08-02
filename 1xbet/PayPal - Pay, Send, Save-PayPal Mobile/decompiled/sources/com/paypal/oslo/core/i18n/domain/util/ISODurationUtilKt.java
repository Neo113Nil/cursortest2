package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "remaining", "delimiter", "Lkotlin/Pair;", "", "parseISOComponent", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "Ljava/time/Instant;", "instant", "Lcom/paypal/oslo/core/i18n/domain/model/DurationComponents;", "components", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "addDurationToInstant", "(Ljava/time/Instant;Lcom/paypal/oslo/core/i18n/domain/model/DurationComponents;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ISODurationUtilKt {
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> parseISOComponent(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
            return kotlin.TuplesKt.to(0, str);
        }
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.substringBefore$default(str, str2, (java.lang.String) null, 2, (java.lang.Object) null));
        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0), kotlin.text.StringsKt.substringAfter$default(str, str2, (java.lang.String) null, 2, (java.lang.Object) null));
    }

    public static final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.time.Instant> addDurationToInstant(java.time.Instant instant, com.paypal.oslo.core.i18n.domain.model.DurationComponents durationComponents) {
        arrow.core.Either left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationComponents, "");
        arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
        try {
            left = new arrow.core.Either.Right(java.time.ZonedDateTime.ofInstant(instant, java.time.ZoneId.of(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC)).plusYears(durationComponents.getYears()).plusMonths(durationComponents.getMonths()).plusDays(durationComponents.getDays() + (durationComponents.getWeeks() * 7)).plusHours(durationComponents.getHours()).plusMinutes(durationComponents.getMinutes()).plusSeconds(durationComponents.getSeconds()).toInstant());
        } catch (java.lang.Throwable th) {
            left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
        }
        arrow.core.Either either = left;
        if (either instanceof arrow.core.Either.Left) {
            return new arrow.core.Either.Left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
        }
        if (either instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
