package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J4\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/AddressHandlerImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/AddressHandler;", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "getAddressLayoutUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddressUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/ValidateAddressUseCase;", "validateAddressUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/ValidateAddressUseCase;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;", "addressConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "getLayout", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "format", "", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "validate", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/ValidateAddressUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddressHandlerImpl implements com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AddressHandlerImpl(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase validateAddressUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddressLayoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAddressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateAddressUseCase, "");
        this.Camera2StreamConfigurationMap = getAddressLayoutUseCase;
        this.getHighSpeedVideoSizes = formatAddressUseCase;
        this.getHighSpeedVideoFpsRangesFor = validateAddressUseCase;
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler
    public final java.lang.Object getLayout(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, com.paypal.oslo.core.i18n.domain.model.AddressLayout>> continuation) {
        return this.Camera2StreamConfigurationMap.invoke(address, addressConfiguration, continuation);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler
    public final java.lang.Object format(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, java.lang.String>> continuation) {
        return this.getHighSpeedVideoSizes.invoke(address, addressConfiguration, continuation);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler
    public final java.lang.Object validate(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, ? extends java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError>>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(address, addressConfiguration, continuation);
    }
}
