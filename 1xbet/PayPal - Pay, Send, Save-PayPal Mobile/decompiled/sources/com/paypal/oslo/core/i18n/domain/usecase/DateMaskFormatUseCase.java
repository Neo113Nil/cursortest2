package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/DateMaskFormatUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatToPartsUseCase;", "dateTimeFormatToPartsUseCase", "Lcom/paypal/oslo/core/i18n/domain/repository/DateTimeRepository;", "dateTimeRepository", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatToPartsUseCase;Lcom/paypal/oslo/core/i18n/domain/repository/DateTimeRepository;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatToPartsUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/repository/DateTimeRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateMaskFormatUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DateMaskFormatUseCase(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase dateTimeFormatToPartsUseCase, com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository dateTimeRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatToPartsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRepository, "");
        this.getHighSpeedVideoFpsRanges = dateTimeFormatToPartsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = dateTimeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase$invoke$1 dateMaskFormatUseCase$invoke$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration2;
        java.util.List list;
        arrow.core.Either either;
        arrow.core.Either left;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase$invoke$1) {
            dateMaskFormatUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase$invoke$1) continuation;
            if ((dateMaskFormatUseCase$invoke$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dateMaskFormatUseCase$invoke$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dateMaskFormatUseCase$invoke$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dateMaskFormatUseCase$invoke$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "DateMaskFormat UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, dateTimeConfiguration.getDateFormat())), null, 4, null);
                    arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.util.List<com.paypal.oslo.core.i18n.domain.model.DateTimePart>> invoke = this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.getDUMMY_DATE_FOR_MASKING(), dateTimeConfiguration);
                    if (invoke instanceof arrow.core.Either.Right) {
                        java.util.List list2 = (java.util.List) ((arrow.core.Either.Right) invoke).getValue();
                        com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository dateTimeRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.Locale locale = dateTimeConfiguration.getLocale();
                        dateMaskFormatUseCase$invoke$1.getHighSpeedVideoSizes = dateTimeConfiguration;
                        dateMaskFormatUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
                        dateMaskFormatUseCase$invoke$1.Camera2StreamConfigurationMap = list2;
                        dateMaskFormatUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        dateMaskFormatUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        dateMaskFormatUseCase$invoke$1.getInputSizeshNQ4ISI = 1;
                        obj = dateTimeRepository.getDateMetadata(locale, dateMaskFormatUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dateTimeConfiguration2 = dateTimeConfiguration;
                        list = list2;
                    } else {
                        if (invoke instanceof arrow.core.Either.Left) {
                            return invoke;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = dateMaskFormatUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = dateMaskFormatUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    list = (java.util.List) dateMaskFormatUseCase$invoke$1.Camera2StreamConfigurationMap;
                    dateTimeConfiguration2 = (com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration) dateMaskFormatUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.i18n.domain.model.DateMetaData dateMetaData = (com.paypal.oslo.core.i18n.domain.model.DateMetaData) ((arrow.core.Either.Right) either).getValue();
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    try {
                        left = new arrow.core.Either.Right(kotlin.collections.CollectionsKt.joinToString$default(com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.generateMaskArray(dateMetaData, list, dateTimeConfiguration2.getDateFormat()), "", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase.m11563$r8$lambda$yvRXxLH8TvHupFhMVjPDzWFeQ((com.paypal.oslo.core.i18n.domain.model.DateTimePart) obj2);
                            }
                        }, 30, null));
                    } catch (java.lang.Throwable th) {
                        left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
                    }
                    arrow.core.Either either2 = left;
                    if (either2 instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.core.i18n.LoggerKt.log.e("Date masking failed", (java.lang.Throwable) ((arrow.core.Either.Left) either2).getValue());
                        return new arrow.core.Either.Left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
                    }
                    if (either2 instanceof arrow.core.Either.Right) {
                        return new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dateMaskFormatUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = dateMaskFormatUseCase$invoke$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dateMaskFormatUseCase$invoke$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* renamed from: $r8$lambda$yvRXxL-H8TvHupF-hMVjPDzWFeQ, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m11563$r8$lambda$yvRXxLH8TvHupFhMVjPDzWFeQ(com.paypal.oslo.core.i18n.domain.model.DateTimePart dateTimePart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimePart, "");
        return dateTimePart.getValue();
    }
}
