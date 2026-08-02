package com.paypal.oslo.feature.taptopay.domain.usecase.device;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/HandleDeviceCompromisedUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalWipeAllTokensUseCase;", "wipeAllTokensUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/worker/BackgroundSyncCanceller;", "backgroundSyncCanceller", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalWipeAllTokensUseCase;Lcom/paypal/oslo/feature/taptopay/domain/worker/BackgroundSyncCanceller;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalWipeAllTokensUseCase;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/worker/BackgroundSyncCanceller;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HandleDeviceCompromisedUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public HandleDeviceCompromisedUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase payPalWipeAllTokensUseCase, com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller backgroundSyncCanceller) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalWipeAllTokensUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundSyncCanceller, "");
        this.getHighSpeedVideoFpsRanges = payPalWipeAllTokensUseCase;
        this.getHighSpeedVideoSizes = backgroundSyncCanceller;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|13|14))|27|6|7|(0)(0)|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to cancel background sync on compromised device", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to wipe tokens on compromised device", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x004c -> B:11:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase$invoke$1 handleDeviceCompromisedUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase$invoke$1) {
            handleDeviceCompromisedUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase$invoke$1) continuation;
            if ((handleDeviceCompromisedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                handleDeviceCompromisedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = handleDeviceCompromisedUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = handleDeviceCompromisedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Handling device compromised, purging device data", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase payPalWipeAllTokensUseCase = this.getHighSpeedVideoFpsRanges;
                    handleDeviceCompromisedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (payPalWipeAllTokensUseCase.invoke(handleDeviceCompromisedUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoSizes.invoke();
                return kotlin.Unit.INSTANCE;
            }
        }
        handleDeviceCompromisedUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = handleDeviceCompromisedUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = handleDeviceCompromisedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        this.getHighSpeedVideoSizes.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
