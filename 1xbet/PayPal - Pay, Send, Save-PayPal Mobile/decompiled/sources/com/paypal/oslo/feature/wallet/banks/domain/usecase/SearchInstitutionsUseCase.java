package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/SearchInstitutionsUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingInstitutionsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingInstitutionsRepository;)V", "", "aggregatorName", "searchQuery", "", "maxResults", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsError;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FinancialInstitution;", "invoke", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingInstitutionsRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchInstitutionsUseCase {
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public SearchInstitutionsUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository openBankingInstitutionsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingInstitutionsRepository, "");
        this.Camera2StreamConfigurationMap = openBankingInstitutionsRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase searchInstitutionsUseCase, java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 25;
        }
        return searchInstitutionsUseCase.invoke(str, str2, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError, ? extends java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution>>> continuation) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase$invoke$1 searchInstitutionsUseCase$invoke$1;
        int i2;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase$invoke$1) {
            searchInstitutionsUseCase$invoke$1 = (com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase$invoke$1) continuation;
            if ((searchInstitutionsUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                searchInstitutionsUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = searchInstitutionsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = searchInstitutionsUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.text.StringsKt.isBlank(str)) {
                        throw new java.lang.IllegalArgumentException("aggregatorName cannot be blank".toString());
                    }
                    if (i <= 0) {
                        throw new java.lang.IllegalArgumentException("maxResults must be positive".toString());
                    }
                    java.lang.String str3 = null;
                    if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                        str3 = str2;
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams openBankingInstitutionsParams = new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams(str, str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
                    com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository openBankingInstitutionsRepository = this.Camera2StreamConfigurationMap;
                    searchInstitutionsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    searchInstitutionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    searchInstitutionsUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(openBankingInstitutionsParams);
                    searchInstitutionsUseCase$invoke$1.getHighSpeedVideoFpsRanges = i;
                    searchInstitutionsUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = openBankingInstitutionsRepository.searchInstitutions(openBankingInstitutionsParams, searchInstitutionsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = searchInstitutionsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(((com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsResult) ((arrow.core.Ior.Right) ior).getValue()).getInstitutions());
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                return new arrow.core.Ior.Both(both.getLeftValue(), ((com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsResult) both.getRightValue()).getInstitutions());
            }
        }
        searchInstitutionsUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = searchInstitutionsUseCase$invoke$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = searchInstitutionsUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
