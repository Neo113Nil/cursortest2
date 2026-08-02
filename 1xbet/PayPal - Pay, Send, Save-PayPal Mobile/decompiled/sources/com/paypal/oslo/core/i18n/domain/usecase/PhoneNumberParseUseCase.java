package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/PhoneNumberParseUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/PhoneRepository;", "phoneRepository", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/PhoneRepository;)V", "", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "p2", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/repository/PhoneRepository;", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "Camera2StreamConfigurationMap", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PhoneNumberParseUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.google.i18n.phonenumbers.PhoneNumberUtil getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.PhoneRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PhoneNumberParseUseCase(com.paypal.oslo.core.i18n.domain.repository.PhoneRepository phoneRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneRepository, "");
        this.getHighSpeedVideoFpsRangesFor = phoneRepository;
        com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(phoneNumberUtil, "");
        this.getHighSpeedVideoSizes = phoneNumberUtil;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            phoneNumberRequest = null;
        }
        return phoneNumberParseUseCase.invoke(str, phoneNumberRequest, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(12:28|(1:55)|32|33|(1:54)(1:37)|38|(1:40)(1:53)|41|(1:43)(1:(1:(1:52)(2:49|(1:51)))(1:46))|13|14|(2:16|17)(2:19|(2:21|22)(2:23|24)))|12|13|14|(0)(0)))|58|6|7|(0)(0)|12|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0043, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
    
        r14 = kotlin.Result.INSTANCE;
        r13 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumber>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$invoke$1 phoneNumberParseUseCase$invoke$1;
        int i;
        java.lang.Throwable m23439exceptionOrNullimpl;
        java.lang.String str2;
        boolean isValidNumber;
        arrow.core.Either right;
        java.lang.String m11458getRegionCodeALGuh4w;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$invoke$1) {
            phoneNumberParseUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$invoke$1) continuation;
            if ((phoneNumberParseUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                phoneNumberParseUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = phoneNumberParseUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneNumberParseUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
                    if (phoneNumberRequest == null || (str2 = phoneNumberRequest.m11458getRegionCodeALGuh4w()) == null) {
                        str2 = "not_provided";
                    }
                    com.paypal.android.logger.Logger.i$default(logger, "PhoneNumberParse UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", str2)), null, 4, null);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase = this;
                    java.lang.String iSOCountryCode = (phoneNumberRequest == null || (m11458getRegionCodeALGuh4w = phoneNumberRequest.m11458getRegionCodeALGuh4w()) == null) ? null : com.paypal.oslo.core.i18n.domain.util.CountryUtilKt.toISOCountryCode(m11458getRegionCodeALGuh4w);
                    com.google.i18n.phonenumbers.Phonenumber.PhoneNumber parse = this.getHighSpeedVideoSizes.parse(str, iSOCountryCode);
                    if (iSOCountryCode != null) {
                        isValidNumber = this.getHighSpeedVideoSizes.isValidNumberForRegion(parse, iSOCountryCode);
                    } else {
                        isValidNumber = this.getHighSpeedVideoSizes.isValidNumber(parse);
                    }
                    if (com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.hasAlphaCharacters(str)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Parse - Phone number has alpha characters", null, null, 6, null);
                        right = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.ALPHA_CHARACTER_ERROR);
                    } else if (!isValidNumber && iSOCountryCode == null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
                        right = arrow.core.EitherKt.left(getHighSpeedVideoFpsRangesFor(parse));
                    } else if (!isValidNumber && iSOCountryCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
                        phoneNumberParseUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        phoneNumberParseUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneNumberRequest);
                        phoneNumberParseUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                        phoneNumberParseUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(parse);
                        phoneNumberParseUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iSOCountryCode);
                        phoneNumberParseUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        phoneNumberParseUseCase$invoke$1.getOutputFormats = isValidNumber;
                        phoneNumberParseUseCase$invoke$1.getInputFormats = 1;
                        obj = getHighSpeedVideoSizes(str, iSOCountryCode, parse, phoneNumberParseUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        right = arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.PhoneNumber(parse.getCountryCode(), java.lang.String.valueOf(parse.getNationalNumber()), parse.getExtension()));
                    }
                    java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl(right);
                    m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl == null) {
                        return (arrow.core.Either) m23436constructorimpl;
                    }
                    if (m23439exceptionOrNullimpl instanceof com.google.i18n.phonenumbers.NumberParseException) {
                        com.paypal.oslo.core.i18n.LoggerKt.log.e("Failed to parse phone number", m23439exceptionOrNullimpl);
                        com.google.i18n.phonenumbers.NumberParseException.ErrorType errorType = ((com.google.i18n.phonenumbers.NumberParseException) m23439exceptionOrNullimpl).getErrorType();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorType, "");
                        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.convertPhoneUtilErrorToI18nError(errorType));
                    }
                    com.paypal.oslo.core.i18n.LoggerKt.log.e("Unexpected error during phone number parsing", m23439exceptionOrNullimpl);
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.UNKNOWN_ERROR);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z = phoneNumberParseUseCase$invoke$1.getOutputFormats;
                int i2 = phoneNumberParseUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                right = (arrow.core.Either) obj;
                java.lang.Object m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(right);
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl2);
                if (m23439exceptionOrNullimpl == null) {
                }
            }
        }
        phoneNumberParseUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = phoneNumberParseUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneNumberParseUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        java.lang.Object m23436constructorimpl22 = kotlin.Result.m23436constructorimpl(right);
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl22);
        if (m23439exceptionOrNullimpl == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumber>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$validateWithAlternativeRegions$1 phoneNumberParseUseCase$validateWithAlternativeRegions$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$validateWithAlternativeRegions$1) {
            phoneNumberParseUseCase$validateWithAlternativeRegions$1 = (com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$validateWithAlternativeRegions$1) continuation;
            if ((phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    phoneNumberParseUseCase$validateWithAlternativeRegions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighResolutionOutputSizeshNQ4ISI = phoneNumber;
                    phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoSizes = 1;
                    obj = getHighSpeedVideoFpsRangesFor(str, str2, phoneNumberParseUseCase$validateWithAlternativeRegions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    phoneNumber = (com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return arrow.core.EitherKt.right((com.paypal.oslo.core.i18n.domain.model.PhoneNumber) ((arrow.core.Either.Right) either).getValue());
                }
                if (either instanceof arrow.core.Either.Left) {
                    return arrow.core.EitherKt.left(getHighSpeedVideoFpsRangesFor(phoneNumber));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        phoneNumberParseUseCase$validateWithAlternativeRegions$1 = new com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$validateWithAlternativeRegions$1(this, continuation);
        java.lang.Object obj2 = phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneNumberParseUseCase$validateWithAlternativeRegions$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    private final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError getHighSpeedVideoFpsRangesFor(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber p0) {
        if (!this.getHighSpeedVideoSizes.isPossibleNumber(p0)) {
            com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberWithReason = this.getHighSpeedVideoSizes.isPossibleNumberWithReason(p0);
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Parse - isPossibleNumber validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("validationError", isPossibleNumberWithReason)), null, null, 12, null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(isPossibleNumberWithReason);
            return com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.convertPhoneUtilErrorToI18nError(isPossibleNumberWithReason);
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Parse - isValidNumber validation failed", null, null, null, 14, null);
        return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_PHONE_NUMBER_FOR_REGION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumber>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$tryParseWithAlternativeRegions$1 phoneNumberParseUseCase$tryParseWithAlternativeRegions$1;
        int i;
        arrow.core.Either either;
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$tryParseWithAlternativeRegions$1) {
            phoneNumberParseUseCase$tryParseWithAlternativeRegions$1 = (com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$tryParseWithAlternativeRegions$1) continuation;
            if ((phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.repository.PhoneRepository phoneRepository = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String m11364constructorimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str2);
                    phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighSpeedVideoFpsRanges = str;
                    phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighSpeedVideoSizes = str2;
                    phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = phoneRepository.mo11235getPhoneMetadatan_l99Nk(m11364constructorimpl, phoneNumberParseUseCase$tryParseWithAlternativeRegions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighSpeedVideoSizes;
                    str = (java.lang.String) phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List<java.lang.String> list = ((com.paypal.oslo.core.i18n.domain.model.PhoneNumberMetaData) ((arrow.core.Either.Right) either).getValue()).getRegionGroup().get(str2);
                    if (list == null) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.METADATA_FETCH_FAILURE);
                    }
                    java.util.Iterator<T> it = list.iterator();
                    do {
                        phoneNumber = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String str3 = (java.lang.String) it.next();
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase = this;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(this.getHighSpeedVideoSizes.parse(str, str3));
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            m23436constructorimpl = null;
                        }
                        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber2 = (com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) m23436constructorimpl;
                        if (phoneNumber2 != null && this.getHighSpeedVideoSizes.isValidNumber(phoneNumber2)) {
                            phoneNumber = phoneNumber2;
                        }
                    } while (phoneNumber == null);
                    if (phoneNumber != null) {
                        arrow.core.Either right = arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.PhoneNumber(phoneNumber.getCountryCode(), java.lang.String.valueOf(phoneNumber.getNationalNumber()), phoneNumber.getExtension()));
                        if (right != null) {
                            return right;
                        }
                    }
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_PHONE_NUMBER_FOR_REGION);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to fetch phone metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", str2), kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError) ((arrow.core.Either.Left) either).getValue()).toString())), null, null, 12, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.METADATA_FETCH_FAILURE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        phoneNumberParseUseCase$tryParseWithAlternativeRegions$1 = new com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$tryParseWithAlternativeRegions$1(this, continuation);
        java.lang.Object obj2 = phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneNumberParseUseCase$tryParseWithAlternativeRegions$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
