package com.paypal.oslo.core.i18n.domain.interfaces;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the appropriate use case directly instead of NameHandler", replaceWith = @kotlin.ReplaceWith(expression = "NameFormatUseCase", imports = {"com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase"}))
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\f\u0010\nJ6\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u000f\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/interfaces/NameHandler;", "", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "nameData", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "nameConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/NameError;", "", "formatName", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", "nameLayout", "", "Lcom/paypal/oslo/core/i18n/domain/model/NameValidationError;", "validateName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NameHandler {
    java.lang.Object formatName(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, java.lang.String>> continuation);

    java.lang.Object nameLayout(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, com.paypal.oslo.core.i18n.domain.model.NameLayout>> continuation);

    java.lang.Object validateName(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, ? extends java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.NameValidationError>>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object formatName$default(com.paypal.oslo.core.i18n.domain.interfaces.NameHandler nameHandler, com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatName");
        }
        if ((i & 2) != 0) {
            nameConfiguration = null;
        }
        return nameHandler.formatName(nameInput, nameConfiguration, continuation);
    }

    static /* synthetic */ java.lang.Object nameLayout$default(com.paypal.oslo.core.i18n.domain.interfaces.NameHandler nameHandler, com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nameLayout");
        }
        if ((i & 1) != 0) {
            nameInput = null;
        }
        if ((i & 2) != 0) {
            nameConfiguration = null;
        }
        return nameHandler.nameLayout(nameInput, nameConfiguration, continuation);
    }

    static /* synthetic */ java.lang.Object validateName$default(com.paypal.oslo.core.i18n.domain.interfaces.NameHandler nameHandler, com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateName");
        }
        if ((i & 2) != 0) {
            nameConfiguration = null;
        }
        return nameHandler.validateName(nameInput, nameConfiguration, continuation);
    }
}
