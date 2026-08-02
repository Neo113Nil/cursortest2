package com.paypal.oslo.feature.businessinventory.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TaxEntityValidatorKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$isUniqueTax(com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase getTaxesCacheUseCase, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorKt$isUniqueTax$1 taxEntityValidatorKt$isUniqueTax$1;
        int i;
        arrow.core.Either either;
        java.lang.Object value;
        java.util.ArrayList arrayList;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorKt$isUniqueTax$1) {
            taxEntityValidatorKt$isUniqueTax$1 = (com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorKt$isUniqueTax$1) continuation;
            if ((taxEntityValidatorKt$isUniqueTax$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                taxEntityValidatorKt$isUniqueTax$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = taxEntityValidatorKt$isUniqueTax$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = taxEntityValidatorKt$isUniqueTax$1.getHighResolutionOutputSizeshNQ4ISI;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    taxEntityValidatorKt$isUniqueTax$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getTaxesCacheUseCase);
                    taxEntityValidatorKt$isUniqueTax$1.getHighSpeedVideoFpsRanges = str;
                    taxEntityValidatorKt$isUniqueTax$1.Camera2StreamConfigurationMap = str2;
                    taxEntityValidatorKt$isUniqueTax$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getTaxesCacheUseCase.invoke(taxEntityValidatorKt$isUniqueTax$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) taxEntityValidatorKt$isUniqueTax$1.Camera2StreamConfigurationMap;
                    str = (java.lang.String) taxEntityValidatorKt$isUniqueTax$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    value = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    value = ((arrow.core.Either.Right) either).getValue();
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : (java.lang.Iterable) value) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj2).getId(), str2)) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) it.next()).getLabel(), str)) {
                            z = false;
                            break;
                        }
                    }
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        taxEntityValidatorKt$isUniqueTax$1 = new com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorKt$isUniqueTax$1(continuation);
        java.lang.Object obj3 = taxEntityValidatorKt$isUniqueTax$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = taxEntityValidatorKt$isUniqueTax$1.getHighResolutionOutputSizeshNQ4ISI;
        boolean z2 = true;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        java.util.ArrayList arrayList22 = new java.util.ArrayList();
        while (r4.hasNext()) {
        }
        arrayList = arrayList22;
        if (!arrayList.isEmpty()) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    public static final /* synthetic */ java.util.Set access$commonNameValidation(java.lang.String str) {
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        java.lang.String str2 = str;
        if (kotlin.text.StringsKt.isBlank(str2)) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.Missing);
        } else if (str.length() > 40) {
            createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.TooLong);
        }
        java.util.List<java.lang.String> split = new kotlin.text.Regex("\\s+").split(str2, 0);
        if (!(split instanceof java.util.Collection) || !split.isEmpty()) {
            java.util.Iterator<T> it = split.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (androidx.core.util.PatternsCompat.WEB_URL.matcher((java.lang.String) it.next()).matches()) {
                    createSetBuilder.add(com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError.ContainsLink);
                    break;
                }
            }
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }
}
