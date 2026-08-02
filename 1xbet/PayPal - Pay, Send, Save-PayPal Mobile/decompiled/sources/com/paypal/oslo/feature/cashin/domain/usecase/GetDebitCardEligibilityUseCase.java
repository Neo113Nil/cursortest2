package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/usecase/GetDebitCardEligibilityUseCase;", "", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;", "eligibilityProvider", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;)V", "Lcom/paypal/oslo/feature/cashin/domain/usecase/DebitCardEligibility;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetDebitCardEligibilityUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetDebitCardEligibilityUseCase(com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleEligibilityProvider, "");
        this.Camera2StreamConfigurationMap = bankingBundleEligibilityProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility> continuation) {
        com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase$invoke$1 getDebitCardEligibilityUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase$invoke$1) {
            getDebitCardEligibilityUseCase$invoke$1 = (com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase$invoke$1) continuation;
            if ((getDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getDebitCardEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider = this.Camera2StreamConfigurationMap;
                    getDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = bankingBundleEligibilityProvider.getEligibility(getDebitCardEligibilityUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult = (com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult) ((arrow.core.Either.Right) either).getValue();
                    int i2 = com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase.WhenMappings.$EnumSwitchMapping$0[bankingBundleEligibilityResult.getStatus().ordinal()];
                    if (i2 == 1) {
                        return com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.BundleProvisioned.INSTANCE;
                    }
                    if (i2 == 2 || i2 == 3) {
                        if (bankingBundleEligibilityResult.getProducts().contains(com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.CONSUMER_DEBIT_CARD)) {
                            return com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.Eligible.INSTANCE;
                        }
                        return com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.Ineligible.INSTANCE;
                    }
                    if (i2 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.Ineligible.INSTANCE;
                }
                if (either instanceof arrow.core.Either.Left) {
                    return com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility.Ineligible.INSTANCE;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getDebitCardEligibilityUseCase$invoke$1 = new com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getDebitCardEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getDebitCardEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.BUNDLE_PROVISIONED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.INELIGIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
