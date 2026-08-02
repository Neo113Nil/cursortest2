package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsLandingPageDataUseCase;", "", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "savingsRepository", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;)V", "", "countryCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetSavingsLandingPageDataUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.repository.SavingsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetSavingsLandingPageDataUseCase(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsRepository, "");
        this.getHighSpeedVideoFpsRangesFor = savingsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult>> continuation) {
        com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase$invoke$1 getSavingsLandingPageDataUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase$invoke$1) {
            getSavingsLandingPageDataUseCase$invoke$1 = (com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase$invoke$1) continuation;
            if ((getSavingsLandingPageDataUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getSavingsLandingPageDataUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getSavingsLandingPageDataUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getSavingsLandingPageDataUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository = this.getHighSpeedVideoFpsRangesFor;
                    getSavingsLandingPageDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getSavingsLandingPageDataUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = savingsRepository.getSavingsLandingPageData(str, getSavingsLandingPageDataUseCase$invoke$1);
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
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        return either;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData savingsLandingPageData = (com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData) ((arrow.core.Either.Right) either).getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String annualPercentageYield = savingsLandingPageData.getAnnualPercentageYield();
                if (annualPercentageYield == null || annualPercentageYield.length() == 0) {
                    arrayList.add("annualPercentageYield");
                }
                java.lang.String countryCode = savingsLandingPageData.getCountryCode();
                if (countryCode == null || countryCode.length() == 0) {
                    arrayList.add("countryCode");
                }
                java.lang.String marketingNationalAverageRateMultiplierText = savingsLandingPageData.getMarketingNationalAverageRateMultiplierText();
                if (marketingNationalAverageRateMultiplierText == null || marketingNationalAverageRateMultiplierText.length() == 0) {
                    arrayList.add("marketingNationalAverageRateMultiplierText");
                }
                java.lang.String marketingNationalAverageReportDate = savingsLandingPageData.getMarketingNationalAverageReportDate();
                if (marketingNationalAverageReportDate == null || marketingNationalAverageReportDate.length() == 0) {
                    arrayList.add("marketingNationalAverageReportDate");
                }
                java.lang.String marketingRateEffectiveDate = savingsLandingPageData.getMarketingRateEffectiveDate();
                if (marketingRateEffectiveDate == null || marketingRateEffectiveDate.length() == 0) {
                    arrayList.add("marketingRateEffectiveDate");
                }
                if (arrayList.isEmpty()) {
                    java.lang.String annualPercentageYield2 = savingsLandingPageData.getAnnualPercentageYield();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(annualPercentageYield2);
                    java.lang.String countryCode2 = savingsLandingPageData.getCountryCode();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(countryCode2);
                    java.lang.String marketingNationalAverageRateMultiplierText2 = savingsLandingPageData.getMarketingNationalAverageRateMultiplierText();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(marketingNationalAverageRateMultiplierText2);
                    java.lang.String marketingNationalAverageReportDate2 = savingsLandingPageData.getMarketingNationalAverageReportDate();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(marketingNationalAverageReportDate2);
                    java.lang.String marketingRateEffectiveDate2 = savingsLandingPageData.getMarketingRateEffectiveDate();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(marketingRateEffectiveDate2);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult(annualPercentageYield2, countryCode2, marketingNationalAverageRateMultiplierText2, marketingNationalAverageReportDate2, marketingRateEffectiveDate2));
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError("Missing or empty required fields: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null))), "INVALID_LANDING_PAGE_DATA"));
            }
        }
        getSavingsLandingPageDataUseCase$invoke$1 = new com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getSavingsLandingPageDataUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getSavingsLandingPageDataUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase getSavingsLandingPageDataUseCase, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "US";
        }
        return getSavingsLandingPageDataUseCase.invoke(str, continuation);
    }
}
