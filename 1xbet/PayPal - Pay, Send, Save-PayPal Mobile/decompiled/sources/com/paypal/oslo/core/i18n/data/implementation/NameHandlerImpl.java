package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/NameHandlerImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/NameHandler;", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "nameData", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "nameConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/NameError;", "", "formatName", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", "nameLayout", "", "Lcom/paypal/oslo/core/i18n/domain/model/NameValidationError;", "validateName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NameHandlerImpl implements com.paypal.oslo.core.i18n.domain.interfaces.NameHandler {
    @javax.inject.Inject
    public NameHandlerImpl() {
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.NameHandler
    public final java.lang.Object formatName(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, java.lang.String>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.NameError.ParseError("Name formatting not yet implemented"));
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.NameHandler
    public final java.lang.Object nameLayout(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, com.paypal.oslo.core.i18n.domain.model.NameLayout>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.NameError.ParseError("Name Layout not yet implemented"));
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.NameHandler
    public final java.lang.Object validateName(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, ? extends java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.NameValidationError>>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.NameError.ParseError("Name validation not yet implemented"));
    }
}
