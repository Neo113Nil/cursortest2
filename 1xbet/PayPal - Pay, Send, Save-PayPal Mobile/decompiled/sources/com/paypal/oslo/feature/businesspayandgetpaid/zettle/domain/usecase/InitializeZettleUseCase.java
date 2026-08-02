package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/InitializeZettleUseCase;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "sdkManager", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/auth/ZettleTokenExchange;", "zettleTokenExchange", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/auth/ZettleTokenExchange;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/auth/ZettleTokenExchange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitializeZettleUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public InitializeZettleUseCase(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager tapToPaySDKManager, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange zettleTokenExchange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPaySDKManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleTokenExchange, "");
        this.getHighSpeedVideoFpsRanges = tapToPaySDKManager;
        this.getHighSpeedVideoFpsRangesFor = zettleTokenExchange;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase$invoke$1 initializeZettleUseCase$invoke$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase$invoke$1) {
            initializeZettleUseCase$invoke$1 = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase$invoke$1) continuation;
            if ((initializeZettleUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                initializeZettleUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = initializeZettleUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeZettleUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoFpsRanges.isInitialized()) {
                        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange zettleTokenExchange = this.getHighSpeedVideoFpsRangesFor;
                        initializeZettleUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                        obj = zettleTokenExchange.exchangeTokenForAuthCode(initializeZettleUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                str = (java.lang.String) obj;
                if (str != null) {
                    return kotlin.Unit.INSTANCE;
                }
                this.getHighSpeedVideoFpsRanges.initialize(str);
                return kotlin.Unit.INSTANCE;
            }
        }
        initializeZettleUseCase$invoke$1 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = initializeZettleUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeZettleUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
    }
}
