package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/DateMaskFormatToPartUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatToPartsUseCase;", "dateTimeFormatToPartsUseCase", "Lcom/paypal/oslo/core/i18n/domain/repository/DateTimeRepository;", "dateTimeRepository", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatToPartsUseCase;Lcom/paypal/oslo/core/i18n/domain/repository/DateTimeRepository;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimePart;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatToPartsUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/repository/DateTimeRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateMaskFormatToPartUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DateMaskFormatToPartUseCase(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase dateTimeFormatToPartsUseCase, com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository dateTimeRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatToPartsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRepository, "");
        this.Camera2StreamConfigurationMap = dateTimeFormatToPartsUseCase;
        this.getHighSpeedVideoFpsRangesFor = dateTimeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, ? extends java.util.List<com.paypal.oslo.core.i18n.domain.model.DateTimePart>>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase$invoke$1 dateMaskFormatToPartUseCase$invoke$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration2;
        java.util.List list;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase$invoke$1) {
            dateMaskFormatToPartUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase$invoke$1) continuation;
            if ((dateMaskFormatToPartUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                dateMaskFormatToPartUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = dateMaskFormatToPartUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dateMaskFormatToPartUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "DateMaskFormatToPart UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, dateTimeConfiguration.getDateFormat())), null, 4, null);
                    arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.util.List<com.paypal.oslo.core.i18n.domain.model.DateTimePart>> invoke = this.Camera2StreamConfigurationMap.invoke(com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.getDUMMY_DATE_FOR_MASKING(), dateTimeConfiguration);
                    if (invoke instanceof arrow.core.Either.Right) {
                        java.util.List list2 = (java.util.List) ((arrow.core.Either.Right) invoke).getValue();
                        com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository dateTimeRepository = this.getHighSpeedVideoFpsRangesFor;
                        java.util.Locale locale = dateTimeConfiguration.getLocale();
                        dateMaskFormatToPartUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = dateTimeConfiguration;
                        dateMaskFormatToPartUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
                        dateMaskFormatToPartUseCase$invoke$1.getHighSpeedVideoFpsRanges = list2;
                        dateMaskFormatToPartUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        dateMaskFormatToPartUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        dateMaskFormatToPartUseCase$invoke$1.getInputFormats = 1;
                        obj = dateTimeRepository.getDateMetadata(locale, dateMaskFormatToPartUseCase$invoke$1);
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
                    int i2 = dateMaskFormatToPartUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i3 = dateMaskFormatToPartUseCase$invoke$1.getHighSpeedVideoSizes;
                    list = (java.util.List) dateMaskFormatToPartUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    dateTimeConfiguration2 = (com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration) dateMaskFormatToPartUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return new arrow.core.Either.Right(com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.generateMaskArray((com.paypal.oslo.core.i18n.domain.model.DateMetaData) ((arrow.core.Either.Right) either).getValue(), list, dateTimeConfiguration2.getDateFormat()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        dateMaskFormatToPartUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = dateMaskFormatToPartUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dateMaskFormatToPartUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
