package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetCurrencyUseCase;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetCurrencyUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetCurrencyUseCase(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoSizes = userStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase$invoke$1 getCurrencyUseCase$invoke$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase$invoke$1) {
                getCurrencyUseCase$invoke$1 = (com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase$invoke$1) continuation;
                if ((getCurrencyUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    getCurrencyUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = getCurrencyUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = getCurrencyUseCase$invoke$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase$invoke$2 getCurrencyUseCase$invoke$2 = new com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase$invoke$2(this, null);
                        getCurrencyUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                        obj = kotlinx.coroutines.TimeoutKt.withTimeout(2000L, getCurrencyUseCase$invoke$2, getCurrencyUseCase$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (java.lang.String) obj;
                }
            }
            if (i != 0) {
            }
            return (java.lang.String) obj;
        } catch (java.lang.Exception unused) {
            return "USD";
        }
        getCurrencyUseCase$invoke$1 = new com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCurrencyUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCurrencyUseCase$invoke$1.Camera2StreamConfigurationMap;
    }
}
