package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatISODurationUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/util/ISODurationParser;", "parser", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatRelativeTimeUseCase;", "formatRelativeTimeUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/util/ISODurationParser;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatRelativeTimeUseCase;)V", "", "isoDuration", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/util/ISODurationParser;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatRelativeTimeUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatISODurationUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.i18n.domain.util.ISODurationParser getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FormatISODurationUseCase(com.paypal.oslo.core.i18n.domain.util.ISODurationParser iSODurationParser, com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase formatRelativeTimeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iSODurationParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatRelativeTimeUseCase, "");
        this.getHighSpeedVideoSizes = iSODurationParser;
        this.getHighSpeedVideoFpsRanges = formatRelativeTimeUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke(java.lang.String isoDuration, com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration configuration) {
        arrow.core.Either either;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoDuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "FormatISODuration UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isoDuration", isoDuration), kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, configuration.getStyle()), kotlin.TuplesKt.to("unit", configuration.getUnit())), null, 4, null);
        arrow.core.Either parse = this.getHighSpeedVideoSizes.parse(isoDuration);
        if (parse.isLeft()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Invalid ISO 8601 duration structure", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isoDuration", isoDuration)), null, 4, null);
        }
        if (parse instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.i18n.domain.model.DurationComponents durationComponents = (com.paypal.oslo.core.i18n.domain.model.DurationComponents) ((arrow.core.Either.Right) parse).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Successfully parsed ISO duration", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isoDuration", isoDuration)), null, 4, null);
            java.time.Instant now = java.time.Instant.now();
            kotlin.jvm.internal.Intrinsics.checkNotNull(now);
            arrow.core.Either addDurationToInstant = com.paypal.oslo.core.i18n.domain.util.ISODurationUtilKt.addDurationToInstant(now, durationComponents);
            if (addDurationToInstant.isLeft()) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to add duration to instant", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isoDuration", isoDuration)), null, null, 12, null);
            }
            if (addDurationToInstant instanceof arrow.core.Either.Right) {
                java.util.Date from = java.util.Date.from((java.time.Instant) ((arrow.core.Either.Right) addDurationToInstant).getValue());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
                either = new arrow.core.Either.Right(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
            } else {
                boolean z = addDurationToInstant instanceof arrow.core.Either.Left;
                either = addDurationToInstant;
                if (!z) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        } else {
            boolean z2 = parse instanceof arrow.core.Either.Left;
            either = parse;
            if (!z2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (either instanceof arrow.core.Either.Right) {
            return this.getHighSpeedVideoFpsRanges.invoke((com.paypal.oslo.core.i18n.domain.model.DateTime) ((arrow.core.Either.Right) either).getValue(), configuration);
        }
        if (either instanceof arrow.core.Either.Left) {
            return either;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
