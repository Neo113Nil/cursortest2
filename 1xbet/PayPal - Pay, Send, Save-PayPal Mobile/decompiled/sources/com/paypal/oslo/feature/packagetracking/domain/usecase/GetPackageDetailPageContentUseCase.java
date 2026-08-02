package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetPackageDetailPageContentUseCase;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "packageRepository", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetMerchantHeaderTitleUseCase;", "getMerchantHeaderTitle", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetMerchantHeaderTitleUseCase;)V", "", "carrierId", "trackingNumber", "transactionNumber", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetMerchantHeaderTitleUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPackageDetailPageContentUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.packagetracking.domain.usecase.GetMerchantHeaderTitleUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetPackageDetailPageContentUseCase(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository, com.paypal.oslo.feature.packagetracking.domain.usecase.GetMerchantHeaderTitleUseCase getMerchantHeaderTitleUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMerchantHeaderTitleUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = packageRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = getMerchantHeaderTitleUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.PackageData>> continuation) {
        com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase$invoke$1 getPackageDetailPageContentUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase$invoke$1) {
            getPackageDetailPageContentUseCase$invoke$1 = (com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase$invoke$1) continuation;
            if ((getPackageDetailPageContentUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getPackageDetailPageContentUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getPackageDetailPageContentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPackageDetailPageContentUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository = this.getHighSpeedVideoFpsRangesFor;
                    getPackageDetailPageContentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getPackageDetailPageContentUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    getPackageDetailPageContentUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    getPackageDetailPageContentUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = packageRepository.getPackageDetail(str, str2, str3, getPackageDetailPageContentUseCase$invoke$1);
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
                    return new arrow.core.Either.Right(this.getHighResolutionOutputSizeshNQ4ISI.invoke((com.paypal.oslo.feature.packagetracking.domain.model.PackageData) ((arrow.core.Either.Right) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getPackageDetailPageContentUseCase$invoke$1 = new com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getPackageDetailPageContentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPackageDetailPageContentUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
