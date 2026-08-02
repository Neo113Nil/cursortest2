package com.paypal.oslo.feature.businessinventory.domain.validator;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidator;", "", "", "name", "id", "", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$NameError;", "validateName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$TaxError;", "validateValue", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TaxEntityValidator {
    java.lang.Object validateName(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError>> continuation);

    java.lang.Object validateValue(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError>> continuation);
}
