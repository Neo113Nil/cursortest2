package com.paypal.oslo.core.i18n.domain.interfaces;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the appropriate use case directly instead of AddressHandler", replaceWith = @kotlin.ReplaceWith(expression = "FormatAddressUseCase or GetAddressLayoutUseCase or ValidateAddressUseCase", imports = {"com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase", "com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase", "com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase"}))
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\f\u0010\nJ6\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u000f\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/interfaces/AddressHandler;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;", "addressConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "getLayout", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "format", "", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "validate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AddressHandler {
    java.lang.Object format(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, java.lang.String>> continuation);

    java.lang.Object getLayout(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, com.paypal.oslo.core.i18n.domain.model.AddressLayout>> continuation);

    java.lang.Object validate(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, ? extends java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError>>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getLayout$default(com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler addressHandler, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLayout");
        }
        if ((i & 1) != 0) {
            address = null;
        }
        if ((i & 2) != 0) {
            addressConfiguration = null;
        }
        return addressHandler.getLayout(address, addressConfiguration, continuation);
    }

    static /* synthetic */ java.lang.Object format$default(com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler addressHandler, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
        }
        if ((i & 2) != 0) {
            addressConfiguration = null;
        }
        return addressHandler.format(address, addressConfiguration, continuation);
    }

    static /* synthetic */ java.lang.Object validate$default(com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler addressHandler, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validate");
        }
        if ((i & 2) != 0) {
            addressConfiguration = null;
        }
        return addressHandler.validate(address, addressConfiguration, continuation);
    }
}
