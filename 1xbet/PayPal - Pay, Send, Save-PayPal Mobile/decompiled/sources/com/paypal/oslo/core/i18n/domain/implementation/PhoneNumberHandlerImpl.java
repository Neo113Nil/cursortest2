package com.paypal.oslo.core.i18n.domain.implementation;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J<\u0010\u001e\u001a \u0012\u0004\u0012\u00020\r\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u001d0\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/implementation/PhoneNumberHandlerImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/PhoneNumberHandler;", "Lcom/paypal/oslo/core/i18n/domain/usecase/PhoneNumberParseUseCase;", "phoneNumberParseUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCallingCodeUseCase;", "getCallingCodeUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/PhoneNumberParseUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/GetCallingCodeUseCase;)V", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;", "config", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "", "format", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;)Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;", "request", "parse", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatAsTyped", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;)Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberInfo;", "getPhoneNumberInfo", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;)Larrow/core/Either;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "regionCodes", "", "getCallingCodeForRegions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/PhoneNumberParseUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetCallingCodeUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PhoneNumberHandlerImpl implements com.paypal.oslo.core.i18n.domain.interfaces.PhoneNumberHandler {
    private final com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PhoneNumberHandlerImpl(com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase getCallingCodeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberParseUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCallingCodeUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = phoneNumberParseUseCase;
        this.Camera2StreamConfigurationMap = getCallingCodeUseCase;
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.PhoneNumberHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> format(com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber, com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.NOT_IMPLEMENTED);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.PhoneNumberHandler
    public final java.lang.Object parse(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumber>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(str, phoneNumberRequest, continuation);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.PhoneNumberHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> formatAsTyped(java.lang.String phoneNumber, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.NOT_IMPLEMENTED);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.PhoneNumberHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo> getPhoneNumberInfo(com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.NOT_IMPLEMENTED);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.PhoneNumberHandler
    public final java.lang.Object getCallingCodeForRegions(java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryCode> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, ? extends java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>>> continuation) {
        return this.Camera2StreamConfigurationMap.invoke(list, continuation);
    }
}
