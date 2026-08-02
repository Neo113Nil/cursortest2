package com.paypal.oslo.feature.businessinventory.domain.validator;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\r\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidatorImpl;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidator;", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetTaxesCacheUseCase;", "getTaxes", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetTaxesCacheUseCase;)V", "", "name", "id", "", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$NameError;", "validateName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxFieldValidationError$TaxError;", "validateValue", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetTaxesCacheUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TaxEntityValidatorImpl implements com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TaxEntityValidatorImpl(com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase getTaxesCacheUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxesCacheUseCase, "");
        this.getHighSpeedVideoSizes = getTaxesCacheUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object validateName(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError>> continuation) {
        com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl$validateName$1 taxEntityValidatorImpl$validateName$1;
        java.lang.Object obj;
        int i;
        java.util.Set set;
        java.util.Set set2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl$validateName$1) {
            taxEntityValidatorImpl$validateName$1 = (com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl$validateName$1) continuation;
            if ((taxEntityValidatorImpl$validateName$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                taxEntityValidatorImpl$validateName$1.getHighSpeedVideoSizesFor -= 2147483648;
                obj = taxEntityValidatorImpl$validateName$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxEntityValidatorImpl$validateName$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
                    createSetBuilder.addAll(com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorKt.access$commonNameValidation(str));
                    com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase getTaxesCacheUseCase = this.getHighSpeedVideoSizes;
                    taxEntityValidatorImpl$validateName$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    taxEntityValidatorImpl$validateName$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    taxEntityValidatorImpl$validateName$1.Camera2StreamConfigurationMap = createSetBuilder;
                    taxEntityValidatorImpl$validateName$1.getHighSpeedVideoFpsRangesFor = createSetBuilder;
                    taxEntityValidatorImpl$validateName$1.getHighSpeedVideoSizes = 0;
                    taxEntityValidatorImpl$validateName$1.getHighSpeedVideoSizesFor = 1;
                    java.lang.Object access$isUniqueTax = com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorKt.access$isUniqueTax(getTaxesCacheUseCase, str, str2, taxEntityValidatorImpl$validateName$1);
                    if (access$isUniqueTax == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    set = createSetBuilder;
                    obj = access$isUniqueTax;
                    set2 = set;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = taxEntityValidatorImpl$validateName$1.getHighSpeedVideoSizes;
                    set2 = (java.util.Set) taxEntityValidatorImpl$validateName$1.getHighSpeedVideoFpsRangesFor;
                    set = (java.util.Set) taxEntityValidatorImpl$validateName$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    set2.add(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.NotUnique);
                }
                return kotlin.collections.SetsKt.build(set);
            }
        }
        taxEntityValidatorImpl$validateName$1 = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl$validateName$1(this, continuation);
        obj = taxEntityValidatorImpl$validateName$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxEntityValidatorImpl$validateName$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        return kotlin.collections.SetsKt.build(set);
    }

    @Override // com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator
    public final java.lang.Object validateValue(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError>> continuation) {
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        if (kotlin.text.StringsKt.isBlank(str)) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError.Missing);
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }
}
