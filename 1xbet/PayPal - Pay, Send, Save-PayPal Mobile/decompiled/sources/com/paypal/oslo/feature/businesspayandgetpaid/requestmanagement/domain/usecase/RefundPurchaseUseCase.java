package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/RefundPurchaseUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PurchaseRepository;", "purchaseRepository", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PurchaseRepository;)V", "", "purchaseId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/PurchaseError;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PurchaseRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RefundPurchaseUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RefundPurchaseUseCase(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository purchaseRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(purchaseRepository, "");
        this.getHighSpeedVideoSizes = purchaseRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase$invoke$1 refundPurchaseUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase$invoke$1) {
            refundPurchaseUseCase$invoke$1 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase$invoke$1) continuation;
            if ((refundPurchaseUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                refundPurchaseUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = refundPurchaseUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = refundPurchaseUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.text.StringsKt.isBlank(str)) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.ValidationError("Invoice ID must not be blank", "purchaseId"));
                    }
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository purchaseRepository = this.getHighSpeedVideoSizes;
                    refundPurchaseUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    refundPurchaseUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = purchaseRepository.refundPurchase(str, refundPurchaseUseCase$invoke$1);
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
                    return new arrow.core.Either.Right(kotlin.Unit.INSTANCE);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        refundPurchaseUseCase$invoke$1 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = refundPurchaseUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = refundPurchaseUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
