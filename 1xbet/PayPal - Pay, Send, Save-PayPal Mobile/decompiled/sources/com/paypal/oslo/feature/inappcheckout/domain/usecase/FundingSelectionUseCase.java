package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FundingSelectionUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/FundingSelectionApiRepository;", "repository", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSmartAuthAmountUseCase;", "formatSmartAuthAmountUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/repository/FundingSelectionApiRepository;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSmartAuthAmountUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/FundingSelectionApiRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSmartAuthAmountUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FundingSelectionUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FundingSelectionUseCase(com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository fundingSelectionApiRepository, com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionApiRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatSmartAuthAmountUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fundingSelectionApiRepository;
        this.Camera2StreamConfigurationMap = formatSmartAuthAmountUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r6 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r6 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase$invoke$1 fundingSelectionUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase$invoke$1) {
            fundingSelectionUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase$invoke$1) continuation;
            if ((fundingSelectionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                fundingSelectionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = fundingSelectionUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingSelectionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository fundingSelectionApiRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    fundingSelectionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = fundingSelectionApiRepository.fetch(fundingSelectionUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return arrow.core.EitherKt.right(obj);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return either;
                }
                if (!(either instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity) ((arrow.core.Either.Right) either).getValue();
                fundingSelectionUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                fundingSelectionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                obj = formatSmartAuthAmountUseCase.invoke(fundingSelectionEntity, fundingSelectionUseCase$invoke$1);
            }
        }
        fundingSelectionUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = fundingSelectionUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingSelectionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }
}
