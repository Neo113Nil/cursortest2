package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalCloseCardsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;", "deviceIdResolver", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "payPalCardRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalCloseCardsError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalCloseCardsResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/repository/device/DeviceIdResolver;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayPalCloseCardsUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PayPalCloseCardsUseCase(com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver deviceIdResolver, com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = deviceIdResolver;
        this.getHighSpeedVideoFpsRanges = payPalCardRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r12 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsResult>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase$invoke$1 payPalCloseCardsUseCase$invoke$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase$invoke$1) {
            payPalCloseCardsUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase$invoke$1) continuation;
            if ((payPalCloseCardsUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                payPalCloseCardsUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = payPalCloseCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalCloseCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Invoking PayPalCloseCardsUseCase", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdResolver deviceIdResolver = this.getHighResolutionOutputSizeshNQ4ISI;
                    payPalCloseCardsUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = deviceIdResolver.resolve(payPalCloseCardsUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String id = ((com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier) obj).getId();
                str = id;
                if (str != null || str.length() == 0) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Device ID is unavailable, cannot close cards", null, null, 6, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsError("Device ID is unavailable", null, 2, null));
                }
                com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository payPalCardRepository = this.getHighSpeedVideoFpsRanges;
                payPalCloseCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                payPalCloseCardsUseCase$invoke$1.Camera2StreamConfigurationMap = 2;
                java.lang.Object closeCards = payPalCardRepository.closeCards(id, payPalCloseCardsUseCase$invoke$1);
                return closeCards == coroutine_suspended ? coroutine_suspended : closeCards;
            }
        }
        payPalCloseCardsUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = payPalCloseCardsUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalCloseCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.String id2 = ((com.paypal.oslo.feature.taptopay.domain.repository.device.DeviceIdentifier) obj2).getId();
        str = id2;
        if (str != null) {
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Device ID is unavailable, cannot close cards", null, null, 6, null);
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCloseCardsError("Device ID is unavailable", null, 2, null));
    }
}
